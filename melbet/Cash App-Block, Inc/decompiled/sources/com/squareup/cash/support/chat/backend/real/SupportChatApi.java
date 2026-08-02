package com.squareup.cash.support.chat.backend.real;

import androidx.glance.layout.SpacerKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.squareup.cash.cdf.customersupport.CustomerSupportChatReceiveUnknownMessage;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.support.chat.backend.api.Action$OpenLink;
import com.squareup.cash.support.chat.backend.api.Action$PickTransaction;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.PagingStatus;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.support.chat.backend.api.SuggestedReply;
import com.squareup.cash.support.chat.backend.real.LoadTransactionError;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.supportal.app.ChatMessage$ActionBody$Action$OpenLink;
import com.squareup.protos.cash.supportal.app.ChatMessage$ActionBody$Action$SelectTransaction;
import com.squareup.protos.cash.supportal.app.ChatMessage$Sender$Advocate;
import com.squareup.protos.cash.supportal.app.ChatMessage$Sender$Bot;
import com.squareup.protos.cash.supportal.app.ChatMessage$Sender$Customer;
import com.squareup.protos.cash.supportal.app.ChatMessage$Sender$System;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest$Criteria$After;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest$Criteria$Recent;
import com.squareup.protos.cash.supportal.app.GetChatMessagesResponse;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.protos.cash.supportal.app.OutgoingMessage$Body$File;
import com.squareup.protos.cash.supportal.app.OutgoingMessage$Body$SelectedReply;
import com.squareup.protos.cash.supportal.app.OutgoingMessage$Body$SelectedTransaction;
import com.squareup.protos.cash.supportal.app.OutgoingMessage$Body$Text;
import com.squareup.protos.cash.supportal.app.SendChatMessagesRequest;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SupportChatApi {
    public final Analytics analytics;
    public final RealClientRouteParser clientRouteParser;
    public final SupportConversationPersistence conversationPersistence;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final RealFileUploadService fileUploadService;
    public final SupportalAppService service;
    public final TransactionBodyResolver transactionBodyResolver;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetChatMessagesResponse.Conversation.BotStatus.values().length];
            try {
                PoolVisibility.Companion companion = GetChatMessagesResponse.Conversation.BotStatus.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PoolVisibility.Companion companion2 = GetChatMessagesResponse.Conversation.BotStatus.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PoolVisibility.Companion companion3 = GetChatMessagesResponse.Conversation.BotStatus.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SupportChatApi(SupportalAppService supportalAppService, Analytics analytics, RealFileUploadService realFileUploadService, RealClientRouteParser realClientRouteParser, TransactionBodyResolver transactionBodyResolver, SupportConversationPersistence supportConversationPersistence, ErrorReporter errorReporter, FeatureFlagManager featureFlagManager) {
        this.service = supportalAppService;
        this.analytics = analytics;
        this.fileUploadService = realFileUploadService;
        this.clientRouteParser = realClientRouteParser;
        this.transactionBodyResolver = transactionBodyResolver;
        this.conversationPersistence = supportConversationPersistence;
        this.errorReporter = errorReporter;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0040, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatMessages(GetChatMessagesRequest getChatMessagesRequest, ContinuationImpl continuationImpl) {
        SupportChatApi$getChatMessages$1 supportChatApi$getChatMessages$1;
        int i;
        ApiResult apiResult;
        int i2;
        if (continuationImpl instanceof SupportChatApi$getChatMessages$1) {
            supportChatApi$getChatMessages$1 = (SupportChatApi$getChatMessages$1) continuationImpl;
            int i3 = supportChatApi$getChatMessages$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                supportChatApi$getChatMessages$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = supportChatApi$getChatMessages$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportChatApi$getChatMessages$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    supportChatApi$getChatMessages$1.label = 1;
                    obj = this.service.getChatMessages(getChatMessagesRequest, supportChatApi$getChatMessages$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        apiResult = new ApiResult.Success((RecordedTranscript) obj);
                        if (apiResult instanceof ApiResult.Success) {
                            Map messages = ((RecordedTranscript) ((ApiResult.Success) apiResult).response).getMessages();
                            if (messages.isEmpty()) {
                                i2 = 0;
                            } else {
                                Iterator it = messages.entrySet().iterator();
                                i2 = 0;
                                while (it.hasNext()) {
                                    if (((RecordedMessage) ((Map.Entry) it.next()).getValue()).getBody() instanceof MessageBody.UnknownBody) {
                                        i2++;
                                    }
                                }
                            }
                            for (int i4 = 0; i4 < i2; i4++) {
                                this.analytics.track(new CustomerSupportChatReceiveUnknownMessage(), null);
                            }
                        }
                        return apiResult;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (apiResult instanceof ApiResult.Success) {
                    }
                    return apiResult;
                }
                GetChatMessagesResponse getChatMessagesResponse = (GetChatMessagesResponse) ((ApiResult.Success) apiResult).response;
                supportChatApi$getChatMessages$1.label = 2;
                obj = toTranscript(getChatMessagesResponse, supportChatApi$getChatMessages$1);
            }
        }
        supportChatApi$getChatMessages$1 = new SupportChatApi$getChatMessages$1(this, continuationImpl);
        Object obj3 = supportChatApi$getChatMessages$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportChatApi$getChatMessages$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMessageBody(ChatMessage chatMessage, RealFileUploadService realFileUploadService, ContinuationImpl continuationImpl) {
        SupportChatApi$getMessageBody$1 supportChatApi$getMessageBody$1;
        Object obj;
        int i;
        ChatMessage.TextBody textBody;
        ChatMessage.FileBody fileBody;
        ChatMessage.SunshineFileBody sunshineFileBody;
        ChatMessage.ActionBody actionBody;
        ChatMessage.TransactionBody transactionBody;
        ChatMessage.SystemMessageBody systemMessageBody;
        String str;
        ChatMessage.OpenLink openLink;
        ChatMessage.SelectTransaction selectTransaction;
        SpacerKt spacerKt;
        if (continuationImpl instanceof SupportChatApi$getMessageBody$1) {
            supportChatApi$getMessageBody$1 = (SupportChatApi$getMessageBody$1) continuationImpl;
            int i2 = supportChatApi$getMessageBody$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportChatApi$getMessageBody$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = supportChatApi$getMessageBody$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportChatApi$getMessageBody$1.label;
                MessageBody.ActionBody actionBody2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatMessage.Body body = chatMessage.body;
                    if (body != null) {
                        ChatMessage.Body.Text text = body instanceof ChatMessage.Body.Text ? (ChatMessage.Body.Text) body : null;
                        if (text != null) {
                            textBody = text.getValue();
                            if (body != null) {
                                ChatMessage.Body.File file = body instanceof ChatMessage.Body.File ? (ChatMessage.Body.File) body : null;
                                if (file != null) {
                                    fileBody = file.getValue();
                                    if (body != null) {
                                        ChatMessage.Body.SunshineFile sunshineFile = body instanceof ChatMessage.Body.SunshineFile ? (ChatMessage.Body.SunshineFile) body : null;
                                        if (sunshineFile != null) {
                                            sunshineFileBody = sunshineFile.getValue();
                                            if (body != null) {
                                                ChatMessage.Body.Action action = body instanceof ChatMessage.Body.Action ? (ChatMessage.Body.Action) body : null;
                                                if (action != null) {
                                                    actionBody = action.getValue();
                                                    if (body != null) {
                                                        ChatMessage.Body.Transaction transaction = body instanceof ChatMessage.Body.Transaction ? (ChatMessage.Body.Transaction) body : null;
                                                        if (transaction != null) {
                                                            transactionBody = transaction.getValue();
                                                            if (body != null) {
                                                                ChatMessage.Body.SystemMessage systemMessage = body instanceof ChatMessage.Body.SystemMessage ? (ChatMessage.Body.SystemMessage) body : null;
                                                                if (systemMessage != null) {
                                                                    systemMessageBody = systemMessage.getValue();
                                                                    if (textBody != null) {
                                                                        String str2 = textBody.text;
                                                                        str2.getClass();
                                                                        return new MessageBody.TextBody(str2);
                                                                    }
                                                                    if (fileBody != null) {
                                                                        String str3 = fileBody.file_token;
                                                                        str3.getClass();
                                                                        String m3557getUriLgIXbgg = realFileUploadService.m3557getUriLgIXbgg(str3);
                                                                        String str4 = fileBody.mime_type;
                                                                        str4.getClass();
                                                                        String str5 = fileBody.file_name;
                                                                        str5.getClass();
                                                                        return new MessageBody.FileBody(new FileMetadata(str4, str5, 12), m3557getUriLgIXbgg, str3);
                                                                    }
                                                                    if (sunshineFileBody != null) {
                                                                        String str6 = sunshineFileBody.media_type;
                                                                        if (str6 == null || !StringsKt__StringsJVMKt.startsWith(str6, "image/", true)) {
                                                                            return null;
                                                                        }
                                                                        String str7 = sunshineFileBody.media_url;
                                                                        str7.getClass();
                                                                        String str8 = sunshineFileBody.file_name;
                                                                        str8.getClass();
                                                                        return new MessageBody.FileBody(str7, new FileMetadata(str6, str8, 12));
                                                                    }
                                                                    if (actionBody != null) {
                                                                        zzli zzliVar = actionBody.action;
                                                                        if (zzliVar != null) {
                                                                            ChatMessage$ActionBody$Action$OpenLink chatMessage$ActionBody$Action$OpenLink = zzliVar instanceof ChatMessage$ActionBody$Action$OpenLink ? (ChatMessage$ActionBody$Action$OpenLink) zzliVar : null;
                                                                            if (chatMessage$ActionBody$Action$OpenLink != null) {
                                                                                openLink = chatMessage$ActionBody$Action$OpenLink.getValue();
                                                                                if (zzliVar != null) {
                                                                                    ChatMessage$ActionBody$Action$SelectTransaction chatMessage$ActionBody$Action$SelectTransaction = zzliVar instanceof ChatMessage$ActionBody$Action$SelectTransaction ? (ChatMessage$ActionBody$Action$SelectTransaction) zzliVar : null;
                                                                                    if (chatMessage$ActionBody$Action$SelectTransaction != null) {
                                                                                        selectTransaction = chatMessage$ActionBody$Action$SelectTransaction.getValue();
                                                                                        if (openLink != null) {
                                                                                            String str9 = openLink.url;
                                                                                            str9.getClass();
                                                                                            RealClientRouteParser realClientRouteParser = this.clientRouteParser;
                                                                                            if (ClientRouteParserKt.tryIsClientRouteCandidate(realClientRouteParser, str9)) {
                                                                                                if (ClientRouteParserKt.tryParse(realClientRouteParser, str9) != null) {
                                                                                                    spacerKt = new Action$OpenLink(str9);
                                                                                                }
                                                                                                spacerKt = null;
                                                                                            } else {
                                                                                                spacerKt = new Action$OpenLink(str9);
                                                                                            }
                                                                                            if (spacerKt != null) {
                                                                                                String str10 = actionBody.title;
                                                                                                str10.getClass();
                                                                                                String str11 = actionBody.subtitle;
                                                                                                str11.getClass();
                                                                                                actionBody2 = new MessageBody.ActionBody(str10, str11, spacerKt);
                                                                                            }
                                                                                            if (actionBody2 != null) {
                                                                                                return actionBody2;
                                                                                            }
                                                                                        } else {
                                                                                            if (selectTransaction != null) {
                                                                                                spacerKt = Action$PickTransaction.INSTANCE;
                                                                                                if (spacerKt != null) {
                                                                                                }
                                                                                                if (actionBody2 != null) {
                                                                                                }
                                                                                            }
                                                                                            spacerKt = null;
                                                                                            if (spacerKt != null) {
                                                                                            }
                                                                                            if (actionBody2 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                selectTransaction = null;
                                                                                if (openLink != null) {
                                                                                }
                                                                            }
                                                                        }
                                                                        openLink = null;
                                                                        if (zzliVar != null) {
                                                                        }
                                                                        selectTransaction = null;
                                                                        if (openLink != null) {
                                                                        }
                                                                    } else if (transactionBody != null) {
                                                                        str = transactionBody.entity_id;
                                                                        str.getClass();
                                                                        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker.INSTANCE)).enabled()) {
                                                                            return new MessageBody.ActivityItemTransactionBody(str);
                                                                        }
                                                                        supportChatApi$getMessageBody$1.L$9 = str;
                                                                        supportChatApi$getMessageBody$1.label = 1;
                                                                        obj = ((RealTransactionBodyResolver) this.transactionBodyResolver).getTransaction(str, supportChatApi$getMessageBody$1);
                                                                        if (obj == coroutineSingletons) {
                                                                            return coroutineSingletons;
                                                                        }
                                                                    } else if (systemMessageBody != null) {
                                                                        String str12 = systemMessageBody.text;
                                                                        str12.getClass();
                                                                        ChatMessage.SystemMessageBody.Styling styling = systemMessageBody.styling;
                                                                        return new MessageBody.SystemMessageBody(str12, styling != null ? new MessageBody.SystemMessageBody.Styling(styling.show_divider, styling.show_timestamp) : null);
                                                                    }
                                                                    return MessageBody.UnknownBody.INSTANCE;
                                                                }
                                                            }
                                                            systemMessageBody = null;
                                                            if (textBody != null) {
                                                            }
                                                        }
                                                    }
                                                    transactionBody = null;
                                                    if (body != null) {
                                                    }
                                                    systemMessageBody = null;
                                                    if (textBody != null) {
                                                    }
                                                }
                                            }
                                            actionBody = null;
                                            if (body != null) {
                                            }
                                            transactionBody = null;
                                            if (body != null) {
                                            }
                                            systemMessageBody = null;
                                            if (textBody != null) {
                                            }
                                        }
                                    }
                                    sunshineFileBody = null;
                                    if (body != null) {
                                    }
                                    actionBody = null;
                                    if (body != null) {
                                    }
                                    transactionBody = null;
                                    if (body != null) {
                                    }
                                    systemMessageBody = null;
                                    if (textBody != null) {
                                    }
                                }
                            }
                            fileBody = null;
                            if (body != null) {
                            }
                            sunshineFileBody = null;
                            if (body != null) {
                            }
                            actionBody = null;
                            if (body != null) {
                            }
                            transactionBody = null;
                            if (body != null) {
                            }
                            systemMessageBody = null;
                            if (textBody != null) {
                            }
                        }
                    }
                    textBody = null;
                    if (body != null) {
                    }
                    fileBody = null;
                    if (body != null) {
                    }
                    sunshineFileBody = null;
                    if (body != null) {
                    }
                    actionBody = null;
                    if (body != null) {
                    }
                    transactionBody = null;
                    if (body != null) {
                    }
                    systemMessageBody = null;
                    if (textBody != null) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = supportChatApi$getMessageBody$1.L$9;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((MessageBody.TransactionBody) obj) instanceof MessageBody.TransactionBody.Missing) {
                    LoadTransactionError.Source source = LoadTransactionError.Source.CHAT;
                    this.errorReporter.report(new LoadTransactionError(str), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
                return (MessageBody) obj;
            }
        }
        supportChatApi$getMessageBody$1 = new SupportChatApi$getMessageBody$1(this, continuationImpl);
        obj = supportChatApi$getMessageBody$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportChatApi$getMessageBody$1.label;
        MessageBody.ActionBody actionBody22 = null;
        if (i != 0) {
        }
        if (((MessageBody.TransactionBody) obj) instanceof MessageBody.TransactionBody.Missing) {
        }
        return (MessageBody) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r11 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0075, code lost:
    
        if (r11 == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getNewMessages(String str, ContinuationImpl continuationImpl) {
        SupportChatApi$getNewMessages$1 supportChatApi$getNewMessages$1;
        int i;
        ApiResult apiResult;
        List list;
        Object obj;
        String messageToken;
        ListIterator listIterator;
        Object obj2;
        RecordedMessage recordedMessage;
        String messageToken2;
        if (continuationImpl instanceof SupportChatApi$getNewMessages$1) {
            supportChatApi$getNewMessages$1 = (SupportChatApi$getNewMessages$1) continuationImpl;
            int i2 = supportChatApi$getNewMessages$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportChatApi$getNewMessages$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = supportChatApi$getNewMessages$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportChatApi$getNewMessages$1.label;
                SupportConversationPersistence supportConversationPersistence = this.conversationPersistence;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    GetChatMessagesRequest getChatMessagesRequest = str != null ? new GetChatMessagesRequest(new GetChatMessagesRequest$Criteria$After(new GetChatMessagesRequest.After(str))) : new GetChatMessagesRequest(new GetChatMessagesRequest$Criteria$Recent(new GetChatMessagesRequest.RecentHistory()));
                    supportChatApi$getNewMessages$1.label = 1;
                    obj3 = getChatMessages(getChatMessagesRequest, supportChatApi$getNewMessages$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            List list2 = supportChatApi$getNewMessages$1.L$3;
                            ApiResult apiResult2 = supportChatApi$getNewMessages$1.L$2;
                            SafeTrace.throwOnFailure(obj3);
                            return apiResult2;
                        }
                        list = supportChatApi$getNewMessages$1.L$3;
                        apiResult = supportChatApi$getNewMessages$1.L$2;
                        SafeTrace.throwOnFailure(obj3);
                        listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = listIterator.previous();
                            if (((RecordedMessage) obj2).getSender() == Message.Sender.CUSTOMER) {
                                break;
                            }
                        }
                        recordedMessage = (RecordedMessage) obj2;
                        if (recordedMessage != null && (messageToken2 = recordedMessage.getMessageToken()) != null) {
                            supportChatApi$getNewMessages$1.L$2 = apiResult;
                            supportChatApi$getNewMessages$1.L$3 = null;
                            supportChatApi$getNewMessages$1.label = 3;
                            if (supportConversationPersistence.updateLastReadMessageToken(messageToken2, list, supportChatApi$getNewMessages$1) != obj4) {
                                return obj4;
                            }
                        }
                        return apiResult;
                    }
                    SafeTrace.throwOnFailure(obj3);
                }
                apiResult = (ApiResult) obj3;
                if (apiResult instanceof ApiResult.Success) {
                    list = CollectionsKt.toList(((RecordedTranscript) ((ApiResult.Success) apiResult).response).getMessages().values());
                    ListIterator listIterator2 = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator2.previous();
                        if (!(((RecordedMessage) obj).getBody() instanceof MessageBody.SystemMessageBody)) {
                            break;
                        }
                    }
                    RecordedMessage recordedMessage2 = (RecordedMessage) obj;
                    if (recordedMessage2 != null && (messageToken = recordedMessage2.getMessageToken()) != null) {
                        supportChatApi$getNewMessages$1.L$2 = apiResult;
                        supportChatApi$getNewMessages$1.L$3 = list;
                        supportChatApi$getNewMessages$1.label = 2;
                        Object obj5 = supportConversationPersistence.lastLoadedMessageTokenKeyValue.set(new ChatLastLoadedMessageToken(messageToken), supportChatApi$getNewMessages$1);
                        if (obj5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj5 = Unit.INSTANCE;
                        }
                    }
                    listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                        }
                    }
                    recordedMessage = (RecordedMessage) obj2;
                    if (recordedMessage != null) {
                        supportChatApi$getNewMessages$1.L$2 = apiResult;
                        supportChatApi$getNewMessages$1.L$3 = null;
                        supportChatApi$getNewMessages$1.label = 3;
                        if (supportConversationPersistence.updateLastReadMessageToken(messageToken2, list, supportChatApi$getNewMessages$1) != obj4) {
                        }
                    }
                }
                return apiResult;
            }
        }
        supportChatApi$getNewMessages$1 = new SupportChatApi$getNewMessages$1(this, continuationImpl);
        Object obj32 = supportChatApi$getNewMessages$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportChatApi$getNewMessages$1.label;
        SupportConversationPersistence supportConversationPersistence2 = this.conversationPersistence;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj32;
        if (apiResult instanceof ApiResult.Success) {
        }
        return apiResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMessages(ArrayList arrayList, String str, ContinuationImpl continuationImpl) {
        SupportChatApi$sendMessages$1 supportChatApi$sendMessages$1;
        int i;
        zzln outgoingMessage$Body$SelectedTransaction;
        ApiResult apiResult;
        if (continuationImpl instanceof SupportChatApi$sendMessages$1) {
            supportChatApi$sendMessages$1 = (SupportChatApi$sendMessages$1) continuationImpl;
            int i2 = supportChatApi$sendMessages$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportChatApi$sendMessages$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = supportChatApi$sendMessages$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportChatApi$sendMessages$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        PendingMessage pendingMessage = (PendingMessage) it.next();
                        String idempotenceToken = pendingMessage.getIdempotenceToken();
                        MessageBody body = pendingMessage.getBody();
                        if (body instanceof MessageBody.TextBody) {
                            outgoingMessage$Body$SelectedTransaction = new OutgoingMessage$Body$Text(new OutgoingMessage.TextBody(((MessageBody.TextBody) body).getText()));
                        } else if (body instanceof MessageBody.SelectedReplyBody) {
                            SuggestedReply reply = ((MessageBody.SelectedReplyBody) body).getReply();
                            outgoingMessage$Body$SelectedTransaction = new OutgoingMessage$Body$SelectedReply(new OutgoingMessage.SelectedReply(reply.getToken(), reply.getText(), reply.getPayload()));
                        } else if (body instanceof MessageBody.FileBody) {
                            String fileToken = ((MessageBody.FileBody) body).getFileToken();
                            fileToken.getClass();
                            outgoingMessage$Body$SelectedTransaction = new OutgoingMessage$Body$File(new OutgoingMessage.FileBody(fileToken));
                        } else {
                            outgoingMessage$Body$SelectedTransaction = body instanceof MessageBody.TransactionBody ? new OutgoingMessage$Body$SelectedTransaction(new OutgoingMessage.SelectedTransaction(((MessageBody.TransactionBody) body).getEntityId())) : body instanceof MessageBody.ActivityItemTransactionBody ? new OutgoingMessage$Body$SelectedTransaction(new OutgoingMessage.SelectedTransaction(((MessageBody.ActivityItemTransactionBody) body).getEntityId())) : null;
                        }
                        arrayList2.add(new OutgoingMessage(idempotenceToken, outgoingMessage$Body$SelectedTransaction));
                    }
                    SendChatMessagesRequest sendChatMessagesRequest = new SendChatMessagesRequest(arrayList2, ByteString.EMPTY);
                    supportChatApi$sendMessages$1.label = 1;
                    obj = this.service.sendChatMessages(str, sendChatMessagesRequest, supportChatApi$sendMessages$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return new ApiResult.Success(Unit.INSTANCE);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return apiResult;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        supportChatApi$sendMessages$1 = new SupportChatApi$sendMessages$1(this, continuationImpl);
        Object obj2 = supportChatApi$sendMessages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportChatApi$sendMessages$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a A[LOOP:1: B:68:0x0124->B:70:0x012a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:10:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toTranscript(GetChatMessagesResponse getChatMessagesResponse, ContinuationImpl continuationImpl) {
        SupportChatApi$toTranscript$1 supportChatApi$toTranscript$1;
        int i;
        GetChatMessagesResponse getChatMessagesResponse2;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        Conversation conversation;
        ChatMessage.Customer customer;
        Object obj;
        Object obj2;
        Object obj3;
        Message.Sender sender;
        Iterator it2;
        SupportChatApi$toTranscript$1 supportChatApi$toTranscript$12;
        Object recordedMessage;
        SupportChatApi supportChatApi = this;
        if (continuationImpl instanceof SupportChatApi$toTranscript$1) {
            supportChatApi$toTranscript$1 = (SupportChatApi$toTranscript$1) continuationImpl;
            int i5 = supportChatApi$toTranscript$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                supportChatApi$toTranscript$1.label = i5 - PKIFailureInfo.systemUnavail;
                Object obj4 = supportChatApi$toTranscript$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportChatApi$toTranscript$1.label;
                int i6 = 10;
                int i7 = 1;
                ChatMessage$Sender$Customer chatMessage$Sender$Customer = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj4);
                    getChatMessagesResponse2 = getChatMessagesResponse;
                    List list = getChatMessagesResponse2.messages;
                    ArrayList arrayList = new ArrayList();
                    i2 = 0;
                    it = list.iterator();
                    collection = arrayList;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = supportChatApi$toTranscript$1.I$2;
                    i4 = supportChatApi$toTranscript$1.I$1;
                    i2 = supportChatApi$toTranscript$1.I$0;
                    ChatMessage chatMessage = supportChatApi$toTranscript$1.L$8;
                    it = supportChatApi$toTranscript$1.L$5;
                    collection = supportChatApi$toTranscript$1.L$3;
                    GetChatMessagesResponse getChatMessagesResponse3 = supportChatApi$toTranscript$1.L$0;
                    SafeTrace.throwOnFailure(obj4);
                    MessageBody messageBody = (MessageBody) obj4;
                    if (messageBody != null) {
                        zzlk zzlkVar = chatMessage.sender;
                        if (zzlkVar != null) {
                            ChatMessage$Sender$Customer chatMessage$Sender$Customer2 = zzlkVar instanceof ChatMessage$Sender$Customer ? (ChatMessage$Sender$Customer) zzlkVar : chatMessage$Sender$Customer;
                            if (chatMessage$Sender$Customer2 != null) {
                                customer = chatMessage$Sender$Customer2.getValue();
                                if (customer == null) {
                                    if (zzlkVar != null) {
                                        ChatMessage$Sender$Advocate chatMessage$Sender$Advocate = zzlkVar instanceof ChatMessage$Sender$Advocate ? (ChatMessage$Sender$Advocate) zzlkVar : chatMessage$Sender$Customer;
                                        if (chatMessage$Sender$Advocate != 0) {
                                            obj = chatMessage$Sender$Advocate.getValue();
                                            if (obj == null) {
                                                if (zzlkVar != null) {
                                                    ChatMessage$Sender$Bot chatMessage$Sender$Bot = zzlkVar instanceof ChatMessage$Sender$Bot ? (ChatMessage$Sender$Bot) zzlkVar : chatMessage$Sender$Customer;
                                                    if (chatMessage$Sender$Bot != 0) {
                                                        obj2 = chatMessage$Sender$Bot.getValue();
                                                        if (obj2 == null) {
                                                            if (zzlkVar != null) {
                                                                ChatMessage$Sender$System chatMessage$Sender$System = zzlkVar instanceof ChatMessage$Sender$System ? (ChatMessage$Sender$System) zzlkVar : chatMessage$Sender$Customer;
                                                                if (chatMessage$Sender$System != 0) {
                                                                    obj3 = chatMessage$Sender$System.getValue();
                                                                    sender = obj3 == null ? Message.Sender.SYSTEM : Message.Sender.UNKNOWN;
                                                                }
                                                            }
                                                            obj3 = chatMessage$Sender$Customer;
                                                            if (obj3 == null) {
                                                            }
                                                        } else {
                                                            sender = Message.Sender.BOT;
                                                        }
                                                    }
                                                }
                                                obj2 = chatMessage$Sender$Customer;
                                                if (obj2 == null) {
                                                }
                                            } else {
                                                sender = Message.Sender.ADVOCATE;
                                            }
                                        }
                                    }
                                    obj = chatMessage$Sender$Customer;
                                    if (obj == null) {
                                    }
                                } else {
                                    sender = Message.Sender.CUSTOMER;
                                }
                                String str = chatMessage.idempotence_token;
                                String str2 = chatMessage.message_token;
                                str2.getClass();
                                Long l = chatMessage.recorded_at;
                                l.getClass();
                                Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
                                ofEpochMilli.getClass();
                                if (sender == Message.Sender.UNKNOWN) {
                                    messageBody = MessageBody.UnknownBody.INSTANCE;
                                }
                                MessageBody messageBody2 = messageBody;
                                List list2 = chatMessage.suggested_replies;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, i6));
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    ChatMessage.SuggestedReply suggestedReply = (ChatMessage.SuggestedReply) it2.next();
                                    Iterator it3 = it2;
                                    String str3 = suggestedReply.token;
                                    str3.getClass();
                                    SupportChatApi$toTranscript$1 supportChatApi$toTranscript$13 = supportChatApi$toTranscript$1;
                                    String str4 = suggestedReply.text;
                                    str4.getClass();
                                    ByteString byteString = suggestedReply.payload;
                                    byteString.getClass();
                                    arrayList2.add(new SuggestedReply(str3, str4, byteString));
                                    it2 = it3;
                                    supportChatApi$toTranscript$1 = supportChatApi$toTranscript$13;
                                }
                                supportChatApi$toTranscript$12 = supportChatApi$toTranscript$1;
                                ChatMessage.Disclaimer disclaimer = chatMessage.disclaimer;
                                recordedMessage = new RecordedMessage(str, ofEpochMilli, messageBody2, sender, str2, arrayList2, disclaimer == null ? disclaimer.text : null);
                            }
                        }
                        customer = chatMessage$Sender$Customer;
                        if (customer == null) {
                        }
                        String str5 = chatMessage.idempotence_token;
                        String str22 = chatMessage.message_token;
                        str22.getClass();
                        Long l2 = chatMessage.recorded_at;
                        l2.getClass();
                        Instant ofEpochMilli2 = Instant.ofEpochMilli(l2.longValue());
                        ofEpochMilli2.getClass();
                        if (sender == Message.Sender.UNKNOWN) {
                        }
                        MessageBody messageBody22 = messageBody;
                        List list22 = chatMessage.suggested_replies;
                        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list22, i6));
                        it2 = list22.iterator();
                        while (it2.hasNext()) {
                        }
                        supportChatApi$toTranscript$12 = supportChatApi$toTranscript$1;
                        ChatMessage.Disclaimer disclaimer2 = chatMessage.disclaimer;
                        recordedMessage = new RecordedMessage(str5, ofEpochMilli2, messageBody22, sender, str22, arrayList22, disclaimer2 == null ? disclaimer2.text : null);
                    } else {
                        supportChatApi$toTranscript$12 = supportChatApi$toTranscript$1;
                        recordedMessage = chatMessage$Sender$Customer;
                    }
                    if (recordedMessage != null) {
                        collection.add(recordedMessage);
                    }
                    supportChatApi = this;
                    getChatMessagesResponse2 = getChatMessagesResponse3;
                    supportChatApi$toTranscript$1 = supportChatApi$toTranscript$12;
                    i6 = 10;
                    i7 = 1;
                    chatMessage$Sender$Customer = null;
                    if (it.hasNext()) {
                        chatMessage = (ChatMessage) it.next();
                        supportChatApi$toTranscript$1.L$0 = getChatMessagesResponse2;
                        supportChatApi$toTranscript$1.L$3 = collection;
                        supportChatApi$toTranscript$1.L$5 = it;
                        supportChatApi$toTranscript$1.L$8 = chatMessage;
                        supportChatApi$toTranscript$1.I$0 = i2;
                        supportChatApi$toTranscript$1.I$1 = i4;
                        supportChatApi$toTranscript$1.I$2 = i3;
                        supportChatApi$toTranscript$1.label = i7;
                        Object messageBody3 = supportChatApi.getMessageBody(chatMessage, supportChatApi.fileUploadService, supportChatApi$toTranscript$1);
                        if (messageBody3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        getChatMessagesResponse3 = getChatMessagesResponse2;
                        obj4 = messageBody3;
                        MessageBody messageBody4 = (MessageBody) obj4;
                        if (messageBody4 != null) {
                        }
                        if (recordedMessage != null) {
                        }
                        supportChatApi = this;
                        getChatMessagesResponse2 = getChatMessagesResponse3;
                        supportChatApi$toTranscript$1 = supportChatApi$toTranscript$12;
                        i6 = 10;
                        i7 = 1;
                        chatMessage$Sender$Customer = null;
                        if (it.hasNext()) {
                            List list3 = (List) collection;
                            Boolean bool = getChatMessagesResponse2.more_before;
                            bool.getClass();
                            PagingStatus pagingStatus = bool.booleanValue() ? PagingStatus.HAS_MORE : PagingStatus.EXHAUSTED;
                            GetChatMessagesResponse.Conversation conversation2 = getChatMessagesResponse2.active_conversation;
                            if (conversation2 != null) {
                                GetChatMessagesResponse.Conversation.BotStatus botStatus = conversation2.bot_status;
                                int i8 = botStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[botStatus.ordinal()];
                                conversation = new Conversation(i8 != 1 ? i8 != 2 ? i8 != 3 ? Conversation.BotStatus.UNKNOWN : Conversation.BotStatus.HANDED_OVER : Conversation.BotStatus.ACTIVE : Conversation.BotStatus.READY);
                            } else {
                                conversation = null;
                            }
                            List list4 = list3;
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                            if (mapCapacity < 16) {
                                mapCapacity = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                            for (Object obj5 : list4) {
                                linkedHashMap.put(((RecordedMessage) obj5).getMessageToken(), obj5);
                            }
                            return new RecordedTranscript(linkedHashMap, pagingStatus, conversation);
                        }
                    }
                }
            }
        }
        supportChatApi$toTranscript$1 = new SupportChatApi$toTranscript$1(supportChatApi, continuationImpl);
        Object obj42 = supportChatApi$toTranscript$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportChatApi$toTranscript$1.label;
        int i62 = 10;
        int i72 = 1;
        ChatMessage$Sender$Customer chatMessage$Sender$Customer3 = null;
        if (i != 0) {
        }
    }
}
