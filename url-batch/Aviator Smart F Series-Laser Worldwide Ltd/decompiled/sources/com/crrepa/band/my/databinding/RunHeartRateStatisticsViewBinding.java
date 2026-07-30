package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class RunHeartRateStatisticsViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llRunAverageHeartRate;

    @NonNull
    public final LinearLayout llRunHeartRateStatisticsView;

    @NonNull
    public final LinearLayout llRunSteps;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvPaceUnit;

    @NonNull
    public final TextView tvRunAverageHeartRate;

    @NonNull
    public final TextView tvRunCalorie;

    @NonNull
    public final TextView tvRunDistance;

    @NonNull
    public final TextView tvRunDistanceUnit;

    @NonNull
    public final TextView tvRunPace;

    @NonNull
    public final TextView tvRunSpeed;

    @NonNull
    public final TextView tvRunSteps;

    @NonNull
    public final TextView tvSpeedUnit;

    private RunHeartRateStatisticsViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.rootView = linearLayout;
        this.llRunAverageHeartRate = linearLayout2;
        this.llRunHeartRateStatisticsView = linearLayout3;
        this.llRunSteps = linearLayout4;
        this.tvPaceUnit = textView;
        this.tvRunAverageHeartRate = textView2;
        this.tvRunCalorie = textView3;
        this.tvRunDistance = textView4;
        this.tvRunDistanceUnit = textView5;
        this.tvRunPace = textView6;
        this.tvRunSpeed = textView7;
        this.tvRunSteps = textView8;
        this.tvSpeedUnit = textView9;
    }

    @NonNull
    public static RunHeartRateStatisticsViewBinding bind(@NonNull View view) {
        int i8 = R.id.ll_run_average_heart_rate;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_run_average_heart_rate);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            i8 = R.id.ll_run_steps;
            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_run_steps);
            if (linearLayout3 != null) {
                i8 = R.id.tv_pace_unit;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pace_unit);
                if (textView != null) {
                    i8 = R.id.tv_run_average_heart_rate;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_average_heart_rate);
                    if (textView2 != null) {
                        i8 = R.id.tv_run_calorie;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_calorie);
                        if (textView3 != null) {
                            i8 = R.id.tv_run_distance;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_distance);
                            if (textView4 != null) {
                                i8 = R.id.tv_run_distance_unit;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_distance_unit);
                                if (textView5 != null) {
                                    i8 = R.id.tv_run_pace;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_pace);
                                    if (textView6 != null) {
                                        i8 = R.id.tv_run_speed;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_speed);
                                        if (textView7 != null) {
                                            i8 = R.id.tv_run_steps;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_steps);
                                            if (textView8 != null) {
                                                i8 = R.id.tv_speed_unit;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_speed_unit);
                                                if (textView9 != null) {
                                                    return new RunHeartRateStatisticsViewBinding(linearLayout2, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
    public static RunHeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RunHeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.run_heart_rate_statistics_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
