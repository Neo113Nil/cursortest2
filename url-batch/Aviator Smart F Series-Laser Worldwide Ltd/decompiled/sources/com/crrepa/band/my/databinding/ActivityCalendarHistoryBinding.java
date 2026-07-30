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
public final class ActivityCalendarHistoryBinding implements ViewBinding {

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    public final WeeklyArrangementBinding includeWeeklyArrangement;

    @NonNull
    public final RecyclerView rcvHistoryCalendar;

    @NonNull
    private final LinearLayout rootView;

    private ActivityCalendarHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull AppToolbarBinding appToolbarBinding, @NonNull WeeklyArrangementBinding weeklyArrangementBinding, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.includeTitleBar = appToolbarBinding;
        this.includeWeeklyArrangement = weeklyArrangementBinding;
        this.rcvHistoryCalendar = recyclerView;
    }

    @NonNull
    public static ActivityCalendarHistoryBinding bind(@NonNull View view) {
        int i8 = R.id.include_title_bar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title_bar);
        if (findChildViewById != null) {
            AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_weekly_arrangement);
            if (findChildViewById2 != null) {
                WeeklyArrangementBinding bind2 = WeeklyArrangementBinding.bind(findChildViewById2);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_history_calendar);
                if (recyclerView != null) {
                    return new ActivityCalendarHistoryBinding((LinearLayout) view, bind, bind2, recyclerView);
                }
                i8 = R.id.rcv_history_calendar;
            } else {
                i8 = R.id.include_weekly_arrangement;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityCalendarHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCalendarHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_calendar_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
