package com.moyoung.classes.databinding;

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
import com.airbnb.lottie.LottieAnimationView;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ItemMeditationWhiteNoiseBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView anima;

    @NonNull
    public final ImageView ivCover;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final View viewMask;

    private ItemMeditationWhiteNoiseBinding(@NonNull RelativeLayout relativeLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view) {
        this.rootView = relativeLayout;
        this.anima = lottieAnimationView;
        this.ivCover = imageView;
        this.tvTitle = textView;
        this.viewMask = view;
    }

    @NonNull
    public static ItemMeditationWhiteNoiseBinding bind(@NonNull View view) {
        View findChildViewById;
        int i8 = R$id.anima;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i8);
        if (lottieAnimationView != null) {
            i8 = R$id.iv_cover;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView != null) {
                i8 = R$id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.view_mask))) != null) {
                    return new ItemMeditationWhiteNoiseBinding((RelativeLayout) view, lottieAnimationView, imageView, textView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemMeditationWhiteNoiseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemMeditationWhiteNoiseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_meditation_white_noise, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
