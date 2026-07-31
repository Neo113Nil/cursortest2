package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kd extends qd {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f7467i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f7468j = new Object();

    public kd(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "M8X9pjLXmkUmNpxAUiXCS0VzRrfgsx47JCdWPtF77o1zbxjaTxGH9o3y3XsfapA3", "IGAB4+J/PDJStxsBeRODYeAaV8Ap48L0bK2MK3UJNBs=", j8Var, i7, 33);
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        if (f7467i == null) {
            synchronized (f7468j) {
                if (f7467i == null) {
                    f7467i = (Long) this.f10654f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f10653e) {
            this.f10653e.H(f7467i.longValue());
        }
    }
}
