package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import android.content.Context;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.lifecycle.SavedStateHandle;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import com.google.android.material.animation.AnimatorSetCompat;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.core.CardScene$applyIconToMaterial$1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda4;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.AutoClassificationErrorType;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.DesignVersion;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker;
import com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreenKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.IdIcon;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdAutoClassificationRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdLocalVideoCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdWebRtcRenderer;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.permissions.Permission;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda78;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.GovernmentIdPage;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$GovernmentId;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryThemeManager;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenTransition;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import com.withpersona.sdk2.inquiry.workflows.TimerWorker;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.oneformapp.helper.matching.POPMatchingFactory;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;
import org.commonmark.node.Node;

/* loaded from: classes9.dex */
public final class GovernmentIdStepStateManager extends Node {
    public final Context applicationContext;
    public final GovIdAutoClassificationRenderer autoClassificationRenderer;
    public final AutoClassifyWorker.Factory autoClassifyWorkerFactory;
    public final RealCameraStatsManager cameraStatsManager;
    public final GovIdCaptureRenderer captureRenderer;
    public final DocumentSelectWorker documentSelectWorker;
    public final ExternalEventLogger externalEventLogger;
    public final RealImageLoader imageLoader;
    public final GovIdLocalVideoCaptureRenderer localVideoCaptureRenderer;
    public final NavigationStateManager navigationStateManager;
    public KClass previousStateClass;
    public final SubmitVerificationWorker_Factory_Impl submitVerificationWorkerFactory;
    public final InquiryThemeManager themeManager;
    public final TrackingEventsLogger trackingEventsLogger;
    public final POPMatchingFactory videoCaptureHelper;
    public final GovIdWebRtcRenderer webRtcRenderer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdStepStateManager(GovernmentIdWorkflow.Input input, SavedStateHandle savedStateHandle, Context context, RealImageLoader realImageLoader, SubmitVerificationWorker_Factory_Impl submitVerificationWorker_Factory_Impl, DocumentSelectWorker documentSelectWorker, GovIdLocalVideoCaptureRenderer govIdLocalVideoCaptureRenderer, GovIdWebRtcRenderer govIdWebRtcRenderer, GovIdCaptureRenderer govIdCaptureRenderer, AutoClassifyWorker.Factory factory, GovIdAutoClassificationRenderer govIdAutoClassificationRenderer, RealCameraStatsManager realCameraStatsManager, NavigationStateManager navigationStateManager, ExternalEventLogger externalEventLogger, TrackingEventsLogger trackingEventsLogger, InquiryThemeManager inquiryThemeManager) {
        super(input, savedStateHandle);
        WorkflowState showInstructions;
        input.getClass();
        savedStateHandle.getClass();
        context.getClass();
        realImageLoader.getClass();
        submitVerificationWorker_Factory_Impl.getClass();
        documentSelectWorker.getClass();
        govIdLocalVideoCaptureRenderer.getClass();
        govIdWebRtcRenderer.getClass();
        govIdCaptureRenderer.getClass();
        factory.getClass();
        govIdAutoClassificationRenderer.getClass();
        realCameraStatsManager.getClass();
        navigationStateManager.getClass();
        externalEventLogger.getClass();
        trackingEventsLogger.getClass();
        inquiryThemeManager.getClass();
        this.applicationContext = context;
        this.imageLoader = realImageLoader;
        this.submitVerificationWorkerFactory = submitVerificationWorker_Factory_Impl;
        this.documentSelectWorker = documentSelectWorker;
        this.localVideoCaptureRenderer = govIdLocalVideoCaptureRenderer;
        this.webRtcRenderer = govIdWebRtcRenderer;
        this.captureRenderer = govIdCaptureRenderer;
        this.autoClassifyWorkerFactory = factory;
        this.autoClassificationRenderer = govIdAutoClassificationRenderer;
        this.cameraStatsManager = realCameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.themeManager = inquiryThemeManager;
        this.videoCaptureHelper = new POPMatchingFactory();
        int i = 8;
        if (((SubtreeManager) this.lastChild).getState() == null) {
            GovernmentIdWorkflow.Input input2 = (GovernmentIdWorkflow.Input) ((StateFlowImpl) this.firstChild).getValue();
            input2.getClass();
            AutoClassificationConfig autoClassificationConfig = input2.autoClassificationConfig;
            if (!autoClassificationConfig.isEnabled) {
                showInstructions = new GovernmentIdState.ShowInstructions(input2.countryCode);
            } else if (input2.enabledCaptureOptionsNativeMobile.size() > 1) {
                IdPart$SideIdPart idPart$SideIdPart = new IdPart$SideIdPart(IdConfig.Side.Front);
                EmptyList emptyList = EmptyList.INSTANCE;
                showInstructions = new GovernmentIdState.ChooseCaptureMethod(idPart$SideIdPart, emptyList, emptyList, 0, input2.countryCode, new CaptureConfig.AutoClassifyConfig(autoClassificationConfig), null);
            } else {
                IdPart$SideIdPart idPart$SideIdPart2 = new IdPart$SideIdPart(IdConfig.Side.Front);
                EmptyList emptyList2 = EmptyList.INSTANCE;
                showInstructions = new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart2, emptyList2, new CaptureConfig.AutoClassifyConfig(autoClassificationConfig), input2.designVersion == DesignVersion.K0000 ? Screen.CameraScreen.ManualCapture.Hidden : Screen.CameraScreen.ManualCapture.Enabled, emptyList2, 0, null, WebRtcState.Disconnected, input2.videoCaptureConfig.webRtcJwt, null, false, false, input2.countryCode, null, new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(this, i), 11776);
            }
            updateState(showInstructions);
        }
        SubtreeManager subtreeManager = (SubtreeManager) this.lastChild;
        GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda1 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(this, i);
        subtreeManager.children = governmentIdStepStateManager$$ExternalSyntheticLambda1;
        governmentIdStepStateManager$$ExternalSyntheticLambda1.invoke(subtreeManager.getState());
        JobKt.launch$default((ContextScope) this.parent, Dispatchers.Unconfined, null, new HazeSourceNode$launchPreDraw$1(this, null, 15), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0f86, code lost:
    
        if (r70.isEnabled != false) goto L365;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0f79  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0fb8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0fdc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0f89  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleState(GovernmentIdStepStateManager governmentIdStepStateManager, final GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, Continuation continuation) {
        GovernmentIdPage takePhoto;
        GovernmentIdStepStateManager governmentIdStepStateManager2;
        GovernmentIdState governmentIdState2;
        boolean z;
        boolean z2;
        GovernmentIdState governmentIdState3;
        Context context;
        POPMatchingFactory pOPMatchingFactory;
        AutoClassificationConfig autoClassificationConfig;
        GovernmentIdStepStateManager governmentIdStepStateManager3;
        SubtreeManager subtreeManager;
        AutoClassificationConfig autoClassificationConfig2;
        Object obj;
        Iterable iterable;
        Object obj2;
        IdConfig idConfig;
        Object autoClassificationSelectCountryAndIdClassScreen;
        SubtreeManager subtreeManager2;
        POPMatchingFactory pOPMatchingFactory2;
        Iterator it;
        List list;
        String str;
        Object obj3;
        int i;
        String str2;
        String str3;
        Object newCameraScreen$default;
        Object obj4;
        IdConfig.Side side;
        Object newCameraScreen$default2;
        IdConfig.Side side2;
        GovernmentIdWorkflow.Input input2;
        IdPart$SideIdPart idPart$SideIdPart;
        GovernmentIdWorkflow.Input.Strings strings;
        GovernmentIdStepStateManager governmentIdStepStateManager4;
        GovernmentIdWorkflow.Input.Strings strings2;
        GovernmentIdState.ReviewCapturedImage reviewCapturedImage;
        boolean z3;
        CaptureConfig captureConfig;
        IdPart$SideIdPart idPart$SideIdPart2;
        NavigationStateManager navigationStateManager;
        NextStep.GovernmentId.AssetConfig assetConfig;
        GovernmentIdStepStateManager governmentIdStepStateManager5;
        String str4;
        IdConfig.Side side3;
        GovernmentIdWorkflow.Input input3;
        CaptureConfig captureConfig2;
        GovernmentIdStepStateManager$renderScreen$12 governmentIdStepStateManager$renderScreen$12;
        String text;
        Context context2;
        final SubtreeManager subtreeManager3;
        GovIdCaptureRenderer govIdCaptureRenderer;
        VideoCaptureConfig videoCaptureConfig;
        GovernmentIdStepStateManager$$ExternalSyntheticLambda5 governmentIdStepStateManager$$ExternalSyntheticLambda5;
        RemoteImage idFrontPictograph;
        RemoteImage remoteImage;
        Continuation continuation2;
        GovIdAutoClassificationRenderer govIdAutoClassificationRenderer = governmentIdStepStateManager.autoClassificationRenderer;
        Context context3 = governmentIdStepStateManager.applicationContext;
        final GovIdCaptureRenderer govIdCaptureRenderer2 = governmentIdStepStateManager.captureRenderer;
        TrackingEventsLogger trackingEventsLogger = governmentIdStepStateManager.trackingEventsLogger;
        NavigationStateManager navigationStateManager2 = governmentIdStepStateManager.navigationStateManager;
        final POPMatchingFactory pOPMatchingFactory3 = governmentIdStepStateManager.videoCaptureHelper;
        final SubtreeManager subtreeManager4 = (SubtreeManager) governmentIdStepStateManager.lastChild;
        Class<?> cls = governmentIdState.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(cls);
        boolean z4 = input.backStepEnabled;
        AutoClassificationConfig autoClassificationConfig3 = input.autoClassificationConfig;
        NextStep.GovernmentId.AssetConfig assetConfig2 = input.assetConfig;
        GovernmentIdWorkflow.Input.Strings strings3 = input.strings;
        boolean z5 = input.cancelButtonEnabled;
        boolean z6 = input.isEnabled;
        NavigationStateManager.setState$default(navigationStateManager2, z4, z5, z6 && !(governmentIdState instanceof GovernmentIdState.Submit), 8);
        boolean z7 = governmentIdState instanceof GovernmentIdState.AutoClassificationError;
        if (z7) {
            takePhoto = GovernmentIdPage.AutoClassificationFailure.INSTANCE;
        } else if (governmentIdState instanceof GovernmentIdState.AutoClassificationManualSelect) {
            takePhoto = GovernmentIdPage.AutoClassificationSelect.INSTANCE;
        } else if (governmentIdState instanceof GovernmentIdState.ShowInstructions) {
            takePhoto = GovernmentIdPage.Select.INSTANCE;
        } else if (governmentIdState instanceof GovernmentIdState.ChooseCaptureMethod) {
            takePhoto = new GovernmentIdPage.Prompt(((GovernmentIdState.ChooseCaptureMethod) governmentIdState).partIndex);
        } else if ((governmentIdState instanceof GovernmentIdState.WaitForAutocapture) || (governmentIdState instanceof GovernmentIdState.CountdownToCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeLocalVideoCapture) || (governmentIdState instanceof GovernmentIdState.FinalizeWebRtc) || (governmentIdState instanceof GovernmentIdState.HolographicTorchDelay)) {
            takePhoto = new GovernmentIdPage.TakePhoto(governmentIdState.getPartIndex$government_id_release());
        } else if (governmentIdState instanceof GovernmentIdState.ReviewCapturedImage) {
            takePhoto = new GovernmentIdPage.Check(((GovernmentIdState.ReviewCapturedImage) governmentIdState).partIndex);
        } else if (governmentIdState instanceof GovernmentIdState.ReviewSelectedImage) {
            takePhoto = new GovernmentIdPage.CheckUpload(((GovernmentIdState.ReviewSelectedImage) governmentIdState).partIndex);
        } else {
            if (!(governmentIdState instanceof GovernmentIdState.Submit)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            takePhoto = GovernmentIdPage.Pending.INSTANCE;
        }
        governmentIdStepStateManager.externalEventLogger.logPageChange(new InquiryPage$GovernmentId(input.fromStep, takePhoto));
        Continuation continuation3 = null;
        if (!Intrinsics.areEqual(governmentIdStepStateManager.previousStateClass, orCreateKotlinClass)) {
            TrackingEventsLogger.DefaultImpls.logInquiryPageViewEvent$default(governmentIdStepStateManager.trackingEventsLogger, input.fromStep, takePhoto.toString(), false, 4, null);
            if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(GovernmentIdState.WaitForAutocapture.class))) {
                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.LOADING, null, null, 4, null), false, 2, null);
            }
            governmentIdStepStateManager.previousStateClass = orCreateKotlinClass;
        }
        ScreenTransition screenTransition = governmentIdState.didGoBack ? ScreenTransition.SLIDE_OUT : ScreenTransition.SLIDE_IN;
        boolean z8 = governmentIdState instanceof GovernmentIdState.ShowInstructions;
        if (z8) {
            governmentIdState2 = governmentIdState;
            governmentIdStepStateManager2 = governmentIdStepStateManager;
            subtreeManager4.runningSideEffect("check_if_single_id_class", new CardScene$applyIconToMaterial$1(input, governmentIdState2, governmentIdStepStateManager, continuation3, 5));
            String str5 = strings3.title;
            String str6 = strings3.prompt;
            String str7 = strings3.choose;
            String str8 = strings3.instructionsDisclaimer;
            ArrayList arrayList = input.enabledIdClasses;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                IdConfig idConfig2 = (IdConfig) it2.next();
                String str9 = str8;
                String str10 = str5;
                IdIcon idIcon = idConfig2.icon;
                String str11 = str6;
                String str12 = idConfig2.idClassKey;
                Iterator it3 = it2;
                String str13 = (String) strings3.idClassToName.get(str12);
                if (str13 != null) {
                    str12 = str13;
                }
                arrayList2.add(new EnabledIdClass(idIcon, idConfig2, str12));
                it2 = it3;
                str5 = str10;
                str6 = str11;
                str8 = str9;
            }
            autoClassificationSelectCountryAndIdClassScreen = new Screen.InstructionsScreen(str5, str6, str7, str8, arrayList2, navigationStateManager2.getNavigationState(), new GovernmentIdStepStateManager$renderScreen$2(governmentIdState2, input, governmentIdStepStateManager2), input.styles, assetConfig2.getSelectPage(), input.isEnabled, new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager2, 0), new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager2, 1), ((GovernmentIdState.ShowInstructions) governmentIdState2).error, new GovernmentIdStepStateManager$$ExternalSyntheticLambda5(governmentIdStepStateManager2, governmentIdState2, 2), ((InquiryTheme) ((StateFlowImpl) governmentIdStepStateManager2.themeManager.themeFlow).getValue()).iconStyle, screenTransition);
        } else {
            governmentIdStepStateManager2 = governmentIdStepStateManager;
            governmentIdState2 = governmentIdState;
            if (governmentIdState2 instanceof GovernmentIdState.ChooseCaptureMethod) {
                GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = (GovernmentIdState.ChooseCaptureMethod) governmentIdState2;
                String str14 = chooseCaptureMethod.countryCode;
                IdPart$SideIdPart idPart$SideIdPart3 = chooseCaptureMethod.currentPart;
                CaptureConfig captureConfig3 = chooseCaptureMethod.captureConfig;
                if (chooseCaptureMethod.choosingDocumentToUpload) {
                    subtreeManager4.runningWorker(governmentIdStepStateManager2.documentSelectWorker, new SelfieWorkflow$$ExternalSyntheticLambda38(14, governmentIdStepStateManager2, governmentIdState2, idPart$SideIdPart3));
                }
                NextStep.GovernmentId.AssetConfig.PromptPage promptPage = assetConfig2.getPromptPage();
                List list2 = input.enabledCaptureOptionsNativeMobile;
                IdConfig.Side side4 = idPart$SideIdPart3.side;
                String idClassKey = GovernmentIdKt.getIdClassKey(captureConfig3);
                strings3.getClass();
                side4.getClass();
                idClassKey.getClass();
                String text2 = strings3.chooseCaptureMethodTitle.getText(str14, idClassKey, side4);
                String str15 = text2 == null ? "" : text2;
                String idClassKey2 = GovernmentIdKt.getIdClassKey(captureConfig3);
                idClassKey2.getClass();
                String text3 = strings3.chooseCaptureMethodBody.getText(str14, idClassKey2, side4);
                String str16 = text3 == null ? "" : text3;
                String str17 = strings3.chooseCaptureMethodCameraButton;
                String str18 = strings3.chooseCaptureMethodUploadButton;
                NavigationState navigationState = navigationStateManager2.getNavigationState();
                GovernmentIdStepStateManager$$ExternalSyntheticLambda2 governmentIdStepStateManager$$ExternalSyntheticLambda2 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda2(governmentIdState2, input, governmentIdStepStateManager2);
                GovernmentIdStepStateManager$$ExternalSyntheticLambda5 governmentIdStepStateManager$$ExternalSyntheticLambda52 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda5(governmentIdStepStateManager2, governmentIdState2, 3);
                GovernmentIdStepStateManager$$ExternalSyntheticLambda0 governmentIdStepStateManager$$ExternalSyntheticLambda0 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager2, 6);
                GovernmentIdStepStateManager$$ExternalSyntheticLambda0 governmentIdStepStateManager$$ExternalSyntheticLambda02 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager2, 7);
                String str19 = chooseCaptureMethod.error;
                GovernmentIdStepStateManager$$ExternalSyntheticLambda5 governmentIdStepStateManager$$ExternalSyntheticLambda53 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda5(governmentIdStepStateManager2, governmentIdState2, 4);
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = input.styles;
                int ordinal = side4.ordinal();
                if (ordinal != 0) {
                    governmentIdStepStateManager$$ExternalSyntheticLambda5 = governmentIdStepStateManager$$ExternalSyntheticLambda53;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                if (promptPage != null) {
                                    idFrontPictograph = promptPage.getPassportSignaturePictograph();
                                    remoteImage = idFrontPictograph;
                                }
                            } else if (promptPage != null) {
                                idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                                remoteImage = idFrontPictograph;
                            }
                        }
                        remoteImage = null;
                    } else {
                        if (promptPage != null) {
                            idFrontPictograph = promptPage.getIdBackPictograph();
                            remoteImage = idFrontPictograph;
                        }
                        remoteImage = null;
                    }
                } else {
                    governmentIdStepStateManager$$ExternalSyntheticLambda5 = governmentIdStepStateManager$$ExternalSyntheticLambda53;
                    if (GovernmentIdKt.getIdClass(captureConfig3) == IdClass.Passport) {
                        if (promptPage != null) {
                            idFrontPictograph = promptPage.getPassportFrontPictograph();
                            remoteImage = idFrontPictograph;
                        }
                        remoteImage = null;
                    } else {
                        if (promptPage != null) {
                            idFrontPictograph = promptPage.getIdFrontPictograph();
                            remoteImage = idFrontPictograph;
                        }
                        remoteImage = null;
                    }
                }
                int ordinal2 = side4.ordinal();
                int i2 = R.raw.pi2_upload_gov_id_front_lottie;
                if (ordinal2 != 0) {
                    if (ordinal2 == 1 || ordinal2 == 3) {
                        i2 = R.raw.pi2_upload_gov_id_back_lottie;
                    }
                } else if (GovernmentIdKt.getIdClass(captureConfig3) == IdClass.Passport) {
                    i2 = R.raw.pi2_upload_gov_id_passport_lottie;
                }
                autoClassificationSelectCountryAndIdClassScreen = new Screen.ChooseCaptureMethodScreen(list2, str15, str16, str17, str18, navigationState, governmentIdStepStateManager$$ExternalSyntheticLambda2, governmentIdStepStateManager$$ExternalSyntheticLambda52, governmentIdStepStateManager$$ExternalSyntheticLambda0, governmentIdStepStateManager$$ExternalSyntheticLambda02, str19, governmentIdStepStateManager$$ExternalSyntheticLambda5, governmentIdStepStyle, remoteImage, i2, screenTransition);
            } else {
                int i3 = 1;
                if (governmentIdState2 instanceof GovernmentIdState.WaitForAutocapture) {
                    GovernmentIdState.WaitForAutocapture waitForAutocapture = (GovernmentIdState.WaitForAutocapture) governmentIdState2;
                    GovernmentIdStepStateManager$renderScreen$12 governmentIdStepStateManager$renderScreen$122 = new GovernmentIdStepStateManager$renderScreen$12(governmentIdStepStateManager2, 0);
                    final GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda1 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(governmentIdStepStateManager2, 7);
                    PermissionRequestWorker_Factory_Impl permissionRequestWorker_Factory_Impl = govIdCaptureRenderer2.permissionRequestWorker;
                    context3.getClass();
                    subtreeManager4.getClass();
                    pOPMatchingFactory3.getClass();
                    CaptureConfig captureConfig4 = waitForAutocapture.captureConfig;
                    String str20 = waitForAutocapture.countryCode;
                    IdPart$SideIdPart idPart$SideIdPart4 = waitForAutocapture.currentPart;
                    IdConfig.Side side5 = idPart$SideIdPart4.side;
                    IdConfig.IdSideConfig sideConfig = GovernmentIdKt.getSideConfig(captureConfig4, side5);
                    String idClassKey3 = GovernmentIdKt.getIdClassKey(captureConfig4);
                    boolean z9 = captureConfig4 instanceof CaptureConfig.AutoClassifyConfig;
                    subtreeManager4.runningWorker(govIdCaptureRenderer2.governmentIdAnalyzeWorkerFactory.create(side5, idClassKey3), new SelfieWorkflow$$ExternalSyntheticLambda78(govIdCaptureRenderer2, subtreeManager4, waitForAutocapture, captureConfig4, governmentIdStepStateManager$renderScreen$122, 9));
                    subtreeManager4.runningWorker(govIdCaptureRenderer2.governmentIdHintWorkerFactory.create(side5), new SelfieV1UtilsKt$$ExternalSyntheticLambda2(subtreeManager4, 3));
                    VideoCaptureMethod videoCaptureMethod = POPMatchingFactory.videoCaptureMethod(input);
                    VideoCaptureConfig videoCaptureConfig2 = input.videoCaptureConfig;
                    VideoCaptureMethod videoCaptureMethod2 = VideoCaptureMethod.Stream;
                    boolean z10 = videoCaptureMethod == videoCaptureMethod2;
                    IdConfig.ManualCaptureConfig manualCaptureConfig = sideConfig.manualCaptureConfig;
                    if (!manualCaptureConfig.isEnabled || z10) {
                        captureConfig2 = captureConfig4;
                        governmentIdStepStateManager$renderScreen$12 = governmentIdStepStateManager$renderScreen$122;
                    } else {
                        captureConfig2 = captureConfig4;
                        governmentIdStepStateManager$renderScreen$12 = governmentIdStepStateManager$renderScreen$122;
                        long j = manualCaptureConfig.delayMs;
                        if (j < 0) {
                            j = 0;
                        }
                        subtreeManager4.runningWorker(new TimerWorker(j), new HCaptcha$$ExternalSyntheticLambda1(16, waitForAutocapture, subtreeManager4));
                    }
                    String captureScreenTitle = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings3, side5, idClassKey3, str20);
                    String str21 = ((!z9 || (text = strings3.autoClassificationCaptureTipText) == null) && (text = strings3.scanInstructions.getText(str20, idClassKey3, side5)) == null) ? "" : text;
                    final int i4 = 1;
                    z2 = z7;
                    z = z8;
                    obj4 = GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle, str21, waitForAutocapture.manualCapture, sideConfig.overlay, GovernmentIdKt.getIdClass(captureConfig2), idPart$SideIdPart4.side, govIdCaptureRenderer2.navigationStateManager.getNavigationState(), new WalletHomeViewKt$$ExternalSyntheticLambda2(waitForAutocapture, captureConfig2, govIdCaptureRenderer2, input, subtreeManager4, pOPMatchingFactory3, 5), new CameraHelper$$ExternalSyntheticLambda0(governmentIdStepStateManager$renderScreen$12, 14), new HeroCardViewKt$$ExternalSyntheticLambda9(subtreeManager4, input, pOPMatchingFactory3, governmentIdStepStateManager$$ExternalSyntheticLambda1, 27), false, sideConfig.autoCaptureConfig.ruleSet.rules, waitForAutocapture, waitForAutocapture.partIndex, govIdCaptureRenderer2.cameraXControllerFactory, govIdCaptureRenderer2.camera2ControllerFactory, null, new SelfieV1UtilsKt$$ExternalSyntheticLambda2(subtreeManager4, 4), new HCaptcha$$ExternalSyntheticLambda1(14, governmentIdStepStateManager$$ExternalSyntheticLambda1, subtreeManager4), POPMatchingFactory.videoCaptureMethod(input), false, null, new HeroCardViewKt$$ExternalSyntheticLambda9(28, govIdCaptureRenderer2, subtreeManager4, waitForAutocapture), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5 = i4;
                            POPMatchingFactory pOPMatchingFactory4 = pOPMatchingFactory3;
                            GovernmentIdWorkflow.Input input4 = input;
                            SubtreeManager subtreeManager5 = subtreeManager4;
                            GovIdCaptureRenderer govIdCaptureRenderer3 = govIdCaptureRenderer2;
                            switch (i5) {
                                case 0:
                                    Context context4 = govIdCaptureRenderer3.applicationContext;
                                    pOPMatchingFactory4.getClass();
                                    GovernmentIdStateManagerUtilsKt.handlePermissionChanged(context4, subtreeManager5, input4, POPMatchingFactory.isVideoCapture(input4));
                                    break;
                                default:
                                    Context context5 = govIdCaptureRenderer3.applicationContext;
                                    pOPMatchingFactory4.getClass();
                                    GovernmentIdStateManagerUtilsKt.handlePermissionChanged(context5, subtreeManager5, input4, POPMatchingFactory.isVideoCapture(input4));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, 0, GovernmentIdWorkflowUtilsKt.getTextForHint(strings3, waitForAutocapture.hint), GovernmentIdWorkflowUtilsKt.getCaptureTips(input, side5), screenTransition, -1981677568, 0);
                    if (waitForAutocapture.checkCameraPermissions) {
                        Permission permission = Permission.Camera;
                        String str22 = strings3.cameraPermissionsTitle;
                        String str23 = str22 == null ? "" : str22;
                        String str24 = strings3.cameraPermissionsPrompt;
                        if (str24 == null) {
                            context2 = context3;
                            str24 = context2.getString(R.string.pi2_governmentid_camera_permission_rationale);
                            str24.getClass();
                        } else {
                            context2 = context3;
                        }
                        String str25 = str24;
                        String string2 = context2.getString(R.string.pi2_governmentid_camera_permission_denied_rationale, ContextUtilsKt.getApplicationName(context2));
                        string2.getClass();
                        PermissionRequestWorker create = permissionRequestWorker_Factory_Impl.create(new PermissionRequestWorkflow.Props(permission, false, str23, str25, string2, strings3.cameraPermissionsAllowButtonText, strings3.cameraPermissionsCancelButtonText, null, null, null, input.styles));
                        subtreeManager3 = subtreeManager4;
                        final int i5 = 1;
                        subtreeManager3.runningWorker(create, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i6 = i5;
                                GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda12 = governmentIdStepStateManager$$ExternalSyntheticLambda1;
                                GovernmentIdWorkflow.Input input4 = input;
                                SubtreeManager subtreeManager5 = subtreeManager3;
                                PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj5;
                                switch (i6) {
                                    case 0:
                                        output.getClass();
                                        int ordinal3 = output.permissionState.result.ordinal();
                                        if (ordinal3 != 0) {
                                            if (ordinal3 == 1) {
                                                GovernmentIdStateManagerUtilsKt.goBack(subtreeManager5, input4, governmentIdStepStateManager$$ExternalSyntheticLambda12);
                                                break;
                                            } else if (ordinal3 != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            }
                                        }
                                        GovernmentIdState governmentIdState4 = (GovernmentIdState) subtreeManager5.getState();
                                        if (governmentIdState4 != null && (governmentIdState4 instanceof GovernmentIdState.WaitForAutocapture)) {
                                            subtreeManager5.updateState(GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState4, null, null, null, false, false, null, 30719));
                                        }
                                        break;
                                    default:
                                        output.getClass();
                                        int ordinal4 = output.permissionState.result.ordinal();
                                        if (ordinal4 != 0) {
                                            if (ordinal4 == 1) {
                                                GovernmentIdStateManagerUtilsKt.goBack(subtreeManager5, input4, governmentIdStepStateManager$$ExternalSyntheticLambda12);
                                                break;
                                            } else if (ordinal4 != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            }
                                        }
                                        GovernmentIdState governmentIdState5 = (GovernmentIdState) subtreeManager5.getState();
                                        if (governmentIdState5 != null && (governmentIdState5 instanceof GovernmentIdState.WaitForAutocapture)) {
                                            subtreeManager5.updateState(GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState5, null, null, null, false, false, null, 31743));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else {
                        context2 = context3;
                        subtreeManager3 = subtreeManager4;
                        if (waitForAutocapture.checkAudioPermissions && POPMatchingFactory.isVideoCapture(input)) {
                            govIdCaptureRenderer = govIdCaptureRenderer2;
                            if (ContextUtilsKt.isMicPresent(govIdCaptureRenderer.applicationContext)) {
                                videoCaptureConfig = videoCaptureConfig2;
                                if (videoCaptureConfig.recordAudio) {
                                    Permission permission2 = Permission.RecordAudio;
                                    String str26 = strings3.microphonePermissionsTitle;
                                    String str27 = str26 == null ? "" : str26;
                                    String str28 = strings3.microphonePermissionsPrompt;
                                    if (str28 == null) {
                                        str28 = context2.getString(R.string.pi2_selfie_mic_permission_rationale);
                                        str28.getClass();
                                    }
                                    String string3 = context2.getString(R.string.pi2_selfie_mic_permission_denied_rationale, ContextUtilsKt.getApplicationName(context2));
                                    string3.getClass();
                                    final int i6 = 0;
                                    subtreeManager3.runningWorker(permissionRequestWorker_Factory_Impl.create(new PermissionRequestWorkflow.Props(permission2, false, str27, str28, string3, strings3.microphonePermissionsAllowButtonText, strings3.microphonePermissionsCancelButtonText, null, null, null, input.styles)), new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            int i62 = i6;
                                            GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda12 = governmentIdStepStateManager$$ExternalSyntheticLambda1;
                                            GovernmentIdWorkflow.Input input4 = input;
                                            SubtreeManager subtreeManager5 = subtreeManager3;
                                            PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj5;
                                            switch (i62) {
                                                case 0:
                                                    output.getClass();
                                                    int ordinal3 = output.permissionState.result.ordinal();
                                                    if (ordinal3 != 0) {
                                                        if (ordinal3 == 1) {
                                                            GovernmentIdStateManagerUtilsKt.goBack(subtreeManager5, input4, governmentIdStepStateManager$$ExternalSyntheticLambda12);
                                                            break;
                                                        } else if (ordinal3 != 2) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            break;
                                                        }
                                                    }
                                                    GovernmentIdState governmentIdState4 = (GovernmentIdState) subtreeManager5.getState();
                                                    if (governmentIdState4 != null && (governmentIdState4 instanceof GovernmentIdState.WaitForAutocapture)) {
                                                        subtreeManager5.updateState(GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState4, null, null, null, false, false, null, 30719));
                                                    }
                                                    break;
                                                default:
                                                    output.getClass();
                                                    int ordinal4 = output.permissionState.result.ordinal();
                                                    if (ordinal4 != 0) {
                                                        if (ordinal4 == 1) {
                                                            GovernmentIdStateManagerUtilsKt.goBack(subtreeManager5, input4, governmentIdStepStateManager$$ExternalSyntheticLambda12);
                                                            break;
                                                        } else if (ordinal4 != 2) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            break;
                                                        }
                                                    }
                                                    GovernmentIdState governmentIdState5 = (GovernmentIdState) subtreeManager5.getState();
                                                    if (governmentIdState5 != null && (governmentIdState5 instanceof GovernmentIdState.WaitForAutocapture)) {
                                                        subtreeManager5.updateState(GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState5, null, null, null, false, false, null, 31743));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    });
                                }
                                if (POPMatchingFactory.videoCaptureMethod(input) == videoCaptureMethod2 && waitForAutocapture.webRtcState == WebRtcState.Disconnected) {
                                    subtreeManager3.runningWorker(new WebRtcWorker(govIdCaptureRenderer.webRtcWorkerFactory.service, videoCaptureConfig.webRtcJwt), new HCaptcha$$ExternalSyntheticLambda1(govIdCaptureRenderer, subtreeManager3, waitForAutocapture, input));
                                }
                            }
                        } else {
                            govIdCaptureRenderer = govIdCaptureRenderer2;
                        }
                        videoCaptureConfig = videoCaptureConfig2;
                        if (POPMatchingFactory.videoCaptureMethod(input) == videoCaptureMethod2) {
                            subtreeManager3.runningWorker(new WebRtcWorker(govIdCaptureRenderer.webRtcWorkerFactory.service, videoCaptureConfig.webRtcJwt), new HCaptcha$$ExternalSyntheticLambda1(govIdCaptureRenderer, subtreeManager3, waitForAutocapture, input));
                        }
                    }
                    governmentIdStepStateManager3 = governmentIdStepStateManager;
                    governmentIdState3 = governmentIdState;
                    context = context2;
                    subtreeManager2 = subtreeManager3;
                    pOPMatchingFactory2 = pOPMatchingFactory3;
                    autoClassificationConfig2 = autoClassificationConfig3;
                } else {
                    z = z8;
                    z2 = z7;
                    int i7 = 0;
                    int i8 = 5;
                    if (governmentIdState2 instanceof GovernmentIdState.CountdownToCapture) {
                        GovernmentIdState.CountdownToCapture countdownToCapture = (GovernmentIdState.CountdownToCapture) governmentIdState2;
                        CaptureConfig captureConfig5 = countdownToCapture.captureConfig;
                        GovernmentIdStepStateManager$renderScreen$12 governmentIdStepStateManager$renderScreen$123 = new GovernmentIdStepStateManager$renderScreen$12(governmentIdStepStateManager, i3);
                        GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda12 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(governmentIdStepStateManager, i7);
                        govIdCaptureRenderer2.getClass();
                        subtreeManager4.getClass();
                        pOPMatchingFactory3.getClass();
                        IdPart$SideIdPart idPart$SideIdPart5 = countdownToCapture.currentPart;
                        IdConfig.Side side6 = idPart$SideIdPart5.side;
                        IdConfig.IdSideConfig sideConfig2 = GovernmentIdKt.getSideConfig(captureConfig5, side6);
                        subtreeManager4.runningWorker(govIdCaptureRenderer2.governmentIdHintWorkerFactory.create(side6), new SelfieV1UtilsKt$$ExternalSyntheticLambda2(subtreeManager4, i8));
                        String captureScreenTitle2 = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings3, side6, GovernmentIdKt.getIdClassKey(captureConfig5), countdownToCapture.countryCode);
                        String str29 = strings3.capturing;
                        IdConfig.Side side7 = idPart$SideIdPart5.side;
                        context = context3;
                        final int i9 = 0;
                        subtreeManager = subtreeManager4;
                        pOPMatchingFactory = pOPMatchingFactory3;
                        Object newCameraScreen$default3 = GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle2, str29, Screen.CameraScreen.ManualCapture.Disabled, sideConfig2.overlay, GovernmentIdKt.getIdClass(captureConfig5), side7, govIdCaptureRenderer2.navigationStateManager.getNavigationState(), null, new CameraHelper$$ExternalSyntheticLambda0(governmentIdStepStateManager$renderScreen$123, 15), new UiScreenRunner$$ExternalSyntheticLambda29(subtreeManager4, input, pOPMatchingFactory3, governmentIdStepStateManager$$ExternalSyntheticLambda12, 2), true, sideConfig2.autoCaptureConfig.ruleSet.rules, countdownToCapture, countdownToCapture.partIndex, govIdCaptureRenderer2.cameraXControllerFactory, govIdCaptureRenderer2.camera2ControllerFactory, new WalletHomeViewKt$$ExternalSyntheticLambda4(countdownToCapture, govIdCaptureRenderer2, input, subtreeManager4, pOPMatchingFactory3, 12), new OpenSourceKt$$ExternalSyntheticLambda9(subtreeManager4, countdownToCapture, input, pOPMatchingFactory3, 26), new HCaptcha$$ExternalSyntheticLambda1(14, governmentIdStepStateManager$$ExternalSyntheticLambda12, subtreeManager4), POPMatchingFactory.videoCaptureMethod(input), false, null, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i52 = i9;
                                POPMatchingFactory pOPMatchingFactory4 = pOPMatchingFactory3;
                                GovernmentIdWorkflow.Input input4 = input;
                                SubtreeManager subtreeManager5 = subtreeManager4;
                                GovIdCaptureRenderer govIdCaptureRenderer3 = govIdCaptureRenderer2;
                                switch (i52) {
                                    case 0:
                                        Context context4 = govIdCaptureRenderer3.applicationContext;
                                        pOPMatchingFactory4.getClass();
                                        GovernmentIdStateManagerUtilsKt.handlePermissionChanged(context4, subtreeManager5, input4, POPMatchingFactory.isVideoCapture(input4));
                                        break;
                                    default:
                                        Context context5 = govIdCaptureRenderer3.applicationContext;
                                        pOPMatchingFactory4.getClass();
                                        GovernmentIdStateManagerUtilsKt.handlePermissionChanged(context5, subtreeManager5, input4, POPMatchingFactory.isVideoCapture(input4));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, input.imageCaptureCount - 1, GovernmentIdWorkflowUtilsKt.getTextForHint(strings3, countdownToCapture.hint), null, screenTransition, -1545600768, 0);
                        governmentIdStepStateManager3 = governmentIdStepStateManager;
                        governmentIdState3 = governmentIdState;
                        obj4 = newCameraScreen$default3;
                        autoClassificationConfig2 = autoClassificationConfig3;
                    } else {
                        governmentIdState3 = governmentIdState2;
                        context = context3;
                        pOPMatchingFactory = pOPMatchingFactory3;
                        if (governmentIdState3 instanceof GovernmentIdState.ReviewCapturedImage) {
                            TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, null, 4, null), false, 2, null);
                            GovernmentIdState.ReviewCapturedImage reviewCapturedImage2 = (GovernmentIdState.ReviewCapturedImage) governmentIdState3;
                            String str30 = reviewCapturedImage2.countryCode;
                            boolean z11 = reviewCapturedImage2.submittingForAutoClassification;
                            CaptureConfig captureConfig6 = reviewCapturedImage2.captureConfig;
                            IdPart$SideIdPart idPart$SideIdPart6 = reviewCapturedImage2.currentPart;
                            IdConfig.Side side8 = idPart$SideIdPart6.side;
                            IdConfig.IdSideConfig sideConfig3 = GovernmentIdKt.getSideConfig(captureConfig6, side8);
                            Frame frame = (Frame) CollectionsKt.first(reviewCapturedImage2.idForReview.getFrames());
                            if (z11) {
                                z3 = z11;
                                captureConfig = captureConfig6;
                                reviewCapturedImage = reviewCapturedImage2;
                                navigationStateManager = navigationStateManager2;
                                side3 = side8;
                                idPart$SideIdPart2 = idPart$SideIdPart6;
                                assetConfig = assetConfig2;
                                str4 = str30;
                                strings2 = strings3;
                                governmentIdStepStateManager5 = governmentIdStepStateManager;
                                GovernmentIdStateManagerUtilsKt.runAutoClassificationWorker(input, (GovernmentIdState.ReviewImageState) governmentIdState3, (SubtreeManager) governmentIdStepStateManager.lastChild, governmentIdStepStateManager.videoCaptureHelper, governmentIdStepStateManager.autoClassifyWorkerFactory, new TextFieldUIKt$TextField$4$1(1, governmentIdStepStateManager, GovernmentIdStepStateManager.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0, 25));
                                input3 = input;
                            } else {
                                strings2 = strings3;
                                reviewCapturedImage = reviewCapturedImage2;
                                z3 = z11;
                                captureConfig = captureConfig6;
                                idPart$SideIdPart2 = idPart$SideIdPart6;
                                navigationStateManager = navigationStateManager2;
                                assetConfig = assetConfig2;
                                governmentIdStepStateManager5 = governmentIdStepStateManager;
                                str4 = str30;
                                side3 = side8;
                                input3 = input;
                            }
                            RealImageLoader realImageLoader = governmentIdStepStateManager5.imageLoader;
                            String idClassKey4 = GovernmentIdKt.getIdClassKey(captureConfig);
                            strings2.getClass();
                            idClassKey4.getClass();
                            GovernmentIdWorkflow.Input.Strings strings4 = strings2;
                            String text4 = strings4.confirmCapture.getText(str4, idClassKey4, side3);
                            String str31 = text4 == null ? "" : text4;
                            String str32 = strings4.captureDisclaimer;
                            Screen.Overlay overlay = sideConfig3.overlay;
                            IdConfig.Side side9 = idPart$SideIdPart2.side;
                            IdClass idClass = GovernmentIdKt.getIdClass(captureConfig);
                            String str33 = frame.absoluteFilePath;
                            NavigationState navigationState2 = navigationStateManager.getNavigationState();
                            String str34 = strings4.buttonSubmit;
                            String str35 = strings4.buttonRetake;
                            String idClassKey5 = GovernmentIdKt.getIdClassKey(captureConfig);
                            idClassKey5.getClass();
                            String text5 = strings4.confirmCaptureTitle.getText(str4, idClassKey5, side3);
                            String str36 = text5 == null ? "" : text5;
                            StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = input3.styles;
                            String str37 = reviewCapturedImage.error;
                            NextStep.GovernmentId.AssetConfig.CapturePage capturePage = assetConfig.getCapturePage();
                            boolean z12 = z6 && !z3;
                            boolean z13 = reviewCapturedImage.submittingForAutoClassification;
                            StyleElements.Axis axis = input3.reviewCaptureButtonsAxis;
                            DesignVersion designVersion = input3.designVersion;
                            pOPMatchingFactory.getClass();
                            autoClassificationConfig = autoClassificationConfig3;
                            int i10 = 0;
                            GovernmentIdStepStateManager governmentIdStepStateManager6 = governmentIdStepStateManager5;
                            newCameraScreen$default2 = new Screen.ReviewScreen(realImageLoader, str31, str32, overlay, str33, side9, idClass, navigationState2, new GovernmentIdStepStateManager$$ExternalSyntheticLambda2(input3, governmentIdState3, governmentIdStepStateManager5, i10), str34, new UiWorkflow$$ExternalSyntheticLambda25(governmentIdStepStateManager6, governmentIdState3, input3, captureConfig, 18), str35, str36, new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager6, 11), governmentIdStepStyle2, str37, new GovernmentIdStepStateManager$$ExternalSyntheticLambda5(governmentIdStepStateManager6, governmentIdState3, i10), capturePage, z12, z13, axis, designVersion, POPMatchingFactory.isVideoCapture(input3) && autoClassificationConfig.isEnabled, screenTransition);
                            governmentIdStepStateManager3 = governmentIdStepStateManager6;
                        } else {
                            autoClassificationConfig = autoClassificationConfig3;
                            if (governmentIdState3 instanceof GovernmentIdState.ReviewSelectedImage) {
                                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, null, 4, null), false, 2, null);
                                GovernmentIdState.ReviewSelectedImage reviewSelectedImage = (GovernmentIdState.ReviewSelectedImage) governmentIdState3;
                                GovernmentId governmentId = reviewSelectedImage.idForReview;
                                IdPart$SideIdPart idPart$SideIdPart7 = reviewSelectedImage.currentPart;
                                if (reviewSelectedImage.submittingForAutoClassification) {
                                    idPart$SideIdPart = idPart$SideIdPart7;
                                    strings = strings3;
                                    governmentIdStepStateManager4 = governmentIdStepStateManager;
                                    GovernmentIdStateManagerUtilsKt.runAutoClassificationWorker(input, (GovernmentIdState.ReviewImageState) governmentIdState3, (SubtreeManager) governmentIdStepStateManager.lastChild, governmentIdStepStateManager.videoCaptureHelper, governmentIdStepStateManager.autoClassifyWorkerFactory, new TextFieldUIKt$TextField$4$1(1, governmentIdStepStateManager, GovernmentIdStepStateManager.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0, 26));
                                    input2 = input;
                                } else {
                                    input2 = input;
                                    idPart$SideIdPart = idPart$SideIdPart7;
                                    strings = strings3;
                                    governmentIdStepStateManager4 = governmentIdStepStateManager;
                                }
                                RealImageLoader realImageLoader2 = governmentIdStepStateManager4.imageLoader;
                                IdConfig.Side side10 = idPart$SideIdPart.side;
                                strings.getClass();
                                side10.getClass();
                                GovernmentIdWorkflow.Input.Strings strings5 = strings;
                                String str38 = (String) strings5.reviewSelectedImageTitle.get(side10);
                                String str39 = str38 == null ? "" : str38;
                                IdConfig.Side side11 = idPart$SideIdPart.side;
                                side11.getClass();
                                String str40 = (String) strings5.reviewSelectedImageBody.get(side11);
                                newCameraScreen$default2 = new Screen.ReviewSelectedImageScreen(realImageLoader2, str39, str40 == null ? "" : str40, strings5.reviewSelectedImageConfirmButton, strings5.reviewSelectedImageChooseAnotherButton, ((Frame) CollectionsKt.first(governmentId.getFrames())).absoluteFilePath, ((Frame) CollectionsKt.first(governmentId.getFrames())).mimeType, reviewSelectedImage.fileName, navigationStateManager2.getNavigationState(), new GovernmentIdStepStateManager$$ExternalSyntheticLambda2(input2, governmentIdState3, governmentIdStepStateManager4, 2), new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager4, 12), new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager4, 13), new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager4, 14), reviewSelectedImage.error, new GovernmentIdStepStateManager$$ExternalSyntheticLambda5(governmentIdStepStateManager4, governmentIdState3, i3), input2.styles, reviewSelectedImage.submittingForAutoClassification, screenTransition);
                                governmentIdStepStateManager3 = governmentIdStepStateManager4;
                            } else {
                                governmentIdStepStateManager3 = governmentIdStepStateManager;
                                if (governmentIdState3 instanceof GovernmentIdState.Submit) {
                                    GovernmentIdState.Submit submit = (GovernmentIdState.Submit) governmentIdState3;
                                    if (!submit.hasSubmitted) {
                                        subtreeManager4.runningWorker(governmentIdStepStateManager3.submitVerificationWorkerFactory.create(input.sessionToken, input.inquiryId, input.fromComponent, input.fromStep, submit.governmentIdRequestArguments, submit.webRtcObjectId, submit.cameraProperties), new HCaptcha$$ExternalSyntheticLambda1(15, governmentIdStepStateManager3, governmentIdState3));
                                    }
                                    NavigationStateManager.setState$default(navigationStateManager2, false, false, false, 12);
                                    newCameraScreen$default2 = new Screen.SubmittingScreen(strings3.processingTitle, strings3.processingDescription, input.styles, assetConfig2.getPendingPage(), navigationStateManager2.getNavigationState(), new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager3, 2), new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager3, 3), input.pendingPageTextVerticalPosition, screenTransition, 256);
                                } else if (!(governmentIdState3 instanceof GovernmentIdState.FinalizeLocalVideoCapture)) {
                                    subtreeManager = subtreeManager4;
                                    if (governmentIdState3 instanceof GovernmentIdState.FinalizeWebRtc) {
                                        boolean z14 = autoClassificationConfig.isEnabled;
                                        GovIdWebRtcRenderer govIdWebRtcRenderer = governmentIdStepStateManager.webRtcRenderer;
                                        if (z14) {
                                            final GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda13 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(governmentIdStepStateManager, 2);
                                            govIdWebRtcRenderer.getClass();
                                            NavigationStateManager navigationStateManager3 = govIdWebRtcRenderer.navigationStateManager;
                                            subtreeManager.getClass();
                                            pOPMatchingFactory.getClass();
                                            final int i11 = 0;
                                            NavigationStateManager.setState$default(navigationStateManager3, false, false, false, 12);
                                            final int i12 = 1;
                                            newCameraScreen$default = new Screen.SubmittingScreen(strings3.processingTitle, strings3.processingDescription, input.styles, assetConfig2.getPendingPage(), navigationStateManager3.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdWebRtcRenderer$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i13 = i11;
                                                    GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
                                                    GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda14 = governmentIdStepStateManager$$ExternalSyntheticLambda13;
                                                    switch (i13) {
                                                        case 0:
                                                            governmentIdStepStateManager$$ExternalSyntheticLambda14.invoke(canceled);
                                                            break;
                                                        default:
                                                            governmentIdStepStateManager$$ExternalSyntheticLambda14.invoke(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdWebRtcRenderer$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i13 = i12;
                                                    GovernmentIdWorkflow.Output.Canceled canceled = GovernmentIdWorkflow.Output.Canceled.INSTANCE;
                                                    GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda14 = governmentIdStepStateManager$$ExternalSyntheticLambda13;
                                                    switch (i13) {
                                                        case 0:
                                                            governmentIdStepStateManager$$ExternalSyntheticLambda14.invoke(canceled);
                                                            break;
                                                        default:
                                                            governmentIdStepStateManager$$ExternalSyntheticLambda14.invoke(canceled);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, input.pendingPageTextVerticalPosition, screenTransition, 256);
                                            governmentIdState3 = governmentIdState3;
                                            governmentIdStepStateManager3 = governmentIdStepStateManager;
                                            autoClassificationConfig2 = autoClassificationConfig;
                                        } else {
                                            GovernmentIdState.FinalizeWebRtc finalizeWebRtc = (GovernmentIdState.FinalizeWebRtc) governmentIdState3;
                                            GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda14 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(governmentIdStepStateManager, 3);
                                            govIdWebRtcRenderer.getClass();
                                            subtreeManager.getClass();
                                            pOPMatchingFactory.getClass();
                                            IdPart$SideIdPart idPart$SideIdPart8 = finalizeWebRtc.currentPart;
                                            IdConfig idConfig3 = finalizeWebRtc.id;
                                            if (idPart$SideIdPart8 == null) {
                                                idPart$SideIdPart8 = null;
                                            }
                                            if (idPart$SideIdPart8 == null || (side = idPart$SideIdPart8.side) == null) {
                                                side = IdConfig.Side.Front;
                                            }
                                            IdConfig.Side side12 = side;
                                            IdConfig.IdSideConfig sideConfig4 = idConfig3.getSideConfig(side12);
                                            String captureScreenTitle3 = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings3, side12, idConfig3.idClassKey, finalizeWebRtc.countryCode);
                                            String str41 = strings3.capturing;
                                            Screen.CameraScreen.ManualCapture manualCapture = Screen.CameraScreen.ManualCapture.Disabled;
                                            IdClass idClass2 = idConfig3.f1453type;
                                            Screen.Overlay overlay2 = sideConfig4.overlay;
                                            NavigationState navigationState3 = govIdWebRtcRenderer.navigationStateManager.getNavigationState();
                                            EmptyList emptyList = EmptyList.INSTANCE;
                                            int i13 = finalizeWebRtc.partIndex;
                                            HCaptcha$$ExternalSyntheticLambda1 hCaptcha$$ExternalSyntheticLambda1 = new HCaptcha$$ExternalSyntheticLambda1(14, governmentIdStepStateManager$$ExternalSyntheticLambda14, subtreeManager);
                                            VideoCaptureMethod videoCaptureMethod3 = VideoCaptureMethod.Stream;
                                            CameraXController_Factory_Impl cameraXController_Factory_Impl = govIdWebRtcRenderer.cameraXControllerFactory;
                                            Camera2Controller_Factory_Impl camera2Controller_Factory_Impl = govIdWebRtcRenderer.camera2ControllerFactory;
                                            Equals$$ExternalSyntheticLambda0 equals$$ExternalSyntheticLambda0 = new Equals$$ExternalSyntheticLambda0(11);
                                            int i14 = 17;
                                            CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda0 = new CameraHelper$$ExternalSyntheticLambda0(governmentIdStepStateManager$$ExternalSyntheticLambda14, i14);
                                            UiScreenRunner$$ExternalSyntheticLambda29 uiScreenRunner$$ExternalSyntheticLambda29 = new UiScreenRunner$$ExternalSyntheticLambda29(subtreeManager, input, pOPMatchingFactory, governmentIdStepStateManager$$ExternalSyntheticLambda14, 5);
                                            pOPMatchingFactory = pOPMatchingFactory;
                                            autoClassificationConfig2 = autoClassificationConfig;
                                            newCameraScreen$default2 = GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle3, str41, manualCapture, overlay2, idClass2, side12, navigationState3, equals$$ExternalSyntheticLambda0, cameraHelper$$ExternalSyntheticLambda0, uiScreenRunner$$ExternalSyntheticLambda29, false, emptyList, finalizeWebRtc, i13, cameraXController_Factory_Impl, camera2Controller_Factory_Impl, null, new DocumentWorkflow$$ExternalSyntheticLambda7(26), hCaptcha$$ExternalSyntheticLambda1, videoCaptureMethod3, false, null, new ShimmerThemeKt$$ExternalSyntheticLambda0(i14), new UiScreenRunner$$ExternalSyntheticLambda29(6, govIdWebRtcRenderer, subtreeManager, input), 0, null, null, screenTransition, -1316880384, 0);
                                            governmentIdStepStateManager3 = governmentIdStepStateManager;
                                            governmentIdState3 = governmentIdState;
                                            subtreeManager2 = subtreeManager;
                                            obj4 = newCameraScreen$default2;
                                            pOPMatchingFactory2 = pOPMatchingFactory;
                                        }
                                    } else {
                                        autoClassificationConfig2 = autoClassificationConfig;
                                        if (governmentIdState3 instanceof GovernmentIdState.HolographicTorchDelay) {
                                            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = (GovernmentIdState.HolographicTorchDelay) governmentIdState3;
                                            GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda15 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(governmentIdStepStateManager, 4);
                                            govIdCaptureRenderer2.getClass();
                                            subtreeManager.getClass();
                                            pOPMatchingFactory.getClass();
                                            subtreeManager.runningSideEffect("holographic_torch_delay", new DataStoreImpl$readDataOrHandleCorruption$3(holographicTorchDelay, subtreeManager, input, pOPMatchingFactory, null, 19));
                                            IdConfig.Side side13 = holographicTorchDelay.currentPart.side;
                                            IdConfig idConfig4 = holographicTorchDelay.id;
                                            IdConfig.IdSideConfig sideConfig5 = idConfig4.getSideConfig(side13);
                                            String captureScreenTitle4 = GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings3, side13, idConfig4.idClassKey, holographicTorchDelay.countryCode);
                                            String str42 = strings3.capturing;
                                            Screen.CameraScreen.ManualCapture manualCapture2 = Screen.CameraScreen.ManualCapture.Disabled;
                                            Screen.Overlay overlay3 = sideConfig5.overlay;
                                            IdClass idClass3 = idConfig4.f1453type;
                                            NavigationState navigationState4 = govIdCaptureRenderer2.navigationStateManager.getNavigationState();
                                            EmptyList emptyList2 = EmptyList.INSTANCE;
                                            int i15 = holographicTorchDelay.partIndex;
                                            HCaptcha$$ExternalSyntheticLambda1 hCaptcha$$ExternalSyntheticLambda12 = new HCaptcha$$ExternalSyntheticLambda1(14, governmentIdStepStateManager$$ExternalSyntheticLambda15, subtreeManager);
                                            VideoCaptureMethod videoCaptureMethod4 = POPMatchingFactory.videoCaptureMethod(input);
                                            CameraXController_Factory_Impl cameraXController_Factory_Impl2 = govIdCaptureRenderer2.cameraXControllerFactory;
                                            Camera2Controller_Factory_Impl camera2Controller_Factory_Impl2 = govIdCaptureRenderer2.camera2ControllerFactory;
                                            CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda02 = new CameraHelper$$ExternalSyntheticLambda0(governmentIdStepStateManager$$ExternalSyntheticLambda15, 13);
                                            HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9 = new HeroCardViewKt$$ExternalSyntheticLambda9(subtreeManager, input, pOPMatchingFactory, governmentIdStepStateManager$$ExternalSyntheticLambda15, 29);
                                            pOPMatchingFactory = pOPMatchingFactory;
                                            UiScreenRunner$$ExternalSyntheticLambda29 uiScreenRunner$$ExternalSyntheticLambda292 = new UiScreenRunner$$ExternalSyntheticLambda29(1, govIdCaptureRenderer2, subtreeManager, input);
                                            subtreeManager = subtreeManager;
                                            newCameraScreen$default = GovernmentIdScreenKt.newCameraScreen$default(input, captureScreenTitle4, str42, manualCapture2, overlay3, idClass3, side13, navigationState4, null, cameraHelper$$ExternalSyntheticLambda02, heroCardViewKt$$ExternalSyntheticLambda9, false, emptyList2, holographicTorchDelay, i15, cameraXController_Factory_Impl2, camera2Controller_Factory_Impl2, null, null, hCaptcha$$ExternalSyntheticLambda12, videoCaptureMethod4, false, null, null, uiScreenRunner$$ExternalSyntheticLambda292, 0, null, null, null, 870711552, 1);
                                            governmentIdStepStateManager3 = governmentIdStepStateManager;
                                            governmentIdState3 = governmentIdState;
                                        } else {
                                            if (z2) {
                                                AutoClassificationErrorType autoClassificationErrorType = ((GovernmentIdState.AutoClassificationError) governmentIdState).errorType;
                                                GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda16 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(governmentIdStepStateManager, i8);
                                                govIdAutoClassificationRenderer.getClass();
                                                subtreeManager.getClass();
                                                pOPMatchingFactory.getClass();
                                                int ordinal3 = autoClassificationErrorType.ordinal();
                                                if (ordinal3 != 0) {
                                                    i = 1;
                                                    if (ordinal3 != 1) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    str2 = strings3.unableToClassifyDocumentTitle;
                                                } else {
                                                    i = 1;
                                                    str2 = strings3.idClassRejectedTitle;
                                                }
                                                String str43 = str2;
                                                int ordinal4 = autoClassificationErrorType.ordinal();
                                                if (ordinal4 == 0) {
                                                    str3 = strings3.idClassRejectedContinueButtonText;
                                                } else {
                                                    if (ordinal4 != i) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    str3 = strings3.unableToClassifyDocumentContinueButtonText;
                                                }
                                                governmentIdState3 = governmentIdState;
                                                governmentIdStepStateManager3 = governmentIdStepStateManager;
                                                autoClassificationSelectCountryAndIdClassScreen = new Screen.ErrorScreen(str43, str3, input.styles, govIdAutoClassificationRenderer.navigationStateManager.getNavigationState(), new CameraHelper$$ExternalSyntheticLambda0(subtreeManager, 11), new HeroCardViewKt$$ExternalSyntheticLambda9(subtreeManager, input, pOPMatchingFactory, governmentIdStepStateManager$$ExternalSyntheticLambda16, 26), new CameraHelper$$ExternalSyntheticLambda0(governmentIdStepStateManager$$ExternalSyntheticLambda16, 12), POPMatchingFactory.isVideoCapture(input), screenTransition);
                                                subtreeManager2 = subtreeManager;
                                                pOPMatchingFactory2 = pOPMatchingFactory;
                                            } else {
                                                governmentIdStepStateManager3 = governmentIdStepStateManager;
                                                governmentIdState3 = governmentIdState;
                                                POPMatchingFactory pOPMatchingFactory4 = pOPMatchingFactory;
                                                if (!(governmentIdState3 instanceof GovernmentIdState.AutoClassificationManualSelect)) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = (GovernmentIdState.AutoClassificationManualSelect) governmentIdState3;
                                                GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda17 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(governmentIdStepStateManager3, 6);
                                                govIdAutoClassificationRenderer.getClass();
                                                subtreeManager.getClass();
                                                pOPMatchingFactory4.getClass();
                                                String str44 = autoClassificationManualSelect.selectedCountryCode;
                                                String str45 = autoClassificationManualSelect.selectedIdClass;
                                                List list3 = autoClassificationManualSelect.idConfigsForCountry;
                                                if (str44 == null) {
                                                    iterable = EmptyList.INSTANCE;
                                                } else {
                                                    Iterator it4 = list3.iterator();
                                                    while (true) {
                                                        if (!it4.hasNext()) {
                                                            obj = null;
                                                            break;
                                                        }
                                                        obj = it4.next();
                                                        if (Intrinsics.areEqual(((IdConfigForCountry) obj).countryCode, str44)) {
                                                            break;
                                                        }
                                                    }
                                                    IdConfigForCountry idConfigForCountry = (IdConfigForCountry) obj;
                                                    iterable = idConfigForCountry != null ? idConfigForCountry.ids : EmptyList.INSTANCE;
                                                }
                                                Iterable iterable2 = iterable;
                                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                                                Iterator it5 = iterable2.iterator();
                                                while (it5.hasNext()) {
                                                    IdConfig idConfig5 = (IdConfig) it5.next();
                                                    POPMatchingFactory pOPMatchingFactory5 = pOPMatchingFactory4;
                                                    GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda18 = governmentIdStepStateManager$$ExternalSyntheticLambda17;
                                                    List list4 = strings3.localizationOverrides;
                                                    if (list4 != null) {
                                                        String str46 = idConfig5.idClassKey;
                                                        Iterator it6 = list4.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                it = it5;
                                                                list = list3;
                                                                obj3 = null;
                                                                break;
                                                            }
                                                            Object next = it6.next();
                                                            NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) next;
                                                            it = it5;
                                                            list = list3;
                                                            if (StringsKt__StringsJVMKt.equals(localizationOverride.getCountryCode(), str44, true) && Intrinsics.areEqual(localizationOverride.getPage(), "selectPage") && ((Intrinsics.areEqual(localizationOverride.getIdClass(), str46) || localizationOverride.getIdClass() == null) && Intrinsics.areEqual(localizationOverride.getKey(), str46))) {
                                                                obj3 = next;
                                                                break;
                                                            }
                                                            it5 = it;
                                                            list3 = list;
                                                        }
                                                        NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) obj3;
                                                        str = localizationOverride2 != null ? localizationOverride2.getText() : null;
                                                        if (str != null) {
                                                            arrayList3.add(new Option(str, idConfig5.idClassKey));
                                                            pOPMatchingFactory4 = pOPMatchingFactory5;
                                                            governmentIdStepStateManager$$ExternalSyntheticLambda17 = governmentIdStepStateManager$$ExternalSyntheticLambda18;
                                                            it5 = it;
                                                            list3 = list;
                                                        }
                                                    } else {
                                                        it = it5;
                                                        list = list3;
                                                    }
                                                    str = (String) strings3.idClassToName.get(idConfig5.idClassKey);
                                                    if (str == null) {
                                                        str = idConfig5.idClassKey;
                                                    }
                                                    arrayList3.add(new Option(str, idConfig5.idClassKey));
                                                    pOPMatchingFactory4 = pOPMatchingFactory5;
                                                    governmentIdStepStateManager$$ExternalSyntheticLambda17 = governmentIdStepStateManager$$ExternalSyntheticLambda18;
                                                    it5 = it;
                                                    list3 = list;
                                                }
                                                POPMatchingFactory pOPMatchingFactory6 = pOPMatchingFactory4;
                                                GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda19 = governmentIdStepStateManager$$ExternalSyntheticLambda17;
                                                List list5 = list3;
                                                if (str45 == null) {
                                                    idConfig = null;
                                                } else {
                                                    Iterator it7 = iterable2.iterator();
                                                    while (true) {
                                                        if (!it7.hasNext()) {
                                                            obj2 = null;
                                                            break;
                                                        }
                                                        obj2 = it7.next();
                                                        if (Intrinsics.areEqual(((IdConfig) obj2).idClassKey, str45)) {
                                                            break;
                                                        }
                                                    }
                                                    idConfig = (IdConfig) obj2;
                                                }
                                                String str47 = strings3.manualClassificationTitle;
                                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = input.styles;
                                                List list6 = list5;
                                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                                for (Iterator it8 = list6.iterator(); it8.hasNext(); it8 = it8) {
                                                    IdConfigForCountry idConfigForCountry2 = (IdConfigForCountry) it8.next();
                                                    String str48 = idConfigForCountry2.countryCode;
                                                    arrayList4.add(new Screen.AutoClassificationSelectCountryAndIdClassScreen.CountryOption(str48, idConfigForCountry2.countryName, AnimatorSetCompat.countryCodeToFlagEmoji(str48)));
                                                }
                                                String str49 = strings3.countryInputTitle;
                                                subtreeManager2 = subtreeManager;
                                                pOPMatchingFactory2 = pOPMatchingFactory6;
                                                autoClassificationSelectCountryAndIdClassScreen = new Screen.AutoClassificationSelectCountryAndIdClassScreen(str47, governmentIdStepStyle3, arrayList4, autoClassificationManualSelect.selectedCountryCode, arrayList3, autoClassificationManualSelect.selectedIdClass, str49, strings3.idClassInputTitle, strings3.manualClassificationContinueButtonText, idConfig != null, govIdAutoClassificationRenderer.navigationStateManager.getNavigationState(), input.designVersion, new SelfieV1UtilsKt$$ExternalSyntheticLambda2(subtreeManager, 1), new SelfieV1UtilsKt$$ExternalSyntheticLambda2(subtreeManager, 2), new ta$$ExternalSyntheticLambda1(idConfig, autoClassificationManualSelect, subtreeManager, input, pOPMatchingFactory6, 22), new HeroCardViewKt$$ExternalSyntheticLambda9(subtreeManager2, input, pOPMatchingFactory2, governmentIdStepStateManager$$ExternalSyntheticLambda19, 25), new CameraHelper$$ExternalSyntheticLambda0(governmentIdStepStateManager$$ExternalSyntheticLambda19, 10), screenTransition);
                                            }
                                            obj4 = autoClassificationSelectCountryAndIdClassScreen;
                                        }
                                    }
                                    obj4 = newCameraScreen$default;
                                } else if (autoClassificationConfig.isEnabled) {
                                    NavigationStateManager.setState$default(navigationStateManager2, false, false, false, 12);
                                    newCameraScreen$default2 = new Screen.SubmittingScreen(strings3.processingTitle, strings3.processingDescription, input.styles, assetConfig2.getPendingPage(), navigationStateManager2.getNavigationState(), (Function0) new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager3, 4), (Function0) new GovernmentIdStepStateManager$$ExternalSyntheticLambda0(governmentIdStepStateManager3, i8), input.pendingPageTextVerticalPosition, true, screenTransition);
                                } else {
                                    GovIdLocalVideoCaptureRenderer govIdLocalVideoCaptureRenderer = governmentIdStepStateManager3.localVideoCaptureRenderer;
                                    GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (GovernmentIdState.FinalizeLocalVideoCapture) governmentIdState3;
                                    GovernmentIdStepStateManager$$ExternalSyntheticLambda1 governmentIdStepStateManager$$ExternalSyntheticLambda110 = new GovernmentIdStepStateManager$$ExternalSyntheticLambda1(governmentIdStepStateManager3, 1);
                                    govIdLocalVideoCaptureRenderer.getClass();
                                    subtreeManager4.getClass();
                                    pOPMatchingFactory.getClass();
                                    subtreeManager4.runningSideEffect("finalize_delay", new ResetViewModel.AnonymousClass1(finalizeLocalVideoCapture, subtreeManager4, null, 4));
                                    IdPart$SideIdPart idPart$SideIdPart9 = finalizeLocalVideoCapture.currentPart;
                                    IdConfig idConfig6 = finalizeLocalVideoCapture.id;
                                    if (idPart$SideIdPart9 == null) {
                                        idPart$SideIdPart9 = null;
                                    }
                                    if (idPart$SideIdPart9 == null || (side2 = idPart$SideIdPart9.side) == null) {
                                        side2 = IdConfig.Side.Front;
                                    }
                                    IdConfig.Side side14 = side2;
                                    IdConfig.IdSideConfig sideConfig6 = idConfig6.getSideConfig(side14);
                                    governmentIdStepStateManager3 = governmentIdStepStateManager;
                                    governmentIdState3 = governmentIdState;
                                    obj4 = GovernmentIdScreenKt.newCameraScreen$default(input, GovernmentIdWorkflowUtilsKt.getCaptureScreenTitle(strings3, side14, idConfig6.idClassKey, finalizeLocalVideoCapture.countryCode), strings3.capturing, Screen.CameraScreen.ManualCapture.Disabled, sideConfig6.overlay, idConfig6.f1453type, side14, govIdLocalVideoCaptureRenderer.navigationStateManager.getNavigationState(), new Equals$$ExternalSyntheticLambda0(10), new CameraHelper$$ExternalSyntheticLambda0(governmentIdStepStateManager$$ExternalSyntheticLambda110, 16), new UiScreenRunner$$ExternalSyntheticLambda29(3, subtreeManager4, input, governmentIdStepStateManager$$ExternalSyntheticLambda110), false, EmptyList.INSTANCE, finalizeLocalVideoCapture, finalizeLocalVideoCapture.partIndex, govIdLocalVideoCaptureRenderer.cameraXControllerFactory, govIdLocalVideoCaptureRenderer.camera2ControllerFactory, null, new DocumentWorkflow$$ExternalSyntheticLambda7(25), new HCaptcha$$ExternalSyntheticLambda1(14, governmentIdStepStateManager$$ExternalSyntheticLambda110, subtreeManager4), VideoCaptureMethod.Upload, finalizeLocalVideoCapture.isDelayComplete, new WalletHomeViewKt$$ExternalSyntheticLambda4(govIdLocalVideoCaptureRenderer, finalizeLocalVideoCapture, input, pOPMatchingFactory, subtreeManager4, 13), new ShimmerThemeKt$$ExternalSyntheticLambda0(16), new UiScreenRunner$$ExternalSyntheticLambda29(4, govIdLocalVideoCaptureRenderer, subtreeManager4, input), 0, null, null, screenTransition, -1342046208, 0);
                                    pOPMatchingFactory2 = pOPMatchingFactory;
                                    subtreeManager2 = subtreeManager4;
                                    autoClassificationConfig2 = autoClassificationConfig;
                                }
                            }
                        }
                        subtreeManager2 = subtreeManager4;
                        autoClassificationConfig2 = autoClassificationConfig;
                        obj4 = newCameraScreen$default2;
                        pOPMatchingFactory2 = pOPMatchingFactory;
                    }
                    pOPMatchingFactory2 = pOPMatchingFactory;
                    subtreeManager2 = subtreeManager;
                }
                if (!(governmentIdState3 instanceof GovernmentIdState.CountdownToCapture) && !(governmentIdState3 instanceof GovernmentIdState.FinalizeWebRtc) && !(governmentIdState3 instanceof GovernmentIdState.WaitForAutocapture) && !(governmentIdState3 instanceof GovernmentIdState.FinalizeLocalVideoCapture) && !(governmentIdState3 instanceof GovernmentIdState.HolographicTorchDelay)) {
                    if (!(governmentIdState3 instanceof GovernmentIdState.ReviewCapturedImage)) {
                        pOPMatchingFactory2.getClass();
                        if (POPMatchingFactory.isVideoCapture(input)) {
                        }
                    } else if (!(governmentIdState3 instanceof GovernmentIdState.ChooseCaptureMethod) && !(governmentIdState3 instanceof GovernmentIdState.ReviewSelectedImage) && !z && !(governmentIdState3 instanceof GovernmentIdState.Submit) && !z2 && !(governmentIdState3 instanceof GovernmentIdState.AutoClassificationManualSelect)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    continuation2 = null;
                    subtreeManager2.runningSideEffect("close_camera", new WebRtcWorker$run$1.AnonymousClass1(governmentIdStepStateManager3, continuation2, 14));
                    pOPMatchingFactory2.getClass();
                    if (!POPMatchingFactory.webRtcConfigIsValid(input) && ContextUtilsKt.isDebugBuild(context)) {
                        subtreeManager2.runningSideEffect("output_webrtc_error", new GovernmentIdStepStateManager$handleState$3(governmentIdStepStateManager3, continuation2));
                    }
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    Object withContext = JobKt.withContext(MainDispatcherLoader.dispatcher, new TransitionWorker$run$1(governmentIdStepStateManager3, obj4, continuation2, 6), continuation);
                    return withContext != CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
                }
                continuation2 = null;
                pOPMatchingFactory2.getClass();
                if (!POPMatchingFactory.webRtcConfigIsValid(input)) {
                    subtreeManager2.runningSideEffect("output_webrtc_error", new GovernmentIdStepStateManager$handleState$3(governmentIdStepStateManager3, continuation2));
                }
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                Object withContext2 = JobKt.withContext(MainDispatcherLoader.dispatcher, new TransitionWorker$run$1(governmentIdStepStateManager3, obj4, continuation2, 6), continuation);
                if (withContext2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
            }
        }
        governmentIdStepStateManager3 = governmentIdStepStateManager2;
        governmentIdState3 = governmentIdState2;
        z = z8;
        subtreeManager2 = subtreeManager4;
        autoClassificationConfig2 = autoClassificationConfig3;
        pOPMatchingFactory2 = pOPMatchingFactory3;
        context = context3;
        z2 = z7;
        obj4 = autoClassificationSelectCountryAndIdClassScreen;
        if (!(governmentIdState3 instanceof GovernmentIdState.CountdownToCapture)) {
            if (!(governmentIdState3 instanceof GovernmentIdState.ReviewCapturedImage)) {
            }
            continuation2 = null;
            subtreeManager2.runningSideEffect("close_camera", new WebRtcWorker$run$1.AnonymousClass1(governmentIdStepStateManager3, continuation2, 14));
            pOPMatchingFactory2.getClass();
            if (!POPMatchingFactory.webRtcConfigIsValid(input)) {
            }
            DefaultScheduler defaultScheduler22 = Dispatchers.Default;
            Object withContext22 = JobKt.withContext(MainDispatcherLoader.dispatcher, new TransitionWorker$run$1(governmentIdStepStateManager3, obj4, continuation2, 6), continuation);
            if (withContext22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
        }
        continuation2 = null;
        pOPMatchingFactory2.getClass();
        if (!POPMatchingFactory.webRtcConfigIsValid(input)) {
        }
        DefaultScheduler defaultScheduler222 = Dispatchers.Default;
        Object withContext222 = JobKt.withContext(MainDispatcherLoader.dispatcher, new TransitionWorker$run$1(governmentIdStepStateManager3, obj4, continuation2, 6), continuation);
        if (withContext222 != CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
    }

    public final void goBack() {
        GovernmentIdState governmentIdState = (GovernmentIdState) ((SubtreeManager) this.lastChild).getState();
        GovernmentIdState backState$government_id_release = governmentIdState != null ? governmentIdState.getBackState$government_id_release() : null;
        this.videoCaptureHelper.getClass();
        if (backState$government_id_release != null) {
            backState$government_id_release.didGoBack = true;
            updateState(backState$government_id_release);
        } else if (((GovernmentIdWorkflow.Input) ((StateFlowImpl) this.firstChild).getValue()).backStepEnabled) {
            setOutput(GovernmentIdWorkflow.Output.Back.INSTANCE);
        } else {
            setOutput(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        }
    }
}
