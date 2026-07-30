package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.WaveCalendarView;

/* loaded from: classes2.dex */
public final class ItemWaterCalendarDayBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCalendarDay;

    @NonNull
    public final WaveCalendarView wcvWater;

    private ItemWaterCalendarDayBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull WaveCalendarView waveCalendarView) {
        this.rootView = relativeLayout;
        this.tvCalendarDay = textView;
        this.wcvWater = waveCalendarView;
    }

    @NonNull
    public static ItemWaterCalendarDayBinding bind(@NonNull View view) {
        int i8 = R.id.tv_calendar_day;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calendar_day);
        if (textView != null) {
            i8 = R.id.wcv_water;
            WaveCalendarView waveCalendarView = (WaveCalendarView) ViewBindings.findChildViewById(view, R.id.wcv_water);
            if (waveCalendarView != null) {
                return new ItemWaterCalendarDayBinding((RelativeLayout) view, textView, waveCalendarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemWaterCalendarDayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemWaterCalendarDayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_water_calendar_day, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
