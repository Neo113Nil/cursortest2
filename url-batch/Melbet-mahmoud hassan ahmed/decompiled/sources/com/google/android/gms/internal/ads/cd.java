package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cd extends qd {

    /* renamed from: i, reason: collision with root package name */
    private static volatile String f3804i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f3805j = new Object();

    public cd(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", j8Var, i7, 1);
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        this.f10653e.p0("E");
        if (f3804i == null) {
            synchronized (f3805j) {
                if (f3804i == null) {
                    f3804i = (String) this.f10654f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f10653e) {
            this.f10653e.p0(f3804i);
        }
    }
}
