package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class c2 extends h2 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f3697o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n, reason: collision with root package name */
    private boolean f3698n;

    c2() {
    }

    public static boolean j(dr2 dr2Var) {
        if (dr2Var.i() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        dr2Var.b(bArr, 0, 8);
        return Arrays.equals(bArr, f3697o);
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final long a(dr2 dr2Var) {
        byte[] h7 = dr2Var.h();
        int i7 = h7[0] & 255;
        int i8 = i7 & 3;
        int i9 = 2;
        if (i8 == 0) {
            i9 = 1;
        } else if (i8 != 1 && i8 != 2) {
            i9 = h7[1] & 63;
        }
        int i10 = i7 >> 3;
        return f(i9 * (i10 >= 16 ? 2500 << r1 : i10 >= 12 ? 10000 << (r1 & 1) : (i10 & 3) == 3 ? 60000 : 10000 << r1));
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f3698n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.h2
    protected final boolean c(dr2 dr2Var, long j7, d2 d2Var) {
        if (this.f3698n) {
            Objects.requireNonNull(d2Var.f4046a);
            boolean z6 = dr2Var.m() == 1332770163;
            dr2Var.f(0);
            return z6;
        }
        byte[] copyOf = Arrays.copyOf(dr2Var.h(), dr2Var.l());
        byte b7 = copyOf[9];
        List<byte[]> a7 = ld4.a(copyOf);
        bf4 bf4Var = new bf4();
        bf4Var.s("audio/opus");
        bf4Var.e0(b7 & 255);
        bf4Var.t(48000);
        bf4Var.i(a7);
        d2Var.f4046a = bf4Var.y();
        this.f3698n = true;
        return true;
    }
}
