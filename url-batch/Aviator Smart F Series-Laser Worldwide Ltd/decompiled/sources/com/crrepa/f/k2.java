package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPMuslimLocationInfo;
import com.crrepa.ble.conn.bean.CRPMuslimPrayerCalculationInfo;
import com.crrepa.ble.conn.bean.CRPMuslimTasbihSettingInfo;
import com.crrepa.ble.conn.type.CRPMuslimPrayerNotifcationType;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12606a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12607b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12608c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12609d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12610e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12611f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12612g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12613h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12614i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f12615j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f12616k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f12617l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f12618m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f12619n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f12620o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f12621p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f12622q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f12623r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f12624s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f12625t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final byte f12626u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final byte f12627v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final byte f12628w = 1;

    private k2() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{1, 5, 1});
    }

    public static byte[] b() {
        return g.a(-69, new byte[]{1, 6, 1});
    }

    public static byte[] c() {
        return g.a(-69, new byte[]{1, 4, 2});
    }

    public static byte[] d() {
        return g.a(-69, new byte[]{1, 2, 2});
    }

    public static byte[] e() {
        return g.a(-69, new byte[]{1, 3, 2});
    }

    public static byte[] f() {
        return g.a(-69, new byte[]{1, 0, 1});
    }

    public static byte[] a(CRPMuslimLocationInfo cRPMuslimLocationInfo) {
        byte[] bArr = new byte[14];
        bArr[0] = 1;
        bArr[1] = 1;
        byte[] b8 = com.crrepa.g1.c.b((int) (cRPMuslimLocationInfo.getLongitude() * 1000000.0d));
        System.arraycopy(b8, 0, bArr, 2, b8.length);
        byte[] b9 = com.crrepa.g1.c.b((int) (cRPMuslimLocationInfo.getLatitude() * 1000000.0d));
        System.arraycopy(b9, 0, bArr, 6, b9.length);
        byte[] d8 = com.crrepa.g1.c.d(cRPMuslimLocationInfo.getTimezone());
        System.arraycopy(d8, 0, bArr, 10, d8.length);
        return g.a(-69, bArr);
    }

    public static byte[] b(boolean z7, List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[(list.size() * 2) + 4];
        bArr[0] = 1;
        bArr[1] = 3;
        bArr[2] = 1;
        bArr[3] = (byte) (!z7 ? 1 : 0);
        for (int i8 = 0; i8 < list.size(); i8++) {
            byte[] a8 = com.crrepa.g1.c.a(list.get(i8).intValue());
            System.arraycopy(a8, 0, bArr, (i8 * 2) + 4, a8.length);
        }
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPMuslimPrayerCalculationInfo cRPMuslimPrayerCalculationInfo) {
        int i8 = cRPMuslimPrayerCalculationInfo.getAsrType() != null ? 5 : 4;
        byte[] bArr = new byte[i8];
        bArr[0] = 1;
        bArr[1] = 5;
        bArr[2] = 0;
        bArr[3] = cRPMuslimPrayerCalculationInfo.getType().getValue();
        if (4 < i8) {
            bArr[4] = cRPMuslimPrayerCalculationInfo.getAsrType().getValue();
        }
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPMuslimTasbihSettingInfo cRPMuslimTasbihSettingInfo) {
        return g.a(-69, new byte[]{1, 0, 0, cRPMuslimTasbihSettingInfo.isEnable() ? (byte) 1 : (byte) 0, cRPMuslimTasbihSettingInfo.getStartHour(), cRPMuslimTasbihSettingInfo.getStartMinutes(), cRPMuslimTasbihSettingInfo.getEndHour(), cRPMuslimTasbihSettingInfo.getEndMinutes(), cRPMuslimTasbihSettingInfo.getInterval(), cRPMuslimTasbihSettingInfo.getRepeatMode()});
    }

    public static byte[] a(boolean z7, List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        byte[] bArr = new byte[list.size() + 4];
        bArr[0] = 1;
        bArr[1] = 2;
        bArr[2] = 1;
        bArr[3] = (byte) (!z7 ? 1 : 0);
        for (int i8 = 0; i8 < list.size(); i8++) {
            bArr[i8 + 4] = list.get(i8).byteValue();
        }
        return g.a(-69, bArr);
    }

    public static byte[] a(boolean z7, Map<CRPMuslimPrayerNotifcationType, Boolean> map) {
        byte[] bArr = new byte[10];
        bArr[0] = 1;
        bArr[1] = 4;
        bArr[2] = 1;
        bArr[3] = z7 ? (byte) 1 : (byte) 0;
        if (map != null) {
            for (Map.Entry<CRPMuslimPrayerNotifcationType, Boolean> entry : map.entrySet()) {
                bArr[entry.getKey().getValue() + 4] = entry.getValue().booleanValue() ? (byte) 1 : (byte) 0;
            }
        }
        return g.a(-69, bArr);
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[10];
        bArr2[0] = 1;
        bArr2[1] = 6;
        bArr2[2] = 0;
        if (bArr != null && bArr.length > 0) {
            System.arraycopy(bArr, 0, bArr2, 3, Math.min(bArr.length, 7));
        }
        return g.a(-69, bArr2);
    }
}
