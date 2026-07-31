package com.bytedance.sdk.openadsdk.klz.zmn;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.hgd;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class doe extends com.bytedance.sdk.component.zmn.kgc<JSONObject, JSONObject> {
    public static final HashSet<String> zmn = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private nqi fb;
    private com.bytedance.sdk.component.bvs.nps fs;
    private fkt zn;

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, com.bytedance.sdk.component.bvs.nps npsVar, fkt fktVar, nqi nqiVar) {
        cnVar.zmn(zmn, new doe(npsVar, fktVar, nqiVar));
    }

    public doe(com.bytedance.sdk.component.bvs.nps npsVar, fkt fktVar, nqi nqiVar) {
        this.fs = npsVar;
        this.zn = fktVar;
        this.fb = nqiVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        return r6;
     */
    @Override // com.bytedance.sdk.component.zmn.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.hashCode();
        switch (str) {
            case "getCurrentVisibleState":
                nqi nqiVar = this.fb;
                if (nqiVar != null) {
                    jSONObject2.put("visibleState", !hgd.zmn(this.fs, 20, nqiVar.sft(), false) ? 1 : 0);
                    break;
                }
                break;
            case "closeWebview":
                nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.doe.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (doe.this.fs != null) {
                            doe.this.fs.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) doe.this.fs.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(doe.this.fs);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                break;
            case "makeVisible":
                if (this.fs != null) {
                    jSONObject2.put("success", true);
                    nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.doe.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (doe.this.fs != null) {
                                doe.this.fs.setVisibility(0);
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
