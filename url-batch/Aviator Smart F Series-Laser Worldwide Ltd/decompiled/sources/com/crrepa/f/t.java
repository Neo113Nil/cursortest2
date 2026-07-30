package com.crrepa.f;

import androidx.annotation.NonNull;
import com.crrepa.ble.conn.bean.CRPAlarmInfo;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12751a = 2015;

    /* renamed from: b, reason: collision with root package name */
    private static final byte f12752b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12753c = 21;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f12754d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f12755e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f12756f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f12757g = 4;

    private t() {
    }

    public static byte[] a() {
        return g.a(33, null);
    }

    public static byte[] b() {
        return g.a(-71, new byte[]{5, 3});
    }

    public static byte[] c() {
        return g.a(-71, new byte[]{21, 4});
    }

    public static byte[] a(int i8) {
        return g.a(-71, new byte[]{5, 2, (byte) i8});
    }

    public static byte[] b(CRPAlarmInfo cRPAlarmInfo) {
        return g.a(17, c(cRPAlarmInfo));
    }

    @NonNull
    private static byte[] c(CRPAlarmInfo cRPAlarmInfo) {
        byte b8;
        int i8;
        byte[] bArr = new byte[8];
        bArr[0] = (byte) cRPAlarmInfo.getId();
        bArr[1] = cRPAlarmInfo.isEnable() ? (byte) 1 : (byte) 0;
        int repeatMode = cRPAlarmInfo.getRepeatMode();
        if (repeatMode == 0) {
            Calendar calendar = Calendar.getInstance();
            if (cRPAlarmInfo.getDate() != null) {
                calendar.setTime(cRPAlarmInfo.getDate());
            }
            i8 = ((calendar.get(1) - 2015) << 12) + ((calendar.get(2) + 1) << 8) + calendar.get(5);
            b8 = 0;
        } else {
            b8 = repeatMode != 127 ? (byte) 2 : (byte) 1;
            i8 = 0;
        }
        bArr[2] = b8;
        bArr[3] = (byte) cRPAlarmInfo.getHour();
        bArr[4] = (byte) cRPAlarmInfo.getMinute();
        System.arraycopy(com.crrepa.g1.c.b(i8), 0, bArr, 5, 2);
        bArr[7] = (byte) repeatMode;
        return bArr;
    }

    public static byte[] a(CRPAlarmInfo cRPAlarmInfo) {
        byte[] bArr = new byte[10];
        bArr[0] = 5;
        bArr[1] = 0;
        byte[] c8 = c(cRPAlarmInfo);
        System.arraycopy(c8, 0, bArr, 2, c8.length);
        return g.a(-71, bArr);
    }
}
