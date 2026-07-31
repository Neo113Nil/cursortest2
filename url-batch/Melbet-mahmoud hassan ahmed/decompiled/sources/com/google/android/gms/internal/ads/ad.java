package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ad extends qd {

    /* renamed from: i, reason: collision with root package name */
    private final jb f2732i;

    public ad(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8, jb jbVar) {
        super(gcVar, "pJoEelkZiKPOxk90a9HaLYHjU9iyGURNQtyjZ4Eem1yb/gFTG2yLqZLPefEosnhY", "oU8dxPYnryKlPd91mK89Z7Qor1PaeT+LMYSHnhThZ+4=", j8Var, i7, 11);
        this.f2732i = jbVar;
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        jb jbVar = this.f2732i;
        if (jbVar != null) {
            this.f10653e.n0(((Long) this.f10654f.invoke(null, jbVar.b())).longValue());
        }
    }
}
