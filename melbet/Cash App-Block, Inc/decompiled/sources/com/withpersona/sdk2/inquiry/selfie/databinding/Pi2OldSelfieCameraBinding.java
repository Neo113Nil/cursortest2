package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes9.dex */
public final class Pi2OldSelfieCameraBinding implements ViewBinding {
    public final Button button;
    public final Camera2PreviewView camera2Preview;
    public final View cameraCover;
    public final TextView countdown;
    public final TextView hintMessage;
    public final ProgressBar initializingProgressBar;
    public final Pi2NavigationBar navigationBar;
    public final PreviewView previewviewSelfieCamera;
    public final ConstraintLayout rootView;
    public final OldSelfieOverlayView selfieWindow;
    public final TextView title;
    public final TextView watermark;

    public Pi2OldSelfieCameraBinding(ConstraintLayout constraintLayout, Button button, Camera2PreviewView camera2PreviewView, View view, TextView textView, TextView textView2, ProgressBar progressBar, Pi2NavigationBar pi2NavigationBar, PreviewView previewView, OldSelfieOverlayView oldSelfieOverlayView, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.button = button;
        this.camera2Preview = camera2PreviewView;
        this.cameraCover = view;
        this.countdown = textView;
        this.hintMessage = textView2;
        this.initializingProgressBar = progressBar;
        this.navigationBar = pi2NavigationBar;
        this.previewviewSelfieCamera = previewView;
        this.selfieWindow = oldSelfieOverlayView;
        this.title = textView3;
        this.watermark = textView4;
    }

    public static Pi2OldSelfieCameraBinding inflate(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.pi2_old_selfie_camera, (ViewGroup) null, false);
        int i = R.id.button;
        Button button = (Button) ViewBindings.findChildViewById(inflate, R.id.button);
        if (button != null) {
            i = R.id.camera2_preview;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) ViewBindings.findChildViewById(inflate, R.id.camera2_preview);
            if (camera2PreviewView != null) {
                i = R.id.camera_cover;
                View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.camera_cover);
                if (findChildViewById != null) {
                    i = R.id.countdown;
                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.countdown);
                    if (textView != null) {
                        i = R.id.hint_message;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.hint_message);
                        if (textView2 != null) {
                            i = R.id.initializing_progress_bar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(inflate, R.id.initializing_progress_bar);
                            if (progressBar != null) {
                                i = R.id.navigation_bar;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                                if (pi2NavigationBar != null) {
                                    i = R.id.preview_bottom_barrier;
                                    if (((Barrier) ViewBindings.findChildViewById(inflate, R.id.preview_bottom_barrier)) != null) {
                                        i = R.id.preview_container;
                                        if (((FrameLayout) ViewBindings.findChildViewById(inflate, R.id.preview_container)) != null) {
                                            i = R.id.previewview_selfie_camera;
                                            PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(inflate, R.id.previewview_selfie_camera);
                                            if (previewView != null) {
                                                i = R.id.selfie_window;
                                                OldSelfieOverlayView oldSelfieOverlayView = (OldSelfieOverlayView) ViewBindings.findChildViewById(inflate, R.id.selfie_window);
                                                if (oldSelfieOverlayView != null) {
                                                    i = R.id.title;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                                    if (textView3 != null) {
                                                        i = R.id.watermark;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, R.id.watermark);
                                                        if (textView4 != null) {
                                                            return new Pi2OldSelfieCameraBinding((ConstraintLayout) inflate, button, camera2PreviewView, findChildViewById, textView, textView2, progressBar, pi2NavigationBar, previewView, oldSelfieOverlayView, textView3, textView4);
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
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
