package com.bytedance.adsdk.zmn.fs.fs.zmn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class kgc extends olo {
    private static final ThreadLocal<StringBuilder> fb = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.zmn.fs.fs.zmn.kgc.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public kgc() {
        super(com.bytedance.adsdk.zmn.fs.fb.zn.PLUS);
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        Object zmn;
        Object zmn2 = this.zmn.zmn(map);
        if (zmn2 == null || (zmn = this.fs.zmn(map)) == null) {
            return null;
        }
        if ((zmn2 instanceof String) || (zmn instanceof String)) {
            StringBuilder sb = fb.get();
            sb.append(zmn2);
            sb.append(zmn);
            String sb2 = sb.toString();
            sb.setLength(0);
            return sb2;
        }
        return com.bytedance.adsdk.zmn.fs.btk.zmn.zg.zmn((Number) zmn2, (Number) zmn);
    }
}
