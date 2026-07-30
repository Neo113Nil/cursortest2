package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityWaterCalendarBinding implements ViewBinding {

    @NonNull
    public final RecyclerView rcvWaterCalendar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppToolbarBinding waterCalendarBar;

    private ActivityWaterCalendarBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull AppToolbarBinding appToolbarBinding) {
        this.rootView = linearLayout;
        this.rcvWaterCalendar = recyclerView;
        this.waterCalendarBar = appToolbarBinding;
    }

    @NonNull
    public static ActivityWaterCalendarBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_water_calendar;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_water_calendar);
        if (recyclerView != null) {
            i8 = R.id.water_calendar_bar;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.water_calendar_bar);
            if (findChildViewById != null) {
                return new ActivityWaterCalendarBinding((LinearLayout) view, recyclerView, AppToolbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityWaterCalendarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWaterCalendarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_water_calendar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
