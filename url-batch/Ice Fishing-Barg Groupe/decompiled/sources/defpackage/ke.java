package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ke extends r61 {
    public final float PxuCJdSBwIXG;
    public final z42 TSizfFm2Yiuu;
    public final m82 lS5Rgt96tfkO;

    public ke(float f, m82 m82Var, z42 z42Var) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = m82Var;
        this.TSizfFm2Yiuu = z42Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new je(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        je jeVar = (je) m61Var;
        float f = jeVar.pnx5pC0XzaCw;
        dh dhVar = jeVar.jyegZNwi31qc;
        float f2 = this.PxuCJdSBwIXG;
        if (!k10.lS5Rgt96tfkO(f, f2)) {
            jeVar.pnx5pC0XzaCw = f2;
            dhVar.W7ceZOzvrRuI();
        }
        m82 m82Var = jeVar.IAToe7bXGz4N;
        m82 m82Var2 = this.lS5Rgt96tfkO;
        if (!cs0.wdg6QnbFHrFF(m82Var, m82Var2)) {
            jeVar.IAToe7bXGz4N = m82Var2;
            dhVar.W7ceZOzvrRuI();
        }
        z42 z42Var = jeVar.e6tOsSdd2EFb;
        z42 z42Var2 = this.TSizfFm2Yiuu;
        if (cs0.wdg6QnbFHrFF(z42Var, z42Var2)) {
            return;
        }
        jeVar.e6tOsSdd2EFb = z42Var2;
        dhVar.W7ceZOzvrRuI();
        th0.S2OOm9zPNm0h(jeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj;
        return k10.lS5Rgt96tfkO(this.PxuCJdSBwIXG, keVar.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(keVar.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, keVar.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (Float.hashCode(this.PxuCJdSBwIXG) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) k10.TSizfFm2Yiuu(this.PxuCJdSBwIXG)) + ", brush=" + this.lS5Rgt96tfkO + ", shape=" + this.TSizfFm2Yiuu + ')';
    }
}
