package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yc extends qd {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f14605i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f14606j = new Object();

    public yc(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", j8Var, i7, 22);
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        if (f14605i == null) {
            synchronized (f14606j) {
                if (f14605i == null) {
                    f14605i = (Long) this.f10654f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f10653e) {
            this.f10653e.m0(f14605i.longValue());
        }
    }
}
