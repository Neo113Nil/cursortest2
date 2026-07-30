package com.crrepa.f;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPCalendarEventInfo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12733a = 8;

    /* renamed from: b, reason: collision with root package name */
    private static final byte f12734b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12735c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f12736d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12737e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f12738f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12739g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12740h = 6;

    /* renamed from: i, reason: collision with root package name */
    private static final int f12741i = 200;

    private r1() {
    }

    public static byte[] a() {
        return g.a(-71, new byte[]{8, 6});
    }

    public static byte[] b() {
        return g.a(-71, new byte[]{8, 5});
    }

    public static byte[] c() {
        return g.a(-71, new byte[]{8, 3});
    }

    public static byte[] a(int i8) {
        return g.a(-71, new byte[]{8, 2, (byte) i8});
    }

    public static byte[] b(int i8) {
        return g.a(-71, new byte[]{8, 1, (byte) i8});
    }

    public static byte[] a(CRPCalendarEventInfo cRPCalendarEventInfo) {
        if (cRPCalendarEventInfo == null) {
            return null;
        }
        byte[] a8 = a(cRPCalendarEventInfo.getTitle(), 200);
        byte[] bArr = new byte[a8.length + 12];
        bArr[0] = 8;
        bArr[1] = 0;
        bArr[2] = (byte) cRPCalendarEventInfo.getId();
        bArr[3] = (byte) a8.length;
        System.arraycopy(a8, 0, bArr, 4, a8.length);
        int length = a8.length;
        bArr[length + 4] = (byte) cRPCalendarEventInfo.getStartHour();
        bArr[length + 5] = (byte) cRPCalendarEventInfo.getStartMinute();
        bArr[length + 6] = (byte) cRPCalendarEventInfo.getEndHour();
        bArr[length + 7] = (byte) cRPCalendarEventInfo.getEndMinute();
        byte[] b8 = com.crrepa.g1.c.b(cRPCalendarEventInfo.getTime());
        System.arraycopy(b8, 0, bArr, length + 8, b8.length);
        return g.a(-71, bArr);
    }

    private static byte[] a(String str, int i8) {
        if (TextUtils.isEmpty(str)) {
            str = cn.hutool.core.text.l.SPACE;
        }
        while (true) {
            Charset charset = StandardCharsets.UTF_8;
            if (i8 >= str.getBytes(charset).length) {
                return str.getBytes(charset);
            }
            str = str.substring(0, str.length() - 1);
        }
    }

    public static byte[] a(boolean z7, int i8) {
        return g.a(-71, new byte[]{8, 4, z7 ? (byte) 1 : (byte) 0, (byte) i8});
    }
}
