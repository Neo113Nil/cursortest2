package com.withpersona.sdk2.inquiry.document.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileDeleteWorker;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class DocumentFileDeleteWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public NetworkCallResult.Success L$1;
    public int label;
    public final /* synthetic */ DocumentFileDeleteWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentFileDeleteWorker$run$1(DocumentFileDeleteWorker documentFileDeleteWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = documentFileDeleteWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DocumentFileDeleteWorker$run$1 documentFileDeleteWorker$run$1 = new DocumentFileDeleteWorker$run$1(this.this$0, continuation);
        documentFileDeleteWorker$run$1.L$0 = obj;
        return documentFileDeleteWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentFileDeleteWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r1.emit(r5, r9) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        NetworkCallResult networkCallResult;
        FlowCollector flowCollector2;
        NetworkCallResult networkCallResult2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            WebRtcWorker$run$1.AnonymousClass1 anonymousClass1 = new WebRtcWorker$run$1.AnonymousClass1(this.this$0, continuation, 9);
            this.L$0 = flowCollector3;
            this.label = 1;
            Object enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
            if (enqueueRetriableRequestWithRetry != coroutineSingletons) {
                flowCollector = flowCollector3;
                obj = enqueueRetriableRequestWithRetry;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            networkCallResult2 = this.L$1;
            flowCollector2 = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
            networkCallResult = networkCallResult2;
            flowCollector = flowCollector2;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                DocumentFileDeleteWorker.Response.Error error = new DocumentFileDeleteWorker.Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                this.L$0 = networkCallResult;
                this.L$1 = null;
                this.label = 3;
            }
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        SafeTrace.throwOnFailure(obj);
        networkCallResult = (NetworkCallResult) obj;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            NetworkCallResult.Success success = (NetworkCallResult.Success) networkCallResult;
            success.getResponse();
            this.L$0 = flowCollector;
            this.L$1 = success;
            this.label = 2;
            if (flowCollector.emit(DocumentFileDeleteWorker.Response.Success.INSTANCE, this) != coroutineSingletons) {
                flowCollector2 = flowCollector;
                networkCallResult2 = networkCallResult;
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector2;
            }
            return coroutineSingletons;
        }
        if (networkCallResult instanceof NetworkCallResult.Failure) {
        }
        return Unit.INSTANCE;
    }
}
