package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import androidx.media3.common.util.StuckPlayerDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$Response;
import com.withpersona.sdk2.inquiry.internal.network.ConversionsKt;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class TransitionWorker$runTransition$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public Response L$1;
    public int label;
    public final /* synthetic */ StuckPlayerDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionWorker$runTransition$1(StuckPlayerDetector stuckPlayerDetector, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stuckPlayerDetector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransitionWorker$runTransition$1 transitionWorker$runTransition$1 = new TransitionWorker$runTransition$1(this.this$0, continuation);
        transitionWorker$runTransition$1.L$0 = obj;
        return transitionWorker$runTransition$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TransitionWorker$runTransition$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x013f, code lost:
    
        if (r5.emit(r2, r16) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        if (r5.emit(r1, r16) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        if (r6 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c6, code lost:
    
        if (r2 == r4) goto L51;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object transition;
        Object transitionMultipart;
        Response response;
        StuckPlayerDetector stuckPlayerDetector = this.this$0;
        String str = (String) stuckPlayerDetector.playerListener;
        String str2 = (String) stuckPlayerDetector.player;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            TransitionWorker$TransitionData transitionWorker$TransitionData = (TransitionWorker$TransitionData) stuckPlayerDetector.period;
            UiComponent uiComponent = transitionWorker$TransitionData.fromComponent;
            Map map = transitionWorker$TransitionData.componentParams;
            String str3 = transitionWorker$TransitionData.fromStep;
            String str4 = (String) stuckPlayerDetector.callback;
            uiComponent.getClass();
            map.getClass();
            str3.getClass();
            TransitionInquiryRequest.Data data = new TransitionInquiryRequest.Data(new TransitionInquiryRequest.Attributes(map));
            String name = uiComponent.getName();
            if (str4 == null || str4.length() <= 0) {
                str4 = null;
            }
            TransitionInquiryRequest transitionInquiryRequest = new TransitionInquiryRequest(data, new TransitionInquiryRequest.Meta(name, str3, str4));
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) stuckPlayerDetector.stuckPlayingNotEndingDetector;
            TipsFeatureFlag tipsFeatureFlag = TipsFeatureFlag.INSTANCE$1;
            featureFlagManager.getClass();
            boolean value = featureFlagManager.getValue(tipsFeatureFlag);
            InquiryService inquiryService = (InquiryService) stuckPlayerDetector.handler;
            if (value) {
                ArrayList multipartParts = transitionInquiryRequest.toMultipartParts(str, ((Context) stuckPlayerDetector.stuckSuppressedDetector).getContentResolver());
                this.L$0 = flowCollector;
                this.label = 1;
                transitionMultipart = inquiryService.transitionMultipart(str2, str, multipartParts, this);
            } else {
                this.L$0 = flowCollector;
                this.label = 2;
                transition = inquiryService.transition(str2, str, transitionInquiryRequest, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
            flowCollector = flowCollector2;
            transitionMultipart = obj;
            response = (Response) transitionMultipart;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        response = this.L$1;
                        flowCollector = (FlowCollector) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        Object obj2 = response.body;
                        if (obj2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) obj2;
                        TransitionWorker$Response.Success success = new TransitionWorker$Response.Success(checkInquiryResponse.getData().getAttributes().getWaitForTransitionConfig().getPollingMode() == CheckInquiryResponse.PollingMode.None ? ConversionsKt.toInquiryState(checkInquiryResponse, str2, (InquirySessionConfig) stuckPlayerDetector.clock) : null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 5;
                    } else if (i != 5) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            SafeTrace.throwOnFailure(obj);
            flowCollector = flowCollector3;
            transition = obj;
            response = (Response) transition;
        }
        if (response.rawResponse.isSuccessful) {
            UiStepSavedStateHelper uiStepSavedStateHelper = (UiStepSavedStateHelper) stuckPlayerDetector.stuckPlayingDetector;
            this.L$0 = flowCollector;
            this.L$1 = response;
            this.label = 4;
            uiStepSavedStateHelper.getClass();
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            Object withContext = JobKt.withContext(MainDispatcherLoader.dispatcher, new CameraHelper$unbind$2(uiStepSavedStateHelper, continuation, 28), this);
            if (withContext != coroutineSingletons) {
                withContext = Unit.INSTANCE;
            }
        } else {
            TransitionWorker$Response.Error error = new TransitionWorker$Response.Error(NetworkUtilsKt.toErrorInfo(response));
            this.L$0 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
