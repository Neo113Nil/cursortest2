package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jju {
    public static final /* synthetic */ int f = 0;
    private static volatile int g = 100;
    int a;
    int b;
    final int c = g;
    public int d = Integer.MAX_VALUE;
    Object e;

    public static jju L(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? Q(jky.a, 0, 0) : new jjt(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static void N(byte[] bArr, int i, int i2) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static jju Q(byte[] bArr, int i, int i2) {
        jjs jjsVar = new jjs(bArr, i, i2);
        try {
            jjsVar.f(i2);
            return jjsVar;
        } catch (jld e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract jjq A();

    public abstract String B();

    public abstract String C();

    public abstract void D(int i);

    public abstract void E(int i);

    public abstract void F(int i);

    public abstract boolean G();

    public abstract boolean H();

    public abstract boolean I(int i);

    public abstract byte[] J();

    public final void M() {
        if (this.a + this.b >= this.c) {
            throw new jld("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void O() {
        if (this.b == 0) {
            D(0);
        }
    }

    public final void P() {
        int q;
        do {
            q = q();
            if (q == 0) {
                return;
            }
            M();
            this.b++;
            this.b--;
        } while (I(q));
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e();

    public abstract int f(int i);

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int k();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s(byte[] bArr, int i, int i2);

    public abstract long t();

    public abstract long u();

    public abstract long w();

    public abstract long x();

    public abstract long y();

    public abstract long z();
}
