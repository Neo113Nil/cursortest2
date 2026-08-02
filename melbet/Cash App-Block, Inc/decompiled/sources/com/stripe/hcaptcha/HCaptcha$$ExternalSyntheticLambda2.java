package com.stripe.hcaptcha;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.camera.video.VideoCapture;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.common.util.StuckPlayerDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.size.DimensionKt;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.android.play.integrity.internal.ah;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.internal.SubtreeManager;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.android.PaymentRelayStarter$Legacy;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2NextActionHandler;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.android.view.ActivityHost;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepViewModel;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagService;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView;
import com.withpersona.sdk2.inquiry.governmentid.ConversionsKt;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.OverridableText;
import com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2ErrorBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCaptureTipsBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidChooseCaptureMethodBinding;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewSelectedImageBinding;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepViewModel;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepViewModel;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker;
import com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker;
import com.withpersona.sdk2.inquiry.internal.InquiryErrorMessagesKt;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.PollingMode;
import com.withpersona.sdk2.inquiry.internal.PollingWorker;
import com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory;
import com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker;
import com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationManager;
import com.withpersona.sdk2.inquiry.internal.StepState;
import com.withpersona.sdk2.inquiry.internal.TransitionBackWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$Response;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$TransitionData;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2FragmentWorkflowBinding;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.internal.network.TransitionBackResult;
import com.withpersona.sdk2.inquiry.internal.state.CompleteStepModel;
import com.withpersona.sdk2.inquiry.internal.state.DocumentStepModel;
import com.withpersona.sdk2.inquiry.internal.state.DocumentStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepModel;
import com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda17;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda9;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderUiStep$2;
import com.withpersona.sdk2.inquiry.internal.state.IntegrationStepModel;
import com.withpersona.sdk2.inquiry.internal.state.IntegrationStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.LoadingStepModel;
import com.withpersona.sdk2.inquiry.internal.state.SelfieStepModel;
import com.withpersona.sdk2.inquiry.internal.state.SelfieStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.UiStepModel;
import com.withpersona.sdk2.inquiry.internal.state.UiStepWorkflowModel;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView;
import com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2RequestPermissionRationaleBinding;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestViewModel;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.selfie.DesignVersion;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieKt;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieTypeKt$WhenMappings;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryThemeManager;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.FontDownloader;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import dagger.Lazy;
import dagger.internal.Provider;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.MarkwonConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class HCaptcha$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HCaptcha$$ExternalSyntheticLambda2(CaptureRenderer captureRenderer, CameraChoices cameraChoices, WebRtcWorker.Response response, GovernmentIdState.WaitForAutocapture waitForAutocapture, GovernmentIdWorkflow.Input input, StatefulWorkflow.RenderContext renderContext) {
        this.$r8$classId = 20;
        this.f$0 = cameraChoices;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x01a6  */
    /* JADX WARN: Type inference failed for: r108v1, types: [com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$PromptPage, com.withpersona.sdk2.inquiry.network.dto.NextStep$Selfie$AssetConfig$RecordPage, java.lang.Object, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v153 */
    /* JADX WARN: Type inference failed for: r2v154, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v189 */
    /* JADX WARN: Type inference failed for: r46v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v101 */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.concurrent.CancellationException, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlinx.coroutines.StandaloneCoroutine] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v66, types: [kotlinx.coroutines.JobSupport, kotlinx.coroutines.StandaloneCoroutine] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invoke$com$withpersona$sdk2$inquiry$internal$state$InquiryStateManager$$ExternalSyntheticLambda0(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        ?? r4;
        Object obj2;
        SilentNetworkAuthenticationManager silentNetworkAuthenticationManager;
        boolean z4;
        InquiryState.SelfieStepRunning selfieStepRunning;
        String str;
        SilentNetworkAuthenticationManager.SnaParams snaParams;
        SilentNetworkAuthenticationManager.SnaParams snaParams2;
        Object loadingStepModel;
        String str2;
        InternalErrorInfo internalErrorInfo;
        boolean z5;
        Object documentStepModel;
        String str3;
        boolean z6;
        Object uiStepWorkflowModel;
        NextStep.Ui.PromptPage promptPage;
        NextStep.Ui.PromptPage promptPage2;
        NextStep.Ui.PromptPage promptPage3;
        NextStep.Ui.PromptPage promptPage4;
        NextStep.Ui.PromptPage promptPage5;
        NextStep.Ui.PromptPage promptPage6;
        NextStep.Ui.PromptPage promptPage7;
        ?? listOf;
        SelfieType selfieType;
        StepStyles.SelfieStepStyle selfieStepStyle;
        Selfie.Pose pose;
        NextStep.GovernmentId.Localizations localizations;
        String str4;
        ?? r9;
        Iterator it;
        Object obj3;
        String text;
        StandaloneCoroutine standaloneCoroutine;
        Object obj4;
        Object obj5;
        final InquiryStateManager inquiryStateManager = (InquiryStateManager) this.f$0;
        final InquiryState inquiryState = (InquiryState) obj;
        if (inquiryState == null) {
            return Unit.INSTANCE;
        }
        TransitionStatus.TransitioningBack transitioningBack = TransitionStatus.TransitioningBack.INSTANCE;
        TipsFeatureFlag tipsFeatureFlag = TipsFeatureFlag.INSTANCE$3;
        SubtreeManager subtreeManager = (SubtreeManager) inquiryStateManager.lastChild;
        final String sessionToken = inquiryState.getSessionToken();
        String inquiryId = inquiryState.getInquiryId();
        String fromStep = inquiryState.getFromStep();
        TransitionStatus transitionStatus = inquiryState.getTransitionStatus();
        int i2 = 15;
        if (!(transitionStatus instanceof TransitionStatus.Transitioning)) {
            Object obj6 = null;
            z = false;
            obj5 = obj6;
            obj5 = obj6;
            if (!(transitionStatus instanceof TransitionStatus.UpdateInquirySession)) {
                if (!(transitionStatus instanceof TransitionStatus.CheckingForNextState)) {
                    z2 = false;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    i = 15;
                    if (!Intrinsics.areEqual(transitionStatus, transitioningBack)) {
                        r4 = 0;
                        z = false;
                        if (transitionStatus != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    } else if (sessionToken == null || inquiryId == null || fromStep == null) {
                        obj2 = null;
                        z = z2;
                        r4 = obj2;
                    } else {
                        r4 = 0;
                        z = false;
                        TransitionBackWorker transitionBackWorker = new TransitionBackWorker(sessionToken, inquiryId, fromStep, inquiryState.getInquirySessionConfig(), (InquiryApiHelper) inquiryStateManager.transitionBackWorker.delegateFactory.inquiryApiHelperProvider.get());
                        final int i3 = z3 ? 1 : 0;
                        subtreeManager.runningWorker(transitionBackWorker, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda13
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i4 = i3;
                                String str5 = sessionToken;
                                InquiryState inquiryState2 = inquiryState;
                                InquiryStateManager inquiryStateManager2 = inquiryStateManager;
                                switch (i4) {
                                    case 0:
                                        TransitionWorker$Response transitionWorker$Response = (TransitionWorker$Response) obj7;
                                        transitionWorker$Response.getClass();
                                        if (!(transitionWorker$Response instanceof TransitionWorker$Response.Error)) {
                                            if (!(transitionWorker$Response instanceof TransitionWorker$Response.Success)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                InquiryState inquiryState3 = (InquiryState) ((SubtreeManager) inquiryStateManager2.lastChild).getState();
                                                if (inquiryState3 == null) {
                                                    break;
                                                } else {
                                                    inquiryStateManager2.updateState(inquiryState3.updateTransitionStatus(new TransitionStatus.UpdateInquirySession(((TransitionWorker$Response.Success) transitionWorker$Response).nextState, false)));
                                                }
                                            }
                                        } else {
                                            InquiryStateManager.runTransitionWorkerIfNeeded$handleError(inquiryStateManager2, inquiryState2, str5, ((TransitionWorker$Response.Error) transitionWorker$Response).cause);
                                        }
                                        break;
                                    default:
                                        TransitionBackResult transitionBackResult = (TransitionBackResult) obj7;
                                        transitionBackResult.getClass();
                                        if (!(transitionBackResult instanceof TransitionBackResult.Success)) {
                                            if (!(transitionBackResult instanceof TransitionBackResult.Error)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                InternalErrorInfo internalErrorInfo2 = ((TransitionBackResult.Error) transitionBackResult).cause;
                                                if (InquiryStateManager.isInconsistentStateError(internalErrorInfo2) && (inquiryState2 instanceof StepState)) {
                                                    inquiryStateManager2.updateState(InquiryStateManager.resyncState((StepState) inquiryState2));
                                                } else {
                                                    inquiryStateManager2.setErrorOutput(str5, internalErrorInfo2, null);
                                                }
                                            }
                                        } else {
                                            InquiryState inquiryState4 = ((TransitionBackResult.Success) transitionBackResult).nextState;
                                            inquiryState4.didGoBack = true;
                                            inquiryStateManager2.updateState(inquiryState4);
                                        }
                                        break;
                                }
                                return null;
                            }
                        });
                    }
                } else if (sessionToken == null || inquiryId == null) {
                    z3 = true;
                    r4 = 0;
                    i = 15;
                } else {
                    PollingWorker_Factory_Impl pollingWorker_Factory_Impl = inquiryStateManager.pollingWorker;
                    TransitionStatus.CheckingForNextState checkingForNextState = (TransitionStatus.CheckingForNextState) transitionStatus;
                    PollingMode pollingMode = checkingForNextState.pollingMode;
                    InquirySessionConfig inquirySessionConfig = inquiryState.getInquirySessionConfig();
                    boolean z7 = checkingForNextState.canReuseWorkflow;
                    PollingWorker_Factory pollingWorker_Factory = pollingWorker_Factory_Impl.delegateFactory;
                    PollingWorker pollingWorker = new PollingWorker(sessionToken, inquiryId, pollingMode, inquirySessionConfig, z7, (InquiryService) pollingWorker_Factory.serviceProvider.get(), (RealDeviceIdProvider) pollingWorker_Factory.deviceIdProvider.get(), (SandboxFlags) pollingWorker_Factory.sandboxFlagsProvider.get(), (RealFallbackModeManager) pollingWorker_Factory.fallbackModeManagerProvider.get(), (FontDownloader) pollingWorker_Factory.fontDownloaderProvider.get(), (InquiryThemeManager) pollingWorker_Factory.themeManagerProvider.get(), (InquiryApiHelper) pollingWorker_Factory.inquiryApiHelperProvider.get());
                    z2 = false;
                    z3 = true;
                    subtreeManager.runningWorker(pollingWorker, new OpenSourceKt$$ExternalSyntheticLambda9(27, inquiryStateManager, checkingForNextState, inquiryState, sessionToken));
                    obj2 = null;
                    i = 15;
                    z = z2;
                    r4 = obj2;
                }
                silentNetworkAuthenticationManager = inquiryStateManager.silentNetworkAuthenticationManager;
                silentNetworkAuthenticationManager.getClass();
                z4 = inquiryState instanceof InquiryState.GovernmentIdStepRunning;
                if (z4) {
                }
                if (snaParams2 != null) {
                    silentNetworkAuthenticationManager.currentJob = JobKt.launch$default(silentNetworkAuthenticationManager.scope, r4, r4, new TransitionWorker$run$1(silentNetworkAuthenticationManager, snaParams2, r4, 13), 3);
                }
                if (Intrinsics.areEqual(inquiryState.getTransitionStatus(), transitioningBack)) {
                }
                NavigationStateManager navigationStateManager = inquiryStateManager.navigationStateManager;
                navigationStateManager.isTransitioningBack = Intrinsics.areEqual(inquiryState.getTransitionStatus(), transitioningBack);
                navigationStateManager.updateScreenState();
                CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda0 = new CameraHelper$$ExternalSyntheticLambda0(inquiryStateManager, 24);
                ((SubtreeManager) inquiryStateManager.lastChild).runningSideEffect("controllerRequestCollector", new WebRtcWorker$run$1.AnonymousClass1(inquiryStateManager, r4, i));
                InquiryWorkflow$Props inquiryWorkflow$Props = (InquiryWorkflow$Props) ((StateFlowImpl) inquiryStateManager.firstChild).getValue();
                if (inquiryState instanceof InquiryState.CreateInquiryFromTemplate) {
                }
                StateFlowImpl stateFlowImpl = (StateFlowImpl) inquiryStateManager.next;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(str2, loadingStepModel);
                return Unit.INSTANCE;
            }
            if (sessionToken != null && inquiryId != null) {
                subtreeManager.runningWorker(new UpdateInquirySessionWorker(sessionToken, inquiryId, inquiryState.getInquirySessionConfig(), (InquiryApiHelper) inquiryStateManager.updateInquirySessionWorkerFactory.delegateFactory.inquiryApiHelperProvider.get()), new SelfieWorkflow$$ExternalSyntheticLambda38(i2, inquiryStateManager, sessionToken, (TransitionStatus.UpdateInquirySession) transitionStatus));
                obj5 = obj6;
            }
        } else {
            if (sessionToken == null || inquiryId == null) {
                i = 15;
                obj4 = null;
                z = false;
                z3 = true;
                r4 = obj4;
                silentNetworkAuthenticationManager = inquiryStateManager.silentNetworkAuthenticationManager;
                silentNetworkAuthenticationManager.getClass();
                z4 = inquiryState instanceof InquiryState.GovernmentIdStepRunning;
                if (z4) {
                    InquiryState.GovernmentIdStepRunning governmentIdStepRunning = (InquiryState.GovernmentIdStepRunning) inquiryState;
                    String str5 = governmentIdStepRunning.silentNetworkAuthenticationCheckUrl;
                    if (str5 != null && str5.length() != 0) {
                        snaParams = new SilentNetworkAuthenticationManager.SnaParams(governmentIdStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds, governmentIdStepRunning.sessionToken, str5);
                        snaParams2 = snaParams;
                    }
                    snaParams2 = r4;
                } else {
                    if ((inquiryState instanceof InquiryState.SelfieStepRunning) && (str = (selfieStepRunning = (InquiryState.SelfieStepRunning) inquiryState).silentNetworkAuthenticationCheckUrl) != null && str.length() != 0) {
                        snaParams = new SilentNetworkAuthenticationManager.SnaParams(selfieStepRunning.silentNetworkAuthenticationBackgroundTimeoutSeconds, selfieStepRunning.sessionToken, str);
                        snaParams2 = snaParams;
                    }
                    snaParams2 = r4;
                }
                if (snaParams2 != null && ((standaloneCoroutine = silentNetworkAuthenticationManager.currentJob) == null || standaloneCoroutine.isActive() != z3)) {
                    silentNetworkAuthenticationManager.currentJob = JobKt.launch$default(silentNetworkAuthenticationManager.scope, r4, r4, new TransitionWorker$run$1(silentNetworkAuthenticationManager, snaParams2, r4, 13), 3);
                }
                if (Intrinsics.areEqual(inquiryState.getTransitionStatus(), transitioningBack)) {
                    SilentNetworkAuthenticationManager silentNetworkAuthenticationManager2 = inquiryStateManager.silentNetworkAuthenticationManager;
                    ?? r92 = silentNetworkAuthenticationManager2.currentJob;
                    if (r92 != 0) {
                        r92.cancel(r4);
                    }
                    silentNetworkAuthenticationManager2.currentJob = r4;
                }
                NavigationStateManager navigationStateManager2 = inquiryStateManager.navigationStateManager;
                navigationStateManager2.isTransitioningBack = Intrinsics.areEqual(inquiryState.getTransitionStatus(), transitioningBack);
                navigationStateManager2.updateScreenState();
                CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda02 = new CameraHelper$$ExternalSyntheticLambda0(inquiryStateManager, 24);
                ((SubtreeManager) inquiryStateManager.lastChild).runningSideEffect("controllerRequestCollector", new WebRtcWorker$run$1.AnonymousClass1(inquiryStateManager, r4, i));
                InquiryWorkflow$Props inquiryWorkflow$Props2 = (InquiryWorkflow$Props) ((StateFlowImpl) inquiryStateManager.firstChild).getValue();
                if (inquiryState instanceof InquiryState.CreateInquiryFromTemplate) {
                    InquiryState.CreateInquiryFromTemplate createInquiryFromTemplate = (InquiryState.CreateInquiryFromTemplate) inquiryState;
                    loadingStepModel = inquiryStateManager.renderInquiryFromAttributes(new InquiryAttributes(createInquiryFromTemplate.templateId, createInquiryFromTemplate.templateVersion, null, null, inquiryWorkflow$Props2.getEnvironment(), createInquiryFromTemplate.environmentId, createInquiryFromTemplate.accountId, createInquiryFromTemplate.referenceId, createInquiryFromTemplate.fields, createInquiryFromTemplate.themeSetId, 2304), cameraHelper$$ExternalSyntheticLambda02);
                    str2 = r4;
                } else if (inquiryState instanceof InquiryState.ResumeFallbackInquiry) {
                    InquiryState.ResumeFallbackInquiry resumeFallbackInquiry = (InquiryState.ResumeFallbackInquiry) inquiryState;
                    loadingStepModel = inquiryStateManager.renderInquiryFromAttributes(new InquiryAttributes(null, null, resumeFallbackInquiry.fallbackInquiryId, resumeFallbackInquiry.fallbackSessionToken, inquiryWorkflow$Props2.getEnvironment(), null, null, null, null, null, 4067), cameraHelper$$ExternalSyntheticLambda02);
                    str2 = r4;
                } else {
                    int i4 = 12;
                    if (inquiryState instanceof InquiryState.CreateInquirySession) {
                        InquiryState.CreateInquirySession createInquirySession = (InquiryState.CreateInquirySession) inquiryState;
                        NavigationStateManager.setState$default(inquiryStateManager.navigationStateManager, z, z, z, 12);
                        ((SubtreeManager) inquiryStateManager.lastChild).runningWorker(new CreateInquirySessionWorker(createInquirySession.inquiryId, createInquirySession.inquirySessionDataWrapper, (InquiryApiHelper) inquiryStateManager.inquirySessionWorker.delegateFactory.inquiryApiHelperProvider.get()), new HCaptcha$$ExternalSyntheticLambda1(20, inquiryStateManager, createInquirySession));
                        loadingStepModel = new LoadingStepModel(new VideoCapture.AnonymousClass3(r4, z3, cameraHelper$$ExternalSyntheticLambda02, i4));
                        str2 = r4;
                    } else if (inquiryState instanceof InquiryState.ExchangeOneTimeCode) {
                        InquiryState.ExchangeOneTimeCode exchangeOneTimeCode = (InquiryState.ExchangeOneTimeCode) inquiryState;
                        NavigationStateManager.setState$default(inquiryStateManager.navigationStateManager, z, z, z, 12);
                        ((SubtreeManager) inquiryStateManager.lastChild).runningWorker(new ExchangeOneTimeCodeWorker(exchangeOneTimeCode.oneTimeLinkCode, (InquiryApiHelper) inquiryStateManager.exchangeOneTimeCodeWorkerFactory.delegateFactory.inquiryApiHelperProvider.get()), new HCaptcha$$ExternalSyntheticLambda1(19, inquiryStateManager, exchangeOneTimeCode));
                        loadingStepModel = new LoadingStepModel(new VideoCapture.AnonymousClass3(r4, z3, cameraHelper$$ExternalSyntheticLambda02, i4));
                        str2 = r4;
                    } else if (inquiryState instanceof InquiryState.ShowLoadingSpinner) {
                        InquiryState.ShowLoadingSpinner showLoadingSpinner = (InquiryState.ShowLoadingSpinner) inquiryState;
                        NavigationStateManager.setState$default(inquiryStateManager.navigationStateManager, z, z, z, 12);
                        loadingStepModel = new LoadingStepModel(new VideoCapture.AnonymousClass3(showLoadingSpinner.styles, showLoadingSpinner.useBasicSpinner, cameraHelper$$ExternalSyntheticLambda02, i4));
                        str2 = r4;
                    } else if (z4) {
                        InquiryState.GovernmentIdStepRunning governmentIdStepRunning2 = (InquiryState.GovernmentIdStepRunning) inquiryState;
                        String str6 = governmentIdStepRunning2.sessionToken;
                        TransitionStatus transitionStatus2 = governmentIdStepRunning2.transitionStatus;
                        String str7 = governmentIdStepRunning2.countryCode;
                        List list = governmentIdStepRunning2.enabledIdClasses;
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list.iterator();
                        String str8 = r4;
                        while (it2.hasNext()) {
                            String str9 = str8;
                            TipsFeatureFlag tipsFeatureFlag2 = tipsFeatureFlag;
                            IdConfig idConfig = ConversionsKt.toIdConfig((Id) it2.next(), str7 == null ? "US" : str7, governmentIdStepRunning2.manualCaptureButtonDelayMs);
                            if (idConfig != null) {
                                arrayList.add(idConfig);
                            }
                            tipsFeatureFlag = tipsFeatureFlag2;
                            str8 = str9;
                        }
                        String str10 = str8;
                        TipsFeatureFlag tipsFeatureFlag3 = tipsFeatureFlag;
                        String str11 = governmentIdStepRunning2.inquiryId;
                        String str12 = governmentIdStepRunning2.fromStep;
                        String str13 = governmentIdStepRunning2.fromComponent;
                        boolean z8 = governmentIdStepRunning2.backStepEnabled;
                        boolean z9 = governmentIdStepRunning2.cancelButtonEnabled;
                        ?? r46 = z3;
                        List list2 = governmentIdStepRunning2.enabledCaptureOptionsNativeMobile;
                        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = governmentIdStepRunning2.styles;
                        int i5 = governmentIdStepRunning2.imageCaptureCount;
                        String str14 = governmentIdStepRunning2.fieldKeyDocument;
                        String str15 = governmentIdStepRunning2.fieldKeyIdClass;
                        NextStep.GovernmentId.Localizations localizations2 = governmentIdStepRunning2.localizations;
                        if (str7 == null) {
                            localizations = localizations2;
                            str4 = "US";
                        } else {
                            localizations = localizations2;
                            str4 = str7;
                        }
                        List list3 = governmentIdStepRunning2.localizationOverrides;
                        Iterable sortedDescending = list3 != null ? CollectionsKt.sortedDescending(list3) : str10;
                        localizations.getClass();
                        String title = localizations.getSelectPage().getTitle();
                        String prompt = localizations.getSelectPage().getPrompt();
                        String choose = localizations.getSelectPage().getChoose();
                        String disclaimer = localizations.getSelectPage().getDisclaimer();
                        String str16 = disclaimer == null ? "" : disclaimer;
                        OverridableText overridableText = com.withpersona.sdk2.inquiry.internal.network.ConversionsKt.to$overrideBySideAndId(localizations.getCapturePage().getTitle(), "title", "capturePage", sortedDescending);
                        NextStep.GovernmentId.CapturePage capturePage = localizations.getCapturePage();
                        OverridableText overridableText2 = com.withpersona.sdk2.inquiry.internal.network.ConversionsKt.to$overrideTextBySideAndId("capturePage", sortedDescending, MapsKt__MapsKt.mapOf(new Pair(new Pair(IdConfig.Side.Front, "scanFront"), capturePage.getScanFront()), new Pair(new Pair(IdConfig.Side.Back, "scanBack"), capturePage.getScanBack()), new Pair(new Pair(IdConfig.Side.BarcodePdf417, "scanPdf417"), capturePage.getScanPdf417()), new Pair(new Pair(IdConfig.Side.PassportSignature, "scanSignature"), capturePage.getScanSignature()), new Pair(new Pair(IdConfig.Side.FrontOrBack, "scanFrontOrBack"), capturePage.getScanFrontOrBack())));
                        String capturing = localizations.getCapturePage().getCapturing();
                        OverridableText overridableText3 = com.withpersona.sdk2.inquiry.internal.network.ConversionsKt.to$overrideBySideAndId(localizations.getCapturePage().getConfirmCapture(), "confirmCapture", "capturePage", sortedDescending);
                        String disclaimer2 = localizations.getCapturePage().getDisclaimer();
                        String str17 = disclaimer2 == null ? "" : disclaimer2;
                        String buttonSubmit = localizations.getCheckPage().getButtonSubmit();
                        String buttonRetake = localizations.getCheckPage().getButtonRetake();
                        OverridableText overridableText4 = com.withpersona.sdk2.inquiry.internal.network.ConversionsKt.to$overrideBySideAndId(localizations.getCheckPage().getTitleConfirmCapture(), "titleConfirmCapture", "checkPage", sortedDescending);
                        String title2 = localizations.getPendingPage().getTitle();
                        String description = localizations.getPendingPage().getDescription();
                        Map<String, String> idClassToName = localizations.getSelectPage().getIdClassToName();
                        if (sortedDescending != 0) {
                            r9 = new ArrayList();
                            for (Object obj7 : sortedDescending) {
                                if (Intrinsics.areEqual(((NextStep.GovernmentId.LocalizationOverride) obj7).getPage(), "selectPage")) {
                                    r9.add(obj7);
                                }
                            }
                        } else {
                            r9 = str10;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(idClassToName.size()));
                        Iterator it3 = idClassToName.entrySet().iterator();
                        while (it3.hasNext()) {
                            Map.Entry entry = (Map.Entry) it3.next();
                            Object key = entry.getKey();
                            String str18 = (String) entry.getKey();
                            String str19 = (String) entry.getValue();
                            if (r9 != 0) {
                                Iterator it4 = r9.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        it = it3;
                                        obj3 = str10;
                                        break;
                                    }
                                    obj3 = it4.next();
                                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj3;
                                    it = it3;
                                    if (Intrinsics.areEqual(localizationOverride.getCountryCode(), str4) && ((Intrinsics.areEqual(localizationOverride.getIdClass(), str18) || localizationOverride.getIdClass() == null) && Intrinsics.areEqual(localizationOverride.getKey(), str18))) {
                                        break;
                                    }
                                    it3 = it;
                                }
                                NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) obj3;
                                if (localizationOverride2 != null && (text = localizationOverride2.getText()) != null) {
                                    str19 = text;
                                }
                            } else {
                                it = it3;
                            }
                            linkedHashMap.put(key, str19);
                            it3 = it;
                        }
                        NextStep.GovernmentId.RequestPage requestPage = localizations.getRequestPage();
                        IdConfig.Side side = IdConfig.Side.Front;
                        Pair pair = new Pair(new Pair(side, "titleFront"), requestPage.getTitleFront());
                        IdConfig.Side side2 = IdConfig.Side.Back;
                        Pair pair2 = new Pair(new Pair(side2, "titleBack"), requestPage.getTitleBack());
                        IdConfig.Side side3 = IdConfig.Side.BarcodePdf417;
                        Pair pair3 = new Pair(new Pair(side3, "titlePdf417"), requestPage.getTitlePdf417());
                        IdConfig.Side side4 = IdConfig.Side.PassportSignature;
                        OverridableText overridableText5 = com.withpersona.sdk2.inquiry.internal.network.ConversionsKt.to$overrideTextBySideAndId("requestPage", sortedDescending, MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair(new Pair(side4, "titlePassportSignature"), requestPage.getTitlePassportSignature())));
                        NextStep.GovernmentId.RequestPage requestPage2 = localizations.getRequestPage();
                        OverridableText overridableText6 = com.withpersona.sdk2.inquiry.internal.network.ConversionsKt.to$overrideTextBySideAndId("requestPage", sortedDescending, MapsKt__MapsKt.mapOf(new Pair(new Pair(side, "descriptionFront"), requestPage2.getDescriptionFront()), new Pair(new Pair(side2, "descriptionBack"), requestPage2.getDescriptionBack()), new Pair(new Pair(side3, "descriptionPdf417"), requestPage2.getDescriptionPdf417()), new Pair(new Pair(side4, "descriptionPassportSignature"), requestPage2.getDescriptionPassportSignature())));
                        String liveUploadButtonText = localizations.getRequestPage().getLiveUploadButtonText();
                        String choosePhotoButtonText = localizations.getRequestPage().getChoosePhotoButtonText();
                        NextStep.GovernmentId.ReviewUploadPage reviewUploadPage = localizations.getReviewUploadPage();
                        Map mapOf = MapsKt__MapsKt.mapOf(new Pair(side, reviewUploadPage.getTitleFront()), new Pair(side2, reviewUploadPage.getTitleBack()), new Pair(side3, reviewUploadPage.getTitlePdf417()), new Pair(side4, reviewUploadPage.getTitlePassportSignature()));
                        NextStep.GovernmentId.ReviewUploadPage reviewUploadPage2 = localizations.getReviewUploadPage();
                        Map mapOf2 = MapsKt__MapsKt.mapOf(new Pair(side, reviewUploadPage2.getDescriptionFront()), new Pair(side2, reviewUploadPage2.getDescriptionBack()), new Pair(side3, reviewUploadPage2.getDescriptionPdf417()), new Pair(side4, reviewUploadPage2.getDescriptionPassportSignature()));
                        String confirmButtonText = localizations.getReviewUploadPage().getConfirmButtonText();
                        String chooseAnotherButtonText = localizations.getReviewUploadPage().getChooseAnotherButtonText();
                        String cameraPermissionsTitle = localizations.getPromptPage().getCameraPermissionsTitle();
                        String cameraPermissionsPrompt = localizations.getPromptPage().getCameraPermissionsPrompt();
                        String cameraPermissionsAllowButtonText = localizations.getPromptPage().getCameraPermissionsAllowButtonText();
                        String cameraPermissionsCancelButtonText = localizations.getPromptPage().getCameraPermissionsCancelButtonText();
                        String microphonePermissionsTitle = localizations.getPromptPage().getMicrophonePermissionsTitle();
                        String microphonePermissionsPrompt = localizations.getPromptPage().getMicrophonePermissionsPrompt();
                        String microphonePermissionsBtnContinueMobile = localizations.getPromptPage().getMicrophonePermissionsBtnContinueMobile();
                        String microphonePermissionsBtnCancel = localizations.getPromptPage().getMicrophonePermissionsBtnCancel();
                        String hintHoldStill = localizations.getCapturePage().getHintHoldStill();
                        String hintLowLight = localizations.getCapturePage().getHintLowLight();
                        String btnHelp = localizations.getCapturePage().getBtnHelp();
                        String barcodeHelpModalTitle = localizations.getCapturePage().getBarcodeHelpModalTitle();
                        String barcodeHelpModalPrompt = localizations.getCapturePage().getBarcodeHelpModalPrompt();
                        String barcodeHelpModalHints = localizations.getCapturePage().getBarcodeHelpModalHints();
                        String barcodeHelpModalContinueBtn = localizations.getCapturePage().getBarcodeHelpModalContinueBtn();
                        String idFrontHelpModalTitle = localizations.getCapturePage().getIdFrontHelpModalTitle();
                        String idFrontHelpModalPrompt = localizations.getCapturePage().getIdFrontHelpModalPrompt();
                        String idFrontHelpModalHintsMobile = localizations.getCapturePage().getIdFrontHelpModalHintsMobile();
                        String idFrontHelpModalContinueBtn = localizations.getCapturePage().getIdFrontHelpModalContinueBtn();
                        String idBackHelpModalTitle = localizations.getCapturePage().getIdBackHelpModalTitle();
                        String idBackHelpModalPrompt = localizations.getCapturePage().getIdBackHelpModalPrompt();
                        String idBackHelpModalHintsMobile = localizations.getCapturePage().getIdBackHelpModalHintsMobile();
                        String idBackHelpModalContinueBtn = localizations.getCapturePage().getIdBackHelpModalContinueBtn();
                        String staticCaptureTipsTitle = localizations.getCapturePage().getStaticCaptureTipsTitle();
                        String staticCaptureTipsSubtext = localizations.getCapturePage().getStaticCaptureTipsSubtext();
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage = localizations.getAutoClassificationPage();
                        String unableToClassifyDocumentTitle = autoClassificationPage != null ? autoClassificationPage.getUnableToClassifyDocumentTitle() : str10;
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage2 = localizations.getAutoClassificationPage();
                        String unableToClassifyDocumentContinueButtonText = autoClassificationPage2 != null ? autoClassificationPage2.getUnableToClassifyDocumentContinueButtonText() : str10;
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage3 = localizations.getAutoClassificationPage();
                        String idClassRejectedTitle = autoClassificationPage3 != null ? autoClassificationPage3.getIdClassRejectedTitle() : str10;
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage4 = localizations.getAutoClassificationPage();
                        String idClassRejectedContinueButtonText = autoClassificationPage4 != null ? autoClassificationPage4.getIdClassRejectedContinueButtonText() : str10;
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage5 = localizations.getAutoClassificationPage();
                        String countryInputTitle = autoClassificationPage5 != null ? autoClassificationPage5.getCountryInputTitle() : str10;
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage6 = localizations.getAutoClassificationPage();
                        String idClassInputTitle = autoClassificationPage6 != null ? autoClassificationPage6.getIdClassInputTitle() : str10;
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage7 = localizations.getAutoClassificationPage();
                        String manualClassificationTitle = autoClassificationPage7 != null ? autoClassificationPage7.getManualClassificationTitle() : str10;
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage8 = localizations.getAutoClassificationPage();
                        String manualClassificationContinueButtonText = autoClassificationPage8 != null ? autoClassificationPage8.getManualClassificationContinueButtonText() : str10;
                        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage9 = localizations.getAutoClassificationPage();
                        GovernmentIdWorkflow.Input.Strings strings = new GovernmentIdWorkflow.Input.Strings(title, prompt, choose, str16, overridableText, overridableText2, capturing, overridableText3, str17, buttonSubmit, buttonRetake, overridableText4, title2, description, linkedHashMap, overridableText5, overridableText6, liveUploadButtonText, choosePhotoButtonText, mapOf, mapOf2, confirmButtonText, chooseAnotherButtonText, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, hintHoldStill, hintLowLight, btnHelp, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueBtn, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHintsMobile, idFrontHelpModalContinueBtn, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHintsMobile, idBackHelpModalContinueBtn, staticCaptureTipsTitle, staticCaptureTipsSubtext, unableToClassifyDocumentTitle, unableToClassifyDocumentContinueButtonText, idClassRejectedTitle, idClassRejectedContinueButtonText, countryInputTitle, idClassInputTitle, manualClassificationTitle, manualClassificationContinueButtonText, autoClassificationPage9 != null ? autoClassificationPage9.getAutoClassificationCaptureTipText() : str10, sortedDescending);
                        long j = governmentIdStepRunning2.manualCaptureButtonDelayMs;
                        Integer theme = inquiryWorkflow$Props2.getTheme();
                        boolean z10 = governmentIdStepRunning2.shouldSkipReviewScreen;
                        List list4 = governmentIdStepRunning2.enabledCaptureFileTypes;
                        List list5 = governmentIdStepRunning2.videoCaptureMethods;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(VideoCaptureMethod.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it5.next()).toString()));
                        }
                        VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(120000L, list4, arrayList2, governmentIdStepRunning2.webRtcJwt, governmentIdStepRunning2.audioEnabled);
                        NextStep.GovernmentId.AssetConfig assetConfig = governmentIdStepRunning2.assetConfig;
                        GovernmentIdWorkflow.Input input = new GovernmentIdWorkflow.Input(str6, str7, arrayList, str11, str12, str13, z8, z9, list2, governmentIdStepStyle, strings, i5, str14, str15, j, z10, theme, videoCaptureConfig, assetConfig == null ? new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null) : assetConfig, !Intrinsics.areEqual(transitionStatus2, transitioningBack), governmentIdStepRunning2.autoClassificationConfig, governmentIdStepRunning2.reviewCaptureButtonsAxis, governmentIdStepRunning2.pendingPageTextVerticalPosition, governmentIdStepRunning2.digitalIdConfig, governmentIdStepRunning2.staticCaptureTipsEnabled, governmentIdStepRunning2.holographicTorchEnabledDurationMs, governmentIdStepRunning2.designVersion, governmentIdStepRunning2.flowWatermarkText);
                        FeatureFlagManager featureFlagManager = inquiryStateManager.featureFlagManager;
                        featureFlagManager.getClass();
                        if (featureFlagManager.getValue(tipsFeatureFlag3)) {
                            Intrinsics.areEqual(transitionStatus2, transitioningBack);
                            loadingStepModel = new GovernmentIdStepModel(input, governmentIdStepRunning2.fromStep, governmentIdStepRunning2.didGoBack, new InquiryStateManager$$ExternalSyntheticLambda3(inquiryStateManager, governmentIdStepRunning2, 0));
                        } else {
                            Intrinsics.areEqual(transitionStatus2, transitioningBack);
                            loadingStepModel = new GovernmentIdStepWorkflowModel(inquiryStateManager.governmentIdWorkflow, input, governmentIdStepRunning2.fromStep, governmentIdStepRunning2.didGoBack, new InquiryStateManager$$ExternalSyntheticLambda3(inquiryStateManager, governmentIdStepRunning2, r46));
                        }
                        str2 = str10;
                    } else {
                        ?? r108 = r4;
                        if (inquiryState instanceof InquiryState.SelfieStepRunning) {
                            InquiryState.SelfieStepRunning selfieStepRunning2 = (InquiryState.SelfieStepRunning) inquiryState;
                            FeatureFlagManager featureFlagManager2 = inquiryStateManager.featureFlagManager;
                            List list6 = selfieStepRunning2.orderedPoses;
                            DesignVersion designVersion = selfieStepRunning2.designVersion;
                            NextStep.Selfie.CaptureMethod captureMethod = selfieStepRunning2.selfieType;
                            NextStep.Selfie.Localizations localizations3 = selfieStepRunning2.localizations;
                            List list7 = list6;
                            if (list7 == null || list7.isEmpty()) {
                                int i6 = InquiryStateManager.WhenMappings.$EnumSwitchMapping$0[captureMethod.ordinal()];
                                if (i6 == 1) {
                                    listOf = CollectionsKt__CollectionsJVMKt.listOf(Selfie.Pose.Center);
                                } else {
                                    if (i6 != 2 && i6 != 3) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return r108;
                                    }
                                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Selfie.Pose[]{Selfie.Pose.Center, Selfie.Pose.Left, Selfie.Pose.Right});
                                }
                            } else {
                                List<NextStep.Selfie.SelfiePose> list8 = selfieStepRunning2.orderedPoses;
                                listOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                                for (NextStep.Selfie.SelfiePose selfiePose : list8) {
                                    selfiePose.getClass();
                                    int i7 = SelfieKt.WhenMappings.$EnumSwitchMapping$1[selfiePose.ordinal()];
                                    if (i7 == 1) {
                                        pose = Selfie.Pose.Center;
                                    } else if (i7 == 2) {
                                        pose = Selfie.Pose.Left;
                                    } else {
                                        if (i7 != 3) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return r108;
                                        }
                                        pose = Selfie.Pose.Right;
                                    }
                                    listOf.add(pose);
                                }
                            }
                            List list9 = listOf;
                            if (designVersion == DesignVersion.K0000) {
                                list9 = CollectionsKt__CollectionsJVMKt.shuffled((Iterable) listOf);
                            }
                            List list10 = list9;
                            String str20 = selfieStepRunning2.sessionToken;
                            String str21 = selfieStepRunning2.inquiryId;
                            String str22 = selfieStepRunning2.fromComponent;
                            String str23 = selfieStepRunning2.fromStep;
                            boolean z11 = selfieStepRunning2.backStepEnabled;
                            boolean z12 = selfieStepRunning2.cancelButtonEnabled;
                            String str24 = selfieStepRunning2.fieldKeySelfie;
                            boolean z13 = selfieStepRunning2.requireStrictSelfieCapture;
                            boolean z14 = selfieStepRunning2.skipPromptPage;
                            boolean z15 = captureMethod == NextStep.Selfie.CaptureMethod.ONLY_CENTER;
                            localizations3.getClass();
                            String title3 = localizations3.getPromptPage().getTitle();
                            String promptCenter = z15 ? localizations3.getPromptPage().getPromptCenter() : localizations3.getPromptPage().getPrompt();
                            String disclosure = localizations3.getPromptPage().getDisclosure();
                            String buttonSubmit2 = localizations3.getPromptPage().getButtonSubmit();
                            String title4 = localizations3.getCapturePage().getTitle();
                            String str25 = title4 == null ? "" : title4;
                            String selfieHintTakePhoto = localizations3.getCapturePage().getSelfieHintTakePhoto();
                            String selfieHintCenterFace = localizations3.getCapturePage().getSelfieHintCenterFace();
                            String selfieHintFaceTooClose = localizations3.getCapturePage().getSelfieHintFaceTooClose();
                            String selfieHintFaceTooFar = localizations3.getCapturePage().getSelfieHintFaceTooFar();
                            String selfieHintFaceIncomplete = localizations3.getCapturePage().getSelfieHintFaceIncomplete();
                            String selfieHintMultipleFaces = localizations3.getCapturePage().getSelfieHintMultipleFaces();
                            String selfieHintPoseNotCenter = localizations3.getCapturePage().getSelfieHintPoseNotCenter();
                            String selfieHintLookLeft = localizations3.getCapturePage().getSelfieHintLookLeft();
                            String selfieHintLookRight = localizations3.getCapturePage().getSelfieHintLookRight();
                            String selfieHintHoldStill = localizations3.getCapturePage().getSelfieHintHoldStill();
                            String title5 = localizations3.getPendingPage().getTitle();
                            String description2 = localizations3.getPendingPage().getDescription();
                            NextStep.Selfie.CheckPage checkPage = localizations3.getCheckPage();
                            String title6 = checkPage != null ? checkPage.getTitle() : r108;
                            NextStep.Selfie.CheckPage checkPage2 = localizations3.getCheckPage();
                            String description3 = checkPage2 != null ? checkPage2.getDescription() : r108;
                            NextStep.Selfie.CheckPage checkPage3 = localizations3.getCheckPage();
                            String selfieLabelFront = checkPage3 != null ? checkPage3.getSelfieLabelFront() : r108;
                            NextStep.Selfie.CheckPage checkPage4 = localizations3.getCheckPage();
                            String selfieLabelLeft = checkPage4 != null ? checkPage4.getSelfieLabelLeft() : r108;
                            NextStep.Selfie.CheckPage checkPage5 = localizations3.getCheckPage();
                            String selfieLabelRight = checkPage5 != null ? checkPage5.getSelfieLabelRight() : r108;
                            NextStep.Selfie.CheckPage checkPage6 = localizations3.getCheckPage();
                            String btnSubmit = checkPage6 != null ? checkPage6.getBtnSubmit() : r108;
                            NextStep.Selfie.CheckPage checkPage7 = localizations3.getCheckPage();
                            SelfieWorkflow.Input.Strings strings2 = new SelfieWorkflow.Input.Strings(title3, promptCenter, disclosure, buttonSubmit2, str25, selfieHintTakePhoto, selfieHintCenterFace, selfieHintFaceTooClose, selfieHintFaceTooFar, selfieHintMultipleFaces, selfieHintFaceIncomplete, selfieHintPoseNotCenter, selfieHintLookLeft, selfieHintLookRight, selfieHintHoldStill, title5, description2, title6, description3, selfieLabelFront, selfieLabelLeft, selfieLabelRight, btnSubmit, checkPage7 != null ? checkPage7.getBtnRetake() : r108, localizations3.getCapturePage().getAutoCaptureOn(), localizations3.getCapturePage().getCaptureSuccess(), localizations3.getCapturePage().getSelfieHintCenterFaceDescription(), localizations3.getCapturePage().getSelfieHintLookLeftDescription(), localizations3.getCapturePage().getSelfieHintLookRightDescription(), localizations3.getCapturePage().getCameraLoadingTitle(), localizations3.getCapturePage().getSelfieHintVerifying(), localizations3.getCapturePage().getSelfieHintAutoCaptureTimeout());
                            captureMethod.getClass();
                            int i8 = SelfieTypeKt$WhenMappings.$EnumSwitchMapping$0[captureMethod.ordinal()];
                            if (i8 == 1) {
                                selfieType = SelfieType.CenterOnly.INSTANCE;
                            } else if (i8 == 2) {
                                selfieType = SelfieType.ThreePhotos.INSTANCE;
                            } else {
                                if (i8 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return r108;
                                }
                                selfieType = SelfieType.ConfigurablePoses.INSTANCE;
                            }
                            SelfieType selfieType2 = selfieType;
                            String cameraPermissionsTitle2 = localizations3.getPromptPage().getCameraPermissionsTitle();
                            String cameraPermissionsPrompt2 = localizations3.getPromptPage().getCameraPermissionsPrompt();
                            String cameraPermissionsAllowButtonText2 = localizations3.getPromptPage().getCameraPermissionsAllowButtonText();
                            String cameraPermissionsCancelButtonText2 = localizations3.getPromptPage().getCameraPermissionsCancelButtonText();
                            String microphonePermissionsTitle2 = localizations3.getPromptPage().getMicrophonePermissionsTitle();
                            String microphonePermissionsPrompt2 = localizations3.getPromptPage().getMicrophonePermissionsPrompt();
                            String microphonePermissionsBtnContinueMobile2 = localizations3.getPromptPage().getMicrophonePermissionsBtnContinueMobile();
                            String microphonePermissionsBtnCancel2 = localizations3.getPromptPage().getMicrophonePermissionsBtnCancel();
                            StepStyles.SelfieStepStyle selfieStepStyle2 = selfieStepRunning2.styles;
                            NextStep.Selfie.AssetConfig assetConfig2 = selfieStepRunning2.assetConfig;
                            if (assetConfig2 == null) {
                                selfieStepStyle = selfieStepStyle2;
                                assetConfig2 = new NextStep.Selfie.AssetConfig(r108, r108, 3, r108);
                            } else {
                                selfieStepStyle = selfieStepStyle2;
                            }
                            NextStep.Selfie.AssetConfig assetConfig3 = assetConfig2;
                            PendingPageTextPosition pendingPageTextPosition = selfieStepRunning2.pendingPageTextVerticalPosition;
                            List list11 = selfieStepRunning2.enabledCaptureFileTypes;
                            List list12 = selfieStepRunning2.videoCaptureMethods;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list12, 10));
                            Iterator it6 = list12.iterator();
                            while (it6.hasNext()) {
                                arrayList3.add(VideoCaptureMethod.valueOf(((NextStep.Selfie.VideoCaptureMethod) it6.next()).toString()));
                            }
                            com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig videoCaptureConfig2 = new com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig(60000L, list11, arrayList3, selfieStepRunning2.webRtcJwt, selfieStepRunning2.audioEnabled);
                            PoseConfigs poseConfigs = selfieStepRunning2.poseConfigs;
                            int ordinal = designVersion.ordinal();
                            if (ordinal == 0 || ordinal == 1) {
                                TipsFeatureFlag tipsFeatureFlag4 = TipsFeatureFlag.INSTANCE$4;
                                featureFlagManager2.getClass();
                                designVersion = featureFlagManager2.getValue(tipsFeatureFlag4) ? DesignVersion.V1 : DesignVersion.V0;
                            }
                            SelfieWorkflow.Input input2 = new SelfieWorkflow.Input(str20, str21, str22, str23, z11, z12, str24, z13, z14, strings2, selfieType2, list10, cameraPermissionsTitle2, cameraPermissionsPrompt2, cameraPermissionsAllowButtonText2, cameraPermissionsCancelButtonText2, microphonePermissionsTitle2, microphonePermissionsPrompt2, microphonePermissionsBtnContinueMobile2, microphonePermissionsBtnCancel2, selfieStepStyle, videoCaptureConfig2, assetConfig3, pendingPageTextPosition, poseConfigs, designVersion, selfieStepRunning2.fileUploadUrl, selfieStepRunning2.flowWatermarkText);
                            featureFlagManager2.getClass();
                            boolean value = featureFlagManager2.getValue(tipsFeatureFlag);
                            TransitionStatus transitionStatus3 = selfieStepRunning2.transitionStatus;
                            if (value) {
                                Intrinsics.areEqual(transitionStatus3, transitioningBack);
                                documentStepModel = new SelfieStepModel(input2, selfieStepRunning2.fromStep, selfieStepRunning2.didGoBack, new InquiryStateManager$$ExternalSyntheticLambda17(inquiryStateManager, selfieStepRunning2, 0));
                                loadingStepModel = documentStepModel;
                                str2 = null;
                            } else {
                                Intrinsics.areEqual(transitionStatus3, transitioningBack);
                                loadingStepModel = new SelfieStepWorkflowModel(inquiryStateManager.selfieWorkflow, input2, selfieStepRunning2.fromStep, selfieStepRunning2.didGoBack, new InquiryStateManager$$ExternalSyntheticLambda17(inquiryStateManager, selfieStepRunning2, 1));
                                str2 = null;
                            }
                        } else {
                            if (inquiryState instanceof InquiryState.UiStepRunning) {
                                InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) inquiryState;
                                SubtreeManager subtreeManager2 = (SubtreeManager) inquiryStateManager.lastChild;
                                String str26 = uiStepRunning.sessionToken;
                                TransitionStatus transitionStatus4 = uiStepRunning.transitionStatus;
                                String str27 = uiStepRunning.inquiryId;
                                List list13 = uiStepRunning.components;
                                String str28 = uiStepRunning.stepName;
                                boolean z16 = uiStepRunning.backStepEnabled;
                                boolean z17 = uiStepRunning.cancelButtonEnabled;
                                boolean z18 = uiStepRunning.finalStep;
                                InquirySessionConfig inquirySessionConfig2 = uiStepRunning.inquirySessionConfig;
                                NextStep.Ui.Localizations localizations4 = uiStepRunning.localizations;
                                String gpsPermissionsTitle = (localizations4 == null || (promptPage7 = localizations4.getPromptPage()) == null) ? null : promptPage7.getGpsPermissionsTitle();
                                String gpsPermissionsPrompt = (localizations4 == null || (promptPage6 = localizations4.getPromptPage()) == null) ? null : promptPage6.getGpsPermissionsPrompt();
                                String gpsPermissionsAllowButtonText = (localizations4 == null || (promptPage5 = localizations4.getPromptPage()) == null) ? null : promptPage5.getGpsPermissionsAllowButtonText();
                                String gpsPermissionsBtnCancel = (localizations4 == null || (promptPage4 = localizations4.getPromptPage()) == null) ? null : promptPage4.getGpsPermissionsBtnCancel();
                                String gpsFeatureTitle = (localizations4 == null || (promptPage3 = localizations4.getPromptPage()) == null) ? null : promptPage3.getGpsFeatureTitle();
                                String gpsFeaturePrompt = (localizations4 == null || (promptPage2 = localizations4.getPromptPage()) == null) ? null : promptPage2.getGpsFeaturePrompt();
                                String gpsFeatureTurnOnText = (localizations4 == null || (promptPage = localizations4.getPromptPage()) == null) ? null : promptPage.getGpsFeatureTurnOnText();
                                StepStyles.UiStepStyle uiStepStyle = uiStepRunning.styles;
                                List list14 = uiStepRunning.serverComponentErrors;
                                if (transitionStatus4 instanceof TransitionStatus.CheckingForNextState) {
                                    int ordinal2 = ((TransitionStatus.CheckingForNextState) transitionStatus4).pollingMode.ordinal();
                                    if (ordinal2 != 0) {
                                        str3 = str27;
                                        if (ordinal2 != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        z6 = true;
                                    } else {
                                        str3 = str27;
                                        z6 = false;
                                    }
                                } else {
                                    str3 = str27;
                                    if (!(transitionStatus4 instanceof TransitionStatus.Transitioning) && !Intrinsics.areEqual(transitionStatus4, transitioningBack) && !(transitionStatus4 instanceof TransitionStatus.UpdateInquirySession)) {
                                        if (transitionStatus4 != null) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        z6 = false;
                                    }
                                    z6 = true;
                                }
                                UiWorkflow.Input input3 = new UiWorkflow.Input(str26, str3, list13, str28, z16, z17, z18, inquirySessionConfig2, gpsPermissionsTitle, gpsPermissionsPrompt, gpsFeatureTurnOnText, gpsPermissionsBtnCancel, gpsFeatureTitle, gpsFeaturePrompt, gpsPermissionsAllowButtonText, uiStepStyle, list14, z6, uiStepRunning.transitionError, uiStepRunning.isRestoringState);
                                FeatureFlagManager featureFlagManager3 = inquiryStateManager.featureFlagManager;
                                featureFlagManager3.getClass();
                                if (featureFlagManager3.getValue(tipsFeatureFlag)) {
                                    Intrinsics.areEqual(transitionStatus4, transitioningBack);
                                    uiStepWorkflowModel = new UiStepModel(input3, uiStepRunning.clientSideKey, uiStepRunning.didGoBack, new InquiryStateManager$$ExternalSyntheticLambda9(inquiryStateManager, uiStepRunning, 0));
                                } else {
                                    Intrinsics.areEqual(transitionStatus4, transitioningBack);
                                    uiStepWorkflowModel = new UiStepWorkflowModel(inquiryStateManager.uiWorkflow, input3, uiStepRunning.clientSideKey, uiStepRunning.didGoBack, new InquiryStateManager$$ExternalSyntheticLambda9(inquiryStateManager, uiStepRunning, 1));
                                }
                                if (uiStepRunning.isRestoringState) {
                                    subtreeManager2.runningWorker(new RestoreUiStepStateWorker((UiStepSavedStateHelper) inquiryStateManager.restoreUiStepStateWorkerFactory.delegateFactory.inquiryApiHelperProvider.get(), uiStepRunning.sessionToken, uiStepRunning.inquiryId, uiStepRunning.stepName), new InquiryStateManager$$ExternalSyntheticLambda9(inquiryStateManager, uiStepRunning, 2));
                                    loadingStepModel = new LoadingStepModel(new VideoCapture.AnonymousClass3(uiStepRunning.styles, true, cameraHelper$$ExternalSyntheticLambda02, 12));
                                } else {
                                    InternalErrorInfo internalErrorInfo2 = uiStepRunning.transitionError;
                                    if (internalErrorInfo2 != null) {
                                        subtreeManager2.runningSideEffect(InquiryErrorMessagesKt.toErrorCode(internalErrorInfo2).name(), new InquiryStateManager$renderUiStep$2(inquiryStateManager, null));
                                    }
                                    loadingStepModel = uiStepWorkflowModel;
                                }
                            } else if (inquiryState instanceof InquiryState.DocumentStepRunning) {
                                InquiryState.DocumentStepRunning documentStepRunning = (InquiryState.DocumentStepRunning) inquiryState;
                                DocumentWorkflow.StartPage startPage = DocumentWorkflow.StartPage.Prompt.INSTANCE;
                                NextStep.Document.Config config = documentStepRunning.documentStep.getConfig();
                                String documentId = config.getDocumentId();
                                int i9 = InquiryStateManager.WhenMappings.$EnumSwitchMapping$3[config.getStartPage().ordinal()];
                                if (i9 != 1) {
                                    if (i9 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    if (documentId != null) {
                                        startPage = new DocumentWorkflow.StartPage.Review(documentId);
                                    }
                                }
                                DocumentWorkflow.StartPage startPage2 = startPage;
                                String str29 = documentStepRunning.sessionToken;
                                String str30 = documentStepRunning.inquiryId;
                                String str31 = documentStepRunning.fromStep;
                                String str32 = documentStepRunning.fromComponent;
                                String title7 = config.getLocalizations().getPromptPage().getTitle();
                                String prompt2 = config.getLocalizations().getPromptPage().getPrompt();
                                String disclaimer3 = config.getLocalizations().getPromptPage().getDisclaimer();
                                String btnSubmit2 = config.getLocalizations().getPromptPage().getBtnSubmit();
                                String title8 = config.getLocalizations().getPendingPage().getTitle();
                                String description4 = config.getLocalizations().getPendingPage().getDescription();
                                String fieldKeyDocument = config.getFieldKeyDocument();
                                String kind = config.getKind();
                                int documentFileLimit = config.getDocumentFileLimit();
                                Boolean backStepEnabled = config.getBackStepEnabled();
                                boolean booleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
                                Boolean cancelButtonEnabled = config.getCancelButtonEnabled();
                                boolean booleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
                                String cameraPermissionsTitle3 = config.getLocalizations().getPromptPage().getCameraPermissionsTitle();
                                String cameraPermissionsPrompt3 = config.getLocalizations().getPromptPage().getCameraPermissionsPrompt();
                                String cameraPermissionsAllowButtonText3 = config.getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
                                String cameraPermissionsCancelButtonText3 = config.getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
                                String largeFileErrorPrompt = config.getLocalizations().getPromptPage().getLargeFileErrorPrompt();
                                StepStyles.DocumentStepStyle documentStepStyle = documentStepRunning.styles;
                                DocumentPages documentPages = documentStepRunning.pages;
                                NextStep.Document.AssetConfig assetConfig4 = documentStepRunning.assetConfig;
                                if (assetConfig4 == null) {
                                    assetConfig4 = new NextStep.Document.AssetConfig(null, false ? 1 : 0, 3, false ? 1 : 0);
                                }
                                NextStep.Document.AssetConfig assetConfig5 = assetConfig4;
                                PendingPageTextPosition pendingPageTextVerticalPosition = config.getPendingPageTextVerticalPosition();
                                if (pendingPageTextVerticalPosition == null) {
                                    pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
                                }
                                DocumentWorkflow.Input input4 = new DocumentWorkflow.Input(str29, str30, str31, str32, title7, prompt2, disclaimer3, btnSubmit2, title8, description4, fieldKeyDocument, kind, documentId, startPage2, documentPages, documentFileLimit, booleanValue, booleanValue2, cameraPermissionsTitle3, cameraPermissionsPrompt3, cameraPermissionsAllowButtonText3, cameraPermissionsCancelButtonText3, largeFileErrorPrompt, documentStepStyle, assetConfig5, pendingPageTextVerticalPosition);
                                HCaptcha$$ExternalSyntheticLambda1 hCaptcha$$ExternalSyntheticLambda1 = new HCaptcha$$ExternalSyntheticLambda1(23, inquiryStateManager, documentStepRunning);
                                FeatureFlagManager featureFlagManager4 = inquiryStateManager.featureFlagManager;
                                featureFlagManager4.getClass();
                                boolean value2 = featureFlagManager4.getValue(tipsFeatureFlag);
                                TransitionStatus transitionStatus5 = documentStepRunning.transitionStatus;
                                if (value2) {
                                    Intrinsics.areEqual(transitionStatus5, transitioningBack);
                                    documentStepModel = new DocumentStepModel(input4, documentStepRunning.fromStep, documentStepRunning.didGoBack, hCaptcha$$ExternalSyntheticLambda1);
                                    loadingStepModel = documentStepModel;
                                } else {
                                    Intrinsics.areEqual(transitionStatus5, transitioningBack);
                                    loadingStepModel = new DocumentStepWorkflowModel(inquiryStateManager.documentWorkflow, input4, documentStepRunning.fromStep, documentStepRunning.didGoBack, hCaptcha$$ExternalSyntheticLambda1);
                                }
                            } else if (inquiryState instanceof InquiryState.Complete) {
                                ((SubtreeManager) inquiryStateManager.lastChild).runningSideEffect("complete", new SessionWorker$doWork$2$1(inquiryStateManager, (InquiryState.Complete) inquiryState, null, 14));
                                loadingStepModel = new CompleteStepModel();
                            } else if (inquiryState instanceof InquiryState.IntegrationStepRunning) {
                                InquiryState.IntegrationStepRunning integrationStepRunning = (InquiryState.IntegrationStepRunning) inquiryState;
                                String str33 = integrationStepRunning.sessionToken;
                                String str34 = integrationStepRunning.inquiryId;
                                String str35 = integrationStepRunning.stepName;
                                String str36 = integrationStepRunning.f1456type;
                                String str37 = integrationStepRunning.flowUrl;
                                String str38 = integrationStepRunning.redirectPath;
                                NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType = integrationStepRunning.integrationStepBrowserType;
                                boolean z19 = integrationStepRunning.backStepEnabled;
                                boolean z20 = integrationStepRunning.cancelButtonEnabled;
                                InquirySessionConfig inquirySessionConfig3 = integrationStepRunning.inquirySessionConfig;
                                StepStyles.IntegrationStepStyle integrationStepStyle = integrationStepRunning.styles;
                                InternalErrorInfo internalErrorInfo3 = integrationStepRunning.transitionError;
                                IntegrationPage integrationPage = integrationStepRunning.integrationPage;
                                TransitionStatus transitionStatus6 = integrationStepRunning.transitionStatus;
                                if (transitionStatus6 instanceof TransitionStatus.CheckingForNextState) {
                                    int ordinal3 = ((TransitionStatus.CheckingForNextState) transitionStatus6).pollingMode.ordinal();
                                    if (ordinal3 != 0) {
                                        internalErrorInfo = internalErrorInfo3;
                                        if (ordinal3 != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        z5 = true;
                                    } else {
                                        internalErrorInfo = internalErrorInfo3;
                                        z5 = false;
                                    }
                                } else {
                                    internalErrorInfo = internalErrorInfo3;
                                    if (!(transitionStatus6 instanceof TransitionStatus.Transitioning) && !Intrinsics.areEqual(transitionStatus6, transitioningBack) && !(transitionStatus6 instanceof TransitionStatus.UpdateInquirySession)) {
                                        if (transitionStatus6 != null) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        z5 = false;
                                    }
                                    z5 = true;
                                }
                                IntegrationWorkflow.Input input5 = new IntegrationWorkflow.Input(str34, str33, str35, str36, str37, str38, integrationStepBrowserType, z19, z20, inquirySessionConfig3, integrationStepStyle, internalErrorInfo, integrationPage, z5);
                                FeatureFlagManager featureFlagManager5 = inquiryStateManager.featureFlagManager;
                                featureFlagManager5.getClass();
                                if (featureFlagManager5.getValue(tipsFeatureFlag)) {
                                    Intrinsics.areEqual(transitionStatus6, transitioningBack);
                                    loadingStepModel = new IntegrationStepModel(input5, integrationStepRunning.stepName, integrationStepRunning.didGoBack, new InquiryStateManager$$ExternalSyntheticLambda7(inquiryStateManager, integrationStepRunning, 0));
                                } else {
                                    Intrinsics.areEqual(transitionStatus6, transitioningBack);
                                    loadingStepModel = new IntegrationStepWorkflowModel(inquiryStateManager.integrationWorkflow, input5, integrationStepRunning.stepName, integrationStepRunning.didGoBack, new InquiryStateManager$$ExternalSyntheticLambda7(inquiryStateManager, integrationStepRunning, 1));
                                }
                            } else {
                                if (!(inquiryState instanceof InquiryState.LoadFeatureFlagSession)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                InquiryState.LoadFeatureFlagSession loadFeatureFlagSession = (InquiryState.LoadFeatureFlagSession) inquiryState;
                                NavigationStateManager.setState$default(inquiryStateManager.navigationStateManager, false, false, false, 12);
                                SubtreeManager subtreeManager3 = (SubtreeManager) inquiryStateManager.lastChild;
                                FeatureFlagWorker_Factory_Impl featureFlagWorker_Factory_Impl = inquiryStateManager.featureFlagWorkerFactory;
                                String str39 = loadFeatureFlagSession.sessionToken;
                                SelfieAnalyzeWorker_Factory selfieAnalyzeWorker_Factory = featureFlagWorker_Factory_Impl.delegateFactory;
                                subtreeManager3.runningWorker(new FeatureFlagWorker(str39, (FeatureFlagManager) selfieAnalyzeWorker_Factory.selfieDirectionFeedProvider.get(), (FeatureFlagService) selfieAnalyzeWorker_Factory.sdkFilesManagerProvider.get()), new HCaptcha$$ExternalSyntheticLambda1(22, inquiryStateManager, loadFeatureFlagSession));
                                str2 = null;
                                loadingStepModel = new LoadingStepModel(new VideoCapture.AnonymousClass3(false ? 1 : 0, true, cameraHelper$$ExternalSyntheticLambda02, 12));
                            }
                            str2 = null;
                        }
                    }
                }
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) inquiryStateManager.next;
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(str2, loadingStepModel);
                return Unit.INSTANCE;
            }
            TransitionWorker_Factory_Impl transitionWorker_Factory_Impl = inquiryStateManager.transitionWorkerFactory;
            String shareToken = ((InquiryWorkflow$Props) ((StateFlowImpl) inquiryStateManager.firstChild).getValue()).getShareToken();
            InquirySessionConfig inquirySessionConfig4 = inquiryState.getInquirySessionConfig();
            TransitionWorker$TransitionData transitionWorker$TransitionData = ((TransitionStatus.Transitioning) transitionStatus).transitionData;
            MarkwonConfiguration markwonConfiguration = transitionWorker_Factory_Impl.delegateFactory;
            InquiryService inquiryService = (InquiryService) ((Provider) markwonConfiguration.theme).get();
            FallbackModeManager fallbackModeManager = (FallbackModeManager) ((Provider) markwonConfiguration.syntaxHighlight).get();
            UiStepSavedStateHelper uiStepSavedStateHelper = (UiStepSavedStateHelper) ((Provider) markwonConfiguration.linkResolver).get();
            FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) ((Provider) markwonConfiguration.imageDestinationProcessor).get();
            Context context = (Context) ((Provider) markwonConfiguration.spansFactory).get();
            obj5 = null;
            z = false;
            StuckPlayerDetector stuckPlayerDetector = new StuckPlayerDetector(sessionToken, inquiryId, shareToken, inquirySessionConfig4, transitionWorker$TransitionData, inquiryService, fallbackModeManager, uiStepSavedStateHelper, featureFlagManager6, context);
            final int i10 = z ? 1 : 0;
            subtreeManager.runningWorker(stuckPlayerDetector, new Function1() { // from class: com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda13
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj72) {
                    int i42 = i10;
                    String str52 = sessionToken;
                    InquiryState inquiryState2 = inquiryState;
                    InquiryStateManager inquiryStateManager2 = inquiryStateManager;
                    switch (i42) {
                        case 0:
                            TransitionWorker$Response transitionWorker$Response = (TransitionWorker$Response) obj72;
                            transitionWorker$Response.getClass();
                            if (!(transitionWorker$Response instanceof TransitionWorker$Response.Error)) {
                                if (!(transitionWorker$Response instanceof TransitionWorker$Response.Success)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    InquiryState inquiryState3 = (InquiryState) ((SubtreeManager) inquiryStateManager2.lastChild).getState();
                                    if (inquiryState3 == null) {
                                        break;
                                    } else {
                                        inquiryStateManager2.updateState(inquiryState3.updateTransitionStatus(new TransitionStatus.UpdateInquirySession(((TransitionWorker$Response.Success) transitionWorker$Response).nextState, false)));
                                    }
                                }
                            } else {
                                InquiryStateManager.runTransitionWorkerIfNeeded$handleError(inquiryStateManager2, inquiryState2, str52, ((TransitionWorker$Response.Error) transitionWorker$Response).cause);
                            }
                            break;
                        default:
                            TransitionBackResult transitionBackResult = (TransitionBackResult) obj72;
                            transitionBackResult.getClass();
                            if (!(transitionBackResult instanceof TransitionBackResult.Success)) {
                                if (!(transitionBackResult instanceof TransitionBackResult.Error)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    InternalErrorInfo internalErrorInfo22 = ((TransitionBackResult.Error) transitionBackResult).cause;
                                    if (InquiryStateManager.isInconsistentStateError(internalErrorInfo22) && (inquiryState2 instanceof StepState)) {
                                        inquiryStateManager2.updateState(InquiryStateManager.resyncState((StepState) inquiryState2));
                                    } else {
                                        inquiryStateManager2.setErrorOutput(str52, internalErrorInfo22, null);
                                    }
                                }
                            } else {
                                InquiryState inquiryState4 = ((TransitionBackResult.Success) transitionBackResult).nextState;
                                inquiryState4.didGoBack = true;
                                inquiryStateManager2.updateState(inquiryState4);
                            }
                            break;
                    }
                    return null;
                }
            });
        }
        obj4 = obj5;
        i = 15;
        z3 = true;
        r4 = obj4;
        silentNetworkAuthenticationManager = inquiryStateManager.silentNetworkAuthenticationManager;
        silentNetworkAuthenticationManager.getClass();
        z4 = inquiryState instanceof InquiryState.GovernmentIdStepRunning;
        if (z4) {
        }
        if (snaParams2 != null) {
        }
        if (Intrinsics.areEqual(inquiryState.getTransitionStatus(), transitioningBack)) {
        }
        NavigationStateManager navigationStateManager22 = inquiryStateManager.navigationStateManager;
        navigationStateManager22.isTransitioningBack = Intrinsics.areEqual(inquiryState.getTransitionStatus(), transitioningBack);
        navigationStateManager22.updateScreenState();
        CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda022 = new CameraHelper$$ExternalSyntheticLambda0(inquiryStateManager, 24);
        ((SubtreeManager) inquiryStateManager.lastChild).runningSideEffect("controllerRequestCollector", new WebRtcWorker$run$1.AnonymousClass1(inquiryStateManager, r4, i));
        InquiryWorkflow$Props inquiryWorkflow$Props22 = (InquiryWorkflow$Props) ((StateFlowImpl) inquiryStateManager.firstChild).getValue();
        if (inquiryState instanceof InquiryState.CreateInquiryFromTemplate) {
        }
        StateFlowImpl stateFlowImpl22 = (StateFlowImpl) inquiryStateManager.next;
        stateFlowImpl22.getClass();
        stateFlowImpl22.updateState(str2, loadingStepModel);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CameraChoice cameraChoice;
        CameraChoice cameraChoice2;
        Unit okhttpClient$lambda$0;
        int colorFromAttr$default;
        Integer backgroundColorValue;
        int i = this.$r8$classId;
        final int i2 = 2;
        int i3 = 4;
        final int i4 = 0;
        final int i5 = 3;
        final int i6 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                HCaptcha hCaptcha = (HCaptcha) obj2;
                HCaptchaException hCaptchaException = (HCaptchaException) obj;
                hCaptchaException.getClass();
                hCaptcha.exception = hCaptchaException;
                hCaptcha.tryCallbacks();
                return Unit.INSTANCE;
            case 1:
                NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) obj2;
                NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) obj;
                networkingLinkSignupState.getClass();
                networkingLinkSignupViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.save_to_link", networkingLinkSignupViewModel.getPane()));
                ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) networkingLinkSignupState.lookupAccount.invoke();
                if (consumerSessionLookup == null || !consumerSessionLookup.exists) {
                    FinancialConnectionsViewModel.execute$default(networkingLinkSignupViewModel, new WebRtcWorker$run$1.AnonymousClass1(networkingLinkSignupViewModel, objArr == true ? 1 : 0, 7), new PhoneNumberController$$ExternalSyntheticLambda5(i3));
                } else {
                    networkingLinkSignupViewModel.linkSignupHandler.navigateToVerification();
                }
                return Unit.INSTANCE;
            case 2:
                return new CollectBankAccountResponseInternal((StripeIntent) obj, new CollectBankAccountResponseInternal.USBankAccountData((FinancialConnectionsSession) obj2), null);
            case 3:
                ActivityHost activityHost = (ActivityHost) obj;
                activityHost.getClass();
                ActivityResultLauncher activityResultLauncher = ((Stripe3DS2NextActionHandler) obj2).stripe3ds2CompletionLauncher;
                if (activityResultLauncher != null) {
                    return new DocumentSelectLauncherModule(activityResultLauncher, 3);
                }
                activityHost.getClass();
                Pool pool = new Pool();
                pool.pool = activityHost;
                return pool;
            case 4:
                ActivityHost activityHost2 = (ActivityHost) obj;
                activityHost2.getClass();
                ActivityResultLauncher activityResultLauncher2 = ((DefaultPaymentNextActionHandlerRegistry) ((Lazy) obj2).get()).paymentRelayLauncher;
                return activityResultLauncher2 != null ? new PaymentRelayStarter$Legacy(activityResultLauncher2) : new PaymentRelayStarter$Legacy(activityHost2);
            case 5:
                ImageView imageView = (ImageView) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(bitmap);
                } else {
                    imageView.setVisibility(8);
                }
                return Unit.INSTANCE;
            case 6:
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = (PaymentAuthWebViewActivity) obj2;
                int i7 = PaymentAuthWebViewActivity.$r8$clinit;
                ((OnBackPressedCallback) obj).getClass();
                if (paymentAuthWebViewActivity.getViewBinding().webView.canGoBack()) {
                    paymentAuthWebViewActivity.getViewBinding().webView.goBack();
                } else {
                    paymentAuthWebViewActivity.cancelIntentSource();
                }
                return Unit.INSTANCE;
            case 7:
                String str = ((AppSetIdInfo) obj).zza;
                str.getClass();
                ((RealDeviceVendorIDProvider) obj2).appSetId = str;
                return Unit.INSTANCE;
            case 8:
                DocumentWorkflow.Screen.ReviewCaptures reviewCaptures = (DocumentWorkflow.Screen.ReviewCaptures) obj2;
                DocumentFile documentFile = (DocumentFile) obj;
                documentFile.getClass();
                if (documentFile instanceof DocumentFile.Remote) {
                    reviewCaptures.onRemove.invoke(documentFile);
                }
                return Unit.INSTANCE;
            case 9:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                updater.state = ((DocumentWorkflow.State) obj2).copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.None);
                return Unit.INSTANCE;
            case 10:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.setOutput(new DocumentWorkflow.Output.Errored(((DocumentSubmitWorker.Response.Error) ((DocumentSubmitWorker.Response) obj2)).cause));
                return Unit.INSTANCE;
            case 11:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.setOutput(new DocumentWorkflow.Output.Errored(((DocumentFileUploadWorker.Response.NetworkError) ((DocumentFileUploadWorker.Response) obj2)).cause));
                return Unit.INSTANCE;
            case 12:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.state = DocumentWorkflow.State.copyWithUploadState$document_release$default((DocumentWorkflow.State) updater4.state, new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) obj2).documentId), null, null, null, 14);
                return Unit.INSTANCE;
            case 13:
                DocumentStepFragment documentStepFragment = (DocumentStepFragment) obj2;
                SavedStateHandle savedStateHandle = (SavedStateHandle) obj;
                savedStateHandle.getClass();
                DocumentStepViewModel_Factory_Impl documentStepViewModel_Factory_Impl = documentStepFragment.viewModelFactory;
                if (documentStepViewModel_Factory_Impl != null) {
                    return new DocumentStepViewModel(savedStateHandle, ((DocumentStepFragment.DocumentStepFragmentArgs) documentStepFragment.args$delegate.getValue()).props, (DocumentStepStateManager_Factory_Impl) documentStepViewModel_Factory_Impl.delegateFactory.documentStepStateManagerFactoryProvider.instance);
                }
                Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
                throw null;
            case 14:
                final ChooseCaptureMethodView chooseCaptureMethodView = (ChooseCaptureMethodView) obj2;
                final Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding = (Pi2GovernmentidChooseCaptureMethodBinding) obj;
                pi2GovernmentidChooseCaptureMethodBinding.getClass();
                CoordinatorLayout coordinatorLayout = pi2GovernmentidChooseCaptureMethodBinding.rootView;
                coordinatorLayout.getClass();
                InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout, 15);
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda0
                    @Override // com.squareup.workflow1.ui.LayoutRunner
                    public final void showRendering(Object obj3, ViewEnvironment viewEnvironment) {
                        final int i8;
                        StepStyles.StepSubmitButtonComponentStyleContainer base;
                        ButtonSubmitComponentStyle base2;
                        StepStyles.StepTextBasedComponentStyleContainer base3;
                        TextBasedComponentStyle base4;
                        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
                        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
                        int i9 = i4;
                        LocalImageComponentStyle localImageComponentStyle = null;
                        Object obj4 = chooseCaptureMethodView;
                        Object obj5 = pi2GovernmentidChooseCaptureMethodBinding;
                        final int i10 = 1;
                        final int i11 = 0;
                        switch (i9) {
                            case 0:
                                Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding2 = (Pi2GovernmentidChooseCaptureMethodBinding) obj5;
                                ChooseCaptureMethodView chooseCaptureMethodView2 = (ChooseCaptureMethodView) obj4;
                                final ChooseCaptureMethodView chooseCaptureMethodView3 = (ChooseCaptureMethodView) obj3;
                                viewEnvironment.getClass();
                                CoordinatorLayout coordinatorLayout2 = pi2GovernmentidChooseCaptureMethodBinding2.rootView;
                                ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidChooseCaptureMethodBinding2.idImage;
                                Pi2NavigationBar pi2NavigationBar = pi2GovernmentidChooseCaptureMethodBinding2.navigationBar;
                                PersonaMaterialButton personaMaterialButton = pi2GovernmentidChooseCaptureMethodBinding2.uploadButton;
                                PersonaMaterialButton personaMaterialButton2 = pi2GovernmentidChooseCaptureMethodBinding2.cameraButton;
                                Context context = coordinatorLayout2.getContext();
                                TextView textView = pi2GovernmentidChooseCaptureMethodBinding2.title;
                                textView.setText(chooseCaptureMethodView3.title);
                                TextView textView2 = pi2GovernmentidChooseCaptureMethodBinding2.body;
                                textView2.setText(chooseCaptureMethodView3.body);
                                List list = chooseCaptureMethodView2.captureOptions;
                                String str2 = chooseCaptureMethodView2.cameraText;
                                if (list.contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
                                    if (StringsKt.isBlank(str2)) {
                                        personaMaterialButton2.setText((CharSequence) null);
                                        personaMaterialButton2.setIcon(DimensionKt.getDrawable(context, R.drawable.pi2_governmentid_cameraicon));
                                    } else {
                                        personaMaterialButton2.setText(str2);
                                        personaMaterialButton2.setIcon(null);
                                    }
                                    final int i12 = 0;
                                    personaMaterialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i13 = i12;
                                            ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                            switch (i13) {
                                                case 0:
                                                    chooseCaptureMethodView4.onCameraCaptureClick.invoke();
                                                    break;
                                                default:
                                                    chooseCaptureMethodView4.onUploadClick.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (list.contains(CaptureOptionNativeMobile.UPLOAD)) {
                                    personaMaterialButton.setText(chooseCaptureMethodView3.uploadButtonText);
                                    i8 = 1;
                                    personaMaterialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i13 = i8;
                                            ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                            switch (i13) {
                                                case 0:
                                                    chooseCaptureMethodView4.onCameraCaptureClick.invoke();
                                                    break;
                                                default:
                                                    chooseCaptureMethodView4.onUploadClick.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    i8 = 1;
                                }
                                final int i13 = 0;
                                zzai.applyNavigationState(chooseCaptureMethodView3.navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i13;
                                        ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                        switch (i14) {
                                            case 0:
                                                chooseCaptureMethodView4.onBack.invoke();
                                                break;
                                            default:
                                                chooseCaptureMethodView4.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i8;
                                        ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                        switch (i14) {
                                            case 0:
                                                chooseCaptureMethodView4.onBack.invoke();
                                                break;
                                            default:
                                                chooseCaptureMethodView4.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout2);
                                LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout2, chooseCaptureMethodView3.error, chooseCaptureMethodView3.onErrorDismissed, null, 2, 0);
                                RemoteImage remoteImage = chooseCaptureMethodView2.pictographAsset;
                                if (remoteImage == null) {
                                    themeableLottieAnimationView.setAnimation(chooseCaptureMethodView2.localAsset);
                                } else if (chooseCaptureMethodView2.currentPictographAssetView == null) {
                                    chooseCaptureMethodView2.currentPictographAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, pi2GovernmentidChooseCaptureMethodBinding2.imageViewContainer, false);
                                    pi2GovernmentidChooseCaptureMethodBinding2.localImage.setVisibility(8);
                                }
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = chooseCaptureMethodView2.styles;
                                if (governmentIdStepStyle != null) {
                                    View view = pi2GovernmentidChooseCaptureMethodBinding2.idImageContainer;
                                    Integer backgroundColorValue2 = governmentIdStepStyle.getBackgroundColorValue();
                                    if (backgroundColorValue2 != null) {
                                        int intValue = backgroundColorValue2.intValue();
                                        coordinatorLayout2.setBackgroundColor(intValue);
                                        Context context2 = coordinatorLayout2.getContext();
                                        context2.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context2, intValue);
                                    }
                                    Context context3 = coordinatorLayout2.getContext();
                                    context3.getClass();
                                    Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle, context3);
                                    if (backgroundImageDrawable != null) {
                                        coordinatorLayout2.setBackground(backgroundImageDrawable);
                                    }
                                    Integer headerButtonColorValue = governmentIdStepStyle.getHeaderButtonColorValue();
                                    if (headerButtonColorValue != null) {
                                        pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
                                    }
                                    TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
                                    if (titleStyleValue != null) {
                                        TextStylingKt.style(textView, titleStyleValue, EmptySet.INSTANCE);
                                    }
                                    TextBasedComponentStyle textStyleValue = governmentIdStepStyle.getTextStyleValue();
                                    if (textStyleValue != null) {
                                        TextStylingKt.style(textView2, textStyleValue, EmptySet.INSTANCE);
                                    }
                                    ButtonSubmitComponentStyle buttonPrimaryStyleValue = governmentIdStepStyle.getButtonPrimaryStyleValue();
                                    if (buttonPrimaryStyleValue != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton2, buttonPrimaryStyleValue, false, false, 14);
                                    }
                                    ButtonCancelComponentStyle buttonSecondaryStyleValue = governmentIdStepStyle.getButtonSecondaryStyleValue();
                                    if (buttonSecondaryStyleValue != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton, buttonSecondaryStyleValue, false, false, 14);
                                    }
                                    Integer fillColorValue = governmentIdStepStyle.getFillColorValue();
                                    if (fillColorValue != null) {
                                        view.setBackground(new ColorDrawable(fillColorValue.intValue()));
                                    }
                                    ImageStylingKt.replaceColors(themeableLottieAnimationView, governmentIdStepStyle.getStrokeColorValue(), governmentIdStepStyle.getFillColorValue(), null, null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0], new String[0]);
                                    break;
                                }
                                break;
                            case 1:
                                Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding = (Pi2GovernmentidReviewSelectedImageBinding) obj5;
                                final ReviewSelectedImageView reviewSelectedImageView = (ReviewSelectedImageView) obj4;
                                final ReviewSelectedImageView reviewSelectedImageView2 = (ReviewSelectedImageView) obj3;
                                viewEnvironment.getClass();
                                TextView textView3 = pi2GovernmentidReviewSelectedImageBinding.title;
                                Pi2NavigationBar pi2NavigationBar2 = pi2GovernmentidReviewSelectedImageBinding.navigationBar;
                                CoordinatorLayout coordinatorLayout3 = pi2GovernmentidReviewSelectedImageBinding.rootView;
                                TextView textView4 = pi2GovernmentidReviewSelectedImageBinding.fileNameTextview;
                                textView3.setText(reviewSelectedImageView2.title);
                                TextView textView5 = pi2GovernmentidReviewSelectedImageBinding.body;
                                textView5.setText(reviewSelectedImageView2.body);
                                ButtonWithLoadingIndicator buttonWithLoadingIndicator = pi2GovernmentidReviewSelectedImageBinding.usePhotoButton;
                                buttonWithLoadingIndicator.setText(reviewSelectedImageView.confirmButtonText);
                                buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i14 = i11;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onUsePhotoClick.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onChooseNewPhotoClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                PersonaMaterialButton personaMaterialButton3 = pi2GovernmentidReviewSelectedImageBinding.chooseNewPhotoButton;
                                personaMaterialButton3.setText(reviewSelectedImageView.chooseNewPhotoText);
                                personaMaterialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i14 = i10;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onUsePhotoClick.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onChooseNewPhotoClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                String str3 = reviewSelectedImageView.fileToReviewPath;
                                File file = new File(str3);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(str3, options);
                                boolean startsWith = StringsKt__StringsJVMKt.startsWith(reviewSelectedImageView.fileMimeType, "image/", false);
                                ImageView imageView2 = pi2GovernmentidReviewSelectedImageBinding.imageView;
                                if (startsWith) {
                                    RealImageLoader realImageLoader = reviewSelectedImageView.imageLoader;
                                    ImageRequest.Builder builder = new ImageRequest.Builder(imageView2.getContext());
                                    builder.data = file;
                                    ImageRequests_androidKt.target(builder, imageView2);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setSize(options.outWidth, options.outHeight);
                                    gradientDrawable.setColor(0);
                                    builder.placeholder(Image_androidKt.asImage(gradientDrawable));
                                    realImageLoader.enqueue(builder.build());
                                } else {
                                    imageView2.setVisibility(8);
                                    pi2GovernmentidReviewSelectedImageBinding.fileIcon.setVisibility(0);
                                    textView4.setVisibility(0);
                                    textView4.setText(reviewSelectedImageView.fileName);
                                }
                                NavigationState navigationState = reviewSelectedImageView2.navigationState;
                                Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i11;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView2;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onBack.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                final int i14 = 1;
                                Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i142 = i14;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView2;
                                        switch (i142) {
                                            case 0:
                                                reviewSelectedImageView3.onBack.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                coordinatorLayout3.getClass();
                                zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar2, coordinatorLayout3);
                                buttonWithLoadingIndicator.setIsLoading(reviewSelectedImageView2.isAutoClassifying);
                                LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout3, reviewSelectedImageView2.error, reviewSelectedImageView2.onErrorDismissed, null, 2, 0);
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = reviewSelectedImageView.styles;
                                if (governmentIdStepStyle2 != null) {
                                    TextView textView6 = pi2GovernmentidReviewSelectedImageBinding.title;
                                    Integer backgroundColorValue3 = governmentIdStepStyle2.getBackgroundColorValue();
                                    if (backgroundColorValue3 != null) {
                                        int intValue2 = backgroundColorValue3.intValue();
                                        coordinatorLayout3.setBackgroundColor(intValue2);
                                        Context context4 = coordinatorLayout3.getContext();
                                        context4.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context4, intValue2);
                                    }
                                    Context context5 = coordinatorLayout3.getContext();
                                    context5.getClass();
                                    Drawable backgroundImageDrawable2 = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle2, context5);
                                    if (backgroundImageDrawable2 != null) {
                                        coordinatorLayout3.setBackground(backgroundImageDrawable2);
                                    }
                                    Integer headerButtonColorValue2 = governmentIdStepStyle2.getHeaderButtonColorValue();
                                    if (headerButtonColorValue2 != null) {
                                        pi2NavigationBar2.setControlsColor(headerButtonColorValue2.intValue());
                                    }
                                    TextBasedComponentStyle titleStyleValue2 = governmentIdStepStyle2.getTitleStyleValue();
                                    if (titleStyleValue2 != null) {
                                        TextStylingKt.style(textView6, titleStyleValue2, EmptySet.INSTANCE);
                                    }
                                    TextBasedComponentStyle textStyleValue2 = governmentIdStepStyle2.getTextStyleValue();
                                    if (textStyleValue2 != null) {
                                        TextStylingKt.style(textView5, textStyleValue2, EmptySet.INSTANCE);
                                    }
                                    ButtonSubmitComponentStyle buttonPrimaryStyleValue2 = governmentIdStepStyle2.getButtonPrimaryStyleValue();
                                    if (buttonPrimaryStyleValue2 != null) {
                                        ButtonStylingKt.style$default(buttonWithLoadingIndicator, buttonPrimaryStyleValue2);
                                    }
                                    ButtonCancelComponentStyle buttonSecondaryStyleValue2 = governmentIdStepStyle2.getButtonSecondaryStyleValue();
                                    if (buttonSecondaryStyleValue2 != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton3, buttonSecondaryStyleValue2, false, false, 14);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Pi2ErrorBinding pi2ErrorBinding = (Pi2ErrorBinding) obj5;
                                ErrorView errorView = (ErrorView) obj4;
                                final ErrorView errorView2 = (ErrorView) obj3;
                                viewEnvironment.getClass();
                                NavigationState navigationState2 = errorView2.navigationState;
                                Function0 function03 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i15 = i11;
                                        ErrorView errorView3 = errorView2;
                                        switch (i15) {
                                            case 0:
                                                errorView3.onBackClick.invoke();
                                                break;
                                            default:
                                                errorView3.onCancelClick.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                Function0 function04 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i15 = i10;
                                        ErrorView errorView3 = errorView2;
                                        switch (i15) {
                                            case 0:
                                                errorView3.onBackClick.invoke();
                                                break;
                                            default:
                                                errorView3.onCancelClick.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                Pi2NavigationBar pi2NavigationBar3 = pi2ErrorBinding.navigationBar;
                                TextView textView7 = pi2ErrorBinding.title;
                                Button button = pi2ErrorBinding.continueButton;
                                CoordinatorLayout coordinatorLayout4 = pi2ErrorBinding.rootView;
                                coordinatorLayout4.getClass();
                                zzai.applyNavigationState(navigationState2, function03, function04, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar3, coordinatorLayout4);
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = errorView2.styles;
                                if (governmentIdStepStyle3 != null && (imageLocalStyle = governmentIdStepStyle3.getImageLocalStyle()) != null && (illustration = imageLocalStyle.getIllustration()) != null) {
                                    localImageComponentStyle = illustration.getBase();
                                }
                                pi2ErrorBinding.illustration.setAnimation(R.raw.pi2_id_front_fail);
                                if (localImageComponentStyle != null) {
                                    ah.addOneShotPreDrawListenerAndDiscardFrame(coordinatorLayout4, new ErrorView$$ExternalSyntheticLambda4(pi2ErrorBinding, localImageComponentStyle, 0));
                                }
                                textView7.setText(errorView2.titleText);
                                button.setText(errorView2.continueButtonText);
                                button.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(errorView, 15));
                                if (governmentIdStepStyle3 != null) {
                                    Integer backgroundColorValue4 = governmentIdStepStyle3.getBackgroundColorValue();
                                    if (backgroundColorValue4 != null) {
                                        int intValue3 = backgroundColorValue4.intValue();
                                        coordinatorLayout4.setBackgroundColor(intValue3);
                                        Context context6 = coordinatorLayout4.getContext();
                                        context6.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context6, intValue3);
                                    }
                                    StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle3.getTitleStyle();
                                    if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
                                        TextStylingKt.style(textView7, base4, EmptySet.INSTANCE);
                                    }
                                    StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle3.getButtonPrimaryStyle();
                                    if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
                                        ButtonStylingKt.style$default(button, base2, false, false, 14);
                                        break;
                                    }
                                }
                                break;
                            default:
                                OldBottomSheetDialogView oldBottomSheetDialogView = (OldBottomSheetDialogView) obj5;
                                Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding = (Pi2RequestPermissionRationaleBinding) obj4;
                                final OldBottomSheetDialogView oldBottomSheetDialogView2 = (OldBottomSheetDialogView) obj3;
                                viewEnvironment.getClass();
                                pi2RequestPermissionRationaleBinding.getClass();
                                String str4 = oldBottomSheetDialogView.titleText;
                                int length = str4.length();
                                TextView textView8 = pi2RequestPermissionRationaleBinding.title;
                                if (length > 0) {
                                    ExtensionsKt.setMarkdown(textView8, str4);
                                } else {
                                    textView8.setVisibility(8);
                                }
                                TextView textView9 = pi2RequestPermissionRationaleBinding.message;
                                PersonaMaterialButton personaMaterialButton4 = pi2RequestPermissionRationaleBinding.positiveButton;
                                PersonaMaterialButton personaMaterialButton5 = pi2RequestPermissionRationaleBinding.negativeButton;
                                ExtensionsKt.setMarkdown(textView9, oldBottomSheetDialogView.messageText);
                                personaMaterialButton4.setText(oldBottomSheetDialogView2.positiveButtonText);
                                personaMaterialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i15 = i11;
                                        OldBottomSheetDialogView oldBottomSheetDialogView3 = oldBottomSheetDialogView2;
                                        switch (i15) {
                                            case 0:
                                                oldBottomSheetDialogView3.onPositiveButtonClick.invoke();
                                                break;
                                            default:
                                                oldBottomSheetDialogView3.onNegativeButtonClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                personaMaterialButton5.setText(oldBottomSheetDialogView2.negativeButtonText);
                                personaMaterialButton5.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i15 = i10;
                                        OldBottomSheetDialogView oldBottomSheetDialogView3 = oldBottomSheetDialogView2;
                                        switch (i15) {
                                            case 0:
                                                oldBottomSheetDialogView3.onPositiveButtonClick.invoke();
                                                break;
                                            default:
                                                oldBottomSheetDialogView3.onNegativeButtonClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                BackPressHandlerKt.setBackPressedHandler(pi2RequestPermissionRationaleBinding.bottomSheet, new OldBottomSheetDialogView$$ExternalSyntheticLambda3(oldBottomSheetDialogView2, 0));
                                ah.addOneShotPreDrawListenerAndDiscardFrame(personaMaterialButton5, new StateFlowsKt$$ExternalSyntheticLambda2(10, pi2RequestPermissionRationaleBinding, oldBottomSheetDialogView));
                                break;
                        }
                    }
                };
            case 15:
                IdConfig idConfig = (IdConfig) obj;
                idConfig.getClass();
                ((Screen.InstructionsScreen) obj2).selectIdClass.invoke(idConfig);
                return Unit.INSTANCE;
            case 16:
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                updater5.setOutput((GovernmentIdWorkflow.Output) obj2);
                return Unit.INSTANCE;
            case 17:
                final ReviewSelectedImageView reviewSelectedImageView = (ReviewSelectedImageView) obj2;
                final Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding = (Pi2GovernmentidReviewSelectedImageBinding) obj;
                pi2GovernmentidReviewSelectedImageBinding.getClass();
                CoordinatorLayout coordinatorLayout2 = pi2GovernmentidReviewSelectedImageBinding.rootView;
                coordinatorLayout2.getClass();
                InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout2, 15);
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda0
                    @Override // com.squareup.workflow1.ui.LayoutRunner
                    public final void showRendering(Object obj3, ViewEnvironment viewEnvironment) {
                        final int i8;
                        StepStyles.StepSubmitButtonComponentStyleContainer base;
                        ButtonSubmitComponentStyle base2;
                        StepStyles.StepTextBasedComponentStyleContainer base3;
                        TextBasedComponentStyle base4;
                        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
                        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
                        int i9 = i6;
                        LocalImageComponentStyle localImageComponentStyle = null;
                        Object obj4 = reviewSelectedImageView;
                        Object obj5 = pi2GovernmentidReviewSelectedImageBinding;
                        final int i10 = 1;
                        final int i11 = 0;
                        switch (i9) {
                            case 0:
                                Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding2 = (Pi2GovernmentidChooseCaptureMethodBinding) obj5;
                                ChooseCaptureMethodView chooseCaptureMethodView2 = (ChooseCaptureMethodView) obj4;
                                final ChooseCaptureMethodView chooseCaptureMethodView3 = (ChooseCaptureMethodView) obj3;
                                viewEnvironment.getClass();
                                CoordinatorLayout coordinatorLayout22 = pi2GovernmentidChooseCaptureMethodBinding2.rootView;
                                ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidChooseCaptureMethodBinding2.idImage;
                                Pi2NavigationBar pi2NavigationBar = pi2GovernmentidChooseCaptureMethodBinding2.navigationBar;
                                PersonaMaterialButton personaMaterialButton = pi2GovernmentidChooseCaptureMethodBinding2.uploadButton;
                                PersonaMaterialButton personaMaterialButton2 = pi2GovernmentidChooseCaptureMethodBinding2.cameraButton;
                                Context context = coordinatorLayout22.getContext();
                                TextView textView = pi2GovernmentidChooseCaptureMethodBinding2.title;
                                textView.setText(chooseCaptureMethodView3.title);
                                TextView textView2 = pi2GovernmentidChooseCaptureMethodBinding2.body;
                                textView2.setText(chooseCaptureMethodView3.body);
                                List list = chooseCaptureMethodView2.captureOptions;
                                String str2 = chooseCaptureMethodView2.cameraText;
                                if (list.contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
                                    if (StringsKt.isBlank(str2)) {
                                        personaMaterialButton2.setText((CharSequence) null);
                                        personaMaterialButton2.setIcon(DimensionKt.getDrawable(context, R.drawable.pi2_governmentid_cameraicon));
                                    } else {
                                        personaMaterialButton2.setText(str2);
                                        personaMaterialButton2.setIcon(null);
                                    }
                                    final int i12 = 0;
                                    personaMaterialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i13 = i12;
                                            ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                            switch (i13) {
                                                case 0:
                                                    chooseCaptureMethodView4.onCameraCaptureClick.invoke();
                                                    break;
                                                default:
                                                    chooseCaptureMethodView4.onUploadClick.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (list.contains(CaptureOptionNativeMobile.UPLOAD)) {
                                    personaMaterialButton.setText(chooseCaptureMethodView3.uploadButtonText);
                                    i8 = 1;
                                    personaMaterialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i13 = i8;
                                            ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                            switch (i13) {
                                                case 0:
                                                    chooseCaptureMethodView4.onCameraCaptureClick.invoke();
                                                    break;
                                                default:
                                                    chooseCaptureMethodView4.onUploadClick.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    i8 = 1;
                                }
                                final int i13 = 0;
                                zzai.applyNavigationState(chooseCaptureMethodView3.navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i13;
                                        ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                        switch (i14) {
                                            case 0:
                                                chooseCaptureMethodView4.onBack.invoke();
                                                break;
                                            default:
                                                chooseCaptureMethodView4.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i8;
                                        ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                        switch (i14) {
                                            case 0:
                                                chooseCaptureMethodView4.onBack.invoke();
                                                break;
                                            default:
                                                chooseCaptureMethodView4.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout22);
                                LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout22, chooseCaptureMethodView3.error, chooseCaptureMethodView3.onErrorDismissed, null, 2, 0);
                                RemoteImage remoteImage = chooseCaptureMethodView2.pictographAsset;
                                if (remoteImage == null) {
                                    themeableLottieAnimationView.setAnimation(chooseCaptureMethodView2.localAsset);
                                } else if (chooseCaptureMethodView2.currentPictographAssetView == null) {
                                    chooseCaptureMethodView2.currentPictographAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, pi2GovernmentidChooseCaptureMethodBinding2.imageViewContainer, false);
                                    pi2GovernmentidChooseCaptureMethodBinding2.localImage.setVisibility(8);
                                }
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = chooseCaptureMethodView2.styles;
                                if (governmentIdStepStyle != null) {
                                    View view = pi2GovernmentidChooseCaptureMethodBinding2.idImageContainer;
                                    Integer backgroundColorValue2 = governmentIdStepStyle.getBackgroundColorValue();
                                    if (backgroundColorValue2 != null) {
                                        int intValue = backgroundColorValue2.intValue();
                                        coordinatorLayout22.setBackgroundColor(intValue);
                                        Context context2 = coordinatorLayout22.getContext();
                                        context2.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context2, intValue);
                                    }
                                    Context context3 = coordinatorLayout22.getContext();
                                    context3.getClass();
                                    Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle, context3);
                                    if (backgroundImageDrawable != null) {
                                        coordinatorLayout22.setBackground(backgroundImageDrawable);
                                    }
                                    Integer headerButtonColorValue = governmentIdStepStyle.getHeaderButtonColorValue();
                                    if (headerButtonColorValue != null) {
                                        pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
                                    }
                                    TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
                                    if (titleStyleValue != null) {
                                        TextStylingKt.style(textView, titleStyleValue, EmptySet.INSTANCE);
                                    }
                                    TextBasedComponentStyle textStyleValue = governmentIdStepStyle.getTextStyleValue();
                                    if (textStyleValue != null) {
                                        TextStylingKt.style(textView2, textStyleValue, EmptySet.INSTANCE);
                                    }
                                    ButtonSubmitComponentStyle buttonPrimaryStyleValue = governmentIdStepStyle.getButtonPrimaryStyleValue();
                                    if (buttonPrimaryStyleValue != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton2, buttonPrimaryStyleValue, false, false, 14);
                                    }
                                    ButtonCancelComponentStyle buttonSecondaryStyleValue = governmentIdStepStyle.getButtonSecondaryStyleValue();
                                    if (buttonSecondaryStyleValue != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton, buttonSecondaryStyleValue, false, false, 14);
                                    }
                                    Integer fillColorValue = governmentIdStepStyle.getFillColorValue();
                                    if (fillColorValue != null) {
                                        view.setBackground(new ColorDrawable(fillColorValue.intValue()));
                                    }
                                    ImageStylingKt.replaceColors(themeableLottieAnimationView, governmentIdStepStyle.getStrokeColorValue(), governmentIdStepStyle.getFillColorValue(), null, null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0], new String[0]);
                                    break;
                                }
                                break;
                            case 1:
                                Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding2 = (Pi2GovernmentidReviewSelectedImageBinding) obj5;
                                final ReviewSelectedImageView reviewSelectedImageView2 = (ReviewSelectedImageView) obj4;
                                final ReviewSelectedImageView reviewSelectedImageView22 = (ReviewSelectedImageView) obj3;
                                viewEnvironment.getClass();
                                TextView textView3 = pi2GovernmentidReviewSelectedImageBinding2.title;
                                Pi2NavigationBar pi2NavigationBar2 = pi2GovernmentidReviewSelectedImageBinding2.navigationBar;
                                CoordinatorLayout coordinatorLayout3 = pi2GovernmentidReviewSelectedImageBinding2.rootView;
                                TextView textView4 = pi2GovernmentidReviewSelectedImageBinding2.fileNameTextview;
                                textView3.setText(reviewSelectedImageView22.title);
                                TextView textView5 = pi2GovernmentidReviewSelectedImageBinding2.body;
                                textView5.setText(reviewSelectedImageView22.body);
                                ButtonWithLoadingIndicator buttonWithLoadingIndicator = pi2GovernmentidReviewSelectedImageBinding2.usePhotoButton;
                                buttonWithLoadingIndicator.setText(reviewSelectedImageView2.confirmButtonText);
                                buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i14 = i11;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView2;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onUsePhotoClick.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onChooseNewPhotoClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                PersonaMaterialButton personaMaterialButton3 = pi2GovernmentidReviewSelectedImageBinding2.chooseNewPhotoButton;
                                personaMaterialButton3.setText(reviewSelectedImageView2.chooseNewPhotoText);
                                personaMaterialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i14 = i10;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView2;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onUsePhotoClick.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onChooseNewPhotoClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                String str3 = reviewSelectedImageView2.fileToReviewPath;
                                File file = new File(str3);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(str3, options);
                                boolean startsWith = StringsKt__StringsJVMKt.startsWith(reviewSelectedImageView2.fileMimeType, "image/", false);
                                ImageView imageView2 = pi2GovernmentidReviewSelectedImageBinding2.imageView;
                                if (startsWith) {
                                    RealImageLoader realImageLoader = reviewSelectedImageView2.imageLoader;
                                    ImageRequest.Builder builder = new ImageRequest.Builder(imageView2.getContext());
                                    builder.data = file;
                                    ImageRequests_androidKt.target(builder, imageView2);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setSize(options.outWidth, options.outHeight);
                                    gradientDrawable.setColor(0);
                                    builder.placeholder(Image_androidKt.asImage(gradientDrawable));
                                    realImageLoader.enqueue(builder.build());
                                } else {
                                    imageView2.setVisibility(8);
                                    pi2GovernmentidReviewSelectedImageBinding2.fileIcon.setVisibility(0);
                                    textView4.setVisibility(0);
                                    textView4.setText(reviewSelectedImageView2.fileName);
                                }
                                NavigationState navigationState = reviewSelectedImageView22.navigationState;
                                Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i142 = i11;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView22;
                                        switch (i142) {
                                            case 0:
                                                reviewSelectedImageView3.onBack.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                final int i14 = 1;
                                Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i142 = i14;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView22;
                                        switch (i142) {
                                            case 0:
                                                reviewSelectedImageView3.onBack.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                coordinatorLayout3.getClass();
                                zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar2, coordinatorLayout3);
                                buttonWithLoadingIndicator.setIsLoading(reviewSelectedImageView22.isAutoClassifying);
                                LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout3, reviewSelectedImageView22.error, reviewSelectedImageView22.onErrorDismissed, null, 2, 0);
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = reviewSelectedImageView2.styles;
                                if (governmentIdStepStyle2 != null) {
                                    TextView textView6 = pi2GovernmentidReviewSelectedImageBinding2.title;
                                    Integer backgroundColorValue3 = governmentIdStepStyle2.getBackgroundColorValue();
                                    if (backgroundColorValue3 != null) {
                                        int intValue2 = backgroundColorValue3.intValue();
                                        coordinatorLayout3.setBackgroundColor(intValue2);
                                        Context context4 = coordinatorLayout3.getContext();
                                        context4.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context4, intValue2);
                                    }
                                    Context context5 = coordinatorLayout3.getContext();
                                    context5.getClass();
                                    Drawable backgroundImageDrawable2 = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle2, context5);
                                    if (backgroundImageDrawable2 != null) {
                                        coordinatorLayout3.setBackground(backgroundImageDrawable2);
                                    }
                                    Integer headerButtonColorValue2 = governmentIdStepStyle2.getHeaderButtonColorValue();
                                    if (headerButtonColorValue2 != null) {
                                        pi2NavigationBar2.setControlsColor(headerButtonColorValue2.intValue());
                                    }
                                    TextBasedComponentStyle titleStyleValue2 = governmentIdStepStyle2.getTitleStyleValue();
                                    if (titleStyleValue2 != null) {
                                        TextStylingKt.style(textView6, titleStyleValue2, EmptySet.INSTANCE);
                                    }
                                    TextBasedComponentStyle textStyleValue2 = governmentIdStepStyle2.getTextStyleValue();
                                    if (textStyleValue2 != null) {
                                        TextStylingKt.style(textView5, textStyleValue2, EmptySet.INSTANCE);
                                    }
                                    ButtonSubmitComponentStyle buttonPrimaryStyleValue2 = governmentIdStepStyle2.getButtonPrimaryStyleValue();
                                    if (buttonPrimaryStyleValue2 != null) {
                                        ButtonStylingKt.style$default(buttonWithLoadingIndicator, buttonPrimaryStyleValue2);
                                    }
                                    ButtonCancelComponentStyle buttonSecondaryStyleValue2 = governmentIdStepStyle2.getButtonSecondaryStyleValue();
                                    if (buttonSecondaryStyleValue2 != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton3, buttonSecondaryStyleValue2, false, false, 14);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Pi2ErrorBinding pi2ErrorBinding = (Pi2ErrorBinding) obj5;
                                ErrorView errorView = (ErrorView) obj4;
                                final ErrorView errorView2 = (ErrorView) obj3;
                                viewEnvironment.getClass();
                                NavigationState navigationState2 = errorView2.navigationState;
                                Function0 function03 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i15 = i11;
                                        ErrorView errorView3 = errorView2;
                                        switch (i15) {
                                            case 0:
                                                errorView3.onBackClick.invoke();
                                                break;
                                            default:
                                                errorView3.onCancelClick.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                Function0 function04 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i15 = i10;
                                        ErrorView errorView3 = errorView2;
                                        switch (i15) {
                                            case 0:
                                                errorView3.onBackClick.invoke();
                                                break;
                                            default:
                                                errorView3.onCancelClick.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                Pi2NavigationBar pi2NavigationBar3 = pi2ErrorBinding.navigationBar;
                                TextView textView7 = pi2ErrorBinding.title;
                                Button button = pi2ErrorBinding.continueButton;
                                CoordinatorLayout coordinatorLayout4 = pi2ErrorBinding.rootView;
                                coordinatorLayout4.getClass();
                                zzai.applyNavigationState(navigationState2, function03, function04, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar3, coordinatorLayout4);
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = errorView2.styles;
                                if (governmentIdStepStyle3 != null && (imageLocalStyle = governmentIdStepStyle3.getImageLocalStyle()) != null && (illustration = imageLocalStyle.getIllustration()) != null) {
                                    localImageComponentStyle = illustration.getBase();
                                }
                                pi2ErrorBinding.illustration.setAnimation(R.raw.pi2_id_front_fail);
                                if (localImageComponentStyle != null) {
                                    ah.addOneShotPreDrawListenerAndDiscardFrame(coordinatorLayout4, new ErrorView$$ExternalSyntheticLambda4(pi2ErrorBinding, localImageComponentStyle, 0));
                                }
                                textView7.setText(errorView2.titleText);
                                button.setText(errorView2.continueButtonText);
                                button.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(errorView, 15));
                                if (governmentIdStepStyle3 != null) {
                                    Integer backgroundColorValue4 = governmentIdStepStyle3.getBackgroundColorValue();
                                    if (backgroundColorValue4 != null) {
                                        int intValue3 = backgroundColorValue4.intValue();
                                        coordinatorLayout4.setBackgroundColor(intValue3);
                                        Context context6 = coordinatorLayout4.getContext();
                                        context6.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context6, intValue3);
                                    }
                                    StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle3.getTitleStyle();
                                    if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
                                        TextStylingKt.style(textView7, base4, EmptySet.INSTANCE);
                                    }
                                    StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle3.getButtonPrimaryStyle();
                                    if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
                                        ButtonStylingKt.style$default(button, base2, false, false, 14);
                                        break;
                                    }
                                }
                                break;
                            default:
                                OldBottomSheetDialogView oldBottomSheetDialogView = (OldBottomSheetDialogView) obj5;
                                Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding = (Pi2RequestPermissionRationaleBinding) obj4;
                                final OldBottomSheetDialogView oldBottomSheetDialogView2 = (OldBottomSheetDialogView) obj3;
                                viewEnvironment.getClass();
                                pi2RequestPermissionRationaleBinding.getClass();
                                String str4 = oldBottomSheetDialogView.titleText;
                                int length = str4.length();
                                TextView textView8 = pi2RequestPermissionRationaleBinding.title;
                                if (length > 0) {
                                    ExtensionsKt.setMarkdown(textView8, str4);
                                } else {
                                    textView8.setVisibility(8);
                                }
                                TextView textView9 = pi2RequestPermissionRationaleBinding.message;
                                PersonaMaterialButton personaMaterialButton4 = pi2RequestPermissionRationaleBinding.positiveButton;
                                PersonaMaterialButton personaMaterialButton5 = pi2RequestPermissionRationaleBinding.negativeButton;
                                ExtensionsKt.setMarkdown(textView9, oldBottomSheetDialogView.messageText);
                                personaMaterialButton4.setText(oldBottomSheetDialogView2.positiveButtonText);
                                personaMaterialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i15 = i11;
                                        OldBottomSheetDialogView oldBottomSheetDialogView3 = oldBottomSheetDialogView2;
                                        switch (i15) {
                                            case 0:
                                                oldBottomSheetDialogView3.onPositiveButtonClick.invoke();
                                                break;
                                            default:
                                                oldBottomSheetDialogView3.onNegativeButtonClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                personaMaterialButton5.setText(oldBottomSheetDialogView2.negativeButtonText);
                                personaMaterialButton5.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i15 = i10;
                                        OldBottomSheetDialogView oldBottomSheetDialogView3 = oldBottomSheetDialogView2;
                                        switch (i15) {
                                            case 0:
                                                oldBottomSheetDialogView3.onPositiveButtonClick.invoke();
                                                break;
                                            default:
                                                oldBottomSheetDialogView3.onNegativeButtonClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                BackPressHandlerKt.setBackPressedHandler(pi2RequestPermissionRationaleBinding.bottomSheet, new OldBottomSheetDialogView$$ExternalSyntheticLambda3(oldBottomSheetDialogView2, 0));
                                ah.addOneShotPreDrawListenerAndDiscardFrame(personaMaterialButton5, new StateFlowsKt$$ExternalSyntheticLambda2(10, pi2RequestPermissionRationaleBinding, oldBottomSheetDialogView));
                                break;
                        }
                    }
                };
            case 18:
                final ErrorView errorView = (ErrorView) obj2;
                final Pi2ErrorBinding pi2ErrorBinding = (Pi2ErrorBinding) obj;
                pi2ErrorBinding.getClass();
                CoordinatorLayout coordinatorLayout3 = pi2ErrorBinding.rootView;
                coordinatorLayout3.getClass();
                InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout3, 15);
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda0
                    @Override // com.squareup.workflow1.ui.LayoutRunner
                    public final void showRendering(Object obj3, ViewEnvironment viewEnvironment) {
                        final int i8;
                        StepStyles.StepSubmitButtonComponentStyleContainer base;
                        ButtonSubmitComponentStyle base2;
                        StepStyles.StepTextBasedComponentStyleContainer base3;
                        TextBasedComponentStyle base4;
                        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
                        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
                        int i9 = i2;
                        LocalImageComponentStyle localImageComponentStyle = null;
                        Object obj4 = errorView;
                        Object obj5 = pi2ErrorBinding;
                        final int i10 = 1;
                        final int i11 = 0;
                        switch (i9) {
                            case 0:
                                Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding2 = (Pi2GovernmentidChooseCaptureMethodBinding) obj5;
                                ChooseCaptureMethodView chooseCaptureMethodView2 = (ChooseCaptureMethodView) obj4;
                                final ChooseCaptureMethodView chooseCaptureMethodView3 = (ChooseCaptureMethodView) obj3;
                                viewEnvironment.getClass();
                                CoordinatorLayout coordinatorLayout22 = pi2GovernmentidChooseCaptureMethodBinding2.rootView;
                                ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidChooseCaptureMethodBinding2.idImage;
                                Pi2NavigationBar pi2NavigationBar = pi2GovernmentidChooseCaptureMethodBinding2.navigationBar;
                                PersonaMaterialButton personaMaterialButton = pi2GovernmentidChooseCaptureMethodBinding2.uploadButton;
                                PersonaMaterialButton personaMaterialButton2 = pi2GovernmentidChooseCaptureMethodBinding2.cameraButton;
                                Context context = coordinatorLayout22.getContext();
                                TextView textView = pi2GovernmentidChooseCaptureMethodBinding2.title;
                                textView.setText(chooseCaptureMethodView3.title);
                                TextView textView2 = pi2GovernmentidChooseCaptureMethodBinding2.body;
                                textView2.setText(chooseCaptureMethodView3.body);
                                List list = chooseCaptureMethodView2.captureOptions;
                                String str2 = chooseCaptureMethodView2.cameraText;
                                if (list.contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
                                    if (StringsKt.isBlank(str2)) {
                                        personaMaterialButton2.setText((CharSequence) null);
                                        personaMaterialButton2.setIcon(DimensionKt.getDrawable(context, R.drawable.pi2_governmentid_cameraicon));
                                    } else {
                                        personaMaterialButton2.setText(str2);
                                        personaMaterialButton2.setIcon(null);
                                    }
                                    final int i12 = 0;
                                    personaMaterialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i13 = i12;
                                            ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                            switch (i13) {
                                                case 0:
                                                    chooseCaptureMethodView4.onCameraCaptureClick.invoke();
                                                    break;
                                                default:
                                                    chooseCaptureMethodView4.onUploadClick.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (list.contains(CaptureOptionNativeMobile.UPLOAD)) {
                                    personaMaterialButton.setText(chooseCaptureMethodView3.uploadButtonText);
                                    i8 = 1;
                                    personaMaterialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i13 = i8;
                                            ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                            switch (i13) {
                                                case 0:
                                                    chooseCaptureMethodView4.onCameraCaptureClick.invoke();
                                                    break;
                                                default:
                                                    chooseCaptureMethodView4.onUploadClick.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    i8 = 1;
                                }
                                final int i13 = 0;
                                zzai.applyNavigationState(chooseCaptureMethodView3.navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i13;
                                        ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                        switch (i14) {
                                            case 0:
                                                chooseCaptureMethodView4.onBack.invoke();
                                                break;
                                            default:
                                                chooseCaptureMethodView4.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i8;
                                        ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                        switch (i14) {
                                            case 0:
                                                chooseCaptureMethodView4.onBack.invoke();
                                                break;
                                            default:
                                                chooseCaptureMethodView4.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout22);
                                LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout22, chooseCaptureMethodView3.error, chooseCaptureMethodView3.onErrorDismissed, null, 2, 0);
                                RemoteImage remoteImage = chooseCaptureMethodView2.pictographAsset;
                                if (remoteImage == null) {
                                    themeableLottieAnimationView.setAnimation(chooseCaptureMethodView2.localAsset);
                                } else if (chooseCaptureMethodView2.currentPictographAssetView == null) {
                                    chooseCaptureMethodView2.currentPictographAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, pi2GovernmentidChooseCaptureMethodBinding2.imageViewContainer, false);
                                    pi2GovernmentidChooseCaptureMethodBinding2.localImage.setVisibility(8);
                                }
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = chooseCaptureMethodView2.styles;
                                if (governmentIdStepStyle != null) {
                                    View view = pi2GovernmentidChooseCaptureMethodBinding2.idImageContainer;
                                    Integer backgroundColorValue2 = governmentIdStepStyle.getBackgroundColorValue();
                                    if (backgroundColorValue2 != null) {
                                        int intValue = backgroundColorValue2.intValue();
                                        coordinatorLayout22.setBackgroundColor(intValue);
                                        Context context2 = coordinatorLayout22.getContext();
                                        context2.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context2, intValue);
                                    }
                                    Context context3 = coordinatorLayout22.getContext();
                                    context3.getClass();
                                    Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle, context3);
                                    if (backgroundImageDrawable != null) {
                                        coordinatorLayout22.setBackground(backgroundImageDrawable);
                                    }
                                    Integer headerButtonColorValue = governmentIdStepStyle.getHeaderButtonColorValue();
                                    if (headerButtonColorValue != null) {
                                        pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
                                    }
                                    TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
                                    if (titleStyleValue != null) {
                                        TextStylingKt.style(textView, titleStyleValue, EmptySet.INSTANCE);
                                    }
                                    TextBasedComponentStyle textStyleValue = governmentIdStepStyle.getTextStyleValue();
                                    if (textStyleValue != null) {
                                        TextStylingKt.style(textView2, textStyleValue, EmptySet.INSTANCE);
                                    }
                                    ButtonSubmitComponentStyle buttonPrimaryStyleValue = governmentIdStepStyle.getButtonPrimaryStyleValue();
                                    if (buttonPrimaryStyleValue != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton2, buttonPrimaryStyleValue, false, false, 14);
                                    }
                                    ButtonCancelComponentStyle buttonSecondaryStyleValue = governmentIdStepStyle.getButtonSecondaryStyleValue();
                                    if (buttonSecondaryStyleValue != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton, buttonSecondaryStyleValue, false, false, 14);
                                    }
                                    Integer fillColorValue = governmentIdStepStyle.getFillColorValue();
                                    if (fillColorValue != null) {
                                        view.setBackground(new ColorDrawable(fillColorValue.intValue()));
                                    }
                                    ImageStylingKt.replaceColors(themeableLottieAnimationView, governmentIdStepStyle.getStrokeColorValue(), governmentIdStepStyle.getFillColorValue(), null, null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0], new String[0]);
                                    break;
                                }
                                break;
                            case 1:
                                Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding2 = (Pi2GovernmentidReviewSelectedImageBinding) obj5;
                                final ReviewSelectedImageView reviewSelectedImageView2 = (ReviewSelectedImageView) obj4;
                                final ReviewSelectedImageView reviewSelectedImageView22 = (ReviewSelectedImageView) obj3;
                                viewEnvironment.getClass();
                                TextView textView3 = pi2GovernmentidReviewSelectedImageBinding2.title;
                                Pi2NavigationBar pi2NavigationBar2 = pi2GovernmentidReviewSelectedImageBinding2.navigationBar;
                                CoordinatorLayout coordinatorLayout32 = pi2GovernmentidReviewSelectedImageBinding2.rootView;
                                TextView textView4 = pi2GovernmentidReviewSelectedImageBinding2.fileNameTextview;
                                textView3.setText(reviewSelectedImageView22.title);
                                TextView textView5 = pi2GovernmentidReviewSelectedImageBinding2.body;
                                textView5.setText(reviewSelectedImageView22.body);
                                ButtonWithLoadingIndicator buttonWithLoadingIndicator = pi2GovernmentidReviewSelectedImageBinding2.usePhotoButton;
                                buttonWithLoadingIndicator.setText(reviewSelectedImageView2.confirmButtonText);
                                buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i14 = i11;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView2;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onUsePhotoClick.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onChooseNewPhotoClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                PersonaMaterialButton personaMaterialButton3 = pi2GovernmentidReviewSelectedImageBinding2.chooseNewPhotoButton;
                                personaMaterialButton3.setText(reviewSelectedImageView2.chooseNewPhotoText);
                                personaMaterialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i14 = i10;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView2;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onUsePhotoClick.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onChooseNewPhotoClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                String str3 = reviewSelectedImageView2.fileToReviewPath;
                                File file = new File(str3);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(str3, options);
                                boolean startsWith = StringsKt__StringsJVMKt.startsWith(reviewSelectedImageView2.fileMimeType, "image/", false);
                                ImageView imageView2 = pi2GovernmentidReviewSelectedImageBinding2.imageView;
                                if (startsWith) {
                                    RealImageLoader realImageLoader = reviewSelectedImageView2.imageLoader;
                                    ImageRequest.Builder builder = new ImageRequest.Builder(imageView2.getContext());
                                    builder.data = file;
                                    ImageRequests_androidKt.target(builder, imageView2);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setSize(options.outWidth, options.outHeight);
                                    gradientDrawable.setColor(0);
                                    builder.placeholder(Image_androidKt.asImage(gradientDrawable));
                                    realImageLoader.enqueue(builder.build());
                                } else {
                                    imageView2.setVisibility(8);
                                    pi2GovernmentidReviewSelectedImageBinding2.fileIcon.setVisibility(0);
                                    textView4.setVisibility(0);
                                    textView4.setText(reviewSelectedImageView2.fileName);
                                }
                                NavigationState navigationState = reviewSelectedImageView22.navigationState;
                                Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i142 = i11;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView22;
                                        switch (i142) {
                                            case 0:
                                                reviewSelectedImageView3.onBack.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                final int i14 = 1;
                                Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i142 = i14;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView22;
                                        switch (i142) {
                                            case 0:
                                                reviewSelectedImageView3.onBack.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                coordinatorLayout32.getClass();
                                zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar2, coordinatorLayout32);
                                buttonWithLoadingIndicator.setIsLoading(reviewSelectedImageView22.isAutoClassifying);
                                LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout32, reviewSelectedImageView22.error, reviewSelectedImageView22.onErrorDismissed, null, 2, 0);
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = reviewSelectedImageView2.styles;
                                if (governmentIdStepStyle2 != null) {
                                    TextView textView6 = pi2GovernmentidReviewSelectedImageBinding2.title;
                                    Integer backgroundColorValue3 = governmentIdStepStyle2.getBackgroundColorValue();
                                    if (backgroundColorValue3 != null) {
                                        int intValue2 = backgroundColorValue3.intValue();
                                        coordinatorLayout32.setBackgroundColor(intValue2);
                                        Context context4 = coordinatorLayout32.getContext();
                                        context4.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context4, intValue2);
                                    }
                                    Context context5 = coordinatorLayout32.getContext();
                                    context5.getClass();
                                    Drawable backgroundImageDrawable2 = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle2, context5);
                                    if (backgroundImageDrawable2 != null) {
                                        coordinatorLayout32.setBackground(backgroundImageDrawable2);
                                    }
                                    Integer headerButtonColorValue2 = governmentIdStepStyle2.getHeaderButtonColorValue();
                                    if (headerButtonColorValue2 != null) {
                                        pi2NavigationBar2.setControlsColor(headerButtonColorValue2.intValue());
                                    }
                                    TextBasedComponentStyle titleStyleValue2 = governmentIdStepStyle2.getTitleStyleValue();
                                    if (titleStyleValue2 != null) {
                                        TextStylingKt.style(textView6, titleStyleValue2, EmptySet.INSTANCE);
                                    }
                                    TextBasedComponentStyle textStyleValue2 = governmentIdStepStyle2.getTextStyleValue();
                                    if (textStyleValue2 != null) {
                                        TextStylingKt.style(textView5, textStyleValue2, EmptySet.INSTANCE);
                                    }
                                    ButtonSubmitComponentStyle buttonPrimaryStyleValue2 = governmentIdStepStyle2.getButtonPrimaryStyleValue();
                                    if (buttonPrimaryStyleValue2 != null) {
                                        ButtonStylingKt.style$default(buttonWithLoadingIndicator, buttonPrimaryStyleValue2);
                                    }
                                    ButtonCancelComponentStyle buttonSecondaryStyleValue2 = governmentIdStepStyle2.getButtonSecondaryStyleValue();
                                    if (buttonSecondaryStyleValue2 != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton3, buttonSecondaryStyleValue2, false, false, 14);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Pi2ErrorBinding pi2ErrorBinding2 = (Pi2ErrorBinding) obj5;
                                ErrorView errorView2 = (ErrorView) obj4;
                                final ErrorView errorView22 = (ErrorView) obj3;
                                viewEnvironment.getClass();
                                NavigationState navigationState2 = errorView22.navigationState;
                                Function0 function03 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i15 = i11;
                                        ErrorView errorView3 = errorView22;
                                        switch (i15) {
                                            case 0:
                                                errorView3.onBackClick.invoke();
                                                break;
                                            default:
                                                errorView3.onCancelClick.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                Function0 function04 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i15 = i10;
                                        ErrorView errorView3 = errorView22;
                                        switch (i15) {
                                            case 0:
                                                errorView3.onBackClick.invoke();
                                                break;
                                            default:
                                                errorView3.onCancelClick.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                Pi2NavigationBar pi2NavigationBar3 = pi2ErrorBinding2.navigationBar;
                                TextView textView7 = pi2ErrorBinding2.title;
                                Button button = pi2ErrorBinding2.continueButton;
                                CoordinatorLayout coordinatorLayout4 = pi2ErrorBinding2.rootView;
                                coordinatorLayout4.getClass();
                                zzai.applyNavigationState(navigationState2, function03, function04, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar3, coordinatorLayout4);
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = errorView22.styles;
                                if (governmentIdStepStyle3 != null && (imageLocalStyle = governmentIdStepStyle3.getImageLocalStyle()) != null && (illustration = imageLocalStyle.getIllustration()) != null) {
                                    localImageComponentStyle = illustration.getBase();
                                }
                                pi2ErrorBinding2.illustration.setAnimation(R.raw.pi2_id_front_fail);
                                if (localImageComponentStyle != null) {
                                    ah.addOneShotPreDrawListenerAndDiscardFrame(coordinatorLayout4, new ErrorView$$ExternalSyntheticLambda4(pi2ErrorBinding2, localImageComponentStyle, 0));
                                }
                                textView7.setText(errorView22.titleText);
                                button.setText(errorView22.continueButtonText);
                                button.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(errorView2, 15));
                                if (governmentIdStepStyle3 != null) {
                                    Integer backgroundColorValue4 = governmentIdStepStyle3.getBackgroundColorValue();
                                    if (backgroundColorValue4 != null) {
                                        int intValue3 = backgroundColorValue4.intValue();
                                        coordinatorLayout4.setBackgroundColor(intValue3);
                                        Context context6 = coordinatorLayout4.getContext();
                                        context6.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context6, intValue3);
                                    }
                                    StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle3.getTitleStyle();
                                    if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
                                        TextStylingKt.style(textView7, base4, EmptySet.INSTANCE);
                                    }
                                    StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle3.getButtonPrimaryStyle();
                                    if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
                                        ButtonStylingKt.style$default(button, base2, false, false, 14);
                                        break;
                                    }
                                }
                                break;
                            default:
                                OldBottomSheetDialogView oldBottomSheetDialogView = (OldBottomSheetDialogView) obj5;
                                Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding = (Pi2RequestPermissionRationaleBinding) obj4;
                                final OldBottomSheetDialogView oldBottomSheetDialogView2 = (OldBottomSheetDialogView) obj3;
                                viewEnvironment.getClass();
                                pi2RequestPermissionRationaleBinding.getClass();
                                String str4 = oldBottomSheetDialogView.titleText;
                                int length = str4.length();
                                TextView textView8 = pi2RequestPermissionRationaleBinding.title;
                                if (length > 0) {
                                    ExtensionsKt.setMarkdown(textView8, str4);
                                } else {
                                    textView8.setVisibility(8);
                                }
                                TextView textView9 = pi2RequestPermissionRationaleBinding.message;
                                PersonaMaterialButton personaMaterialButton4 = pi2RequestPermissionRationaleBinding.positiveButton;
                                PersonaMaterialButton personaMaterialButton5 = pi2RequestPermissionRationaleBinding.negativeButton;
                                ExtensionsKt.setMarkdown(textView9, oldBottomSheetDialogView.messageText);
                                personaMaterialButton4.setText(oldBottomSheetDialogView2.positiveButtonText);
                                personaMaterialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i15 = i11;
                                        OldBottomSheetDialogView oldBottomSheetDialogView3 = oldBottomSheetDialogView2;
                                        switch (i15) {
                                            case 0:
                                                oldBottomSheetDialogView3.onPositiveButtonClick.invoke();
                                                break;
                                            default:
                                                oldBottomSheetDialogView3.onNegativeButtonClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                personaMaterialButton5.setText(oldBottomSheetDialogView2.negativeButtonText);
                                personaMaterialButton5.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i15 = i10;
                                        OldBottomSheetDialogView oldBottomSheetDialogView3 = oldBottomSheetDialogView2;
                                        switch (i15) {
                                            case 0:
                                                oldBottomSheetDialogView3.onPositiveButtonClick.invoke();
                                                break;
                                            default:
                                                oldBottomSheetDialogView3.onNegativeButtonClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                BackPressHandlerKt.setBackPressedHandler(pi2RequestPermissionRationaleBinding.bottomSheet, new OldBottomSheetDialogView$$ExternalSyntheticLambda3(oldBottomSheetDialogView2, 0));
                                ah.addOneShotPreDrawListenerAndDiscardFrame(personaMaterialButton5, new StateFlowsKt$$ExternalSyntheticLambda2(10, pi2RequestPermissionRationaleBinding, oldBottomSheetDialogView));
                                break;
                        }
                    }
                };
            case 19:
                CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                TrackingEventsLogger.DefaultImpls.logGovernmentIdButtonClickEvent$default(cameraScreenRunner.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.FLASH, objArr3 == true ? 1 : 0, i2, objArr2 == true ? 1 : 0), false, 2, null);
                cameraScreenRunner.cameraController.enableTorch(booleanValue);
                return Unit.INSTANCE;
            case 20:
                CameraChoices cameraChoices = (CameraChoices) obj2;
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                Object obj3 = updater6.state;
                GovernmentIdState.WaitForAutocapture waitForAutocapture = obj3 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj3 : null;
                if (waitForAutocapture != null && waitForAutocapture.webRtcState == WebRtcState.Connecting) {
                    return Unit.INSTANCE;
                }
                if (waitForAutocapture != null) {
                    updater6.state = GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, WebRtcState.Connecting, null, false, false, null, 32639);
                }
                if (cameraChoices != null && (cameraChoice2 = cameraChoices.primaryChoice) != null) {
                    cameraChoice2.size.getWidth();
                }
                if (cameraChoices != null && (cameraChoice = cameraChoices.primaryChoice) != null) {
                    cameraChoice.size.getHeight();
                }
                return Unit.INSTANCE;
            case 21:
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                windowInsetsCompat.getClass();
                Insets insetsIgnoringVisibility = windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519);
                insetsIgnoringVisibility.getClass();
                Space space = ((Pi2GovernmentidCaptureTipsBinding) obj2).bottomInset;
                ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                if (layoutParams == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = insetsIgnoringVisibility.bottom;
                space.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            case 22:
                GovernmentIdStepFragment governmentIdStepFragment = (GovernmentIdStepFragment) obj2;
                SavedStateHandle savedStateHandle2 = (SavedStateHandle) obj;
                savedStateHandle2.getClass();
                GovernmentIdStepViewModel_Factory_Impl governmentIdStepViewModel_Factory_Impl = governmentIdStepFragment.viewModelFactory;
                if (governmentIdStepViewModel_Factory_Impl != null) {
                    return new GovernmentIdStepViewModel(savedStateHandle2, ((GovernmentIdStepFragment.GovernmentIdStepFragmentArgs) governmentIdStepFragment.args$delegate.getValue()).props, (GovernmentIdStepStateManager_Factory_Impl) governmentIdStepViewModel_Factory_Impl.delegateFactory.selfieStepStateManagerFactoryProvider.instance);
                }
                Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
                throw null;
            case 23:
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                updater7.getClass();
                ((IntegrationWorkflow$State$Starting) obj2).getClass();
                updater7.state = new IntegrationWorkflow$State$Starting(null);
                updater7.setOutput(IntegrationWorkflow.Output.Finished.INSTANCE);
                return Unit.INSTANCE;
            case 24:
                SavedStateHandle savedStateHandle3 = (SavedStateHandle) obj;
                savedStateHandle3.getClass();
                IntegrationStepViewModel_Factory_Impl integrationStepViewModel_Factory_Impl = ((IntegrationStepFragment) obj2).viewModelFactory;
                if (integrationStepViewModel_Factory_Impl != null) {
                    return new IntegrationStepViewModel(savedStateHandle3, (IntegrationStepStateManager_Factory_Impl) integrationStepViewModel_Factory_Impl.delegateFactory.uiStepStateManagerFactoryProvider.instance);
                }
                Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
                throw null;
            case 25:
                return invoke$com$withpersona$sdk2$inquiry$internal$state$InquiryStateManager$$ExternalSyntheticLambda0(obj);
            case 26:
                WindowInsetsCompat windowInsetsCompat2 = (WindowInsetsCompat) obj;
                windowInsetsCompat2.getClass();
                windowInsetsCompat2.mImpl.getInsetsIgnoringVisibility(519).getClass();
                FloatingActionButton floatingActionButton = ((Pi2FragmentWorkflowBinding) obj2).floatingActionButton;
                ViewGroup.LayoutParams layoutParams2 = floatingActionButton.getLayoutParams();
                if (layoutParams2 == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.bottomMargin = (int) ((16.0d / com.withpersona.sdk2.inquiry.shared.ExtensionsKt.displayMetrics.density) + r11.bottom);
                floatingActionButton.setLayoutParams(marginLayoutParams);
                return Unit.INSTANCE;
            case 27:
                okhttpClient$lambda$0 = NetworkCoreModule.okhttpClient$lambda$0((NetworkCoreModule) obj2, (String) obj);
                return okhttpClient$lambda$0;
            case 28:
                final OldBottomSheetDialogView oldBottomSheetDialogView = (OldBottomSheetDialogView) obj2;
                final Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding = (Pi2RequestPermissionRationaleBinding) obj;
                pi2RequestPermissionRationaleBinding.getClass();
                FrameLayout frameLayout = pi2RequestPermissionRationaleBinding.bottomSheet;
                BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                OldBottomSheetDialogView$$ExternalSyntheticLambda3 oldBottomSheetDialogView$$ExternalSyntheticLambda3 = new OldBottomSheetDialogView$$ExternalSyntheticLambda3(oldBottomSheetDialogView, i6);
                View view = pi2RequestPermissionRationaleBinding.tintScreen;
                zzbk.setup(from, oldBottomSheetDialogView$$ExternalSyntheticLambda3, frameLayout, null, view);
                CoordinatorLayout coordinatorLayout4 = pi2RequestPermissionRationaleBinding.rootView;
                coordinatorLayout4.addOnAttachStateChangeListener(new StandardMenuPopup.AnonymousClass2(from, 10));
                frameLayout.setOnClickListener(new ArcadeModal$$ExternalSyntheticLambda0(3));
                view.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(from, i3));
                StepStyle stepStyle = oldBottomSheetDialogView.styles;
                if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
                    Context context = coordinatorLayout4.getContext();
                    context.getClass();
                    colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context, R.attr.colorSurface);
                } else {
                    colorFromAttr$default = backgroundColorValue.intValue();
                }
                coordinatorLayout4.setTag(R.id.pi2_background_color_hint, Integer.valueOf(colorFromAttr$default));
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda0
                    @Override // com.squareup.workflow1.ui.LayoutRunner
                    public final void showRendering(Object obj32, ViewEnvironment viewEnvironment) {
                        final int i8;
                        StepStyles.StepSubmitButtonComponentStyleContainer base;
                        ButtonSubmitComponentStyle base2;
                        StepStyles.StepTextBasedComponentStyleContainer base3;
                        TextBasedComponentStyle base4;
                        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
                        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
                        int i9 = i5;
                        LocalImageComponentStyle localImageComponentStyle = null;
                        Object obj4 = pi2RequestPermissionRationaleBinding;
                        Object obj5 = oldBottomSheetDialogView;
                        final int i10 = 1;
                        final int i11 = 0;
                        switch (i9) {
                            case 0:
                                Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding2 = (Pi2GovernmentidChooseCaptureMethodBinding) obj5;
                                ChooseCaptureMethodView chooseCaptureMethodView2 = (ChooseCaptureMethodView) obj4;
                                final ChooseCaptureMethodView chooseCaptureMethodView3 = (ChooseCaptureMethodView) obj32;
                                viewEnvironment.getClass();
                                CoordinatorLayout coordinatorLayout22 = pi2GovernmentidChooseCaptureMethodBinding2.rootView;
                                ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidChooseCaptureMethodBinding2.idImage;
                                Pi2NavigationBar pi2NavigationBar = pi2GovernmentidChooseCaptureMethodBinding2.navigationBar;
                                PersonaMaterialButton personaMaterialButton = pi2GovernmentidChooseCaptureMethodBinding2.uploadButton;
                                PersonaMaterialButton personaMaterialButton2 = pi2GovernmentidChooseCaptureMethodBinding2.cameraButton;
                                Context context2 = coordinatorLayout22.getContext();
                                TextView textView = pi2GovernmentidChooseCaptureMethodBinding2.title;
                                textView.setText(chooseCaptureMethodView3.title);
                                TextView textView2 = pi2GovernmentidChooseCaptureMethodBinding2.body;
                                textView2.setText(chooseCaptureMethodView3.body);
                                List list = chooseCaptureMethodView2.captureOptions;
                                String str2 = chooseCaptureMethodView2.cameraText;
                                if (list.contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
                                    if (StringsKt.isBlank(str2)) {
                                        personaMaterialButton2.setText((CharSequence) null);
                                        personaMaterialButton2.setIcon(DimensionKt.getDrawable(context2, R.drawable.pi2_governmentid_cameraicon));
                                    } else {
                                        personaMaterialButton2.setText(str2);
                                        personaMaterialButton2.setIcon(null);
                                    }
                                    final int i12 = 0;
                                    personaMaterialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i13 = i12;
                                            ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                            switch (i13) {
                                                case 0:
                                                    chooseCaptureMethodView4.onCameraCaptureClick.invoke();
                                                    break;
                                                default:
                                                    chooseCaptureMethodView4.onUploadClick.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                if (list.contains(CaptureOptionNativeMobile.UPLOAD)) {
                                    personaMaterialButton.setText(chooseCaptureMethodView3.uploadButtonText);
                                    i8 = 1;
                                    personaMaterialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i13 = i8;
                                            ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                            switch (i13) {
                                                case 0:
                                                    chooseCaptureMethodView4.onCameraCaptureClick.invoke();
                                                    break;
                                                default:
                                                    chooseCaptureMethodView4.onUploadClick.invoke();
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    i8 = 1;
                                }
                                final int i13 = 0;
                                zzai.applyNavigationState(chooseCaptureMethodView3.navigationState, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i13;
                                        ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                        switch (i14) {
                                            case 0:
                                                chooseCaptureMethodView4.onBack.invoke();
                                                break;
                                            default:
                                                chooseCaptureMethodView4.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ChooseCaptureMethodView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i14 = i8;
                                        ChooseCaptureMethodView chooseCaptureMethodView4 = chooseCaptureMethodView3;
                                        switch (i14) {
                                            case 0:
                                                chooseCaptureMethodView4.onBack.invoke();
                                                break;
                                            default:
                                                chooseCaptureMethodView4.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout22);
                                LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout22, chooseCaptureMethodView3.error, chooseCaptureMethodView3.onErrorDismissed, null, 2, 0);
                                RemoteImage remoteImage = chooseCaptureMethodView2.pictographAsset;
                                if (remoteImage == null) {
                                    themeableLottieAnimationView.setAnimation(chooseCaptureMethodView2.localAsset);
                                } else if (chooseCaptureMethodView2.currentPictographAssetView == null) {
                                    chooseCaptureMethodView2.currentPictographAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, pi2GovernmentidChooseCaptureMethodBinding2.imageViewContainer, false);
                                    pi2GovernmentidChooseCaptureMethodBinding2.localImage.setVisibility(8);
                                }
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = chooseCaptureMethodView2.styles;
                                if (governmentIdStepStyle != null) {
                                    View view2 = pi2GovernmentidChooseCaptureMethodBinding2.idImageContainer;
                                    Integer backgroundColorValue2 = governmentIdStepStyle.getBackgroundColorValue();
                                    if (backgroundColorValue2 != null) {
                                        int intValue = backgroundColorValue2.intValue();
                                        coordinatorLayout22.setBackgroundColor(intValue);
                                        Context context22 = coordinatorLayout22.getContext();
                                        context22.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context22, intValue);
                                    }
                                    Context context3 = coordinatorLayout22.getContext();
                                    context3.getClass();
                                    Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle, context3);
                                    if (backgroundImageDrawable != null) {
                                        coordinatorLayout22.setBackground(backgroundImageDrawable);
                                    }
                                    Integer headerButtonColorValue = governmentIdStepStyle.getHeaderButtonColorValue();
                                    if (headerButtonColorValue != null) {
                                        pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
                                    }
                                    TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
                                    if (titleStyleValue != null) {
                                        TextStylingKt.style(textView, titleStyleValue, EmptySet.INSTANCE);
                                    }
                                    TextBasedComponentStyle textStyleValue = governmentIdStepStyle.getTextStyleValue();
                                    if (textStyleValue != null) {
                                        TextStylingKt.style(textView2, textStyleValue, EmptySet.INSTANCE);
                                    }
                                    ButtonSubmitComponentStyle buttonPrimaryStyleValue = governmentIdStepStyle.getButtonPrimaryStyleValue();
                                    if (buttonPrimaryStyleValue != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton2, buttonPrimaryStyleValue, false, false, 14);
                                    }
                                    ButtonCancelComponentStyle buttonSecondaryStyleValue = governmentIdStepStyle.getButtonSecondaryStyleValue();
                                    if (buttonSecondaryStyleValue != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton, buttonSecondaryStyleValue, false, false, 14);
                                    }
                                    Integer fillColorValue = governmentIdStepStyle.getFillColorValue();
                                    if (fillColorValue != null) {
                                        view2.setBackground(new ColorDrawable(fillColorValue.intValue()));
                                    }
                                    ImageStylingKt.replaceColors(themeableLottieAnimationView, governmentIdStepStyle.getStrokeColorValue(), governmentIdStepStyle.getFillColorValue(), null, null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0], new String[0]);
                                    break;
                                }
                                break;
                            case 1:
                                Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding2 = (Pi2GovernmentidReviewSelectedImageBinding) obj5;
                                final ReviewSelectedImageView reviewSelectedImageView2 = (ReviewSelectedImageView) obj4;
                                final ReviewSelectedImageView reviewSelectedImageView22 = (ReviewSelectedImageView) obj32;
                                viewEnvironment.getClass();
                                TextView textView3 = pi2GovernmentidReviewSelectedImageBinding2.title;
                                Pi2NavigationBar pi2NavigationBar2 = pi2GovernmentidReviewSelectedImageBinding2.navigationBar;
                                CoordinatorLayout coordinatorLayout32 = pi2GovernmentidReviewSelectedImageBinding2.rootView;
                                TextView textView4 = pi2GovernmentidReviewSelectedImageBinding2.fileNameTextview;
                                textView3.setText(reviewSelectedImageView22.title);
                                TextView textView5 = pi2GovernmentidReviewSelectedImageBinding2.body;
                                textView5.setText(reviewSelectedImageView22.body);
                                ButtonWithLoadingIndicator buttonWithLoadingIndicator = pi2GovernmentidReviewSelectedImageBinding2.usePhotoButton;
                                buttonWithLoadingIndicator.setText(reviewSelectedImageView2.confirmButtonText);
                                buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i14 = i11;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView2;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onUsePhotoClick.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onChooseNewPhotoClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                PersonaMaterialButton personaMaterialButton3 = pi2GovernmentidReviewSelectedImageBinding2.chooseNewPhotoButton;
                                personaMaterialButton3.setText(reviewSelectedImageView2.chooseNewPhotoText);
                                personaMaterialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i14 = i10;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView2;
                                        switch (i14) {
                                            case 0:
                                                reviewSelectedImageView3.onUsePhotoClick.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onChooseNewPhotoClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                String str3 = reviewSelectedImageView2.fileToReviewPath;
                                File file = new File(str3);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(str3, options);
                                boolean startsWith = StringsKt__StringsJVMKt.startsWith(reviewSelectedImageView2.fileMimeType, "image/", false);
                                ImageView imageView2 = pi2GovernmentidReviewSelectedImageBinding2.imageView;
                                if (startsWith) {
                                    RealImageLoader realImageLoader = reviewSelectedImageView2.imageLoader;
                                    ImageRequest.Builder builder = new ImageRequest.Builder(imageView2.getContext());
                                    builder.data = file;
                                    ImageRequests_androidKt.target(builder, imageView2);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setSize(options.outWidth, options.outHeight);
                                    gradientDrawable.setColor(0);
                                    builder.placeholder(Image_androidKt.asImage(gradientDrawable));
                                    realImageLoader.enqueue(builder.build());
                                } else {
                                    imageView2.setVisibility(8);
                                    pi2GovernmentidReviewSelectedImageBinding2.fileIcon.setVisibility(0);
                                    textView4.setVisibility(0);
                                    textView4.setText(reviewSelectedImageView2.fileName);
                                }
                                NavigationState navigationState = reviewSelectedImageView22.navigationState;
                                Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i142 = i11;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView22;
                                        switch (i142) {
                                            case 0:
                                                reviewSelectedImageView3.onBack.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                final int i14 = 1;
                                Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewSelectedImageView$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i142 = i14;
                                        ReviewSelectedImageView reviewSelectedImageView3 = reviewSelectedImageView22;
                                        switch (i142) {
                                            case 0:
                                                reviewSelectedImageView3.onBack.invoke();
                                                break;
                                            default:
                                                reviewSelectedImageView3.onCancel.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                coordinatorLayout32.getClass();
                                zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar2, coordinatorLayout32);
                                buttonWithLoadingIndicator.setIsLoading(reviewSelectedImageView22.isAutoClassifying);
                                LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout32, reviewSelectedImageView22.error, reviewSelectedImageView22.onErrorDismissed, null, 2, 0);
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = reviewSelectedImageView2.styles;
                                if (governmentIdStepStyle2 != null) {
                                    TextView textView6 = pi2GovernmentidReviewSelectedImageBinding2.title;
                                    Integer backgroundColorValue3 = governmentIdStepStyle2.getBackgroundColorValue();
                                    if (backgroundColorValue3 != null) {
                                        int intValue2 = backgroundColorValue3.intValue();
                                        coordinatorLayout32.setBackgroundColor(intValue2);
                                        Context context4 = coordinatorLayout32.getContext();
                                        context4.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context4, intValue2);
                                    }
                                    Context context5 = coordinatorLayout32.getContext();
                                    context5.getClass();
                                    Drawable backgroundImageDrawable2 = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle2, context5);
                                    if (backgroundImageDrawable2 != null) {
                                        coordinatorLayout32.setBackground(backgroundImageDrawable2);
                                    }
                                    Integer headerButtonColorValue2 = governmentIdStepStyle2.getHeaderButtonColorValue();
                                    if (headerButtonColorValue2 != null) {
                                        pi2NavigationBar2.setControlsColor(headerButtonColorValue2.intValue());
                                    }
                                    TextBasedComponentStyle titleStyleValue2 = governmentIdStepStyle2.getTitleStyleValue();
                                    if (titleStyleValue2 != null) {
                                        TextStylingKt.style(textView6, titleStyleValue2, EmptySet.INSTANCE);
                                    }
                                    TextBasedComponentStyle textStyleValue2 = governmentIdStepStyle2.getTextStyleValue();
                                    if (textStyleValue2 != null) {
                                        TextStylingKt.style(textView5, textStyleValue2, EmptySet.INSTANCE);
                                    }
                                    ButtonSubmitComponentStyle buttonPrimaryStyleValue2 = governmentIdStepStyle2.getButtonPrimaryStyleValue();
                                    if (buttonPrimaryStyleValue2 != null) {
                                        ButtonStylingKt.style$default(buttonWithLoadingIndicator, buttonPrimaryStyleValue2);
                                    }
                                    ButtonCancelComponentStyle buttonSecondaryStyleValue2 = governmentIdStepStyle2.getButtonSecondaryStyleValue();
                                    if (buttonSecondaryStyleValue2 != null) {
                                        ButtonStylingKt.style$default(personaMaterialButton3, buttonSecondaryStyleValue2, false, false, 14);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                Pi2ErrorBinding pi2ErrorBinding2 = (Pi2ErrorBinding) obj5;
                                ErrorView errorView2 = (ErrorView) obj4;
                                final ErrorView errorView22 = (ErrorView) obj32;
                                viewEnvironment.getClass();
                                NavigationState navigationState2 = errorView22.navigationState;
                                Function0 function03 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i15 = i11;
                                        ErrorView errorView3 = errorView22;
                                        switch (i15) {
                                            case 0:
                                                errorView3.onBackClick.invoke();
                                                break;
                                            default:
                                                errorView3.onCancelClick.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                Function0 function04 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i15 = i10;
                                        ErrorView errorView3 = errorView22;
                                        switch (i15) {
                                            case 0:
                                                errorView3.onBackClick.invoke();
                                                break;
                                            default:
                                                errorView3.onCancelClick.invoke();
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                Pi2NavigationBar pi2NavigationBar3 = pi2ErrorBinding2.navigationBar;
                                TextView textView7 = pi2ErrorBinding2.title;
                                Button button = pi2ErrorBinding2.continueButton;
                                CoordinatorLayout coordinatorLayout42 = pi2ErrorBinding2.rootView;
                                coordinatorLayout42.getClass();
                                zzai.applyNavigationState(navigationState2, function03, function04, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar3, coordinatorLayout42);
                                StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = errorView22.styles;
                                if (governmentIdStepStyle3 != null && (imageLocalStyle = governmentIdStepStyle3.getImageLocalStyle()) != null && (illustration = imageLocalStyle.getIllustration()) != null) {
                                    localImageComponentStyle = illustration.getBase();
                                }
                                pi2ErrorBinding2.illustration.setAnimation(R.raw.pi2_id_front_fail);
                                if (localImageComponentStyle != null) {
                                    ah.addOneShotPreDrawListenerAndDiscardFrame(coordinatorLayout42, new ErrorView$$ExternalSyntheticLambda4(pi2ErrorBinding2, localImageComponentStyle, 0));
                                }
                                textView7.setText(errorView22.titleText);
                                button.setText(errorView22.continueButtonText);
                                button.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(errorView2, 15));
                                if (governmentIdStepStyle3 != null) {
                                    Integer backgroundColorValue4 = governmentIdStepStyle3.getBackgroundColorValue();
                                    if (backgroundColorValue4 != null) {
                                        int intValue3 = backgroundColorValue4.intValue();
                                        coordinatorLayout42.setBackgroundColor(intValue3);
                                        Context context6 = coordinatorLayout42.getContext();
                                        context6.getClass();
                                        zzat.updateSystemUiColor(viewEnvironment, context6, intValue3);
                                    }
                                    StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle3.getTitleStyle();
                                    if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
                                        TextStylingKt.style(textView7, base4, EmptySet.INSTANCE);
                                    }
                                    StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle3.getButtonPrimaryStyle();
                                    if (buttonPrimaryStyle != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
                                        ButtonStylingKt.style$default(button, base2, false, false, 14);
                                        break;
                                    }
                                }
                                break;
                            default:
                                OldBottomSheetDialogView oldBottomSheetDialogView2 = (OldBottomSheetDialogView) obj5;
                                Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding2 = (Pi2RequestPermissionRationaleBinding) obj4;
                                final OldBottomSheetDialogView oldBottomSheetDialogView22 = (OldBottomSheetDialogView) obj32;
                                viewEnvironment.getClass();
                                pi2RequestPermissionRationaleBinding2.getClass();
                                String str4 = oldBottomSheetDialogView2.titleText;
                                int length = str4.length();
                                TextView textView8 = pi2RequestPermissionRationaleBinding2.title;
                                if (length > 0) {
                                    ExtensionsKt.setMarkdown(textView8, str4);
                                } else {
                                    textView8.setVisibility(8);
                                }
                                TextView textView9 = pi2RequestPermissionRationaleBinding2.message;
                                PersonaMaterialButton personaMaterialButton4 = pi2RequestPermissionRationaleBinding2.positiveButton;
                                PersonaMaterialButton personaMaterialButton5 = pi2RequestPermissionRationaleBinding2.negativeButton;
                                ExtensionsKt.setMarkdown(textView9, oldBottomSheetDialogView2.messageText);
                                personaMaterialButton4.setText(oldBottomSheetDialogView22.positiveButtonText);
                                personaMaterialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i15 = i11;
                                        OldBottomSheetDialogView oldBottomSheetDialogView3 = oldBottomSheetDialogView22;
                                        switch (i15) {
                                            case 0:
                                                oldBottomSheetDialogView3.onPositiveButtonClick.invoke();
                                                break;
                                            default:
                                                oldBottomSheetDialogView3.onNegativeButtonClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                personaMaterialButton5.setText(oldBottomSheetDialogView22.negativeButtonText);
                                personaMaterialButton5.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i15 = i10;
                                        OldBottomSheetDialogView oldBottomSheetDialogView3 = oldBottomSheetDialogView22;
                                        switch (i15) {
                                            case 0:
                                                oldBottomSheetDialogView3.onPositiveButtonClick.invoke();
                                                break;
                                            default:
                                                oldBottomSheetDialogView3.onNegativeButtonClick.invoke();
                                                break;
                                        }
                                    }
                                });
                                BackPressHandlerKt.setBackPressedHandler(pi2RequestPermissionRationaleBinding2.bottomSheet, new OldBottomSheetDialogView$$ExternalSyntheticLambda3(oldBottomSheetDialogView22, 0));
                                ah.addOneShotPreDrawListenerAndDiscardFrame(personaMaterialButton5, new StateFlowsKt$$ExternalSyntheticLambda2(10, pi2RequestPermissionRationaleBinding2, oldBottomSheetDialogView2));
                                break;
                        }
                    }
                };
            default:
                SavedStateHandle savedStateHandle4 = (SavedStateHandle) obj;
                savedStateHandle4.getClass();
                PermissionRequestViewModel_Factory_Impl permissionRequestViewModel_Factory_Impl = ((PermissionRequestFragment) obj2).viewModelFactory;
                if (permissionRequestViewModel_Factory_Impl != null) {
                    return new PermissionRequestViewModel(savedStateHandle4, (PermissionRequestStateManager_Factory_Impl) permissionRequestViewModel_Factory_Impl.delegateFactory.documentStepStateManagerFactoryProvider.instance);
                }
                Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
                throw null;
        }
    }

    public /* synthetic */ HCaptcha$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
