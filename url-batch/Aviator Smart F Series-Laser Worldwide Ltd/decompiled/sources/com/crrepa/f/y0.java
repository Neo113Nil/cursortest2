package com.crrepa.f;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPWorldClockInfo;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12810a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12811b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12812c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12813d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12814e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12815f = 4;

    private y0() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{0, 0});
    }

    public static byte[] b(byte b8) {
        return g.a(-69, new byte[]{0, 1, b8});
    }

    public static byte[] a(byte b8) {
        return g.a(-69, new byte[]{0, 3, b8});
    }

    public static byte[] a(CRPWorldClockInfo cRPWorldClockInfo) {
        if (cRPWorldClockInfo == null) {
            return null;
        }
        String city = cRPWorldClockInfo.getCity();
        if (TextUtils.isEmpty(city)) {
            return null;
        }
        byte[] a8 = com.crrepa.g1.c.a(city, 40, StandardCharsets.UTF_8);
        byte[] bArr = new byte[a8.length + 19];
        bArr[0] = 0;
        bArr[1] = 2;
        bArr[2] = cRPWorldClockInfo.getId();
        byte[] b8 = com.crrepa.g1.c.b(cRPWorldClockInfo.getTimeZone());
        System.arraycopy(b8, 0, bArr, 3, b8.length);
        int length = b8.length + 3;
        byte[] d8 = com.crrepa.g1.c.d((long) (cRPWorldClockInfo.getLongitude() * 1000000.0d));
        System.arraycopy(d8, 0, bArr, length, d8.length);
        int length2 = length + d8.length;
        byte[] d9 = com.crrepa.g1.c.d((long) (cRPWorldClockInfo.getLatitude() * 1000000.0d));
        System.arraycopy(d9, 0, bArr, length2, d9.length);
        int length3 = length2 + d9.length;
        byte[] b9 = com.crrepa.g1.c.b(cRPWorldClockInfo.getJetLag());
        System.arraycopy(b9, 0, bArr, length3, b9.length);
        System.arraycopy(a8, 0, bArr, length3 + b9.length, a8.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = 0;
        bArr2[1] = 4;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return g.a(-69, bArr2);
    }
}
