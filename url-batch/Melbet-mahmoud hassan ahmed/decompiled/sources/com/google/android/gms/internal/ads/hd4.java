package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class hd4 {

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f6193a = new dr2(10);

    public final c91 a(pc4 pc4Var, tf4 tf4Var) {
        c91 c91Var = null;
        int i7 = 0;
        while (true) {
            try {
                ((jc4) pc4Var).n(this.f6193a.h(), 0, 10, false);
                this.f6193a.f(0);
                if (this.f6193a.u() != 4801587) {
                    break;
                }
                this.f6193a.g(3);
                int r7 = this.f6193a.r();
                int i8 = r7 + 10;
                if (c91Var == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(this.f6193a.h(), 0, bArr, 0, 10);
                    ((jc4) pc4Var).n(bArr, 10, r7, false);
                    c91Var = vf4.a(bArr, i8, tf4Var, new da1());
                } else {
                    ((jc4) pc4Var).o(r7, false);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        pc4Var.i();
        ((jc4) pc4Var).o(i7, false);
        return c91Var;
    }
}
