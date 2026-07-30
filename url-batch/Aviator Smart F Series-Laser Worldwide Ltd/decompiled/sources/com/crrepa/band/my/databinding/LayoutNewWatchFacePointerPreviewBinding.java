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

/* loaded from: classes2.dex */
public final class LayoutNewWatchFacePointerPreviewBinding implements ViewBinding {

    @NonNull
    public final LayoutNewWatchFacePointerPreviewLabelBinding includeLabel0;

    @NonNull
    public final LayoutNewWatchFacePointerPreviewLabelBinding includeLabel1;

    @NonNull
    public final LayoutNewWatchFacePointerPreviewLabelBinding includeLabel2;

    @NonNull
    public final LayoutNewWatchFacePointerPreviewLabelBinding includeLabel3;

    @NonNull
    public final ImageView ivPointer;

    @NonNull
    public final RelativeLayout rlPointerLabelRoot;

    @NonNull
    private final RelativeLayout rootView;

    private LayoutNewWatchFacePointerPreviewBinding(@NonNull RelativeLayout relativeLayout, @NonNull LayoutNewWatchFacePointerPreviewLabelBinding layoutNewWatchFacePointerPreviewLabelBinding, @NonNull LayoutNewWatchFacePointerPreviewLabelBinding layoutNewWatchFacePointerPreviewLabelBinding2, @NonNull LayoutNewWatchFacePointerPreviewLabelBinding layoutNewWatchFacePointerPreviewLabelBinding3, @NonNull LayoutNewWatchFacePointerPreviewLabelBinding layoutNewWatchFacePointerPreviewLabelBinding4, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.includeLabel0 = layoutNewWatchFacePointerPreviewLabelBinding;
        this.includeLabel1 = layoutNewWatchFacePointerPreviewLabelBinding2;
        this.includeLabel2 = layoutNewWatchFacePointerPreviewLabelBinding3;
        this.includeLabel3 = layoutNewWatchFacePointerPreviewLabelBinding4;
        this.ivPointer = imageView;
        this.rlPointerLabelRoot = relativeLayout2;
    }

    @NonNull
    public static LayoutNewWatchFacePointerPreviewBinding bind(@NonNull View view) {
        int i8 = R.id.include_label_0;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_label_0);
        if (findChildViewById != null) {
            LayoutNewWatchFacePointerPreviewLabelBinding bind = LayoutNewWatchFacePointerPreviewLabelBinding.bind(findChildViewById);
            i8 = R.id.include_label_1;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_label_1);
            if (findChildViewById2 != null) {
                LayoutNewWatchFacePointerPreviewLabelBinding bind2 = LayoutNewWatchFacePointerPreviewLabelBinding.bind(findChildViewById2);
                i8 = R.id.include_label_2;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_label_2);
                if (findChildViewById3 != null) {
                    LayoutNewWatchFacePointerPreviewLabelBinding bind3 = LayoutNewWatchFacePointerPreviewLabelBinding.bind(findChildViewById3);
                    i8 = R.id.include_label_3;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_label_3);
                    if (findChildViewById4 != null) {
                        LayoutNewWatchFacePointerPreviewLabelBinding bind4 = LayoutNewWatchFacePointerPreviewLabelBinding.bind(findChildViewById4);
                        i8 = R.id.iv_pointer;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_pointer);
                        if (imageView != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new LayoutNewWatchFacePointerPreviewBinding(relativeLayout, bind, bind2, bind3, bind4, imageView, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewWatchFacePointerPreviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFacePointerPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_pointer_preview, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
