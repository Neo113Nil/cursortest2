package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vi extends wi {
    public static final /* synthetic */ AtomicIntegerFieldUpdater cpQdD2nAriOS = AtomicIntegerFieldUpdater.newUpdater(vi.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final ui dgRBjINgWbAK;
    public final boolean x50lh2ztY7Y5;

    public /* synthetic */ vi(ui uiVar, boolean z) {
        this(uiVar, z, n50.rtx2ld2ELZv4, -3, ag.rtx2ld2ELZv4);
    }

    @Override // defpackage.wi, defpackage.v80
    public final Object PxuCJdSBwIXG(w80 w80Var, bt btVar) {
        int i = this.OPXfSBeufaJ8;
        su suVar = su.rtx2ld2ELZv4;
        if (i == -3) {
            boolean z = this.x50lh2ztY7Y5;
            if (z && cpQdD2nAriOS.getAndSet(this, 1) != 0) {
                u9.rtx2ld2ELZv4("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object BRwzKIf41E4i = bs0.BRwzKIf41E4i(w80Var, this.dgRBjINgWbAK, z, btVar);
            if (BRwzKIf41E4i == suVar) {
                return BRwzKIf41E4i;
            }
        } else {
            Object PxuCJdSBwIXG = super.PxuCJdSBwIXG(w80Var, btVar);
            if (PxuCJdSBwIXG == suVar) {
                return PxuCJdSBwIXG;
            }
        }
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.wi
    public final ui RAsUl2FVSrh6(ru ruVar) {
        if (!this.x50lh2ztY7Y5 || cpQdD2nAriOS.getAndSet(this, 1) == 0) {
            return this.OPXfSBeufaJ8 == -3 ? this.dgRBjINgWbAK : super.RAsUl2FVSrh6(ruVar);
        }
        u9.rtx2ld2ELZv4("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    @Override // defpackage.wi
    public final String TSizfFm2Yiuu() {
        return "channel=" + this.dgRBjINgWbAK;
    }

    @Override // defpackage.wi
    public final Object Y1f8riQaR6yg(qq1 qq1Var, bt btVar) {
        Object BRwzKIf41E4i = bs0.BRwzKIf41E4i(new w32(qq1Var), this.dgRBjINgWbAK, this.x50lh2ztY7Y5, btVar);
        return BRwzKIf41E4i == su.rtx2ld2ELZv4 ? BRwzKIf41E4i : no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.wi
    public final v80 a92UlCVFR9N8() {
        return new vi(this.dgRBjINgWbAK, this.x50lh2ztY7Y5);
    }

    @Override // defpackage.wi
    public final wi e9gEMXR7LXtO(hu huVar, int i, ag agVar) {
        return new vi(this.dgRBjINgWbAK, this.x50lh2ztY7Y5, huVar, i, agVar);
    }

    public vi(ui uiVar, boolean z, hu huVar, int i, ag agVar) {
        super(huVar, i, agVar);
        this.dgRBjINgWbAK = uiVar;
        this.x50lh2ztY7Y5 = z;
        this.consumed$volatile = 0;
    }
}
