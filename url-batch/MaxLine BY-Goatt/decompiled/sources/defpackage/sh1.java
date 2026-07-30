package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sh1 extends b4 {
    public final c4 a;
    public final zn1 b;

    public sh1(c4 c4Var, zn1 zn1Var) {
        this.a = c4Var;
        this.b = zn1Var;
    }

    @Override // defpackage.b4
    public final w3 a() {
        return (w3) this.b.getValue();
    }

    @Override // defpackage.b4
    public final void b(Object obj) {
        h4 h4Var = this.a.a;
        if (h4Var != null) {
            h4Var.b(obj);
        } else {
            lh.g("Launcher has not been initialized");
        }
    }

    @Override // defpackage.b4
    public final void c() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
