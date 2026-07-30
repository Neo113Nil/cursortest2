package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.type.CRPCustomKeyType;

/* loaded from: classes3.dex */
public class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12452a = 27;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12453b = 28;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12454c = 29;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12455d = 12;

    private a2() {
    }

    public static byte[] a() {
        return g.a(-71, new byte[]{28});
    }

    public static byte[] b() {
        return g.a(-71, new byte[]{29});
    }

    public static byte[] c() {
        return g.a(-71, new byte[]{27});
    }

    public static byte[] a(CRPCustomKeyInfo cRPCustomKeyInfo) {
        byte[] bArr = new byte[6];
        bArr[0] = 12;
        bArr[1] = cRPCustomKeyInfo.getKeyType().getValue();
        bArr[2] = cRPCustomKeyInfo.getState();
        int goalValue = cRPCustomKeyInfo.getGoalValue();
        if (cRPCustomKeyInfo.getKeyType() == CRPCustomKeyType.KEY_STOPWATCH) {
            bArr[3] = cRPCustomKeyInfo.getGoalType();
            bArr[4] = (byte) ((goalValue / 60) % 60);
            bArr[5] = (byte) (goalValue % 60);
        } else {
            bArr[3] = cRPCustomKeyInfo.getGoalType();
            byte[] a8 = com.crrepa.g1.c.a(goalValue);
            bArr[4] = a8[0];
            bArr[5] = a8[1];
        }
        return g.a(-71, bArr);
    }
}
