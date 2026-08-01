package com.bytedance.sdk.openadsdk.mnm.pvs;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PAGMrcTrackerManager.java */
/* loaded from: classes2.dex */
public class NB {
    private static final Map<Integer, icD> pvs = new ConcurrentHashMap();

    public static void pvs(View view, cR cRVar, pvs pvsVar) {
        if (view == null || cRVar == null || cRVar.GcG()) {
            return;
        }
        boolean vG = vG(cRVar);
        if (rCZ.icD(cRVar) && pvsVar != null) {
            pvsVar.pvs = -1;
        }
        pvs(pvs(view, cRVar, vG, pvsVar));
    }

    private static boolean vG(cR cRVar) {
        if (cRVar == null) {
            return false;
        }
        String pvs2 = jlb.pvs(cRVar);
        return (((("open_ad".equals(pvs2) || "fullscreen_interstitial_ad".equals(pvs2) || "rewarded_video".equals(pvs2)) && !rCZ.icD(cRVar)) && cRVar.mnm() != 5) && cRVar.mnm() != 33) && cR.NB(cRVar) && cRVar.od() != null;
    }

    private static icD pvs(View view, cR cRVar, boolean z, pvs pvsVar) {
        if (view == null || cRVar == null || cRVar.neB() == null) {
            return null;
        }
        Integer icD = icD(cRVar);
        Map<Integer, icD> map = pvs;
        if (map.containsKey(icD)) {
            icD icd = map.get(icD);
            if (icd != null) {
                icd.pvs(view);
            }
            return icd;
        }
        icD pvs2 = icD.pvs(z, icD, view, cRVar, pvsVar);
        map.put(icD, pvs2);
        return pvs2;
    }

    private static void pvs(icD icd) {
        if (icd == null) {
            return;
        }
        icd.pvs();
    }

    public static void pvs(cR cRVar, int i) {
        if (cRVar == null || cRVar.neB() == null) {
            return;
        }
        pvs(pvs.get(icD(cRVar)), i);
    }

    public static void pvs(icD icd, int i) {
        if (icd == null) {
            return;
        }
        icd.pvs(i);
    }

    public static void pvs(cR cRVar) {
        if (cRVar == null || cRVar.neB() == null) {
            return;
        }
        Integer icD = icD(cRVar);
        Map<Integer, icD> map = pvs;
        icD icd = map.get(icD);
        if (icd != null) {
            icd.Wyp();
        }
        icD(icD);
        if (map.size() <= 0) {
            yiw.pvs();
        }
    }

    public static icD pvs(Integer num) {
        return pvs.get(num);
    }

    public static void icD(Integer num) {
        pvs.remove(num);
    }

    public static Integer icD(cR cRVar) {
        return Integer.valueOf((cRVar.Yjw() + cRVar.neB()).hashCode());
    }

    /* compiled from: PAGMrcTrackerManager.java */
    public static class pvs {
        public int icD = -1;
        public int pvs;

        public pvs(int i) {
            this.pvs = i;
        }
    }
}
