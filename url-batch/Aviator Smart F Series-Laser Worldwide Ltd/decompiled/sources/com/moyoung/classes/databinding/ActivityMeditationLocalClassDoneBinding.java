package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ActivityMeditationLocalClassDoneBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBg;

    @NonNull
    public final LinearLayout rlBreath;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvBreathedDuration;

    @NonNull
    public final TextView tvCompliment;

    @NonNull
    public final TextView tvDate;

    @NonNull
    public final TextView tvDone;

    @NonNull
    public final TextView tvTitle;

    private ActivityMeditationLocalClassDoneBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = relativeLayout;
        this.ivBg = imageView;
        this.rlBreath = linearLayout;
        this.tvBreathedDuration = textView;
        this.tvCompliment = textView2;
        this.tvDate = textView3;
        this.tvDone = textView4;
        this.tvTitle = textView5;
    }

    @NonNull
    public static ActivityMeditationLocalClassDoneBinding bind(@NonNull View view) {
        int i8 = R$id.iv_bg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.rl_breath;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
            if (linearLayout != null) {
                i8 = R$id.tv_breathed_duration;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView != null) {
                    i8 = R$id.tv_compliment;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView2 != null) {
                        i8 = R$id.tv_date;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView3 != null) {
                            i8 = R$id.tv_done;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                            if (textView4 != null) {
                                i8 = R$id.tv_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView5 != null) {
                                    return new ActivityMeditationLocalClassDoneBinding((RelativeLayout) view, imageView, linearLayout, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityMeditationLocalClassDoneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMeditationLocalClassDoneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_meditation_local_class_done, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
