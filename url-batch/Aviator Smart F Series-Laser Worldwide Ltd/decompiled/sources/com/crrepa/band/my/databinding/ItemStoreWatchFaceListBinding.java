package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemStoreWatchFaceListBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivWatchFace;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvName;

    private ItemStoreWatchFaceListBinding(@NonNull LinearLayout linearLayout, @NonNull RoundedImageView roundedImageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.ivWatchFace = roundedImageView;
        this.tvName = textView;
    }

    @NonNull
    public static ItemStoreWatchFaceListBinding bind(@NonNull View view) {
        int i8 = R.id.iv_watch_face;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face);
        if (roundedImageView != null) {
            i8 = R.id.tv_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
            if (textView != null) {
                return new ItemStoreWatchFaceListBinding((LinearLayout) view, roundedImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemStoreWatchFaceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemStoreWatchFaceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_store_watch_face_list, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
