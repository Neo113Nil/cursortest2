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
public final class BasketballHeartRateStatisticsViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llBasketballAverageHeartRate;

    @NonNull
    public final LinearLayout llBasketballSteps;

    @NonNull
    public final LinearLayout rlBasketballHeartRateStatisticsView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvBasketballAverageHeartRate;

    @NonNull
    public final TextView tvBasketballCalorie;

    @NonNull
    public final TextView tvBasketballSteps;

    private BasketballHeartRateStatisticsViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.llBasketballAverageHeartRate = linearLayout2;
        this.llBasketballSteps = linearLayout3;
        this.rlBasketballHeartRateStatisticsView = linearLayout4;
        this.tvBasketballAverageHeartRate = textView;
        this.tvBasketballCalorie = textView2;
        this.tvBasketballSteps = textView3;
    }

    @NonNull
    public static BasketballHeartRateStatisticsViewBinding bind(@NonNull View view) {
        int i8 = R.id.ll_basketball_average_heart_rate;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_basketball_average_heart_rate);
        if (linearLayout != null) {
            i8 = R.id.ll_basketball_steps;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_basketball_steps);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view;
                i8 = R.id.tv_basketball_average_heart_rate;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_basketball_average_heart_rate);
                if (textView != null) {
                    i8 = R.id.tv_basketball_calorie;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_basketball_calorie);
                    if (textView2 != null) {
                        i8 = R.id.tv_basketball_steps;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_basketball_steps);
                        if (textView3 != null) {
                            return new BasketballHeartRateStatisticsViewBinding(linearLayout3, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static BasketballHeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BasketballHeartRateStatisticsViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.basketball_heart_rate_statistics_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
