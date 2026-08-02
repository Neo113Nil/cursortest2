package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.StaticCaptureTipsView;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2GovernmentidCameraBinding implements ViewBinding {
    public final ProgressBar cameraInitializingProgressBar;
    public final ConstraintLayout cameraView;
    public final Button captureButton;
    public final TextView captureTips;
    public final TextView disclaimer;
    public final LinearLayout disclaimerLayout;
    public final ToggleButton flashlightToggle;
    public final TextView hint;
    public final FrameLayout innerContentView;
    public final Pi2NavigationBar navigationBar;
    public final View overlay;
    public final ImageView overlayGuide;
    public final ConstraintLayout overlayHint;
    public final ThemeableLottieAnimationView overlayIcon;
    public final ConstraintLayout overlayIconContainer;
    public final TextView overlayText;
    public final FrameLayout previewContainer;
    public final View previewDim;
    public final ProgressBar progressBar;
    public final FrameLayout rootView;
    public final LottieAnimationView scanningAnimation;
    public final ScanningView scanningView;
    public final SpotlightView spotlightView;
    public final StaticCaptureTipsView staticCaptureTips;
    public final TextView title;
    public final TextView watermark;

    public Pi2GovernmentidCameraBinding(FrameLayout frameLayout, Camera2PreviewView camera2PreviewView, ProgressBar progressBar, ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2, LinearLayout linearLayout, ToggleButton toggleButton, TextView textView3, FrameLayout frameLayout2, Pi2NavigationBar pi2NavigationBar, View view, ImageView imageView, ConstraintLayout constraintLayout2, ThemeableLottieAnimationView themeableLottieAnimationView, ConstraintLayout constraintLayout3, TextView textView4, FrameLayout frameLayout3, View view2, PreviewView previewView, ProgressBar progressBar2, LottieAnimationView lottieAnimationView, ScanningView scanningView, SpotlightView spotlightView, StaticCaptureTipsView staticCaptureTipsView, TextView textView5, TextView textView6) {
        this.rootView = frameLayout;
        this.cameraInitializingProgressBar = progressBar;
        this.cameraView = constraintLayout;
        this.captureButton = button;
        this.captureTips = textView;
        this.disclaimer = textView2;
        this.disclaimerLayout = linearLayout;
        this.flashlightToggle = toggleButton;
        this.hint = textView3;
        this.innerContentView = frameLayout2;
        this.navigationBar = pi2NavigationBar;
        this.overlay = view;
        this.overlayGuide = imageView;
        this.overlayHint = constraintLayout2;
        this.overlayIcon = themeableLottieAnimationView;
        this.overlayIconContainer = constraintLayout3;
        this.overlayText = textView4;
        this.previewContainer = frameLayout3;
        this.previewDim = view2;
        this.progressBar = progressBar2;
        this.scanningAnimation = lottieAnimationView;
        this.scanningView = scanningView;
        this.spotlightView = spotlightView;
        this.staticCaptureTips = staticCaptureTipsView;
        this.title = textView5;
        this.watermark = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
