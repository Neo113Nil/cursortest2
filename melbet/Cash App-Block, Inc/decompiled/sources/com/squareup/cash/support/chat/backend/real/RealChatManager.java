package com.squareup.cash.support.chat.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.squareup.cash.support.chat.backend.api.ChatPermission;
import com.squareup.cash.support.chat.backend.api.ChatStatus;
import com.squareup.protos.cash.supportal.app.EndChatRequest;
import com.squareup.protos.cash.supportal.app.EndChatResponse;
import com.squareup.protos.cash.supportal.app.OpenChatRequest;
import com.squareup.protos.cash.supportal.app.OpenChatResponse;
import com.squareup.protos.cash.supportal.app.OpenChatResponse$Result$Allowed;
import com.squareup.protos.cash.supportal.app.OpenChatResponse$Result$Denied;
import com.squareup.protos.cash.supportal.app.SupportChatStatusRequest;
import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse;
import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse$Access$Granted;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealChatManager {
    public final CoroutineScope scope;
    public final SupportalAppService service;

    public RealChatManager(SupportalAppService supportalAppService, CoroutineScope coroutineScope) {
        this.service = supportalAppService;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object endChatConvo(String str, ContinuationImpl continuationImpl) {
        RealChatManager$endChatConvo$1 realChatManager$endChatConvo$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealChatManager$endChatConvo$1) {
            realChatManager$endChatConvo$1 = (RealChatManager$endChatConvo$1) continuationImpl;
            int i2 = realChatManager$endChatConvo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$endChatConvo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$endChatConvo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$endChatConvo$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    EndChatRequest endChatRequest = new EndChatRequest();
                    realChatManager$endChatConvo$1.label = 1;
                    obj = this.service.endChat(str, endChatRequest, realChatManager$endChatConvo$1);
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
                    return ((EndChatResponse) ((ApiResult.Success) apiResult).response).survey_token;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realChatManager$endChatConvo$1 = new RealChatManager$endChatConvo$1(this, continuationImpl);
        Object obj2 = realChatManager$endChatConvo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$endChatConvo$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChatStatus(ContinuationImpl continuationImpl) {
        RealChatManager$getChatStatus$1 realChatManager$getChatStatus$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealChatManager$getChatStatus$1) {
            realChatManager$getChatStatus$1 = (RealChatManager$getChatStatus$1) continuationImpl;
            int i2 = realChatManager$getChatStatus$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$getChatStatus$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$getChatStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$getChatStatus$1.label;
                SupportChatStatusResponse.Granted granted = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SupportChatStatusRequest supportChatStatusRequest = new SupportChatStatusRequest(ByteString.EMPTY);
                    realChatManager$getChatStatus$1.label = 1;
                    obj = this.service.supportChatStatus(supportChatStatusRequest, realChatManager$getChatStatus$1);
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
                    SupportChatStatusResponse supportChatStatusResponse = (SupportChatStatusResponse) ((ApiResult.Success) apiResult).response;
                    zzlo zzloVar = supportChatStatusResponse.access;
                    if (zzloVar != null) {
                        SupportChatStatusResponse$Access$Granted supportChatStatusResponse$Access$Granted = zzloVar instanceof SupportChatStatusResponse$Access$Granted ? (SupportChatStatusResponse$Access$Granted) zzloVar : null;
                        if (supportChatStatusResponse$Access$Granted != null) {
                            granted = supportChatStatusResponse$Access$Granted.value;
                        }
                    }
                    if (granted != null) {
                        Boolean bool = supportChatStatusResponse.customer_service_available;
                        bool.getClass();
                        boolean booleanValue = bool.booleanValue();
                        Boolean bool2 = granted.has_active_chat;
                        bool2.getClass();
                        return new ChatStatus.Enabled(supportChatStatusResponse.availability_subtitle, supportChatStatusResponse.ignored_phrases, booleanValue, bool2.booleanValue());
                    }
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return ChatStatus.FeatureDisabled.INSTANCE;
            }
        }
        realChatManager$getChatStatus$1 = new RealChatManager$getChatStatus$1(this, continuationImpl);
        Object obj2 = realChatManager$getChatStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$getChatStatus$1.label;
        SupportChatStatusResponse.Granted granted2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return ChatStatus.FeatureDisabled.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum openChat(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        RealChatManager$openChat$1 realChatManager$openChat$1;
        int i;
        ApiResult apiResult;
        OpenChatResponse.Allowed allowed;
        OpenChatResponse.Denied denied;
        if (continuationImpl instanceof RealChatManager$openChat$1) {
            realChatManager$openChat$1 = (RealChatManager$openChat$1) continuationImpl;
            int i2 = realChatManager$openChat$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realChatManager$openChat$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realChatManager$openChat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realChatManager$openChat$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    OpenChatRequest openChatRequest = new OpenChatRequest(str, str2, str4, ByteString.EMPTY);
                    realChatManager$openChat$1.label = 1;
                    obj = this.service.openChat(str3, openChatRequest, realChatManager$openChat$1);
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
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return ChatPermission.UNKNOWN;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                zzlm zzlmVar = ((OpenChatResponse) ((ApiResult.Success) apiResult).response).result;
                if (zzlmVar != null) {
                    OpenChatResponse$Result$Allowed openChatResponse$Result$Allowed = zzlmVar instanceof OpenChatResponse$Result$Allowed ? (OpenChatResponse$Result$Allowed) zzlmVar : null;
                    if (openChatResponse$Result$Allowed != null) {
                        allowed = openChatResponse$Result$Allowed.value;
                        if (allowed == null) {
                            return ChatPermission.ALLOWED;
                        }
                        if (zzlmVar != null) {
                            OpenChatResponse$Result$Denied openChatResponse$Result$Denied = zzlmVar instanceof OpenChatResponse$Result$Denied ? (OpenChatResponse$Result$Denied) zzlmVar : null;
                            if (openChatResponse$Result$Denied != null) {
                                denied = openChatResponse$Result$Denied.value;
                                if (denied == null) {
                                    return ChatPermission.DENIED;
                                }
                                a$$ExternalSyntheticBUOutline0.m$3("Invalid open chat response");
                                return null;
                            }
                        }
                        denied = null;
                        if (denied == null) {
                        }
                    }
                }
                allowed = null;
                if (allowed == null) {
                }
            }
        }
        realChatManager$openChat$1 = new RealChatManager$openChat$1(this, continuationImpl);
        Object obj2 = realChatManager$openChat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realChatManager$openChat$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }
}
