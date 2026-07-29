package c;

import java.util.Arrays;

/* compiled from: SegmentedByteString.java */
/* loaded from: classes.dex */
final class p extends f {
    final transient byte[][] f;
    final transient int[] g;

    p(c cVar, int i) {
        super(null);
        t.a(cVar.f2186b, 0L, i);
        int i2 = 0;
        n nVar = cVar.f2185a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (nVar.f2218c == nVar.f2217b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += nVar.f2218c - nVar.f2217b;
            i4++;
            nVar = nVar.f;
        }
        this.f = new byte[i4][];
        this.g = new int[i4 * 2];
        n nVar2 = cVar.f2185a;
        int i5 = 0;
        while (i2 < i) {
            this.f[i5] = nVar2.f2216a;
            i2 += nVar2.f2218c - nVar2.f2217b;
            if (i2 > i) {
                i2 = i;
            }
            this.g[i5] = i2;
            this.g[this.f.length + i5] = nVar2.f2217b;
            nVar2.f2219d = true;
            i5++;
            nVar2 = nVar2.f;
        }
    }

    @Override // c.f
    public String a() {
        return i().a();
    }

    @Override // c.f
    public String b() {
        return i().b();
    }

    @Override // c.f
    public String e() {
        return i().e();
    }

    @Override // c.f
    public f f() {
        return i().f();
    }

    @Override // c.f
    public f c() {
        return i().c();
    }

    @Override // c.f
    public f d() {
        return i().d();
    }

    @Override // c.f
    public f a(int i, int i2) {
        return i().a(i, i2);
    }

    @Override // c.f
    public byte a(int i) {
        t.a(this.g[this.f.length - 1], i, 1L);
        int b2 = b(i);
        return this.f[b2][(i - (b2 == 0 ? 0 : this.g[b2 - 1])) + this.g[this.f.length + b2]];
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    @Override // c.f
    public int g() {
        return this.g[this.f.length - 1];
    }

    @Override // c.f
    public byte[] h() {
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

    @Override // c.f
    void a(c cVar) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = this.g[length + i];
            int i4 = this.g[i];
            n nVar = new n(this.f[i], i3, (i3 + i4) - i2);
            if (cVar.f2185a == null) {
                nVar.g = nVar;
                nVar.f = nVar;
                cVar.f2185a = nVar;
            } else {
                cVar.f2185a.g.a(nVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f2186b += i2;
    }

    @Override // c.f
    public boolean a(int i, f fVar, int i2, int i3) {
        if (i < 0 || i > g() - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.g[b2 - 1];
            int min = Math.min(i3, ((this.g[b2] - i4) + i4) - i);
            if (!fVar.a(i2, this.f[b2], (i - i4) + this.g[this.f.length + b2], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    @Override // c.f
    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b2 = b(i);
        while (i3 > 0) {
            int i4 = b2 == 0 ? 0 : this.g[b2 - 1];
            int min = Math.min(i3, ((this.g[b2] - i4) + i4) - i);
            if (!t.a(this.f[b2], (i - i4) + this.g[this.f.length + b2], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b2++;
        }
        return true;
    }

    private f i() {
        return new f(h());
    }

    @Override // c.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.g() == g() && a(0, fVar, 0, g())) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f
    public int hashCode() {
        int i = this.f2192d;
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
        this.f2192d = i4;
        return i4;
    }

    @Override // c.f
    public String toString() {
        return i().toString();
    }

    private Object writeReplace() {
        return i();
    }
}
