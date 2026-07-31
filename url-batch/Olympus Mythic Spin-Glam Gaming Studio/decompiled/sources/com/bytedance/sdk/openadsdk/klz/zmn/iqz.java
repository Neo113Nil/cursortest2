package com.bytedance.sdk.openadsdk.klz.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.ww;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class iqz extends com.bytedance.sdk.component.zmn.kgc<JSONObject, JSONObject> {
    public static final HashSet<String> zmn = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private nqi fs;

    public iqz(nqi nqiVar) {
        this.fs = nqiVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, nqi nqiVar) {
        cnVar.zmn(zmn, new iqz(nqiVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        return r0;
     */
    @Override // com.bytedance.sdk.component.zmn.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        String xqp;
        JSONObject jSONObject2;
        nqi nqiVar = this.fs;
        if (nqiVar != null && (xqp = nqiVar.xqp()) != null) {
            jSONObject2 = new JSONObject();
            str.hashCode();
            switch (str) {
                case "getStorageItem":
                    String optString = jSONObject.optString("key");
                    if (!TextUtils.isEmpty(optString) && ww.zmn().fs(xqp, optString)) {
                        jSONObject2.put("value", ww.zmn().zmn(xqp, optString));
                        jSONObject2.put("code", "0");
                        break;
                    } else {
                        jSONObject2.put("code", "1");
                        break;
                    }
                    break;
                case "removeAllStorage":
                    ww.zmn().zmn(xqp);
                    jSONObject2.put("code", "0");
                    break;
                case "setStorageItem":
                    String optString2 = jSONObject.optString("key");
                    String optString3 = jSONObject.optString("value");
                    if (optString2 != null) {
                        ww.zmn().zmn(xqp, optString2, optString3);
                        jSONObject2.put("code", "0");
                        break;
                    } else {
                        jSONObject2.put("code", "1");
                        break;
                    }
                case "removeStorageItem":
                    String optString4 = jSONObject.optString("key");
                    if (!TextUtils.isEmpty(optString4)) {
                        jSONObject2.put("code", ww.zmn().zn(xqp, optString4) ? "0" : "1");
                        break;
                    } else {
                        jSONObject2.put("code", "1");
                        break;
                    }
            }
        } else {
            return null;
        }
    }
}
