package com.bytedance.sdk.openadsdk.klz.zmn;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.hgd;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.nu;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class phc extends com.bytedance.sdk.component.zmn.fb<JSONObject, JSONObject> {
    private String fb;
    private fkt fs;
    private com.bytedance.sdk.component.bvs.nps zmn;
    private nqi zn;

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, com.bytedance.sdk.component.bvs.nps npsVar, fkt fktVar, nqi nqiVar) {
        cnVar.zmn("closeWebview", new phc(npsVar, "closeWebview", fktVar, nqiVar));
        cnVar.zmn("makeVisible", new phc(npsVar, "makeVisible", fktVar, nqiVar));
        cnVar.zmn("getCurrentVisibleState", new phc(npsVar, "getCurrentVisibleState", fktVar, nqiVar));
    }

    public phc(com.bytedance.sdk.component.bvs.nps npsVar, String str, fkt fktVar, nqi nqiVar) {
        this.zmn = npsVar;
        this.fb = str;
        this.fs = fktVar;
        this.zn = nqiVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        return r5;
     */
    @Override // com.bytedance.sdk.component.zmn.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        String str2 = this.fb;
        str2.hashCode();
        switch (str2) {
            case "getCurrentVisibleState":
                nqi nqiVar = this.zn;
                if (nqiVar != null) {
                    jSONObject2.put("visibleState", !hgd.zmn(this.zmn, 20, nqiVar.sft(), false) ? 1 : 0);
                    break;
                }
                break;
            case "closeWebview":
                nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.phc.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (phc.this.zmn != null) {
                            phc.this.zmn.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) phc.this.zmn.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(phc.this.zmn);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                break;
            case "makeVisible":
                if (this.zmn != null) {
                    jSONObject2.put("success", true);
                    nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.phc.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (phc.this.zmn != null) {
                                phc.this.zmn.setVisibility(0);
                            }
                        }
                    });
                    break;
                } else {
                    jSONObject2.put("success", false);
                    break;
                }
        }
    }
}
