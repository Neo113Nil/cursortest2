package com.crrepa.g1;

import java.util.Calendar;

/* loaded from: classes3.dex */
public class e {
    private e() {
    }

    public static int a() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static long a(int i8) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, i8);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
