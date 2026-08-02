package com.withpersona.sdk2.inquiry.selfie.state;

import android.content.Context;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import androidx.lifecycle.SavedStateHandle;
import androidx.paging.Pager$pageFetcher$2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.material.math.MathUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.CameraState;
import com.withpersona.sdk2.inquiry.selfie.CaptureState;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.SelfieHintPose;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$Selfie;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.SelfiePage;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfiePoseType;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridgeKt;
import com.withpersona.sdk2.inquiry.workflows.TimerWorker;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import org.commonmark.node.Node;

/* loaded from: classes9.dex */
public final class SelfieStepStateManager extends Node {
    public final Context applicationContext;
    public final Camera2Controller_Factory_Impl camera2ControllerFactory;
    public final CameraXController_Factory_Impl cameraXControllerFactory;
    public final ExternalEventLogger externalEventLogger;
    public final NavigationStateManager navigationStateManager;
    public final PermissionRequestWorker_Factory_Impl permissionRequestWorkerFactory;
    public KClass previousStateClass;
    public final SelfieAnalyzeWorker_Factory_Impl selfieAnalyzeWorker;
    public final SubmitVerificationWorker_Factory_Impl submitVerificationWorker;
    public final TrackingEventsLogger trackingEventsLogger;
    public final WebRtcWorker.Factory webRtcWorkerFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelfieStepStateManager(SelfieWorkflow.Input input, SavedStateHandle savedStateHandle, Context context, SubmitVerificationWorker_Factory_Impl submitVerificationWorker_Factory_Impl, WebRtcWorker.Factory factory, SelfieAnalyzeWorker_Factory_Impl selfieAnalyzeWorker_Factory_Impl, PermissionRequestWorker_Factory_Impl permissionRequestWorker_Factory_Impl, CameraXController_Factory_Impl cameraXController_Factory_Impl, Camera2Controller_Factory_Impl camera2Controller_Factory_Impl, RealCameraStatsManager realCameraStatsManager, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger, TrackingEventsLogger trackingEventsLogger) {
        super(input, savedStateHandle);
        Class<?> cls;
        input.getClass();
        savedStateHandle.getClass();
        context.getClass();
        submitVerificationWorker_Factory_Impl.getClass();
        factory.getClass();
        selfieAnalyzeWorker_Factory_Impl.getClass();
        permissionRequestWorker_Factory_Impl.getClass();
        cameraXController_Factory_Impl.getClass();
        camera2Controller_Factory_Impl.getClass();
        realCameraStatsManager.getClass();
        navigationStateManager.getClass();
        externalEventLogger.getClass();
        trackingEventsLogger.getClass();
        this.applicationContext = context;
        this.submitVerificationWorker = submitVerificationWorker_Factory_Impl;
        this.webRtcWorkerFactory = factory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker_Factory_Impl;
        this.permissionRequestWorkerFactory = permissionRequestWorker_Factory_Impl;
        this.cameraXControllerFactory = cameraXController_Factory_Impl;
        this.camera2ControllerFactory = camera2Controller_Factory_Impl;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        Lazy lazy = WebRtcManagerBridgeKt.webRtcWrapperExists$delegate;
        SelfieState selfieState = null;
        Object[] objArr = 0;
        try {
            cls = Class.forName("com.withpersona.sdk2.inquiry.webrtc.impl.WebRtcManager");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            cls.newInstance();
        }
        if (((SubtreeManager) this.lastChild).getState() == null) {
            SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
            SelfieWorkflow.Input input2 = (SelfieWorkflow.Input) ((StateFlowImpl) this.firstChild).getValue();
            input2.getClass();
            subtreeManager.updateState(input2.skipPromptPage ? new SelfieState.WaitForCameraFeed(selfieState, input2.orderedPoses, input2.poseConfigs, CameraProperties.FacingMode.User) : new SelfieState.ShowInstructions());
        }
        SubtreeManager subtreeManager2 = (SubtreeManager) this.lastChild;
        SelfieStepStateManager$$ExternalSyntheticLambda1 selfieStepStateManager$$ExternalSyntheticLambda1 = new SelfieStepStateManager$$ExternalSyntheticLambda1(this, 5);
        subtreeManager2.children = selfieStepStateManager$$ExternalSyntheticLambda1;
        selfieStepStateManager$$ExternalSyntheticLambda1.invoke(subtreeManager2.getState());
        JobKt.launch$default((ContextScope) this.parent, Dispatchers.Unconfined, null, new HazeSourceNode$launchPreDraw$1(this, objArr == true ? 1 : 0, 24), 2);
    }

    public final BlurEffectKt$$ExternalSyntheticLambda1 getCameraErrorHandler$selfie_release(SubtreeManager subtreeManager) {
        subtreeManager.getClass();
        return new BlurEffectKt$$ExternalSyntheticLambda1(2, subtreeManager, this);
    }

