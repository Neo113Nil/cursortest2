package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vb0 extends ub0 {
    @Override // defpackage.ub0, defpackage.u90
    public final boolean a() {
        int systemBarsAppearance;
        systemBarsAppearance = this.a.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.ub0, defpackage.u90
    public final void c(boolean z) {
        this.a.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.ub0, defpackage.u90
    public final void d(boolean z) {
        this.a.setSystemBarsAppearance(z ? 8 : 0, 8);
    }
}
