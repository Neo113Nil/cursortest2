package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cz1 implements zy1, qz1 {
    public s01 OPXfSBeufaJ8;
    public final /* synthetic */ az1 rtx2ld2ELZv4;
    public nz1 wdg6QnbFHrFF;

    public cz1(az1 az1Var) {
        this.rtx2ld2ELZv4 = az1Var;
        Object a92UlCVFR9N8 = az1Var.a92UlCVFR9N8("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = a92UlCVFR9N8 instanceof Bundle ? (Bundle) a92UlCVFR9N8 : null;
        if (bundle != null && this.wdg6QnbFHrFF == null) {
            nz1.Companion.getClass();
            nz1 PxuCJdSBwIXG = mz1.PxuCJdSBwIXG(this);
            this.wdg6QnbFHrFF = PxuCJdSBwIXG;
            PxuCJdSBwIXG.lS5Rgt96tfkO(bundle);
        }
        az1Var.PxuCJdSBwIXG("androidx.savedstate.SavedStateRegistry", new uy1(1, this));
    }

    @Override // defpackage.zy1
    public final m9 PxuCJdSBwIXG(String str, ae0 ae0Var) {
        return this.rtx2ld2ELZv4.PxuCJdSBwIXG(str, ae0Var);
    }

    @Override // defpackage.qz1
    public final cr1 TSizfFm2Yiuu() {
        nz1 nz1Var = this.wdg6QnbFHrFF;
        if (nz1Var == null) {
            nz1.Companion.getClass();
            nz1Var = mz1.PxuCJdSBwIXG(this);
            this.wdg6QnbFHrFF = nz1Var;
            nz1Var.lS5Rgt96tfkO(null);
        }
        return nz1Var.lS5Rgt96tfkO;
    }

    @Override // defpackage.zy1
    public final boolean Y1f8riQaR6yg(Object obj) {
        return this.rtx2ld2ELZv4.Y1f8riQaR6yg(obj);
    }

    @Override // defpackage.zy1
    public final Object a92UlCVFR9N8(String str) {
        return this.rtx2ld2ELZv4.a92UlCVFR9N8(str);
    }

    @Override // defpackage.zy1
    public final Map e9gEMXR7LXtO() {
        return this.rtx2ld2ELZv4.e9gEMXR7LXtO();
    }

    @Override // defpackage.o01
    public final s01 rtx2ld2ELZv4() {
        s01 s01Var = this.OPXfSBeufaJ8;
        if (s01Var != null) {
            return s01Var;
        }
        s01.Companion.getClass();
        s01 s01Var2 = new s01(this, false);
        this.OPXfSBeufaJ8 = s01Var2;
        return s01Var2;
    }
}
