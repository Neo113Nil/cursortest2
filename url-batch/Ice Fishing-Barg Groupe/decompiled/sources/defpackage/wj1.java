package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wj1 implements sq {
    public final String OPXfSBeufaJ8;
    public final qc2 dgRBjINgWbAK = new qc2(new o5(24, this));
    public final gy1 rtx2ld2ELZv4;
    public final pe0 wdg6QnbFHrFF;

    public wj1(gy1 gy1Var, String str, pe0 pe0Var) {
        this.rtx2ld2ELZv4 = gy1Var;
        this.OPXfSBeufaJ8 = str;
        this.wdg6QnbFHrFF = pe0Var;
    }

    @Override // defpackage.sq
    public final Object EcgxDIVH5in8(boolean z, pe0 pe0Var, ct ctVar) {
        vj1 vj1Var = (vj1) ctVar.e9gEMXR7LXtO().S2OOm9zPNm0h(vj1.OPXfSBeufaJ8);
        bt btVar = null;
        uj1 uj1Var = vj1Var != null ? vj1Var.rtx2ld2ELZv4 : null;
        if (uj1Var != null) {
            return pe0Var.rtx2ld2ELZv4(uj1Var, ctVar);
        }
        uj1 uj1Var2 = new uj1(this.wdg6QnbFHrFF, (fy1) this.dgRBjINgWbAK.getValue());
        return fx1.OYiFbU3x63rc(new vj1(uj1Var2), new a92UlCVFR9N8(pe0Var, uj1Var2, btVar, 23), ctVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        qc2 qc2Var = this.dgRBjINgWbAK;
        if (qc2Var.OPXfSBeufaJ8 != jx1.pnx5pC0XzaCw) {
            ((fy1) qc2Var.getValue()).close();
        }
    }
}
