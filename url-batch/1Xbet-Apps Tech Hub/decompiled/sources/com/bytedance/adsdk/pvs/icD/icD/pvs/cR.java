package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: PlusNode.java */
/* loaded from: classes.dex */
public class cR extends vA {
    private static final ThreadLocal<StringBuilder> Jd = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.pvs.icD.icD.pvs.cR.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public cR() {
        super(com.bytedance.adsdk.pvs.icD.Jd.vG.PLUS);
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        Object pvs;
        Object pvs2 = this.pvs.pvs(map);
        if (pvs2 == null || (pvs = this.icD.pvs(map)) == null) {
            return null;
        }
        if ((pvs2 instanceof String) || (pvs instanceof String)) {
            StringBuilder sb = Jd.get();
            sb.append(pvs2).append(pvs);
            String sb2 = sb.toString();
            sb.setLength(0);
            return sb2;
        }
        return com.bytedance.adsdk.pvs.icD.NB.pvs.so.pvs((Number) pvs2, (Number) pvs);
    }
}
