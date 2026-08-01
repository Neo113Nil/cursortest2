package p3;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s extends i {

    /* renamed from: j, reason: collision with root package name */
    public final transient byte[][] f3048j;

    /* renamed from: k, reason: collision with root package name */
    public final transient int[] f3049k;

    public s(byte[][] bArr, int[] iArr) {
        super(i.f3029i.f3030f);
        this.f3048j = bArr;
        this.f3049k = iArr;
    }

    @Override // p3.i
    public final int a() {
        return this.f3049k[this.f3048j.length - 1];
    }

    @Override // p3.i
    public final String b() {
        return new i(j()).b();
    }

    @Override // p3.i
    public final byte[] c() {
        return j();
    }

    @Override // p3.i
    public final byte d(int i4) {
        byte[][] bArr = this.f3048j;
        int length = bArr.length - 1;
        int[] iArr = this.f3049k;
        m0.a.g(iArr[length], i4, 1L);
        int b2 = q3.b.b(this, i4);
        return bArr[b2][(i4 - (b2 == 0 ? 0 : iArr[b2 - 1])) + iArr[bArr.length + b2]];
    }

    @Override // p3.i
    public final boolean e(int i4, byte[] bArr, int i5, int i6) {
        u2.c.e(bArr, "other");
        if (i4 < 0 || i4 > a() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int b2 = q3.b.b(this, i4);
        while (i4 < i7) {
            int[] iArr = this.f3049k;
            int i8 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i9 = iArr[b2] - i8;
            byte[][] bArr2 = this.f3048j;
            int i10 = iArr[bArr2.length + b2];
            int min = Math.min(i7, i9 + i8) - i4;
            if (!m0.a.a((i4 - i8) + i10, i5, min, bArr2[b2], bArr)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b2++;
        }
        return true;
    }

    @Override // p3.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.a() == a() && f(iVar, a());
    }

    @Override // p3.i
    public final boolean f(i iVar, int i4) {
        u2.c.e(iVar, "other");
        if (a() - i4 >= 0) {
            int b2 = q3.b.b(this, 0);
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                int[] iArr = this.f3049k;
                int i7 = b2 == 0 ? 0 : iArr[b2 - 1];
                int i8 = iArr[b2] - i7;
                byte[][] bArr = this.f3048j;
                int i9 = iArr[bArr.length + b2];
                int min = Math.min(i4, i8 + i7) - i5;
                if (iVar.e(i6, bArr[b2], (i5 - i7) + i9, min)) {
                    i6 += min;
                    i5 += min;
                    b2++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // p3.i
    public final i g() {
        return new i(j()).g();
    }

    @Override // p3.i
    public final int hashCode() {
        int i4 = this.g;
        if (i4 != 0) {
            return i4;
        }
        byte[][] bArr = this.f3048j;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f3049k;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            byte[] bArr2 = bArr[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        this.g = i6;
        return i6;
    }

    @Override // p3.i
    public final void i(f fVar, int i4) {
        int b2 = q3.b.b(this, 0);
        int i5 = 0;
        while (i5 < i4) {
            int[] iArr = this.f3049k;
            int i6 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i7 = iArr[b2] - i6;
            byte[][] bArr = this.f3048j;
            int i8 = iArr[bArr.length + b2];
            int min = Math.min(i4, i7 + i6) - i5;
            int i9 = (i5 - i6) + i8;
            q qVar = new q(bArr[b2], i9, i9 + min, true);
            q qVar2 = fVar.f3028f;
            if (qVar2 == null) {
                qVar.g = qVar;
                qVar.f3045f = qVar;
                fVar.f3028f = qVar;
            } else {
                q qVar3 = qVar2.g;
                u2.c.b(qVar3);
                qVar3.b(qVar);
            }
            i5 += min;
            b2++;
        }
        fVar.g += i4;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f3048j;
        int length = bArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f3049k;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            int i9 = i8 - i5;
            n2.f.B(i6, i7, i7 + i9, bArr2[i4], bArr);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // p3.i
    public final String toString() {
        return new i(j()).toString();
    }
}
