package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class cp3 {

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f3911d = 100;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3912e = 0;

    /* renamed from: a, reason: collision with root package name */
    int f3913a;

    /* renamed from: b, reason: collision with root package name */
    final int f3914b = f3911d;

    /* renamed from: c, reason: collision with root package name */
    dp3 f3915c;

    /* synthetic */ cp3(bp3 bp3Var) {
    }

    public static int e(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long f(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    static cp3 g(byte[] bArr, int i7, int i8, boolean z6) {
        wo3 wo3Var = new wo3(bArr, i7, i8, z6, null);
        try {
            wo3Var.k(i8);
            return wo3Var;
        } catch (mq3 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract void A(int i7);

    public abstract void a(int i7);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i7);

    public abstract double h();

    public abstract float i();

    public abstract int j();

    public abstract int k(int i7);

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract uo3 x();

    public abstract String y();

    public abstract String z();
}
