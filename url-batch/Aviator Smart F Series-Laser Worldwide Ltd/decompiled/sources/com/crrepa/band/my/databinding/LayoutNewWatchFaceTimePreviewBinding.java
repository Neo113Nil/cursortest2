package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFaceTimePreviewBinding implements ViewBinding {

    @NonNull
    public final DraggableLinearLayout dragLayout;

    @NonNull
    public final ImageView ivBottomLabel;

    @NonNull
    public final ImageView ivClockPointer;

    @NonNull
    public final ImageView ivTimeLabel;

    @NonNull
    public final ImageView ivTopLabel;

    @NonNull
    public final RelativeLayout rlRoot;

    @NonNull
    private final RelativeLayout rootView;

    private LayoutNewWatchFaceTimePreviewBinding(@NonNull RelativeLayout relativeLayout, @NonNull DraggableLinearLayout draggableLinearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.dragLayout = draggableLinearLayout;
        this.ivBottomLabel = imageView;
        this.ivClockPointer = imageView2;
        this.ivTimeLabel = imageView3;
        this.ivTopLabel = imageView4;
        this.rlRoot = relativeLayout2;
    }

    @NonNull
    public static LayoutNewWatchFaceTimePreviewBinding bind(@NonNull View view) {
        int i8 = R.id.dragLayout;
        DraggableLinearLayout draggableLinearLayout = (DraggableLinearLayout) ViewBindings.findChildViewById(view, R.id.dragLayout);
        if (draggableLinearLayout != null) {
            i8 = R.id.iv_bottom_label;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bottom_label);
            if (imageView != null) {
                i8 = R.id.iv_clock_pointer;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_clock_pointer);
                if (imageView2 != null) {
                    i8 = R.id.iv_time_label;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_time_label);
                    if (imageView3 != null) {
                        i8 = R.id.iv_top_label;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_top_label);
                        if (imageView4 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new LayoutNewWatchFaceTimePreviewBinding(relativeLayout, draggableLinearLayout, imageView, imageView2, imageView3, imageView4, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewWatchFaceTimePreviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFaceTimePreviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_time_preview, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
