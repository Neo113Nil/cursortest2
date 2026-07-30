package defpackage;

import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class av2 implements tp, l01 {
    public final zp OPXfSBeufaJ8;
    public s01 dgRBjINgWbAK;
    public final r1 rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;
    public pe0 x50lh2ztY7Y5 = yn.PxuCJdSBwIXG;

    public av2(r1 r1Var, zp zpVar) {
        this.rtx2ld2ELZv4 = r1Var;
        this.OPXfSBeufaJ8 = zpVar;
    }

    public final void PxuCJdSBwIXG() {
        if (!this.wdg6QnbFHrFF) {
            this.wdg6QnbFHrFF = true;
            this.rtx2ld2ELZv4.getView().setTag(R.id.wrapped_composition_tag, null);
            s01 s01Var = this.dgRBjINgWbAK;
            if (s01Var != null) {
                s01Var.a92UlCVFR9N8(this);
            }
            this.dgRBjINgWbAK = null;
        }
        this.OPXfSBeufaJ8.cpQdD2nAriOS();
    }

    public final void TSizfFm2Yiuu(pe0 pe0Var) {
        this.rtx2ld2ELZv4.setOnReadyForComposition(new z4(8, this, pe0Var));
    }

    @Override // defpackage.l01
    public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
        if (e01Var == e01.ON_DESTROY) {
            PxuCJdSBwIXG();
        } else {
            if (e01Var != e01.ON_CREATE || this.wdg6QnbFHrFF) {
                return;
            }
            TSizfFm2Yiuu(this.x50lh2ztY7Y5);
        }
    }
}
