package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemLocalPhotoSavedPhotoBinding implements ViewBinding {

    @NonNull
    public final CheckBox cbCheck;

    @NonNull
    public final ImageView ivPhoto;

    @NonNull
    public final RelativeLayout rl;

    @NonNull
    private final RelativeLayout rootView;

    private ItemLocalPhotoSavedPhotoBinding(@NonNull RelativeLayout relativeLayout, @NonNull CheckBox checkBox, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.cbCheck = checkBox;
        this.ivPhoto = imageView;
        this.rl = relativeLayout2;
    }

    @NonNull
    public static ItemLocalPhotoSavedPhotoBinding bind(@NonNull View view) {
        int i8 = R.id.cb_check;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_check);
        if (checkBox != null) {
            i8 = R.id.iv_photo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_photo);
            if (imageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new ItemLocalPhotoSavedPhotoBinding(relativeLayout, checkBox, imageView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemLocalPhotoSavedPhotoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemLocalPhotoSavedPhotoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_local_photo_saved_photo, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
