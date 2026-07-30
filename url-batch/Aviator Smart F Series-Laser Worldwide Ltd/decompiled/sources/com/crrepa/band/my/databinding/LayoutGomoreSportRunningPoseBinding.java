package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutGomoreSportRunningPoseBinding implements ViewBinding {

    @NonNull
    public final View lineAvgStanceBalance;

    @NonNull
    public final LinearLayout llGomoreSportRunningPose;

    @NonNull
    public final RelativeLayout rlAvgStanceBalanceLeft;

    @NonNull
    public final RelativeLayout rlAvgStanceBalanceRight;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAvgAvgVerticalOscillationUnit;

    @NonNull
    public final TextView tvAvgRunPower;

    @NonNull
    public final TextView tvAvgRunPowerUnit;

    @NonNull
    public final TextView tvAvgStanceBalanceLeft;

    @NonNull
    public final TextView tvAvgStanceBalanceRight;

    @NonNull
    public final TextView tvAvgStanceTime;

    @NonNull
    public final TextView tvAvgStanceTimeUnit;

    @NonNull
    public final TextView tvAvgVerticalOscillation;

    @NonNull
    public final TextView tvRunningPoseTitle;

    private LayoutGomoreSportRunningPoseBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.rootView = linearLayout;
        this.lineAvgStanceBalance = view;
        this.llGomoreSportRunningPose = linearLayout2;
        this.rlAvgStanceBalanceLeft = relativeLayout;
        this.rlAvgStanceBalanceRight = relativeLayout2;
        this.tvAvgAvgVerticalOscillationUnit = textView;
        this.tvAvgRunPower = textView2;
        this.tvAvgRunPowerUnit = textView3;
        this.tvAvgStanceBalanceLeft = textView4;
        this.tvAvgStanceBalanceRight = textView5;
        this.tvAvgStanceTime = textView6;
        this.tvAvgStanceTimeUnit = textView7;
        this.tvAvgVerticalOscillation = textView8;
        this.tvRunningPoseTitle = textView9;
    }

    @NonNull
    public static LayoutGomoreSportRunningPoseBinding bind(@NonNull View view) {
        int i8 = R.id.line_avg_stance_balance;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_avg_stance_balance);
        if (findChildViewById != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.rl_avg_stance_balance_left;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_avg_stance_balance_left);
            if (relativeLayout != null) {
                i8 = R.id.rl_avg_stance_balance_right;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_avg_stance_balance_right);
                if (relativeLayout2 != null) {
                    i8 = R.id.tv_avg_avg_vertical_oscillation_unit;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_avg_vertical_oscillation_unit);
                    if (textView != null) {
                        i8 = R.id.tv_avg_run_power;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_run_power);
                        if (textView2 != null) {
                            i8 = R.id.tv_avg_run_power_unit;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_run_power_unit);
                            if (textView3 != null) {
                                i8 = R.id.tv_avg_stance_balance_left;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_stance_balance_left);
                                if (textView4 != null) {
                                    i8 = R.id.tv_avg_stance_balance_right;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_stance_balance_right);
                                    if (textView5 != null) {
                                        i8 = R.id.tv_avg_stance_time;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_stance_time);
                                        if (textView6 != null) {
                                            i8 = R.id.tv_avg_stance_time_unit;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_stance_time_unit);
                                            if (textView7 != null) {
                                                i8 = R.id.tv_avg_vertical_oscillation;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avg_vertical_oscillation);
                                                if (textView8 != null) {
                                                    i8 = R.id.tv_running_pose_title;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_running_pose_title);
                                                    if (textView9 != null) {
                                                        return new LayoutGomoreSportRunningPoseBinding(linearLayout, findChildViewById, linearLayout, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static LayoutGomoreSportRunningPoseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutGomoreSportRunningPoseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_gomore_sport_running_pose, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
