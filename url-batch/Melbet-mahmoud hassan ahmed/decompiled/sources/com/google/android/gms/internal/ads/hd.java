package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hd extends qd {

    /* renamed from: i, reason: collision with root package name */
    private final StackTraceElement[] f6188i;

    public hd(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8, StackTraceElement[] stackTraceElementArr) {
        super(gcVar, "xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=", j8Var, i7, 45);
        this.f6188i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.f6188i;
        if (stackTraceElementArr != null) {
            yb ybVar = new yb((String) this.f10654f.invoke(null, stackTraceElementArr));
            synchronized (this.f10653e) {
                this.f10653e.s(ybVar.f14599b.longValue());
                if (ybVar.f14600c.booleanValue()) {
                    this.f10653e.O(true != ybVar.f14601d.booleanValue() ? 2 : 1);
                } else {
                    this.f10653e.O(3);
                }
            }
        }
    }
}
