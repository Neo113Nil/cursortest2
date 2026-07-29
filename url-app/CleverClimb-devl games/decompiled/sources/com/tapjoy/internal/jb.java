package com.tapjoy.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class jb extends iv {
    final transient byte[][] f;
    final transient int[] g;

    jb(is isVar, int i) {
        super(null);
        jf.a(isVar.f8416b, 0L, i);
        int i2 = 0;
        iz izVar = isVar.f8415a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (izVar.f8434c == izVar.f8433b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += izVar.f8434c - izVar.f8433b;
            i4++;
            izVar = izVar.f;
        }
        this.f = new byte[i4][];
        this.g = new int[i4 * 2];
        iz izVar2 = isVar.f8415a;
        int i5 = 0;
        while (i2 < i) {
            this.f[i5] = izVar2.f8432a;
            i2 += izVar2.f8434c - izVar2.f8433b;
            if (i2 > i) {
                i2 = i;
            }
            this.g[i5] = i2;
            this.g[this.f.length + i5] = izVar2.f8433b;
            izVar2.f8435d = true;
            i5++;
            izVar2 = izVar2.f;
        }
    }

    @Override // com.tapjoy.internal.iv
    public final String a() {
        return e().a();
    }

    @Override // com.tapjoy.internal.iv
    public final String b() {
        return e().b();
    }

    @Override // com.tapjoy.internal.iv
    public final iv a(int i, int i2) {
        return e().a(i, i2);
    }

    @Override // com.tapjoy.internal.iv
    public final byte a(int i) {
        jf.a(this.g[this.f.length - 1], i, 1L);
        int b2 = b(i);
        return this.f[b2][(i - (b2 == 0 ? 0 : this.g[b2 - 1])) + this.g[this.f.length + b2]];
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    @Override // com.tapjoy.internal.iv
    public final int c() {
        return this.g[this.f.length - 1];
    }

    @Override // com.tapjoy.internal.iv
    public final byte[] d() {
        byte[] bArr = new byte[this.g[this.f.length - 1]];
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.g[length + i];
            int i4 = this.g[i];
            System.arraycopy(this.f[i], i3, bArr, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr;
    }

    @Override // com.tapjoy.internal.iv
    final void a(is isVar) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.g[length + i];
            int i4 = this.g[i];
            iz izVar = new iz(this.f[i], i3, (i3 + i4) - i2);
            if (isVar.f8415a == null) {
                izVar.g = izVar;
                izVar.f = izVar;
                isVar.f8415a = izVar;
            } else {
                isVar.f8415a.g.a(izVar);
            }
            i++;
            i2 = i4;
        }
        isVar.f8416b += i2;
    }

    @Override // com.tapjoy.internal.iv
    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.g[b2 - 1];
            int min = Math.min(i3, ((this.g[b2] - i4) + i4) - i);
            if (!jf.a(this.f[b2], (i - i4) + this.g[this.f.length + b2], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    private iv e() {
        return new iv(d());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[RETURN] */
    @Override // com.tapjoy.internal.iv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iv) {
            iv ivVar = (iv) obj;
            if (ivVar.c() == c()) {
                int c2 = c();
                if (c() - c2 >= 0) {
                    int b2 = b(0);
                    int i = 0;
                    int i2 = 0;
                    while (c2 > 0) {
                        int i3 = b2 == 0 ? 0 : this.g[b2 - 1];
                        int min = Math.min(c2, ((this.g[b2] - i3) + i3) - i);
                        if (ivVar.a(i2, this.f[b2], (i - i3) + this.g[this.f.length + b2], min)) {
                            i += min;
                            i2 += min;
                            c2 -= min;
                            b2++;
                        }
                    }
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }

    @Override // com.tapjoy.internal.iv
    public final int hashCode() {
        int i = this.f8420d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int i5 = this.g[length + i2];
            int i6 = this.g[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f8420d = i4;
        return i4;
    }

    @Override // com.tapjoy.internal.iv
    public final String toString() {
        return e().toString();
    }
}
