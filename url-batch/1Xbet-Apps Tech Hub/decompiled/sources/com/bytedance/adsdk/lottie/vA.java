package com.bytedance.adsdk.lottie;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PerformanceTracker.java */
/* loaded from: classes.dex */
public class vA {
    private boolean pvs = false;
    private final Set<Object> icD = new pvs();
    private final Map<String, com.bytedance.adsdk.lottie.sUS.Jd> vG = new HashMap();
    private final Comparator<Pair<String, Float>> Jd = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.lottie.vA.1
        @Override // java.util.Comparator
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    void pvs(boolean z) {
        this.pvs = z;
    }

    public void pvs(String str, float f) {
        if (this.pvs) {
            com.bytedance.adsdk.lottie.sUS.Jd jd = this.vG.get(str);
            if (jd == null) {
                jd = new com.bytedance.adsdk.lottie.sUS.Jd();
                this.vG.put(str, jd);
            }
            jd.pvs(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.icD.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
