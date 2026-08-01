package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u0 extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f2836i;

    public u0(byte[] bArr) {
        bArr.getClass();
        this.f2836i = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final byte b(int i3) {
        return this.f2836i[i3];
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final int c() {
        return this.f2836i.length;
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final t0 e(int i3, int i10) {
        byte[] bArr = this.f2836i;
        int o6 = v0.o(0, i10, bArr.length);
        return o6 == 0 ? v0.f2860e : new s0(bArr, 0, o6);
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final void f(int i3, byte[] bArr) {
        System.arraycopy(this.f2836i, 0, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final void g(b1 b1Var) {
        byte[] bArr = this.f2836i;
        b1Var.c(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final boolean h(v0 v0Var) {
        boolean z10 = v0Var instanceof u0;
        byte[] bArr = this.f2836i;
        if (z10) {
            return Arrays.equals(bArr, ((u0) v0Var).f2836i);
        }
        boolean z11 = v0Var instanceof s0;
        if (!z11) {
            return v0Var.h(this);
        }
        s0 s0Var = (s0) v0Var;
        int i3 = s0Var.f2770s;
        int length = bArr.length;
        if (length > i3) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb2.append("Length too large: ");
            sb2.append(length);
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (length <= i3) {
            return z10 ? v0.p(bArr, 0, ((u0) v0Var).f2836i, 0, length) : z11 ? v0.p(bArr, 0, s0Var.f2768i, s0Var.f2769r, length) : v0Var.e(0, length).equals(e(0, length));
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i3).length());
        sb3.append("Ran off end of other: 0, ");
        sb3.append(length);
        sb3.append(", ");
        sb3.append(i3);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final int i(int i3, int i10) {
        return r1.a(i3, this.f2836i, 0, i10);
    }
}
