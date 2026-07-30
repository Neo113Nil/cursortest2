package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nz1 {
    public static final mz1 Companion = new mz1();
    public final pz1 PxuCJdSBwIXG;
    public final cr1 lS5Rgt96tfkO;

    public nz1(pz1 pz1Var) {
        this.PxuCJdSBwIXG = pz1Var;
        this.lS5Rgt96tfkO = new cr1(pz1Var);
    }

    public final void PxuCJdSBwIXG() {
        this.PxuCJdSBwIXG.PxuCJdSBwIXG();
    }

    public final void TSizfFm2Yiuu(Bundle bundle) {
        pz1 pz1Var = this.PxuCJdSBwIXG;
        Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
        Bundle bundle2 = pz1Var.a92UlCVFR9N8;
        if (bundle2 != null) {
            ZbWwgt3aGe7A.putAll(bundle2);
        }
        synchronized (pz1Var.TSizfFm2Yiuu) {
            for (Map.Entry entry : pz1Var.Y1f8riQaR6yg.entrySet()) {
                String str = (String) entry.getKey();
                Bundle PxuCJdSBwIXG = ((lz1) entry.getValue()).PxuCJdSBwIXG();
                str.getClass();
                PxuCJdSBwIXG.getClass();
                ZbWwgt3aGe7A.putBundle(str, PxuCJdSBwIXG);
            }
        }
        if (ZbWwgt3aGe7A.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", ZbWwgt3aGe7A);
    }

    public final void lS5Rgt96tfkO(Bundle bundle) {
        pz1 pz1Var = this.PxuCJdSBwIXG;
        qz1 qz1Var = pz1Var.PxuCJdSBwIXG;
        if (!pz1Var.e9gEMXR7LXtO) {
            pz1Var.PxuCJdSBwIXG();
        }
        if (qz1Var.rtx2ld2ELZv4().rtx2ld2ELZv4.compareTo(f01.dgRBjINgWbAK) >= 0) {
            rc1.a92UlCVFR9N8(qz1Var.rtx2ld2ELZv4().rtx2ld2ELZv4, "performRestore cannot be called when owner is ");
            return;
        }
        if (pz1Var.RAsUl2FVSrh6) {
            u9.rtx2ld2ELZv4("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                xi0.ryVscX7ZL4Ux("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        pz1Var.a92UlCVFR9N8 = bundle2;
        pz1Var.RAsUl2FVSrh6 = true;
    }
}
