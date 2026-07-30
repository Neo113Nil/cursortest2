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
public final class GpsRunStatisticsDataBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llFirstSectionData;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvRunCalories;

    @NonNull
    public final TextView tvRunPace;

    @NonNull
    public final TextView tvRunPaceUnit;

    @NonNull
    public final TextView tvRunTimeHour;

    @NonNull
    public final TextView tvRunTimeMinute;

    private GpsRunStatisticsDataBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.llFirstSectionData = linearLayout2;
        this.tvRunCalories = textView;
        this.tvRunPace = textView2;
        this.tvRunPaceUnit = textView3;
        this.tvRunTimeHour = textView4;
        this.tvRunTimeMinute = textView5;
    }

    @NonNull
    public static GpsRunStatisticsDataBinding bind(@NonNull View view) {
        int i8 = R.id.ll_first_section_data;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_first_section_data);
        if (linearLayout != null) {
            i8 = R.id.tv_run_calories;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_calories);
            if (textView != null) {
                i8 = R.id.tv_run_pace;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_pace);
                if (textView2 != null) {
                    i8 = R.id.tv_run_pace_unit;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_pace_unit);
                    if (textView3 != null) {
                        i8 = R.id.tv_run_time_hour;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_time_hour);
                        if (textView4 != null) {
                            i8 = R.id.tv_run_time_minute;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_time_minute);
                            if (textView5 != null) {
                                return new GpsRunStatisticsDataBinding((LinearLayout) view, linearLayout, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static GpsRunStatisticsDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static GpsRunStatisticsDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.gps_run_statistics_data, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
