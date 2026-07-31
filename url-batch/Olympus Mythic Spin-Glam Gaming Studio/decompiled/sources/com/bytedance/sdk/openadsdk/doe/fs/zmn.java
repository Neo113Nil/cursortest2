package com.bytedance.sdk.openadsdk.doe.fs;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zmn {
    private List<C0187zmn> fs;
    private String zmn;
    private List<C0187zmn> zn;

    public void zmn(String str) {
        this.zmn = str;
    }

    public void zmn(List<C0187zmn> list) {
        this.fs = list;
    }

    public void fs(List<C0187zmn> list) {
        this.zn = list;
    }

    public String zmn() {
        return this.zmn;
    }

    public List<C0187zmn> fs() {
        return this.fs;
    }

    public List<C0187zmn> zn() {
        return this.zn;
    }

    public static zmn fs(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            zmn zmnVar = new zmn();
            zmnVar.zmn(jsonObjectInit.optString("version"));
            JSONArray optJSONArray = jsonObjectInit.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C0187zmn zmn = C0187zmn.zmn(optJSONArray.optJSONObject(i));
                    if (zmn != null) {
                        if (zmn.zn == 1) {
                            arrayList.add(zmn);
                        } else if (zmn.zn == 2 && arrayList2.size() < 10) {
                            arrayList2.add(zmn);
                        }
                    }
                }
            }
            zmnVar.zmn(arrayList);
            zmnVar.fs(arrayList2);
            return zmnVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.doe.fs.zmn$zmn, reason: collision with other inner class name */
    public static class C0187zmn {
        private String fs;
        private String zmn;
        private int zn;

        public static C0187zmn zmn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0187zmn c0187zmn = new C0187zmn();
            c0187zmn.zmn = jSONObject.optString("url");
            c0187zmn.fs = jSONObject.optString("md5");
            c0187zmn.zn = jSONObject.optInt("type");
            return c0187zmn;
        }

        public String zmn() {
            return this.zmn;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0187zmn) {
                String str2 = this.zmn;
                if (str2 != null) {
                    C0187zmn c0187zmn = (C0187zmn) obj;
                    if (str2.equals(c0187zmn.zmn) && (str = this.fs) != null && str.equals(c0187zmn.fs)) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }
    }
}
