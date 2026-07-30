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
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;

/* loaded from: classes2.dex */
public final class ItemLastWeekStepStandardBinding implements ViewBinding {

    @NonNull
    public final CircleDisplayView cdDailyStepStandard;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvActivityDate;

    private ItemLastWeekStepStandardBinding(@NonNull LinearLayout linearLayout, @NonNull CircleDisplayView circleDisplayView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.cdDailyStepStandard = circleDisplayView;
        this.tvActivityDate = textView;
    }

    @NonNull
    public static ItemLastWeekStepStandardBinding bind(@NonNull View view) {
        int i8 = R.id.cd_daily_step_standard;
        CircleDisplayView circleDisplayView = (CircleDisplayView) ViewBindings.findChildViewById(view, R.id.cd_daily_step_standard);
        if (circleDisplayView != null) {
            i8 = R.id.tv_activity_date;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_activity_date);
            if (textView != null) {
                return new ItemLastWeekStepStandardBinding((LinearLayout) view, circleDisplayView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemLastWeekStepStandardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemLastWeekStepStandardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_last_week_step_standard, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
