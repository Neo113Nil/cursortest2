package com.withpersona.sdk2.inquiry.featureflag.network;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class FeatureFlagWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public NetworkCallResult.Success L$1;
    public int label;
    public final /* synthetic */ FeatureFlagWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFlagWorker$run$1(FeatureFlagWorker featureFlagWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = featureFlagWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FeatureFlagWorker$run$1 featureFlagWorker$run$1 = new FeatureFlagWorker$run$1(this.this$0, continuation);
        featureFlagWorker$run$1.L$0 = obj;
        return featureFlagWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FeatureFlagWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d5, code lost:
    
        if (r1.emit(r4, r13) == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3  */
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
            WebRtcWorker$run$1.AnonymousClass1 anonymousClass1 = new WebRtcWorker$run$1.AnonymousClass1(this.this$0, continuation, 13);
            this.L$0 = flowCollector3;
            this.label = 1;
            Object enqueueVerificationRequestWithRetry = NetworkUtilsKt.enqueueVerificationRequestWithRetry(anonymousClass1, this);
            if (enqueueVerificationRequestWithRetry != coroutineSingletons) {
                flowCollector = flowCollector3;
                obj = enqueueVerificationRequestWithRetry;
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
                ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                FeatureFlagWorker.Response.Error error = FeatureFlagWorker.Response.Error.INSTANCE;
                this.L$0 = networkCallResult;
                this.L$1 = null;
                this.label = 3;
            }
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        SafeTrace.throwOnFailure(obj);
        networkCallResult = (NetworkCallResult) obj;
        FeatureFlagWorker featureFlagWorker = this.this$0;
        if (networkCallResult instanceof NetworkCallResult.Success) {
            NetworkCallResult.Success success = (NetworkCallResult.Success) networkCallResult;
            FeatureFlagResponse featureFlagResponse = (FeatureFlagResponse) success.getResponse();
            FeatureFlagManager featureFlagManager = featureFlagWorker.featureFlagManager;
            featureFlagManager.getClass();
            if (featureFlagResponse != null) {
                List<FeatureFlagResponse.FeatureFlagDataResponse> list = featureFlagResponse.data;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (FeatureFlagResponse.FeatureFlagDataResponse featureFlagDataResponse : list) {
                    linkedHashMap.put(featureFlagDataResponse.id, Boolean.valueOf(featureFlagDataResponse.enabled));
                }
                featureFlagManager.cache = linkedHashMap;
                featureFlagManager.savedStateHandle.set(featureFlagManager.cache, "FeatureFlagManager.cache");
            }
            FeatureFlagWorker.Response.Success success2 = new FeatureFlagWorker.Response.Success(featureFlagResponse);
            this.L$0 = flowCollector;
            this.L$1 = success;
            this.label = 2;
            if (flowCollector.emit(success2, this) != coroutineSingletons) {
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
