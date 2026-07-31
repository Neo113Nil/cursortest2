package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class ds3 extends uo3 {

    /* renamed from: o, reason: collision with root package name */
    static final int[] f4314o = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: j, reason: collision with root package name */
    private final int f4315j;

    /* renamed from: k, reason: collision with root package name */
    private final uo3 f4316k;

    /* renamed from: l, reason: collision with root package name */
    private final uo3 f4317l;

    /* renamed from: m, reason: collision with root package name */
    private final int f4318m;

    /* renamed from: n, reason: collision with root package name */
    private final int f4319n;

    private ds3(uo3 uo3Var, uo3 uo3Var2) {
        this.f4316k = uo3Var;
        this.f4317l = uo3Var2;
        int q7 = uo3Var.q();
        this.f4318m = q7;
        this.f4315j = q7 + uo3Var2.q();
        this.f4319n = Math.max(uo3Var.s(), uo3Var2.s()) + 1;
    }

    static uo3 Q(uo3 uo3Var, uo3 uo3Var2) {
        if (uo3Var2.q() == 0) {
            return uo3Var;
        }
        if (uo3Var.q() == 0) {
            return uo3Var2;
        }
        int q7 = uo3Var.q() + uo3Var2.q();
        if (q7 < 128) {
            return R(uo3Var, uo3Var2);
        }
        if (uo3Var instanceof ds3) {
            ds3 ds3Var = (ds3) uo3Var;
            if (ds3Var.f4317l.q() + uo3Var2.q() < 128) {
                return new ds3(ds3Var.f4316k, R(ds3Var.f4317l, uo3Var2));
            }
            if (ds3Var.f4316k.s() > ds3Var.f4317l.s() && ds3Var.f4319n > uo3Var2.s()) {
                return new ds3(ds3Var.f4316k, new ds3(ds3Var.f4317l, uo3Var2));
            }
        }
        return q7 >= S(Math.max(uo3Var.s(), uo3Var2.s()) + 1) ? new ds3(uo3Var, uo3Var2) : zr3.a(new zr3(null), uo3Var, uo3Var2);
    }

    private static uo3 R(uo3 uo3Var, uo3 uo3Var2) {
        int q7 = uo3Var.q();
        int q8 = uo3Var2.q();
        byte[] bArr = new byte[q7 + q8];
        uo3Var.k(bArr, 0, 0, q7);
        uo3Var2.k(bArr, 0, q7, q8);
        return new qo3(bArr);
    }

    static int S(int i7) {
        int[] iArr = f4314o;
        int length = iArr.length;
        if (i7 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i7];
    }

    @Override // com.google.android.gms.internal.ads.uo3
    final void B(ho3 ho3Var) {
        this.f4316k.B(ho3Var);
        this.f4317l.B(ho3Var);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final boolean C() {
        int v6 = this.f4316k.v(0, 0, this.f4318m);
        uo3 uo3Var = this.f4317l;
        return uo3Var.v(v6, 0, uo3Var.q()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.uo3
    /* renamed from: G */
    public final no3 iterator() {
        return new xr3(this);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uo3)) {
            return false;
        }
        uo3 uo3Var = (uo3) obj;
        if (this.f4315j != uo3Var.q()) {
            return false;
        }
        if (this.f4315j == 0) {
            return true;
        }
        int F = F();
        int F2 = uo3Var.F();
        if (F != 0 && F2 != 0 && F != F2) {
            return false;
        }
        as3 as3Var = null;
        bs3 bs3Var = new bs3(this, as3Var);
        po3 next = bs3Var.next();
        bs3 bs3Var2 = new bs3(uo3Var, as3Var);
        po3 next2 = bs3Var2.next();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int q7 = next.q() - i7;
            int q8 = next2.q() - i8;
            int min = Math.min(q7, q8);
            if (!(i7 == 0 ? next.P(next2, i8, min) : next2.P(next, i7, min))) {
                return false;
            }
            i9 += min;
            int i10 = this.f4315j;
            if (i9 >= i10) {
                if (i9 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == q7) {
                next = bs3Var.next();
                i7 = 0;
            } else {
                i7 += min;
                next = next;
            }
            if (min == q8) {
                next2 = bs3Var2.next();
                i8 = 0;
            } else {
                i8 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uo3, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new xr3(this);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final byte n(int i7) {
        uo3.j(i7, this.f4315j);
        return o(i7);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    final byte o(int i7) {
        int i8 = this.f4318m;
        return i7 < i8 ? this.f4316k.o(i7) : this.f4317l.o(i7 - i8);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final int q() {
        return this.f4315j;
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final void r(byte[] bArr, int i7, int i8, int i9) {
        int i10 = this.f4318m;
        if (i7 + i9 <= i10) {
            this.f4316k.r(bArr, i7, i8, i9);
        } else {
            if (i7 >= i10) {
                this.f4317l.r(bArr, i7 - i10, i8, i9);
                return;
            }
            int i11 = i10 - i7;
            this.f4316k.r(bArr, i7, i8, i11);
            this.f4317l.r(bArr, 0, i8 + i11, i9 - i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final int s() {
        return this.f4319n;
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final boolean t() {
        return this.f4315j >= S(this.f4319n);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final int u(int i7, int i8, int i9) {
        int i10 = this.f4318m;
        if (i8 + i9 <= i10) {
            return this.f4316k.u(i7, i8, i9);
        }
        if (i8 >= i10) {
            return this.f4317l.u(i7, i8 - i10, i9);
        }
        int i11 = i10 - i8;
        return this.f4317l.u(this.f4316k.u(i7, i8, i11), 0, i9 - i11);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final int v(int i7, int i8, int i9) {
        int i10 = this.f4318m;
        if (i8 + i9 <= i10) {
            return this.f4316k.v(i7, i8, i9);
        }
        if (i8 >= i10) {
            return this.f4317l.v(i7, i8 - i10, i9);
        }
        int i11 = i10 - i8;
        return this.f4317l.v(this.f4316k.v(i7, i8, i11), 0, i9 - i11);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    public final uo3 w(int i7, int i8) {
        int D = uo3.D(i7, i8, this.f4315j);
        if (D == 0) {
            return uo3.f12885g;
        }
        if (D == this.f4315j) {
            return this;
        }
        int i9 = this.f4318m;
        if (i8 <= i9) {
            return this.f4316k.w(i7, i8);
        }
        if (i7 >= i9) {
            return this.f4317l.w(i7 - i9, i8 - i9);
        }
        uo3 uo3Var = this.f4316k;
        return new ds3(uo3Var.w(i7, uo3Var.q()), this.f4317l.w(0, i8 - this.f4318m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.uo3
    public final cp3 x() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        bs3 bs3Var = new bs3(this, null);
        while (bs3Var.hasNext()) {
            arrayList.add(bs3Var.next().z());
        }
        int i7 = cp3.f3912e;
        int i8 = 0;
        int i9 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i9 += byteBuffer.remaining();
            i8 = byteBuffer.hasArray() ? i8 | 1 : byteBuffer.isDirect() ? i8 | 2 : i8 | 4;
        }
        return i8 == 2 ? new yo3(arrayList, i9, true, objArr2 == true ? 1 : 0) : new ap3(new nq3(arrayList), 4096, objArr == true ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.uo3
    protected final String y(Charset charset) {
        return new String(m(), charset);
    }
}
