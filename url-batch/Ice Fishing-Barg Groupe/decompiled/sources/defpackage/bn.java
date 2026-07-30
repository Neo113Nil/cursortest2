package defpackage;

import com.ice.fishing.grenza.MainActivity;
import java.util.HashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bn implements l01 {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ bn(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // defpackage.l01
    public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj;
                if (mainActivity.x50lh2ztY7Y5 == null) {
                    dn dnVar = (dn) mainActivity.getLastNonConfigurationInstance();
                    if (dnVar != null) {
                        mainActivity.x50lh2ztY7Y5 = dnVar.PxuCJdSBwIXG;
                    }
                    if (mainActivity.x50lh2ztY7Y5 == null) {
                        mainActivity.x50lh2ztY7Y5 = new or2();
                    }
                }
                mainActivity.rtx2ld2ELZv4.a92UlCVFR9N8(this);
                return;
            case 1:
                new HashMap();
                hg0[] hg0VarArr = (hg0[]) obj;
                if (hg0VarArr.length > 0) {
                    hg0 hg0Var = hg0VarArr[0];
                    throw null;
                }
                if (hg0VarArr.length <= 0) {
                    return;
                }
                hg0 hg0Var2 = hg0VarArr[0];
                throw null;
            default:
                if (e01Var != e01.ON_CREATE) {
                    rc1.a92UlCVFR9N8(e01Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    o01Var.rtx2ld2ELZv4().a92UlCVFR9N8(this);
                    ((iz1) obj).lS5Rgt96tfkO();
                    return;
                }
        }
    }
}
