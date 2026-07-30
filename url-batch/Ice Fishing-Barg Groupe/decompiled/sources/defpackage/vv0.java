package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vv0 implements ku1, ku {
    public final pe0 OPXfSBeufaJ8;
    public z82 dgRBjINgWbAK;
    public final hu rtx2ld2ELZv4;
    public final at wdg6QnbFHrFF;

    public vv0(hu huVar, pe0 pe0Var) {
        this.rtx2ld2ELZv4 = huVar;
        this.OPXfSBeufaJ8 = pe0Var;
        this.wdg6QnbFHrFF = cs0.Y1f8riQaR6yg(huVar.RfyTYNmI9Srp(this));
    }

    @Override // defpackage.hu
    public final Object IAToe7bXGz4N(pe0 pe0Var, Object obj) {
        return pe0Var.rtx2ld2ELZv4(obj, this);
    }

    @Override // defpackage.ku1
    public final void PxuCJdSBwIXG() {
        z82 z82Var = this.dgRBjINgWbAK;
        if (z82Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            z82Var.a92UlCVFR9N8(cancellationException);
        }
        this.dgRBjINgWbAK = fx1.KUoIVIumpKat(this.wdg6QnbFHrFF, null, this.OPXfSBeufaJ8, 3);
    }

    @Override // defpackage.hu
    public final hu RfyTYNmI9Srp(hu huVar) {
        return f2.xfACYKDMU6Dj(this, huVar);
    }

    @Override // defpackage.hu
    public final fu S2OOm9zPNm0h(gu guVar) {
        return f2.EcgxDIVH5in8(this, guVar);
    }

    @Override // defpackage.ku1
    public final void TSizfFm2Yiuu() {
        z82 z82Var = this.dgRBjINgWbAK;
        if (z82Var != null) {
            z82Var.e6tOsSdd2EFb(new dd0(1));
        }
        this.dgRBjINgWbAK = null;
    }

    @Override // defpackage.ku1
    public final void Y1f8riQaR6yg() {
        z82 z82Var = this.dgRBjINgWbAK;
        if (z82Var != null) {
            z82Var.e6tOsSdd2EFb(new dd0(1));
        }
        this.dgRBjINgWbAK = null;
    }

    @Override // defpackage.ku
    public final void ZbWwgt3aGe7A(hu huVar, Throwable th) {
        xp xpVar = (xp) huVar.S2OOm9zPNm0h(xp.OPXfSBeufaJ8);
        if (xpVar != null) {
            fx1.twy4zb2fCtqq(th, new e6(5, xpVar, this));
        }
        ku kuVar = (ku) this.rtx2ld2ELZv4.S2OOm9zPNm0h(jx1.x50lh2ztY7Y5);
        if (kuVar == null) {
            throw th;
        }
        kuVar.ZbWwgt3aGe7A(huVar, th);
    }

    @Override // defpackage.fu
    public final gu getKey() {
        return jx1.x50lh2ztY7Y5;
    }

    @Override // defpackage.hu
    public final hu kpCQ9veP6n3I(gu guVar) {
        return f2.IAToe7bXGz4N(this, guVar);
    }
}
