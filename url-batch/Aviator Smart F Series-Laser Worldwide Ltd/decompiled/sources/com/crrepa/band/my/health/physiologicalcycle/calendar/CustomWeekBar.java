package com.crrepa.band.my.health.physiologicalcycle.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.WeekBar;

/* loaded from: classes2.dex */
public class CustomWeekBar extends WeekBar {
    private int mPreSelectedIndex;
    private String[] weeks;

    public CustomWeekBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.custom_week_bar, (ViewGroup) this, true);
        this.weeks = getWeeks();
    }

    private String getWeekString(int i8, int i9) {
        if (i9 == 1) {
            return this.weeks[i8];
        }
        if (i9 == 2) {
            return this.weeks[i8 == 6 ? 0 : i8 + 1];
        }
        return this.weeks[i8 != 0 ? i8 - 1 : 6];
    }

    private String[] getWeeks() {
        return new String[]{getContext().getString(R.string.sunday_shorthand), getContext().getString(R.string.monday_shorthand), getContext().getString(R.string.tuesday_shorthand), getContext().getString(R.string.wednesday_shorthand), getContext().getString(R.string.thursday_shorthand), getContext().getString(R.string.friday_shorthand), getContext().getString(R.string.saturday_shorthand)};
    }

    @Override // com.haibin.calendarview.WeekBar
    protected void onDateSelected(Calendar calendar, int i8, boolean z7) {
        getChildAt(this.mPreSelectedIndex).setSelected(false);
        int viewIndexByCalendar = getViewIndexByCalendar(calendar, i8);
        getChildAt(viewIndexByCalendar).setSelected(true);
        this.mPreSelectedIndex = viewIndexByCalendar;
    }

    @Override // com.haibin.calendarview.WeekBar
    protected void onWeekStartChange(int i8) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((TextView) getChildAt(i9)).setText(getWeekString(i9, i8));
        }
    }
}
