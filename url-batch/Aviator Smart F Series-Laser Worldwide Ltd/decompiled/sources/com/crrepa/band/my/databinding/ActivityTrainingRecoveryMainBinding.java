package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityTrainingRecoveryMainBinding implements ViewBinding {

    @NonNull
    public final ImageView ivCalendar;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final View line;

    @NonNull
    public final LinearLayout llRemainingValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvRecoveryPercent;

    @NonNull
    public final TextView tvRecoveryTime;

    @NonNull
    public final TextView tvTrainingRecoveryLevelTitle;

    private ActivityTrainingRecoveryMainBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.ivCalendar = imageView;
        this.ivClose = imageView2;
        this.line = view;
        this.llRemainingValue = linearLayout2;
        this.tvRecoveryPercent = textView;
        this.tvRecoveryTime = textView2;
        this.tvTrainingRecoveryLevelTitle = textView3;
    }

    @NonNull
    public static ActivityTrainingRecoveryMainBinding bind(@NonNull View view) {
        int i8 = R.id.iv_calendar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_calendar);
        if (imageView != null) {
            i8 = R.id.iv_close;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView2 != null) {
                i8 = R.id.line;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                if (findChildViewById != null) {
                    i8 = R.id.ll_remaining_value;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_remaining_value);
                    if (linearLayout != null) {
                        i8 = R.id.tv_recovery_percent;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_recovery_percent);
                        if (textView != null) {
                            i8 = R.id.tv_recovery_time;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_recovery_time);
                            if (textView2 != null) {
                                i8 = R.id.tv_training_recovery_level_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_training_recovery_level_title);
                                if (textView3 != null) {
                                    return new ActivityTrainingRecoveryMainBinding((LinearLayout) view, imageView, imageView2, findChildViewById, linearLayout, textView, textView2, textView3);
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
    public static ActivityTrainingRecoveryMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTrainingRecoveryMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_training_recovery_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
