package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemStoreWatchFaceSimilarBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivWatchFace;

    @NonNull
    private final LinearLayout rootView;

    private ItemStoreWatchFaceSimilarBinding(@NonNull LinearLayout linearLayout, @NonNull RoundedImageView roundedImageView) {
        this.rootView = linearLayout;
        this.ivWatchFace = roundedImageView;
    }

    @NonNull
    public static ItemStoreWatchFaceSimilarBinding bind(@NonNull View view) {
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face);
        if (roundedImageView != null) {
            return new ItemStoreWatchFaceSimilarBinding((LinearLayout) view, roundedImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_watch_face)));
    }

    @NonNull
    public static ItemStoreWatchFaceSimilarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemStoreWatchFaceSimilarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_store_watch_face_similar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
