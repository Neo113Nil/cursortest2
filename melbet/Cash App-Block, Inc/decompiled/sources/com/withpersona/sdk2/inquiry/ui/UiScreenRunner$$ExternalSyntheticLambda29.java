package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import coil3.ImageLoader$Builder;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.transition.CrossfadeTransition;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.math.MathUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.renderscript.ToolkitKt;
import com.squareup.cash.R;
import com.squareup.cash.tax.views.databinding.TaxWebAppLayoutBinding;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewBinding;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdLocalVideoCaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdWebRtcRenderer;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureStateEventData;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import io.noties.markwon.MarkwonImpl;
import java.io.File;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.p0;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import org.commonmark.parser.Parser;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiScreenRunner$$ExternalSyntheticLambda29 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda29(SheetComponent sheetComponent, MarkwonImpl markwonImpl, View view) {
        this.$r8$classId = 25;
        this.f$1 = sheetComponent;
        this.f$2 = markwonImpl;
        this.f$0 = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Drawable mutate;
        String prefill;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 2;
        Object[] objArr = 0;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                View view = (View) obj3;
                UiWorkflow.Screen.EntryScreen entryScreen = (UiWorkflow.Screen.EntryScreen) obj2;
                UiScreenRunner uiScreenRunner = (UiScreenRunner) obj;
                if (ToolkitKt.getConfirmationCode(view).length() == 4) {
                    SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) ExtensionsKt.findFirstComponentOrNull(entryScreen.components, Reflection.factory.getOrCreateKotlinClass(SubmitButtonComponent.class), UiWorkflow$render$$inlined$findFirstComponentOrNull$default$1.INSTANCE$2);
                    if (submitButtonComponent != null) {
                        uiScreenRunner.onClick.invoke(submitButtonComponent, Boolean.valueOf(view.getVisibility() == 0));
                    }
                }
                break;
            case 1:
                GovernmentIdStateManagerUtilsKt.handlePermissionChanged(((GovIdCaptureRenderer) obj3).applicationContext, (SubtreeManager) obj2, (GovernmentIdWorkflow.Input) obj, true);
                break;
            case 2:
                GovernmentIdStateManagerUtilsKt.goBack((SubtreeManager) obj3, (GovernmentIdWorkflow.Input) obj2, (GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj);
                break;
            case 3:
                GovernmentIdStateManagerUtilsKt.goBack((SubtreeManager) obj3, (GovernmentIdWorkflow.Input) obj2, (GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj);
                break;
            case 4:
                GovernmentIdStateManagerUtilsKt.handlePermissionChanged(((GovIdLocalVideoCaptureRenderer) obj3).applicationContext, (SubtreeManager) obj2, (GovernmentIdWorkflow.Input) obj, true);
                break;
            case 5:
                GovernmentIdStateManagerUtilsKt.goBack((SubtreeManager) obj3, (GovernmentIdWorkflow.Input) obj2, (GovernmentIdStepStateManager$$ExternalSyntheticLambda1) obj);
                break;
            case 6:
                GovernmentIdStateManagerUtilsKt.handlePermissionChanged(((GovIdWebRtcRenderer) obj3).applicationContext, (SubtreeManager) obj2, (GovernmentIdWorkflow.Input) obj, true);
                break;
            case 7:
                String str = (String) obj2;
                RealImageLoader realImageLoader = (RealImageLoader) obj;
                ImageView imageView = ((Pi2GovernmentidReviewBinding) obj3).reviewImage;
                int measuredWidth = imageView.getMeasuredWidth();
                if (measuredWidth > 2000) {
                    measuredWidth = 2000;
                }
                if (measuredWidth > 0) {
                    imageView.setTag(R.id.pi2_last_image_path, str);
                    File file = new File(str);
                    ImageRequest.Builder builder = new ImageRequest.Builder(imageView.getContext());
                    builder.data = file;
                    ImageRequests_androidKt.target(builder, imageView);
                    builder.size(measuredWidth, measuredWidth);
                    builder.memoryCacheKey = str;
                    realImageLoader.enqueue(builder.build());
                }
                break;
            case 8:
                GovernmentIdWorkflowUtilsKt.handlePermissionChanged((Context) ((UnleashContext) obj3).userId, (StatefulWorkflow.RenderContext) obj2, (GovernmentIdWorkflow.Input) obj, true);
                break;
            case 9:
                GovernmentIdWorkflowUtilsKt.handlePermissionChanged(((WebRtcRenderer) obj3).applicationContext, (StatefulWorkflow.RenderContext) obj2, (GovernmentIdWorkflow.Input) obj, true);
                break;
            case 10:
                DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = (DeviceFeatureRequestWorkflow) obj2;
                ((StatefulWorkflow.RenderContext) obj3).$$delegate_0.getActionSink().send(Workflows.action$default(deviceFeatureRequestWorkflow, new DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda3(deviceFeatureRequestWorkflow, (DeviceFeatureRequestWorkflow.Props) obj, 3)));
                break;
            case 11:
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                JobKt.launch$default((LifecycleCoroutineScopeImpl) obj3, MainDispatcherLoader.dispatcher, null, new TransitionWorker$run$1((OldCameraScreenRunner) obj2, (MathUtils) obj, objArr == true ? 1 : 0, 20), 2);
                break;
            case 12:
                ((StatefulWorkflow.RenderContext) obj3).$$delegate_0.getActionSink().send(Workflows.action$default((SelfieWorkflow) obj2, new ForwardingFileSystem$$ExternalSyntheticLambda0((SelfieState.ReviewCaptures) obj, i2)));
                break;
            case 13:
                ((StatefulWorkflow.RenderContext) obj3).$$delegate_0.getActionSink().send(Workflows.action$default((SelfieWorkflow) obj2, new ForwardingFileSystem$$ExternalSyntheticLambda0((SelfieState.WebRtcFinished) obj, i3)));
                break;
            case 14:
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) obj3;
                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) obj2;
                SelfieWorkflow.Input input = (SelfieWorkflow.Input) obj;
                SubtreeManager subtreeManager = (SubtreeManager) selfieStepStateManager.lastChild;
                WorkflowState state = subtreeManager.getState();
                SelfieState.StartCapture startCapture2 = state instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) state : null;
                if (startCapture2 != null) {
                    subtreeManager.updateState(new SelfieState.CountdownToManualCapture(startCapture2.cameraProperties, startCapture2.posesNeeded, System.currentTimeMillis(), startCapture2.autoCaptureSupported, startCapture.startSelfieTimestamp, MaterialAttributes.createBackState(subtreeManager, false), input.poseConfigs, startCapture.cameraFacingMode, startCapture.isFlashEnabled));
                    TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(selfieStepStateManager.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.TAKING_PHOTO, "manual", ((Selfie.Pose) CollectionsKt.first(startCapture2.getPosesNeeded())).name(), null, 8, null), false, 2, null);
                    break;
                } else {
                    break;
                }
            case 15:
                SelfieState.ShowPoseHint showPoseHint = (SelfieState.ShowPoseHint) obj2;
                SubtreeManager subtreeManager2 = (SubtreeManager) ((SelfieStepStateManager) obj3).lastChild;
                subtreeManager2.updateState(new SelfieState.Capture(RecyclerView.DECELERATION_RATE, 8193, System.currentTimeMillis(), showPoseHint.startSelfieTimestamp, showPoseHint.cameraFacingMode, showPoseHint.cameraProperties, (SelfieBrightnessInfo) null, (SelfieError) null, ((SelfieWorkflow.Input) obj).poseConfigs, MaterialAttributes.createBackState(subtreeManager2, false), showPoseHint.selfies, showPoseHint.posesNeeded, showPoseHint.autoCaptureSupported, showPoseHint.isFlashEnabled));
                break;
            case 16:
                SubtreeManager subtreeManager3 = (SubtreeManager) obj3;
                SelfieWorkflow.Input input2 = (SelfieWorkflow.Input) obj2;
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (SelfieState.FinalizeLocalVideoCapture) obj;
                WorkflowState state2 = subtreeManager3.getState();
                SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = state2 instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) state2 : null;
                if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.isFinalizeComplete) {
                    subtreeManager3.updateState(MaterialAttributes.reviewStateIfNeeded(subtreeManager3, input2.poseConfigs, finalizeLocalVideoCapture2.selfies, null, finalizeLocalVideoCapture.cameraProperties, finalizeLocalVideoCapture.startSelfieTimestamp, MaterialAttributes.createBackState(subtreeManager3, false)));
                    break;
                }
                break;
            case 17:
                MaterialAttributes.handlePermissionChanged(((SelfieStepStateManager) obj3).applicationContext, (SubtreeManager) obj2, (SelfieWorkflow.Input) obj, true);
                break;
            case 18:
                SelfieStepStateManager selfieStepStateManager2 = (SelfieStepStateManager) obj3;
                SelfieWorkflow.Input input3 = (SelfieWorkflow.Input) obj2;
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureStateEvent$default(selfieStepStateManager2.trackingEventsLogger, new SelfieCaptureStateEventData(SelfieCaptureState.LOADING, null, null, null, 8, null), false, 2, null);
                SubtreeManager subtreeManager4 = (SubtreeManager) selfieStepStateManager2.lastChild;
                subtreeManager4.updateState(new SelfieState.WaitForCameraFeed(MaterialAttributes.createBackState(subtreeManager4, true), input3.orderedPoses, input3.poseConfigs, ((SelfieState.ShowInstructions) obj).cameraFacingMode));
                break;
            case 19:
                SelfieWorkflow.Input input4 = (SelfieWorkflow.Input) obj2;
                SubtreeManager subtreeManager5 = (SubtreeManager) ((SelfieStepStateManager) obj3).lastChild;
                subtreeManager5.updateState(new SelfieState.WaitForCameraFeed(MaterialAttributes.createBackState(subtreeManager5, false), input4.orderedPoses, input4.poseConfigs, ((SelfieState.RestartCamera) obj).cameraFacingMode));
                break;
            case 20:
                SelfieWorkflow.Input input5 = (SelfieWorkflow.Input) obj2;
                SubtreeManager subtreeManager6 = (SubtreeManager) ((SelfieStepStateManager) obj3).lastChild;
                subtreeManager6.updateState(new SelfieState.WaitForCameraFeed(MaterialAttributes.createBackState(subtreeManager6, false), input5.orderedPoses, input5.poseConfigs, ((SelfieState.ReviewCaptures) obj).cameraFacingMode));
                break;
            case 21:
                SelfieWorkflowUtilsKt.handlePermissionChanged((Context) ((p0) obj3).a, (StatefulWorkflow.RenderContext) obj2, (SelfieWorkflow.Input) obj, true);
                break;
            case 22:
                TaxWebAppLayoutBinding taxWebAppLayoutBinding = (TaxWebAppLayoutBinding) obj3;
                int i4 = OldSelfieOverlayView.$r8$clinit;
                ((ThemeableLottieAnimationView) taxWebAppLayoutBinding.taxWebAppErrorText).setFrame(0);
                OldSelfieOverlayView.animateShow((ThemeableLottieAnimationView) taxWebAppLayoutBinding.taxWebAppErrorText, 200L).withEndAction(new CardEntryActivityController$$ExternalSyntheticLambda1(19, (OldSelfieOverlayView) obj2, taxWebAppLayoutBinding, (Function0) obj));
                OldSelfieOverlayView.animateShow(taxWebAppLayoutBinding.taxWebAppLoadingProgress, 200L);
                break;
            case 23:
                Function0 function0 = (Function0) obj2;
                Function0 function02 = (Function0) obj;
                if (((NavigationState) obj3).showBackButton) {
                    function0.invoke();
                } else {
                    function02.invoke();
                }
                break;
            case 24:
                ESignature eSignature = (ESignature) obj3;
                Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding = (Pi2UiSignatureFieldBinding) obj2;
                ImageView imageView2 = pi2UiSignatureFieldBinding.signaturePreview;
                ESignatureComponent eSignatureComponent = (ESignatureComponent) obj;
                ESignature.Attributes attributes = eSignature.getAttributes();
                if (attributes != null && (prefill = attributes.getPrefill()) != null) {
                    Context context = imageView2.getContext();
                    context.getClass();
                    ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(context);
                    ImageRequestsKt.crossfade(imageLoader$Builder);
                    ((Extras.Builder) imageLoader$Builder.extras).set(ImageRequests_androidKt.transitionFactoryKey, new CrossfadeTransition.Factory(100));
                    RealImageLoader build = imageLoader$Builder.build();
                    Context context2 = imageView2.getContext();
                    context2.getClass();
                    ImageRequest.Builder builder2 = new ImageRequest.Builder(context2);
                    builder2.data = prefill;
                    builder2.target = new Parser.Builder(pi2UiSignatureFieldBinding, pi2UiSignatureFieldBinding, eSignatureComponent, pi2UiSignatureFieldBinding);
                    build.enqueue(builder2.build());
                }
                ESignature.ESignatureComponentStyle styles = eSignature.getStyles();
                if (styles != null) {
                    TextView textView = pi2UiSignatureFieldBinding.addSignatureLabel;
                    MaterialCardView materialCardView = pi2UiSignatureFieldBinding.signatureContainer;
                    TextBasedComponentStyle placeholderTextBasedStyle = styles.getInputTextStyle().getPlaceholderTextBasedStyle();
                    EmptySet emptySet = EmptySet.INSTANCE;
                    TextStylingKt.style(textView, placeholderTextBasedStyle, emptySet);
                    Integer signaturePreviewBackgroundColor = styles.getSignaturePreviewBackgroundColor();
                    if (signaturePreviewBackgroundColor != null) {
                        materialCardView.setCardBackgroundColor(signaturePreviewBackgroundColor.intValue());
                    }
                    Integer fillColorValue = styles.getFillColorValue();
                    if (fillColorValue != null) {
                        int intValue = fillColorValue.intValue();
                        Drawable drawable = pi2UiSignatureFieldBinding.editSignatureIcon.getDrawable();
                        if (drawable != null && (mutate = drawable.mutate()) != null) {
                            mutate.setTint(intValue);
                        }
                    }
                    TextStylingKt.style(pi2UiSignatureFieldBinding.errorLabel, styles.getInputTextStyle().getErrorTextStyle(), emptySet);
                    TextStylingKt.style(pi2UiSignatureFieldBinding.label, styles.getInputTextStyle().getLabelTextBasedStyle(), emptySet);
                    StyleElements.SizeSet margins = styles.getMargins();
                    if (margins != null) {
                        ConstraintLayout constraintLayout = pi2UiSignatureFieldBinding.rootView;
                        constraintLayout.getClass();
                        ViewUtilsKt.setMargins(constraintLayout, margins);
                    }
                    Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
                    if (baseBorderColorValue != null) {
                        materialCardView.setStrokeColor(baseBorderColorValue.intValue());
                    }
                    Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
                    if (borderWidthValue != null) {
                        materialCardView.setStrokeWidth((int) Math.ceil(com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(borderWidthValue.doubleValue())));
                    }
                    Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
                    if (borderRadiusValue != null) {
                        materialCardView.setRadius((float) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(borderRadiusValue.doubleValue()));
                    }
                }
                break;
            case 25:
                MarkwonImpl markwonImpl = (MarkwonImpl) obj;
                CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) ((SheetComponent) obj2);
                createPersonaSheetComponent.shown = true;
                createPersonaSheetComponent.showing = false;
                ((ViewGroup) markwonImpl.parser).removeView((View) obj3);
                markwonImpl.plugins = null;
                markwonImpl.visitorFactory = null;
                break;
            default:
                UiStepStateManager uiStepStateManager = (UiStepStateManager) obj3;
                TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiStepStateManager.trackingEventsLogger, UiStepButtonType.Cancel, null, ((UiState.Displaying) ((UiState) obj2)).stepName, false, 10, null);
                uiStepStateManager.setOutput(((UiWorkflow.Input) obj).finalStep ? UiWorkflow.Output.Completed.INSTANCE : UiWorkflow.Output.Canceled.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda29(SubtreeManager subtreeManager, GovernmentIdWorkflow.Input input, POPMatchingFactory pOPMatchingFactory, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = subtreeManager;
        this.f$1 = input;
        this.f$2 = function1;
    }

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda29(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
