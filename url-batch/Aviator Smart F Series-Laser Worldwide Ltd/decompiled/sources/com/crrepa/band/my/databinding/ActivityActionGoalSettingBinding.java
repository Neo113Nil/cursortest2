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
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;

/* loaded from: classes2.dex */
public final class ActivityActionGoalSettingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDone;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final WheelPicker wpGoalInfo;

    @NonNull
    public final WheelPicker wpGoalSecond;

    @NonNull
    public final WheelPicker wpGoalUnit;

    private ActivityActionGoalSettingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WheelPicker wheelPicker, @NonNull WheelPicker wheelPicker2, @NonNull WheelPicker wheelPicker3) {
        this.rootView = linearLayout;
        this.ivTitleBack = imageView;
        this.tvDone = textView;
        this.tvTitle = textView2;
        this.wpGoalInfo = wheelPicker;
        this.wpGoalSecond = wheelPicker2;
        this.wpGoalUnit = wheelPicker3;
    }

    @NonNull
    public static ActivityActionGoalSettingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_title_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
        if (imageView != null) {
            i8 = R.id.tv_done;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_done);
            if (textView != null) {
                i8 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    i8 = R.id.wp_goal_info;
                    WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_goal_info);
                    if (wheelPicker != null) {
                        i8 = R.id.wp_goal_second;
                        WheelPicker wheelPicker2 = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_goal_second);
                        if (wheelPicker2 != null) {
                            i8 = R.id.wp_goal_unit;
                            WheelPicker wheelPicker3 = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_goal_unit);
                            if (wheelPicker3 != null) {
                                return new ActivityActionGoalSettingBinding((LinearLayout) view, imageView, textView, textView2, wheelPicker, wheelPicker2, wheelPicker3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityActionGoalSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityActionGoalSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_action_goal_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
