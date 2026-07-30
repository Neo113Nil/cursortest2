package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;

/* loaded from: classes2.dex */
public final class ItemHistoryDataMonthBinding implements ViewBinding {

    @NonNull
    public final CircleDisplayView cdvDailyDegreeCompletion;

    @NonNull
    private final LinearLayout rootView;

    private ItemHistoryDataMonthBinding(@NonNull LinearLayout linearLayout, @NonNull CircleDisplayView circleDisplayView) {
        this.rootView = linearLayout;
        this.cdvDailyDegreeCompletion = circleDisplayView;
    }

    @NonNull
    public static ItemHistoryDataMonthBinding bind(@NonNull View view) {
        CircleDisplayView circleDisplayView = (CircleDisplayView) ViewBindings.findChildViewById(view, R.id.cdv_daily_degree_completion);
        if (circleDisplayView != null) {
            return new ItemHistoryDataMonthBinding((LinearLayout) view, circleDisplayView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.cdv_daily_degree_completion)));
    }

    @NonNull
    public static ItemHistoryDataMonthBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemHistoryDataMonthBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_history_data_month, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
