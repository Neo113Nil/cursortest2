package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uc extends qd {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f12730i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f12731j = new Object();

    public uc(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", j8Var, i7, 44);
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        if (f12730i == null) {
            synchronized (f12731j) {
                if (f12730i == null) {
                    f12730i = (Long) this.f10654f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f10653e) {
            this.f10653e.e0(f12730i.longValue());
        }
    }
}
