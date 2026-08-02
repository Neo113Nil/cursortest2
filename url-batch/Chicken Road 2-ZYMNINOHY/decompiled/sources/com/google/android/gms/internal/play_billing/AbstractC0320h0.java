package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import x.AbstractC1514c;

/* renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0320h0 {
    protected int zza;

    public final byte[] a() {
        try {
            AbstractC0353w0 abstractC0353w0 = (AbstractC0353w0) this;
            int e4 = abstractC0353w0.e();
            byte[] bArr = new byte[e4];
            C0338o0 c0338o0 = new C0338o0(e4, bArr);
            S0 a3 = P0.f5897c.a(abstractC0353w0.getClass());
            H0 h02 = c0338o0.f5990a;
            if (h02 == null) {
                h02 = new H0(c0338o0);
            }
            a3.e(abstractC0353w0, h02);
            if (e4 - c0338o0.f5993d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e5) {
            throw new RuntimeException(AbstractC1514c.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e5);
        }
    }

    public abstract int b(S0 s02);
}
