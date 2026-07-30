package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ux extends m61 {
    public m61 S2OOm9zPNm0h;
    public final int VhhvGxCb8gfr = qd1.e9gEMXR7LXtO(this);

    @Override // defpackage.m61
    public final void EP3hG58ROvHh(pd1 pd1Var) {
        this.QrzZRwfaDlRX = pd1Var;
        for (m61 m61Var = this.S2OOm9zPNm0h; m61Var != null; m61Var = m61Var.cpQdD2nAriOS) {
            m61Var.EP3hG58ROvHh(pd1Var);
        }
    }

    @Override // defpackage.m61
    public final void HqMwxkFaipxD() {
        super.HqMwxkFaipxD();
        for (m61 m61Var = this.S2OOm9zPNm0h; m61Var != null; m61Var = m61Var.cpQdD2nAriOS) {
            m61Var.EP3hG58ROvHh(this.QrzZRwfaDlRX);
            if (!m61Var.S9EYkSpbGuxq) {
                m61Var.HqMwxkFaipxD();
            }
        }
    }

    @Override // defpackage.m61
    public final void KZw9XyiywG4x() {
        for (m61 m61Var = this.S2OOm9zPNm0h; m61Var != null; m61Var = m61Var.cpQdD2nAriOS) {
            m61Var.KZw9XyiywG4x();
        }
        super.KZw9XyiywG4x();
    }

    @Override // defpackage.m61
    public final void MBpAROcyNHKN(m61 m61Var) {
        this.rtx2ld2ELZv4 = m61Var;
        for (m61 m61Var2 = this.S2OOm9zPNm0h; m61Var2 != null; m61Var2 = m61Var2.cpQdD2nAriOS) {
            m61Var2.MBpAROcyNHKN(m61Var);
        }
    }

    public final tx W7ceZOzvrRuI(tx txVar) {
        m61 m61Var = ((m61) txVar).rtx2ld2ELZv4;
        if (m61Var != txVar) {
            m61 m61Var2 = txVar instanceof m61 ? (m61) txVar : null;
            m61 m61Var3 = m61Var2 != null ? m61Var2.x50lh2ztY7Y5 : null;
            if (m61Var != this.rtx2ld2ELZv4 || !cs0.wdg6QnbFHrFF(m61Var3, this)) {
                u9.rtx2ld2ELZv4("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (m61Var.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("Cannot delegate to an already attached node");
            }
            m61Var.MBpAROcyNHKN(this.rtx2ld2ELZv4);
            int i = this.wdg6QnbFHrFF;
            int a92UlCVFR9N8 = qd1.a92UlCVFR9N8(m61Var);
            m61Var.wdg6QnbFHrFF = a92UlCVFR9N8;
            int i2 = this.wdg6QnbFHrFF;
            int i3 = a92UlCVFR9N8 & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof kw0)) {
                ep0.lS5Rgt96tfkO("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + m61Var);
            }
            m61Var.cpQdD2nAriOS = this.S2OOm9zPNm0h;
            this.S2OOm9zPNm0h = m61Var;
            m61Var.x50lh2ztY7Y5 = this;
            fkblLSN2bAgv(a92UlCVFR9N8 | this.wdg6QnbFHrFF, false);
            if (this.S9EYkSpbGuxq) {
                if (i3 == 0 || (i & 2) != 0) {
                    EP3hG58ROvHh(this.QrzZRwfaDlRX);
                } else {
                    kd1 kd1Var = zv.zf8DYfih6EZu(this).nLZGh9p8gVSu;
                    this.rtx2ld2ELZv4.EP3hG58ROvHh(null);
                    kd1Var.RAsUl2FVSrh6();
                }
                m61Var.HqMwxkFaipxD();
                m61Var.KZw9XyiywG4x();
                if (!m61Var.S9EYkSpbGuxq) {
                    ep0.lS5Rgt96tfkO("autoInvalidateInsertedNode called on unattached node");
                }
                qd1.PxuCJdSBwIXG(m61Var, -1, 1);
            }
        }
        return txVar;
    }

    public final void X1HMmH2Ks65g(tx txVar) {
        m61 m61Var = null;
        for (m61 m61Var2 = this.S2OOm9zPNm0h; m61Var2 != null; m61Var2 = m61Var2.cpQdD2nAriOS) {
            if (m61Var2 == txVar) {
                boolean z = m61Var2.S9EYkSpbGuxq;
                if (z) {
                    l81 l81Var = qd1.PxuCJdSBwIXG;
                    if (!z) {
                        ep0.lS5Rgt96tfkO("autoInvalidateRemovedNode called on unattached node");
                    }
                    qd1.PxuCJdSBwIXG(m61Var2, -1, 2);
                    m61Var2.Y2PHjkwWz56c();
                    m61Var2.twy4zb2fCtqq();
                }
                m61Var2.MBpAROcyNHKN(m61Var2);
                m61Var2.dgRBjINgWbAK = 0;
                m61 m61Var3 = m61Var2.cpQdD2nAriOS;
                if (m61Var == null) {
                    this.S2OOm9zPNm0h = m61Var3;
                } else {
                    m61Var.cpQdD2nAriOS = m61Var3;
                }
                m61Var2.cpQdD2nAriOS = null;
                m61Var2.x50lh2ztY7Y5 = null;
                int i = this.wdg6QnbFHrFF;
                int a92UlCVFR9N8 = qd1.a92UlCVFR9N8(this);
                fkblLSN2bAgv(a92UlCVFR9N8, true);
                if (this.S9EYkSpbGuxq && (i & 2) != 0 && (a92UlCVFR9N8 & 2) == 0) {
                    kd1 kd1Var = zv.zf8DYfih6EZu(this).nLZGh9p8gVSu;
                    this.rtx2ld2ELZv4.EP3hG58ROvHh(null);
                    kd1Var.RAsUl2FVSrh6();
                    return;
                }
                return;
            }
            m61Var = m61Var2;
        }
        u9.BRwzKIf41E4i(txVar, "Could not find delegate: ");
    }

    @Override // defpackage.m61
    public final void Y2PHjkwWz56c() {
        super.Y2PHjkwWz56c();
        for (m61 m61Var = this.S2OOm9zPNm0h; m61Var != null; m61Var = m61Var.cpQdD2nAriOS) {
            m61Var.Y2PHjkwWz56c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [m61] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void fkblLSN2bAgv(int i, boolean z) {
        m61 m61Var;
        int i2 = this.wdg6QnbFHrFF;
        this.wdg6QnbFHrFF = i;
        if (i2 != i) {
            m61 m61Var2 = this.rtx2ld2ELZv4;
            if (m61Var2 == this) {
                this.dgRBjINgWbAK = i;
            }
            boolean z2 = this.S9EYkSpbGuxq;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.wdg6QnbFHrFF;
                    r2.wdg6QnbFHrFF = i;
                    if (r2 == m61Var2) {
                        break;
                    } else {
                        r2 = r2.x50lh2ztY7Y5;
                    }
                }
                if (z && r2 == m61Var2) {
                    i = qd1.a92UlCVFR9N8(m61Var2);
                    m61Var2.wdg6QnbFHrFF = i;
                }
                int i3 = i | ((r2 == 0 || (m61Var = r2.cpQdD2nAriOS) == null) ? 0 : m61Var.dgRBjINgWbAK);
                for (m61 m61Var3 = r2; m61Var3 != null; m61Var3 = m61Var3.x50lh2ztY7Y5) {
                    i3 |= m61Var3.wdg6QnbFHrFF;
                    m61Var3.dgRBjINgWbAK = i3;
                }
            }
        }
    }

    @Override // defpackage.m61
    public final void twy4zb2fCtqq() {
        for (m61 m61Var = this.S2OOm9zPNm0h; m61Var != null; m61Var = m61Var.cpQdD2nAriOS) {
            m61Var.twy4zb2fCtqq();
        }
        super.twy4zb2fCtqq();
    }

    @Override // defpackage.m61
    public final void wnqUPcAvl7HT() {
        super.wnqUPcAvl7HT();
        for (m61 m61Var = this.S2OOm9zPNm0h; m61Var != null; m61Var = m61Var.cpQdD2nAriOS) {
            m61Var.wnqUPcAvl7HT();
        }
    }
}
