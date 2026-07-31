package com.bytedance.sdk.openadsdk.klz.zmn;

import com.bytedance.sdk.component.zmn.zn;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class cn extends com.bytedance.sdk.component.zmn.zn<JSONObject, JSONObject> {
    private HashSet<Integer> fb = new HashSet<>();
    private nqi fs;
    private WeakReference<fkt> zmn;
    private long zn;

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, final fkt fktVar, final nqi nqiVar) {
        cnVar.zmn("requestDelayCallback", new zn.fs() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.cn.1
            @Override // com.bytedance.sdk.component.zmn.zn.fs
            public com.bytedance.sdk.component.zmn.zn zmn() {
                return new cn(fkt.this, nqiVar);
            }
        });
    }

    public cn(fkt fktVar, nqi nqiVar) {
        this.zmn = new WeakReference<>(fktVar);
        this.fs = nqiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.zmn.zn
    public void zmn(JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        fkt fktVar = this.zmn.get();
        if (fktVar == null || jSONObject == null) {
            zn();
            return;
        }
        fktVar.zmn(new com.bytedance.sdk.openadsdk.mw.fs() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.cn.2
            @Override // com.bytedance.sdk.openadsdk.mw.fs
            public void zmn(int i) {
                cn.this.fb.add(Integer.valueOf(i));
                if (cn.this.fb.size() >= cn.this.zn) {
                    try {
                        cn.this.zmn((cn) new JSONObject());
                        cn.this.fb.clear();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        });
        if (jSONObject.optInt(POBCTAOverlayData.KEY_CTA_DELAY, -1) < 0) {
            return;
        }
        this.zn = r2 / 1000;
    }
}
