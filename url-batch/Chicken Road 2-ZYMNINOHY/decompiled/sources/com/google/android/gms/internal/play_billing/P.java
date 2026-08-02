package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class P {
    public static /* synthetic */ boolean a(Unsafe unsafe, N n, long j4, Object obj, Object obj2) {
        while (!O.a(unsafe, n, j4, obj, obj2)) {
            if (unsafe.getObject(n, j4) != obj) {
                return false;
            }
        }
        return true;
    }
}
