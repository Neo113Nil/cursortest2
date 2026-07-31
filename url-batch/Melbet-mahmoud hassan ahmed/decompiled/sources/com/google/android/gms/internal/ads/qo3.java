package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
class qo3 extends po3 {

    /* renamed from: j, reason: collision with root package name */
    protected final byte[] f10775j;

    qo3(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f10775j = bArr;
    }

    @Override // com.google.android.gms.internal.ads.uo3
    final void B(ho3 ho3Var) {
        ((ep3) ho3Var).E(this.f10775j, Q(), q());
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final boolean C() {
        int Q = Q();
        return lt3.j(this.f10775j, Q, q() + Q);
    }

    @Override // com.google.android.gms.internal.ads.po3
    final boolean P(uo3 uo3Var, int i7, int i8) {
        if (i8 > uo3Var.q()) {
            int q7 = q();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i8);
            sb.append(q7);
            throw new IllegalArgumentException(sb.toString());
        }
        int i9 = i7 + i8;
        if (i9 > uo3Var.q()) {
            int q8 = uo3Var.q();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            sb2.append(", ");
            sb2.append(q8);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(uo3Var instanceof qo3)) {
            return uo3Var.w(i7, i9).equals(w(0, i8));
        }
        qo3 qo3Var = (qo3) uo3Var;
        byte[] bArr = this.f10775j;
        byte[] bArr2 = qo3Var.f10775j;
        int Q = Q() + i8;
        int Q2 = Q();
        int Q3 = qo3Var.Q() + i7;
        while (Q2 < Q) {
            if (bArr[Q2] != bArr2[Q3]) {
                return false;
            }
            Q2++;
            Q3++;
        }
        return true;
    }

    protected int Q() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uo3) || q() != ((uo3) obj).q()) {
            return false;
        }
        if (q() == 0) {
            return true;
        }
        if (!(obj instanceof qo3)) {
            return obj.equals(this);
        }
        qo3 qo3Var = (qo3) obj;
        int F = F();
        int F2 = qo3Var.F();
        if (F == 0 || F2 == 0 || F == F2) {
            return P(qo3Var, 0, q());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public byte n(int i7) {
        return this.f10775j[i7];
    }

    @Override // com.google.android.gms.internal.ads.uo3
    byte o(int i7) {
        return this.f10775j[i7];
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public int q() {
        return this.f10775j.length;
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected void r(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.f10775j, i7, bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final int u(int i7, int i8, int i9) {
        return kq3.d(i7, this.f10775j, Q() + i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final int v(int i7, int i8, int i9) {
        int Q = Q() + i8;
        return lt3.f(i7, this.f10775j, Q, i9 + Q);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final uo3 w(int i7, int i8) {
        int D = uo3.D(i7, i8, q());
        return D == 0 ? uo3.f12885g : new mo3(this.f10775j, Q() + i7, D);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final cp3 x() {
        return cp3.g(this.f10775j, Q(), q(), true);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final String y(Charset charset) {
        return new String(this.f10775j, Q(), q(), charset);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final ByteBuffer z() {
        return ByteBuffer.wrap(this.f10775j, Q(), q()).asReadOnlyBuffer();
    }
}
