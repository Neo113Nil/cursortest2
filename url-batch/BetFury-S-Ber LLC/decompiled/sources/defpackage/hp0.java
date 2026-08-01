package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hp0 extends gp0 {
    @Override // defpackage.gp0, defpackage.mc0
    public final boolean g() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.gp0, defpackage.mc0
    public final void k(boolean z) {
        this.a.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.gp0, defpackage.mc0
    public final void l(boolean z) {
        this.a.setSystemBarsAppearance(z ? 8 : 0, 8);
    }
}
