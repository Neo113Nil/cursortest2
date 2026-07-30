package com.haibin.calendarview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class WeekBar extends LinearLayout {
    private c mDelegate;

    public WeekBar(Context context) {
        super(context);
        if ("com.haibin.calendarview.WeekBar".equals(getClass().getName())) {
            LayoutInflater.from(context).inflate(R$layout.cv_week_bar, (ViewGroup) this, true);
        }
    }

    private String getWeekString(int i8, int i9) {
        String[] stringArray = getContext().getResources().getStringArray(R$array.week_string_array);
        if (i9 == 1) {
            return stringArray[i8];
        }
        if (i9 == 2) {
            return stringArray[i8 == 6 ? 0 : i8 + 1];
        }
        return stringArray[i8 != 0 ? i8 - 1 : 6];
    }

    protected int getViewIndexByCalendar(Calendar calendar, int i8) {
        int week = calendar.getWeek();
        int i9 = week + 1;
        if (i8 == 1) {
            return week;
        }
        if (i8 == 2) {
            if (i9 == 1) {
                return 6;
            }
            return week - 1;
        }
        if (i9 == 7) {
            return 0;
        }
        return i9;
    }

    protected void onDateSelected(Calendar calendar, int i8, boolean z7) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        c cVar = this.mDelegate;
        super.onMeasure(i8, cVar != null ? View.MeasureSpec.makeMeasureSpec(cVar.getWeekBarHeight(), 1073741824) : View.MeasureSpec.makeMeasureSpec(b.dipToPx(getContext(), 40.0f), 1073741824));
    }

    protected void onWeekStartChange(int i8) {
        if ("com.haibin.calendarview.WeekBar".equalsIgnoreCase(getClass().getName())) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                ((TextView) getChildAt(i9)).setText(getWeekString(i9, i8));
            }
        }
    }

    protected void setTextColor(int i8) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((TextView) getChildAt(i9)).setTextColor(i8);
        }
    }

    protected void setTextSize(int i8) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((TextView) getChildAt(i9)).setTextSize(0, i8);
        }
    }

    void setup(c cVar) {
        this.mDelegate = cVar;
        if ("com.haibin.calendarview.WeekBar".equalsIgnoreCase(getClass().getName())) {
            setTextSize(this.mDelegate.getWeekTextSize());
            setTextColor(cVar.getWeekTextColor());
            setBackgroundColor(cVar.getWeekBackground());
            setPadding(cVar.getCalendarPaddingLeft(), 0, cVar.getCalendarPaddingRight(), 0);
        }
    }
}
