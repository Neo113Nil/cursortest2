package com.withpersona.sdk2.inquiry.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.WorkSource;
import androidx.activity.result.IntentSenderRequest;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.m1;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzda;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzo;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.math.MathUtils;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker$check$2$1;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt$$ExternalSyntheticLambda0;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.inline_inquiry.ScreenState;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker;
import com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationManager;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment;
import com.withpersona.sdk2.inquiry.launchers.ResolvableApiLauncherResult;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1$1;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.shared.di.BaseWorkflowFragment;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker;
import com.withpersona.sdk2.inquiry.sna.SnaClient$Response$Error;
import com.withpersona.sdk2.inquiry.sna.SnaErrorType;
import com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.o0;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$awaitResponse$2$2;

/* loaded from: classes9.dex */
public final class TransitionWorker$run$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransitionWorker$run$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                TransitionWorker$run$1 transitionWorker$run$1 = new TransitionWorker$run$1((StuckPlayerDetector) obj2, continuation, 0);
                transitionWorker$run$1.L$0 = obj;
                return transitionWorker$run$1;
            case 1:
                return new TransitionWorker$run$1((DocumentStepStateManager) this.L$0, (DocumentStepFragment) obj2, continuation, 1);
            case 2:
                TransitionWorker$run$1 transitionWorker$run$12 = new TransitionWorker$run$1((SafeFlow) obj2, continuation, 2);
                transitionWorker$run$12.L$0 = obj;
                return transitionWorker$run$12;
            case 3:
                TransitionWorker$run$1 transitionWorker$run$13 = new TransitionWorker$run$1((GovernmentIdHintWorker) obj2, continuation, 3);
                transitionWorker$run$13.L$0 = obj;
                return transitionWorker$run$13;
            case 4:
                return new TransitionWorker$run$1((GovernmentIdStepStateManager) this.L$0, (GovernmentIdStepFragment) obj2, continuation, 4);
            case 5:
                return new TransitionWorker$run$1((GovernmentIdStepStateManager) this.L$0, (GovernmentIdState) obj2, continuation, 5);
            case 6:
                return new TransitionWorker$run$1((GovernmentIdStepStateManager) this.L$0, (Screen) obj2, continuation, 6);
            case 7:
                return new TransitionWorker$run$1((GovernmentIdState.FinalizeLocalVideoCapture) this.L$0, (StatefulWorkflow.RenderContext) obj2, continuation, 7);
            case 8:
                return new TransitionWorker$run$1((IntegrationStepStateManager) this.L$0, (IntegrationStepFragment) obj2, continuation, 8);
            case 9:
                TransitionWorker$run$1 transitionWorker$run$14 = new TransitionWorker$run$1((CreateInquirySessionWorker) obj2, continuation, 9);
                transitionWorker$run$14.L$0 = obj;
                return transitionWorker$run$14;
            case 10:
                TransitionWorker$run$1 transitionWorker$run$15 = new TransitionWorker$run$1((CreateInquiryWorker) obj2, continuation, 10);
                transitionWorker$run$15.L$0 = obj;
                return transitionWorker$run$15;
            case 11:
                TransitionWorker$run$1 transitionWorker$run$16 = new TransitionWorker$run$1((ExchangeOneTimeCodeWorker) obj2, continuation, 11);
                transitionWorker$run$16.L$0 = obj;
                return transitionWorker$run$16;
            case 12:
                TransitionWorker$run$1 transitionWorker$run$17 = new TransitionWorker$run$1((RestoreUiStepStateWorker) obj2, continuation, 12);
                transitionWorker$run$17.L$0 = obj;
                return transitionWorker$run$17;
            case 13:
                return new TransitionWorker$run$1((SilentNetworkAuthenticationManager) this.L$0, (SilentNetworkAuthenticationManager.SnaParams) obj2, continuation, 13);
            case 14:
                TransitionWorker$run$1 transitionWorker$run$18 = new TransitionWorker$run$1((TransitionBackWorker) obj2, continuation, 14);
                transitionWorker$run$18.L$0 = obj;
                return transitionWorker$run$18;
            case 15:
                return new TransitionWorker$run$1((UiStepSavedStateHelper) this.L$0, (UiStepSavedStateHelper.UiStepUiComponentConfig) obj2, continuation, 15);
            case 16:
                TransitionWorker$run$1 transitionWorker$run$19 = new TransitionWorker$run$1((UpdateInquirySessionWorker) obj2, continuation, 16);
                transitionWorker$run$19.L$0 = obj;
                return transitionWorker$run$19;
            case 17:
                return new TransitionWorker$run$1((WorkflowStepFragment) this.L$0, (StateFlowImpl) obj2, continuation, 17);
            case 18:
                TransitionWorker$run$1 transitionWorker$run$110 = new TransitionWorker$run$1((DeviceFeatureRequestWorker) obj2, continuation, 18);
                transitionWorker$run$110.L$0 = obj;
                return transitionWorker$run$110;
            case 19:
                return new TransitionWorker$run$1((PermissionRequestStateManager) this.L$0, (PermissionRequestFragment) obj2, continuation, 19);
            case 20:
                return new TransitionWorker$run$1((OldCameraScreenRunner) this.L$0, (MathUtils) obj2, continuation, 20);
            case 21:
                return new TransitionWorker$run$1((CameraController) this.L$0, (CameraScreenRunner) obj2, continuation, 21);
            case 22:
                return new TransitionWorker$run$1((SelfieStepStateManager) this.L$0, (SelfieStepFragment) obj2, continuation, 22);
            case 23:
                return new TransitionWorker$run$1((SelfieState.FinalizeLocalVideoCapture) this.L$0, (StatefulWorkflow.RenderContext) obj2, continuation, 23);
            case 24:
                return new TransitionWorker$run$1((StateFlow) this.L$0, (BaseWorkflowFragment) obj2, continuation, 24);
            case 25:
                return new TransitionWorker$run$1((ExternalEventLogger) this.L$0, (InquiryEvent) obj2, continuation, 25);
            case 26:
                return new TransitionWorker$run$1((NavigationStateManager) this.L$0, (NavigationState) obj2, continuation, 26);
            case 27:
                return new TransitionWorker$run$1((String) this.L$0, (ThemeableLottieAnimationView) obj2, continuation, 27);
            case 28:
                TransitionWorker$run$1 transitionWorker$run$111 = new TransitionWorker$run$1((SilentNetworkAuthWorker) obj2, continuation, 28);
                transitionWorker$run$111.L$0 = obj;
                return transitionWorker$run$111;
            default:
                TransitionWorker$run$1 transitionWorker$run$112 = new TransitionWorker$run$1((MarkwonConfiguration) obj2, continuation, 29);
                transitionWorker$run$112.L$0 = obj;
                return transitionWorker$run$112;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 1:
                ((TransitionWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 3:
                ((TransitionWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 4:
                ((TransitionWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 8:
                ((TransitionWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 17:
                ((TransitionWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 19:
                ((TransitionWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 22:
                ((TransitionWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 24:
                ((TransitionWorker$run$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((TransitionWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x042f, code lost:
    
        if (r1.emit(r2, r38) == r0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d7, code lost:
    
        if (r3.emit(com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker.Output.Success.INSTANCE, r38) == r0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03f0, code lost:
    
        if (r3.emit(r37, r38) == r0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03c0, code lost:
    
        if (r1 == r0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x049d, code lost:
    
        if (r1.emit(r2, r38) == r0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0491, code lost:
    
        if (r2 == r0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x053b, code lost:
    
        if (r7.emit(r0, r38) == r6) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x052f, code lost:
    
        if (r0 == r6) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x05de, code lost:
    
        if (r1.emit(r3, r38) == r0) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x05ec, code lost:
    
        if (r1.emit(com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker.Output.Failure.INSTANCE, r38) == r0) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x05c9, code lost:
    
        if (r2 == r0) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r1.emit(r2, r38) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0631, code lost:
    
        if (r1.emit(r2, r38) == r0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0625, code lost:
    
        if (r2 == r0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0676, code lost:
    
        if (r1.emit(r2, r38) == r0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x066a, code lost:
    
        if (r2 == r0) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06bd, code lost:
    
        if (r1.emit(r2, r38) == r0) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x06b1, code lost:
    
        if (r2 == r0) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r1.emit(r2, r38) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0876, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r3, r38) == r0) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x088a, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r3, r38) == r0) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0111, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r2, r3, r38) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
    
        if (r1 == r0) goto L48;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object createInquirySession;
        FlowCollector flowCollector2;
        Object createInquiry;
        FlowCollector flowCollector3;
        Object exchangeOneTimeLinkCode;
        FlowCollector flowCollector4;
        Object withContext;
        FlowCollector flowCollector5;
        Object runTransitionBack;
        FlowCollector flowCollector6;
        Object updateInquiry;
        FlowCollector flowCollector7;
        DeviceFeatureRequestWorker.Output.NotSupported notSupported;
        Object result;
        DeviceFeatureRequestWorker.Output.NotSupported notSupported2;
        FlowCollector flowCollector8;
        Object obj2;
        Object runInterruptible;
        int i = this.$r8$classId;
        int i2 = 22;
        int i3 = 7;
        int i4 = 6;
        int i5 = 29;
        int i6 = 4;
        int i7 = 28;
        int i8 = 0;
        int i9 = 3;
        Object obj3 = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj3;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector9 = (FlowCollector) this.L$0;
                    if (!((RealFallbackModeManager) ((FallbackModeManager) stuckPlayerDetector.stuckBufferingDetector)).isFallbackModeActive()) {
                        SafeFlow safeFlow = new SafeFlow(new TransitionWorker$runTransition$1(stuckPlayerDetector, null));
                        this.label = 2;
                        break;
                    } else {
                        SafeFlow safeFlow2 = new SafeFlow(new TransitionWorker$runFallbackTransition$1(stuckPlayerDetector, null));
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DocumentStepStateManager documentStepStateManager = (DocumentStepStateManager) this.L$0;
                StateFlowImpl stateFlowImpl = (StateFlowImpl) documentStepStateManager.prev;
                TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass1 = new TakeUntil$collectSafely$2.AnonymousClass1(i5, (DocumentStepFragment) obj3, documentStepStateManager);
                this.label = 1;
                stateFlowImpl.collect(anonymousClass1, this);
                return coroutineSingletons2;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector10 = (FlowCollector) this.L$0;
                    Flow buffer$default = FlowKt.buffer$default((SafeFlow) obj3, -1, 2);
                    FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2 anonymousClass2 = new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector10, i7);
                    this.label = 1;
                    if (buffer$default.collect(anonymousClass2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector11 = (FlowCollector) this.L$0;
                    GovernmentIdHintWorker governmentIdHintWorker = (GovernmentIdHintWorker) obj3;
                    GovernmentIdFeed governmentIdFeed = governmentIdHintWorker.governmentIdFeed;
                    FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2 anonymousClass22 = new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector11, governmentIdHintWorker, i5);
                    this.label = 1;
                    if (governmentIdFeed.resultFlow.collect(anonymousClass22, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                GovernmentIdStepStateManager governmentIdStepStateManager = (GovernmentIdStepStateManager) this.L$0;
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) governmentIdStepStateManager.prev;
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass23 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(3, (GovernmentIdStepFragment) obj3, governmentIdStepStateManager);
                this.label = 1;
                stateFlowImpl2.collect(anonymousClass23, this);
                return coroutineSingletons5;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GovernmentIdStepStateManager governmentIdStepStateManager2 = (GovernmentIdStepStateManager) this.L$0;
                    this.label = 1;
                    if (GovernmentIdStepStateManager.access$handleState(governmentIdStepStateManager2, (GovernmentIdWorkflow.Input) ((StateFlowImpl) governmentIdStepStateManager2.firstChild).getValue(), (GovernmentIdState) obj3, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl3 = (StateFlowImpl) ((GovernmentIdStepStateManager) this.L$0).next;
                    this.label = 1;
                    stateFlowImpl3.getClass();
                    stateFlowImpl3.updateState(null, (Screen) obj3);
                    if (Unit.INSTANCE == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = ((GovernmentIdState.FinalizeLocalVideoCapture) this.L$0).minDurationMs;
                    this.label = 1;
                    if (JobKt.delay(j, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((StatefulWorkflow.RenderContext) obj3).$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(i5)));
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 != 0) {
                    if (i18 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                IntegrationStepStateManager integrationStepStateManager = (IntegrationStepStateManager) this.L$0;
                StateFlowImpl stateFlowImpl4 = (StateFlowImpl) integrationStepStateManager.prev;
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass24 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(4, (IntegrationStepFragment) obj3, integrationStepStateManager);
                this.label = 1;
                stateFlowImpl4.collect(anonymousClass24, this);
                return coroutineSingletons9;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    CreateInquirySessionWorker createInquirySessionWorker = (CreateInquirySessionWorker) obj3;
                    InquiryApiHelper inquiryApiHelper = createInquirySessionWorker.inquiryApiHelper;
                    String str = createInquirySessionWorker.inquiryId;
                    InquirySessionDataWrapper inquirySessionDataWrapper = createInquirySessionWorker.inquirySessionDataWrapper;
                    this.L$0 = flowCollector;
                    this.label = 1;
                    createInquirySession = inquiryApiHelper.createInquirySession(str, inquirySessionDataWrapper, this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    createInquirySession = obj;
                }
                this.L$0 = null;
                this.label = 2;
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector2 = (FlowCollector) this.L$0;
                    CreateInquiryWorker createInquiryWorker = (CreateInquiryWorker) obj3;
                    InquiryApiHelper inquiryApiHelper2 = createInquiryWorker.inquiryApiHelper;
                    InquiryAttributes inquiryAttributes = createInquiryWorker.attributes;
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    createInquiry = inquiryApiHelper2.createInquiry(inquiryAttributes, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector2 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    createInquiry = obj;
                }
                this.L$0 = null;
                this.label = 2;
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector3 = (FlowCollector) this.L$0;
                    ExchangeOneTimeCodeWorker exchangeOneTimeCodeWorker = (ExchangeOneTimeCodeWorker) obj3;
                    InquiryApiHelper inquiryApiHelper3 = exchangeOneTimeCodeWorker.inquiryApiHelper;
                    String str2 = exchangeOneTimeCodeWorker.oneTimeLinkCode;
                    this.L$0 = flowCollector3;
                    this.label = 1;
                    exchangeOneTimeLinkCode = inquiryApiHelper3.exchangeOneTimeLinkCode(str2, this);
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector3 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    exchangeOneTimeLinkCode = obj;
                }
                this.L$0 = null;
                this.label = 2;
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector4 = (FlowCollector) this.L$0;
                    RestoreUiStepStateWorker restoreUiStepStateWorker = (RestoreUiStepStateWorker) obj3;
                    UiStepSavedStateHelper uiStepSavedStateHelper = restoreUiStepStateWorker.uiStepSavedStateHelper;
                    String str3 = restoreUiStepStateWorker.sessionToken;
                    String str4 = restoreUiStepStateWorker.inquiryId;
                    String str5 = restoreUiStepStateWorker.stepName;
                    this.L$0 = flowCollector4;
                    this.label = 1;
                    uiStepSavedStateHelper.getClass();
                    withContext = JobKt.withContext(Dispatchers.Default, new WorkflowContextAdapter$updateState$1(uiStepSavedStateHelper, str3, str4, str5, null, 2), this);
                    break;
                } else {
                    if (i22 != 1) {
                        if (i22 == 2 || i22 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector4 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                List list = (List) withContext;
                if (list == null) {
                    this.L$0 = null;
                    this.label = 3;
                    break;
                } else {
                    RestoreUiStepStateWorker.Output.Success success = new RestoreUiStepStateWorker.Output.Success(list);
                    this.L$0 = null;
                    this.label = 2;
                    break;
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextSetter textSetter = ((SilentNetworkAuthenticationManager) this.L$0).orchestrator;
                    SilentNetworkAuthenticationManager.SnaParams snaParams = (SilentNetworkAuthenticationManager.SnaParams) obj3;
                    String str6 = snaParams.sessionToken;
                    String str7 = snaParams.checkUrl;
                    Integer num = snaParams.timeoutSeconds;
                    int intValue = num != null ? num.intValue() : 10;
                    this.label = 1;
                    if (textSetter.perform(str6, str7, intValue, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector5 = (FlowCollector) this.L$0;
                    TransitionBackWorker transitionBackWorker = (TransitionBackWorker) obj3;
                    InquiryApiHelper inquiryApiHelper4 = transitionBackWorker.inquiryApiHelper;
                    String str8 = transitionBackWorker.sessionToken;
                    String str9 = transitionBackWorker.inquiryId;
                    String str10 = transitionBackWorker.fromStep;
                    InquirySessionConfig inquirySessionConfig = transitionBackWorker.inquirySessionConfig;
                    this.L$0 = flowCollector5;
                    this.label = 1;
                    if (!inquiryApiHelper4.fallbackModeManager.isFallbackModeActive()) {
                        runTransitionBack = inquiryApiHelper4.runTransitionBack(str8, str9, str10, inquirySessionConfig, this);
                        break;
                    } else {
                        runTransitionBack = inquiryApiHelper4.runFallbackTransitionBack(str8, str10, this);
                        break;
                    }
                } else {
                    if (i24 != 1) {
                        if (i24 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    FlowCollector flowCollector12 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    flowCollector5 = flowCollector12;
                    runTransitionBack = obj;
                }
                this.L$0 = null;
                this.label = 2;
                break;
            case 15:
                UiStepSavedStateHelper uiStepSavedStateHelper2 = (UiStepSavedStateHelper) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                try {
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        File parentFile = uiStepSavedStateHelper2.configFile.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("data", (UiStepSavedStateHelper.UiStepUiComponentConfig) obj3);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        InquiryViewModel.AnonymousClass1 anonymousClass12 = new InquiryViewModel.AnonymousClass1(uiStepSavedStateHelper2, bundle, continuation, i2);
                        this.label = 1;
                        if (JobKt.withContext(defaultIoScheduler, anonymousClass12, this) == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector6 = (FlowCollector) this.L$0;
                    UpdateInquirySessionWorker updateInquirySessionWorker = (UpdateInquirySessionWorker) obj3;
                    InquiryApiHelper inquiryApiHelper5 = updateInquirySessionWorker.inquiryApiHelper;
                    String str11 = updateInquirySessionWorker.sessionToken;
                    InquirySessionConfig inquirySessionConfig2 = updateInquirySessionWorker.inquirySessionConfig;
                    this.L$0 = flowCollector6;
                    this.label = 1;
                    updateInquiry = inquiryApiHelper5.updateInquiry(str11, inquirySessionConfig2, this);
                    break;
                } else {
                    if (i26 != 1) {
                        if (i26 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    flowCollector6 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    updateInquiry = obj;
                }
                this.L$0 = null;
                this.label = 2;
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 != 0) {
                    if (i27 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl5 = ((WorkflowStepFragment) this.L$0).propsFlow;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass13 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1((StateFlowImpl) obj3, i7);
                this.label = 1;
                stateFlowImpl5.collect(anonymousClass13, this);
                return coroutineSingletons18;
            case 18:
                DeviceFeatureRequestWorker deviceFeatureRequestWorker = (DeviceFeatureRequestWorker) obj3;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                int i29 = 5;
                DeviceFeatureRequestWorker.Output.NotSupported notSupported3 = DeviceFeatureRequestWorker.Output.NotSupported.INSTANCE;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    flowCollector7 = (FlowCollector) this.L$0;
                    zzo.zza(100);
                    notSupported = notSupported3;
                    LocationRequest locationRequest = new LocationRequest(100, 10000L, Math.min(5000L, 10000L), Math.max(0L, 10000L), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.DECELERATION_RATE, true, 10000L, 0, 0, false, new WorkSource(null), null);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(locationRequest);
                    LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest(arrayList, true, false);
                    Context context = deviceFeatureRequestWorker.context;
                    int i30 = LocationServices.$r8$clinit;
                    zzda zzdaVar = new zzda(context, null, zzbi.zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
                    this.L$0 = flowCollector7;
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl.initCancellability();
                    zacn builder = zacn.builder();
                    builder.zaa = new m1(locationSettingsRequest, i2);
                    builder.zac = 2426;
                    zzw zae = zzdaVar.zae(0, builder.build());
                    zae.getClass();
                    zae.addOnSuccessListener(new o0(new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl, i3), 15));
                    zae.addOnFailureListener(new KotlinExtensions$awaitResponse$2$2(cancellableContinuationImpl, i29));
                    result = cancellableContinuationImpl.getResult();
                    break;
                } else if (i28 == 1) {
                    FlowCollector flowCollector13 = (FlowCollector) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    flowCollector7 = flowCollector13;
                    notSupported = notSupported3;
                    result = obj;
                } else {
                    if (i28 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i28 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i28 == 4) {
                        flowCollector8 = (FlowCollector) this.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        } catch (IntentSender.SendIntentException unused2) {
                            notSupported2 = notSupported3;
                            this.L$0 = null;
                            this.label = 5;
                            break;
                        }
                    } else {
                        if (i28 == 5) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                Object obj4 = ((Result) result).value;
                if (!(obj4 instanceof Result.Failure)) {
                    this.L$0 = null;
                    this.label = 2;
                    break;
                } else {
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj4);
                    if (!(m4120exceptionOrNullimpl instanceof ResolvableApiException)) {
                        this.L$0 = null;
                        this.label = 3;
                        break;
                    } else {
                        notSupported2 = notSupported;
                        try {
                            PendingIntent pendingIntent = ((ResolvableApiException) m4120exceptionOrNullimpl).mStatus.zzc;
                            pendingIntent.getClass();
                            IntentSender intentSender = pendingIntent.getIntentSender();
                            intentSender.getClass();
                            deviceFeatureRequestWorker.resolvableApiLauncher.launch(new IntentSenderRequest(intentSender, null, 0, 0));
                            ResolvableApiLauncherResult resolvableApiLauncherResult = new ResolvableApiLauncherResult();
                            DeviceFeatureRequestWorker$run$1$1 deviceFeatureRequestWorker$run$1$1 = new DeviceFeatureRequestWorker$run$1$1(flowCollector7, i8);
                            this.L$0 = flowCollector7;
                            this.label = 4;
                            resolvableApiLauncherResult.collect(deviceFeatureRequestWorker$run$1$1, this);
                        } catch (IntentSender.SendIntentException unused3) {
                            flowCollector8 = flowCollector7;
                            this.L$0 = null;
                            this.label = 5;
                        }
                    }
                }
                return coroutineSingletons19;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 != 0) {
                    if (i31 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                PermissionRequestStateManager permissionRequestStateManager = (PermissionRequestStateManager) this.L$0;
                StateFlowImpl stateFlowImpl6 = (StateFlowImpl) permissionRequestStateManager.prev;
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass25 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(i4, permissionRequestStateManager, (PermissionRequestFragment) obj3);
                this.label = 1;
                stateFlowImpl6.collect(anonymousClass25, this);
                return coroutineSingletons20;
            case 20:
                MathUtils mathUtils = (MathUtils) obj3;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CameraController cameraController = ((OldCameraScreenRunner) this.L$0).cameraController;
                    this.label = 1;
                    Object mo4085takePictureIoAF18A = cameraController.mo4085takePictureIoAF18A(this);
                    if (mo4085takePictureIoAF18A == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                    obj2 = mo4085takePictureIoAF18A;
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    obj2 = ((Result) obj).value;
                }
                Result.Companion companion = Result.Companion;
                if (!(obj2 instanceof Result.Failure)) {
                    Function1 function1 = ((SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture) mathUtils).processImage;
                    String absolutePath = ((File) obj2).getAbsolutePath();
                    absolutePath.getClass();
                    function1.invoke(absolutePath);
                }
                Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(obj2);
                if (m4120exceptionOrNullimpl2 != null) {
                    ((SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture) mathUtils).onError.invoke(m4120exceptionOrNullimpl2);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl cameraState = ((CameraController) this.L$0).getCameraState();
                    cameraState.getClass();
                    SafeFlow safeFlow3 = new SafeFlow(new FlowKt__LimitKt$transformWhile$1(cameraState, new CachedPagingDataKt$cachedIn$2(i9, continuation, i3), continuation, i8));
                    FlowKt__CollectionKt$toCollection$2 flowKt__CollectionKt$toCollection$2 = new FlowKt__CollectionKt$toCollection$2((CameraScreenRunner) obj3, i6);
                    this.label = 1;
                    if (safeFlow3.collect(flowKt__CollectionKt$toCollection$2, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 != 0) {
                    if (i34 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) this.L$0;
                StateFlowImpl stateFlowImpl7 = (StateFlowImpl) selfieStepStateManager.prev;
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass26 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(8, (SelfieStepFragment) obj3, selfieStepStateManager);
                this.label = 1;
                stateFlowImpl7.collect(anonymousClass26, this);
                return coroutineSingletons23;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j2 = ((SelfieState.FinalizeLocalVideoCapture) this.L$0).minDurationMs;
                    this.label = 1;
                    if (JobKt.delay(j2, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((StatefulWorkflow.RenderContext) obj3).$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(i7)));
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow stateFlow = (StateFlow) this.L$0;
                    FlowKt__CollectionKt$toCollection$2 flowKt__CollectionKt$toCollection$22 = new FlowKt__CollectionKt$toCollection$2((BaseWorkflowFragment) obj3, i4);
                    this.label = 1;
                    if (stateFlow.collect(flowKt__CollectionKt$toCollection$22, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((ExternalEventLogger) this.L$0).externalInquiryController.eventFlow.emit((InquiryEvent) obj3, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl8 = ((NavigationStateManager) this.L$0).externalInquiryController.screenStateFlow;
                    NavigationState navigationState = (NavigationState) obj3;
                    ScreenState screenState = new ScreenState(navigationState.showBackButton, navigationState.showCancelButton, navigationState.isNavigationEnabled, navigationState.showHelpButton);
                    this.label = 1;
                    stateFlowImpl8.getClass();
                    stateFlowImpl8.updateState(null, screenState);
                    if (Unit.INSTANCE == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
                    PromotionsTitleBarKt$$ExternalSyntheticLambda0 promotionsTitleBarKt$$ExternalSyntheticLambda0 = new PromotionsTitleBarKt$$ExternalSyntheticLambda0((String) this.L$0, 2);
                    this.label = 1;
                    runInterruptible = InterruptibleKt.runInterruptible(defaultIoScheduler2, promotionsTitleBarKt$$ExternalSyntheticLambda0, this);
                    break;
                } else {
                    if (i39 != 1) {
                        if (i39 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    runInterruptible = obj;
                }
                String str12 = (String) runInterruptible;
                if (str12 != null) {
                    DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                    InquiryViewModel.AnonymousClass1 anonymousClass14 = new InquiryViewModel.AnonymousClass1((ThemeableLottieAnimationView) obj3, str12, continuation, i7);
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 28:
                SilentNetworkAuthWorker silentNetworkAuthWorker = (SilentNetworkAuthWorker) obj3;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector14 = (FlowCollector) this.L$0;
                    SnaErrorType[] snaErrorTypeArr = SnaErrorType.$VALUES;
                    SnaClient$Response$Error snaClient$Response$Error = new SnaClient$Response$Error("integration_error", "Silent Network Authentication implementation is not available. Please ensure sna-impl module is included.");
                    this.label = 1;
                    break;
                } else {
                    if (i40 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i40 == 2) {
                        FlowCollector flowCollector15 = (FlowCollector) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        SnaClient$Response$Error snaClient$Response$Error2 = (SnaClient$Response$Error) obj;
                        if (snaClient$Response$Error2 == null) {
                            SnaErrorType[] snaErrorTypeArr2 = SnaErrorType.$VALUES;
                            snaClient$Response$Error2 = new SnaClient$Response$Error("timeout_error", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(silentNetworkAuthWorker.timeoutSeconds, "SNA timed out after ", "s"));
                        }
                        this.L$0 = null;
                        this.label = 3;
                        break;
                    } else {
                        if (i40 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            default:
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) obj3;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector16 = (FlowCollector) this.L$0;
                    ChannelFlowBuilder merge = FlowKt.merge(((TextControllerImpl) markwonConfiguration.syntaxHighlight).onTextChanged, ((TextControllerImpl) markwonConfiguration.linkResolver).onTextChanged, ((TextControllerImpl) markwonConfiguration.imageDestinationProcessor).onTextChanged);
                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass27 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(9, flowCollector16, markwonConfiguration);
                    this.label = 1;
                    if (merge.collect(anonymousClass27, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i41 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransitionWorker$run$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
