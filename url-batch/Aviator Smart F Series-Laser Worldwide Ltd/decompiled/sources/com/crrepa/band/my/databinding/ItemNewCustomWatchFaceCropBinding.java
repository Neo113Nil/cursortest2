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
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemNewCustomWatchFaceCropBinding implements ViewBinding {

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final RoundedImageView ivPhoto;

    @NonNull
    public final View mask;

    @NonNull
    private final RelativeLayout rootView;

    private ItemNewCustomWatchFaceCropBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RoundedImageView roundedImageView, @NonNull View view) {
        this.rootView = relativeLayout;
        this.ivClose = imageView;
        this.ivPhoto = roundedImageView;
        this.mask = view;
    }

    @NonNull
    public static ItemNewCustomWatchFaceCropBinding bind(@NonNull View view) {
        int i8 = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i8 = R.id.iv_photo;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_photo);
            if (roundedImageView != null) {
                i8 = R.id.mask;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.mask);
                if (findChildViewById != null) {
                    return new ItemNewCustomWatchFaceCropBinding((RelativeLayout) view, imageView, roundedImageView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemNewCustomWatchFaceCropBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemNewCustomWatchFaceCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_new_custom_watch_face_crop, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
