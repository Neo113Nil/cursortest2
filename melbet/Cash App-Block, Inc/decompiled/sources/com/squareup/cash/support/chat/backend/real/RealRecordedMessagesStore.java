package com.squareup.cash.support.chat.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.PagingStatus;
import com.squareup.cash.support.chat.backend.api.RecordedMessage;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest$Criteria$Before;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealRecordedMessagesStore {
    public final SupportChatApi chatApi;
    public final StateFlowImpl state = FlowKt.MutableStateFlow(new MessagesState(new LinkedHashMap(), PagingStatus.EXHAUSTED, null, false));
    public final BufferedChannel oldMessagesRequests = PapaEvent.Channel$default(-1, null, null, 6);
    public final BufferedChannel newMessagesRequests = PapaEvent.Channel$default(-1, null, null, 6);

    public final class MessagesState {
        public final Conversation conversation;
        public final boolean loaded;
        public final PagingStatus pagingStatus;
        public final Map recordedMessages;

        public MessagesState(Map map, PagingStatus pagingStatus, Conversation conversation, boolean z) {
            map.getClass();
            pagingStatus.getClass();
            this.recordedMessages = map;
            this.pagingStatus = pagingStatus;
            this.conversation = conversation;
            this.loaded = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
        public static MessagesState copy$default(MessagesState messagesState, LinkedHashMap linkedHashMap, PagingStatus pagingStatus, int i) {
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            if ((i & 1) != 0) {
                linkedHashMap2 = messagesState.recordedMessages;
            }
            Conversation conversation = messagesState.conversation;
            boolean z = messagesState.loaded;
            messagesState.getClass();
            linkedHashMap2.getClass();
            pagingStatus.getClass();
            return new MessagesState(linkedHashMap2, pagingStatus, conversation, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagesState)) {
                return false;
            }
            MessagesState messagesState = (MessagesState) obj;
            return Intrinsics.areEqual(this.recordedMessages, messagesState.recordedMessages) && this.pagingStatus == messagesState.pagingStatus && Intrinsics.areEqual(this.conversation, messagesState.conversation) && this.loaded == messagesState.loaded;
        }

        public final int hashCode() {
            int hashCode = (this.pagingStatus.hashCode() + (this.recordedMessages.hashCode() * 31)) * 31;
            Conversation conversation = this.conversation;
            return Boolean.hashCode(this.loaded) + ((hashCode + (conversation == null ? 0 : conversation.botStatus.hashCode())) * 31);
        }

        public final String toString() {
            return "MessagesState(recordedMessages=" + this.recordedMessages + ", pagingStatus=" + this.pagingStatus + ", conversation=" + this.conversation + ", loaded=" + this.loaded + ")";
        }
    }

    public RealRecordedMessagesStore(CoroutineScope coroutineScope, SupportChatApi supportChatApi) {
        this.chatApi = supportChatApi;
        JobKt.launch$default(coroutineScope, null, null, new RealGcmRegistrar$unregister$2(this, (Continuation) null, 24), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadNewMessagesNow(RealRecordedMessagesStore realRecordedMessagesStore, ContinuationImpl continuationImpl) {
        RealRecordedMessagesStore$loadNewMessagesNow$1 realRecordedMessagesStore$loadNewMessagesNow$1;
        int i;
        ApiResult apiResult;
        Object value;
        MessagesState messagesState;
        StateFlowImpl stateFlowImpl = realRecordedMessagesStore.state;
        if (continuationImpl instanceof RealRecordedMessagesStore$loadNewMessagesNow$1) {
            realRecordedMessagesStore$loadNewMessagesNow$1 = (RealRecordedMessagesStore$loadNewMessagesNow$1) continuationImpl;
            int i2 = realRecordedMessagesStore$loadNewMessagesNow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realRecordedMessagesStore$loadNewMessagesNow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realRecordedMessagesStore$loadNewMessagesNow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecordedMessagesStore$loadNewMessagesNow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SupportChatApi supportChatApi = realRecordedMessagesStore.chatApi;
                    RecordedMessage recordedMessage = (RecordedMessage) CollectionsKt.lastOrNull(((MessagesState) stateFlowImpl.getValue()).recordedMessages.values());
                    String messageToken = recordedMessage != null ? recordedMessage.getMessageToken() : null;
                    realRecordedMessagesStore$loadNewMessagesNow$1.label = 1;
                    obj = supportChatApi.getNewMessages(messageToken, realRecordedMessagesStore$loadNewMessagesNow$1);
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
                do {
                    value = stateFlowImpl.getValue();
                    messagesState = (MessagesState) value;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        PagingStatus pagingStatus = messagesState.recordedMessages.isEmpty() ? ((RecordedTranscript) ((ApiResult.Success) apiResult).response).getPagingStatus() : messagesState.pagingStatus;
                        Map map = messagesState.recordedMessages;
                        RecordedTranscript recordedTranscript = (RecordedTranscript) ((ApiResult.Success) apiResult).response;
                        LinkedHashMap plus = MapsKt__MapsKt.plus(map, recordedTranscript.getMessages());
                        Conversation conversation = recordedTranscript.getConversation();
                        pagingStatus.getClass();
                        messagesState = new MessagesState(plus, pagingStatus, conversation, true);
                    } else if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                } while (!stateFlowImpl.compareAndSet(value, messagesState));
                return Unit.INSTANCE;
            }
        }
        realRecordedMessagesStore$loadNewMessagesNow$1 = new RealRecordedMessagesStore$loadNewMessagesNow$1(realRecordedMessagesStore, continuationImpl);
        Object obj2 = realRecordedMessagesStore$loadNewMessagesNow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecordedMessagesStore$loadNewMessagesNow$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        do {
            value = stateFlowImpl.getValue();
            messagesState = (MessagesState) value;
            if (!(apiResult instanceof ApiResult.Success)) {
            }
        } while (!stateFlowImpl.compareAndSet(value, messagesState));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c1 -> B:10:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadOldMessagesNow(RealRecordedMessagesStore realRecordedMessagesStore, ContinuationImpl continuationImpl) {
        RealRecordedMessagesStore$loadOldMessagesNow$1 realRecordedMessagesStore$loadOldMessagesNow$1;
        int i;
        Object value;
        int i2;
        RecordedMessage recordedMessage;
        Object chatMessages;
        MessagesState copy$default;
        StateFlowImpl stateFlowImpl = realRecordedMessagesStore.state;
        if (continuationImpl instanceof RealRecordedMessagesStore$loadOldMessagesNow$1) {
            realRecordedMessagesStore$loadOldMessagesNow$1 = (RealRecordedMessagesStore$loadOldMessagesNow$1) continuationImpl;
            int i3 = realRecordedMessagesStore$loadOldMessagesNow$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realRecordedMessagesStore$loadOldMessagesNow$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realRecordedMessagesStore$loadOldMessagesNow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecordedMessagesStore$loadOldMessagesNow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((MessagesState) stateFlowImpl.getValue()).pagingStatus == PagingStatus.EXHAUSTED || ((MessagesState) stateFlowImpl.getValue()).pagingStatus == PagingStatus.LOADING) {
                        return Unit.INSTANCE;
                    }
                    RecordedMessage recordedMessage2 = (RecordedMessage) CollectionsKt.firstOrNull(((MessagesState) stateFlowImpl.getValue()).recordedMessages.values());
                    if (recordedMessage2 == null) {
                        return Unit.INSTANCE;
                    }
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value, MessagesState.copy$default((MessagesState) value, null, PagingStatus.LOADING, 13)));
                    i2 = 0;
                    recordedMessage = recordedMessage2;
                    Object value2 = stateFlowImpl.getValue();
                    MessagesState messagesState = (MessagesState) value2;
                    SupportChatApi supportChatApi = realRecordedMessagesStore.chatApi;
                    String messageToken = recordedMessage.getMessageToken();
                    realRecordedMessagesStore$loadOldMessagesNow$1.L$0 = recordedMessage;
                    realRecordedMessagesStore$loadOldMessagesNow$1.L$1 = stateFlowImpl;
                    realRecordedMessagesStore$loadOldMessagesNow$1.L$2 = value2;
                    realRecordedMessagesStore$loadOldMessagesNow$1.L$3 = messagesState;
                    realRecordedMessagesStore$loadOldMessagesNow$1.I$0 = i2;
                    realRecordedMessagesStore$loadOldMessagesNow$1.label = 1;
                    chatMessages = supportChatApi.getChatMessages(new GetChatMessagesRequest(new GetChatMessagesRequest$Criteria$Before(new GetChatMessagesRequest.Before(messageToken))), realRecordedMessagesStore$loadOldMessagesNow$1);
                    if (chatMessages != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = realRecordedMessagesStore$loadOldMessagesNow$1.I$0;
                    MessagesState messagesState2 = realRecordedMessagesStore$loadOldMessagesNow$1.L$3;
                    Object obj2 = realRecordedMessagesStore$loadOldMessagesNow$1.L$2;
                    StateFlowImpl stateFlowImpl2 = realRecordedMessagesStore$loadOldMessagesNow$1.L$1;
                    recordedMessage = realRecordedMessagesStore$loadOldMessagesNow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    int i5 = i4;
                    stateFlowImpl = stateFlowImpl2;
                    Object obj3 = obj2;
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        RecordedTranscript recordedTranscript = (RecordedTranscript) ((ApiResult.Success) apiResult).response;
                        copy$default = MessagesState.copy$default(messagesState2, MapsKt__MapsKt.plus(recordedTranscript.getMessages(), messagesState2.recordedMessages), recordedTranscript.getPagingStatus(), 12);
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        copy$default = MessagesState.copy$default(messagesState2, null, PagingStatus.FAILED, 13);
                    }
                    if (!stateFlowImpl.compareAndSet(obj3, copy$default)) {
                        return Unit.INSTANCE;
                    }
                    i2 = i5;
                    Object value22 = stateFlowImpl.getValue();
                    MessagesState messagesState3 = (MessagesState) value22;
                    SupportChatApi supportChatApi2 = realRecordedMessagesStore.chatApi;
                    String messageToken2 = recordedMessage.getMessageToken();
                    realRecordedMessagesStore$loadOldMessagesNow$1.L$0 = recordedMessage;
                    realRecordedMessagesStore$loadOldMessagesNow$1.L$1 = stateFlowImpl;
                    realRecordedMessagesStore$loadOldMessagesNow$1.L$2 = value22;
                    realRecordedMessagesStore$loadOldMessagesNow$1.L$3 = messagesState3;
                    realRecordedMessagesStore$loadOldMessagesNow$1.I$0 = i2;
                    realRecordedMessagesStore$loadOldMessagesNow$1.label = 1;
                    chatMessages = supportChatApi2.getChatMessages(new GetChatMessagesRequest(new GetChatMessagesRequest$Criteria$Before(new GetChatMessagesRequest.Before(messageToken2))), realRecordedMessagesStore$loadOldMessagesNow$1);
                    if (chatMessages != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i6 = i2;
                    messagesState2 = messagesState3;
                    obj = chatMessages;
                    obj3 = value22;
                    i5 = i6;
                    ApiResult apiResult2 = (ApiResult) obj;
                    if (apiResult2 instanceof ApiResult.Success) {
                    }
                    if (!stateFlowImpl.compareAndSet(obj3, copy$default)) {
                    }
                }
            }
        }
        realRecordedMessagesStore$loadOldMessagesNow$1 = new RealRecordedMessagesStore$loadOldMessagesNow$1(realRecordedMessagesStore, continuationImpl);
        Object obj4 = realRecordedMessagesStore$loadOldMessagesNow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realRecordedMessagesStore$loadOldMessagesNow$1.label;
        if (i != 0) {
        }
    }
}