    public final void goBack$selfie_release(SubtreeManager subtreeManager) {
        subtreeManager.getClass();
        SelfieState selfieState = (SelfieState) subtreeManager.getState();
        SelfieState backState$selfie_release = selfieState != null ? selfieState.getBackState$selfie_release() : null;
        if (backState$selfie_release != null) {
            subtreeManager.updateState(backState$selfie_release);
        } else if (((SelfieWorkflow.Input) ((StateFlowImpl) this.firstChild).getValue()).backStepEnabled) {
            setOutput(SelfieWorkflow.Output.Back.INSTANCE);
        } else {
            setOutput(SelfieWorkflow.Output.Canceled.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x094a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x084d  */
    /* JADX WARN: Type inference failed for: r15v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleState(final SelfieWorkflow.Input input, SelfieState selfieState) {
        SelfieWorkflow.Screen submittingScreen;
        SelfieWorkflow.Screen createCameraScreen$default;
        boolean z;
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay;
        SelfieState.FlashState flashState;
        SelfieState.FlashState flashState2;
        String str;
        String str2;
        int ordinal;
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay2;
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay3;
        final SelfieWorkflow.Input input2;
        final SelfieStepStateManager selfieStepStateManager;
        SelfieState.FlashState flashState3;
        String str3;
        Continuation continuation;
        ?? r4;
        int i;
        MathUtils selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture;
        SelfieState.FlashState flashState4;
        SelfieState.FlashState flashState5;
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay4;
        Continuation continuation2;
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay5;
        SelfieHintPose selfieHintPose;
        String str4;
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay6;
        Context context;
        RemoteImage selfiePictograph;
        RemoteImage remoteImage;
        final SelfieStepStateManager selfieStepStateManager2 = this;
        SubtreeManager subtreeManager = (SubtreeManager) selfieStepStateManager2.lastChild;
        input.getClass();
        selfieState.getClass();
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(selfieState.getClass());
        int i2 = 0;
        Continuation continuation3 = null;
        if (!SelfieWorkflowUtilsKt.useCamera(selfieState)) {
            subtreeManager.runningSideEffect("close_camera", new SelfieStepStateManager$handleState$1(selfieStepStateManager2, continuation3, i2));
        }
        VideoCaptureConfig videoCaptureConfig = input.videoCaptureConfig;
        NextStep.Selfie.AssetConfig assetConfig = input.assetConfig;
        SelfieType selfieType = input.selfieType;
        SelfieWorkflow.Input.Strings strings = input.strings;
        Context context2 = selfieStepStateManager2.applicationContext;
        Serializable m4101isVideo0E7RQCE = videoCaptureConfig.m4101isVideo0E7RQCE(context2);
        if (Result.m4120exceptionOrNullimpl(m4101isVideo0E7RQCE) == null) {
        } else {
            subtreeManager.runningSideEffect("output_webrtc_error", new Pager$pageFetcher$2(selfieStepStateManager2, null, 15));
        }
        boolean z2 = selfieState instanceof SelfieState.Submit;
        NavigationStateManager navigationStateManager = selfieStepStateManager2.navigationStateManager;
        NavigationStateManager.setState$default(navigationStateManager, input.backStepEnabled, input.cancelButtonEnabled, !z2, 8);
        SelfiePage selfiePage = MaterialAttributes.toSelfiePage(selfieState);
        selfieStepStateManager2.externalEventLogger.logPageChange(new InquiryPage$Selfie(input.fromStep, selfiePage));
        if (!Intrinsics.areEqual(selfieStepStateManager2.previousStateClass, orCreateKotlinClass)) {
            TrackingEventsLogger.DefaultImpls.logInquiryPageViewEvent$default(selfieStepStateManager2.trackingEventsLogger, input.fromStep, selfiePage.toString(), false, 4, null);
            selfieStepStateManager2.previousStateClass = orCreateKotlinClass;
        }
        boolean z3 = selfieState instanceof SelfieState.ShowInstructions;
        int i3 = 18;
        SelfieType.ConfigurablePoses configurablePoses = SelfieType.ConfigurablePoses.INSTANCE;
        if (z3) {
            SelfieState.ShowInstructions showInstructions = (SelfieState.ShowInstructions) selfieState;
            String str5 = strings.title;
            String str6 = strings.prompt;
            String str7 = strings.disclosure;
            String str8 = strings.startButton;
            NavigationState navigationState = navigationStateManager.getNavigationState();
            if (Intrinsics.areEqual(selfieType, SelfieType.CenterOnly.INSTANCE)) {
                NextStep.Selfie.AssetConfig.PromptPage promptPage = assetConfig.getPromptPage();
                if (promptPage != null) {
                    selfiePictograph = promptPage.getSelfieCenterPictograph();
                    remoteImage = selfiePictograph;
                }
                remoteImage = null;
            } else {
                if (!Intrinsics.areEqual(selfieType, SelfieType.ThreePhotos.INSTANCE) && !Intrinsics.areEqual(selfieType, configurablePoses)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                NextStep.Selfie.AssetConfig.PromptPage promptPage2 = assetConfig.getPromptPage();
                if (promptPage2 != null) {
                    selfiePictograph = promptPage2.getSelfiePictograph();
                    remoteImage = selfiePictograph;
                }
                remoteImage = null;
            }
            final int i4 = 22;
            final int i5 = 23;
            createCameraScreen$default = new SelfieWorkflow.Screen.InstructionsScreen(str5, str6, str7, str8, input.styles, remoteImage, navigationState, input.selfieType, input.orderedPoses, new UiScreenRunner$$ExternalSyntheticLambda29(i3, selfieStepStateManager2, input, showInstructions), new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                public final /* synthetic */ SelfieStepStateManager f$0;

                {
                    this.f$0 = selfieStepStateManager2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = i4;
                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                    switch (i6) {
                        case 0:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 1:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 2:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 3:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 4:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 5:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 6:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 7:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 8:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 9:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 10:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 11:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 12:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 13:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 14:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 15:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 16:
                            SubtreeManager subtreeManager2 = (SubtreeManager) selfieStepStateManager3.lastChild;
                            WorkflowState state = subtreeManager2.getState();
                            SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                            SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                            if (selfieState2 != null) {
                                subtreeManager2.updateState(selfieState2);
                            }
                            break;
                        case 17:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 18:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 19:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 20:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 21:
                            selfieStepStateManager3.setOutput(canceled);
                            break;
                        case 22:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 23:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 24:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 25:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 26:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 27:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 28:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        default:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                public final /* synthetic */ SelfieStepStateManager f$0;

                {
                    this.f$0 = selfieStepStateManager2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = i5;
                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                    switch (i6) {
                        case 0:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 1:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 2:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 3:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 4:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 5:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 6:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 7:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 8:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 9:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 10:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 11:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 12:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 13:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 14:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 15:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 16:
                            SubtreeManager subtreeManager2 = (SubtreeManager) selfieStepStateManager3.lastChild;
                            WorkflowState state = subtreeManager2.getState();
                            SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                            SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                            if (selfieState2 != null) {
                                subtreeManager2.updateState(selfieState2);
                            }
                            break;
                        case 17:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 18:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 19:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 20:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 21:
                            selfieStepStateManager3.setOutput(canceled);
                            break;
                        case 22:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 23:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 24:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 25:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 26:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        case 27:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                        case 28:
                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                            break;
                        default:
                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        } else {
            final int i6 = 9;
            final int i7 = 4;
            int i8 = 2;
            if (selfieState instanceof SelfieState.WaitForWebRtcSetup) {
                SelfieState.WaitForWebRtcSetup waitForWebRtcSetup = (SelfieState.WaitForWebRtcSetup) selfieState;
                subtreeManager.runningWorker(new WebRtcWorker(selfieStepStateManager2.webRtcWorkerFactory.service, videoCaptureConfig.webRtcJwt), new HCaptcha$$ExternalSyntheticLambda1(waitForWebRtcSetup, selfieStepStateManager2, input));
                SubtreeManager subtreeManager2 = (SubtreeManager) selfieStepStateManager2.lastChild;
                String str9 = strings.capturePageTitle;
                SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay7 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR;
                long j = videoCaptureConfig.maxRecordingLengthMs;
                Intrinsics.areEqual(selfieType, configurablePoses);
                final int i9 = 10;
                createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager2, waitForWebRtcSetup.getCurrentPose(), str9, null, null, false, new SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup(j), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input), input.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                    public final /* synthetic */ SelfieStepStateManager f$0;

                    {
                        this.f$0 = selfieStepStateManager2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i6;
                        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                        switch (i62) {
                            case 0:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 1:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 2:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 3:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 4:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 5:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 6:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 7:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 8:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 9:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 10:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 11:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 12:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 13:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 14:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 15:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 16:
                                SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                WorkflowState state = subtreeManager22.getState();
                                SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                if (selfieState2 != null) {
                                    subtreeManager22.updateState(selfieState2);
                                }
                                break;
                            case 17:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 18:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 19:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 20:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 21:
                                selfieStepStateManager3.setOutput(canceled);
                                break;
                            case 22:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 23:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 24:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 25:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 26:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 27:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 28:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            default:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                    public final /* synthetic */ SelfieStepStateManager f$0;

                    {
                        this.f$0 = selfieStepStateManager2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i9;
                        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                        switch (i62) {
                            case 0:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 1:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 2:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 3:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 4:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 5:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 6:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 7:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 8:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 9:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 10:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 11:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 12:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 13:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 14:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 15:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 16:
                                SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                WorkflowState state = subtreeManager22.getState();
                                SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                if (selfieState2 != null) {
                                    subtreeManager22.updateState(selfieState2);
                                }
                                break;
                            case 17:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 18:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 19:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 20:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 21:
                                selfieStepStateManager3.setOutput(canceled);
                                break;
                            case 22:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 23:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 24:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 25:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 26:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 27:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 28:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            default:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, new BlurEffectKt$$ExternalSyntheticLambda1(i8, subtreeManager, selfieStepStateManager2), new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                    public final /* synthetic */ SelfieStepStateManager f$0;

                    {
                        this.f$0 = selfieStepStateManager2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i10 = i7;
                        SelfieWorkflow.Input input3 = input;
                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                        switch (i10) {
                            case 0:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 1:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 2:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 3:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 4:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 5:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 6:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 7:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 8:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 9:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            default:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, videoCaptureMethod(input), videoCaptureConfig.recordAudio, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, waitForWebRtcSetup.cameraFacingMode, waitForWebRtcSetup.isFlashEnabled, false, false, false, 251658240);
            } else {
                int i10 = 1;
                if (!(selfieState instanceof SelfieState.WaitForCameraFeed)) {
                    final int i11 = 19;
                    if (selfieState instanceof SelfieState.RestartCamera) {
                        submittingScreen = new SelfieWorkflow.Screen.RestartCameraScreen(new UiScreenRunner$$ExternalSyntheticLambda29(i11, selfieStepStateManager2, input, (SelfieState.RestartCamera) selfieState));
                        selfieStepStateManager2 = selfieStepStateManager2;
                    } else {
                        if (selfieState instanceof SelfieState.ShowPoseHint) {
                            SelfieState.ShowPoseHint showPoseHint = (SelfieState.ShowPoseHint) selfieState;
                            int ordinal2 = ((Selfie.Pose) CollectionsKt.first(showPoseHint.posesNeeded)).ordinal();
                            if (ordinal2 == 0) {
                                a$$ExternalSyntheticBUOutline0.m$1("Pose hint cannot be shown for center pose");
                                return;
                            }
                            if (ordinal2 == 1) {
                                selfieHintPose = SelfieHintPose.Left;
                            } else {
                                if (ordinal2 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                selfieHintPose = SelfieHintPose.Right;
                            }
                            int ordinal3 = selfieHintPose.ordinal();
                            if (ordinal3 == 0) {
                                str4 = strings.selfieHintPoseNotCentered;
                            } else if (ordinal3 == 1) {
                                str4 = strings.selfieHintLookLeft;
                            } else {
                                if (ordinal3 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                str4 = strings.selfieHintLookRight;
                            }
                            SubtreeManager subtreeManager3 = (SubtreeManager) selfieStepStateManager2.lastChild;
                            String str10 = strings.capturePageTitle;
                            int ordinal4 = selfieHintPose.ordinal();
                            if (ordinal4 == 0) {
                                overlay6 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER;
                            } else if (ordinal4 == 1) {
                                overlay6 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT_HINT;
                            } else {
                                if (ordinal4 != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                overlay6 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT_HINT;
                            }
                            SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint selfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint = new SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint(new UiScreenRunner$$ExternalSyntheticLambda29(15, selfieStepStateManager2, showPoseHint, input), overlay6, !Intrinsics.areEqual(selfieType, configurablePoses));
                            boolean z4 = input.requireStrictSelfieCapture;
                            NavigationState navigationState2 = navigationStateManager.getNavigationState();
                            BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release = selfieStepStateManager2.getCameraErrorHandler$selfie_release(subtreeManager);
                            VideoCaptureMethod videoCaptureMethod = videoCaptureMethod(input);
                            SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                            boolean z5 = videoCaptureConfig.recordAudio;
                            String str11 = str4;
                            boolean z6 = showPoseHint.autoCaptureSupported;
                            Selfie.Pose currentPose = showPoseHint.getCurrentPose();
                            CameraProperties.FacingMode facingMode = showPoseHint.cameraFacingMode;
                            boolean z7 = showPoseHint.isFlashEnabled;
                            Function0 function0 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                public final /* synthetic */ SelfieStepStateManager f$0;

                                {
                                    this.f$0 = selfieStepStateManager2;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i62 = i11;
                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                    switch (i62) {
                                        case 0:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 1:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 2:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 3:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 4:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 5:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 6:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 7:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 8:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 9:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 10:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 11:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 12:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 13:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 14:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 15:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 16:
                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                            WorkflowState state = subtreeManager22.getState();
                                            SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                            SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                            if (selfieState2 != null) {
                                                subtreeManager22.updateState(selfieState2);
                                            }
                                            break;
                                        case 17:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 18:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 19:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 20:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 21:
                                            selfieStepStateManager3.setOutput(canceled);
                                            break;
                                        case 22:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 23:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 24:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 25:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 26:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 27:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 28:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        default:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            final int i12 = 20;
                            final int i13 = 8;
                            createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager3, currentPose, str10, str11, null, z6, selfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint, makeCameraScreenAssetOverrides, z4, navigationState2, function0, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                public final /* synthetic */ SelfieStepStateManager f$0;

                                {
                                    this.f$0 = selfieStepStateManager2;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i62 = i12;
                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                    switch (i62) {
                                        case 0:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 1:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 2:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 3:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 4:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 5:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 6:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 7:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 8:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 9:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 10:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 11:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 12:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 13:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 14:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 15:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 16:
                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                            WorkflowState state = subtreeManager22.getState();
                                            SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                            SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                            if (selfieState2 != null) {
                                                subtreeManager22.updateState(selfieState2);
                                            }
                                            break;
                                        case 17:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 18:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 19:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 20:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 21:
                                            selfieStepStateManager3.setOutput(canceled);
                                            break;
                                        case 22:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 23:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 24:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 25:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 26:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        case 27:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                        case 28:
                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                            break;
                                        default:
                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, cameraErrorHandler$selfie_release, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                public final /* synthetic */ SelfieStepStateManager f$0;

                                {
                                    this.f$0 = selfieStepStateManager2;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i102 = i13;
                                    SelfieWorkflow.Input input3 = input;
                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                    switch (i102) {
                                        case 0:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 1:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 2:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 3:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 4:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 5:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 6:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 7:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 8:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        case 9:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                        default:
                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, videoCaptureMethod, z5, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, facingMode, z7, false, false, false, 251658240);
                        } else {
                            selfieStepStateManager2 = selfieStepStateManager2;
                            boolean z8 = selfieState instanceof SelfieState.StartCapture;
                            int i14 = 26;
                            SelfieAnalyzeWorker_Factory_Impl selfieAnalyzeWorker_Factory_Impl = selfieStepStateManager2.selfieAnalyzeWorker;
                            if (z8) {
                                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) selfieState;
                                if (MaterialColors.getCurrentPoseConfig(startCapture).autoCaptureEnabled) {
                                    subtreeManager.runningWorker(selfieAnalyzeWorker_Factory_Impl.create((Selfie.Pose) CollectionsKt.first(startCapture.getPosesNeeded()), false), new SelfieWorkflow$$ExternalSyntheticLambda38(i14, selfieStepStateManager2, startCapture, input));
                                }
                                Selfie.Pose pose = (Selfie.Pose) CollectionsKt.first(startCapture.getPosesNeeded());
                                boolean manualCaptureEnabled = DateStrings.getManualCaptureEnabled(startCapture);
                                if (manualCaptureEnabled) {
                                    continuation2 = null;
                                } else {
                                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                                    ref$BooleanRef.element = true;
                                    continuation2 = null;
                                    subtreeManager.runningSideEffect("check_if_manual_capture_enabled", new ResetViewModel.AnonymousClass1(ref$BooleanRef, selfieStepStateManager2, continuation2, 7));
                                }
                                int ordinal5 = pose.ordinal();
                                if (ordinal5 == 0) {
                                    overlay5 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER;
                                } else if (ordinal5 == 1) {
                                    overlay5 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT;
                                } else {
                                    if (ordinal5 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    }
                                    overlay5 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT;
                                }
                                SelfieError selfieError = startCapture.selfieError;
                                Object hintMessage = selfieError != null ? SelfieUtilsKt.toHintMessage(selfieError, strings, (Selfie.Pose) CollectionsKt.first(startCapture.getPosesNeeded())) : continuation2;
                                String str12 = hintMessage == null ? strings.selfieHintTakePhoto : hintMessage;
                                SubtreeManager subtreeManager4 = (SubtreeManager) selfieStepStateManager2.lastChild;
                                String str13 = strings.capturePageTitle;
                                MathUtils selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown = manualCaptureEnabled ? isVideoCapture(input) ? new SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown(new UiScreenRunner$$ExternalSyntheticLambda29(14, selfieStepStateManager2, startCapture, input), overlay5, !Intrinsics.areEqual(selfieType, configurablePoses)) : new SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture(new SelfieWorkflow$$ExternalSyntheticLambda38(27, pose, selfieStepStateManager2, startCapture), new SelfieStepStateManager$$ExternalSyntheticLambda1(selfieStepStateManager2, 2), false, overlay5, !Intrinsics.areEqual(selfieType, configurablePoses)) : new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(overlay5, !Intrinsics.areEqual(selfieType, configurablePoses));
                                boolean z9 = input.requireStrictSelfieCapture;
                                NavigationState navigationState3 = navigationStateManager.getNavigationState();
                                BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release2 = selfieStepStateManager2.getCameraErrorHandler$selfie_release(subtreeManager);
                                VideoCaptureMethod videoCaptureMethod2 = videoCaptureMethod(input);
                                SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides2 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                                boolean z10 = videoCaptureConfig.recordAudio;
                                ?? r15 = hintMessage;
                                boolean z11 = startCapture.autoCaptureSupported;
                                Selfie.Pose pose2 = (Selfie.Pose) CollectionsKt.first(startCapture.getPosesNeeded());
                                float f = startCapture.poseScore;
                                MathUtils mathUtils = selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown;
                                SelfieBrightnessInfo selfieBrightnessInfo = startCapture.brightnessInfo;
                                CameraProperties.FacingMode facingMode2 = startCapture.cameraFacingMode;
                                boolean z12 = startCapture.isFlashEnabled;
                                final int i15 = 13;
                                Function0 function02 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                    public final /* synthetic */ SelfieStepStateManager f$0;

                                    {
                                        this.f$0 = selfieStepStateManager2;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i62 = i15;
                                        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                        switch (i62) {
                                            case 0:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 1:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 2:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 3:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 4:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 5:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 6:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 7:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 8:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 9:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 10:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 11:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 12:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 13:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 14:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 15:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 16:
                                                SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                WorkflowState state = subtreeManager22.getState();
                                                SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                if (selfieState2 != null) {
                                                    subtreeManager22.updateState(selfieState2);
                                                }
                                                break;
                                            case 17:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 18:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 19:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 20:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 21:
                                                selfieStepStateManager3.setOutput(canceled);
                                                break;
                                            case 22:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 23:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 24:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 25:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 26:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 27:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 28:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            default:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                final int i16 = 14;
                                Function0 function03 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                    public final /* synthetic */ SelfieStepStateManager f$0;

                                    {
                                        this.f$0 = selfieStepStateManager2;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i62 = i16;
                                        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                        switch (i62) {
                                            case 0:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 1:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 2:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 3:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 4:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 5:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 6:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 7:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 8:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 9:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 10:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 11:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 12:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 13:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 14:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 15:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 16:
                                                SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                WorkflowState state = subtreeManager22.getState();
                                                SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                if (selfieState2 != null) {
                                                    subtreeManager22.updateState(selfieState2);
                                                }
                                                break;
                                            case 17:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 18:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 19:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 20:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 21:
                                                selfieStepStateManager3.setOutput(canceled);
                                                break;
                                            case 22:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 23:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 24:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 25:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 26:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            case 27:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                            case 28:
                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                break;
                                            default:
                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                final int i17 = 6;
                                createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager4, pose2, str13, str12, r15, z11, mathUtils, makeCameraScreenAssetOverrides2, z9, navigationState3, function02, function03, cameraErrorHandler$selfie_release2, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                    public final /* synthetic */ SelfieStepStateManager f$0;

                                    {
                                        this.f$0 = selfieStepStateManager2;
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i102 = i17;
                                        SelfieWorkflow.Input input3 = input;
                                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                        switch (i102) {
                                            case 0:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 1:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 2:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 3:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 4:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 5:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 6:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 7:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 8:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            case 9:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                            default:
                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, videoCaptureMethod2, z10, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, f, selfieBrightnessInfo, facingMode2, z12, false, false, false, 251658240);
                            } else {
                                Continuation continuation4 = null;
                                int i18 = 28;
                                if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                                    SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) selfieState;
                                    if (MaterialColors.getCurrentPoseConfig(startCaptureFaceDetected).autoCaptureEnabled) {
                                        subtreeManager.runningWorker(selfieAnalyzeWorker_Factory_Impl.create(startCaptureFaceDetected.getCurrentPose(), false), new SelfieWorkflow$$ExternalSyntheticLambda38(i18, selfieStepStateManager2, startCaptureFaceDetected, input));
                                    }
                                    subtreeManager.runningWorker(new TimerWorker(1000L), new BlurEffectKt$$ExternalSyntheticLambda1(i10, selfieStepStateManager2, input));
                                    SubtreeManager subtreeManager5 = (SubtreeManager) selfieStepStateManager2.lastChild;
                                    String str14 = strings.capturePageTitle;
                                    String str15 = strings.selfieHintHoldStill;
                                    SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture2 = new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER, !Intrinsics.areEqual(selfieType, configurablePoses));
                                    boolean z13 = input.requireStrictSelfieCapture;
                                    NavigationState navigationState4 = navigationStateManager.getNavigationState();
                                    BlurEffectKt$$ExternalSyntheticLambda1 blurEffectKt$$ExternalSyntheticLambda1 = new BlurEffectKt$$ExternalSyntheticLambda1(2, subtreeManager, selfieStepStateManager2);
                                    VideoCaptureMethod videoCaptureMethod3 = videoCaptureMethod(input);
                                    SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides3 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                                    boolean z14 = videoCaptureConfig.recordAudio;
                                    boolean z15 = startCaptureFaceDetected.autoCaptureSupported;
                                    Selfie.Pose currentPose2 = startCaptureFaceDetected.getCurrentPose();
                                    float f2 = startCaptureFaceDetected.poseScore;
                                    SelfieBrightnessInfo selfieBrightnessInfo2 = startCaptureFaceDetected.brightnessInfo;
                                    CameraProperties.FacingMode facingMode3 = startCaptureFaceDetected.cameraFacingMode;
                                    boolean z16 = startCaptureFaceDetected.isFlashEnabled;
                                    final int i19 = 26;
                                    Function0 function04 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                        public final /* synthetic */ SelfieStepStateManager f$0;

                                        {
                                            this.f$0 = selfieStepStateManager2;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i62 = i19;
                                            SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                            SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                            switch (i62) {
                                                case 0:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 1:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 2:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 3:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 4:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 5:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 6:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 7:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 8:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 9:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 10:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 11:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 12:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 13:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 14:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 15:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 16:
                                                    SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                    WorkflowState state = subtreeManager22.getState();
                                                    SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                    SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                    if (selfieState2 != null) {
                                                        subtreeManager22.updateState(selfieState2);
                                                    }
                                                    break;
                                                case 17:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 18:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 19:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 20:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 21:
                                                    selfieStepStateManager3.setOutput(canceled);
                                                    break;
                                                case 22:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 23:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 24:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 25:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 26:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 27:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 28:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                default:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    final int i20 = 27;
                                    Function0 function05 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                        public final /* synthetic */ SelfieStepStateManager f$0;

                                        {
                                            this.f$0 = selfieStepStateManager2;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i62 = i20;
                                            SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                            SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                            switch (i62) {
                                                case 0:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 1:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 2:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 3:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 4:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 5:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 6:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 7:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 8:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 9:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 10:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 11:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 12:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 13:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 14:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 15:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 16:
                                                    SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                    WorkflowState state = subtreeManager22.getState();
                                                    SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                    SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                    if (selfieState2 != null) {
                                                        subtreeManager22.updateState(selfieState2);
                                                    }
                                                    break;
                                                case 17:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 18:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 19:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 20:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 21:
                                                    selfieStepStateManager3.setOutput(canceled);
                                                    break;
                                                case 22:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 23:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 24:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 25:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 26:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                case 27:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                                case 28:
                                                    selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                    break;
                                                default:
                                                    selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    final int i21 = 9;
                                    createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager5, currentPose2, str14, str15, str15, z15, selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture2, makeCameraScreenAssetOverrides3, z13, navigationState4, function04, function05, blurEffectKt$$ExternalSyntheticLambda1, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                        public final /* synthetic */ SelfieStepStateManager f$0;

                                        {
                                            this.f$0 = selfieStepStateManager2;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i102 = i21;
                                            SelfieWorkflow.Input input3 = input;
                                            SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                            switch (i102) {
                                                case 0:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 1:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 2:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 3:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 4:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 5:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 6:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 7:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 8:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                case 9:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                                default:
                                                    MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, videoCaptureMethod3, z14, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, f2, selfieBrightnessInfo2, facingMode3, z16, false, false, false, 251658240);
                                } else {
                                    int i22 = 25;
                                    if (selfieState instanceof SelfieState.CountdownToCapture) {
                                        SelfieState.CountdownToCapture countdownToCapture = (SelfieState.CountdownToCapture) selfieState;
                                        int i23 = countdownToCapture.countDown;
                                        if (MaterialColors.getCurrentPoseConfig(countdownToCapture).autoCaptureEnabled) {
                                            subtreeManager.runningWorker(selfieAnalyzeWorker_Factory_Impl.create(countdownToCapture.getCurrentPose(), false), new SelfieWorkflow$$ExternalSyntheticLambda38(i22, selfieStepStateManager2, countdownToCapture, input));
                                        }
                                        subtreeManager.runningSideEffect(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i23, "countdown_"), new SelfieStepStateManager$renderCountdownToCapture$2(input, selfieStepStateManager2, countdownToCapture, null));
                                        SelfieError selfieError2 = countdownToCapture.selfieError;
                                        String hintMessage2 = selfieError2 != null ? SelfieUtilsKt.toHintMessage(selfieError2, strings, countdownToCapture.getCurrentPose()) : null;
                                        String str16 = hintMessage2 == null ? strings.selfieHintCenterFace : hintMessage2;
                                        SubtreeManager subtreeManager6 = (SubtreeManager) selfieStepStateManager2.lastChild;
                                        String str17 = hintMessage2;
                                        String str18 = strings.capturePageTitle;
                                        SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown = new SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown(i23, SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER, !Intrinsics.areEqual(selfieType, configurablePoses));
                                        boolean z17 = input.requireStrictSelfieCapture;
                                        NavigationState navigationState5 = navigationStateManager.getNavigationState();
                                        BlurEffectKt$$ExternalSyntheticLambda1 blurEffectKt$$ExternalSyntheticLambda12 = new BlurEffectKt$$ExternalSyntheticLambda1(2, subtreeManager, selfieStepStateManager2);
                                        VideoCaptureMethod videoCaptureMethod4 = videoCaptureMethod(input);
                                        SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides4 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                                        boolean z18 = videoCaptureConfig.recordAudio;
                                        String str19 = str16;
                                        boolean z19 = countdownToCapture.autoCaptureSupported;
                                        Selfie.Pose currentPose3 = countdownToCapture.getCurrentPose();
                                        float f3 = countdownToCapture.poseScore;
                                        SelfieBrightnessInfo selfieBrightnessInfo3 = countdownToCapture.brightnessInfo;
                                        CameraProperties.FacingMode facingMode4 = countdownToCapture.cameraFacingMode;
                                        boolean z20 = countdownToCapture.isFlashEnabled;
                                        final int i24 = 7;
                                        Function0 function06 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager2;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i62 = i24;
                                                SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i62) {
                                                    case 0:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 1:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 2:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 3:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 4:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 5:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 6:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 7:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 8:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 9:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 10:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 11:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 12:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 13:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 14:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 15:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 16:
                                                        SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                        WorkflowState state = subtreeManager22.getState();
                                                        SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                        SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                        if (selfieState2 != null) {
                                                            subtreeManager22.updateState(selfieState2);
                                                        }
                                                        break;
                                                    case 17:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 18:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 19:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 20:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 21:
                                                        selfieStepStateManager3.setOutput(canceled);
                                                        break;
                                                    case 22:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 23:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 24:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 25:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 26:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 27:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 28:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    default:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final int i25 = 8;
                                        Function0 function07 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager2;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i62 = i25;
                                                SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i62) {
                                                    case 0:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 1:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 2:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 3:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 4:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 5:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 6:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 7:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 8:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 9:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 10:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 11:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 12:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 13:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 14:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 15:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 16:
                                                        SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                        WorkflowState state = subtreeManager22.getState();
                                                        SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                        SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                        if (selfieState2 != null) {
                                                            subtreeManager22.updateState(selfieState2);
                                                        }
                                                        break;
                                                    case 17:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 18:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 19:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 20:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 21:
                                                        selfieStepStateManager3.setOutput(canceled);
                                                        break;
                                                    case 22:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 23:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 24:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 25:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 26:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 27:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 28:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    default:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final int i26 = 3;
                                        createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager6, currentPose3, str18, str19, str17, z19, selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown, makeCameraScreenAssetOverrides4, z17, navigationState5, function06, function07, blurEffectKt$$ExternalSyntheticLambda12, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager2;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i102 = i26;
                                                SelfieWorkflow.Input input3 = input;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i102) {
                                                    case 0:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 1:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 2:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 3:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 4:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 5:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 6:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 7:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 8:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 9:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    default:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, videoCaptureMethod4, z18, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, f3, selfieBrightnessInfo3, facingMode4, z20, false, false, false, 251658240);
                                    } else if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                                        SelfieState.CountdownToManualCapture countdownToManualCapture = (SelfieState.CountdownToManualCapture) selfieState;
                                        List list = countdownToManualCapture.posesNeeded;
                                        int i27 = countdownToManualCapture.countDown;
                                        Selfie.Pose pose3 = (Selfie.Pose) CollectionsKt.first(list);
                                        int ordinal6 = pose3.ordinal();
                                        if (ordinal6 == 0) {
                                            overlay4 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER;
                                        } else if (ordinal6 == 1) {
                                            overlay4 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT;
                                        } else {
                                            if (ordinal6 != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return;
                                            }
                                            overlay4 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT;
                                        }
                                        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay8 = overlay4;
                                        subtreeManager.runningSideEffect(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i27, "countdown_to_manual_capture_"), new SelfieStepStateManager$handleState$1(selfieStepStateManager2, continuation4, 3));
                                        SelfieError selfieError3 = countdownToManualCapture.selfieError;
                                        String hintMessage3 = selfieError3 != null ? SelfieUtilsKt.toHintMessage(selfieError3, strings, (Selfie.Pose) CollectionsKt.first(countdownToManualCapture.getPosesNeeded())) : null;
                                        String str20 = hintMessage3 == null ? strings.selfieHintCenterFace : hintMessage3;
                                        SubtreeManager subtreeManager7 = (SubtreeManager) selfieStepStateManager2.lastChild;
                                        String str21 = strings.capturePageTitle;
                                        MathUtils selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture = i27 == 0 ? new SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture(new SelfieWorkflow$$ExternalSyntheticLambda38(29, pose3, selfieStepStateManager2, countdownToManualCapture), new SelfieStepStateManager$$ExternalSyntheticLambda1(selfieStepStateManager2, 4), true, overlay8, !Intrinsics.areEqual(selfieType, configurablePoses)) : new SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown(i27, overlay8, !Intrinsics.areEqual(selfieType, configurablePoses));
                                        boolean z21 = input.requireStrictSelfieCapture;
                                        NavigationState navigationState6 = navigationStateManager.getNavigationState();
                                        BlurEffectKt$$ExternalSyntheticLambda1 blurEffectKt$$ExternalSyntheticLambda13 = new BlurEffectKt$$ExternalSyntheticLambda1(2, subtreeManager, selfieStepStateManager2);
                                        VideoCaptureMethod videoCaptureMethod5 = videoCaptureMethod(input);
                                        SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides5 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                                        boolean z22 = videoCaptureConfig.recordAudio;
                                        String str22 = hintMessage3;
                                        boolean z23 = countdownToManualCapture.autoCaptureSupported;
                                        Selfie.Pose pose4 = (Selfie.Pose) CollectionsKt.first(countdownToManualCapture.getPosesNeeded());
                                        CameraProperties.FacingMode facingMode5 = countdownToManualCapture.cameraFacingMode;
                                        boolean z24 = countdownToManualCapture.isFlashEnabled;
                                        final int i28 = 28;
                                        Function0 function08 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager2;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i62 = i28;
                                                SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i62) {
                                                    case 0:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 1:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 2:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 3:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 4:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 5:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 6:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 7:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 8:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 9:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 10:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 11:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 12:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 13:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 14:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 15:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 16:
                                                        SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                        WorkflowState state = subtreeManager22.getState();
                                                        SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                        SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                        if (selfieState2 != null) {
                                                            subtreeManager22.updateState(selfieState2);
                                                        }
                                                        break;
                                                    case 17:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 18:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 19:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 20:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 21:
                                                        selfieStepStateManager3.setOutput(canceled);
                                                        break;
                                                    case 22:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 23:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 24:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 25:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 26:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 27:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 28:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    default:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final int i29 = 29;
                                        Function0 function09 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager2;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i62 = i29;
                                                SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i62) {
                                                    case 0:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 1:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 2:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 3:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 4:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 5:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 6:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 7:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 8:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 9:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 10:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 11:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 12:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 13:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 14:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 15:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 16:
                                                        SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                        WorkflowState state = subtreeManager22.getState();
                                                        SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                        SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                        if (selfieState2 != null) {
                                                            subtreeManager22.updateState(selfieState2);
                                                        }
                                                        break;
                                                    case 17:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 18:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 19:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 20:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 21:
                                                        selfieStepStateManager3.setOutput(canceled);
                                                        break;
                                                    case 22:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 23:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 24:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 25:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 26:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 27:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 28:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    default:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final int i30 = 10;
                                        createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager7, pose4, str21, str20, str22, z23, selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture, makeCameraScreenAssetOverrides5, z21, navigationState6, function08, function09, blurEffectKt$$ExternalSyntheticLambda13, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager2;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i102 = i30;
                                                SelfieWorkflow.Input input3 = input;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i102) {
                                                    case 0:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 1:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 2:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 3:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 4:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 5:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 6:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 7:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 8:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 9:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    default:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, videoCaptureMethod5, z22, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, facingMode5, z24, false, false, false, 251658240);
                                    } else if (selfieState instanceof SelfieState.Capture) {
                                        SelfieState.Capture capture = (SelfieState.Capture) selfieState;
                                        SelfieError selfieError4 = capture.selfieError;
                                        SelfieState.FlashState flashState6 = capture.flashState;
                                        Selfie.Pose pose5 = (Selfie.Pose) CollectionsKt.first(capture.getPosesNeeded());
                                        if (!capture.isFlashEnabled) {
                                            flashState = SelfieState.FlashState.Disabled;
                                        } else if (flashState6 == SelfieState.FlashState.Disabled) {
                                            flashState = SelfieState.FlashState.Enabled;
                                        } else {
                                            flashState2 = flashState6;
                                            if (MaterialColors.getCurrentPoseConfig(capture).autoCaptureEnabled) {
                                                subtreeManager.runningWorker(selfieAnalyzeWorker_Factory_Impl.create(pose5, flashState2 == SelfieState.FlashState.Disabled || flashState2 == SelfieState.FlashState.ReadyToCapture), new HCaptcha$$ExternalSyntheticLambda1(28, selfieStepStateManager2, capture));
                                            }
                                            String hintMessage4 = selfieError4 == null ? SelfieUtilsKt.toHintMessage(selfieError4, strings, (Selfie.Pose) CollectionsKt.first(capture.getPosesNeeded())) : null;
                                            if (pose5 != Selfie.Pose.Left) {
                                                str2 = strings.selfieHintLookLeft;
                                            } else if (pose5 == Selfie.Pose.Right) {
                                                str2 = strings.selfieHintLookRight;
                                            } else {
                                                if (selfieError4 != null) {
                                                    str = hintMessage4;
                                                } else if (pose5 == Selfie.Pose.Center) {
                                                    str2 = strings.selfieHintCenterFace;
                                                } else {
                                                    str = null;
                                                }
                                                ordinal = pose5.ordinal();
                                                if (ordinal == 0) {
                                                    overlay2 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER;
                                                } else if (ordinal == 1) {
                                                    overlay2 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT;
                                                } else {
                                                    if (ordinal != 2) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return;
                                                    }
                                                    overlay2 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT;
                                                }
                                                overlay3 = overlay2;
                                                if (DateStrings.getManualCaptureEnabled(capture) || flashState2 == SelfieState.FlashState.FlashOn || flashState2 == SelfieState.FlashState.ReadyToCapture) {
                                                    input2 = input;
                                                    selfieStepStateManager = selfieStepStateManager2;
                                                    flashState3 = flashState6;
                                                    str3 = hintMessage4;
                                                    continuation = null;
                                                    r4 = 1;
                                                    i = 7;
                                                    selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture = new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(overlay3, !Intrinsics.areEqual(selfieType, configurablePoses));
                                                } else {
                                                    input2 = input;
                                                    flashState3 = flashState6;
                                                    str3 = hintMessage4;
                                                    continuation = null;
                                                    i = 7;
                                                    selfieStepStateManager = selfieStepStateManager2;
                                                    r4 = 1;
                                                    selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture = new SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture(new SelfieWorkflow$$ExternalSyntheticLambda38(pose5, selfieStepStateManager2, capture, false, 24), new SelfieStepStateManager$$ExternalSyntheticLambda1(selfieStepStateManager, true ? 1 : 0), false, overlay3, !Intrinsics.areEqual(selfieType, configurablePoses));
                                                }
                                                if (!DateStrings.getManualCaptureEnabled(capture)) {
                                                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                                                    ref$BooleanRef2.element = r4;
                                                    subtreeManager.runningSideEffect("check_if_manual_capture_enabled", new ResetViewModel.AnonymousClass1(ref$BooleanRef2, selfieStepStateManager, continuation, i));
                                                }
                                                flashState4 = SelfieState.FlashState.FlashOn;
                                                if (flashState2 == flashState4) {
                                                    subtreeManager.runningSideEffect("wait_to_capture_with_flash_on", new SelfieStepStateManager$handleState$1(selfieStepStateManager, continuation, r4));
                                                }
                                                flashState5 = SelfieState.FlashState.ReadyToCapture;
                                                if (flashState2 == flashState5) {
                                                    subtreeManager.runningSideEffect("turn_off_flash", new SelfieStepStateManager$handleState$1(selfieStepStateManager, continuation, 2));
                                                }
                                                VideoCaptureMethod videoCaptureMethod6 = videoCaptureMethod(input);
                                                SubtreeManager subtreeManager8 = (SubtreeManager) selfieStepStateManager.lastChild;
                                                String str23 = strings.capturePageTitle;
                                                boolean z25 = input2.requireStrictSelfieCapture;
                                                NavigationState navigationState7 = navigationStateManager.getNavigationState();
                                                BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release3 = selfieStepStateManager.getCameraErrorHandler$selfie_release(subtreeManager);
                                                SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides6 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input2);
                                                boolean z26 = videoCaptureConfig.recordAudio;
                                                boolean z27 = capture.autoCaptureSupported;
                                                Selfie.Pose pose6 = (Selfie.Pose) CollectionsKt.first(capture.getPosesNeeded());
                                                float f4 = capture.poseScore;
                                                SelfieBrightnessInfo selfieBrightnessInfo4 = capture.brightnessInfo;
                                                CameraProperties.FacingMode facingMode6 = capture.cameraFacingMode;
                                                boolean z28 = capture.isFlashEnabled;
                                                SelfieState.FlashState flashState7 = flashState3;
                                                boolean z29 = flashState7 != flashState4 || flashState7 == flashState5;
                                                boolean z30 = videoCaptureMethod(input) == VideoCaptureMethod.Upload;
                                                final int i31 = 3;
                                                Function0 function010 = new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                    public final /* synthetic */ SelfieStepStateManager f$0;

                                                    {
                                                        this.f$0 = selfieStepStateManager;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i62 = i31;
                                                        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                        switch (i62) {
                                                            case 0:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 1:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 2:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 3:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 4:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 5:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 6:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 7:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 8:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 9:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 10:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 11:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 12:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 13:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 14:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 15:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 16:
                                                                SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                                WorkflowState state = subtreeManager22.getState();
                                                                SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                                SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                                if (selfieState2 != null) {
                                                                    subtreeManager22.updateState(selfieState2);
                                                                }
                                                                break;
                                                            case 17:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 18:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 19:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 20:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 21:
                                                                selfieStepStateManager3.setOutput(canceled);
                                                                break;
                                                            case 22:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 23:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 24:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 25:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 26:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 27:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 28:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            default:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                final int i32 = 4;
                                                Function0 function011 = new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                    public final /* synthetic */ SelfieStepStateManager f$0;

                                                    {
                                                        this.f$0 = selfieStepStateManager;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i62 = i32;
                                                        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                        switch (i62) {
                                                            case 0:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 1:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 2:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 3:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 4:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 5:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 6:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 7:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 8:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 9:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 10:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 11:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 12:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 13:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 14:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 15:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 16:
                                                                SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                                WorkflowState state = subtreeManager22.getState();
                                                                SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                                SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                                if (selfieState2 != null) {
                                                                    subtreeManager22.updateState(selfieState2);
                                                                }
                                                                break;
                                                            case 17:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 18:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 19:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 20:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 21:
                                                                selfieStepStateManager3.setOutput(canceled);
                                                                break;
                                                            case 22:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 23:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 24:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 25:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 26:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            case 27:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                            case 28:
                                                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                                break;
                                                            default:
                                                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                };
                                                final int i33 = 1;
                                                createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input2, subtreeManager8, pose6, str23, str, str3, z27, selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture, makeCameraScreenAssetOverrides6, z25, navigationState7, function010, function011, cameraErrorHandler$selfie_release3, new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                                    public final /* synthetic */ SelfieStepStateManager f$0;

                                                    {
                                                        this.f$0 = selfieStepStateManager;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i102 = i33;
                                                        SelfieWorkflow.Input input3 = input2;
                                                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                        switch (i102) {
                                                            case 0:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 1:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 2:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 3:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 4:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 5:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 6:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 7:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 8:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            case 9:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                            default:
                                                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                                break;
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }, videoCaptureMethod6, z26, selfieStepStateManager.cameraXControllerFactory, selfieStepStateManager.camera2ControllerFactory, f4, selfieBrightnessInfo4, facingMode6, z28, z29, false, z30, 33554432);
                                            }
                                            str = str2;
                                            ordinal = pose5.ordinal();
                                            if (ordinal == 0) {
                                            }
                                            overlay3 = overlay2;
                                            if (DateStrings.getManualCaptureEnabled(capture)) {
                                            }
                                            input2 = input;
                                            selfieStepStateManager = selfieStepStateManager2;
                                            flashState3 = flashState6;
                                            str3 = hintMessage4;
                                            continuation = null;
                                            r4 = 1;
                                            i = 7;
                                            selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture = new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(overlay3, !Intrinsics.areEqual(selfieType, configurablePoses));
                                            if (!DateStrings.getManualCaptureEnabled(capture)) {
                                            }
                                            flashState4 = SelfieState.FlashState.FlashOn;
                                            if (flashState2 == flashState4) {
                                            }
                                            flashState5 = SelfieState.FlashState.ReadyToCapture;
                                            if (flashState2 == flashState5) {
                                            }
                                            VideoCaptureMethod videoCaptureMethod62 = videoCaptureMethod(input);
                                            SubtreeManager subtreeManager82 = (SubtreeManager) selfieStepStateManager.lastChild;
                                            String str232 = strings.capturePageTitle;
                                            boolean z252 = input2.requireStrictSelfieCapture;
                                            NavigationState navigationState72 = navigationStateManager.getNavigationState();
                                            BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release32 = selfieStepStateManager.getCameraErrorHandler$selfie_release(subtreeManager);
                                            SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides62 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input2);
                                            boolean z262 = videoCaptureConfig.recordAudio;
                                            boolean z272 = capture.autoCaptureSupported;
                                            Selfie.Pose pose62 = (Selfie.Pose) CollectionsKt.first(capture.getPosesNeeded());
                                            float f42 = capture.poseScore;
                                            SelfieBrightnessInfo selfieBrightnessInfo42 = capture.brightnessInfo;
                                            CameraProperties.FacingMode facingMode62 = capture.cameraFacingMode;
                                            boolean z282 = capture.isFlashEnabled;
                                            SelfieState.FlashState flashState72 = flashState3;
                                            if (flashState72 != flashState4) {
                                            }
                                            if (videoCaptureMethod(input) == VideoCaptureMethod.Upload) {
                                            }
                                            final int i312 = 3;
                                            Function0 function0102 = new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i312;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            final int i322 = 4;
                                            Function0 function0112 = new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i322;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            final int i332 = 1;
                                            createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input2, subtreeManager82, pose62, str232, str, str3, z272, selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture, makeCameraScreenAssetOverrides62, z252, navigationState72, function0102, function0112, cameraErrorHandler$selfie_release32, new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i102 = i332;
                                                    SelfieWorkflow.Input input3 = input2;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i102) {
                                                        case 0:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 1:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 2:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 3:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 4:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 5:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 6:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 7:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 8:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 9:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        default:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, videoCaptureMethod62, z262, selfieStepStateManager.cameraXControllerFactory, selfieStepStateManager.camera2ControllerFactory, f42, selfieBrightnessInfo42, facingMode62, z282, z29, false, z30, 33554432);
                                        }
                                        flashState2 = flashState;
                                        if (MaterialColors.getCurrentPoseConfig(capture).autoCaptureEnabled) {
                                        }
                                        if (selfieError4 == null) {
                                        }
                                        if (pose5 != Selfie.Pose.Left) {
                                        }
                                        str = str2;
                                        ordinal = pose5.ordinal();
                                        if (ordinal == 0) {
                                        }
                                        overlay3 = overlay2;
                                        if (DateStrings.getManualCaptureEnabled(capture)) {
                                        }
                                        input2 = input;
                                        selfieStepStateManager = selfieStepStateManager2;
                                        flashState3 = flashState6;
                                        str3 = hintMessage4;
                                        continuation = null;
                                        r4 = 1;
                                        i = 7;
                                        selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture = new SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture(overlay3, !Intrinsics.areEqual(selfieType, configurablePoses));
                                        if (!DateStrings.getManualCaptureEnabled(capture)) {
                                        }
                                        flashState4 = SelfieState.FlashState.FlashOn;
                                        if (flashState2 == flashState4) {
                                        }
                                        flashState5 = SelfieState.FlashState.ReadyToCapture;
                                        if (flashState2 == flashState5) {
                                        }
                                        VideoCaptureMethod videoCaptureMethod622 = videoCaptureMethod(input);
                                        SubtreeManager subtreeManager822 = (SubtreeManager) selfieStepStateManager.lastChild;
                                        String str2322 = strings.capturePageTitle;
                                        boolean z2522 = input2.requireStrictSelfieCapture;
                                        NavigationState navigationState722 = navigationStateManager.getNavigationState();
                                        BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release322 = selfieStepStateManager.getCameraErrorHandler$selfie_release(subtreeManager);
                                        SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides622 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input2);
                                        boolean z2622 = videoCaptureConfig.recordAudio;
                                        boolean z2722 = capture.autoCaptureSupported;
                                        Selfie.Pose pose622 = (Selfie.Pose) CollectionsKt.first(capture.getPosesNeeded());
                                        float f422 = capture.poseScore;
                                        SelfieBrightnessInfo selfieBrightnessInfo422 = capture.brightnessInfo;
                                        CameraProperties.FacingMode facingMode622 = capture.cameraFacingMode;
                                        boolean z2822 = capture.isFlashEnabled;
                                        SelfieState.FlashState flashState722 = flashState3;
                                        if (flashState722 != flashState4) {
                                        }
                                        if (videoCaptureMethod(input) == VideoCaptureMethod.Upload) {
                                        }
                                        final int i3122 = 3;
                                        Function0 function01022 = new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i62 = i3122;
                                                SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i62) {
                                                    case 0:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 1:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 2:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 3:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 4:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 5:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 6:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 7:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 8:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 9:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 10:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 11:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 12:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 13:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 14:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 15:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 16:
                                                        SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                        WorkflowState state = subtreeManager22.getState();
                                                        SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                        SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                        if (selfieState2 != null) {
                                                            subtreeManager22.updateState(selfieState2);
                                                        }
                                                        break;
                                                    case 17:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 18:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 19:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 20:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 21:
                                                        selfieStepStateManager3.setOutput(canceled);
                                                        break;
                                                    case 22:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 23:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 24:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 25:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 26:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 27:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 28:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    default:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final int i3222 = 4;
                                        Function0 function01122 = new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i62 = i3222;
                                                SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i62) {
                                                    case 0:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 1:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 2:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 3:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 4:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 5:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 6:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 7:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 8:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 9:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 10:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 11:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 12:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 13:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 14:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 15:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 16:
                                                        SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                        WorkflowState state = subtreeManager22.getState();
                                                        SelfieState.CaptureTransition captureTransition = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                        SelfieState selfieState2 = captureTransition != null ? captureTransition.nextState : null;
                                                        if (selfieState2 != null) {
                                                            subtreeManager22.updateState(selfieState2);
                                                        }
                                                        break;
                                                    case 17:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 18:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 19:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 20:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 21:
                                                        selfieStepStateManager3.setOutput(canceled);
                                                        break;
                                                    case 22:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 23:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 24:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 25:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 26:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    case 27:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                    case 28:
                                                        selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                        break;
                                                    default:
                                                        selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        final int i3322 = 1;
                                        createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input2, subtreeManager822, pose622, str2322, str, str3, z2722, selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture, makeCameraScreenAssetOverrides622, z2522, navigationState722, function01022, function01122, cameraErrorHandler$selfie_release322, new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                            public final /* synthetic */ SelfieStepStateManager f$0;

                                            {
                                                this.f$0 = selfieStepStateManager;
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i102 = i3322;
                                                SelfieWorkflow.Input input3 = input2;
                                                SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                switch (i102) {
                                                    case 0:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 1:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 2:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 3:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 4:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 5:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 6:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 7:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 8:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    case 9:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                    default:
                                                        MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, videoCaptureMethod622, z2622, selfieStepStateManager.cameraXControllerFactory, selfieStepStateManager.camera2ControllerFactory, f422, selfieBrightnessInfo422, facingMode622, z2822, z29, false, z30, 33554432);
                                    } else {
                                        final int i34 = 7;
                                        final int i35 = 17;
                                        final int i36 = 16;
                                        if (selfieState instanceof SelfieState.CaptureTransition) {
                                            SelfieState.CaptureTransition captureTransition = (SelfieState.CaptureTransition) selfieState;
                                            SubtreeManager subtreeManager9 = (SubtreeManager) selfieStepStateManager2.lastChild;
                                            String str24 = strings.capturePageTitle;
                                            if (captureTransition.nextState instanceof SelfieState.Submit) {
                                                overlay = SelfieWorkflow.Screen.OldCameraScreen.Overlay.COMPLETE_WITH_CAPTURE;
                                                z = true;
                                            } else {
                                                int ordinal7 = captureTransition.completedPose.ordinal();
                                                if (ordinal7 != 0) {
                                                    z = true;
                                                    if (ordinal7 == 1) {
                                                        overlay = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT_COMPLETE;
                                                    } else {
                                                        if (ordinal7 != 2) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return;
                                                        }
                                                        overlay = SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT_COMPLETE;
                                                    }
                                                } else {
                                                    z = true;
                                                    overlay = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER_COMPLETE;
                                                }
                                            }
                                            SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition selfieWorkflow$Screen$OldCameraScreen$Mode$Transition = new SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition(new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i36;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, z, overlay, Intrinsics.areEqual(selfieType, configurablePoses) ^ z);
                                            boolean z31 = input.requireStrictSelfieCapture;
                                            NavigationState navigationState8 = navigationStateManager.getNavigationState();
                                            BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release4 = selfieStepStateManager2.getCameraErrorHandler$selfie_release(subtreeManager);
                                            VideoCaptureMethod videoCaptureMethod7 = videoCaptureMethod(input);
                                            SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides7 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                                            boolean z32 = videoCaptureConfig.recordAudio;
                                            CameraProperties.FacingMode facingMode7 = captureTransition.cameraFacingMode;
                                            boolean z33 = captureTransition.isFlashOn;
                                            Function0 function012 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i35;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            final int i37 = 18;
                                            createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager9, null, str24, null, null, false, selfieWorkflow$Screen$OldCameraScreen$Mode$Transition, makeCameraScreenAssetOverrides7, z31, navigationState8, function012, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i37;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, cameraErrorHandler$selfie_release4, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i102 = i34;
                                                    SelfieWorkflow.Input input3 = input;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i102) {
                                                        case 0:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 1:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 2:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 3:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 4:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 5:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 6:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 7:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 8:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 9:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        default:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, videoCaptureMethod7, z32, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, facingMode7, z33, false, false, false, 251658240);
                                        } else if (selfieState instanceof SelfieState.FinalizeLocalVideoCapture) {
                                            SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (SelfieState.FinalizeLocalVideoCapture) selfieState;
                                            subtreeManager.getClass();
                                            subtreeManager.runningSideEffect("finalize_delay", new ResetViewModel.AnonymousClass1(finalizeLocalVideoCapture, subtreeManager, null, 6));
                                            final int i38 = 21;
                                            createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager, null, null, null, null, false, new SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture(new SelfieV1UtilsKt$$ExternalSyntheticLambda2(subtreeManager, i34), new UiScreenRunner$$ExternalSyntheticLambda29(i36, subtreeManager, input, finalizeLocalVideoCapture), finalizeLocalVideoCapture.isDelayComplete, finalizeLocalVideoCapture.isFinalizeComplete ? SelfieWorkflow.Screen.OldCameraScreen.Overlay.COMPLETE : SelfieWorkflow.Screen.OldCameraScreen.Overlay.FINALIZING, !Intrinsics.areEqual(selfieType, configurablePoses)), SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input), input.requireStrictSelfieCapture, navigationStateManager.getNavigationState(), new StateFlowsKt$$ExternalSyntheticLambda2(i36, selfieStepStateManager2, subtreeManager), new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i38;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, new BlurEffectKt$$ExternalSyntheticLambda1(2, subtreeManager, selfieStepStateManager2), new UiScreenRunner$$ExternalSyntheticLambda29(i35, selfieStepStateManager2, subtreeManager, input), VideoCaptureMethod.Upload, videoCaptureConfig.recordAudio, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, finalizeLocalVideoCapture.cameraFacingMode, false, false, false, false, 251658240);
                                        } else if (selfieState instanceof SelfieState.FinalizeWebRtc) {
                                            SubtreeManager subtreeManager10 = (SubtreeManager) selfieStepStateManager2.lastChild;
                                            String str25 = strings.capturePageTitle;
                                            SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition selfieWorkflow$Screen$OldCameraScreen$Mode$Transition2 = new SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition(new ShimmerThemeKt$$ExternalSyntheticLambda0(24), false, SelfieWorkflow.Screen.OldCameraScreen.Overlay.FINALIZING, !Intrinsics.areEqual(selfieType, configurablePoses));
                                            boolean z34 = input.requireStrictSelfieCapture;
                                            NavigationState navigationState9 = navigationStateManager.getNavigationState();
                                            BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release5 = selfieStepStateManager2.getCameraErrorHandler$selfie_release(subtreeManager);
                                            VideoCaptureMethod videoCaptureMethod8 = videoCaptureMethod(input);
                                            SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides8 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                                            boolean z35 = videoCaptureConfig.recordAudio;
                                            CameraProperties.FacingMode facingMode8 = ((SelfieState.FinalizeWebRtc) selfieState).cameraFacingMode;
                                            final int i39 = 5;
                                            Function0 function013 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i39;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            final int i40 = 6;
                                            Function0 function014 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i40;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            final int i41 = 2;
                                            createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager10, null, str25, null, null, false, selfieWorkflow$Screen$OldCameraScreen$Mode$Transition2, makeCameraScreenAssetOverrides8, z34, navigationState9, function013, function014, cameraErrorHandler$selfie_release5, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i102 = i41;
                                                    SelfieWorkflow.Input input3 = input;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i102) {
                                                        case 0:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 1:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 2:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 3:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 4:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 5:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 6:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 7:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 8:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 9:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        default:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, videoCaptureMethod8, z35, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, facingMode8, false, false, false, false, 251658240);
                                        } else if (selfieState instanceof SelfieState.WebRtcFinished) {
                                            SelfieState.WebRtcFinished webRtcFinished = (SelfieState.WebRtcFinished) selfieState;
                                            SubtreeManager subtreeManager11 = (SubtreeManager) selfieStepStateManager2.lastChild;
                                            String str26 = strings.capturePageTitle;
                                            SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition selfieWorkflow$Screen$OldCameraScreen$Mode$Transition3 = new SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition(new StateFlowsKt$$ExternalSyntheticLambda2(15, selfieStepStateManager2, webRtcFinished), false, SelfieWorkflow.Screen.OldCameraScreen.Overlay.COMPLETE, !Intrinsics.areEqual(selfieType, configurablePoses));
                                            boolean z36 = input.requireStrictSelfieCapture;
                                            NavigationState navigationState10 = navigationStateManager.getNavigationState();
                                            BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release6 = selfieStepStateManager2.getCameraErrorHandler$selfie_release(subtreeManager);
                                            VideoCaptureMethod videoCaptureMethod9 = videoCaptureMethod(input);
                                            SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides9 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                                            boolean z37 = videoCaptureConfig.recordAudio;
                                            CameraProperties.FacingMode facingMode9 = webRtcFinished.cameraFacingMode;
                                            final int i42 = 11;
                                            Function0 function015 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i42;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            final int i43 = 12;
                                            Function0 function016 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i43;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            final int i44 = 5;
                                            createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager11, null, str26, null, null, false, selfieWorkflow$Screen$OldCameraScreen$Mode$Transition3, makeCameraScreenAssetOverrides9, z36, navigationState10, function015, function016, cameraErrorHandler$selfie_release6, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i102 = i44;
                                                    SelfieWorkflow.Input input3 = input;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i102) {
                                                        case 0:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 1:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 2:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 3:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 4:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 5:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 6:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 7:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 8:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        case 9:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                        default:
                                                            MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, videoCaptureMethod9, z37, selfieStepStateManager2.cameraXControllerFactory, selfieStepStateManager2.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, facingMode9, false, false, false, false, 251658240);
                                        } else if (selfieState instanceof SelfieState.ReviewCaptures) {
                                            SelfieState.ReviewCaptures reviewCaptures = (SelfieState.ReviewCaptures) selfieState;
                                            String str27 = strings.selfieCheckPageTitle;
                                            if (str27 == null) {
                                                str27 = context2.getString(R.string.pi2_selfie_check_page_title);
                                                str27.getClass();
                                            }
                                            String str28 = str27;
                                            String str29 = strings.selfieCheckPageDescription;
                                            if (str29 == null) {
                                                str29 = context2.getString(R.string.pi2_selfie_check_page_description);
                                                str29.getClass();
                                            }
                                            String str30 = str29;
                                            String str31 = strings.selfieCheckPageLabelFront;
                                            if (str31 == null) {
                                                str31 = context2.getString(R.string.pi2_selfie_check_page_label_front);
                                                str31.getClass();
                                            }
                                            String str32 = str31;
                                            String str33 = strings.selfieCheckPageLabelLeft;
                                            if (str33 == null) {
                                                str33 = context2.getString(R.string.pi2_selfie_check_page_label_left);
                                                str33.getClass();
                                            }
                                            String str34 = str33;
                                            String str35 = strings.selfieCheckPageLabelRight;
                                            if (str35 == null) {
                                                str35 = context2.getString(R.string.pi2_selfie_check_page_label_right);
                                                str35.getClass();
                                            }
                                            String str36 = str35;
                                            String str37 = strings.selfieCheckPageBtnSubmit;
                                            if (str37 == null) {
                                                str37 = context2.getString(R.string.pi2_selfie_check_page_label_btn_submit);
                                                str37.getClass();
                                            }
                                            String str38 = str37;
                                            String str39 = strings.selfieCheckPageBtnRetake;
                                            if (str39 == null) {
                                                str39 = context2.getString(R.string.pi2_selfie_check_page_label_btn_retake);
                                                str39.getClass();
                                            }
                                            final int i45 = 1;
                                            final int i46 = 2;
                                            submittingScreen = new SelfieWorkflow.Screen.ReviewCapturesScreen(new SelfieWorkflow.Screen.ReviewCapturesScreen.Strings(str28, str30, str32, str34, str36, str38, str39), reviewCaptures.selfiesToReview, input.styles, navigationStateManager.getNavigationState(), new StateFlowsKt$$ExternalSyntheticLambda2(i35, selfieStepStateManager2, reviewCaptures), new UiScreenRunner$$ExternalSyntheticLambda29(20, selfieStepStateManager2, input, reviewCaptures), new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i45;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i46;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            });
                                        } else {
                                            if (!z2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return;
                                            }
                                            SelfieState.Submit submit = (SelfieState.Submit) selfieState;
                                            subtreeManager.runningWorker(selfieStepStateManager2.submitVerificationWorker.create(input.sessionToken, input.inquiryId, input.fromComponent, input.fromStep, input.selfieType, input.fieldKeySelfie, submit.selfies, submit.webRtcObjectId, submit.cameraProperties, submit.startSelfieTimestamp, input.fileUploadUrl), new SelfieStepStateManager$$ExternalSyntheticLambda1(selfieStepStateManager2, 3));
                                            NavigationStateManager.setState$default(navigationStateManager, false, false, false, 12);
                                            String str40 = strings.processingTitle;
                                            String str41 = strings.processingDescription;
                                            PendingPageTextPosition pendingPageTextPosition = input.pendingPageTextVerticalPosition;
                                            StepStyles.SelfieStepStyle selfieStepStyle = input.styles;
                                            NavigationState navigationState11 = navigationStateManager.getNavigationState();
                                            final int i47 = 24;
                                            Function0 function017 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i47;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            final int i48 = 25;
                                            Function0 function018 = new Function0(selfieStepStateManager2) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                                                public final /* synthetic */ SelfieStepStateManager f$0;

                                                {
                                                    this.f$0 = selfieStepStateManager2;
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i62 = i48;
                                                    SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                                                    SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                                                    switch (i62) {
                                                        case 0:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 1:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 2:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 3:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 4:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 5:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 6:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 7:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 8:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 9:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 10:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 11:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 12:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 13:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 14:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 15:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 16:
                                                            SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                                            WorkflowState state = subtreeManager22.getState();
                                                            SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                                            SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                                            if (selfieState2 != null) {
                                                                subtreeManager22.updateState(selfieState2);
                                                            }
                                                            break;
                                                        case 17:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 18:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 19:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 20:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 21:
                                                            selfieStepStateManager3.setOutput(canceled);
                                                            break;
                                                        case 22:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 23:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 24:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 25:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 26:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        case 27:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                        case 28:
                                                            selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                                            break;
                                                        default:
                                                            selfieStepStateManager3.setOutputForWorkflow(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            NextStep.Selfie.AssetConfig.RecordPage recordPage = assetConfig.getRecordPage();
                                            submittingScreen = new SelfieWorkflow.Screen.SubmittingScreen(str40, str41, pendingPageTextPosition, selfieStepStyle, navigationState11, function017, function018, recordPage != null ? recordPage.getLoadingPictograph() : null);
                                        }
                                    }
                                }
                            }
                        }
                        selfieStepStateManager2 = this;
                    }
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) selfieStepStateManager2.next;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, submittingScreen);
                }
                final SelfieState.WaitForCameraFeed waitForCameraFeed = (SelfieState.WaitForCameraFeed) selfieState;
                boolean z38 = (waitForCameraFeed.hasRequestedCameraPermissions || PermissionsStateKt.hasPermission(context2, Permission.Camera)) ? false : true;
                boolean z39 = !waitForCameraFeed.hasRequestedAudioPermissions && isVideoCapture(input) && ContextUtilsKt.isMicPresent(context2) && videoCaptureConfig.recordAudio && !PermissionsStateKt.hasPermission(context2, Permission.RecordAudio);
                long currentTimeMillis = System.currentTimeMillis();
                SubtreeManager subtreeManager12 = (SubtreeManager) selfieStepStateManager2.lastChild;
                String str42 = strings.capturePageTitle;
                MultiParagraph$$ExternalSyntheticLambda0 multiParagraph$$ExternalSyntheticLambda0 = new MultiParagraph$$ExternalSyntheticLambda0(selfieStepStateManager2, input, waitForCameraFeed, currentTimeMillis, 5);
                selfieStepStateManager = selfieStepStateManager2;
                SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay9 = SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR;
                SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable = new SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable(multiParagraph$$ExternalSyntheticLambda0, !Intrinsics.areEqual(selfieType, configurablePoses), videoCaptureMethod(input) == VideoCaptureMethod.Upload, videoCaptureConfig.maxRecordingLengthMs, new SelfieStepStateManager$$ExternalSyntheticLambda1(selfieStepStateManager, 0));
                boolean z40 = input.requireStrictSelfieCapture;
                NavigationState navigationState12 = navigationStateManager.getNavigationState();
                BlurEffectKt$$ExternalSyntheticLambda1 cameraErrorHandler$selfie_release7 = selfieStepStateManager.getCameraErrorHandler$selfie_release(subtreeManager);
                VideoCaptureMethod videoCaptureMethod10 = videoCaptureMethod(input);
                SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides10 = SelfieWorkflowUtilsKt.makeCameraScreenAssetOverrides(input);
                boolean z41 = videoCaptureConfig.recordAudio;
                CameraProperties.FacingMode facingMode10 = waitForCameraFeed.cameraFacingMode;
                boolean z42 = waitForCameraFeed.isFlashEnabled;
                boolean z43 = z38 || z39;
                final int i49 = 0;
                Function0 function019 = new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                    public final /* synthetic */ SelfieStepStateManager f$0;

                    {
                        this.f$0 = selfieStepStateManager;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i49;
                        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                        switch (i62) {
                            case 0:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 1:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 2:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 3:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 4:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 5:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 6:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 7:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 8:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 9:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 10:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 11:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 12:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 13:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 14:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 15:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 16:
                                SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                WorkflowState state = subtreeManager22.getState();
                                SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                if (selfieState2 != null) {
                                    subtreeManager22.updateState(selfieState2);
                                }
                                break;
                            case 17:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 18:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 19:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 20:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 21:
                                selfieStepStateManager3.setOutput(canceled);
                                break;
                            case 22:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 23:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 24:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 25:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 26:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 27:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 28:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            default:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i50 = 15;
                final int i51 = 0;
                createCameraScreen$default = SelfieV1UtilsKt.createCameraScreen$default(input, subtreeManager12, null, str42, null, null, false, selfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable, makeCameraScreenAssetOverrides10, z40, navigationState12, function019, new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda2
                    public final /* synthetic */ SelfieStepStateManager f$0;

                    {
                        this.f$0 = selfieStepStateManager;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i62 = i50;
                        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                        switch (i62) {
                            case 0:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 1:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 2:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 3:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 4:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 5:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 6:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 7:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 8:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 9:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 10:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 11:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 12:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 13:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 14:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 15:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 16:
                                SubtreeManager subtreeManager22 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                WorkflowState state = subtreeManager22.getState();
                                SelfieState.CaptureTransition captureTransition2 = state instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) state : null;
                                SelfieState selfieState2 = captureTransition2 != null ? captureTransition2.nextState : null;
                                if (selfieState2 != null) {
                                    subtreeManager22.updateState(selfieState2);
                                }
                                break;
                            case 17:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 18:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 19:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 20:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 21:
                                selfieStepStateManager3.setOutput(canceled);
                                break;
                            case 22:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 23:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 24:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 25:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 26:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            case 27:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                            case 28:
                                selfieStepStateManager3.goBack$selfie_release((SubtreeManager) selfieStepStateManager3.lastChild);
                                break;
                            default:
                                selfieStepStateManager3.setOutputForWorkflow(canceled);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, cameraErrorHandler$selfie_release7, new Function0(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda4
                    public final /* synthetic */ SelfieStepStateManager f$0;

                    {
                        this.f$0 = selfieStepStateManager;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i102 = i51;
                        SelfieWorkflow.Input input3 = input;
                        SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                        switch (i102) {
                            case 0:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 1:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 2:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 3:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 4:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 5:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 6:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 7:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 8:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            case 9:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                            default:
                                MaterialAttributes.handlePermissionChanged(selfieStepStateManager3.applicationContext, (SubtreeManager) selfieStepStateManager3.lastChild, input3, selfieStepStateManager3.isVideoCapture(input3));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, videoCaptureMethod10, z41, selfieStepStateManager.cameraXControllerFactory, selfieStepStateManager.camera2ControllerFactory, RecyclerView.DECELERATION_RATE, null, facingMode10, z42, false, z43, false, 218103808);
                PermissionRequestWorker_Factory_Impl permissionRequestWorker_Factory_Impl = selfieStepStateManager.permissionRequestWorkerFactory;
                if (z38) {
                    Permission permission = Permission.Camera;
                    String str43 = input.cameraPermissionsTitle;
                    String str44 = str43 == null ? "" : str43;
                    String str45 = input.cameraPermissionsRationale;
                    if (str45 == null) {
                        context = context2;
                        str45 = context.getString(R.string.pi2_selfie_camera_permission_rationale);
                        str45.getClass();
                    } else {
                        context = context2;
                    }
                    String str46 = str45;
                    String string2 = context.getString(R.string.pi2_selfie_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context));
                    string2.getClass();
                    PermissionRequestWorker create = permissionRequestWorker_Factory_Impl.create(new PermissionRequestWorkflow.Props(permission, false, str44, str46, string2, input.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalNegativeButton, null, null, null, input.styles));
                    final int i52 = 0;
                    subtreeManager.runningWorker(create, new Function1(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda5
                        public final /* synthetic */ SelfieStepStateManager f$0;

                        {
                            this.f$0 = selfieStepStateManager;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i53 = i52;
                            SelfieWorkflow.Output.Back back = SelfieWorkflow.Output.Back.INSTANCE;
                            SelfieWorkflow.Input input3 = input;
                            SelfieState.WaitForCameraFeed waitForCameraFeed2 = waitForCameraFeed;
                            SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                            switch (i53) {
                                case 0:
                                    SubtreeManager subtreeManager13 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                    PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj;
                                    output.getClass();
                                    if (output.permissionState.result == PermissionResult.PermissionGranted) {
                                        subtreeManager13.updateState(SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed2, true, false, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                                    } else if (!input3.skipPromptPage) {
                                        subtreeManager13.updateState(new SelfieState.ShowInstructions());
                                    } else if (input3.backStepEnabled) {
                                        selfieStepStateManager3.setOutputForWorkflow(back);
                                    } else {
                                        selfieStepStateManager3.setOutputForWorkflow(new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                    }
                                    break;
                                default:
                                    SubtreeManager subtreeManager14 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                    PermissionRequestWorker.Output output2 = (PermissionRequestWorker.Output) obj;
                                    output2.getClass();
                                    if (output2.permissionState.result == PermissionResult.PermissionGranted) {
                                        subtreeManager14.updateState(SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed2, false, true, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE));
                                    } else if (!input3.skipPromptPage) {
                                        subtreeManager14.updateState(new SelfieState.ShowInstructions());
                                    } else if (input3.backStepEnabled) {
                                        selfieStepStateManager3.setOutputForWorkflow(back);
                                    } else {
                                        selfieStepStateManager3.setOutputForWorkflow(new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                } else if (z39) {
                    Permission permission2 = Permission.RecordAudio;
                    String str47 = input.microphonePermissionsRationale;
                    if (str47 == null) {
                        str47 = context2.getString(R.string.pi2_selfie_mic_permission_rationale);
                        str47.getClass();
                    }
                    String str48 = str47;
                    String string3 = context2.getString(R.string.pi2_selfie_mic_permission_denied_rationale, ContextUtilsKt.getApplicationName(context2));
                    string3.getClass();
                    String str49 = input.microphonePermissionsModalPositiveButton;
                    String str50 = input.microphonePermissionsModalNegativeButton;
                    String str51 = input.microphonePermissionsTitle;
                    final int i53 = 1;
                    subtreeManager.runningWorker(permissionRequestWorker_Factory_Impl.create(new PermissionRequestWorkflow.Props(permission2, false, str51 == null ? "" : str51, str48, string3, str49, str50, null, null, null, input.styles)), new Function1(selfieStepStateManager) { // from class: com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$$ExternalSyntheticLambda5
                        public final /* synthetic */ SelfieStepStateManager f$0;

                        {
                            this.f$0 = selfieStepStateManager;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i532 = i53;
                            SelfieWorkflow.Output.Back back = SelfieWorkflow.Output.Back.INSTANCE;
                            SelfieWorkflow.Input input3 = input;
                            SelfieState.WaitForCameraFeed waitForCameraFeed2 = waitForCameraFeed;
                            SelfieStepStateManager selfieStepStateManager3 = this.f$0;
                            switch (i532) {
                                case 0:
                                    SubtreeManager subtreeManager13 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                    PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj;
                                    output.getClass();
                                    if (output.permissionState.result == PermissionResult.PermissionGranted) {
                                        subtreeManager13.updateState(SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed2, true, false, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE));
                                    } else if (!input3.skipPromptPage) {
                                        subtreeManager13.updateState(new SelfieState.ShowInstructions());
                                    } else if (input3.backStepEnabled) {
                                        selfieStepStateManager3.setOutputForWorkflow(back);
                                    } else {
                                        selfieStepStateManager3.setOutputForWorkflow(new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                    }
                                    break;
                                default:
                                    SubtreeManager subtreeManager14 = (SubtreeManager) selfieStepStateManager3.lastChild;
                                    PermissionRequestWorker.Output output2 = (PermissionRequestWorker.Output) obj;
                                    output2.getClass();
                                    if (output2.permissionState.result == PermissionResult.PermissionGranted) {
                                        subtreeManager14.updateState(SelfieState.WaitForCameraFeed.copy$default(waitForCameraFeed2, false, true, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE));
                                    } else if (!input3.skipPromptPage) {
                                        subtreeManager14.updateState(new SelfieState.ShowInstructions());
                                    } else if (input3.backStepEnabled) {
                                        selfieStepStateManager3.setOutputForWorkflow(back);
                                    } else {
                                        selfieStepStateManager3.setOutputForWorkflow(new SelfieWorkflow.Output.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                selfieStepStateManager2 = selfieStepStateManager;
            }
        }
        submittingScreen = createCameraScreen$default;
        StateFlowImpl stateFlowImpl2 = (StateFlowImpl) selfieStepStateManager2.next;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, submittingScreen);
    }

    public final boolean isVideoCapture(SelfieWorkflow.Input input) {
        Serializable m4101isVideo0E7RQCE = input.videoCaptureConfig.m4101isVideo0E7RQCE(this.applicationContext);
        if (Result.m4120exceptionOrNullimpl(m4101isVideo0E7RQCE) == null) {
            return ((Boolean) m4101isVideo0E7RQCE).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SelfieState.CaptureTransition nextState(SubtreeManager subtreeManager, SelfieState selfieState, Selfie selfie) {
        SelfieCaptureMethod selfieCaptureMethod;
        SelfieState reviewStateIfNeeded;
        SelfieState finalizeWebRtc;
        SelfieState selfieState2;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.firstChild;
        CameraState cameraState = (CameraState) selfieState;
        SelfiePoseType selfiePoseType = SelfieWorkflowUtilsKt.toSelfiePoseType(cameraState.getCurrentPose());
        Selfie.CaptureMethod captureMethod = selfie.getCaptureMethod();
        captureMethod.getClass();
        int ordinal = captureMethod.ordinal();
        if (ordinal == 0) {
            selfieCaptureMethod = SelfieCaptureMethod.AUTO;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            selfieCaptureMethod = SelfieCaptureMethod.MANUAL;
        }
        SelfiePoseEventData selfiePoseEventData = new SelfiePoseEventData(selfiePoseType, selfieCaptureMethod, null, 4, null);
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        TrackingEventsLogger.DefaultImpls.logSelfiePoseCaptureEvent$default(trackingEventsLogger, selfiePoseEventData, false, 2, null);
        SelfieCaptureState selfieCaptureState = SelfieCaptureState.CAPTURED_PHOTO;
        String lowerCase = selfie.getCaptureMethod().name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(trackingEventsLogger, new SelfieCaptureStateEventData(selfieCaptureState, lowerCase, cameraState.getCurrentPose().name(), null, 8, null), false, 2, null);
        List drop = CollectionsKt.drop(cameraState.getPosesNeeded(), 1);
        if (drop.isEmpty()) {
            if (videoCaptureMethod((SelfieWorkflow.Input) stateFlowImpl.getValue()) == VideoCaptureMethod.Upload) {
                CaptureState captureState = (CaptureState) selfieState;
                finalizeWebRtc = new SelfieState.FinalizeLocalVideoCapture(CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), captureState.getCameraProperties(), captureState.getStartSelfieTimestamp(), selfieState.getBackState$selfie_release(), selfieState.getCameraFacingMode$selfie_release());
            } else if (videoCaptureMethod((SelfieWorkflow.Input) stateFlowImpl.getValue()) == VideoCaptureMethod.Stream) {
                CaptureState captureState2 = (CaptureState) selfieState;
                finalizeWebRtc = new SelfieState.FinalizeWebRtc(CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), captureState2.getCameraProperties(), captureState2.getStartSelfieTimestamp(), selfieState.getBackState$selfie_release(), selfieState.getCameraFacingMode$selfie_release());
            } else {
                CaptureState captureState3 = (CaptureState) selfieState;
                reviewStateIfNeeded = MaterialAttributes.reviewStateIfNeeded(subtreeManager, ((SelfieWorkflow.Input) stateFlowImpl.getValue()).poseConfigs, CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), null, captureState3.getCameraProperties(), captureState3.getStartSelfieTimestamp(), selfieState.getBackState$selfie_release());
            }
            selfieState2 = finalizeWebRtc;
            return new SelfieState.CaptureTransition(selfieState2, cameraState.getCurrentPose(), selfieState.getBackState$selfie_release(), selfieState.getCameraFacingMode$selfie_release(), ((CameraState) selfieState).isFlashEnabled());
        }
        if (CollectionsKt.first(drop) == Selfie.Pose.Center) {
            CaptureState captureState4 = (CaptureState) selfieState;
            reviewStateIfNeeded = new SelfieState.StartCapture(null, RecyclerView.DECELERATION_RATE, null, drop, CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), System.currentTimeMillis(), captureState4.getStartSelfieTimestamp(), captureState4.getCameraProperties(), selfieState.getBackState$selfie_release(), ((SelfieWorkflow.Input) stateFlowImpl.getValue()).poseConfigs, selfieState.getCameraFacingMode$selfie_release(), ((CameraState) selfieState).isFlashEnabled(), 131);
        } else {
            CameraState cameraState2 = (CameraState) selfieState;
            CaptureState captureState5 = (CaptureState) selfieState;
            reviewStateIfNeeded = new SelfieState.ShowPoseHint(CollectionsKt.plus((Collection) selfieState.getSelfies$selfie_release(), (Object) selfie), drop, cameraState2.getAutoCaptureSupported(), captureState5.getCameraProperties(), captureState5.getStartSelfieTimestamp(), selfieState.getBackState$selfie_release(), ((SelfieWorkflow.Input) stateFlowImpl.getValue()).poseConfigs, selfieState.getCameraFacingMode$selfie_release(), cameraState2.isFlashEnabled());
        }
        selfieState2 = reviewStateIfNeeded;
        return new SelfieState.CaptureTransition(selfieState2, cameraState.getCurrentPose(), selfieState.getBackState$selfie_release(), selfieState.getCameraFacingMode$selfie_release(), ((CameraState) selfieState).isFlashEnabled());
    }

    public final void setErrorOutput(Throwable th) {
        String message;
        String message2 = th.getMessage();
        if (message2 != null && StringsKt.contains((CharSequence) message2, (CharSequence) "ENOSPC", false)) {
            setOutputForWorkflow(new SelfieWorkflow.Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th instanceof ImageCaptureException)) {
            setOutputForWorkflow(new SelfieWorkflow.Output.Error(new InternalErrorInfo.UnknownErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Unknown error. Type: ", th.getClass().getCanonicalName()))));
            return;
        }
        Throwable cause = th.getCause();
        if (cause == null || (message = cause.getMessage()) == null || !StringsKt.contains((CharSequence) message, (CharSequence) "ENOSPC", false)) {
            setOutputForWorkflow(new SelfieWorkflow.Output.Error(new InternalErrorInfo.UnknownErrorInfo(Recorder$$ExternalSyntheticOutline2.m("Unknown error. Type: ", th.getClass().getCanonicalName()))));
        } else {
            setOutputForWorkflow(new SelfieWorkflow.Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        }
    }

    public final void setOutputForWorkflow(SelfieWorkflow.Output output) {
        if (!(output instanceof SelfieWorkflow.Output.Finished) && !(output instanceof SelfieWorkflow.Output.Back) && !(output instanceof SelfieWorkflow.Output.Error)) {
            boolean z = output instanceof SelfieWorkflow.Output.Canceled;
        }
        setOutput(output);
    }

    public final VideoCaptureMethod videoCaptureMethod(SelfieWorkflow.Input input) {
        Serializable m4102videoCaptureMethod0E7RQCE = input.videoCaptureConfig.m4102videoCaptureMethod0E7RQCE(this.applicationContext);
        return Result.m4120exceptionOrNullimpl(m4102videoCaptureMethod0E7RQCE) == null ? (VideoCaptureMethod) m4102videoCaptureMethod0E7RQCE : VideoCaptureMethod.None;
    }
}
