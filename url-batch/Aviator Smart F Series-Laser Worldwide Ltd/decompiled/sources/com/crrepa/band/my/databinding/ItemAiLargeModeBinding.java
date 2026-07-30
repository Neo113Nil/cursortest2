package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemAiLargeModeBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBigIcon;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final ImageView ivSelected;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvName;

    private ItemAiLargeModeBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivBigIcon = imageView;
        this.ivIcon = imageView2;
        this.ivSelected = imageView3;
        this.tvName = textView;
    }

    @NonNull
    public static ItemAiLargeModeBinding bind(@NonNull View view) {
        int i8 = R.id.iv_big_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_big_icon);
        if (imageView != null) {
            i8 = R.id.iv_icon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
            if (imageView2 != null) {
                i8 = R.id.iv_selected;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_selected);
                if (imageView3 != null) {
                    i8 = R.id.tv_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                    if (textView != null) {
                        return new ItemAiLargeModeBinding((RelativeLayout) view, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemAiLargeModeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemAiLargeModeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_ai_large_mode, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
