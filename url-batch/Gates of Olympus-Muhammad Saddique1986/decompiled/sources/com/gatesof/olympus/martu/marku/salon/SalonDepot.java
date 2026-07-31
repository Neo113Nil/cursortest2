package com.gatesof.olympus.martu.marku.salon;

import R1.k;
import R1.y;

/* loaded from: classes.dex */
public final class SalonDepot {
    public static final int $stable;
    public static final SalonDepot INSTANCE = new SalonDepot();
    private static volatile boolean ok;

    static {
        Object b3;
        try {
            System.loadLibrary("salonlib");
            b3 = y.f4171a;
        } catch (Throwable th) {
            b3 = R1.a.b(th);
        }
        ok = !(b3 instanceof k);
        $stable = 8;
    }

    private SalonDepot() {
    }

    private final native String read(int i3);

    public final String at(int i3) {
        Object b3;
        if (!ok) {
            return "";
        }
        try {
            b3 = read(i3);
        } catch (Throwable th) {
            b3 = R1.a.b(th);
        }
        return (String) (b3 instanceof k ? "" : b3);
    }
}
