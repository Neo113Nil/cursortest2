package f8;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends i {

    /* renamed from: j, reason: collision with root package name */
    public final transient byte[][] f3587j;

    /* renamed from: k, reason: collision with root package name */
    public final transient int[] f3588k;

    public d0(byte[][] bArr, int[] iArr) {
        super(i.f3600i.f3601f);
        this.f3587j = bArr;
        this.f3588k = iArr;
    }

    @Override // f8.i
    public final i B() {
        return F().B();
    }

    @Override // f8.i
    public final void D(f fVar, int i7) {
        int g9 = g8.b.g(this, 0);
        int i8 = 0;
        while (i8 < i7) {
            int[] iArr = this.f3588k;
            int i9 = g9 == 0 ? 0 : iArr[g9 - 1];
            int i10 = iArr[g9] - i9;
            byte[][] bArr = this.f3587j;
            int i11 = iArr[bArr.length + g9];
            int min = Math.min(i7, i10 + i9) - i8;
            int i12 = (i8 - i9) + i11;
            b0 b0Var = new b0(bArr[g9], i12, i12 + min, true);
            b0 b0Var2 = fVar.f3597f;
            if (b0Var2 == null) {
                b0Var.f3577g = b0Var;
                b0Var.f3576f = b0Var;
                fVar.f3597f = b0Var;
            } else {
                b0 b0Var3 = b0Var2.f3577g;
                r6.k.c(b0Var3);
                b0Var3.b(b0Var);
            }
            i8 += min;
            g9++;
        }
        fVar.f3598g += i7;
    }

    public final byte[] E() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.f3587j;
        int length = bArr2.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f3588k;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            int i12 = i11 - i8;
            e6.k.U(i9, i10, i10 + i12, bArr2[i7], bArr);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    public final i F() {
        return new i(E());
    }

    @Override // f8.i
    public final int e() {
        return this.f3588k[this.f3587j.length - 1];
    }

    @Override // f8.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.e() == e() && x(0, iVar, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // f8.i
    public final String g() {
        return F().g();
    }

    @Override // f8.i
    public final int h(int i7, byte[] bArr) {
        r6.k.f(bArr, "other");
        return F().h(i7, bArr);
    }

    @Override // f8.i
    public final int hashCode() {
        int i7 = this.f3602g;
        if (i7 != 0) {
            return i7;
        }
        byte[][] bArr = this.f3587j;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int[] iArr = this.f3588k;
            int i11 = iArr[length + i8];
            int i12 = iArr[i8];
            byte[] bArr2 = bArr[i8];
            int i13 = (i12 - i10) + i11;
            while (i11 < i13) {
                i9 = (i9 * 31) + bArr2[i11];
                i11++;
            }
            i8++;
            i10 = i12;
        }
        this.f3602g = i9;
        return i9;
    }

    @Override // f8.i
    public final byte[] m() {
        return E();
    }

    @Override // f8.i
    public final byte p(int i7) {
        byte[][] bArr = this.f3587j;
        int length = bArr.length - 1;
        int[] iArr = this.f3588k;
        t6.a.t(iArr[length], i7, 1L);
        int g9 = g8.b.g(this, i7);
        return bArr[g9][(i7 - (g9 == 0 ? 0 : iArr[g9 - 1])) + iArr[bArr.length + g9]];
    }

    @Override // f8.i
    public final int q(byte[] bArr) {
        r6.k.f(bArr, "other");
        return F().q(bArr);
    }

    @Override // f8.i
    public final String toString() {
        return F().toString();
    }

    @Override // f8.i
    public final boolean x(int i7, i iVar, int i8) {
        r6.k.f(iVar, "other");
        if (i7 >= 0 && i7 <= e() - i8) {
            int i9 = i8 + i7;
            int g9 = g8.b.g(this, i7);
            int i10 = 0;
            while (i7 < i9) {
                int[] iArr = this.f3588k;
                int i11 = g9 == 0 ? 0 : iArr[g9 - 1];
                int i12 = iArr[g9] - i11;
                byte[][] bArr = this.f3587j;
                int i13 = iArr[bArr.length + g9];
                int min = Math.min(i9, i12 + i11) - i7;
                if (iVar.y(i10, bArr[g9], (i7 - i11) + i13, min)) {
                    i10 += min;
                    i7 += min;
                    g9++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // f8.i
    public final boolean y(int i7, byte[] bArr, int i8, int i9) {
        r6.k.f(bArr, "other");
        if (i7 < 0 || i7 > e() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int g9 = g8.b.g(this, i7);
        while (i7 < i10) {
            int[] iArr = this.f3588k;
            int i11 = g9 == 0 ? 0 : iArr[g9 - 1];
            int i12 = iArr[g9] - i11;
            byte[][] bArr2 = this.f3587j;
            int i13 = iArr[bArr2.length + g9];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!t6.a.o((i7 - i11) + i13, i8, min, bArr2[g9], bArr)) {
                return false;
            }
            i8 += min;
            i7 += min;
            g9++;
        }
        return true;
    }

    @Override // f8.i
    public final i z(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = e();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.g(i7, "beginIndex=", " < 0").toString());
        }
        if (i8 > e()) {
            StringBuilder n8 = a0.m.n(i8, "endIndex=", " > length(");
            n8.append(e());
            n8.append(')');
            throw new IllegalArgumentException(n8.toString().toString());
        }
        int i9 = i8 - i7;
        if (i9 < 0) {
            throw new IllegalArgumentException(r6.i.b(i8, i7, "endIndex=", " < beginIndex=").toString());
        }
        if (i7 == 0 && i8 == e()) {
            return this;
        }
        if (i7 == i8) {
            return i.f3600i;
        }
        int g9 = g8.b.g(this, i7);
        int g10 = g8.b.g(this, i8 - 1);
        byte[][] bArr = this.f3587j;
        byte[][] bArr2 = (byte[][]) e6.k.b0(bArr, g9, g10 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f3588k;
        if (g9 <= g10) {
            int i10 = g9;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(iArr2[i10] - i7, i9);
                int i12 = i11 + 1;
                iArr[i11 + bArr2.length] = iArr2[bArr.length + i10];
                if (i10 == g10) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = g9 != 0 ? iArr2[g9 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i7 - i13) + iArr[length];
        return new d0(bArr2, iArr);
    }
}
