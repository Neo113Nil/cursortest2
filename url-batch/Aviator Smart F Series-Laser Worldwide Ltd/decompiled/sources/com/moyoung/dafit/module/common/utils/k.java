package com.moyoung.dafit.module.common.utils;

import java.util.Calendar;

/* loaded from: classes4.dex */
public class k {
    private k() {
    }

    public static Calendar getCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(1);
        return calendar;
    }
}
