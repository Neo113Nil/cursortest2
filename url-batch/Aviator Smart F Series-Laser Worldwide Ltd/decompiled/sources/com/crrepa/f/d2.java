package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPDailyGoalsInfo;
import com.crrepa.ble.conn.bean.CRPTrainingDayInfo;

/* loaded from: classes3.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte f12508a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12509b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12510c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12511d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12512e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12513f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12514g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12515h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12516i = 4;

    private d2() {
    }

    public static byte[] a() {
        return a((byte) 0);
    }

    public static byte[] b() {
        return a((byte) 1);
    }

    public static byte[] c() {
        return a((byte) 2);
    }

    private static byte[] a(byte b8) {
        return g.a(-71, new byte[]{16, b8});
    }

    public static byte[] b(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        return a(cRPDailyGoalsInfo, (byte) 1);
    }

    public static byte[] a(CRPDailyGoalsInfo cRPDailyGoalsInfo) {
        return a(cRPDailyGoalsInfo, (byte) 0);
    }

    private static byte[] a(CRPDailyGoalsInfo cRPDailyGoalsInfo, byte b8) {
        byte[] bArr = new byte[22];
        bArr[0] = 0;
        bArr[1] = b8;
        byte[] b9 = com.crrepa.g1.c.b(cRPDailyGoalsInfo.getSteps());
        bArr[2] = 1;
        System.arraycopy(b9, 0, bArr, 3, b9.length);
        byte[] b10 = com.crrepa.g1.c.b(cRPDailyGoalsInfo.getCalories());
        bArr[7] = 2;
        System.arraycopy(b10, 0, bArr, 8, b10.length);
        byte[] b11 = com.crrepa.g1.c.b(cRPDailyGoalsInfo.getTrainingTime());
        bArr[12] = 4;
        System.arraycopy(b11, 0, bArr, 13, b11.length);
        return g.a(-71, bArr);
    }

    public static byte[] a(CRPTrainingDayInfo cRPTrainingDayInfo) {
        return g.a(-71, new byte[]{0, 2, cRPTrainingDayInfo.isEnable() ? (byte) 1 : (byte) 0, cRPTrainingDayInfo.getTrainingDays()});
    }
}
