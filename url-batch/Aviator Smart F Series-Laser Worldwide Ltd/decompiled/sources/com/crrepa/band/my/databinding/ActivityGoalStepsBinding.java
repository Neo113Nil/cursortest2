package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;

/* loaded from: classes2.dex */
public final class ActivityGoalStepsBinding implements ViewBinding {

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final BandDataAppbarBinding titleBar;

    @NonNull
    public final TextView tvGoalStepHint;

    @NonNull
    public final WheelPicker wpGoalSteps;

    private ActivityGoalStepsBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView, @NonNull WheelPicker wheelPicker) {
        this.rootView = coordinatorLayout;
        this.titleBar = bandDataAppbarBinding;
        this.tvGoalStepHint = textView;
        this.wpGoalSteps = wheelPicker;
    }

    @NonNull
    public static ActivityGoalStepsBinding bind(@NonNull View view) {
        int i8 = R.id.title_bar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal_step_hint);
            if (textView != null) {
                WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_goal_steps);
                if (wheelPicker != null) {
                    return new ActivityGoalStepsBinding((CoordinatorLayout) view, bind, textView, wheelPicker);
                }
                i8 = R.id.wp_goal_steps;
            } else {
                i8 = R.id.tv_goal_step_hint;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityGoalStepsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGoalStepsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_goal_steps, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
