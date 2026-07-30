package com.crrepa.g1;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes3.dex */
public class f {
    public static int a() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.get(11);
    }

    public static int a(int i8, int i9) {
        return (i8 * 60) + i9;
    }

    public static String a(String str) {
        Date date = new Date(System.currentTimeMillis());
        return TextUtils.isEmpty(str) ? date.toString() : a(date, str);
    }

    public static String a(Date date, String str) {
        if (date == null && TextUtils.isEmpty(str)) {
            return null;
        }
        return new SimpleDateFormat(str).format(date);
    }
}
