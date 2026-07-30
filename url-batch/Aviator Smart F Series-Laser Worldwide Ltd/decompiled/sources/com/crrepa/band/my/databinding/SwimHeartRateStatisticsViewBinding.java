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
public final class SwimHeartRateStatisticsViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llSwimAverageHeartRate;

    @NonNull
    public final LinearLayout llSwimHeartRateStatisticsView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvSwimAverageHeartRate;

    @NonNull
    public final TextView tvSwimCalorie;

    private SwimHeartRateStatisticsViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.llSwimAverageHeartRate = linearLayout2;
        this.llSwimHeartRateStatisticsView = linearLayout3;
        this.tvSwimAverageHeartRate = textView;
        this.tvSwimCalorie = textView2;
    }

    @NonNull
    public static SwimHeartRateStatisticsViewBinding bind(@NonNull View view) {
        int i8 = R.id.ll_swim_average_heart_rate;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_swim_average_heart_rate);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            i8 = R.id.tv_swim_average_heart_rate;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_average_heart_rate);
            if (textView != null) {
                i8 = R.id.tv_swim_calorie;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_calorie);
                if (textView2 != null) {
                    return new SwimHeartRateStatisticsViewBinding(linearLayout2, linearLayout, linearLayout2, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SwimHeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SwimHeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.swim_heart_rate_statistics_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
