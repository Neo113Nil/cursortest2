package com.crrepa.band.my.databinding;

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
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.CircleProgressView;

/* loaded from: classes2.dex */
public final class RunModeNormalBinding implements ViewBinding {

    @NonNull
    public final CircleProgressView cpvRuningPasueProgress;

    @NonNull
    public final ImageView ivRuningPause;

    @NonNull
    public final LinearLayout llRuningDistance;

    @NonNull
    public final LinearLayout llRuningFirstline;

    @NonNull
    public final LinearLayout llRuningGps;

    @NonNull
    public final LinearLayout llRuningMap;

    @NonNull
    public final LinearLayout llRuningOption;

    @NonNull
    public final LinearLayout llRuningSecondline;

    @NonNull
    public final LinearLayout llRuningTime;

    @NonNull
    public final LinearLayout llRunningCalorie;

    @NonNull
    public final LinearLayout llRunningHr;

    @NonNull
    public final LinearLayout llRunningSteps;

    @NonNull
    public final RelativeLayout rlRunNormal;

    @NonNull
    public final RelativeLayout rlRuningPause;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvRuningCalories;

    @NonNull
    public final TextView tvRuningContinue;

    @NonNull
    public final TextView tvRuningDistance;

    @NonNull
    public final TextView tvRuningDistanceUnit;

    @NonNull
    public final TextView tvRuningFinish;

    @NonNull
    public final TextView tvRuningGpsState;

    @NonNull
    public final TextView tvRuningHeart;

    @NonNull
    public final TextView tvRuningHour;

    @NonNull
    public final TextView tvRuningMinute;

    @NonNull
    public final TextView tvRuningSecond;

    @NonNull
    public final TextView tvRuningSpeed;

    @NonNull
    public final TextView tvRuningSpeedUnit;

    @NonNull
    public final TextView tvRuningStep;

    @NonNull
    public final View viewFirstLine;

    @NonNull
    public final View viewSecondLine;

    private RunModeNormalBinding(@NonNull RelativeLayout relativeLayout, @NonNull CircleProgressView circleProgressView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8, @NonNull LinearLayout linearLayout9, @NonNull LinearLayout linearLayout10, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull View view, @NonNull View view2) {
        this.rootView = relativeLayout;
        this.cpvRuningPasueProgress = circleProgressView;
        this.ivRuningPause = imageView;
        this.llRuningDistance = linearLayout;
        this.llRuningFirstline = linearLayout2;
        this.llRuningGps = linearLayout3;
        this.llRuningMap = linearLayout4;
        this.llRuningOption = linearLayout5;
        this.llRuningSecondline = linearLayout6;
        this.llRuningTime = linearLayout7;
        this.llRunningCalorie = linearLayout8;
        this.llRunningHr = linearLayout9;
        this.llRunningSteps = linearLayout10;
        this.rlRunNormal = relativeLayout2;
        this.rlRuningPause = relativeLayout3;
        this.tvRuningCalories = textView;
        this.tvRuningContinue = textView2;
        this.tvRuningDistance = textView3;
        this.tvRuningDistanceUnit = textView4;
        this.tvRuningFinish = textView5;
        this.tvRuningGpsState = textView6;
        this.tvRuningHeart = textView7;
        this.tvRuningHour = textView8;
        this.tvRuningMinute = textView9;
        this.tvRuningSecond = textView10;
        this.tvRuningSpeed = textView11;
        this.tvRuningSpeedUnit = textView12;
        this.tvRuningStep = textView13;
        this.viewFirstLine = view;
        this.viewSecondLine = view2;
    }

    @NonNull
    public static RunModeNormalBinding bind(@NonNull View view) {
        int i8 = R.id.cpv_runing_pasue_progress;
        CircleProgressView circleProgressView = (CircleProgressView) ViewBindings.findChildViewById(view, R.id.cpv_runing_pasue_progress);
        if (circleProgressView != null) {
            i8 = R.id.iv_runing_pause;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_runing_pause);
            if (imageView != null) {
                i8 = R.id.ll_runing_distance;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_distance);
                if (linearLayout != null) {
                    i8 = R.id.ll_runing_firstline;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_firstline);
                    if (linearLayout2 != null) {
                        i8 = R.id.ll_runing_gps;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_gps);
                        if (linearLayout3 != null) {
                            i8 = R.id.ll_runing_map;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_map);
                            if (linearLayout4 != null) {
                                i8 = R.id.ll_runing_option;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_option);
                                if (linearLayout5 != null) {
                                    i8 = R.id.ll_runing_secondline;
                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_secondline);
                                    if (linearLayout6 != null) {
                                        i8 = R.id.ll_runing_time;
                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_time);
                                        if (linearLayout7 != null) {
                                            i8 = R.id.ll_running_calorie;
                                            LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_running_calorie);
                                            if (linearLayout8 != null) {
                                                i8 = R.id.ll_running_hr;
                                                LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_running_hr);
                                                if (linearLayout9 != null) {
                                                    i8 = R.id.ll_running_steps;
                                                    LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_running_steps);
                                                    if (linearLayout10 != null) {
                                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                                        i8 = R.id.rl_runing_pause;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_runing_pause);
                                                        if (relativeLayout2 != null) {
                                                            i8 = R.id.tv_runing_calories;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_calories);
                                                            if (textView != null) {
                                                                i8 = R.id.tv_runing_continue;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_continue);
                                                                if (textView2 != null) {
                                                                    i8 = R.id.tv_runing_distance;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_distance);
                                                                    if (textView3 != null) {
                                                                        i8 = R.id.tv_runing_distance_unit;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_distance_unit);
                                                                        if (textView4 != null) {
                                                                            i8 = R.id.tv_runing_finish;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_finish);
                                                                            if (textView5 != null) {
                                                                                i8 = R.id.tv_runing_gps_state;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_gps_state);
                                                                                if (textView6 != null) {
                                                                                    i8 = R.id.tv_runing_heart;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_heart);
                                                                                    if (textView7 != null) {
                                                                                        i8 = R.id.tv_runing_hour;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_hour);
                                                                                        if (textView8 != null) {
                                                                                            i8 = R.id.tv_runing_minute;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_minute);
                                                                                            if (textView9 != null) {
                                                                                                i8 = R.id.tv_runing_second;
                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_second);
                                                                                                if (textView10 != null) {
                                                                                                    i8 = R.id.tv_runing_speed;
                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_speed);
                                                                                                    if (textView11 != null) {
                                                                                                        i8 = R.id.tv_runing_speed_unit;
                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_speed_unit);
                                                                                                        if (textView12 != null) {
                                                                                                            i8 = R.id.tv_runing_step;
                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_step);
                                                                                                            if (textView13 != null) {
                                                                                                                i8 = R.id.view_first_line;
                                                                                                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_first_line);
                                                                                                                if (findChildViewById != null) {
                                                                                                                    i8 = R.id.view_second_line;
                                                                                                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view_second_line);
                                                                                                                    if (findChildViewById2 != null) {
                                                                                                                        return new RunModeNormalBinding(relativeLayout, circleProgressView, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, findChildViewById, findChildViewById2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static RunModeNormalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RunModeNormalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.run_mode_normal, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
