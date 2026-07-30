package com.chicken.road.whale.plate;

import d6.l;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class PlateVault {
    public static final int $stable;
    public static final PlateVault INSTANCE = new PlateVault();
    private static volatile boolean ok;

    static {
        Object b9;
        try {
            System.loadLibrary("platecore");
            b9 = z.f2639a;
        } catch (Throwable th) {
            b9 = d6.a.b(th);
        }
        ok = !(b9 instanceof l);
        $stable = 8;
    }

    private PlateVault() {
    }

    private final native String resolve(int i7);

    public final String at(int i7) {
        Object b9;
        if (!ok) {
            return "";
        }
        try {
            b9 = resolve(i7);
        } catch (Throwable th) {
            b9 = d6.a.b(th);
        }
        return (String) (b9 instanceof l ? "" : b9);
    }
}
