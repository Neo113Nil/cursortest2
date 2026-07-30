package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemAppMarketAppPreviewBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivPreview;

    @NonNull
    private final RoundedImageView rootView;

    private ItemAppMarketAppPreviewBinding(@NonNull RoundedImageView roundedImageView, @NonNull RoundedImageView roundedImageView2) {
        this.rootView = roundedImageView;
        this.ivPreview = roundedImageView2;
    }

    @NonNull
    public static ItemAppMarketAppPreviewBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RoundedImageView roundedImageView = (RoundedImageView) view;
        return new ItemAppMarketAppPreviewBinding(roundedImageView, roundedImageView);
    }

    @NonNull
    public static ItemAppMarketAppPreviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RoundedImageView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemAppMarketAppPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_app_market_app_preview, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
