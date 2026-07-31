package n6;

import java.nio.charset.Charset;
import l5.AbstractC0505i;

/* loaded from: classes.dex */
public final class t extends i {

    /* renamed from: j, reason: collision with root package name */
    public final transient byte[][] f5560j;

    /* renamed from: k, reason: collision with root package name */
    public final transient int[] f5561k;

    public t(byte[][] bArr, int[] iArr) {
        super(i.f5525i.f5526f);
        this.f5560j = bArr;
        this.f5561k = iArr;
    }

    @Override // n6.i
    public final int a() {
        return this.f5561k[this.f5560j.length - 1];
    }

    @Override // n6.i
    public final String b() {
        return new i(j()).b();
    }

    @Override // n6.i
    public final byte[] c() {
        return j();
    }

    @Override // n6.i
    public final byte d(int i7) {
        byte[][] bArr = this.f5560j;
        int length = bArr.length - 1;
        int[] iArr = this.f5561k;
        b.d(iArr[length], i7, 1L);
        int b7 = o6.b.b(this, i7);
        return bArr[b7][(i7 - (b7 == 0 ? 0 : iArr[b7 - 1])) + iArr[bArr.length + b7]];
    }

    @Override // n6.i
    public final boolean e(int i7, byte[] other, int i8, int i9) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i7 < 0 || i7 > a() - i9 || i8 < 0 || i8 > other.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int b7 = o6.b.b(this, i7);
        while (i7 < i10) {
            int[] iArr = this.f5561k;
            int i11 = b7 == 0 ? 0 : iArr[b7 - 1];
            int i12 = iArr[b7] - i11;
            byte[][] bArr = this.f5560j;
            int i13 = iArr[bArr.length + b7];
            int min = Math.min(i10, i12 + i11) - i7;
            if (!b.a((i7 - i11) + i13, i8, min, bArr[b7], other)) {
                return false;
            }
            i8 += min;
            i7 += min;
            b7++;
        }
        return true;
    }

    @Override // n6.i
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

    @Override // n6.i
    public final boolean f(i other, int i7) {
        kotlin.jvm.internal.i.e(other, "other");
        if (a() - i7 >= 0) {
            int b7 = o6.b.b(this, 0);
            int i8 = 0;
            int i9 = 0;
            while (i8 < i7) {
                int[] iArr = this.f5561k;
                int i10 = b7 == 0 ? 0 : iArr[b7 - 1];
                int i11 = iArr[b7] - i10;
                byte[][] bArr = this.f5560j;
                int i12 = iArr[bArr.length + b7];
                int min = Math.min(i7, i11 + i10) - i8;
                if (other.e(i9, bArr[b7], (i8 - i10) + i12, min)) {
                    i9 += min;
                    i8 += min;
                    b7++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // n6.i
    public final String g(Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        return new i(j()).g(charset);
    }

    @Override // n6.i
    public final i h(int i7, int i8) {
        if (i8 == -1234567890) {
            i8 = a();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(C1.c.g("beginIndex=", i7, " < 0").toString());
        }
        if (i8 > a()) {
            throw new IllegalArgumentException(("endIndex=" + i8 + " > length(" + a() + ')').toString());
        }
        int i9 = i8 - i7;
        if (i9 < 0) {
            throw new IllegalArgumentException(C1.c.f(i8, i7, "endIndex=", " < beginIndex=").toString());
        }
        if (i7 == 0 && i8 == a()) {
            return this;
        }
        if (i7 == i8) {
            return i.f5525i;
        }
        int b7 = o6.b.b(this, i7);
        int b8 = o6.b.b(this, i8 - 1);
        byte[][] bArr = this.f5560j;
        byte[][] bArr2 = (byte[][]) AbstractC0505i.I(b7, b8 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f5561k;
        if (b7 <= b8) {
            int i10 = b7;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(iArr2[i10] - i7, i9);
                int i12 = i11 + 1;
                iArr[i11 + bArr2.length] = iArr2[bArr.length + i10];
                if (i10 == b8) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = b7 != 0 ? iArr2[b7 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i7 - i13) + iArr[length];
        return new t(bArr2, iArr);
    }

    @Override // n6.i
    public final int hashCode() {
        int i7 = this.f5527g;
        if (i7 != 0) {
            return i7;
        }
        byte[][] bArr = this.f5560j;
        int length = bArr.length;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i8 < length) {
            int[] iArr = this.f5561k;
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
        this.f5527g = i9;
        return i9;
    }

    @Override // n6.i
    public final i i() {
        return new i(j()).i();
    }

    @Override // n6.i
    public final byte[] j() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.f5560j;
        int length = bArr2.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f5561k;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            int i12 = i11 - i8;
            AbstractC0505i.F(i9, i10, i10 + i12, bArr2[i7], bArr);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // n6.i
    public final void l(f fVar, int i7) {
        int b7 = o6.b.b(this, 0);
        int i8 = 0;
        while (i8 < i7) {
            int[] iArr = this.f5561k;
            int i9 = b7 == 0 ? 0 : iArr[b7 - 1];
            int i10 = iArr[b7] - i9;
            byte[][] bArr = this.f5560j;
            int i11 = iArr[bArr.length + b7];
            int min = Math.min(i7, i10 + i9) - i8;
            int i12 = (i8 - i9) + i11;
            r rVar = new r(bArr[b7], i12, i12 + min, true);
            r rVar2 = fVar.f5523f;
            if (rVar2 == null) {
                rVar.f5556g = rVar;
                rVar.f5555f = rVar;
                fVar.f5523f = rVar;
            } else {
                r rVar3 = rVar2.f5556g;
                kotlin.jvm.internal.i.b(rVar3);
                rVar3.b(rVar);
            }
            i8 += min;
            b7++;
        }
        fVar.f5524g += i7;
    }

    @Override // n6.i
    public final String toString() {
        return new i(j()).toString();
    }
}
