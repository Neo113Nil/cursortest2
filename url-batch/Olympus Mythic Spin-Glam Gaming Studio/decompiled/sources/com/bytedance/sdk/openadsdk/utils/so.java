package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class so {

    private static final class zmn {
        static final so zmn = new so();
    }

    public static so zmn() {
        return zmn.zmn;
    }

    private so() {
    }

    public void fs() {
        try {
            final JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.uqh.btk.zmn("detect_cls_config", (Object) null, com.bytedance.sdk.openadsdk.uqh.fs.zmn);
            if (jSONObject.optBoolean(a.k, false)) {
                com.bytedance.sdk.openadsdk.core.cn.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.so.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            so.this.zmn(jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                }, jSONObject.optLong(POBCTAOverlayData.KEY_CTA_DELAY, 5000L));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && !a.k.equalsIgnoreCase(next) && !POBCTAOverlayData.KEY_CTA_DELAY.equalsIgnoreCase(next)) {
                    zmn(next, jSONObject.optJSONArray(next));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void zmn(String str, JSONArray jSONArray) {
        if (TextUtils.isEmpty(str) || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = jSONArray.length();
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = z2;
                break;
            }
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString) && !zmn(optString)) {
                break;
            }
            if (i == length - 1) {
                z2 = true;
            }
            i++;
        }
        zmn(str, z, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    private void zmn(final String str, final boolean z, final long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("detect_some_sdk", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.utils.so.2
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            @Nullable
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("name", str);
                jSONObject.putOpt(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
                jSONObject.putOpt("exist", Integer.valueOf(z ? 1 : 0));
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("detect_some_sdk").fs(jSONObject.toString());
            }
        });
    }

    private static boolean zmn(String str) {
        try {
            Class.forName(str).toString();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
