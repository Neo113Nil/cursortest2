package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemDuasBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flFavorite;

    @NonNull
    public final ImageView ivCollect;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDuas;

    @NonNull
    public final TextView tvIndex;

    private ItemDuasBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.flFavorite = frameLayout;
        this.ivCollect = imageView;
        this.tvDuas = textView;
        this.tvIndex = textView2;
    }

    @NonNull
    public static ItemDuasBinding bind(@NonNull View view) {
        int i8 = R.id.fl_favorite;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_favorite);
        if (frameLayout != null) {
            i8 = R.id.iv_collect;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_collect);
            if (imageView != null) {
                i8 = R.id.tv_duas;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_duas);
                if (textView != null) {
                    i8 = R.id.tv_index;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_index);
                    if (textView2 != null) {
                        return new ItemDuasBinding((LinearLayout) view, frameLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemDuasBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemDuasBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_duas, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
