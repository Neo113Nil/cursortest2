package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;

/* loaded from: classes9.dex */
public final class Pi2SelfieCameraBinding implements ViewBinding {
    public final TextView autoCaptureDisclaimer;
    public final CircularProgressIndicator autoCaptureProgressBar;
    public final Space bottomSpace;
    public final ImageView button;
    public final Camera2PreviewView camera2Preview;
    public final View cameraCover;
    public final TextView captureSuccess;
    public final TextView countdown;
    public final View cover;
    public final FrameLayout finalizingCover;
    public final TextView hintMessageBody;
    public final TextView hintMessageTitle;
    public final ProgressBar initializingProgressBar;
    public final Pi2NavigationBar navigationBar;
    public final ImageView nextCamera;
    public final PreviewView previewviewSelfieCamera;
    public final TextView realTimeHint;
    public final ConstraintLayout rootView_;
    public final View selfieFlash;
    public final SelfieOverlayView selfieOverlay;
    public final SpotlightView spotlight;
    public final TextView title;
    public final ImageView toggleFlash;
    public final Space topSpace;
    public final TextView watermark;

    public Pi2SelfieCameraBinding(ConstraintLayout constraintLayout, TextView textView, CircularProgressIndicator circularProgressIndicator, Space space, ImageView imageView, Camera2PreviewView camera2PreviewView, View view, TextView textView2, TextView textView3, View view2, FrameLayout frameLayout, TextView textView4, TextView textView5, ProgressBar progressBar, Pi2NavigationBar pi2NavigationBar, ImageView imageView2, PreviewView previewView, TextView textView6, View view3, SelfieOverlayView selfieOverlayView, SpotlightView spotlightView, TextView textView7, ImageView imageView3, Space space2, TextView textView8) {
        this.rootView_ = constraintLayout;
        this.autoCaptureDisclaimer = textView;
        this.autoCaptureProgressBar = circularProgressIndicator;
        this.bottomSpace = space;
        this.button = imageView;
        this.camera2Preview = camera2PreviewView;
        this.cameraCover = view;
        this.captureSuccess = textView2;
        this.countdown = textView3;
        this.cover = view2;
        this.finalizingCover = frameLayout;
        this.hintMessageBody = textView4;
        this.hintMessageTitle = textView5;
        this.initializingProgressBar = progressBar;
        this.navigationBar = pi2NavigationBar;
        this.nextCamera = imageView2;
        this.previewviewSelfieCamera = previewView;
        this.realTimeHint = textView6;
        this.selfieFlash = view3;
        this.selfieOverlay = selfieOverlayView;
        this.spotlight = spotlightView;
        this.title = textView7;
        this.toggleFlash = imageView3;
        this.topSpace = space2;
        this.watermark = textView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView_;
    }
}
