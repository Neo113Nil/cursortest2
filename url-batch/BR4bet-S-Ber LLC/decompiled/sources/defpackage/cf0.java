package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cf0 extends bf0 {
    @Override // defpackage.bf0, defpackage.mz
    public final void G(boolean z) {
        this.j.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.bf0, defpackage.mz
    public final void H(boolean z) {
        this.j.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // defpackage.bf0, defpackage.mz
    public final boolean w() {
        int systemBarsAppearance;
        systemBarsAppearance = this.j.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }
}
