package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.cameraview.CameraView;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ActivityGoogleCameraBinding implements ViewBinding {

    @NonNull
    public final CameraView cameraView;

    @NonNull
    public final ImageView ivFlash;

    @NonNull
    public final ImageView ivHelpTakePhotos;

    @NonNull
    public final RoundedImageView ivHistoryPreview;

    @NonNull
    public final ImageView ivShutter;

    @NonNull
    public final ImageView ivSwitchCamera;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCameraCountDown;

    private ActivityGoogleCameraBinding(@NonNull RelativeLayout relativeLayout, @NonNull CameraView cameraView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.cameraView = cameraView;
        this.ivFlash = imageView;
        this.ivHelpTakePhotos = imageView2;
        this.ivHistoryPreview = roundedImageView;
        this.ivShutter = imageView3;
        this.ivSwitchCamera = imageView4;
        this.tvCameraCountDown = textView;
    }

    @NonNull
    public static ActivityGoogleCameraBinding bind(@NonNull View view) {
        int i8 = R.id.camera_view;
        CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, R.id.camera_view);
        if (cameraView != null) {
            i8 = R.id.iv_flash;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_flash);
            if (imageView != null) {
                i8 = R.id.iv_help_take_photos;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_help_take_photos);
                if (imageView2 != null) {
                    i8 = R.id.iv_history_preview;
                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_history_preview);
                    if (roundedImageView != null) {
                        i8 = R.id.iv_shutter;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_shutter);
                        if (imageView3 != null) {
                            i8 = R.id.iv_switch_camera;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_switch_camera);
                            if (imageView4 != null) {
                                i8 = R.id.tv_camera_count_down;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_camera_count_down);
                                if (textView != null) {
                                    return new ActivityGoogleCameraBinding((RelativeLayout) view, cameraView, imageView, imageView2, roundedImageView, imageView3, imageView4, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityGoogleCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGoogleCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_google_camera, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
