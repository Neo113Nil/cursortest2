package com.bytedance.sdk.openadsdk.rc;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.hhw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zmn implements zn {
    private final fs fs;
    private final nqi zmn;
    private final Map<String, com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn> zn = new HashMap();

    private zmn(fs fsVar, nqi nqiVar) {
        this.fs = fsVar;
        this.zmn = nqiVar;
    }

    public static zmn zmn(fs fsVar, nqi nqiVar) {
        return new zmn(fsVar, nqiVar);
    }

    @Override // com.bytedance.sdk.openadsdk.rc.zn
    public void zmn() {
        this.zn.clear();
    }

    private nqi zmn(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        nqi nqiVar = new nqi();
        nqiVar.btk(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            nqiVar.rp(str);
        }
        if (this.zmn == null) {
            return nqiVar;
        }
        String zmn = nqiVar.pw() != null ? nqiVar.pw().zmn() : null;
        if (TextUtils.isEmpty(zmn)) {
            return this.zmn;
        }
        hhw pw = this.zmn.pw();
        if (pw != null && zmn.equals(pw.zmn())) {
            return this.zmn;
        }
        if (pw != null && zmn.contains("play.google.com/store") && !zmn.contains(Constants.REFERRER)) {
            nqiVar.pw().zmn(pw.zmn());
        }
        return nqiVar;
    }

    @Override // com.bytedance.sdk.openadsdk.rc.zn
    public void zmn(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject optJSONObject;
        if (context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        zmn(context, zmn(optJSONObject, str), optJSONObject, i, z);
    }

    private void zmn(Context context, nqi nqiVar, JSONObject jSONObject, int i, boolean z) {
        if (context == null || nqiVar == null || nqiVar.pw() == null || jSONObject == null || this.fs == null || this.zn.get(nqiVar.pw().zmn()) != null) {
            return;
        }
        String fs = oub.fs(i);
        if (TextUtils.isEmpty(fs)) {
            return;
        }
        this.zn.put(nqiVar.pw().zmn(), zmn(context, fs));
    }

    @Override // com.bytedance.sdk.openadsdk.rc.zn
    public void zmn(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.zmn == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(context, str).zmn(this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.rc.zn
    public void zmn(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        zmn(zmn(optJSONObject, (String) null), optJSONObject);
    }

    private void zmn(nqi nqiVar, JSONObject jSONObject) {
        if (this.fs == null || nqiVar == null || nqiVar.pw() == null) {
            return;
        }
        String zmn = nqiVar.pw().zmn();
        if (this.zn.containsKey(zmn)) {
            this.zn.remove(zmn);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.fs.zmn("app_ad_event", jSONObject2);
            } catch (JSONException e) {
                iqz.zn("JsAppAdDownloadManager", e.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn zmn(@NonNull Context context, @NonNull String str) {
        return com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(context, str);
    }
}
