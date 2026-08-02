package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class FallbackModeApiController$transition$result$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ RequestBody $body;
    public final /* synthetic */ ProductionEndpoint $endpoint;
    public final /* synthetic */ String $sessionToken;
    public int label;
    public final /* synthetic */ FallbackModeApiController this$0;

    /* renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ RequestBody $body;
        public final /* synthetic */ ProductionEndpoint $endpoint;
        public final /* synthetic */ String $sessionToken;
        public int label;
        public final /* synthetic */ FallbackModeApiController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FallbackModeApiController fallbackModeApiController, String str, ProductionEndpoint productionEndpoint, RequestBody requestBody, Continuation continuation) {
            super(1, continuation);
            this.this$0 = fallbackModeApiController;
            this.$sessionToken = str;
            this.$endpoint = productionEndpoint;
            this.$body = requestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$sessionToken, this.$endpoint, this.$body, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            FallbackModeApiController fallbackModeApiController = this.this$0;
            FallbackModeService fallbackModeService = fallbackModeApiController.service;
            int i2 = fallbackModeApiController.requestCount + 1;
            fallbackModeApiController.requestCount = i2;
            RequestBody requestBody = this.$body;
            long contentLength = requestBody.contentLength();
            MediaType contentType = requestBody.contentType();
            if (contentType == null || (str = contentType.mediaType) == null) {
                str = "application/json";
            }
            FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(contentLength, str);
            this.label = 1;
            Object acquireUploadUrl = fallbackModeService.acquireUploadUrl(this.$sessionToken, this.$endpoint, i2, uploadUrlRequest, this);
            return acquireUploadUrl == coroutineSingletons ? coroutineSingletons : acquireUploadUrl;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FallbackModeApiController$transition$result$1(FallbackModeApiController fallbackModeApiController, String str, ProductionEndpoint productionEndpoint, RequestBody requestBody, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fallbackModeApiController;
        this.$sessionToken = str;
        this.$endpoint = productionEndpoint;
        this.$body = requestBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FallbackModeApiController$transition$result$1(this.this$0, this.$sessionToken, this.$endpoint, this.$body, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FallbackModeApiController$transition$result$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$sessionToken, this.$endpoint, this.$body, null);
        this.label = 1;
        Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
        return enqueueRetriableRequestWithRetry == coroutineSingletons ? coroutineSingletons : enqueueRetriableRequestWithRetry;
    }
}
