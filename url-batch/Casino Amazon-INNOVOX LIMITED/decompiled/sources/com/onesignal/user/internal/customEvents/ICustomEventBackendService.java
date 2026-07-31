package com.onesignal.user.internal.customEvents;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.operations.ExecutionResponse;
import com.onesignal.user.internal.customEvents.impl.CustomEventMetadata;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ICustomEventBackendService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JV\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/onesignal/user/internal/customEvents/ICustomEventBackendService;", "", "sendCustomEvent", "Lcom/onesignal/core/internal/operations/ExecutionResponse;", "appId", "", "onesignalId", "externalId", "timestamp", "", "eventName", "eventProperties", "metadata", "Lcom/onesignal/user/internal/customEvents/impl/CustomEventMetadata;", "jwt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/onesignal/user/internal/customEvents/impl/CustomEventMetadata;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ICustomEventBackendService {
    Object sendCustomEvent(String str, String str2, String str3, long j, String str4, String str5, CustomEventMetadata customEventMetadata, String str6, Continuation<? super ExecutionResponse> continuation);

    /* compiled from: ICustomEventBackendService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object sendCustomEvent$default(ICustomEventBackendService iCustomEventBackendService, String str, String str2, String str3, long j, String str4, String str5, CustomEventMetadata customEventMetadata, String str6, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return iCustomEventBackendService.sendCustomEvent(str, str2, str3, j, str4, str5, customEventMetadata, (i & 128) != 0 ? null : str6, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCustomEvent");
        }
    }
}
