package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hc extends dr2 {
    public final String TSizfFm2Yiuu;
    public as2 Y1f8riQaR6yg;
    public final String lS5Rgt96tfkO = "SaveableStateHolder_BackStackEntryKey";

    public hc(ez1 ez1Var) {
        Object obj;
        ez1Var.getClass();
        xb xbVar = ez1Var.lS5Rgt96tfkO;
        LinkedHashMap linkedHashMap = (LinkedHashMap) xbVar.lS5Rgt96tfkO;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) xbVar.e9gEMXR7LXtO;
        try {
            l92 l92Var = (l92) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (l92Var == null || (obj = l92Var.getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) xbVar.Y1f8riQaR6yg).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String str2 = this.lS5Rgt96tfkO;
            str2.getClass();
            ez1.Companion.getClass();
            if (str != null) {
                ArrayList arrayList = gz1.PxuCJdSBwIXG;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((Class) obj2).isInstance(str)) {
                        }
                    }
                }
                rc1.OPXfSBeufaJ8("Can't put value with type ", str.getClass(), " into saved state");
                throw null;
            }
            ArrayList arrayList2 = gz1.PxuCJdSBwIXG;
            Object obj3 = ez1Var.PxuCJdSBwIXG.get(str2);
            f81 f81Var = obj3 instanceof f81 ? (f81) obj3 : null;
            if (f81Var != null) {
                t9.bEKsvqmvPh2y().PxuCJdSBwIXG.getClass();
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    u9.rtx2ld2ELZv4(o0.x50lh2ztY7Y5("Cannot invoke ", "setValue", " on a background thread"));
                }
                f81Var.e9gEMXR7LXtO++;
                f81Var.TSizfFm2Yiuu = str;
                if (f81Var.a92UlCVFR9N8) {
                    f81Var.RAsUl2FVSrh6 = true;
                } else {
                    f81Var.a92UlCVFR9N8 = true;
                    do {
                        f81Var.RAsUl2FVSrh6 = false;
                        qy1 qy1Var = f81Var.lS5Rgt96tfkO;
                        qy1Var.getClass();
                        py1 py1Var = new py1(qy1Var);
                        qy1Var.rtx2ld2ELZv4.put(py1Var, Boolean.FALSE);
                        while (py1Var.hasNext()) {
                            f81Var.PxuCJdSBwIXG((e21) ((Map.Entry) py1Var.next()).getValue());
                            if (f81Var.RAsUl2FVSrh6) {
                                break;
                            }
                        }
                    } while (f81Var.RAsUl2FVSrh6);
                    f81Var.a92UlCVFR9N8 = false;
                }
            }
            xbVar.QrzZRwfaDlRX(str, str2);
        }
        this.TSizfFm2Yiuu = str;
    }

    @Override // defpackage.dr2
    public final void Y1f8riQaR6yg() {
        as2 as2Var = this.Y1f8riQaR6yg;
        if (as2Var == null) {
            cs0.tmVwIGCQF4zR("saveableStateHolderRef");
            throw null;
        }
        wy1 wy1Var = (wy1) as2Var.PxuCJdSBwIXG.get();
        if (wy1Var != null) {
            wy1Var.TSizfFm2Yiuu(this.TSizfFm2Yiuu);
        }
        as2 as2Var2 = this.Y1f8riQaR6yg;
        if (as2Var2 != null) {
            as2Var2.PxuCJdSBwIXG.clear();
        } else {
            cs0.tmVwIGCQF4zR("saveableStateHolderRef");
            throw null;
        }
    }
}
