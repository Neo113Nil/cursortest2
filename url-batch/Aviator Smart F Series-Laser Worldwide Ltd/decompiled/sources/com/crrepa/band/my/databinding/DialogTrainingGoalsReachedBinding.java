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
import com.moyoung.dafit.module.common.widgets.CircleProgressView;

/* loaded from: classes2.dex */
public final class DialogTrainingGoalsReachedBinding implements ViewBinding {

    @NonNull
    public final CircleProgressView cpvCountDown;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivGoal;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvGoal;

    @NonNull
    public final TextView tvReminderTitle;

    private DialogTrainingGoalsReachedBinding(@NonNull LinearLayout linearLayout, @NonNull CircleProgressView circleProgressView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.cpvCountDown = circleProgressView;
        this.ivClose = imageView;
        this.ivGoal = imageView2;
        this.tvContent = textView;
        this.tvGoal = textView2;
        this.tvReminderTitle = textView3;
    }

    @NonNull
    public static DialogTrainingGoalsReachedBinding bind(@NonNull View view) {
        int i8 = R.id.cpv_count_down;
        CircleProgressView circleProgressView = (CircleProgressView) ViewBindings.findChildViewById(view, R.id.cpv_count_down);
        if (circleProgressView != null) {
            i8 = R.id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView != null) {
                i8 = R.id.iv_goal;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_goal);
                if (imageView2 != null) {
                    i8 = R.id.tv_content;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                    if (textView != null) {
                        i8 = R.id.tv_goal;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal);
                        if (textView2 != null) {
                            i8 = R.id.tv_reminder_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminder_title);
                            if (textView3 != null) {
                                return new DialogTrainingGoalsReachedBinding((LinearLayout) view, circleProgressView, imageView, imageView2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogTrainingGoalsReachedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogTrainingGoalsReachedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_training_goals_reached, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
