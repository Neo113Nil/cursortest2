package com.crrepa.band.my.profile.userinfo.wheelpicker.widgets;

import com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelDatePicker;
import java.util.Date;

/* loaded from: classes2.dex */
public interface b {
    Date getCurrentDate();

    int getItemAlignDay();

    int getItemAlignMonth();

    int getItemAlignYear();

    WheelDayPicker getWheelDayPicker();

    WheelMonthPicker getWheelMonthPicker();

    WheelYearPicker getWheelYearPicker();

    void setItemAlignDay(int i8);

    void setItemAlignMonth(int i8);

    void setItemAlignYear(int i8);

    void setOnDateSelectedListener(WheelDatePicker.a aVar);
}
