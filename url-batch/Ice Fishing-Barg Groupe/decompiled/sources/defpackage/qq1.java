package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qq1 extends EcgxDIVH5in8 implements ui, v32 {
    public final eg cpQdD2nAriOS;

    public qq1(hu huVar, eg egVar) {
        super(huVar, true);
        this.cpQdD2nAriOS = egVar;
    }

    @Override // defpackage.EcgxDIVH5in8
    public final void Nlhe969cAGO8(Throwable th, boolean z) {
        if (this.cpQdD2nAriOS.OPXfSBeufaJ8(th, false) || z) {
            return;
        }
        bs0.S2OOm9zPNm0h(this.x50lh2ztY7Y5, th);
    }

    @Override // defpackage.v32
    public final Object PxuCJdSBwIXG(bt btVar, Object obj) {
        return this.cpQdD2nAriOS.PxuCJdSBwIXG(btVar, obj);
    }

    @Override // defpackage.v32
    public final Object Y1f8riQaR6yg(Object obj) {
        return this.cpQdD2nAriOS.Y1f8riQaR6yg(obj);
    }

    @Override // defpackage.et0, defpackage.xs0
    public final void a92UlCVFR9N8(CancellationException cancellationException) {
        Object i68hK7ahKtgp = i68hK7ahKtgp();
        if (i68hK7ahKtgp instanceof sm) {
            return;
        }
        if ((i68hK7ahKtgp instanceof dt0) && ((dt0) i68hK7ahKtgp).a92UlCVFR9N8()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new ys0(BjEWd04qc7Mw(), null, this);
        }
        e6tOsSdd2EFb(cancellationException);
    }

    @Override // defpackage.EcgxDIVH5in8
    public final void e4HgwifUDUCA(Object obj) {
        vi0.wdg6QnbFHrFF(this.cpQdD2nAriOS);
    }

    @Override // defpackage.et0
    public final void e6tOsSdd2EFb(CancellationException cancellationException) {
        this.cpQdD2nAriOS.OPXfSBeufaJ8(cancellationException, true);
        VhhvGxCb8gfr(cancellationException);
    }

    @Override // defpackage.ui
    public final bg iterator() {
        eg egVar = this.cpQdD2nAriOS;
        egVar.getClass();
        return new bg(egVar);
    }

    @Override // defpackage.ui
    public final Object r3s1LDPKFs1S(im imVar) {
        eg egVar = this.cpQdD2nAriOS;
        egVar.getClass();
        return eg.ozEBbv0hFTAB(egVar, imVar);
    }

    @Override // defpackage.ui
    public final Object rtx2ld2ELZv4(jc2 jc2Var) {
        eg egVar = this.cpQdD2nAriOS;
        egVar.getClass();
        return eg.BjEWd04qc7Mw(egVar, jc2Var);
    }

    @Override // defpackage.ui
    public final Object x50lh2ztY7Y5() {
        return this.cpQdD2nAriOS.x50lh2ztY7Y5();
    }
}
