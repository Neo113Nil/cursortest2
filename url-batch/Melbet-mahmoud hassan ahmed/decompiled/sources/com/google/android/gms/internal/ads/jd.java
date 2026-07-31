package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jd extends qd {

    /* renamed from: i, reason: collision with root package name */
    private final nc f7086i;

    /* renamed from: j, reason: collision with root package name */
    private long f7087j;

    public jd(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8, nc ncVar) {
        super(gcVar, "e3op4R4hYomHt8fD4e46pNuu/60OumzY4fWht1zvNw/PVRGde3uP5Y0px+X+3p+E", "jLlOehpoNgAQzvuHrTyBcudcfwOhFguv/E47mcpJrto=", j8Var, i7, 53);
        this.f7086i = ncVar;
        if (ncVar != null) {
            this.f7087j = ncVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        if (this.f7086i != null) {
            this.f10653e.C(((Long) this.f10654f.invoke(null, Long.valueOf(this.f7087j))).longValue());
        }
    }
}
