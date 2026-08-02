package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jjz extends jji {
    public Object a;

    public static int E(int i, jjq jjqVar) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + F(jjqVar);
    }

    public static int F(jjq jjqVar) {
        int c = jjqVar.c();
        return ((352 - (Integer.numberOfLeadingZeros(c) * 9)) >>> 6) + c;
    }

    public static int G(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + I(i2);
    }

    public static int H(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + I(i2);
    }

    public static int I(int i) {
        return (640 - (Long.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int J(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public static int K(jll jllVar) {
        int j = jllVar.j();
        return ((352 - (Integer.numberOfLeadingZeros(j) * 9)) >>> 6) + j;
    }

    public static int L(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int M(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (Integer.numberOfLeadingZeros((i2 >> 31) ^ (i2 + i2)) * 9)) >>> 6);
    }

    public static int N(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros((j >> 63) ^ (j + j)) * 9)) >>> 6);
    }

    public static int O(int i, String str) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + P(str);
    }

    public static int P(String str) {
        int b = ime.b(str);
        return ((352 - (Integer.numberOfLeadingZeros(b) * 9)) >>> 6) + b;
    }

    public static int Q(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6);
    }

    public static int R(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public static jjz S(byte[] bArr) {
        return new jjw(bArr, 0, bArr.length);
    }

    public final void T() {
        if (b() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (b() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public final void U(int i, double d) {
        k(i, Double.doubleToRawLongBits(d));
    }

    public final void V(double d) {
        l(Double.doubleToRawLongBits(d));
    }

    public final void W(int i, float f) {
        i(i, Float.floatToRawIntBits(f));
    }

    public final void X(float f) {
        j(Float.floatToRawIntBits(f));
    }

    public abstract int b();

    public abstract void c();

    public abstract void d(byte b);

    public abstract void f(int i, boolean z);

    public abstract void g(int i, jjq jjqVar);

    public abstract void h(jjq jjqVar);

    public abstract void i(int i, int i2);

    public abstract void j(int i);

    public abstract void k(int i, long j);

    public abstract void l(long j);

    public abstract void m(int i, int i2);

    public abstract void n(int i);

    public abstract void o(jll jllVar);

    public abstract void p(int i, jll jllVar);

    public abstract void q(int i, jjq jjqVar);

    public abstract void r(int i, String str);

    public abstract void s(String str);

    public abstract void t(int i, int i2);

    public abstract void u(int i, int i2);

    public abstract void v(int i);

    public abstract void w(int i, long j);

    public abstract void x(long j);

    public abstract void y(byte[] bArr, int i);
}
