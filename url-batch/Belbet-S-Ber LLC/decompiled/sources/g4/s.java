package g4;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s extends i {

    /* renamed from: j, reason: collision with root package name */
    public final transient byte[][] f1960j;

    /* renamed from: k, reason: collision with root package name */
    public final transient int[] f1961k;

    public s(byte[][] bArr, int[] iArr) {
        super(i.i.f1936f);
        this.f1960j = bArr;
        this.f1961k = iArr;
    }

    @Override // g4.i
    public final int a() {
        return this.f1961k[this.f1960j.length - 1];
    }

    @Override // g4.i
    public final String b() {
        return new i(j()).b();
    }

    @Override // g4.i
    public final byte[] c() {
        return j();
    }

    @Override // g4.i
    public final byte d(int i) {
        byte[][] bArr = this.f1960j;
        int length = bArr.length - 1;
        int[] iArr = this.f1961k;
        b4.d.k(iArr[length], i, 1L);
        int b2 = h4.b.b(this, i);
        return bArr[b2][(i - (b2 == 0 ? 0 : iArr[b2 - 1])) + iArr[bArr.length + b2]];
    }

    @Override // g4.i
    public final boolean e(int i, byte[] bArr, int i4, int i5) {
        i3.d.e(bArr, "other");
        if (i < 0 || i > a() - i5 || i4 < 0 || i4 > bArr.length - i5) {
            return false;
        }
        int i6 = i5 + i;
        int b2 = h4.b.b(this, i);
        while (i < i6) {
            int[] iArr = this.f1961k;
            int i7 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i8 = iArr[b2] - i7;
            byte[][] bArr2 = this.f1960j;
            int i9 = iArr[bArr2.length + b2];
            int min = Math.min(i6, i8 + i7) - i;
            if (!b4.d.i((i - i7) + i9, i4, min, bArr2[b2], bArr)) {
                return false;
            }
            i4 += min;
            i += min;
            b2++;
        }
        return true;
    }

    @Override // g4.i
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

    @Override // g4.i
    public final boolean f(i iVar, int i) {
        i3.d.e(iVar, "other");
        if (a() - i >= 0) {
            int b2 = h4.b.b(this, 0);
            int i4 = 0;
            int i5 = 0;
            while (i4 < i) {
                int[] iArr = this.f1961k;
                int i6 = b2 == 0 ? 0 : iArr[b2 - 1];
                int i7 = iArr[b2] - i6;
                byte[][] bArr = this.f1960j;
                int i8 = iArr[bArr.length + b2];
                int min = Math.min(i, i7 + i6) - i4;
                if (iVar.e(i5, bArr[b2], (i4 - i6) + i8, min)) {
                    i5 += min;
                    i4 += min;
                    b2++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // g4.i
    public final i g() {
        return new i(j()).g();
    }

    @Override // g4.i
    public final int hashCode() {
        int i = this.f1937g;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f1960j;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f1961k;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr2[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        this.f1937g = i5;
        return i5;
    }

    @Override // g4.i
    public final void i(f fVar, int i) {
        int b2 = h4.b.b(this, 0);
        int i4 = 0;
        while (i4 < i) {
            int[] iArr = this.f1961k;
            int i5 = b2 == 0 ? 0 : iArr[b2 - 1];
            int i6 = iArr[b2] - i5;
            byte[][] bArr = this.f1960j;
            int i7 = iArr[bArr.length + b2];
            int min = Math.min(i, i6 + i5) - i4;
            int i8 = (i4 - i5) + i7;
            q qVar = new q(bArr[b2], i8, i8 + min, true);
            q qVar2 = fVar.f1934f;
            if (qVar2 == null) {
                qVar.f1956g = qVar;
                qVar.f1955f = qVar;
                fVar.f1934f = qVar;
            } else {
                q qVar3 = qVar2.f1956g;
                i3.d.b(qVar3);
                qVar3.b(qVar);
            }
            i4 += min;
            b2++;
        }
        fVar.f1935g += i;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f1960j;
        int length = bArr2.length;
        int i = 0;
        int i4 = 0;
        int i5 = 0;
        while (i < length) {
            int[] iArr = this.f1961k;
            int i6 = iArr[length + i];
            int i7 = iArr[i];
            int i8 = i7 - i4;
            x2.g.F(i5, i6, i6 + i8, bArr2[i], bArr);
            i5 += i8;
            i++;
            i4 = i7;
        }
        return bArr;
    }

    @Override // g4.i
    public final String toString() {
        return new i(j()).toString();
    }
}
