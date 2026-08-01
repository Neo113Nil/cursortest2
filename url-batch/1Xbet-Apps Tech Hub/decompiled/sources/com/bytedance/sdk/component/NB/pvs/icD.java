package com.bytedance.sdk.component.NB.pvs;

import com.bytedance.sdk.component.NB.Mxy;
import com.bytedance.sdk.component.NB.kj;
import java.util.WeakHashMap;

/* compiled from: KeyGeneratorFactory.java */
/* loaded from: classes.dex */
public class icD {
    public static kj pvs() {
        return new kj() { // from class: com.bytedance.sdk.component.NB.pvs.icD.1
            private WeakHashMap<String, String> pvs = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.NB.kj
            public String pvs(Mxy mxy) {
                return pvs(mxy.pvs() + "#width=" + mxy.icD() + "#height=" + mxy.vG() + "#scaletype=" + mxy.Jd() + "#bitmapConfig=" + mxy.sUS());
            }

            @Override // com.bytedance.sdk.component.NB.kj
            public String icD(Mxy mxy) {
                return pvs(mxy.pvs());
            }

            private String pvs(String str) {
                String str2 = this.pvs.get(str);
                if (str2 != null) {
                    return str2;
                }
                String pvs = com.bytedance.sdk.component.NB.vG.vG.vG.pvs(str);
                this.pvs.put(str, pvs);
                return pvs;
            }
        };
    }
}
