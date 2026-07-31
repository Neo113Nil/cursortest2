package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.metadata.a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class nqi {
    public static int fs = Integer.MIN_VALUE;
    public static int zmn = Integer.MIN_VALUE;
    public static final String[] zn = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    public static String zmn() {
        if (zmn == Integer.MIN_VALUE) {
            zmn = com.bytedance.sdk.openadsdk.core.iv.btk();
        }
        if (zmn < 0) {
            zmn = 0;
        }
        String[] strArr = zn;
        try {
            return strArr[zmn % strArr.length];
        } catch (Throwable unused) {
            return strArr[0];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        r2 = com.bytedance.sdk.openadsdk.utils.nqi.zmn + 1;
        com.bytedance.sdk.openadsdk.utils.nqi.zmn = r2;
        com.bytedance.sdk.openadsdk.core.iv.zmn(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:16:0x0028, B:18:0x0030, B:23:0x003b, B:25:0x0041, B:26:0x0047, B:28:0x0050, B:29:0x006d, B:34:0x0025, B:9:0x0009, B:11:0x000e, B:15:0x0016), top: B:8:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:16:0x0028, B:18:0x0030, B:23:0x003b, B:25:0x0041, B:26:0x0047, B:28:0x0050, B:29:0x006d, B:34:0x0025, B:9:0x0009, B:11:0x000e, B:15:0x0016), top: B:8:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:16:0x0028, B:18:0x0030, B:23:0x003b, B:25:0x0041, B:26:0x0047, B:28:0x0050, B:29:0x006d, B:34:0x0025, B:9:0x0009, B:11:0x000e, B:15:0x0016), top: B:8:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void zmn(String str) {
        int i;
        synchronized (nqi.class) {
            if (str == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                try {
                    try {
                        String[] strArr = zn;
                        if (i2 >= strArr.length) {
                            break;
                        } else if (str.contains(strArr[i2])) {
                            break;
                        } else {
                            i2++;
                        }
                    } finally {
                        if (!str.contains("/api/ad/union/sdk/settings/")) {
                        }
                        if (fs == Integer.MIN_VALUE) {
                        }
                        i = fs + 1;
                        fs = i;
                        if (i >= 3) {
                        }
                        com.bytedance.sdk.openadsdk.core.iv.fs(fs);
                    }
                } catch (Throwable th) {
                }
            }
            if (!str.contains("/api/ad/union/sdk/settings/")) {
                if (!str.contains("/api/ad/union/sdk/strategies/adn")) {
                }
            }
            if (fs == Integer.MIN_VALUE) {
                fs = com.bytedance.sdk.openadsdk.core.iv.hhw();
            }
            i = fs + 1;
            fs = i;
            if (i >= 3) {
                final String oub = com.bytedance.sdk.openadsdk.core.settings.rc.fs().oub();
                final int i3 = fs;
                com.bytedance.sdk.openadsdk.core.settings.rc.fs().sxr();
                fs = 0;
                com.bytedance.sdk.openadsdk.cyb.fb.zmn("clear_domain", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.utils.nqi.1
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs
                    public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("domain", oub);
                            jSONObject.put("times", i3);
                        } catch (Exception unused) {
                        }
                        return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("clear_domain").fs(jSONObject.toString());
                    }
                });
            }
            com.bytedance.sdk.openadsdk.core.iv.fs(fs);
        }
    }

    public static synchronized void fs() {
        synchronized (nqi.class) {
            if (fs == 0) {
                return;
            }
            fs = 0;
            com.bytedance.sdk.openadsdk.core.iv.fs(0);
        }
    }

    public static void zmn(com.bytedance.sdk.component.bvs.nps npsVar, String str) {
        if (TextUtils.isEmpty(str) || npsVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.uqh.btk.zmn("pag_additional_headers", (Object) null, com.bytedance.sdk.openadsdk.uqh.fs.zmn);
            HashMap hashMap = new HashMap();
            boolean z = false;
            if (jSONObject != null) {
                z = jSONObject.optBoolean(a.k, false);
                JSONObject optJSONObject = jSONObject.optJSONObject("header_value");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = optJSONObject.optString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                            hashMap.put(next, optString);
                        }
                    }
                }
            }
            if (!z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
                npsVar.zmn(str, hashMap2);
            } else if (!hashMap.isEmpty()) {
                npsVar.zmn(str, hashMap);
            } else {
                npsVar.a_(str);
            }
        } catch (Throwable unused) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
            npsVar.zmn(str, hashMap3);
        }
    }
}
