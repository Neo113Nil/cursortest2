package com.gates.olympus.miruv.tenon;

import I2.l;
import L1.z;

/* loaded from: classes.dex */
public final class TenonLocker {
    public static final int $stable;
    public static final TenonLocker INSTANCE = new TenonLocker();
    private static volatile boolean ok;

    static {
        Object t3;
        try {
            System.loadLibrary("tenonjni");
            t3 = z.f2729a;
        } catch (Throwable th) {
            t3 = l.t(th);
        }
        ok = !(t3 instanceof L1.l);
        $stable = 8;
    }

    private TenonLocker() {
    }

    private final native String slot(int i3);

    public final String at(int i3) {
        Object t3;
        if (!ok) {
            return "";
        }
        try {
            t3 = slot(i3);
        } catch (Throwable th) {
            t3 = l.t(th);
        }
        return (String) (t3 instanceof L1.l ? "" : t3);
    }
}
