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
public final class RunModeMapBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llRuningMapGps;

    @NonNull
    public final LinearLayout llRuningMapTime;

    @NonNull
    public final LinearLayout llRuningOrdinary;

    @NonNull
    public final RelativeLayout rlRunMap;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvRuningMapDistance;

    @NonNull
    public final TextView tvRuningMapDistanceUnit;

    @NonNull
    public final TextView tvRuningMapGpsState;

    @NonNull
    public final TextView tvRuningMapHour;

    @NonNull
    public final TextView tvRuningMapMinute;

    @NonNull
    public final TextView tvRuningMapSecond;

    private RunModeMapBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.rootView = relativeLayout;
        this.llRuningMapGps = linearLayout;
        this.llRuningMapTime = linearLayout2;
        this.llRuningOrdinary = linearLayout3;
        this.rlRunMap = relativeLayout2;
        this.tvRuningMapDistance = textView;
        this.tvRuningMapDistanceUnit = textView2;
        this.tvRuningMapGpsState = textView3;
        this.tvRuningMapHour = textView4;
        this.tvRuningMapMinute = textView5;
        this.tvRuningMapSecond = textView6;
    }

    @NonNull
    public static RunModeMapBinding bind(@NonNull View view) {
        int i8 = R.id.ll_runing_map_gps;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_map_gps);
        if (linearLayout != null) {
            i8 = R.id.ll_runing_map_time;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_map_time);
            if (linearLayout2 != null) {
                i8 = R.id.ll_runing_ordinary;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_runing_ordinary);
                if (linearLayout3 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i8 = R.id.tv_runing_map_distance;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_map_distance);
                    if (textView != null) {
                        i8 = R.id.tv_runing_map_distance_unit;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_map_distance_unit);
                        if (textView2 != null) {
                            i8 = R.id.tv_runing_map_gps_state;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_map_gps_state);
                            if (textView3 != null) {
                                i8 = R.id.tv_runing_map_hour;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_map_hour);
                                if (textView4 != null) {
                                    i8 = R.id.tv_runing_map_minute;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_map_minute);
                                    if (textView5 != null) {
                                        i8 = R.id.tv_runing_map_second;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_runing_map_second);
                                        if (textView6 != null) {
                                            return new RunModeMapBinding(relativeLayout, linearLayout, linearLayout2, linearLayout3, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static RunModeMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RunModeMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.run_mode_map, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
