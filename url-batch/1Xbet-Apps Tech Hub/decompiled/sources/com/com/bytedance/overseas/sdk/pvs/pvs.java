package com.com.bytedance.overseas.sdk.pvs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.icD.kj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: AndroidRGPDownLoader.java */
/* loaded from: classes2.dex */
public class pvs extends icD {
    public pvs(Context context, cR cRVar, String str) {
        super(context, cRVar, str);
    }

    @Override // com.com.bytedance.overseas.sdk.pvs.icD, com.com.bytedance.overseas.sdk.pvs.vG
    public boolean pvs() {
        HashMap hashMap;
        if (this.pvs == null) {
            return false;
        }
        if (this.icD == null || this.icD.xyK() != 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("dpl_probability_jump", Boolean.valueOf(this.yiw >= 11));
        }
        return pvs(this.icD, this.pvs.vG(), vG(), this.vG, hashMap);
    }

    public static boolean pvs(cR cRVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent pvs;
        if (cRVar != null && cRVar.EFw() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (pvs = jlb.pvs(context, str)) == null) {
                return false;
            }
            pvs.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                pvs.addFlags(268435456);
            }
            context.startActivity(pvs);
            if (map == null) {
                map = new HashMap<>();
            }
            pvs(cRVar, map);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    private static void pvs(cR cRVar, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (cRVar != null && cRVar.xyK() == 0) {
            map.put("auto_click", Boolean.valueOf((cRVar == null || cRVar.Jd()) ? false : true));
        }
        map.put("can_query_install", 0);
    }

    @Override // com.com.bytedance.overseas.sdk.pvs.icD
    public boolean icD() {
        com.bytedance.sdk.openadsdk.core.Jd.pvs(this.icD, this.vG, 1, null);
        if (this.icD.Zm() != null) {
            HashMap hashMap = new HashMap();
            if (this.icD != null && this.icD.xyK() == 0) {
                hashMap.put("dpl_probability_jump", Boolean.valueOf(this.yiw >= 11));
            }
            if (pvs(this.icD.Zm().pvs(), vG(), this.vG, this.icD, hashMap)) {
                return true;
            }
            if (!this.Jd || this.sUS.get()) {
                this.Jd = true;
                pvs(this.icD, hashMap);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(this.icD, this.vG, "open_fallback_url", hashMap);
            }
        } else {
            com.bytedance.sdk.openadsdk.core.Jd.pvs(this.icD, this.vG, -1, null);
        }
        return false;
    }

    public static boolean pvs(String str, Context context, String str2, cR cRVar, Map<String, Object> map) {
        Intent intent = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            try {
                intent2.setData(parse);
                if (!(context instanceof Activity)) {
                    intent2.addFlags(268435456);
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                pvs(cRVar, map);
                map.put(ImagesContract.URL, str);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str2, "open_url_app", map);
                context.startActivity(intent2);
                kj.pvs().pvs(map).pvs(cRVar, str2);
                com.bytedance.sdk.openadsdk.icD.vG.pvs("dp_start_act_success", cRVar, str2, map);
                return true;
            } catch (Throwable th2) {
                th = th2;
                intent = intent2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("exception", th.getMessage());
                    if (intent != null) {
                        jSONObject.put("intent", intent.toString());
                    }
                    jSONObject.put("can_query_install", 0);
                } catch (Exception unused) {
                }
                com.bytedance.sdk.openadsdk.core.Jd.pvs(cRVar, str2, -4, jSONObject);
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.Jd.pvs(cRVar, str2, -2, null);
        return false;
    }
}
