package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.photo.widgets.DraggableLinearLayout;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFacePointerPreviewLabelBinding implements ViewBinding {

    @NonNull
    public final DraggableLinearLayout dragLayout;

    @NonNull
    public final ImageView ivLabel;

    @NonNull
    private final DraggableLinearLayout rootView;

    private LayoutNewWatchFacePointerPreviewLabelBinding(@NonNull DraggableLinearLayout draggableLinearLayout, @NonNull DraggableLinearLayout draggableLinearLayout2, @NonNull ImageView imageView) {
        this.rootView = draggableLinearLayout;
        this.dragLayout = draggableLinearLayout2;
        this.ivLabel = imageView;
    }

    @NonNull
    public static LayoutNewWatchFacePointerPreviewLabelBinding bind(@NonNull View view) {
        DraggableLinearLayout draggableLinearLayout = (DraggableLinearLayout) view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_label);
        if (imageView != null) {
            return new LayoutNewWatchFacePointerPreviewLabelBinding(draggableLinearLayout, draggableLinearLayout, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_label)));
    }

    @NonNull
    public static LayoutNewWatchFacePointerPreviewLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DraggableLinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFacePointerPreviewLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_pointer_preview_label, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
