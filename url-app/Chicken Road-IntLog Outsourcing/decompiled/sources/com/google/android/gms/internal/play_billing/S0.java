package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class S0 {
    protected int zza;

    public abstract int a(D1 d12);

    public final byte[] b() {
        try {
            AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) this;
            int e3 = abstractC0334g1.e();
            byte[] bArr = new byte[e3];
            Z0 z02 = new Z0(e3, bArr);
            D1 a6 = A1.f5019c.a(abstractC0334g1.getClass());
            C0366r1 c0366r1 = z02.f5149b;
            if (c0366r1 == null) {
                c0366r1 = new C0366r1(z02);
            }
            a6.h(abstractC0334g1, c0366r1);
            if (e3 - z02.f5152e == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(AbstractC0279e.f("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }
}
