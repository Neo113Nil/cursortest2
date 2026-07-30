package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogTrainingPathShareBinding implements ViewBinding {

    @NonNull
    public final ImageView ivStrava;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvStrava;

    private DialogTrainingPathShareBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.ivStrava = imageView;
        this.tvStrava = textView;
    }

    @NonNull
    public static DialogTrainingPathShareBinding bind(@NonNull View view) {
        int i8 = R.id.iv_strava;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_strava);
        if (imageView != null) {
            i8 = R.id.tv_strava;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_strava);
            if (textView != null) {
                return new DialogTrainingPathShareBinding((FrameLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogTrainingPathShareBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogTrainingPathShareBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_training_path_share, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
