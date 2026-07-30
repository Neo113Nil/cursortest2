package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.king.zxing.ViewfinderView;

/* loaded from: classes2.dex */
public final class ActivityBandCaptureBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivFlash;

    @NonNull
    public final ImageView ivGallery;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final SurfaceView surfaceView;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final ViewfinderView viewfinderView;

    private ActivityBandCaptureBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull SurfaceView surfaceView, @NonNull Toolbar toolbar, @NonNull ViewfinderView viewfinderView) {
        this.rootView = constraintLayout;
        this.ivBack = imageView;
        this.ivFlash = imageView2;
        this.ivGallery = imageView3;
        this.surfaceView = surfaceView;
        this.toolbar = toolbar;
        this.viewfinderView = viewfinderView;
    }

    @NonNull
    public static ActivityBandCaptureBinding bind(@NonNull View view) {
        int i8 = R.id.iv_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
        if (imageView != null) {
            i8 = R.id.iv_flash;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_flash);
            if (imageView2 != null) {
                i8 = R.id.iv_gallery;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_gallery);
                if (imageView3 != null) {
                    i8 = R.id.surfaceView;
                    SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(view, R.id.surfaceView);
                    if (surfaceView != null) {
                        i8 = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                        if (toolbar != null) {
                            i8 = R.id.viewfinderView;
                            ViewfinderView viewfinderView = (ViewfinderView) ViewBindings.findChildViewById(view, R.id.viewfinderView);
                            if (viewfinderView != null) {
                                return new ActivityBandCaptureBinding((ConstraintLayout) view, imageView, imageView2, imageView3, surfaceView, toolbar, viewfinderView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityBandCaptureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBandCaptureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_band_capture, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
