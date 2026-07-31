package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p32 implements lc1, ya1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f10059h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static int f10060i;

    /* renamed from: f, reason: collision with root package name */
    private final a3.t1 f10061f;

    /* renamed from: g, reason: collision with root package name */
    private final y32 f10062g;

    public p32(y32 y32Var, a3.t1 t1Var) {
        this.f10062g = y32Var;
        this.f10061f = t1Var;
    }

    private final void a(boolean z6) {
        int i7;
        int intValue;
        if (((Boolean) sw.c().b(m10.E4)).booleanValue() && !this.f10061f.K()) {
            Object obj = f10059h;
            synchronized (obj) {
                i7 = f10060i;
                intValue = ((Integer) sw.c().b(m10.F4)).intValue();
            }
            if (i7 >= intValue) {
                return;
            }
            this.f10062g.e(z6);
            synchronized (obj) {
                f10060i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(cv cvVar) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final void m() {
        a(true);
    }
}
