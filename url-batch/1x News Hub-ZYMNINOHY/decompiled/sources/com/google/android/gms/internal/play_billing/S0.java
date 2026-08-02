package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public abstract class S0 {
    protected int zza;

    public abstract int a(D1 d12);

    public final byte[] b() {
        try {
            AbstractC0225g1 abstractC0225g1 = (AbstractC0225g1) this;
            int e3 = abstractC0225g1.e();
            byte[] bArr = new byte[e3];
            Z0 z0 = new Z0(e3, bArr);
            D1 a3 = A1.f2703c.a(abstractC0225g1.getClass());
            C0257r1 c0257r1 = z0.f2827b;
            if (c0257r1 == null) {
                c0257r1 = new C0257r1(z0);
            }
            a3.h(abstractC0225g1, c0257r1);
            if (e3 - z0.f2830e == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(AbstractC1234c.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e4);
        }
    }
}
