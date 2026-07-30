package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bs1 extends j72 {
    public int a92UlCVFR9N8;
    public final le0 e9gEMXR7LXtO;

    public bs1(long j, q72 q72Var, le0 le0Var) {
        super(j, q72Var);
        this.e9gEMXR7LXtO = le0Var;
        this.a92UlCVFR9N8 = 1;
    }

    @Override // defpackage.j72
    public final le0 OPXfSBeufaJ8() {
        return null;
    }

    @Override // defpackage.j72
    public final j72 S9EYkSpbGuxq(le0 le0Var) {
        s72.lS5Rgt96tfkO(this);
        return new yc1(this.lS5Rgt96tfkO, this.PxuCJdSBwIXG, s72.wdg6QnbFHrFF(le0Var, this.e9gEMXR7LXtO, true), this);
    }

    @Override // defpackage.j72
    public final void TSizfFm2Yiuu() {
        if (this.TSizfFm2Yiuu) {
            return;
        }
        x50lh2ztY7Y5();
        this.TSizfFm2Yiuu = true;
        synchronized (s72.TSizfFm2Yiuu) {
            QrzZRwfaDlRX();
        }
    }

    @Override // defpackage.j72
    public final boolean a92UlCVFR9N8() {
        return true;
    }

    @Override // defpackage.j72
    public final void dgRBjINgWbAK() {
        this.a92UlCVFR9N8++;
    }

    @Override // defpackage.j72
    public final le0 e9gEMXR7LXtO() {
        return this.e9gEMXR7LXtO;
    }

    @Override // defpackage.j72
    public final void r3s1LDPKFs1S(p92 p92Var) {
        vz1 vz1Var = s72.PxuCJdSBwIXG;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.j72
    public final void x50lh2ztY7Y5() {
        int i = this.a92UlCVFR9N8 - 1;
        this.a92UlCVFR9N8 = i;
        if (i == 0) {
            PxuCJdSBwIXG();
        }
    }

    @Override // defpackage.j72
    public final void cpQdD2nAriOS() {
    }
}
