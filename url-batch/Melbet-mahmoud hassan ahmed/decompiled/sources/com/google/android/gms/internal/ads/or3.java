package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class or3<T> implements es3<T> {

    /* renamed from: a, reason: collision with root package name */
    private final kr3 f9800a;

    /* renamed from: b, reason: collision with root package name */
    private final ws3<?, ?> f9801b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9802c;

    /* renamed from: d, reason: collision with root package name */
    private final np3<?> f9803d;

    private or3(ws3<?, ?> ws3Var, np3<?> np3Var, kr3 kr3Var) {
        this.f9801b = ws3Var;
        this.f9802c = np3Var.h(kr3Var);
        this.f9803d = np3Var;
        this.f9800a = kr3Var;
    }

    static <T> or3<T> k(ws3<?, ?> ws3Var, np3<?> np3Var, kr3 kr3Var) {
        return new or3<>(ws3Var, np3Var, kr3Var);
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final int a(T t6) {
        int hashCode = this.f9801b.d(t6).hashCode();
        if (!this.f9802c) {
            return hashCode;
        }
        this.f9803d.a(t6);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final T b() {
        return (T) this.f9800a.f().b();
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final int c(T t6) {
        ws3<?, ?> ws3Var = this.f9801b;
        int b7 = ws3Var.b(ws3Var.d(t6));
        if (!this.f9802c) {
            return b7;
        }
        this.f9803d.a(t6);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void d(T t6) {
        this.f9801b.m(t6);
        this.f9803d.e(t6);
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void e(T t6, wr3 wr3Var, mp3 mp3Var) {
        boolean u6;
        ws3<?, ?> ws3Var = this.f9801b;
        np3<?> np3Var = this.f9803d;
        Object c7 = ws3Var.c(t6);
        sp3<?> b7 = np3Var.b(t6);
        while (wr3Var.c() != Integer.MAX_VALUE) {
            try {
                int g7 = wr3Var.g();
                if (g7 != 11) {
                    if ((g7 & 7) == 2) {
                        Object c8 = np3Var.c(mp3Var, this.f9800a, g7 >>> 3);
                        if (c8 != null) {
                            np3Var.f(wr3Var, c8, mp3Var, b7);
                        } else {
                            u6 = ws3Var.p(c7, wr3Var);
                        }
                    } else {
                        u6 = wr3Var.u();
                    }
                    if (!u6) {
                        return;
                    }
                } else {
                    int i7 = 0;
                    Object obj = null;
                    uo3 uo3Var = null;
                    while (wr3Var.c() != Integer.MAX_VALUE) {
                        int g8 = wr3Var.g();
                        if (g8 == 16) {
                            i7 = wr3Var.i();
                            obj = np3Var.c(mp3Var, this.f9800a, i7);
                        } else if (g8 == 26) {
                            if (obj != null) {
                                np3Var.f(wr3Var, obj, mp3Var, b7);
                            } else {
                                uo3Var = wr3Var.l();
                            }
                        } else if (!wr3Var.u()) {
                            break;
                        }
                    }
                    if (wr3Var.g() != 12) {
                        throw mq3.b();
                    }
                    if (uo3Var != null) {
                        if (obj != null) {
                            np3Var.g(uo3Var, obj, mp3Var, b7);
                        } else {
                            ws3Var.k(c7, i7, uo3Var);
                        }
                    }
                }
            } finally {
                ws3Var.n(t6, c7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void f(T t6, T t7) {
        gs3.f(this.f9801b, t6, t7);
        if (this.f9802c) {
            gs3.e(this.f9803d, t6, t7);
        }
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final void g(T t6, ip3 ip3Var) {
        this.f9803d.a(t6);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.es3
    public final void h(T t6, byte[] bArr, int i7, int i8, eo3 eo3Var) {
        aq3 aq3Var = (aq3) t6;
        if (aq3Var.zzc == xs3.c()) {
            aq3Var.zzc = xs3.e();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final boolean i(T t6, T t7) {
        if (!this.f9801b.d(t6).equals(this.f9801b.d(t7))) {
            return false;
        }
        if (!this.f9802c) {
            return true;
        }
        this.f9803d.a(t6);
        this.f9803d.a(t7);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.es3
    public final boolean j(T t6) {
        this.f9803d.a(t6);
        throw null;
    }
}
