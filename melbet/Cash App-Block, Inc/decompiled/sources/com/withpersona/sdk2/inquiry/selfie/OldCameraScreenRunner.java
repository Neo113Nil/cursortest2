package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.math.MathUtils;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.squareup.cash.R;
import com.squareup.cash.tax.views.databinding.TaxWebAppLayoutBinding;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda12;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.RecordingInterrupted;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes9.dex */
public final class OldCameraScreenRunner implements LayoutRunner {
    public final Pi2OldSelfieCameraBinding binding;
    public final CameraController cameraController;
    public StandaloneCoroutine cameraStateListenerJob;
    public final int confirmConst;
    public Function1 currentErrorHandler;
    public StandaloneCoroutine maxRecordingLimitJob;
    public Function0 permissionChangedHandler;
    public final SelfieDirectionFeed selfieDirectionFeed;
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ LayoutRunner this$0;

        public /* synthetic */ AnonymousClass1(LayoutRunner layoutRunner, int i) {
            this.$r8$classId = i;
            this.this$0 = layoutRunner;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            int i = this.$r8$classId;
            LayoutRunner layoutRunner = this.this$0;
            switch (i) {
                case 0:
                    OldCameraScreenRunner oldCameraScreenRunner = (OldCameraScreenRunner) layoutRunner;
                    oldCameraScreenRunner.binding.rootView.post(new Task$$ExternalSyntheticLambda0(oldCameraScreenRunner, 11));
                    break;
                default:
                    CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) layoutRunner;
                    ((BasicGovIdCaptureViewController) cameraScreenRunner.viewController).getRoot().post(new Task$$ExternalSyntheticLambda0(cameraScreenRunner, 7));
                    break;
            }
        }
    }

    public OldCameraScreenRunner(Pi2OldSelfieCameraBinding pi2OldSelfieCameraBinding, CameraController cameraController, SelfieDirectionFeed selfieDirectionFeed, TrackingEventsLogger trackingEventsLogger) {
        selfieDirectionFeed.getClass();
        trackingEventsLogger.getClass();
        this.binding = pi2OldSelfieCameraBinding;
        this.cameraController = cameraController;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        pi2OldSelfieCameraBinding.selfieWindow.setPreviewView(cameraController.getPreviewView());
        ConstraintLayout constraintLayout = pi2OldSelfieCameraBinding.rootView;
        constraintLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout, 15);
        Context context = constraintLayout.getContext();
        context.getClass();
        ContextUtilsKt.requireLifecycleOwner(context).getLifecycle().addObserver(new AnonymousClass1(this, 0));
        registerCameraStateListener$1();
        this.confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    public static OldSelfieOverlayView.ViewState toViewState(SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay) {
        switch (overlay.ordinal()) {
            case 0:
                return OldSelfieOverlayView.ViewState.CLEAR;
            case 1:
                return OldSelfieOverlayView.ViewState.CENTER;
            case 2:
                return OldSelfieOverlayView.ViewState.CENTER_COMPLETE;
            case 3:
                return OldSelfieOverlayView.ViewState.LOOK_LEFT_HINT;
            case 4:
                return OldSelfieOverlayView.ViewState.LOOK_LEFT;
            case 5:
                return OldSelfieOverlayView.ViewState.LOOK_LEFT_COMPLETE;
            case 6:
                return OldSelfieOverlayView.ViewState.LOOK_RIGHT_HINT;
            case 7:
                return OldSelfieOverlayView.ViewState.LOOK_RIGHT;
            case 8:
                return OldSelfieOverlayView.ViewState.LOOK_RIGHT_COMPLETE;
            case 9:
                return OldSelfieOverlayView.ViewState.FINALIZING;
            case 10:
                return OldSelfieOverlayView.ViewState.COMPLETE_WITH_CAPTURE;
            case 11:
                return OldSelfieOverlayView.ViewState.COMPLETE;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public final void registerCameraStateListener$1() {
        StandaloneCoroutine standaloneCoroutine = this.cameraStateListenerJob;
        Continuation continuation = null;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        Context context = this.binding.rootView.getContext();
        context.getClass();
        this.cameraStateListenerJob = JobKt.launch$default(ViewModelKt.getCoroutineScope(ContextUtilsKt.requireLifecycleOwner(context).getLifecycle()), null, null, new HazeSourceNode$launchPreDraw$1(this, continuation, 21), 3);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen, ViewEnvironment viewEnvironment) {
        TextView textView;
        int i;
        final SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen2;
        TextView textView2;
        String str;
        final int i2;
        Function1 function1;
        Pi2OldSelfieCameraBinding pi2OldSelfieCameraBinding = this.binding;
        Pi2NavigationBar pi2NavigationBar = pi2OldSelfieCameraBinding.navigationBar;
        Button button = pi2OldSelfieCameraBinding.button;
        View view = pi2OldSelfieCameraBinding.cameraCover;
        TextView textView3 = pi2OldSelfieCameraBinding.hintMessage;
        TextView textView4 = pi2OldSelfieCameraBinding.title;
        ConstraintLayout constraintLayout = pi2OldSelfieCameraBinding.rootView;
        OldSelfieOverlayView oldSelfieOverlayView = pi2OldSelfieCameraBinding.selfieWindow;
        oldCameraScreen.getClass();
        viewEnvironment.getClass();
        boolean z = oldCameraScreen.recordingLocallyRequired;
        String str2 = oldCameraScreen.watermarkText;
        SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides assetOverrides = oldCameraScreen.assetOverrides;
        MathUtils mathUtils = oldCameraScreen.mode;
        CameraController cameraController = this.cameraController;
        if (z && !cameraController.isRecordingLocally() && (function1 = this.currentErrorHandler) != null) {
            function1.invoke(new RecordingInterrupted(false));
        }
        this.currentErrorHandler = oldCameraScreen.onCameraError;
        this.permissionChangedHandler = oldCameraScreen.onPermissionChanged;
        cameraController.prepare();
        cameraController.getPreviewView().setVisibility(0);
        boolean z2 = mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$WaitingOnWebRtcSetup;
        if (z2 || (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        this.selfieDirectionFeed.selfieProcessor.minFaceRatio = oldCameraScreen.requireStrictSelfieCapture ? 0.45d : 0.35d;
        ProgressBar progressBar = pi2OldSelfieCameraBinding.initializingProgressBar;
        TextView textView5 = pi2OldSelfieCameraBinding.watermark;
        TextView textView6 = pi2OldSelfieCameraBinding.countdown;
        Context context = constraintLayout.getContext();
        context.getClass();
        LifecycleCoroutineScopeImpl coroutineScope = ViewModelKt.getCoroutineScope(ContextUtilsKt.requireLifecycleOwner(context).getLifecycle());
        String str3 = oldCameraScreen.title;
        if (str3 == null) {
            str3 = "";
        }
        textView4.setText(str3);
        CharSequence text = textView4.getText();
        text.getClass();
        textView4.setVisibility(text.length() == 0 ? 8 : 0);
        String str4 = oldCameraScreen.message;
        if (str4 == null) {
            str4 = "";
        }
        if (!str4.equals(textView3.getText())) {
            textView3.setText(str4);
        }
        oldSelfieOverlayView.setLeftPoseImage(assetOverrides.leftPoseImage);
        oldSelfieOverlayView.setRightPoseImage(assetOverrides.rightPoseImage);
        int ordinal = mathUtils.getOverlay().ordinal();
        if (ordinal == 0) {
            textView3.announceForAccessibility(textView3.getContext().getString(R.string.pi2_selfie_talkback_center_pose_hint));
        } else if (ordinal == 3) {
            textView3.announceForAccessibility(textView3.getContext().getString(R.string.pi2_selfie_talkback_left_pose_hint));
        } else if (ordinal == 6) {
            textView3.announceForAccessibility(textView3.getContext().getString(R.string.pi2_selfie_talkback_right_pose_hint));
        } else if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture) {
            textView3.announceForAccessibility(textView3.getContext().getString(R.string.pi2_selfie_talkback_hold_still_hint));
        }
        button.setEnabled(true);
        boolean z3 = mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown;
        if (!z3) {
            textView6.setVisibility(8);
        }
        if (!z2) {
            progressBar.setVisibility(8);
        }
        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) {
            button.setVisibility(4);
            JobKt.launch$default(coroutineScope, Dispatchers.Default, null, new OldCameraScreenRunner$showRendering$1$1(this, mathUtils, coroutineScope, (Continuation) null), 2);
            OldSelfieOverlayView.setState$default(oldSelfieOverlayView, toViewState(SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR), ((SelfieWorkflow$Screen$OldCameraScreen$Mode$PreviewUnavailable) mathUtils).showProgress, null, 4, null);
            oldCameraScreen2 = oldCameraScreen;
            textView2 = textView3;
            str = str2;
            i2 = 1;
            textView = textView5;
        } else {
            if (z2) {
                progressBar.setVisibility(0);
                button.setVisibility(4);
                StandaloneCoroutine standaloneCoroutine = this.maxRecordingLimitJob;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                this.maxRecordingLimitJob = JobKt.launch$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new OldCameraScreenRunner$showRendering$1$2(mathUtils, this, null), 2);
            } else if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint) {
                button.setVisibility(4);
                SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint selfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint = (SelfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint) mathUtils;
                oldSelfieOverlayView.setState(toViewState(selfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$PlayPoseHint.showProgress, new OldCameraScreenRunner$$ExternalSyntheticLambda0(mathUtils, 0));
            } else {
                if (z3) {
                    button.setVisibility(4);
                    Object tag = textView6.getTag();
                    SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown = (SelfieWorkflow$Screen$OldCameraScreen$Mode$CountDown) mathUtils;
                    int i3 = selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown.countDown;
                    if (!Intrinsics.areEqual(tag, Integer.valueOf(i3))) {
                        int i4 = 4 - i3;
                        if (i4 < 1) {
                            i4 = 1;
                        }
                        float f = i4 * 1.5f;
                        textView6.setVisibility(0);
                        textView6.animate().setDuration(500L).scaleX(f).scaleY(f).alpha(RecyclerView.DECELERATION_RATE).withEndAction(new OldCameraScreenRunner$$ExternalSyntheticLambda6(textView6, 0));
                        textView6.setText(String.valueOf(i3));
                        textView6.setTag(Integer.valueOf(i3));
                    }
                    textView = textView5;
                    OldSelfieOverlayView.setState$default(oldSelfieOverlayView, toViewState(selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$CountDown.showProgress, null, 4, null);
                } else {
                    textView = textView5;
                    if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition) {
                        StandaloneCoroutine standaloneCoroutine2 = this.maxRecordingLimitJob;
                        if (standaloneCoroutine2 != null) {
                            standaloneCoroutine2.cancel(null);
                        }
                        button.setEnabled(false);
                        SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition selfieWorkflow$Screen$OldCameraScreen$Mode$Transition = (SelfieWorkflow$Screen$OldCameraScreen$Mode$Transition) mathUtils;
                        oldSelfieOverlayView.setState(toViewState(selfieWorkflow$Screen$OldCameraScreen$Mode$Transition.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$Transition.showProgress, selfieWorkflow$Screen$OldCameraScreen$Mode$Transition.onComplete);
                        if (selfieWorkflow$Screen$OldCameraScreen$Mode$Transition.imageCaptured) {
                            constraintLayout.setHapticFeedbackEnabled(true);
                            constraintLayout.performHapticFeedback(this.confirmConst, 2);
                            oldCameraScreen2 = oldCameraScreen;
                            textView2 = textView3;
                            str = str2;
                            i2 = 1;
                        }
                    } else {
                        if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture) {
                            button.setVisibility(0);
                            button.setOnClickListener(new ScannerView$$ExternalSyntheticLambda12(pi2OldSelfieCameraBinding, coroutineScope, this, mathUtils, 6));
                            SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture = (SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture) mathUtils;
                            if (selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture.forceCapture) {
                                button.setVisibility(4);
                                button.setEnabled(false);
                                TaxWebAppLayoutBinding taxWebAppLayoutBinding = oldSelfieOverlayView.binding;
                                Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton;
                                if (pi2CircleMaskView.getScaleX() == 5.0f && pi2CircleMaskView.getScaleY() == 5.0f) {
                                    Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, new UiScreenRunner$$ExternalSyntheticLambda29(11, coroutineScope, this, mathUtils), 1);
                                } else {
                                    DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                                    JobKt.launch$default(coroutineScope, MainDispatcherLoader.dispatcher, null, new TransitionWorker$run$1(this, mathUtils, null, 20), 2);
                                }
                            }
                            i = 1;
                            OldSelfieOverlayView.setState$default(oldSelfieOverlayView, toViewState(selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCapture.showProgress, null, 4, null);
                        } else {
                            i = 1;
                            if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown) {
                                button.setVisibility(0);
                                button.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(7, pi2OldSelfieCameraBinding, mathUtils));
                                SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown = (SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown) mathUtils;
                                OldSelfieOverlayView.setState$default(oldSelfieOverlayView, toViewState(selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown.showProgress, null, 4, null);
                            } else if (mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture) {
                                button.setVisibility(4);
                                SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture = (SelfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture) mathUtils;
                                OldSelfieOverlayView.setState$default(oldSelfieOverlayView, toViewState(selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$AutoCapture.showProgress, null, 4, null);
                            } else {
                                if (!(mathUtils instanceof SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                button.setVisibility(4);
                                SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture = (SelfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture) mathUtils;
                                if (selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture.startFinalize) {
                                    StandaloneCoroutine standaloneCoroutine3 = this.maxRecordingLimitJob;
                                    Continuation continuation = null;
                                    if (standaloneCoroutine3 != null) {
                                        standaloneCoroutine3.cancel(null);
                                    }
                                    DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                                    oldCameraScreen2 = oldCameraScreen;
                                    textView2 = textView3;
                                    str = str2;
                                    i2 = 1;
                                    JobKt.launch$default(coroutineScope, MainDispatcherLoader.dispatcher, null, new Logger$log$1(this, mathUtils, oldCameraScreen2, continuation, 21), 2);
                                } else {
                                    oldCameraScreen2 = oldCameraScreen;
                                    textView2 = textView3;
                                    str = str2;
                                    i2 = 1;
                                }
                                oldSelfieOverlayView.setState(toViewState(selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture.overlay), selfieWorkflow$Screen$OldCameraScreen$Mode$FinalizeLocalVideoCapture.showProgress, new OldCameraScreenRunner$$ExternalSyntheticLambda0(mathUtils, i2));
                            }
                        }
                        oldCameraScreen2 = oldCameraScreen;
                        textView2 = textView3;
                        str = str2;
                        i2 = i;
                    }
                }
                oldCameraScreen2 = oldCameraScreen;
                textView2 = textView3;
                str = str2;
                i2 = 1;
            }
            oldCameraScreen2 = oldCameraScreen;
            textView2 = textView3;
            textView = textView5;
            str = str2;
            i2 = 1;
        }
        NavigationState navigationState = oldCameraScreen2.navigationState;
        final int i5 = 0;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i5;
                SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen3 = oldCameraScreen2;
                switch (i6) {
                    case 0:
                        oldCameraScreen3.onBack.invoke();
                        break;
                    default:
                        oldCameraScreen3.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i2;
                SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen3 = oldCameraScreen2;
                switch (i6) {
                    case 0:
                        oldCameraScreen3.onBack.invoke();
                        break;
                    default:
                        oldCameraScreen3.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        constraintLayout.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, constraintLayout);
        if (str == null || StringsKt.isBlank(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        StepStyles.SelfieStepStyle selfieStepStyle = oldCameraScreen2.styles;
        if (selfieStepStyle != null) {
            TextBasedComponentStyle titleStyleValue = selfieStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                TextStylingKt.style(textView4, titleStyleValue, EmptySet.INSTANCE);
                textView4.setTextColor(-1);
            }
            TextBasedComponentStyle selfieCaptureHintTextStyle = selfieStepStyle.getSelfieCaptureHintTextStyle();
            if (selfieCaptureHintTextStyle != null) {
                TextView textView7 = textView2;
                TextStylingKt.style(textView7, selfieCaptureHintTextStyle, EmptySet.INSTANCE);
                textView7.setTextColor(-1);
            }
            Integer capturePageHeaderIconColorValue = selfieStepStyle.getCapturePageHeaderIconColorValue();
            if (capturePageHeaderIconColorValue != null) {
                pi2NavigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
            }
            int color = constraintLayout.getContext().getColor(R.color.blackScreenStatusBarColor);
            TaxWebAppLayoutBinding taxWebAppLayoutBinding2 = oldSelfieOverlayView.binding;
            Integer selfieCaptureFeedBoxBorderColorValue = selfieStepStyle.getSelfieCaptureFeedBoxBorderColorValue();
            if (selfieCaptureFeedBoxBorderColorValue != null) {
                ((Pi2ProgressArcView) taxWebAppLayoutBinding2.taxWebAppToolbar).setStrokeColor(selfieCaptureFeedBoxBorderColorValue.intValue());
            }
            Double selfieCaptureFeedBoxBorderWidthValue = selfieStepStyle.getSelfieCaptureFeedBoxBorderWidthValue();
            if (selfieCaptureFeedBoxBorderWidthValue != null) {
                ((Pi2ProgressArcView) taxWebAppLayoutBinding2.taxWebAppToolbar).setStrokeWidth((float) ExtensionsKt.getDpToPx(selfieCaptureFeedBoxBorderWidthValue.doubleValue()));
            }
            Integer selfieCaptureIconStrokeColor = selfieStepStyle.getSelfieCaptureIconStrokeColor();
            if (selfieCaptureIconStrokeColor != null) {
                int intValue = selfieCaptureIconStrokeColor.intValue();
                ((ThemeableLottieAnimationView) taxWebAppLayoutBinding2.taxWebAppErrorText).addColorReplacement(Color.parseColor("#022050"), intValue);
                ((ThemeableLottieAnimationView) taxWebAppLayoutBinding2.taxWebAppErrorText).addColorReplacement(Color.parseColor("#280087"), intValue);
            }
            Integer captureCompleteIconStrokeColor = selfieStepStyle.getCaptureCompleteIconStrokeColor();
            if (captureCompleteIconStrokeColor != null) {
                ((ThemeableLottieAnimationView) taxWebAppLayoutBinding2.taxWebAppErrorText).addColorReplacement(Color.parseColor("#3BC170"), captureCompleteIconStrokeColor.intValue());
            }
            Integer selfieCaptureIconFillColor = selfieStepStyle.getSelfieCaptureIconFillColor();
            if (selfieCaptureIconFillColor != null) {
                int intValue2 = selfieCaptureIconFillColor.intValue();
                ((ThemeableLottieAnimationView) taxWebAppLayoutBinding2.taxWebAppErrorText).addColorReplacement(Color.parseColor("#AA85FF"), intValue2);
                ((ThemeableLottieAnimationView) taxWebAppLayoutBinding2.taxWebAppErrorText).addColorReplacement(Color.parseColor("#8552FF"), intValue2);
            }
            Integer selfieCaptureIconBackgroundFillColor = selfieStepStyle.getSelfieCaptureIconBackgroundFillColor();
            if (selfieCaptureIconBackgroundFillColor != null) {
                ((ThemeableLottieAnimationView) taxWebAppLayoutBinding2.taxWebAppErrorText).addColorReplacement(Color.parseColor("#DBCCFF"), selfieCaptureIconBackgroundFillColor.intValue());
            }
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            zzat.updateSystemUiColor(viewEnvironment, context2, color);
        }
    }
}
