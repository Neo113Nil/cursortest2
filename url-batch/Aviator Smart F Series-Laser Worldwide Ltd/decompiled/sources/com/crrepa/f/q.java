package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPNewDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPWaterIntakeInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12676a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12677b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12678c = 6;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12679d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12680e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12681f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12682g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12683h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12684i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f12685j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f12686k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f12687l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f12688m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f12689n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f12690o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f12691p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f12692q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f12693r = 4;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f12694s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f12695t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final byte f12696u = 5;

    /* renamed from: v, reason: collision with root package name */
    public static final byte f12697v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final byte f12698w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final byte f12699x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final byte f12700y = 0;

    /* renamed from: z, reason: collision with root package name */
    private static final int f12701z = 32;

    private q() {
    }

    public static byte[] a() {
        return g.a(-121, new byte[]{1});
    }

    public static byte[] b() {
        return g.a(-69, new byte[]{4, 0, 1});
    }

    public static byte[] c() {
        return g.a(-69, new byte[]{4, 6, 1});
    }

    public static byte[] d() {
        return g.a(-69, new byte[]{4, 1, 1});
    }

    public static byte[] e() {
        return g.a(-69, new byte[]{4, 5, 0});
    }

    public static byte[] a(int i8) {
        byte[] bArr = {4, 0, 0, 0, 0};
        byte[] a8 = com.crrepa.g1.c.a(i8);
        System.arraycopy(a8, 0, bArr, 3, a8.length);
        return g.a(-69, bArr);
    }

    public static byte[] b(int i8) {
        byte[] bArr = {4, 1, 0, 0, 0};
        byte[] a8 = com.crrepa.g1.c.a(i8);
        System.arraycopy(a8, 0, bArr, 3, a8.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo) {
        return g.a(119, new byte[]{1, cRPDrinkWaterPeriodInfo.isEnable(), (byte) cRPDrinkWaterPeriodInfo.getStartHour(), (byte) cRPDrinkWaterPeriodInfo.getStartMinute(), (byte) cRPDrinkWaterPeriodInfo.getCount(), (byte) cRPDrinkWaterPeriodInfo.getPeriod(), (byte) cRPDrinkWaterPeriodInfo.getCurrentCups()});
    }

    public static byte[] b(CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        byte[] bArr = {4, 3, 0, cRPWaterIntakeInfo.getType().getValue(), (byte) cRPWaterIntakeInfo.getId(), (byte) cRPWaterIntakeInfo.getHour(), (byte) cRPWaterIntakeInfo.getMinutes(), 0, 0};
        byte[] a8 = com.crrepa.g1.c.a(cRPWaterIntakeInfo.getWaterIntake());
        System.arraycopy(a8, 0, bArr, 7, a8.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo) {
        return g.a(-69, new byte[]{4, 6, 0, cRPNewDrinkWaterPeriodInfo.isEnable(), (byte) cRPNewDrinkWaterPeriodInfo.getStartHour(), (byte) cRPNewDrinkWaterPeriodInfo.getStartMinutes(), (byte) cRPNewDrinkWaterPeriodInfo.getCount(), (byte) cRPNewDrinkWaterPeriodInfo.getPeriod()});
    }

    public static byte[] a(CRPWaterIntakeInfo.WaterIntakeType waterIntakeType, int i8) {
        return g.a(-69, new byte[]{4, 4, 0, waterIntakeType.getValue(), (byte) i8});
    }

    public static byte[] a(CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        byte[] bArr = {4, 2, 0, (byte) cRPWaterIntakeInfo.getId(), (byte) cRPWaterIntakeInfo.getHour(), (byte) cRPWaterIntakeInfo.getMinutes(), 0, 0};
        byte[] a8 = com.crrepa.g1.c.a(cRPWaterIntakeInfo.getWaterIntake());
        System.arraycopy(a8, 0, bArr, 6, a8.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(List<CRPWaterIntakeInfo> list) {
        int i8;
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            i8 = 0;
        } else {
            for (CRPWaterIntakeInfo cRPWaterIntakeInfo : list) {
                if (cRPWaterIntakeInfo.getType() == CRPWaterIntakeInfo.WaterIntakeType.PHONE && arrayList.size() < 32) {
                    arrayList.add(cRPWaterIntakeInfo);
                }
            }
            i8 = arrayList.size();
        }
        byte[] bArr = new byte[(i8 * 5) + 4];
        bArr[0] = 4;
        bArr[1] = 5;
        bArr[2] = 1;
        bArr[3] = (byte) i8;
        if (i8 > 0) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                CRPWaterIntakeInfo cRPWaterIntakeInfo2 = (CRPWaterIntakeInfo) arrayList.get(i9);
                int i10 = i9 * 5;
                bArr[i10 + 4] = (byte) cRPWaterIntakeInfo2.getId();
                bArr[i10 + 5] = (byte) cRPWaterIntakeInfo2.getHour();
                bArr[i10 + 6] = (byte) cRPWaterIntakeInfo2.getMinutes();
                byte[] a8 = com.crrepa.g1.c.a(cRPWaterIntakeInfo2.getWaterIntake());
                System.arraycopy(a8, 0, bArr, i10 + 7, a8.length);
            }
        }
        return g.a(-69, bArr);
    }
}
