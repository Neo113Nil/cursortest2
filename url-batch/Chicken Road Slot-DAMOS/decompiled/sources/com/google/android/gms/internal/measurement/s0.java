package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f2768i;

    /* renamed from: r, reason: collision with root package name */
    public final int f2769r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2770s;

    public s0(byte[] bArr, int i3, int i10) {
        v0.o(i3, i3 + i10, bArr.length);
        this.f2768i = bArr;
        this.f2769r = i3;
        this.f2770s = i10;
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final byte b(int i3) {
        return this.f2768i[this.f2769r + i3];
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final int c() {
        return this.f2770s;
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final t0 e(int i3, int i10) {
        int o6 = v0.o(i3, i10, this.f2770s);
        if (o6 == 0) {
            return v0.f2860e;
        }
        return new s0(this.f2768i, this.f2769r + i3, o6);
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final void f(int i3, byte[] bArr) {
        System.arraycopy(this.f2768i, this.f2769r, bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final void g(b1 b1Var) {
        b1Var.c(this.f2768i, this.f2769r, this.f2770s);
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final boolean h(v0 v0Var) {
        boolean z10 = v0Var instanceof u0;
        if (!z10 && !(v0Var instanceof s0)) {
            return v0Var.h(this);
        }
        int c10 = v0Var.c();
        int i3 = this.f2770s;
        if (i3 > c10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 18 + String.valueOf(i3).length());
            sb2.append("Length too large: ");
            sb2.append(i3);
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i3 <= v0Var.c()) {
            byte[] bArr = this.f2768i;
            int i10 = this.f2769r;
            if (z10) {
                return v0.p(bArr, i10, ((u0) v0Var).f2836i, 0, i3);
            }
            if (!(v0Var instanceof s0)) {
                return v0Var.e(0, i3).equals(e(i10, i3 + i10));
            }
            s0 s0Var = (s0) v0Var;
            return v0.p(bArr, i10, s0Var.f2768i, s0Var.f2769r, i3);
        }
        int c11 = v0Var.c();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 27 + String.valueOf(c11).length());
        sb3.append("Ran off end of other: 0, ");
        sb3.append(i3);
        sb3.append(", ");
        sb3.append(c11);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public final int i(int i3, int i10) {
        return r1.a(i3, this.f2768i, this.f2769r, i10);
    }
}
