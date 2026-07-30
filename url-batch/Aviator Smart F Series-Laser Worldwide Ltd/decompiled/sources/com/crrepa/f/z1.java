package com.crrepa.f;

import com.crrepa.ble.util.BleLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class z1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f12832a = 7;

    /* renamed from: b, reason: collision with root package name */
    private static final String f12833b = "yyyy-MM-dd HH:mm:ss";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12834c = "GMT+8";

    private z1() {
    }

    public static int a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return -1;
        }
        return bArr[0];
    }

    public static byte[] b() {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(f12834c));
        try {
            date = simpleDateFormat.parse(format);
        } catch (ParseException e8) {
            e8.printStackTrace();
            date = null;
        }
        if (date == null) {
            return null;
        }
        byte[] bArr = new byte[5];
        System.arraycopy(com.crrepa.g1.c.c(date.getTime() / 1000), 0, bArr, 0, 4);
        bArr[4] = 8;
        return g.a(49, bArr);
    }

    public static byte[] c() {
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
        BleLog.d("defaultRawOffset: " + offset);
        byte[] bArr = new byte[6];
        bArr[0] = 7;
        bArr[1] = 0;
        byte[] d8 = com.crrepa.g1.c.d(offset);
        System.arraycopy(d8, 0, bArr, 2, d8.length);
        return g.a(-69, bArr);
    }

    public static long a(long j8) {
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        int dSTSavings = timeZone.getDSTSavings();
        boolean inDaylightTime = timeZone.inDaylightTime(new Date(j8));
        long rawOffset2 = j8 - (rawOffset - TimeZone.getTimeZone(f12834c).getRawOffset());
        return inDaylightTime ? rawOffset2 - dSTSavings : rawOffset2;
    }

    public static byte[] a() {
        return g.a(39, null);
    }

    public static byte[] a(int i8) {
        return g.a(23, new byte[]{(byte) i8});
    }
}
