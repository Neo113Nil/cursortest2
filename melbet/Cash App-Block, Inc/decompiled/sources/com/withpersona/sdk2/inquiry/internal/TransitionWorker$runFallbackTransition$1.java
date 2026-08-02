package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import androidx.media3.common.util.StuckPlayerDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$Response;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class TransitionWorker$runFallbackTransition$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StuckPlayerDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionWorker$runFallbackTransition$1(StuckPlayerDetector stuckPlayerDetector, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stuckPlayerDetector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransitionWorker$runFallbackTransition$1 transitionWorker$runFallbackTransition$1 = new TransitionWorker$runFallbackTransition$1(this.this$0, continuation);
        transitionWorker$runFallbackTransition$1.L$0 = obj;
        return transitionWorker$runFallbackTransition$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TransitionWorker$runFallbackTransition$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b5, code lost:
    
        if (r1.emit(r2, r12) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c5, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r13 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            StuckPlayerDetector stuckPlayerDetector = this.this$0;
            TransitionWorker$TransitionData transitionWorker$TransitionData = (TransitionWorker$TransitionData) stuckPlayerDetector.period;
            UiComponent uiComponent = transitionWorker$TransitionData.fromComponent;
            Map map = transitionWorker$TransitionData.componentParams;
            String str = transitionWorker$TransitionData.fromStep;
            String str2 = (String) stuckPlayerDetector.callback;
            uiComponent.getClass();
            map.getClass();
            str.getClass();
            TransitionInquiryRequest.Data data = new TransitionInquiryRequest.Data(new TransitionInquiryRequest.Attributes(map));
            String name = uiComponent.getName();
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            TransitionInquiryRequest transitionInquiryRequest = new TransitionInquiryRequest(data, new TransitionInquiryRequest.Meta(name, str, str2));
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) stuckPlayerDetector.stuckPlayingNotEndingDetector;
            TipsFeatureFlag tipsFeatureFlag = TipsFeatureFlag.INSTANCE$1;
            featureFlagManager.getClass();
            ArrayList arrayList = transitionInquiryRequest;
            if (featureFlagManager.getValue(tipsFeatureFlag)) {
                arrayList = transitionInquiryRequest.toMultipartParts((String) stuckPlayerDetector.playerListener, ((Context) stuckPlayerDetector.stuckSuppressedDetector).getContentResolver());
            }
            FallbackModeManager fallbackModeManager = (FallbackModeManager) stuckPlayerDetector.stuckBufferingDetector;
            String str3 = (String) stuckPlayerDetector.player;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = ((RealFallbackModeManager) fallbackModeManager).transition(str3, arrayList, this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        Response response = (Response) obj;
        if (response.rawResponse.isSuccessful) {
            TransitionWorker$Response.Success success = new TransitionWorker$Response.Success(null);
            this.L$0 = null;
            this.label = 3;
        } else {
            TransitionWorker$Response.Error error = new TransitionWorker$Response.Error(NetworkUtilsKt.toErrorInfo(response));
            this.L$0 = null;
            this.label = 2;
        }
    }
}
