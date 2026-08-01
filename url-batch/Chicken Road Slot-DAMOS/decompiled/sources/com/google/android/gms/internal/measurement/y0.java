package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2999a;

    /* renamed from: b, reason: collision with root package name */
    public int f3000b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.j f3001c;

    public static y0 h(InputStream inputStream, int i3) {
        if (i3 <= 0) {
            te.a1.e("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new x0(inputStream, i3);
        }
        w0 w0Var = new w0(r1.f2724a);
        try {
            w0Var.a(0);
            return w0Var;
        } catch (v1 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int j(int i3) {
        return (i3 >>> 1) ^ (-(i3 & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i3);

    public abstract void b(int i3);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i3, int i10);

    public abstract void g(int i3);

    public final void i() {
        int l10;
        do {
            l10 = l();
            if (l10 == 0) {
                return;
            }
            int i3 = this.f2999a;
            int i10 = this.f3000b;
            if (i3 + i10 >= 100) {
                a2.r.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.f3000b = i10 + 1;
                this.f3000b--;
            }
        } while (n(l10));
    }

    public abstract int l();

    public abstract void m(int i3);

    public abstract boolean n(int i3);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract u0 y();

    public abstract byte[] z();
}
