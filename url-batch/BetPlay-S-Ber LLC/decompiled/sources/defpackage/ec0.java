package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ec0 extends dc0 {
    @Override // defpackage.dc0, defpackage.l70
    public final void T(boolean z) {
        this.o.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.dc0, defpackage.l70
    public final void U(boolean z) {
        this.o.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // defpackage.dc0, defpackage.l70
    public final boolean x() {
        int systemBarsAppearance;
        systemBarsAppearance = this.o.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }
}
