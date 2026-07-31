package o2;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f19688a;

    /* renamed from: b, reason: collision with root package name */
    private int f19689b;

    /* renamed from: c, reason: collision with root package name */
    private int f19690c;

    public a0() {
        this.f19688a = m0.f19757f;
    }

    public a0(int i7) {
        this.f19688a = new byte[i7];
        this.f19690c = i7;
    }

    public a0(byte[] bArr) {
        this.f19688a = bArr;
        this.f19690c = bArr.length;
    }

    public a0(byte[] bArr, int i7) {
        this.f19688a = bArr;
        this.f19690c = i7;
    }

    public String A(int i7, Charset charset) {
        String str = new String(this.f19688a, this.f19689b, i7, charset);
        this.f19689b += i7;
        return str;
    }

    public int B() {
        return (C() << 21) | (C() << 14) | (C() << 7) | C();
    }

    public int C() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        this.f19689b = i7 + 1;
        return bArr[i7] & 255;
    }

    public int D() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        int i10 = i8 + 1;
        this.f19689b = i10;
        int i11 = (bArr[i8] & 255) | i9;
        this.f19689b = i10 + 2;
        return i11;
    }

    public long E() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b + 1;
        this.f19689b = i7;
        long j7 = (bArr[r1] & 255) << 24;
        int i8 = i7 + 1;
        this.f19689b = i8;
        long j8 = j7 | ((bArr[i7] & 255) << 16);
        int i9 = i8 + 1;
        this.f19689b = i9;
        long j9 = j8 | ((bArr[i8] & 255) << 8);
        this.f19689b = i9 + 1;
        return (bArr[i9] & 255) | j9;
    }

    public int F() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = (bArr[i7] & 255) << 16;
        int i10 = i8 + 1;
        this.f19689b = i10;
        int i11 = i9 | ((bArr[i8] & 255) << 8);
        this.f19689b = i10 + 1;
        return (bArr[i10] & 255) | i11;
    }

    public int G() {
        int m7 = m();
        if (m7 >= 0) {
            return m7;
        }
        throw new IllegalStateException("Top bit not zero: " + m7);
    }

    public long H() {
        long v6 = v();
        if (v6 >= 0) {
            return v6;
        }
        throw new IllegalStateException("Top bit not zero: " + v6);
    }

    public int I() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f19689b = i8 + 1;
        return (bArr[i8] & 255) | i9;
    }

    public long J() {
        int i7;
        int i8;
        long j7 = this.f19688a[this.f19689b];
        int i9 = 7;
        while (true) {
            if (i9 < 0) {
                break;
            }
            if (((1 << i9) & j7) != 0) {
                i9--;
            } else if (i9 < 6) {
                j7 &= r6 - 1;
                i8 = 7 - i9;
            } else if (i9 == 7) {
                i8 = 1;
            }
        }
        i8 = 0;
        if (i8 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j7);
        }
        for (i7 = 1; i7 < i8; i7++) {
            if ((this.f19688a[this.f19689b + i7] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j7);
            }
            j7 = (j7 << 6) | (r3 & 63);
        }
        this.f19689b += i8;
        return j7;
    }

    public void K(int i7) {
        M(b() < i7 ? new byte[i7] : this.f19688a, i7);
    }

    public void L(byte[] bArr) {
        M(bArr, bArr.length);
    }

    public void M(byte[] bArr, int i7) {
        this.f19688a = bArr;
        this.f19690c = i7;
        this.f19689b = 0;
    }

    public void N(int i7) {
        a.a(i7 >= 0 && i7 <= this.f19688a.length);
        this.f19690c = i7;
    }

    public void O(int i7) {
        a.a(i7 >= 0 && i7 <= this.f19690c);
        this.f19689b = i7;
    }

    public void P(int i7) {
        O(this.f19689b + i7);
    }

    public int a() {
        return this.f19690c - this.f19689b;
    }

    public int b() {
        return this.f19688a.length;
    }

    public void c(int i7) {
        if (i7 > b()) {
            this.f19688a = Arrays.copyOf(this.f19688a, i7);
        }
    }

    public byte[] d() {
        return this.f19688a;
    }

    public int e() {
        return this.f19689b;
    }

    public int f() {
        return this.f19690c;
    }

    public char g() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        return (char) ((bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8));
    }

    public int h() {
        return this.f19688a[this.f19689b] & 255;
    }

    public void i(z zVar, int i7) {
        j(zVar.f19836a, 0, i7);
        zVar.p(0);
    }

    public void j(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.f19688a, this.f19689b, bArr, i7, i8);
        this.f19689b += i8;
    }

    public String k(char c7) {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f19689b;
        while (i7 < this.f19690c && this.f19688a[i7] != c7) {
            i7++;
        }
        byte[] bArr = this.f19688a;
        int i8 = this.f19689b;
        String E = m0.E(bArr, i8, i7 - i8);
        this.f19689b = i7;
        if (i7 < this.f19690c) {
            this.f19689b = i7 + 1;
        }
        return E;
    }

    public double l() {
        return Double.longBitsToDouble(v());
    }

    public int m() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = (bArr[i7] & 255) << 24;
        int i10 = i8 + 1;
        this.f19689b = i10;
        int i11 = i9 | ((bArr[i8] & 255) << 16);
        int i12 = i10 + 1;
        this.f19689b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.f19689b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int n() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = ((bArr[i7] & 255) << 24) >> 8;
        int i10 = i8 + 1;
        this.f19689b = i10;
        int i11 = i9 | ((bArr[i8] & 255) << 8);
        this.f19689b = i10 + 1;
        return (bArr[i10] & 255) | i11;
    }

    public String o() {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f19689b;
        while (i7 < this.f19690c && !m0.u0(this.f19688a[i7])) {
            i7++;
        }
        int i8 = this.f19689b;
        if (i7 - i8 >= 3) {
            byte[] bArr = this.f19688a;
            if (bArr[i8] == -17 && bArr[i8 + 1] == -69 && bArr[i8 + 2] == -65) {
                this.f19689b = i8 + 3;
            }
        }
        byte[] bArr2 = this.f19688a;
        int i9 = this.f19689b;
        String E = m0.E(bArr2, i9, i7 - i9);
        this.f19689b = i7;
        int i10 = this.f19690c;
        if (i7 == i10) {
            return E;
        }
        byte[] bArr3 = this.f19688a;
        if (bArr3[i7] == 13) {
            int i11 = i7 + 1;
            this.f19689b = i11;
            if (i11 == i10) {
                return E;
            }
        }
        int i12 = this.f19689b;
        if (bArr3[i12] == 10) {
            this.f19689b = i12 + 1;
        }
        return E;
    }

    public int p() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i8 + 1;
        this.f19689b = i10;
        int i11 = i9 | ((bArr[i8] & 255) << 8);
        int i12 = i10 + 1;
        this.f19689b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f19689b = i12 + 1;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public long q() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b + 1;
        this.f19689b = i7;
        long j7 = bArr[r1] & 255;
        int i8 = i7 + 1;
        this.f19689b = i8;
        long j8 = j7 | ((bArr[i7] & 255) << 8);
        int i9 = i8 + 1;
        this.f19689b = i9;
        long j9 = j8 | ((bArr[i8] & 255) << 16);
        int i10 = i9 + 1;
        this.f19689b = i10;
        long j10 = j9 | ((bArr[i9] & 255) << 24);
        int i11 = i10 + 1;
        this.f19689b = i11;
        long j11 = j10 | ((bArr[i10] & 255) << 32);
        int i12 = i11 + 1;
        this.f19689b = i12;
        long j12 = j11 | ((bArr[i11] & 255) << 40);
        int i13 = i12 + 1;
        this.f19689b = i13;
        long j13 = j12 | ((bArr[i12] & 255) << 48);
        this.f19689b = i13 + 1;
        return ((bArr[i13] & 255) << 56) | j13;
    }

    public short r() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = bArr[i7] & 255;
        this.f19689b = i8 + 1;
        return (short) (((bArr[i8] & 255) << 8) | i9);
    }

    public long s() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b + 1;
        this.f19689b = i7;
        long j7 = bArr[r1] & 255;
        int i8 = i7 + 1;
        this.f19689b = i8;
        long j8 = j7 | ((bArr[i7] & 255) << 8);
        int i9 = i8 + 1;
        this.f19689b = i9;
        long j9 = j8 | ((bArr[i8] & 255) << 16);
        this.f19689b = i9 + 1;
        return ((bArr[i9] & 255) << 24) | j9;
    }

    public int t() {
        int p7 = p();
        if (p7 >= 0) {
            return p7;
        }
        throw new IllegalStateException("Top bit not zero: " + p7);
    }

    public int u() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = bArr[i7] & 255;
        this.f19689b = i8 + 1;
        return ((bArr[i8] & 255) << 8) | i9;
    }

    public long v() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b + 1;
        this.f19689b = i7;
        long j7 = (bArr[r1] & 255) << 56;
        int i8 = i7 + 1;
        this.f19689b = i8;
        long j8 = j7 | ((bArr[i7] & 255) << 48);
        int i9 = i8 + 1;
        this.f19689b = i9;
        long j9 = j8 | ((bArr[i8] & 255) << 40);
        int i10 = i9 + 1;
        this.f19689b = i10;
        long j10 = j9 | ((bArr[i9] & 255) << 32);
        int i11 = i10 + 1;
        this.f19689b = i11;
        long j11 = j10 | ((bArr[i10] & 255) << 24);
        int i12 = i11 + 1;
        this.f19689b = i12;
        long j12 = j11 | ((bArr[i11] & 255) << 16);
        int i13 = i12 + 1;
        this.f19689b = i13;
        long j13 = j12 | ((bArr[i12] & 255) << 8);
        this.f19689b = i13 + 1;
        return (bArr[i13] & 255) | j13;
    }

    public String w() {
        return k((char) 0);
    }

    public String x(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i8 = this.f19689b;
        int i9 = (i8 + i7) - 1;
        String E = m0.E(this.f19688a, i8, (i9 >= this.f19690c || this.f19688a[i9] != 0) ? i7 : i7 - 1);
        this.f19689b += i7;
        return E;
    }

    public short y() {
        byte[] bArr = this.f19688a;
        int i7 = this.f19689b;
        int i8 = i7 + 1;
        this.f19689b = i8;
        int i9 = (bArr[i7] & 255) << 8;
        this.f19689b = i8 + 1;
        return (short) ((bArr[i8] & 255) | i9);
    }

    public String z(int i7) {
        return A(i7, l4.d.f18614c);
    }
}
