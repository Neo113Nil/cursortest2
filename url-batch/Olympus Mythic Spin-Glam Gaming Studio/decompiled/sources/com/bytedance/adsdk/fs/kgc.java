package com.bytedance.adsdk.fs;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public class kgc {
    private boolean zmn = false;
    private final Set<Object> fs = new zmn();
    private final Map<String, com.bytedance.adsdk.fs.hhw.fb> zn = new HashMap();
    private final Comparator<Pair<String, Float>> fb = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.fs.kgc.1
        @Override // java.util.Comparator
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = ((Float) pair.second).floatValue();
            float floatValue2 = ((Float) pair2.second).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    void zmn(boolean z) {
        this.zmn = z;
    }

    public void zmn(String str, float f) {
        if (this.zmn) {
            com.bytedance.adsdk.fs.hhw.fb fbVar = this.zn.get(str);
            if (fbVar == null) {
                fbVar = new com.bytedance.adsdk.fs.hhw.fb();
                this.zn.put(str, fbVar);
            }
            fbVar.zmn(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.fs.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
