package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class ActivityGpsTrainingGoalBinding implements ViewBinding {

    @NonNull
    public final Button btnGoalEnter;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tabGoal;

    @NonNull
    public final ViewPager vpGoal;

    private ActivityGpsTrainingGoalBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TabLayout tabLayout, @NonNull ViewPager viewPager) {
        this.rootView = linearLayout;
        this.btnGoalEnter = button;
        this.ivTitleBack = imageView;
        this.tabGoal = tabLayout;
        this.vpGoal = viewPager;
    }

    @NonNull
    public static ActivityGpsTrainingGoalBinding bind(@NonNull View view) {
        int i8 = R.id.btn_goal_enter;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_goal_enter);
        if (button != null) {
            i8 = R.id.iv_title_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
            if (imageView != null) {
                i8 = R.id.tab_goal;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab_goal);
                if (tabLayout != null) {
                    i8 = R.id.vp_goal;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.vp_goal);
                    if (viewPager != null) {
                        return new ActivityGpsTrainingGoalBinding((LinearLayout) view, button, imageView, tabLayout, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityGpsTrainingGoalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGpsTrainingGoalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_gps_training_goal, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
