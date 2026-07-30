package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yg2 extends dr {
    public final transient byte[][] q;
    public final transient int[] r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg2(byte[][] bArr, int[] iArr) {
        super(dr.p.m);
        bArr.getClass();
        this.q = bArr;
        this.r = iArr;
    }

    private final Object writeReplace() {
        return s();
    }

    @Override // defpackage.dr
    public final dr b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.q;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.r;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new dr(digest);
    }

    @Override // defpackage.dr
    public final int c() {
        return this.r[this.q.length - 1];
    }

    @Override // defpackage.dr
    public final String d() {
        return s().d();
    }

    @Override // defpackage.dr
    public final int e(int i, byte[] bArr) {
        bArr.getClass();
        return s().e(i, bArr);
    }

    @Override // defpackage.dr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dr) {
            dr drVar = (dr) obj;
            if (drVar.c() == c() && k(0, drVar, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dr
    public final byte[] g() {
        return r();
    }

    @Override // defpackage.dr
    public final byte h(int i) {
        byte[][] bArr = this.q;
        int length = bArr.length - 1;
        int[] iArr = this.r;
        o70.r(iArr[length], i, 1L);
        int G = ap.G(this, i);
        return bArr[G][(i - (G == 0 ? 0 : iArr[G - 1])) + iArr[bArr.length + G]];
    }

    @Override // defpackage.dr
    public final int hashCode() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.q;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.r;
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
        this.n = i3;
        return i3;
    }

    @Override // defpackage.dr
    public final int i(byte[] bArr) {
        bArr.getClass();
        return s().i(bArr);
    }

    @Override // defpackage.dr
    public final boolean k(int i, dr drVar, int i2) {
        drVar.getClass();
        if (i >= 0 && i <= c() - i2) {
            int i3 = i2 + i;
            int G = ap.G(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.r;
                int i5 = G == 0 ? 0 : iArr[G - 1];
                int i6 = iArr[G] - i5;
                byte[][] bArr = this.q;
                int i7 = iArr[bArr.length + G];
                int min = Math.min(i3, i6 + i5) - i;
                if (drVar.l(i4, bArr[G], (i - i5) + i7, min)) {
                    i4 += min;
                    i += min;
                    G++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.dr
    public final boolean l(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int G = ap.G(this, i);
        while (i < i4) {
            int[] iArr = this.r;
            int i5 = G == 0 ? 0 : iArr[G - 1];
            int i6 = iArr[G] - i5;
            byte[][] bArr2 = this.q;
            int i7 = iArr[bArr2.length + G];
            int min = Math.min(i4, i6 + i5) - i;
            if (!o70.q((i - i5) + i7, i2, min, bArr2[G], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            G++;
        }
        return true;
    }

    @Override // defpackage.dr
    public final dr m(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = c();
        }
        if (i < 0) {
            lh.c(in1.l(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > c()) {
            StringBuilder n = in1.n(i2, "endIndex=", " > length(");
            n.append(c());
            n.append(')');
            throw new IllegalArgumentException(n.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            lh.c(q40.j("endIndex=", i2, i, " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == c()) {
            return this;
        }
        if (i == i2) {
            return dr.p;
        }
        int G = ap.G(this, i);
        int G2 = ap.G(this, i2 - 1);
        byte[][] bArr = this.q;
        byte[][] bArr2 = (byte[][]) ni.j(bArr, G, G2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.r;
        if (G <= G2) {
            int i4 = G;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == G2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = G != 0 ? iArr2[G - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new yg2(bArr2, iArr);
    }

    @Override // defpackage.dr
    public final dr o() {
        return s().o();
    }

    @Override // defpackage.dr
    public final void q(fq fqVar, int i) {
        int G = ap.G(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.r;
            int i3 = G == 0 ? 0 : iArr[G - 1];
            int i4 = iArr[G] - i3;
            byte[][] bArr = this.q;
            int i5 = iArr[bArr.length + G];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            ug2 ug2Var = new ug2(bArr[G], i6, i6 + min, true);
            ug2 ug2Var2 = fqVar.m;
            if (ug2Var2 == null) {
                ug2Var.g = ug2Var;
                ug2Var.f = ug2Var;
                fqVar.m = ug2Var;
            } else {
                ug2 ug2Var3 = ug2Var2.g;
                ug2Var3.getClass();
                ug2Var3.b(ug2Var);
            }
            i2 += min;
            G++;
        }
        fqVar.n += i;
    }

    public final byte[] r() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.q;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.r;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ni.c(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final dr s() {
        return new dr(r());
    }

    @Override // defpackage.dr
    public final String toString() {
        return s().toString();
    }
}
