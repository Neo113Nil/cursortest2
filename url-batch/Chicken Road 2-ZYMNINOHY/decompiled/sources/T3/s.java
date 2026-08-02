package T3;

import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class s extends j {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f3007e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f3008f;

    public s(byte[][] bArr, int[] iArr) {
        super(j.f2976d.f2977a);
        this.f3007e = bArr;
        this.f3008f = iArr;
    }

    @Override // T3.j
    public final int a() {
        return this.f3008f[this.f3007e.length - 1];
    }

    @Override // T3.j
    public final String b() {
        return new j(j()).b();
    }

    @Override // T3.j
    public final byte[] c() {
        return j();
    }

    @Override // T3.j
    public final byte d(int i4) {
        byte[][] bArr = this.f3007e;
        int length = bArr.length - 1;
        int[] iArr = this.f3008f;
        AbstractC0124a.p(iArr[length], i4, 1L);
        int b4 = U3.b.b(this, i4);
        return bArr[b4][(i4 - (b4 == 0 ? 0 : iArr[b4 - 1])) + iArr[bArr.length + b4]];
    }

    @Override // T3.j
    public final boolean e(int i4, int i5, int i6, byte[] other) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i4 < 0 || i4 > a() - i6 || i5 < 0 || i5 > other.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int b4 = U3.b.b(this, i4);
        while (i4 < i7) {
            int[] iArr = this.f3008f;
            int i8 = b4 == 0 ? 0 : iArr[b4 - 1];
            int i9 = iArr[b4] - i8;
            byte[][] bArr = this.f3007e;
            int i10 = iArr[bArr.length + b4];
            int min = Math.min(i7, i9 + i8) - i4;
            if (!AbstractC0124a.c((i4 - i8) + i10, i5, min, bArr[b4], other)) {
                return false;
            }
            i5 += min;
            i4 += min;
            b4++;
        }
        return true;
    }

    @Override // T3.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.a() == a() && f(jVar, a());
    }

    @Override // T3.j
    public final boolean f(j other, int i4) {
        kotlin.jvm.internal.i.e(other, "other");
        if (a() - i4 >= 0) {
            int b4 = U3.b.b(this, 0);
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                int[] iArr = this.f3008f;
                int i7 = b4 == 0 ? 0 : iArr[b4 - 1];
                int i8 = iArr[b4] - i7;
                byte[][] bArr = this.f3007e;
                int i9 = iArr[bArr.length + b4];
                int min = Math.min(i4, i8 + i7) - i5;
                if (other.e(i6, (i5 - i7) + i9, min, bArr[b4])) {
                    i6 += min;
                    i5 += min;
                    b4++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // T3.j
    public final j g() {
        return new j(j()).g();
    }

    @Override // T3.j
    public final int hashCode() {
        int i4 = this.f2978b;
        if (i4 != 0) {
            return i4;
        }
        byte[][] bArr = this.f3007e;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f3008f;
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
        this.f2978b = i6;
        return i6;
    }

    @Override // T3.j
    public final void i(g gVar, int i4) {
        int b4 = U3.b.b(this, 0);
        int i5 = 0;
        while (i5 < i4) {
            int[] iArr = this.f3008f;
            int i6 = b4 == 0 ? 0 : iArr[b4 - 1];
            int i7 = iArr[b4] - i6;
            byte[][] bArr = this.f3007e;
            int i8 = iArr[bArr.length + b4];
            int min = Math.min(i4, i7 + i6) - i5;
            int i9 = (i5 - i6) + i8;
            q qVar = new q(bArr[b4], i9, i9 + min, true);
            q qVar2 = gVar.f2974a;
            if (qVar2 == null) {
                qVar.f3003g = qVar;
                qVar.f3002f = qVar;
                gVar.f2974a = qVar;
            } else {
                q qVar3 = qVar2.f3003g;
                kotlin.jvm.internal.i.b(qVar3);
                qVar3.b(qVar);
            }
            i5 += min;
            b4++;
        }
        gVar.f2975b += i4;
    }

    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f3007e;
        int length = bArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f3008f;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            int i9 = i8 - i5;
            d3.g.O(i6, i7, i7 + i9, bArr2[i4], bArr);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // T3.j
    public final String toString() {
        return new j(j()).toString();
    }
}
