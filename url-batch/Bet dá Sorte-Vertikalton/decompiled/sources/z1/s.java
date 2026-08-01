package z1;

/* loaded from: classes.dex */
public final class s extends i {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f4299e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f4300f;

    public s(byte[][] bArr, int[] iArr) {
        super(i.d.f4270a);
        this.f4299e = bArr;
        this.f4300f = iArr;
    }

    @Override // z1.i
    public final int a() {
        return this.f4300f[this.f4299e.length - 1];
    }

    @Override // z1.i
    public final String b() {
        return new i(j()).b();
    }

    @Override // z1.i
    public final byte[] c() {
        return j();
    }

    @Override // z1.i
    public final byte d(int i) {
        byte[][] bArr = this.f4299e;
        int length = bArr.length - 1;
        int[] iArr = this.f4300f;
        k0.w.d(iArr[length], i, 1L);
        int b2 = A1.b.b(this, i);
        return bArr[b2][(i - (b2 == 0 ? 0 : iArr[b2 - 1])) + iArr[bArr.length + b2]];
    }

    @Override // z1.i
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        b1.d.e(bArr, "other");
        if (i < 0 || i > a() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b2 = A1.b.b(this, i);
        while (i < i4) {
            int[] iArr = this.f4300f;
            int i5 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i6 = iArr[b2] - i5;
            byte[][] bArr2 = this.f4299e;
            int i7 = iArr[bArr2.length + b2];
            int min = Math.min(i4, i6 + i5) - i;
            if (!k0.w.b((i - i5) + i7, i2, min, bArr2[b2], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            b2++;
        }
        return true;
    }

    @Override // z1.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.a() == a() && f(iVar, a())) {
                return true;
            }
        }
        return false;
    }

    @Override // z1.i
    public final boolean f(i iVar, int i) {
        b1.d.e(iVar, "other");
        if (a() - i < 0) {
            return false;
        }
        int b2 = A1.b.b(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.f4300f;
            int i4 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i5 = iArr[b2] - i4;
            byte[][] bArr = this.f4299e;
            int i6 = iArr[bArr.length + b2];
            int min = Math.min(i, i5 + i4) - i2;
            if (!iVar.e(i3, bArr[b2], (i2 - i4) + i6, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b2++;
        }
        return true;
    }

    @Override // z1.i
    public final i g() {
        return new i(j()).g();
    }

    @Override // z1.i
    public final int hashCode() {
        int i = this.f4271b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f4299e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f4300f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f4271b = i3;
        return i3;
    }

    @Override // z1.i
    public final void i(f fVar, int i) {
        b1.d.e(fVar, "buffer");
        int b2 = A1.b.b(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f4300f;
            int i3 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i4 = iArr[b2] - i3;
            byte[][] bArr = this.f4299e;
            int i5 = iArr[bArr.length + b2];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            q qVar = new q(bArr[b2], i6, i6 + min, true);
            q qVar2 = fVar.f4268a;
            if (qVar2 == null) {
                qVar.f4295g = qVar;
                qVar.f4294f = qVar;
                fVar.f4268a = qVar;
            } else {
                q qVar3 = qVar2.f4295g;
                b1.d.b(qVar3);
                qVar3.b(qVar);
            }
            i2 += min;
            b2++;
        }
        fVar.f4269b += i;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f4299e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f4300f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            T0.g.r0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // z1.i
    public final String toString() {
        return new i(j()).toString();
    }
}
