package com.crrepa.f;

import com.crrepa.ble.conn.type.CRPVibrationStrength;

/* loaded from: classes3.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12653a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12654b = 1;

    private m0() {
    }

    public static byte[] a() {
        return g.a(-72, new byte[]{1});
    }

    public static byte[] a(CRPVibrationStrength cRPVibrationStrength) {
        return g.a(-72, new byte[]{0, cRPVibrationStrength.getValue()});
    }
}
