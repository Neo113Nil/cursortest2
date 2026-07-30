package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pz1 {
    private static final oz1 Companion = new oz1();
    public final qz1 PxuCJdSBwIXG;
    public boolean RAsUl2FVSrh6;
    public Bundle a92UlCVFR9N8;
    public boolean e9gEMXR7LXtO;
    public final uy1 lS5Rgt96tfkO;
    public final fb0 TSizfFm2Yiuu = new fb0(18);
    public final LinkedHashMap Y1f8riQaR6yg = new LinkedHashMap();
    public boolean rtx2ld2ELZv4 = true;

    public pz1(qz1 qz1Var, uy1 uy1Var) {
        this.PxuCJdSBwIXG = qz1Var;
        this.lS5Rgt96tfkO = uy1Var;
    }

    public final void PxuCJdSBwIXG() {
        qz1 qz1Var = this.PxuCJdSBwIXG;
        if (qz1Var.rtx2ld2ELZv4().rtx2ld2ELZv4 != f01.OPXfSBeufaJ8) {
            u9.rtx2ld2ELZv4("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e9gEMXR7LXtO) {
                u9.rtx2ld2ELZv4("SavedStateRegistry was already attached.");
                return;
            }
            this.lS5Rgt96tfkO.PxuCJdSBwIXG();
            qz1Var.rtx2ld2ELZv4().PxuCJdSBwIXG(new ha1(1, this));
            this.e9gEMXR7LXtO = true;
        }
    }
}
