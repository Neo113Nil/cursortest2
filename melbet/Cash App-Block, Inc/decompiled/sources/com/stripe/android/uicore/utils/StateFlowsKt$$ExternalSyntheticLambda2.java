package com.stripe.android.uicore.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.trace.model.SpanEvent;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzj;
import com.google.android.play.integrity.internal.ah;
import com.miteksystems.misnap.workflow.a.o;
import com.plaid.internal.P5$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.databinding.TaxWebAppLayoutBinding;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel$onBackClick$1;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.components.MultipleEventsCutterImpl;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter$Companion;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2CancelModalBinding;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.OldBottomSheetDialogView;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2RequestPermissionRationaleBinding;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponentKt$makeView$lambda$6$lambda$5$$inlined$filterIsInstance$1;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputNumberBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSecureTextBinding;
import com.withpersona.sdk2.inquiry.steps.ui.styling.BottomSheetStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.StackState;
import com.withpersona.sdk2.inquiry.steps.ui.styling.StackStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonType;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import dagger.internal.Preconditions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final /* synthetic */ class StateFlowsKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ StateFlowsKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0380  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Map additionalParamsFromStripeException;
        Object obj;
        ButtonCancelComponentStyle cancelDialogResumeStyleValue;
        ButtonSubmitComponentStyle cancelDialogCloseStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        boolean z;
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue2;
        TextBasedComponentStyle titleStyleValue2;
        boolean z2;
        ButtonCancelComponentStyle buttonSecondaryStyleValue2;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue2;
        TextBasedComponentStyle textStyleValue3;
        TextBasedComponentStyle titleStyleValue3;
        TextBasedComponentStyle errorLabelStyle;
        char c;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object next;
        char c2;
        char c3;
        int intValue;
        StyleElements.Size borderRadiusValue;
        Integer baseBackgroundColorValue;
        StyleElements.SizeSet borderWidthValue;
        Double widthValue;
        StyleElements.Size right;
        Double dp;
        StyleElements.Size left;
        Double dp2;
        StyleElements.Size bottom;
        Double dp3;
        StyleElements.Size top;
        Double dp4;
        Double dp5;
        StyleElements.Size right2;
        StyleElements.Size left2;
        StyleElements.Size bottom2;
        StyleElements.Size top2;
        char c4;
        int paddingRight;
        Double dp6;
        Double dp7;
        Double dp8;
        Double dp9;
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f;
        StyleElements.SizeSet marginValue;
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle expandComponentsButtonStyle;
        TextBasedComponentStyle errorTextStyle;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        TextBasedComponentStyle textBasedStyle2;
        InputTextBasedComponentStyle inputTextStyle2;
        InputTextBasedComponentStyle inputTextStyle3;
        InputSelectComponentStyle inputSelectStyle;
        InputSelectComponentStyle inputSelectStyle2;
        TextBasedComponentStyle errorTextStyle2;
        InputSelectComponentStyle inputSelectStyle3;
        TextBasedComponentStyle labelStyle;
        AttributeStyles.InputMarginStyle margin;
        StyleElements.MeasurementSet base3;
        StyleElements.SizeSet base4;
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 8;
        char c5 = 2;
        EmptyMap emptyMap = null;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                break;
            case 1:
                FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) obj7;
                NavHostController navHostController = (NavHostController) obj6;
                int i4 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                FinancialConnectionsSheetNativeViewModel viewModel = financialConnectionsSheetNativeActivity.getViewModel();
                NavDestination currentDestination$navigation_runtime_release = navHostController.impl.getCurrentDestination$navigation_runtime_release();
                JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new FinancialConnectionsSheetNativeViewModel$onBackClick$1(currentDestination$navigation_runtime_release != null ? DestinationMappersKt.getPane(currentDestination$navigation_runtime_release) : null, viewModel, null), 3);
                if (!navHostController.popBackStack()) {
                    FinancialConnectionsSheetNativeViewModel.closeAuthFlow$default(financialConnectionsSheetNativeActivity.getViewModel(), null, null, 1);
                }
                break;
            case 2:
                MultipleEventsCutterImpl multipleEventsCutterImpl = (MultipleEventsCutterImpl) obj7;
                Function0 function0 = (Function0) obj6;
                multipleEventsCutterImpl.getClass();
                if (System.currentTimeMillis() - multipleEventsCutterImpl.lastEventTimeMs >= 500) {
                    function0.invoke();
                }
                multipleEventsCutterImpl.lastEventTimeMs = System.currentTimeMillis();
                break;
            case 3:
                Application application = (Application) obj6;
                String str2 = ((GooglePayPaymentMethodLauncherContractV2.Args) ((InitializerViewModelFactory) obj7).initializers).publishableKey;
                if (str2 != null) {
                    break;
                } else {
                    PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
                    if (paymentConfiguration == null) {
                        SharedPreferences sharedPreferences = new PaymentConfiguration.Store(application).prefs;
                        String string2 = sharedPreferences.getString("key_publishable_key", null);
                        paymentConfiguration = string2 != null ? new PaymentConfiguration(string2, sharedPreferences.getString("key_account_id", null)) : null;
                        if (paymentConfiguration == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                            break;
                        } else {
                            PaymentConfiguration.instance = paymentConfiguration;
                        }
                    }
                    break;
                }
            case 4:
                Context context = (Context) obj6;
                try {
                    if (((DefaultPaymentNextActionHandlerRegistry) obj7).includePaymentSheetNextActionHandlers) {
                        Object obj8 = Class.forName("com.stripe.android.paymentsheet.PaymentSheetNextActionHandlers").getDeclaredField("INSTANCE").get(null);
                        Object invoke = obj8.getClass().getDeclaredMethod("get", null).invoke(obj8, null);
                        invoke.getClass();
                        obj = (Map) invoke;
                    } else {
                        obj = EmptyMap.INSTANCE;
                        obj.getClass();
                    }
                    break;
                } catch (Exception e) {
                    EmptySet emptySet = EmptySet.INSTANCE;
                    context.getClass();
                    emptySet.getClass();
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    Preconditions.checkNotNullFromProvides(defaultIoScheduler);
                    DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(Logger$Companion.NOOP_LOGGER, defaultIoScheduler);
                    PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(applicationContext, new CameraX$$ExternalSyntheticLambda0(applicationContext, 14), emptySet);
                    ErrorReporter$UnexpectedErrorEvent errorReporter$UnexpectedErrorEvent = ErrorReporter$UnexpectedErrorEvent.PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND;
                    int i5 = StripeException.$r8$clinit;
                    StripeException create = SpanEvent.Account.create(e);
                    if ((4 & 2) != 0) {
                        create = null;
                    }
                    if ((4 & 4) != 0) {
                        emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                    }
                    emptyMap.getClass();
                    if (create == null) {
                        additionalParamsFromStripeException = EmptyMap.INSTANCE;
                        additionalParamsFromStripeException.getClass();
                    } else {
                        additionalParamsFromStripeException = ErrorReporter$Companion.getAdditionalParamsFromStripeException(create);
                    }
                    defaultAnalyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(errorReporter$UnexpectedErrorEvent, MapsKt__MapsKt.plus(additionalParamsFromStripeException, emptyMap)));
                    EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                    emptyMap2.getClass();
                    return emptyMap2;
                }
            case 5:
                DocumentStepStateManager documentStepStateManager = (DocumentStepStateManager) obj7;
                documentStepStateManager.onEvent((SubtreeManager) documentStepStateManager.lastChild, new DocumentWorkflow.Event.Submit(((DocumentWorkflow.State.ReviewCaptures) ((DocumentWorkflow.State) obj6)).documentId));
                break;
            case 6:
                int i6 = 6;
                BasicGovIdCaptureViewController basicGovIdCaptureViewController = (BasicGovIdCaptureViewController) obj7;
                Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = (Pi2GovernmentidCameraBinding) obj6;
                BasicGovIdCaptureViewController.AnimationState animationState = basicGovIdCaptureViewController.animationState;
                BasicGovIdCaptureViewController.AnimationState animationState2 = BasicGovIdCaptureViewController.AnimationState.INITIAL;
                if (animationState == animationState2) {
                    basicGovIdCaptureViewController.animationState = BasicGovIdCaptureViewController.AnimationState.ENTRY_ANIMATING;
                    ImageView imageView = pi2GovernmentidCameraBinding.overlayGuide;
                    ScanningView scanningView = pi2GovernmentidCameraBinding.scanningView;
                    ConstraintLayout constraintLayout = pi2GovernmentidCameraBinding.overlayHint;
                    int height = constraintLayout.getHeight() + imageView.getHeight();
                    int height2 = constraintLayout.getHeight();
                    if (height != 0 && height2 != 0) {
                        float f2 = height;
                        float f3 = -(f2 / 2.0f);
                        constraintLayout.setTranslationY(f3);
                        scanningView.setTranslationY(f3);
                        imageView.setTranslationY(f3);
                        imageView.setPivotY(imageView.getHeight());
                        scanningView.setPivotY(scanningView.getHeight());
                        scanningView.setScaleY(height2 / f2);
                        FrameLayout frameLayout = basicGovIdCaptureViewController.binding.rootView;
                        frameLayout.getClass();
                        ah.addOneShotPreDrawListenerAndDiscardFrame(frameLayout, new CameraHelper$$ExternalSyntheticLambda0(basicGovIdCaptureViewController, i6));
                        break;
                    } else {
                        basicGovIdCaptureViewController.animationState = animationState2;
                        break;
                    }
                } else {
                    break;
                }
            case 7:
                Pi2CancelModalBinding pi2CancelModalBinding = (Pi2CancelModalBinding) obj6;
                StepStyle stepStyle = ((InquiryWorkflow$Output.Cancel) obj7).styles;
                if (stepStyle != null && (titleStyleValue = stepStyle.getTitleStyleValue()) != null) {
                    TextStylingKt.style(pi2CancelModalBinding.hintTitle, titleStyleValue, EmptySet.INSTANCE);
                }
                if (stepStyle != null && (textStyleValue = stepStyle.getTextStyleValue()) != null) {
                    TextStylingKt.style(pi2CancelModalBinding.hintMessage, textStyleValue, EmptySet.INSTANCE);
                }
                if (stepStyle != null && (cancelDialogCloseStyleValue = stepStyle.getCancelDialogCloseStyleValue()) != null) {
                    ButtonStylingKt.style$default(pi2CancelModalBinding.closeButton, cancelDialogCloseStyleValue, false, false, 10);
                }
                if (stepStyle != null && (cancelDialogResumeStyleValue = stepStyle.getCancelDialogResumeStyleValue()) != null) {
                    ButtonStylingKt.style$default(pi2CancelModalBinding.retryButton, cancelDialogResumeStyleValue, false, false, 10);
                }
                break;
            case 8:
                Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding = (Pi2RequestPermissionRationaleBinding) obj7;
                SubtreeManager subtreeManager = (SubtreeManager) obj6;
                PersonaMaterialButton personaMaterialButton = pi2RequestPermissionRationaleBinding.negativeButton;
                Flow flow = pi2RequestPermissionRationaleBinding.flowLayout;
                PersonaMaterialButton personaMaterialButton2 = pi2RequestPermissionRationaleBinding.positiveButton;
                if (personaMaterialButton.getLineCount() > 1 || personaMaterialButton2.getLineCount() > 1) {
                    ViewGroup.LayoutParams layoutParams = personaMaterialButton.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        break;
                    } else {
                        layoutParams.width = flow.getWidth();
                        personaMaterialButton.setLayoutParams(layoutParams);
                        ViewGroup.LayoutParams layoutParams2 = personaMaterialButton2.getLayoutParams();
                        if (layoutParams2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            break;
                        } else {
                            layoutParams2.width = flow.getWidth();
                            personaMaterialButton2.setLayoutParams(layoutParams2);
                            flow.setReferencedIds(new int[]{personaMaterialButton2.getId(), personaMaterialButton.getId()});
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                StepStyle stepStyle2 = (StepStyle) subtreeManager.workflowSession;
                BottomSheetStylingKt.applyBottomSheetStyles$default(pi2RequestPermissionRationaleBinding.bottomSheet, stepStyle2, pi2RequestPermissionRationaleBinding.bottomSheetContent, null, 12);
                if (stepStyle2 != null && (titleStyleValue2 = stepStyle2.getTitleStyleValue()) != null) {
                    TextStylingKt.style(pi2RequestPermissionRationaleBinding.title, titleStyleValue2, EmptySet.INSTANCE);
                }
                if (stepStyle2 != null && (textStyleValue2 = stepStyle2.getTextStyleValue()) != null) {
                    TextStylingKt.style(pi2RequestPermissionRationaleBinding.message, textStyleValue2, EmptySet.INSTANCE);
                }
                if (stepStyle2 != null && (buttonPrimaryStyleValue = stepStyle2.getButtonPrimaryStyleValue()) != null) {
                    ButtonStylingKt.style$default(personaMaterialButton2, buttonPrimaryStyleValue, !z, false, 10);
                }
                if (stepStyle2 != null && (buttonSecondaryStyleValue = stepStyle2.getButtonSecondaryStyleValue()) != null) {
                    ButtonStylingKt.style$default(personaMaterialButton, buttonSecondaryStyleValue, !z, false, 10);
                }
                break;
            case 9:
                ((StatefulWorkflow.RenderContext) obj7).$$delegate_0.getActionSink().send(Workflows.action$default((DeviceFeatureRequestWorkflow) obj6, new SelfieWorkflow$$ExternalSyntheticLambda79(i3)));
                break;
            case 10:
                Pi2RequestPermissionRationaleBinding pi2RequestPermissionRationaleBinding2 = (Pi2RequestPermissionRationaleBinding) obj7;
                OldBottomSheetDialogView oldBottomSheetDialogView = (OldBottomSheetDialogView) obj6;
                PersonaMaterialButton personaMaterialButton3 = pi2RequestPermissionRationaleBinding2.negativeButton;
                Flow flow2 = pi2RequestPermissionRationaleBinding2.flowLayout;
                PersonaMaterialButton personaMaterialButton4 = pi2RequestPermissionRationaleBinding2.positiveButton;
                if (personaMaterialButton3.getLineCount() > 1 || personaMaterialButton4.getLineCount() > 1) {
                    ViewGroup.LayoutParams layoutParams3 = personaMaterialButton3.getLayoutParams();
                    if (layoutParams3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        break;
                    } else {
                        layoutParams3.width = flow2.getWidth();
                        personaMaterialButton3.setLayoutParams(layoutParams3);
                        ViewGroup.LayoutParams layoutParams4 = personaMaterialButton4.getLayoutParams();
                        if (layoutParams4 == null) {
                            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            break;
                        } else {
                            layoutParams4.width = flow2.getWidth();
                            personaMaterialButton4.setLayoutParams(layoutParams4);
                            flow2.setReferencedIds(new int[]{personaMaterialButton4.getId(), personaMaterialButton3.getId()});
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                StepStyle stepStyle3 = oldBottomSheetDialogView.styles;
                BottomSheetStylingKt.applyBottomSheetStyles$default(pi2RequestPermissionRationaleBinding2.bottomSheet, stepStyle3, pi2RequestPermissionRationaleBinding2.bottomSheetContent, null, 12);
                if (stepStyle3 != null && (titleStyleValue3 = stepStyle3.getTitleStyleValue()) != null) {
                    TextStylingKt.style(pi2RequestPermissionRationaleBinding2.title, titleStyleValue3, EmptySet.INSTANCE);
                }
                if (stepStyle3 != null && (textStyleValue3 = stepStyle3.getTextStyleValue()) != null) {
                    TextStylingKt.style(pi2RequestPermissionRationaleBinding2.message, textStyleValue3, EmptySet.INSTANCE);
                }
                if (stepStyle3 != null && (buttonPrimaryStyleValue2 = stepStyle3.getButtonPrimaryStyleValue()) != null) {
                    ButtonStylingKt.style$default(personaMaterialButton4, buttonPrimaryStyleValue2, !z2, false, 10);
                }
                if (stepStyle3 != null && (buttonSecondaryStyleValue2 = stepStyle3.getButtonSecondaryStyleValue()) != null) {
                    ButtonStylingKt.style$default(personaMaterialButton3, buttonSecondaryStyleValue2, !z2, false, 10);
                }
                break;
            case 11:
                ((StatefulWorkflow.RenderContext) obj7).$$delegate_0.getActionSink().send(Workflows.action$default((PermissionRequestWorkflow) obj6, new SelfieWorkflow$$ExternalSyntheticLambda79(11)));
                break;
            case 12:
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureButtonClickedEvent$default(((CameraScreenRunner) obj7).trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
                Function0 function02 = (Function0) ((Ref$ObjectRef) obj6).element;
                if (function02 != null) {
                    function02.invoke();
                }
                break;
            case 13:
                CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) obj7;
                CameraFeedKt.updateViewfinderRect(cameraScreenRunner.selfieDirectionFeed, (CameraController) obj6, cameraScreenRunner.viewController.binding.previewviewSelfieCamera);
                break;
            case 14:
                SelfieWorkflow.Screen.CameraScreen cameraScreen = (SelfieWorkflow.Screen.CameraScreen) obj7;
                boolean z3 = !cameraScreen.isFlashEnabled;
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureButtonClickedEvent$default(((CameraScreenRunner) obj6).trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.FLASH, null, 2, null), false, 2, null);
                cameraScreen.onFlashSet.invoke(Boolean.valueOf(z3));
                break;
            case 15:
                SelfieStepStateManager selfieStepStateManager = (SelfieStepStateManager) obj7;
                SelfieState.WebRtcFinished webRtcFinished = (SelfieState.WebRtcFinished) obj6;
                SubtreeManager subtreeManager2 = (SubtreeManager) selfieStepStateManager.lastChild;
                subtreeManager2.updateState(MaterialAttributes.reviewStateIfNeeded(subtreeManager2, ((SelfieWorkflow.Input) ((StateFlowImpl) selfieStepStateManager.firstChild).getValue()).poseConfigs, webRtcFinished.selfies, webRtcFinished.webRtcObjectId, webRtcFinished.cameraProperties, webRtcFinished.startSelfieTimestamp, MaterialAttributes.createBackState((SubtreeManager) selfieStepStateManager.lastChild, false)));
                break;
            case 16:
                ((SelfieStepStateManager) obj7).goBack$selfie_release((SubtreeManager) obj6);
                break;
            case 17:
                SelfieState.ReviewCaptures reviewCaptures = (SelfieState.ReviewCaptures) obj6;
                SubtreeManager subtreeManager3 = (SubtreeManager) ((SelfieStepStateManager) obj7).lastChild;
                WorkflowState state = subtreeManager3.getState();
                SelfieState.ReviewCaptures reviewCaptures2 = state instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) state : null;
                if (reviewCaptures2 != null) {
                    subtreeManager3.updateState(new SelfieState.Submit(reviewCaptures2.selfies, reviewCaptures2.webRtcObjectId, reviewCaptures2.cameraProperties, reviewCaptures2.startSelfieTimestamp, MaterialAttributes.createBackState(subtreeManager3, true), reviewCaptures.cameraFacingMode));
                    break;
                } else {
                    break;
                }
            case 18:
                ((StatefulWorkflow.RenderContext) obj7).$$delegate_0.getActionSink().send(Workflows.action$default(new ForwardingFileSystem$$ExternalSyntheticLambda0((SelfieState.FinalizeLocalVideoCapture) obj6, i2)));
                break;
            case 19:
                TaxWebAppLayoutBinding taxWebAppLayoutBinding = (TaxWebAppLayoutBinding) obj7;
                int i7 = OldSelfieOverlayView.$r8$clinit;
                OldSelfieOverlayView.animateHide((ThemeableLottieAnimationView) taxWebAppLayoutBinding.taxWebAppErrorText, 200L).withEndAction(new P5$$ExternalSyntheticLambda0(7, (Function0) obj6));
                OldSelfieOverlayView.animateHide(taxWebAppLayoutBinding.taxWebAppLoadingProgress, 200L);
                break;
            case 20:
                ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = (ClickableStack.ClickableStackComponentStyle) obj6;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ((Pi2UiSecureTextBinding) obj7).rootView;
                constraintLayout2.getClass();
                StackStylingKt.applyMarginsAndPadding(constraintLayout2, clickableStackComponentStyle);
                constraintLayout2.setBackground(StackStylingKt.getStyledBackground(clickableStackComponentStyle, StackState.BASE));
                Double widthValue2 = clickableStackComponentStyle.getWidthValue();
                if (widthValue2 != null) {
                    int dpToPx = (int) ExtensionsKt.getDpToPx(widthValue2.doubleValue());
                    ViewGroup.LayoutParams layoutParams5 = constraintLayout2.getLayoutParams();
                    if (layoutParams5 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        break;
                    } else {
                        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                        layoutParams6.endToEnd = -1;
                        ((ViewGroup.MarginLayoutParams) layoutParams6).width = dpToPx;
                        constraintLayout2.setLayoutParams(layoutParams6);
                    }
                }
                break;
            case 21:
                TextView textView = (TextView) obj7;
                textView.setVisibility(8);
                GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles = ((GovernmentIdNfcScan) obj6).getStyles();
                if (styles != null && (errorLabelStyle = styles.getErrorLabelStyle()) != null) {
                    TextStylingKt.style(textView, errorLabelStyle, EmptySet.INSTANCE);
                }
                break;
            case 22:
                HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle = (HorizontalStack.HorizontalStackComponentStyle) obj6;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ((Pi2UiSecureTextBinding) obj7).rootView;
                StyleElements.SizeSet marginValue2 = horizontalStackComponentStyle.getMarginValue();
                if (marginValue2 != null) {
                    ViewUtilsKt.setMargins(constraintLayout3, marginValue2);
                }
                StyleElements.SizeSet paddingValue = horizontalStackComponentStyle.getPaddingValue();
                if (paddingValue != null) {
                    StyleElements.Size left3 = paddingValue.getLeft();
                    int paddingLeft = (left3 == null || (dp9 = left3.getDp()) == null) ? constraintLayout3.getPaddingLeft() : (int) ExtensionsKt.getDpToPx(dp9.doubleValue());
                    StyleElements.Size top3 = paddingValue.getTop();
                    int paddingTop = (top3 == null || (dp8 = top3.getDp()) == null) ? constraintLayout3.getPaddingTop() : (int) ExtensionsKt.getDpToPx(dp8.doubleValue());
                    StyleElements.Size right3 = paddingValue.getRight();
                    if (right3 == null || (dp7 = right3.getDp()) == null) {
                        c4 = 3;
                        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                        paddingRight = constraintLayout3.getPaddingRight();
                    } else {
                        c4 = 3;
                        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                        paddingRight = (int) ExtensionsKt.getDpToPx(dp7.doubleValue());
                    }
                    StyleElements.Size bottom3 = paddingValue.getBottom();
                    constraintLayout3.setPadding(paddingLeft, paddingTop, paddingRight, (bottom3 == null || (dp6 = bottom3.getDp()) == null) ? constraintLayout3.getPaddingBottom() : (int) ExtensionsKt.getDpToPx(dp6.doubleValue()));
                    c = c4;
                } else {
                    c = 3;
                    str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                StyleElements.SizeSet borderWidthValue2 = horizontalStackComponentStyle.getBorderWidthValue();
                if (borderWidthValue2 == null || (top2 = borderWidthValue2.getTop()) == null || (obj2 = top2.getDp()) == null) {
                    obj2 = r7;
                }
                StyleElements.SizeSet borderWidthValue3 = horizontalStackComponentStyle.getBorderWidthValue();
                if (borderWidthValue3 == null || (bottom2 = borderWidthValue3.getBottom()) == null || (obj3 = bottom2.getDp()) == null) {
                    obj3 = r7;
                }
                StyleElements.SizeSet borderWidthValue4 = horizontalStackComponentStyle.getBorderWidthValue();
                if (borderWidthValue4 == null || (left2 = borderWidthValue4.getLeft()) == null || (obj4 = left2.getDp()) == null) {
                    obj4 = r7;
                }
                StyleElements.SizeSet borderWidthValue5 = horizontalStackComponentStyle.getBorderWidthValue();
                if (borderWidthValue5 == null || (right2 = borderWidthValue5.getRight()) == null || (obj5 = right2.getDp()) == null) {
                    obj5 = r7;
                }
                Iterator it = CollectionsKt__CollectionsKt.listOf(obj2, obj3, obj4, obj5).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        double ceil = Math.ceil(ExtensionsKt.getDpToPx(((Number) next).doubleValue()));
                        char c6 = 6;
                        while (true) {
                            Object next2 = it.next();
                            c2 = c6;
                            c3 = c5;
                            double ceil2 = Math.ceil(ExtensionsKt.getDpToPx(((Number) next2).doubleValue()));
                            if (Double.compare(ceil, ceil2) < 0) {
                                ceil = ceil2;
                                next = next2;
                            }
                            if (!it.hasNext()) {
                                intValue = ((Number) (next != null ? next : 0)).intValue();
                                Integer baseBorderColorValue = horizontalStackComponentStyle.getBaseBorderColorValue();
                                gradientDrawable.setStroke(intValue, baseBorderColorValue == null ? baseBorderColorValue.intValue() : 0);
                                borderRadiusValue = horizontalStackComponentStyle.getBorderRadiusValue();
                                if (borderRadiusValue != null && (dp5 = borderRadiusValue.getDp()) != null) {
                                    float dpToPx2 = (float) ExtensionsKt.getDpToPx(dp5.doubleValue());
                                    Drawable mutate = gradientDrawable.mutate();
                                    mutate.getClass();
                                    float[] fArr = new float[8];
                                    fArr[0] = dpToPx2;
                                    fArr[1] = dpToPx2;
                                    fArr[c3] = dpToPx2;
                                    fArr[c] = dpToPx2;
                                    fArr[4] = dpToPx2;
                                    fArr[5] = dpToPx2;
                                    fArr[c2] = dpToPx2;
                                    fArr[7] = dpToPx2;
                                    ((GradientDrawable) mutate).setCornerRadii(fArr);
                                }
                                baseBackgroundColorValue = horizontalStackComponentStyle.getBaseBackgroundColorValue();
                                if (baseBackgroundColorValue != null) {
                                    gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
                                }
                                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
                                StyleElements.SizeSet borderWidthValue6 = horizontalStackComponentStyle.getBorderWidthValue();
                                int ceil3 = (borderWidthValue6 != null || (top = borderWidthValue6.getTop()) == null || (dp4 = top.getDp()) == null) ? intValue : intValue - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp4.doubleValue())));
                                StyleElements.SizeSet borderWidthValue7 = horizontalStackComponentStyle.getBorderWidthValue();
                                int ceil4 = (borderWidthValue7 != null || (bottom = borderWidthValue7.getBottom()) == null || (dp3 = bottom.getDp()) == null) ? intValue : intValue - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp3.doubleValue())));
                                StyleElements.SizeSet borderWidthValue8 = horizontalStackComponentStyle.getBorderWidthValue();
                                int ceil5 = (borderWidthValue8 != null || (left = borderWidthValue8.getLeft()) == null || (dp2 = left.getDp()) == null) ? intValue : intValue - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp2.doubleValue())));
                                borderWidthValue = horizontalStackComponentStyle.getBorderWidthValue();
                                if (borderWidthValue != null && (right = borderWidthValue.getRight()) != null && (dp = right.getDp()) != null) {
                                    intValue -= (int) Math.ceil(ExtensionsKt.getDpToPx(dp.doubleValue()));
                                }
                                layerDrawable.setLayerInset(0, -ceil5, -ceil3, -intValue, -ceil4);
                                constraintLayout3.setBackground(layerDrawable);
                                widthValue = horizontalStackComponentStyle.getWidthValue();
                                if (widthValue != null) {
                                    int dpToPx3 = (int) ExtensionsKt.getDpToPx(widthValue.doubleValue());
                                    ViewGroup.LayoutParams layoutParams7 = constraintLayout3.getLayoutParams();
                                    if (layoutParams7 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2(str);
                                        break;
                                    } else {
                                        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                                        layoutParams8.endToEnd = -1;
                                        ((ViewGroup.MarginLayoutParams) layoutParams8).width = dpToPx3;
                                        constraintLayout3.setLayoutParams(layoutParams8);
                                    }
                                }
                                break;
                            } else {
                                c6 = c2;
                                c5 = c3;
                            }
                        }
                    } else {
                        c3 = 2;
                    }
                } else {
                    c3 = 2;
                    next = null;
                }
                c2 = 6;
                intValue = ((Number) (next != null ? next : 0)).intValue();
                Integer baseBorderColorValue2 = horizontalStackComponentStyle.getBaseBorderColorValue();
                gradientDrawable.setStroke(intValue, baseBorderColorValue2 == null ? baseBorderColorValue2.intValue() : 0);
                borderRadiusValue = horizontalStackComponentStyle.getBorderRadiusValue();
                if (borderRadiusValue != null) {
                    float dpToPx22 = (float) ExtensionsKt.getDpToPx(dp5.doubleValue());
                    Drawable mutate2 = gradientDrawable.mutate();
                    mutate2.getClass();
                    float[] fArr2 = new float[8];
                    fArr2[0] = dpToPx22;
                    fArr2[1] = dpToPx22;
                    fArr2[c3] = dpToPx22;
                    fArr2[c] = dpToPx22;
                    fArr2[4] = dpToPx22;
                    fArr2[5] = dpToPx22;
                    fArr2[c2] = dpToPx22;
                    fArr2[7] = dpToPx22;
                    ((GradientDrawable) mutate2).setCornerRadii(fArr2);
                }
                baseBackgroundColorValue = horizontalStackComponentStyle.getBaseBackgroundColorValue();
                if (baseBackgroundColorValue != null) {
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable});
                StyleElements.SizeSet borderWidthValue62 = horizontalStackComponentStyle.getBorderWidthValue();
                if (borderWidthValue62 != null) {
                }
                StyleElements.SizeSet borderWidthValue72 = horizontalStackComponentStyle.getBorderWidthValue();
                if (borderWidthValue72 != null) {
                }
                StyleElements.SizeSet borderWidthValue82 = horizontalStackComponentStyle.getBorderWidthValue();
                if (borderWidthValue82 != null) {
                }
                borderWidthValue = horizontalStackComponentStyle.getBorderWidthValue();
                if (borderWidthValue != null) {
                    intValue -= (int) Math.ceil(ExtensionsKt.getDpToPx(dp.doubleValue()));
                }
                layerDrawable2.setLayerInset(0, -ceil5, -ceil3, -intValue, -ceil4);
                constraintLayout3.setBackground(layerDrawable2);
                widthValue = horizontalStackComponentStyle.getWidthValue();
                if (widthValue != null) {
                }
                break;
            case 23:
                ImageView imageView2 = (ImageView) ((o) obj7).c;
                CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle styles2 = ((CombinedStepImagePreview) obj6).getStyles();
                if (styles2 != null && (marginValue = styles2.getMarginValue()) != null) {
                    ViewUtilsKt.setMargins(imageView2, marginValue);
                }
                ViewUtilsKt.applyWidth(imageView2, styles2 != null ? styles2.getWidthValue() : null);
                ViewUtilsKt.applyHeight(imageView2, styles2 != null ? styles2.getHeightValue() : null);
                ViewGroup.LayoutParams layoutParams9 = imageView2.getLayoutParams();
                if (styles2 != null && (justify = styles2.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams9 instanceof ConstraintLayout.LayoutParams)) {
                    ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                    int i8 = ImageStylingKt.WhenMappings.$EnumSwitchMapping$0[base2.ordinal()];
                    if (i8 == 1) {
                        f = RecyclerView.DECELERATION_RATE;
                    } else if (i8 == 2) {
                        f = 0.5f;
                    } else if (i8 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        f = 1.0f;
                    }
                    layoutParams10.horizontalBias = f;
                }
                imageView2.setLayoutParams(layoutParams9);
                break;
            case 24:
                InputAddress inputAddress = (InputAddress) obj7;
                Pi2UiAddressFieldBinding pi2UiAddressFieldBinding = (Pi2UiAddressFieldBinding) obj6;
                InputAddress.AddressComponentStyle styles3 = inputAddress.getStyles();
                if (styles3 != null && (expandComponentsButtonStyle = styles3.getExpandComponentsButtonStyle()) != null) {
                    TextStylingKt.style(pi2UiAddressFieldBinding.addressExpandComponentsButton, expandComponentsButtonStyle, EmptySet.INSTANCE);
                }
                InputAddress.AddressComponentStyle styles4 = inputAddress.getStyles();
                if (styles4 != null && (inputTextStyle = styles4.getInputTextStyle()) != null) {
                    TextStylingKt.style(pi2UiAddressFieldBinding.addressLabel, inputTextStyle.getLabelTextBasedStyle(), EmptySet.INSTANCE);
                    TextInputLayoutStylingKt.style(pi2UiAddressFieldBinding.addressFieldCollapsed, inputTextStyle);
                    TextInputLayoutStylingKt.style(pi2UiAddressFieldBinding.addressFieldExpanded, inputTextStyle);
                    TextInputLayoutStylingKt.style(pi2UiAddressFieldBinding.addressSuite, inputTextStyle);
                    TextInputLayoutStylingKt.style(pi2UiAddressFieldBinding.addressCity, inputTextStyle);
                    TextInputLayoutStylingKt.style(pi2UiAddressFieldBinding.addressSubdivision, inputTextStyle);
                    TextInputLayoutStylingKt.style(pi2UiAddressFieldBinding.addressPostalCode, inputTextStyle);
                }
                break;
            case 25:
                InputCheckbox inputCheckbox = (InputCheckbox) obj7;
                Pi2UiInputCheckboxBinding pi2UiInputCheckboxBinding = (Pi2UiInputCheckboxBinding) obj6;
                TextView textView2 = pi2UiInputCheckboxBinding.checkboxDescription;
                TextView textView3 = pi2UiInputCheckboxBinding.checkboxLabel;
                InputCheckbox.InputCheckboxComponentStyle styles5 = inputCheckbox.getStyles();
                if (styles5 != null && (textBasedStyle = styles5.getTextBasedStyle()) != null) {
                    TextStylingKt.style(textView3, textBasedStyle, EmptySet.INSTANCE);
                }
                InputCheckbox.InputCheckboxComponentStyle styles6 = inputCheckbox.getStyles();
                if (styles6 != null && (descriptionTextStyle = styles6.getDescriptionTextStyle()) != null) {
                    TextStylingKt.style(textView2, descriptionTextStyle, EmptySet.INSTANCE);
                }
                InputCheckbox.InputCheckboxComponentStyle styles7 = inputCheckbox.getStyles();
                if (styles7 != null && (errorTextStyle = styles7.getErrorTextStyle()) != null) {
                    TextStylingKt.style(pi2UiInputCheckboxBinding.checkboxError, errorTextStyle, EmptySet.INSTANCE);
                }
                ViewGroup.LayoutParams layoutParams11 = textView3.getLayoutParams();
                if (layoutParams11 == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    break;
                } else {
                    ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
                    int calculateLines = zzj.calculateLines(textView2) + zzj.calculateLines(textView3);
                    if (calculateLines != 0) {
                        if (calculateLines != 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) ExtensionsKt.getDpToPx(4.0d);
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = (int) ExtensionsKt.getDpToPx(0.0d);
                        }
                    }
                    textView3.setLayoutParams(layoutParams12);
                    break;
                }
                break;
            case 26:
                Pi2UiInputCheckboxGroupBinding pi2UiInputCheckboxGroupBinding = (Pi2UiInputCheckboxGroupBinding) obj6;
                InputCheckbox.InputCheckboxComponentStyle styles8 = ((InputCheckboxGroup) obj7).getStyles();
                if (styles8 != null && (textBasedStyle2 = styles8.getTextBasedStyle()) != null) {
                    TextStylingKt.style(pi2UiInputCheckboxGroupBinding.checkboxGroupLabel, textBasedStyle2, EmptySet.INSTANCE);
                }
                break;
            case 27:
                InputConfirmationCode inputConfirmationCode = (InputConfirmationCode) obj6;
                ConstraintLayout constraintLayout4 = (ConstraintLayout) ((o) obj7).a;
                constraintLayout4.getClass();
                FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(SequencesKt___SequencesKt.filter(new ViewGroupKt$children$1(constraintLayout4), InputConfirmationCodeComponentKt$makeView$lambda$6$lambda$5$$inlined$filterIsInstance$1.INSTANCE));
                while (filteringSequence$iterator$1.hasNext()) {
                    TextInputLayout textInputLayout = (TextInputLayout) filteringSequence$iterator$1.next();
                    InputTextBasedComponentStyle styles9 = inputConfirmationCode.getStyles();
                    if (styles9 != null) {
                        TextInputLayoutStylingKt.style(textInputLayout, styles9);
                    }
                }
                break;
            case 28:
                Pi2UiInputNumberBinding pi2UiInputNumberBinding = (Pi2UiInputNumberBinding) obj6;
                InputTextBasedComponentStyle styles10 = ((InputCurrency) obj7).getStyles();
                if (styles10 != null) {
                    TextInputLayout textInputLayout2 = (TextInputLayout) pi2UiInputNumberBinding.inputLayout;
                    textInputLayout2.getClass();
                    TextInputLayoutStylingKt.style(textInputLayout2, styles10);
                }
                break;
            default:
                InputDate.InputDateComponentStyle inputDateComponentStyle = (InputDate.InputDateComponentStyle) obj7;
                Pi2UiDateFieldBinding pi2UiDateFieldBinding = (Pi2UiDateFieldBinding) obj6;
                if (inputDateComponentStyle != null && (margin = inputDateComponentStyle.getMargin()) != null && (base3 = margin.getBase()) != null && (base4 = base3.getBase()) != null) {
                    ConstraintLayout constraintLayout5 = pi2UiDateFieldBinding.rootView;
                    constraintLayout5.getClass();
                    ViewUtilsKt.setMargins(constraintLayout5, base4);
                }
                if (inputDateComponentStyle != null && (inputSelectStyle3 = inputDateComponentStyle.getInputSelectStyle()) != null && (labelStyle = inputSelectStyle3.getLabelStyle()) != null) {
                    TextStylingKt.style(pi2UiDateFieldBinding.dateLabel, labelStyle, EmptySet.INSTANCE);
                }
                if (inputDateComponentStyle != null && (inputSelectStyle2 = inputDateComponentStyle.getInputSelectStyle()) != null && (errorTextStyle2 = inputSelectStyle2.getErrorTextStyle()) != null) {
                    TextStylingKt.style(pi2UiDateFieldBinding.errorLabel, errorTextStyle2, EmptySet.INSTANCE);
                }
                if (inputDateComponentStyle != null && (inputSelectStyle = inputDateComponentStyle.getInputSelectStyle()) != null) {
                    InputSelectStylingKt.style(pi2UiDateFieldBinding.month, inputSelectStyle);
                }
                if (inputDateComponentStyle != null && (inputTextStyle3 = inputDateComponentStyle.getInputTextStyle()) != null) {
                    TextInputLayoutStylingKt.style(pi2UiDateFieldBinding.day, inputTextStyle3);
                }
                if (inputDateComponentStyle != null && (inputTextStyle2 = inputDateComponentStyle.getInputTextStyle()) != null) {
                    TextInputLayoutStylingKt.style(pi2UiDateFieldBinding.year, inputTextStyle2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StateFlowsKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj2;
        this.f$1 = obj3;
    }
}
