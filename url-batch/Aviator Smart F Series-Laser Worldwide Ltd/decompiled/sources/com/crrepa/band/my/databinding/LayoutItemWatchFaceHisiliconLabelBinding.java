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
public final class LayoutItemWatchFaceHisiliconLabelBinding implements ViewBinding {

    @NonNull
    public final ImageView ivHisiliconClockPointer;

    @NonNull
    public final ImageView ivWatchFaceTime;

    @NonNull
    public final ImageView ivWatchFaceTimeBottom;

    @NonNull
    public final ImageView ivWatchFaceTimeTop;

    @NonNull
    public final DraggableLinearLayout llHisiliconLabel;

    @NonNull
    public final RelativeLayout rlHisiliconLabelRoot;

    @NonNull
    private final RelativeLayout rootView;

    private LayoutItemWatchFaceHisiliconLabelBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull DraggableLinearLayout draggableLinearLayout, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.ivHisiliconClockPointer = imageView;
        this.ivWatchFaceTime = imageView2;
        this.ivWatchFaceTimeBottom = imageView3;
        this.ivWatchFaceTimeTop = imageView4;
        this.llHisiliconLabel = draggableLinearLayout;
        this.rlHisiliconLabelRoot = relativeLayout2;
    }

    @NonNull
    public static LayoutItemWatchFaceHisiliconLabelBinding bind(@NonNull View view) {
        int i8 = R.id.iv_hisilicon_clock_pointer;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_hisilicon_clock_pointer);
        if (imageView != null) {
            i8 = R.id.iv_watch_face_time;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time);
            if (imageView2 != null) {
                i8 = R.id.iv_watch_face_time_bottom;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_bottom);
                if (imageView3 != null) {
                    i8 = R.id.iv_watch_face_time_top;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_top);
                    if (imageView4 != null) {
                        i8 = R.id.ll_hisilicon_label;
                        DraggableLinearLayout draggableLinearLayout = (DraggableLinearLayout) ViewBindings.findChildViewById(view, R.id.ll_hisilicon_label);
                        if (draggableLinearLayout != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new LayoutItemWatchFaceHisiliconLabelBinding(relativeLayout, imageView, imageView2, imageView3, imageView4, draggableLinearLayout, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutItemWatchFaceHisiliconLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutItemWatchFaceHisiliconLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_item_watch_face_hisilicon_label, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
