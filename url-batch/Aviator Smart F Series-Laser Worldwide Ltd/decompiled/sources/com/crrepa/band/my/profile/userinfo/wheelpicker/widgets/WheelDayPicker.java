package com.crrepa.band.my.profile.userinfo.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class WheelDayPicker extends WheelPicker implements c {
    private static final Map<Integer, List<Integer>> DAYS = new HashMap();
    private Calendar mCalendar;
    private int mMonth;
    private int mSelectedDay;
    private int mYear;

    public WheelDayPicker(Context context) {
        this(context, null);
    }

    private void updateDays() {
        this.mCalendar.set(1, this.mYear);
        this.mCalendar.set(2, this.mMonth);
        int actualMaximum = this.mCalendar.getActualMaximum(5);
        List<Integer> list = DAYS.get(Integer.valueOf(actualMaximum));
        if (list == null) {
            list = new ArrayList<>();
            for (int i8 = 1; i8 <= actualMaximum; i8++) {
                list.add(Integer.valueOf(i8));
            }
            DAYS.put(Integer.valueOf(actualMaximum), list);
        }
        super.setData(list);
    }

    private void updateSelectedDay() {
        setSelectedItemPosition(this.mSelectedDay - 1);
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public int getCurrentDay() {
        return Integer.valueOf(String.valueOf(getData().get(getCurrentItemPosition()))).intValue();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public int getMonth() {
        return this.mMonth;
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public int getSelectedDay() {
        return this.mSelectedDay;
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public int getYear() {
        return this.mYear;
    }

    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker, com.moyoung.dafit.module.common.widgets.wheelpicker.b
    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelDayPicker");
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public void setMonth(int i8) {
        this.mMonth = i8 - 1;
        updateDays();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public void setSelectedDay(int i8) {
        this.mSelectedDay = i8;
        updateSelectedDay();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public void setYear(int i8) {
        this.mYear = i8;
        updateDays();
    }

    @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.c
    public void setYearAndMonth(int i8, int i9) {
        this.mYear = i8;
        this.mMonth = i9 - 1;
        updateDays();
    }

    public WheelDayPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Calendar calendar = Calendar.getInstance();
        this.mCalendar = calendar;
        this.mYear = calendar.get(1);
        this.mMonth = this.mCalendar.get(2);
        updateDays();
        this.mSelectedDay = this.mCalendar.get(5);
        updateSelectedDay();
    }
}
