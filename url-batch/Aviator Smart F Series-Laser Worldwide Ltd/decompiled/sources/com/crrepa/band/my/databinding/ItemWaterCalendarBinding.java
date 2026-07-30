package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemWaterCalendarBinding implements ViewBinding {

    @NonNull
    public final RecyclerView rcvCalendarDay;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCalendarMonth;

    private ItemWaterCalendarBinding(@NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.rcvCalendarDay = recyclerView;
        this.tvCalendarMonth = textView;
    }

    @NonNull
    public static ItemWaterCalendarBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_calendar_day;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_calendar_day);
        if (recyclerView != null) {
            i8 = R.id.tv_calendar_month;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calendar_month);
            if (textView != null) {
                return new ItemWaterCalendarBinding((RelativeLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemWaterCalendarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemWaterCalendarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_water_calendar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
