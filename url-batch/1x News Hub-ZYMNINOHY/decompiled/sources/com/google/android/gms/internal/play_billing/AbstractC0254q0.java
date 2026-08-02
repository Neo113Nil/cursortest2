package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0254q0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC0245n0 abstractC0245n0, long j3, Object obj, Object obj2) {
        while (!AbstractC0251p0.a(unsafe, abstractC0245n0, j3, obj, obj2)) {
            if (unsafe.getObject(abstractC0245n0, j3) != obj) {
                return false;
            }
        }
        return true;
    }
}
