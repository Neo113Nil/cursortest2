package com.withpersona.sdk2.inquiry.ui.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class UiAddressDetailsWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public NetworkCallResult.Success L$1;
    public int label;
    public final /* synthetic */ UiAddressDetailsWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiAddressDetailsWorker$run$1(UiAddressDetailsWorker uiAddressDetailsWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uiAddressDetailsWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UiAddressDetailsWorker$run$1 uiAddressDetailsWorker$run$1 = new UiAddressDetailsWorker$run$1(this.this$0, continuation);
        uiAddressDetailsWorker$run$1.L$0 = obj;
        return uiAddressDetailsWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UiAddressDetailsWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bb, code lost:
    
        if (r2.emit(r5, r16) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r2.emit(r4, r16) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r4 = r2;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r2.emit(r5, r16) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (r6 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object enqueueRetriableRequestWithRetry;
        NetworkCallResult networkCallResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            WebRtcWorker$run$1.AnonymousClass1 anonymousClass1 = new WebRtcWorker$run$1.AnonymousClass1(this.this$0, continuation, 16);
            this.L$0 = flowCollector;
            this.label = 1;
            enqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                NetworkCallResult networkCallResult2 = this.L$1;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                networkCallResult = networkCallResult2;
                flowCollector = flowCollector2;
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    UiAddressDetailsWorker.Response.Error error = new UiAddressDetailsWorker.Response.Error(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
                    this.L$0 = networkCallResult;
                    this.L$1 = null;
                    this.label = 4;
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
            enqueueRetriableRequestWithRetry = obj;
        }
        networkCallResult = (NetworkCallResult) enqueueRetriableRequestWithRetry;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            NetworkCallResult.Success success = (NetworkCallResult.Success) networkCallResult;
            AddressDetailsResponse addressDetailsResponse = (AddressDetailsResponse) success.getResponse();
            LocationData locationData = addressDetailsResponse != null ? addressDetailsResponse.attributes : null;
            if (locationData != null) {
                UiAddressDetailsWorker.Response.Success success2 = new UiAddressDetailsWorker.Response.Success(locationData);
                this.L$0 = flowCollector;
                this.L$1 = success;
                this.label = 2;
            } else {
                UiAddressDetailsWorker.Response.Error error2 = new UiAddressDetailsWorker.Response.Error(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body attributes to be non-null.", false, null, 8, null));
                this.L$0 = flowCollector;
                this.L$1 = success;
                this.label = 3;
            }
            networkCallResult = networkCallResult2;
            flowCollector = flowCollector2;
        }
        if (networkCallResult instanceof NetworkCallResult.Failure) {
        }
        return Unit.INSTANCE;
    }
}
