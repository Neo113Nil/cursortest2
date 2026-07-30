package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vc1 {
    public static final uc1 Companion = new uc1();
    public static final LinkedHashMap lS5Rgt96tfkO = new LinkedHashMap();
    public final LinkedHashMap PxuCJdSBwIXG = new LinkedHashMap();

    public final void PxuCJdSBwIXG(tc1 tc1Var) {
        tc1Var.getClass();
        uc1 uc1Var = Companion;
        Class<?> cls = tc1Var.getClass();
        uc1Var.getClass();
        String PxuCJdSBwIXG = uc1.PxuCJdSBwIXG(cls);
        if (PxuCJdSBwIXG.length() <= 0) {
            u9.XL4ISE6Oc65B("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.PxuCJdSBwIXG;
        tc1 tc1Var2 = (tc1) linkedHashMap.get(PxuCJdSBwIXG);
        if (cs0.wdg6QnbFHrFF(tc1Var2, tc1Var)) {
            return;
        }
        if (tc1Var2 != null && tc1Var2.lS5Rgt96tfkO) {
            rc1.wdg6QnbFHrFF("Navigator ", tc1Var, " is replacing an already attached ", tc1Var2);
        } else if (tc1Var.lS5Rgt96tfkO) {
            u9.wdg6QnbFHrFF("Navigator ", tc1Var, " is already attached to another NavController");
        }
    }

    public final tc1 lS5Rgt96tfkO(String str) {
        str.getClass();
        Companion.getClass();
        if (str.length() <= 0) {
            u9.XL4ISE6Oc65B("navigator name cannot be an empty string");
            return null;
        }
        tc1 tc1Var = (tc1) this.PxuCJdSBwIXG.get(str);
        if (tc1Var != null) {
            return tc1Var;
        }
        u9.rtx2ld2ELZv4(o0.x50lh2ztY7Y5("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
