package com.withpersona.sdk2.inquiry.governmentid.cameraScreen;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.camera2.Camera2UtilsKt;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.camera2.CameraDirection;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.TipsFeatureFlag;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsBottomSheetController;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsView;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import net.idrnd.face.iad.capture.internal.o0;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes9.dex */
public final class BasicGovIdCaptureViewController implements GovIdCaptureViewController {
    public static final int confirmConst;
    public AnimationState animationState;
    public final Pi2GovernmentidCameraBinding binding;
    public final CameraController cameraController;
    public final CaptureTipsBottomSheetController captureTipsBottomSheetController;
    public int currentHintAnimation;
    public View currentOverlayAssetView;
    public View customOverlayView;
    public IdConfig.Side lastCaptureSide;
    public Integer lockedOverlayGuideHeight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AnimationState {
        public static final /* synthetic */ AnimationState[] $VALUES;
        public static final AnimationState ENTRY_ANIMATING;
        public static final AnimationState IDLE;
        public static final AnimationState INITIAL;
        public static final AnimationState TRANSITION_COLLAPSING;
        public static final AnimationState TRANSITION_EXPANDING;

        static {
            AnimationState animationState = new AnimationState("INITIAL", 0);
            INITIAL = animationState;
            AnimationState animationState2 = new AnimationState("ENTRY_ANIMATING", 1);
            ENTRY_ANIMATING = animationState2;
            AnimationState animationState3 = new AnimationState("IDLE", 2);
            IDLE = animationState3;
            AnimationState animationState4 = new AnimationState("TRANSITION_COLLAPSING", 3);
            TRANSITION_COLLAPSING = animationState4;
            AnimationState animationState5 = new AnimationState("TRANSITION_EXPANDING", 4);
            TRANSITION_EXPANDING = animationState5;
            $VALUES = new AnimationState[]{animationState, animationState2, animationState3, animationState4, animationState5};
        }

        public static AnimationState valueOf(String str) {
            return (AnimationState) Enum.valueOf(AnimationState.class, str);
        }

        public static AnimationState[] values() {
            return (AnimationState[]) $VALUES.clone();
        }
    }

