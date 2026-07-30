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
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ActivityMeditationOnlineClassDoneBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBg;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDone;

    private ActivityMeditationOnlineClassDoneBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivBg = imageView;
        this.tvDone = textView;
    }

    @NonNull
    public static ActivityMeditationOnlineClassDoneBinding bind(@NonNull View view) {
        int i8 = R$id.iv_bg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.tv_done;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView != null) {
                return new ActivityMeditationOnlineClassDoneBinding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityMeditationOnlineClassDoneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMeditationOnlineClassDoneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_meditation_online_class_done, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
