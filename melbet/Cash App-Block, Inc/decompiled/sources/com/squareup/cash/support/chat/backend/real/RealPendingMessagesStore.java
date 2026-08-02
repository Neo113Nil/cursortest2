package com.squareup.cash.support.chat.backend.real;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.core.os.BundleKt;
import androidx.glance.text.TextKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.FileUploadService$Result;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.support.chat.backend.api.Conversation;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Failed;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Recorded;
import com.squareup.cash.support.chat.backend.api.MessageStatus$Sending;
import com.squareup.cash.support.chat.backend.api.PendingMessage;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealPendingMessagesStore {
    public final Analytics analytics;
    public final SupportChatApi chatApi;
    public final AndroidClock clock;
    public final RealFileUploadService fileUploadService;
    public final CoroutineContext ioDispatcher;
    public final RealRecordedMessagesStore recordedMessagesStore;
    public final CoroutineScope scope;
    public final StateFlowImpl state;
    public final TransactionBodyResolver transactionBodyResolver;

    public final class MessagesState {
        public final String flowToken;
        public final boolean hasSuggestedReplies;
        public final Map pendingRequests;

        public MessagesState(Map map, String str, boolean z) {
            map.getClass();
            this.pendingRequests = map;
            this.hasSuggestedReplies = z;
            this.flowToken = str;
        }

        public static MessagesState copy$default(MessagesState messagesState, Map map, boolean z, String str, int i) {
            if ((i & 2) != 0) {
                z = messagesState.hasSuggestedReplies;
            }
            if ((i & 4) != 0) {
                str = messagesState.flowToken;
            }
            messagesState.getClass();
            map.getClass();
            return new MessagesState(map, str, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessagesState)) {
                return false;
            }
            MessagesState messagesState = (MessagesState) obj;
            return Intrinsics.areEqual(this.pendingRequests, messagesState.pendingRequests) && this.hasSuggestedReplies == messagesState.hasSuggestedReplies && Intrinsics.areEqual(this.flowToken, messagesState.flowToken);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pendingRequests.hashCode() * 31, 31, this.hasSuggestedReplies);
            String str = this.flowToken;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessagesState(pendingRequests=");
            sb.append(this.pendingRequests);
            sb.append(", hasSuggestedReplies=");
            sb.append(this.hasSuggestedReplies);
            sb.append(", flowToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flowToken, ")");
        }
    }

    /* loaded from: classes7.dex */
    public final class PendingRequest {
        public final String flowToken;
        public final int inFlightCount;
        public final PendingMessage message;

        public PendingRequest(PendingMessage pendingMessage, int i, String str) {
            this.message = pendingMessage;
            this.inFlightCount = i;
            this.flowToken = str;
        }

        public static PendingRequest copy$default(PendingRequest pendingRequest, PendingMessage pendingMessage, int i, int i2) {
            if ((i2 & 1) != 0) {
                pendingMessage = pendingRequest.message;
            }
            if ((i2 & 2) != 0) {
                i = pendingRequest.inFlightCount;
            }
            String str = pendingRequest.flowToken;
            pendingMessage.getClass();
            return new PendingRequest(pendingMessage, i, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingRequest)) {
                return false;
            }
            PendingRequest pendingRequest = (PendingRequest) obj;
            return this.message.equals(pendingRequest.message) && this.inFlightCount == pendingRequest.inFlightCount && Intrinsics.areEqual(this.flowToken, pendingRequest.flowToken);
        }

        public final int getInFlightCount() {
            return this.inFlightCount;
        }

        public final PendingMessage getMessage() {
            return this.message;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inFlightCount, this.message.hashCode() * 31, 31);
            String str = this.flowToken;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PendingRequest(message=");
            sb.append(this.message);
            sb.append(", inFlightCount=");
            sb.append(this.inFlightCount);
            sb.append(", flowToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flowToken, ")");
        }
    }

    public RealPendingMessagesStore(CoroutineScope coroutineScope, SupportChatApi supportChatApi, CoroutineContext coroutineContext, AndroidClock androidClock, RealUuidGenerator realUuidGenerator, Analytics analytics, RealFileUploadService realFileUploadService, TransactionBodyResolver transactionBodyResolver, RealRecordedMessagesStore realRecordedMessagesStore) {
        this.scope = coroutineScope;
        this.chatApi = supportChatApi;
        this.ioDispatcher = coroutineContext;
        this.clock = androidClock;
        this.analytics = analytics;
        this.fileUploadService = realFileUploadService;
        this.transactionBodyResolver = transactionBodyResolver;
        this.recordedMessagesStore = realRecordedMessagesStore;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.state = FlowKt.MutableStateFlow(new MessagesState(emptyMap, null, false));
        JobKt.launch$default(coroutineScope, null, null, new Cache.AnonymousClass1(this, null, 7), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$dispatchFileUpload(RealPendingMessagesStore realPendingMessagesStore, String str, PendingMessage pendingMessage, String str2, ContinuationImpl continuationImpl) {
        RealPendingMessagesStore$dispatchFileUpload$1 realPendingMessagesStore$dispatchFileUpload$1;
        int i;
        MessageBody body;
        String str3;
        PendingMessage pendingMessage2;
        String str4;
        Instant instant;
        PendingRequest pendingRequest;
        MessageStatus$Failed.Type type2;
        MessageStatus$Failed messageStatus$Failed;
        PendingRequest copy$default;
        Object value;
        MessagesState messagesState;
        StateFlowImpl stateFlowImpl = realPendingMessagesStore.state;
        AndroidClock androidClock = realPendingMessagesStore.clock;
        if (continuationImpl instanceof RealPendingMessagesStore$dispatchFileUpload$1) {
            realPendingMessagesStore$dispatchFileUpload$1 = (RealPendingMessagesStore$dispatchFileUpload$1) continuationImpl;
            int i2 = realPendingMessagesStore$dispatchFileUpload$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPendingMessagesStore$dispatchFileUpload$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPendingMessagesStore$dispatchFileUpload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPendingMessagesStore$dispatchFileUpload$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    body = pendingMessage.getBody();
                    if (!(body instanceof MessageBody.FileBody)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                        return null;
                    }
                    Instant ofEpochMilli = Instant.ofEpochMilli(androidClock.millis());
                    RealFileUploadService realFileUploadService = realPendingMessagesStore.fileUploadService;
                    MessageBody.FileBody fileBody = (MessageBody.FileBody) body;
                    String m3749getUri1zWY0OA = fileBody.m3749getUri1zWY0OA();
                    FileMetadata metadata = fileBody.getMetadata();
                    str3 = str;
                    realPendingMessagesStore$dispatchFileUpload$1.L$0 = str3;
                    pendingMessage2 = pendingMessage;
                    realPendingMessagesStore$dispatchFileUpload$1.L$1 = pendingMessage2;
                    str4 = str2;
                    realPendingMessagesStore$dispatchFileUpload$1.L$2 = str4;
                    realPendingMessagesStore$dispatchFileUpload$1.L$3 = fileBody;
                    realPendingMessagesStore$dispatchFileUpload$1.L$4 = ofEpochMilli;
                    realPendingMessagesStore$dispatchFileUpload$1.label = 1;
                    Object m3558uploadkVGMmk0 = realFileUploadService.m3558uploadkVGMmk0(m3749getUri1zWY0OA, metadata, null, realPendingMessagesStore$dispatchFileUpload$1);
                    if (m3558uploadkVGMmk0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    instant = ofEpochMilli;
                    obj = m3558uploadkVGMmk0;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    instant = realPendingMessagesStore$dispatchFileUpload$1.L$4;
                    body = realPendingMessagesStore$dispatchFileUpload$1.L$3;
                    String str5 = realPendingMessagesStore$dispatchFileUpload$1.L$2;
                    PendingMessage pendingMessage3 = realPendingMessagesStore$dispatchFileUpload$1.L$1;
                    String str6 = realPendingMessagesStore$dispatchFileUpload$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str3 = str6;
                    str4 = str5;
                    pendingMessage2 = pendingMessage3;
                }
                FileUploadService$Result fileUploadService$Result = (FileUploadService$Result) obj;
                Analytics analytics = realPendingMessagesStore.analytics;
                boolean z = fileUploadService$Result instanceof FileUploadService$Result.Success;
                Duration between = Duration.between(instant, Instant.ofEpochMilli(androidClock.millis()));
                between.getClass();
                TextKt.logUploadAttachment(analytics, z, between, str4);
                pendingRequest = (PendingRequest) ((MessagesState) stateFlowImpl.getValue()).pendingRequests.get(str3);
                if (pendingRequest != null) {
                    return Unit.INSTANCE;
                }
                if (z) {
                    copy$default = PendingRequest.copy$default(pendingRequest, PendingMessage.copy$default(pendingMessage2, null, MessageBody.FileBody.m3748copy5y75sic$default((MessageBody.FileBody) body, ((FileUploadService$Result.Success) fileUploadService$Result).getFileToken()), null, 11), 0, 6);
                } else {
                    if (!(fileUploadService$Result instanceof FileUploadService$Result.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FileUploadService$Result.Failure failure = (FileUploadService$Result.Failure) fileUploadService$Result;
                    if (failure instanceof FileUploadService$Result.Failure.Delivery) {
                        FileUploadService$Result.Failure.Delivery delivery = (FileUploadService$Result.Failure.Delivery) failure;
                        messageStatus$Failed = new MessageStatus$Failed(MessageStatus$Failed.Type.DELIVERY, delivery.getRetryable(), delivery.getStatusCode(), false, 8);
                    } else {
                        if (!(failure instanceof FileUploadService$Result.Failure.File)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        FileUploadService$Result.Failure.File file = (FileUploadService$Result.Failure.File) failure;
                        int ordinal = file.getFileError().ordinal();
                        if (ordinal == 0) {
                            type2 = MessageStatus$Failed.Type.INVALID_FILE;
                        } else if (ordinal == 1) {
                            type2 = MessageStatus$Failed.Type.FILE_TOO_LARGE;
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            type2 = MessageStatus$Failed.Type.UNSUPPORTED_FILE_TYPE;
                        }
                        messageStatus$Failed = new MessageStatus$Failed(type2, false, null, file.getClientDetermined(), 2);
                    }
                    copy$default = PendingRequest.copy$default(pendingRequest, realPendingMessagesStore.recordFailure(pendingMessage2, 0, messageStatus$Failed, str4), 0, 6);
                }
                do {
                    value = stateFlowImpl.getValue();
                    messagesState = (MessagesState) value;
                } while (!stateFlowImpl.compareAndSet(value, realPendingMessagesStore.sendPendingMessages(MessagesState.copy$default(messagesState, MapsKt__MapsKt.plus(messagesState.pendingRequests, new Pair(str3, copy$default)), false, null, 6))));
                return Unit.INSTANCE;
            }
        }
        realPendingMessagesStore$dispatchFileUpload$1 = new RealPendingMessagesStore$dispatchFileUpload$1(realPendingMessagesStore, continuationImpl);
        Object obj2 = realPendingMessagesStore$dispatchFileUpload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPendingMessagesStore$dispatchFileUpload$1.label;
        if (i != 0) {
        }
        FileUploadService$Result fileUploadService$Result2 = (FileUploadService$Result) obj2;
        Analytics analytics2 = realPendingMessagesStore.analytics;
        boolean z2 = fileUploadService$Result2 instanceof FileUploadService$Result.Success;
        Duration between2 = Duration.between(instant, Instant.ofEpochMilli(androidClock.millis()));
        between2.getClass();
        TextKt.logUploadAttachment(analytics2, z2, between2, str4);
        pendingRequest = (PendingRequest) ((MessagesState) stateFlowImpl.getValue()).pendingRequests.get(str3);
        if (pendingRequest != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b A[LOOP:2: B:44:0x0145->B:46:0x014b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$dispatchSendMessages(RealPendingMessagesStore realPendingMessagesStore, LinkedHashMap linkedHashMap, String str, ContinuationImpl continuationImpl) {
        RealPendingMessagesStore$dispatchSendMessages$1 realPendingMessagesStore$dispatchSendMessages$1;
        int i;
        LinkedHashMap linkedHashMap2;
        List sortedWith;
        Object value;
        MessagesState messagesState;
        int mapCapacity;
        LinkedHashMap linkedHashMap3;
        MessageStatus$Failed messageStatus$Failed;
        PendingMessage recordFailure;
        String str2 = str;
        StateFlowImpl stateFlowImpl = realPendingMessagesStore.state;
        if (continuationImpl instanceof RealPendingMessagesStore$dispatchSendMessages$1) {
            realPendingMessagesStore$dispatchSendMessages$1 = (RealPendingMessagesStore$dispatchSendMessages$1) continuationImpl;
            int i2 = realPendingMessagesStore$dispatchSendMessages$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPendingMessagesStore$dispatchSendMessages$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPendingMessagesStore$dispatchSendMessages$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPendingMessagesStore$dispatchSendMessages$1.label;
                int i3 = 10;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Collection values = linkedHashMap.values();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PendingRequest) it.next()).getMessage());
                    }
                    realPendingMessagesStore$dispatchSendMessages$1.L$0 = linkedHashMap;
                    realPendingMessagesStore$dispatchSendMessages$1.L$1 = str2;
                    realPendingMessagesStore$dispatchSendMessages$1.label = 1;
                    obj = realPendingMessagesStore.chatApi.sendMessages(arrayList, str2, realPendingMessagesStore$dispatchSendMessages$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    linkedHashMap2 = linkedHashMap;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = realPendingMessagesStore$dispatchSendMessages$1.L$1;
                    linkedHashMap2 = realPendingMessagesStore$dispatchSendMessages$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                Collection<PendingRequest> values2 = ((MessagesState) stateFlowImpl.getValue()).pendingRequests.values();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values2, 10));
                for (PendingRequest pendingRequest : values2) {
                    if (linkedHashMap2.containsKey(pendingRequest.getMessage().getIdempotenceToken())) {
                        int inFlightCount = pendingRequest.getInFlightCount() - 1;
                        if (apiResult instanceof ApiResult.Success) {
                            recordFailure = PendingMessage.copy$default(pendingRequest.getMessage(), null, null, MessageStatus$Recorded.INSTANCE, 7);
                        } else {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            PendingMessage message = pendingRequest.getMessage();
                            ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                            if (failure instanceof ApiResult.Failure.HttpFailure) {
                                messageStatus$Failed = new MessageStatus$Failed(MessageStatus$Failed.Type.DELIVERY, BundleKt.isRetryable(failure), Integer.valueOf(((ApiResult.Failure.HttpFailure) failure).code), false, 8);
                            } else {
                                if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                messageStatus$Failed = new MessageStatus$Failed(MessageStatus$Failed.Type.DELIVERY, true, null, false, 12);
                            }
                            recordFailure = realPendingMessagesStore.recordFailure(message, inFlightCount, messageStatus$Failed, str2);
                        }
                        pendingRequest = PendingRequest.copy$default(pendingRequest, recordFailure, inFlightCount, 4);
                    }
                    arrayList2.add(pendingRequest);
                }
                sortedWith = CollectionsKt.sortedWith(arrayList2, new VideoCapture$$ExternalSyntheticLambda6(new ShareSheetPresenter$$ExternalSyntheticLambda0(25), i3));
                do {
                    value = stateFlowImpl.getValue();
                    messagesState = (MessagesState) value;
                    List list = sortedWith;
                    mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    linkedHashMap3 = new LinkedHashMap(mapCapacity);
                    for (Object obj2 : list) {
                        linkedHashMap3.put(((PendingRequest) obj2).getMessage().getIdempotenceToken(), obj2);
                    }
                } while (!stateFlowImpl.compareAndSet(value, MessagesState.copy$default(messagesState, linkedHashMap3, false, null, 6)));
                return Unit.INSTANCE;
            }
        }
        realPendingMessagesStore$dispatchSendMessages$1 = new RealPendingMessagesStore$dispatchSendMessages$1(realPendingMessagesStore, continuationImpl);
        Object obj3 = realPendingMessagesStore$dispatchSendMessages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPendingMessagesStore$dispatchSendMessages$1.label;
        int i32 = 10;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj3;
        Collection<PendingRequest> values22 = ((MessagesState) stateFlowImpl.getValue()).pendingRequests.values();
        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values22, 10));
        while (r5.hasNext()) {
        }
        sortedWith = CollectionsKt.sortedWith(arrayList22, new VideoCapture$$ExternalSyntheticLambda6(new ShareSheetPresenter$$ExternalSyntheticLambda0(25), i32));
        do {
            value = stateFlowImpl.getValue();
            messagesState = (MessagesState) value;
            List list2 = sortedWith;
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            if (mapCapacity < 16) {
            }
            linkedHashMap3 = new LinkedHashMap(mapCapacity);
            while (r4.hasNext()) {
            }
        } while (!stateFlowImpl.compareAndSet(value, MessagesState.copy$default(messagesState, linkedHashMap3, false, null, 6)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$resolveTransaction(RealPendingMessagesStore realPendingMessagesStore, String str, MessageBody.TransactionBody.Selected selected, ContinuationImpl continuationImpl) {
        RealPendingMessagesStore$resolveTransaction$1 realPendingMessagesStore$resolveTransaction$1;
        int i;
        PendingRequest pendingRequest;
        Object value;
        MessagesState messagesState;
        StateFlowImpl stateFlowImpl = realPendingMessagesStore.state;
        if (continuationImpl instanceof RealPendingMessagesStore$resolveTransaction$1) {
            realPendingMessagesStore$resolveTransaction$1 = (RealPendingMessagesStore$resolveTransaction$1) continuationImpl;
            int i2 = realPendingMessagesStore$resolveTransaction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPendingMessagesStore$resolveTransaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPendingMessagesStore$resolveTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPendingMessagesStore$resolveTransaction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = realPendingMessagesStore.ioDispatcher;
                    ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$1 = new ShoppingWebBridge$loadUrl$1(realPendingMessagesStore, selected, null, 17);
                    realPendingMessagesStore$resolveTransaction$1.L$0 = str;
                    realPendingMessagesStore$resolveTransaction$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, shoppingWebBridge$loadUrl$1, realPendingMessagesStore$resolveTransaction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realPendingMessagesStore$resolveTransaction$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                MessageBody.TransactionBody transactionBody = (MessageBody.TransactionBody) obj;
                pendingRequest = (PendingRequest) ((MessagesState) stateFlowImpl.getValue()).pendingRequests.get(str);
                if (pendingRequest != null) {
                    return Unit.INSTANCE;
                }
                PendingRequest copy$default = PendingRequest.copy$default(pendingRequest, PendingMessage.copy$default(pendingRequest.getMessage(), null, transactionBody, null, 11), 0, 6);
                do {
                    value = stateFlowImpl.getValue();
                    messagesState = (MessagesState) value;
                } while (!stateFlowImpl.compareAndSet(value, MessagesState.copy$default(messagesState, MapsKt__MapsKt.plus(messagesState.pendingRequests, new Pair(str, copy$default)), false, null, 6)));
                return Unit.INSTANCE;
            }
        }
        realPendingMessagesStore$resolveTransaction$1 = new RealPendingMessagesStore$resolveTransaction$1(realPendingMessagesStore, continuationImpl);
        Object obj2 = realPendingMessagesStore$resolveTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPendingMessagesStore$resolveTransaction$1.label;
        if (i != 0) {
        }
        MessageBody.TransactionBody transactionBody2 = (MessageBody.TransactionBody) obj2;
        pendingRequest = (PendingRequest) ((MessagesState) stateFlowImpl.getValue()).pendingRequests.get(str);
        if (pendingRequest != null) {
        }
    }

    public final PendingMessage recordFailure(PendingMessage pendingMessage, int i, MessageStatus$Failed messageStatus$Failed, String str) {
        if (i != 0 || !pendingMessage.getStatus().equals(MessageStatus$Sending.INSTANCE)) {
            return pendingMessage;
        }
        TextKt.logSendMessageError(this.analytics, pendingMessage.getBody(), messageStatus$Failed, str);
        return PendingMessage.copy$default(pendingMessage, null, null, messageStatus$Failed, 7);
    }

    public final MessagesState sendMessage(String str, MessagesState messagesState, PendingMessage pendingMessage, boolean z, Conversation conversation, boolean z2) {
        String str2;
        String idempotenceToken = pendingMessage.getIdempotenceToken();
        Map plus = MapsKt__MapsKt.plus(messagesState.pendingRequests, new Pair(idempotenceToken, new PendingRequest(pendingMessage, 0, str)));
        MessageBody body = pendingMessage.getBody();
        Continuation continuation = null;
        TextKt.logSendMessage(this.analytics, str, body, conversation != null ? conversation.botStatus : null, messagesState.hasSuggestedReplies, z, z2);
        boolean z3 = body instanceof MessageBody.FileBody;
        CoroutineScope coroutineScope = this.scope;
        if (z3 && ((MessageBody.FileBody) body).getFileToken() == null) {
            str2 = str;
            JobKt.launch$default(coroutineScope, null, null, new TaxWebAppPresenter$models$1$1(this, idempotenceToken, pendingMessage, str, (Continuation) null, 6), 3);
        } else {
            str2 = str;
            if (body instanceof MessageBody.TransactionBody.Selected) {
                JobKt.launch$default(coroutineScope, null, null, new ArticlePresenter$models$1$1(this, idempotenceToken, body, continuation, 2), 3);
            }
        }
        return sendPendingMessages(MessagesState.copy$default(messagesState, plus, false, str2, 2));
    }

    public final MessagesState sendPendingMessages(MessagesState messagesState) {
        MessagesState messagesState2;
        Map map = messagesState.pendingRequests;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((PendingRequest) entry.getValue()).getMessage().getStatus().equals(MessageStatus$Sending.INSTANCE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            MessageBody body = ((PendingRequest) entry2.getValue()).getMessage().getBody();
            if ((body instanceof MessageBody.FileBody) && ((MessageBody.FileBody) body).getFileToken() == null) {
                break;
            }
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        Continuation continuation = null;
        if (linkedHashMap2.isEmpty()) {
            messagesState2 = messagesState;
        } else {
            messagesState2 = messagesState;
            JobKt.launch$default(this.scope, null, null, new ArticlePresenter$models$1$1(this, linkedHashMap2, messagesState2, continuation, 3), 3);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        for (Map.Entry entry3 : map.entrySet()) {
            Object key = entry3.getKey();
            String str = (String) entry3.getKey();
            PendingRequest pendingRequest = (PendingRequest) entry3.getValue();
            if (linkedHashMap2.containsKey(str)) {
                pendingRequest = PendingRequest.copy$default(pendingRequest, null, pendingRequest.getInFlightCount() + 1, 5);
            }
            linkedHashMap3.put(key, pendingRequest);
        }
        return MessagesState.copy$default(messagesState2, linkedHashMap3, false, null, 6);
    }
}
