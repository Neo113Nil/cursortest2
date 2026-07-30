package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.oD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3676oD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC3837rD abstractC3837rD, long j9, C3784qD c3784qD, C3784qD c3784qD2) {
        while (!unsafe.compareAndSwapObject(abstractC3837rD, j9, c3784qD, c3784qD2)) {
            if (unsafe.getObject(abstractC3837rD, j9) != c3784qD) {
                return false;
            }
        }
        return true;
    }
}