    static {
        confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e8, code lost:
    
        if (r3 == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BasicGovIdCaptureViewController(GovernmentIdFeed governmentIdFeed, CameraPreview cameraPreview, FeatureFlagManager featureFlagManager, Screen.CameraScreen cameraScreen, Context context, ViewGroup viewGroup) {
        CameraController create;
        Context context2;
        governmentIdFeed.getClass();
        cameraPreview.getClass();
        featureFlagManager.getClass();
        cameraScreen.getClass();
        VideoCaptureMethod videoCaptureMethod = cameraScreen.videoCaptureMethod;
        context.getClass();
        this.animationState = AnimationState.INITIAL;
        View inflate = LayoutInflater.from((viewGroup == null || (context2 = viewGroup.getContext()) == null) ? context : context2).cloneInContext(context).inflate(R.layout.pi2_governmentid_camera, (ViewGroup) null, false);
        int i = R.id.bottom_spacer;
        if (((Space) ViewBindings.findChildViewById(inflate, R.id.bottom_spacer)) != null) {
            i = R.id.camera2_preview;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) ViewBindings.findChildViewById(inflate, R.id.camera2_preview);
            if (camera2PreviewView != null) {
                i = R.id.camera_initializing_progress_bar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(inflate, R.id.camera_initializing_progress_bar);
                if (progressBar != null) {
                    i = R.id.camera_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.camera_view);
                    if (constraintLayout != null) {
                        i = R.id.capture_button;
                        Button button = (Button) ViewBindings.findChildViewById(inflate, R.id.capture_button);
                        if (button != null) {
                            i = R.id.capture_button_spacer;
                            if (((Space) ViewBindings.findChildViewById(inflate, R.id.capture_button_spacer)) != null) {
                                i = R.id.capture_tips;
                                TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.capture_tips);
                                if (textView != null) {
                                    i = R.id.disclaimer;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.disclaimer);
                                    if (textView2 != null) {
                                        i = R.id.disclaimer_layout;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.disclaimer_layout);
                                        if (linearLayout != null) {
                                            i = R.id.flashlight_toggle;
                                            ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(inflate, R.id.flashlight_toggle);
                                            if (toggleButton != null) {
                                                i = R.id.hint;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.hint);
                                                if (textView3 != null) {
                                                    i = R.id.inner_content_view;
                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.inner_content_view);
                                                    if (frameLayout != null) {
                                                        i = R.id.navigation_bar;
                                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                                                        if (pi2NavigationBar != null) {
                                                            i = R.id.overlay;
                                                            View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.overlay);
                                                            if (findChildViewById != null) {
                                                                i = R.id.overlay_guide;
                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.overlay_guide);
                                                                if (imageView != null) {
                                                                    i = R.id.overlay_hint;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.overlay_hint);
                                                                    if (constraintLayout2 != null) {
                                                                        i = R.id.overlay_icon;
                                                                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.overlay_icon);
                                                                        if (themeableLottieAnimationView != null) {
                                                                            i = R.id.overlay_icon_container;
                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.overlay_icon_container);
                                                                            if (constraintLayout3 != null) {
                                                                                i = R.id.overlay_text;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, R.id.overlay_text);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.preview_bottom;
                                                                                    if (((Barrier) ViewBindings.findChildViewById(inflate, R.id.preview_bottom)) != null) {
                                                                                        i = R.id.preview_container;
                                                                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.preview_container);
                                                                                        if (frameLayout2 != null) {
                                                                                            i = R.id.preview_dim;
                                                                                            View findChildViewById2 = ViewBindings.findChildViewById(inflate, R.id.preview_dim);
                                                                                            if (findChildViewById2 != null) {
                                                                                                i = R.id.preview_top;
                                                                                                if (((Barrier) ViewBindings.findChildViewById(inflate, R.id.preview_top)) != null) {
                                                                                                    i = R.id.preview_view;
                                                                                                    PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(inflate, R.id.preview_view);
                                                                                                    if (previewView != null) {
                                                                                                        i = R.id.progress_bar;
                                                                                                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(inflate, R.id.progress_bar);
                                                                                                        if (progressBar2 != null) {
                                                                                                            i = R.id.scanning_animation;
                                                                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.scanning_animation);
                                                                                                            if (lottieAnimationView != null) {
                                                                                                                i = R.id.scanning_view;
                                                                                                                ScanningView scanningView = (ScanningView) ViewBindings.findChildViewById(inflate, R.id.scanning_view);
                                                                                                                if (scanningView != null) {
                                                                                                                    i = R.id.spotlight_view;
                                                                                                                    SpotlightView spotlightView = (SpotlightView) ViewBindings.findChildViewById(inflate, R.id.spotlight_view);
                                                                                                                    if (spotlightView != null) {
                                                                                                                        i = R.id.static_capture_tips;
                                                                                                                        StaticCaptureTipsView staticCaptureTipsView = (StaticCaptureTipsView) ViewBindings.findChildViewById(inflate, R.id.static_capture_tips);
                                                                                                                        if (staticCaptureTipsView != null) {
                                                                                                                            i = R.id.title;
                                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                                                                                                            if (textView5 != null) {
                                                                                                                                i = R.id.top_spacer;
                                                                                                                                if (((Space) ViewBindings.findChildViewById(inflate, R.id.top_spacer)) != null) {
                                                                                                                                    i = R.id.watermark;
                                                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(inflate, R.id.watermark);
                                                                                                                                    if (textView6 != null) {
                                                                                                                                        FrameLayout frameLayout3 = (FrameLayout) inflate;
                                                                                                                                        Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = new Pi2GovernmentidCameraBinding(frameLayout3, camera2PreviewView, progressBar, constraintLayout, button, textView, textView2, linearLayout, toggleButton, textView3, frameLayout, pi2NavigationBar, findChildViewById, imageView, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView4, frameLayout2, findChildViewById2, previewView, progressBar2, lottieAnimationView, scanningView, spotlightView, staticCaptureTipsView, textView5, textView6);
                                                                                                                                        boolean value = featureFlagManager.getValue(TipsFeatureFlag.INSTANCE$6);
                                                                                                                                        int ordinal = videoCaptureMethod.ordinal();
                                                                                                                                        if (ordinal != 0) {
                                                                                                                                            if (ordinal != 1) {
                                                                                                                                                if (ordinal != 2) {
                                                                                                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            boolean z = videoCaptureMethod == VideoCaptureMethod.Upload;
                                                                                                                                            CameraXController_Factory_Impl cameraXController_Factory_Impl = cameraScreen.cameraXControllerFactory;
                                                                                                                                            PopEncryptorV2_ popEncryptorV2_ = new PopEncryptorV2_();
                                                                                                                                            popEncryptorV2_.encryptionKey = cameraScreen;
                                                                                                                                            popEncryptorV2_.hmacKey = cameraPreview;
                                                                                                                                            popEncryptorV2_.cryptor = previewView;
                                                                                                                                            popEncryptorV2_.authStore = governmentIdFeed;
                                                                                                                                            popEncryptorV2_.isInit = z;
                                                                                                                                            create = cameraXController_Factory_Impl.create(cameraPreview, previewView, popEncryptorV2_, cameraScreen.isAudioRequired);
                                                                                                                                            this.cameraController = create;
                                                                                                                                            this.binding = pi2GovernmentidCameraBinding;
                                                                                                                                            frameLayout3.getClass();
                                                                                                                                            this.captureTipsBottomSheetController = new CaptureTipsBottomSheetController(frameLayout3);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        Context applicationContext = context.getApplicationContext();
                                                                                                                                        applicationContext.getClass();
                                                                                                                                        CameraChoices bestCameraChoices = Camera2UtilsKt.getBestCameraChoices(applicationContext, CameraDirection.BACK);
                                                                                                                                        if (bestCameraChoices == null) {
                                                                                                                                            cameraScreen.onCameraError.invoke(new NoSuitableCameraError());
                                                                                                                                            create = new o0(camera2PreviewView, 11);
                                                                                                                                        } else {
                                                                                                                                            create = cameraScreen.camera2ControllerFactory.create(bestCameraChoices, camera2PreviewView, governmentIdFeed, videoCaptureMethod, cameraScreen.isAudioRequired);
                                                                                                                                        }
                                                                                                                                        this.cameraController = create;
                                                                                                                                        this.binding = pi2GovernmentidCameraBinding;
                                                                                                                                        frameLayout3.getClass();
                                                                                                                                        this.captureTipsBottomSheetController = new CaptureTipsBottomSheetController(frameLayout3);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public static void animateAlphaIfNeeded(final View view, final float f) {
        if (view.getAlpha() == f) {
            if (f <= RecyclerView.DECELERATION_RATE) {
                view.setVisibility(4);
            }
        } else {
            if (view.getVisibility() != 0) {
                if (f <= RecyclerView.DECELERATION_RATE) {
                    return;
                }
                view.setVisibility(0);
                view.setAlpha(RecyclerView.DECELERATION_RATE);
            }
            view.animate().alpha(f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    if (f == RecyclerView.DECELERATION_RATE) {
                        view.setVisibility(4);
                    }
                }
            });
        }
    }

    public final FrameLayout getRoot() {
        FrameLayout frameLayout = this.binding.rootView;
        frameLayout.getClass();
        return frameLayout;
    }

    public final void playExpandAnimation() {
        Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = this.binding;
        pi2GovernmentidCameraBinding.overlayGuide.animate().scaleY(1.0f).translationY(RecyclerView.DECELERATION_RATE).setDuration(200L).withEndAction(new r6$$ExternalSyntheticLambda0(15, pi2GovernmentidCameraBinding, this)).start();
        pi2GovernmentidCameraBinding.overlayHint.animate().translationY(RecyclerView.DECELERATION_RATE).setDuration(200L).start();
        pi2GovernmentidCameraBinding.scanningView.animate().scaleY(1.0f).translationY(RecyclerView.DECELERATION_RATE).setDuration(200L).start();
    }
}
