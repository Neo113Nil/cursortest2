package com.bytedance.adsdk.pvs.icD;

import com.bytedance.adsdk.pvs.icD.vG.pvs.Jd;
import com.bytedance.adsdk.pvs.icD.vG.pvs.Mxy;
import com.bytedance.adsdk.pvs.icD.vG.pvs.NB;
import com.bytedance.adsdk.pvs.icD.vG.pvs.Wyp;
import com.bytedance.adsdk.pvs.icD.vG.pvs.icD;
import com.bytedance.adsdk.pvs.icD.vG.pvs.sUS;
import com.bytedance.adsdk.pvs.icD.vG.pvs.so;
import com.bytedance.adsdk.pvs.icD.vG.pvs.vG;
import com.bytedance.adsdk.pvs.icD.vG.pvs.yiw;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Expression.java */
/* loaded from: classes.dex */
public class pvs {
    private static final com.bytedance.adsdk.pvs.icD.vG.pvs pvs;
    private Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> Jd = new LinkedList();
    private String NB;
    private final com.bytedance.adsdk.pvs.icD.vG.pvs icD;
    private com.bytedance.adsdk.pvs.icD.icD.pvs vG;

    static {
        int i = 8;
        sUS[] susArr = {new Wyp(), new Jd(), new Mxy(), new icD(), new NB(), new com.bytedance.adsdk.pvs.icD.vG.pvs.pvs(), new yiw(), new vG(), new so()};
        final com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar = new com.bytedance.adsdk.pvs.icD.vG.pvs() { // from class: com.bytedance.adsdk.pvs.icD.pvs.1
            @Override // com.bytedance.adsdk.pvs.icD.vG.pvs
            public int pvs(String str, int i2, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final sUS sus = susArr[i];
            i--;
            pvsVar = new com.bytedance.adsdk.pvs.icD.vG.pvs() { // from class: com.bytedance.adsdk.pvs.icD.pvs.2
                @Override // com.bytedance.adsdk.pvs.icD.vG.pvs
                public int pvs(String str, int i2, Deque<com.bytedance.adsdk.pvs.icD.icD.pvs> deque) {
                    return sUS.this.pvs(str, i2, deque, pvsVar);
                }
            };
        }
        pvs = pvsVar;
    }

    private pvs(String str, com.bytedance.adsdk.pvs.icD.vG.pvs pvsVar) {
        this.icD = pvsVar;
        this.NB = str;
        try {
            pvs();
        } catch (Exception e) {
            throw new com.bytedance.adsdk.pvs.pvs.icD(str, e);
        }
    }

    public static pvs pvs(String str) {
        return new pvs(str, pvs);
    }

    private void pvs() {
        int length = this.NB.length();
        int i = 0;
        while (i < length) {
            int pvs2 = this.icD.pvs(this.NB, i, this.Jd);
            if (pvs2 == i) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.NB.substring(0, i));
            }
            i = pvs2;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.pvs.icD.icD.pvs pollFirst = this.Jd.pollFirst();
            if (pollFirst != null) {
                arrayList.add(0, pollFirst);
            } else {
                this.vG = com.bytedance.adsdk.pvs.icD.NB.icD.pvs(arrayList, this.NB, i);
                this.Jd = null;
                return;
            }
        }
    }

    public <T> T pvs(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("default_key", jSONObject);
        return (T) pvs(hashMap);
    }

    public <T> T pvs(Map<String, JSONObject> map) {
        return (T) this.vG.pvs(map);
    }
}
