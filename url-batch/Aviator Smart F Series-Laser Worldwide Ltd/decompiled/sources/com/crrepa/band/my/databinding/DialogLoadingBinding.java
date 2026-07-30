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
import com.airbnb.lottie.LottieAnimationView;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogLoadingBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView lavLoading;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvLoadingHint;

    private DialogLoadingBinding(@NonNull LinearLayout linearLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.lavLoading = lottieAnimationView;
        this.tvLoadingHint = textView;
    }

    @NonNull
    public static DialogLoadingBinding bind(@NonNull View view) {
        int i8 = R.id.lav_loading;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_loading);
        if (lottieAnimationView != null) {
            i8 = R.id.tv_loading_hint;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_loading_hint);
            if (textView != null) {
                return new DialogLoadingBinding((LinearLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_loading, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
