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
public final class LastStepStatisticsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llGomoreData;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvActionCalories;

    @NonNull
    public final TextView tvActionDistance;

    @NonNull
    public final TextView tvActionTime;

    @NonNull
    public final TextView tvCarb;

    @NonNull
    public final TextView tvDistanceUnit;

    @NonNull
    public final TextView tvFat;

    @NonNull
    public final TextView tvMetabolism;

    private LastStepStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = linearLayout;
        this.llGomoreData = linearLayout2;
        this.tvActionCalories = textView;
        this.tvActionDistance = textView2;
        this.tvActionTime = textView3;
        this.tvCarb = textView4;
        this.tvDistanceUnit = textView5;
        this.tvFat = textView6;
        this.tvMetabolism = textView7;
    }

    @NonNull
    public static LastStepStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.ll_gomore_data;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_gomore_data);
        if (linearLayout != null) {
            i8 = R.id.tv_action_calories;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_calories);
            if (textView != null) {
                i8 = R.id.tv_action_distance;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_distance);
                if (textView2 != null) {
                    i8 = R.id.tv_action_time;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_time);
                    if (textView3 != null) {
                        i8 = R.id.tv_carb;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_carb);
                        if (textView4 != null) {
                            i8 = R.id.tv_distance_unit;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_distance_unit);
                            if (textView5 != null) {
                                i8 = R.id.tv_fat;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fat);
                                if (textView6 != null) {
                                    i8 = R.id.tv_metabolism;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_metabolism);
                                    if (textView7 != null) {
                                        return new LastStepStatisticsBinding((LinearLayout) view, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static LastStepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LastStepStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.last_step_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
