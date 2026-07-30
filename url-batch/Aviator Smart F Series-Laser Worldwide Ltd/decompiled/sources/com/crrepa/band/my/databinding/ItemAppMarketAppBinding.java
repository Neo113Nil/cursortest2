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
public final class ItemAppMarketAppBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivLogo;

    @NonNull
    public final LinearLayout llContent;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvSize;

    @NonNull
    public final TextView tvTitle;

    private ItemAppMarketAppBinding(@NonNull LinearLayout linearLayout, @NonNull RoundedImageView roundedImageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.ivLogo = roundedImageView;
        this.llContent = linearLayout2;
        this.tvDescription = textView;
        this.tvSize = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static ItemAppMarketAppBinding bind(@NonNull View view) {
        int i8 = R.id.iv_logo;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_logo);
        if (roundedImageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.tv_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
            if (textView != null) {
                i8 = R.id.tv_size;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_size);
                if (textView2 != null) {
                    i8 = R.id.tv_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView3 != null) {
                        return new ItemAppMarketAppBinding(linearLayout, roundedImageView, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemAppMarketAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemAppMarketAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_app_market_app, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
