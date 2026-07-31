package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import com.bytedance.sdk.openadsdk.uqh.fs;
import com.ironsource.X3;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hhw {
    private static int zmn = -1;

    public static int zmn() {
        if (zmn == -1) {
            zmn = com.bytedance.sdk.openadsdk.uqh.btk.zmn("send_log_type", 1);
        }
        return zmn;
    }

    public static boolean fs() {
        return zmn() == 3;
    }

    public static boolean zmn(String str) {
        zmn zmnVar;
        if (str == null || (zmnVar = (zmn) com.bytedance.sdk.openadsdk.uqh.btk.zmn("stats_new_log", zmn.zmn, new fs.zmn<zmn>() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.1
            @Override // com.bytedance.sdk.openadsdk.uqh.fs.zmn
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public zmn fs(String str2) {
                return new zmn(str2);
            }
        })) == null) {
            return false;
        }
        return zmnVar.zmn(str);
    }

    private static class zmn {
        public static zmn zmn = new zmn();
        private final HashSet<String> fs;
        private int zn;

        public zmn() {
            this.fs = new HashSet<>();
            this.zn = 0;
        }

        public zmn(String str) {
            this.fs = new HashSet<>();
            this.zn = 0;
            try {
                JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                this.zn = jsonObjectInit.optInt(X3.a.t, this.zn);
                JSONArray optJSONArray = jsonObjectInit.optJSONArray("types");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.fs.add(optJSONArray.optString(i));
                    }
                }
            } catch (Exception unused) {
            }
        }

        public boolean zmn(String str) {
            boolean contains = this.fs.contains(str);
            int i = this.zn;
            if (i == 0 && contains) {
                return true;
            }
            return 1 == i && !contains;
        }
    }
}
