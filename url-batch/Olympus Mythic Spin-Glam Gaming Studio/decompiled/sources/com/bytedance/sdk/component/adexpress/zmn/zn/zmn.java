package com.bytedance.sdk.component.adexpress.zmn.zn;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.X3;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class zmn {
    private fs btk;
    private List<C0126zmn> fb;
    private String fs;
    private String hhw;
    private Map<String, zmn> nps = new ConcurrentHashMap();
    private String zmn;
    private String zn;

    public Map<String, zmn> zmn() {
        return this.nps;
    }

    public String fs() {
        return this.zmn;
    }

    public void zmn(String str) {
        this.zmn = str;
    }

    public String zn() {
        return this.fs;
    }

    public void fs(String str) {
        this.fs = str;
    }

    public String fb() {
        return this.zn;
    }

    public void zn(String str) {
        this.zn = str;
    }

    public void zmn(fs fsVar) {
        this.btk = fsVar;
    }

    public fs btk() {
        return this.btk;
    }

    public List<C0126zmn> hhw() {
        if (this.fb == null) {
            this.fb = new ArrayList();
        }
        return this.fb;
    }

    public void zmn(List<C0126zmn> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.fb = list;
    }

    public void fb(String str) {
        this.hhw = str;
    }

    public String nps() {
        return this.hhw;
    }

    public boolean zg() {
        return (TextUtils.isEmpty(fb()) || TextUtils.isEmpty(zn()) || TextUtils.isEmpty(fs())) ? false : true;
    }

    public JSONObject bvs() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", fs());
            jSONObject.putOpt("version", zn());
            jSONObject.putOpt(X3.i.Z, fb());
            if (!TextUtils.isEmpty(this.hhw)) {
                jSONObject.put("template_fetch_url", this.hhw);
            }
            JSONArray jSONArray = new JSONArray();
            if (hhw() != null) {
                for (C0126zmn c0126zmn : hhw()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0126zmn.zmn());
                    jSONObject2.putOpt("md5", c0126zmn.fs());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0126zmn.zn()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.nps.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.nps.keySet()) {
                    zmn zmnVar = this.nps.get(str);
                    if (zmnVar != null) {
                        jSONObject3.put(str, zmnVar.bvs());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            fs btk = btk();
            if (btk != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", btk.zmn);
                jSONObject4.put("md5", btk.fs);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> fs2 = btk.fs();
                if (fs2 != null) {
                    for (Pair<String, String> pair : fs2) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String iv() {
        JSONObject bvs;
        if (!zg() || (bvs = bvs()) == null) {
            return null;
        }
        return bvs.toString();
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.zmn.zn.zmn$zmn, reason: collision with other inner class name */
    public static class C0126zmn {
        private String fs;
        private String zmn;
        private int zn;

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0126zmn) {
                String str2 = this.zmn;
                if (str2 != null) {
                    C0126zmn c0126zmn = (C0126zmn) obj;
                    if (str2.equals(c0126zmn.zmn()) && (str = this.fs) != null && str.equals(c0126zmn.fs())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public String zmn() {
            return this.zmn;
        }

        public void zmn(String str) {
            this.zmn = str;
        }

        public String fs() {
            return this.fs;
        }

        public void fs(String str) {
            this.fs = str;
        }

        public int zn() {
            return this.zn;
        }

        public void zmn(int i) {
            this.zn = i;
        }
    }

    public static class fs {
        private String fs;
        private String zmn;
        private List<Pair<String, String>> zn;

        public String zmn() {
            return this.zmn;
        }

        public void zmn(String str) {
            this.zmn = str;
        }

        public void fs(String str) {
            this.fs = str;
        }

        public void zmn(List<Pair<String, String>> list) {
            this.zn = list;
        }

        public List<Pair<String, String>> fs() {
            return this.zn;
        }
    }

    public static zmn btk(String str) {
        if (str == null) {
            return null;
        }
        try {
            return zmn(PangleNetworkBridge.jsonObjectInit(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static zmn zmn(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        zmn zmnVar = new zmn();
        zmnVar.zmn(jSONObject.optString("name"));
        zmnVar.fs(jSONObject.optString("version"));
        zmnVar.zn(jSONObject.optString(X3.i.Z));
        zmnVar.fb(jSONObject.optString("template_fetch_url", ""));
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                C0126zmn c0126zmn = new C0126zmn();
                c0126zmn.zmn(optJSONObject2.optString("url"));
                c0126zmn.fs(optJSONObject2.optString("md5"));
                c0126zmn.zmn(optJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0126zmn);
            }
        }
        zmnVar.zmn(arrayList);
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("engines");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    zmn zmn = zmn(optJSONObject3.optJSONObject(next));
                    if (zmn != null) {
                        zmnVar.zmn().put(next, zmn);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (optJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            fs fsVar = new fs();
            fsVar.zmn(optJSONObject.optString("url"));
            fsVar.fs(optJSONObject.optString("md5"));
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("map");
            if (optJSONObject4 != null) {
                Iterator<String> keys2 = optJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    arrayList2.add(new Pair<>(next2, optJSONObject4.optString(next2)));
                }
                fsVar.zmn(arrayList2);
            }
            zmnVar.zmn(fsVar);
        }
        if (zmnVar.zg()) {
            return zmnVar;
        }
        return null;
    }
}
