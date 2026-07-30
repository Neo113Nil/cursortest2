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

/* loaded from: classes2.dex */
public final class ActivityDressWatchFaceCameraBinding implements ViewBinding {

    @NonNull
    public final CameraView cameraView;

    @NonNull
    public final ImageView ivFlash;

    @NonNull
    public final ImageView ivGalleryPreview;

    @NonNull
    public final ImageView ivShutter;

    @NonNull
    public final ImageView ivSwitchCamera;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RelativeLayout rlShutterControl;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout toolbar;

    @NonNull
    public final TextView tvTitle;

    private ActivityDressWatchFaceCameraBinding(@NonNull RelativeLayout relativeLayout, @NonNull CameraView cameraView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.cameraView = cameraView;
        this.ivFlash = imageView;
        this.ivGalleryPreview = imageView2;
        this.ivShutter = imageView3;
        this.ivSwitchCamera = imageView4;
        this.ivTitleBack = imageView5;
        this.rlShutterControl = relativeLayout2;
        this.toolbar = relativeLayout3;
        this.tvTitle = textView;
    }

    @NonNull
    public static ActivityDressWatchFaceCameraBinding bind(@NonNull View view) {
        int i8 = R.id.camera_view;
        CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, R.id.camera_view);
        if (cameraView != null) {
            i8 = R.id.iv_flash;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_flash);
            if (imageView != null) {
                i8 = R.id.iv_gallery_preview;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gallery_preview);
                if (imageView2 != null) {
                    i8 = R.id.iv_shutter;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_shutter);
                    if (imageView3 != null) {
                        i8 = R.id.iv_switch_camera;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_switch_camera);
                        if (imageView4 != null) {
                            i8 = R.id.iv_title_back;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                            if (imageView5 != null) {
                                i8 = R.id.rl_shutter_control;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_shutter_control);
                                if (relativeLayout != null) {
                                    i8 = R.id.toolbar;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                    if (relativeLayout2 != null) {
                                        i8 = R.id.tv_title;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                        if (textView != null) {
                                            return new ActivityDressWatchFaceCameraBinding((RelativeLayout) view, cameraView, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, textView);
                                        }
                                    }
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
    public static ActivityDressWatchFaceCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityDressWatchFaceCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_dress_watch_face_camera, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
