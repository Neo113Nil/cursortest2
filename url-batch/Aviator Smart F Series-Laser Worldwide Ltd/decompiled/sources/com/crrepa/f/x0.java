package com.crrepa.f;

import com.crrepa.ble.conn.type.CRPHistoryDay;

/* loaded from: classes3.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12796a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final byte f12797b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f12798c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12799d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12800e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12801f = 1;

    private x0() {
    }

    public static byte[] a() {
        return g.a(-72, new byte[]{3});
    }

    public static byte[] b() {
        return g.a(50, null);
    }

    public static byte[] a(byte b8) {
        CRPHistoryDay cRPHistoryDay = CRPHistoryDay.THE_DAY_BEFORE_YESTERDAY;
        if (b8 <= cRPHistoryDay.getValue()) {
            return g.a(51, new byte[]{b8 == cRPHistoryDay.getValue() ? (byte) 4 : (byte) 3});
        }
        return null;
    }

    public static byte[] b(byte b8) {
        return g.a(-74, new byte[]{1, b8});
    }

    public static byte[] a(byte b8, byte b9) {
        return g.a(-72, new byte[]{2, b8, b9});
    }

    public static byte[] a(CRPHistoryDay cRPHistoryDay) {
        return g.a(-68, cRPHistoryDay == CRPHistoryDay.TODAY ? new byte[]{1, cRPHistoryDay.getValue()} : new byte[]{1, 1, cRPHistoryDay.getValue()});
    }
}
