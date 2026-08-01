package com.bytedance.sdk.component.adexpress.pvs.vG;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TempPkgModel.java */
/* loaded from: classes.dex */
public class pvs {
    private List<C0043pvs> Jd;
    private icD NB;
    private String icD;
    private String pvs;
    private Map<String, pvs> sUS = new ConcurrentHashMap();
    private String vG;

    public Map<String, pvs> pvs() {
        return this.sUS;
    }

    public String icD() {
        return this.pvs;
    }

    public void pvs(String str) {
        this.pvs = str;
    }

    public String vG() {
        return this.icD;
    }

    public void icD(String str) {
        this.icD = str;
    }

    public String Jd() {
        return this.vG;
    }

    public void vG(String str) {
        this.vG = str;
    }

    public void pvs(icD icd) {
        this.NB = icd;
    }

    public icD NB() {
        return this.NB;
    }

    public List<C0043pvs> sUS() {
        if (this.Jd == null) {
            this.Jd = new ArrayList();
        }
        return this.Jd;
    }

    public void pvs(List<C0043pvs> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.Jd = list;
    }

    public boolean yiw() {
        return (TextUtils.isEmpty(Jd()) || TextUtils.isEmpty(vG()) || TextUtils.isEmpty(icD())) ? false : true;
    }

    public JSONObject so() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", icD());
            jSONObject.putOpt("version", vG());
            jSONObject.putOpt("main", Jd());
            JSONArray jSONArray = new JSONArray();
            if (sUS() != null) {
                for (C0043pvs c0043pvs : sUS()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt(ImagesContract.URL, c0043pvs.pvs());
                    jSONObject2.putOpt("md5", c0043pvs.icD());
                    jSONObject2.putOpt(FirebaseAnalytics.Param.LEVEL, Integer.valueOf(c0043pvs.vG()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.sUS.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.sUS.keySet()) {
                    pvs pvsVar = this.sUS.get(str);
                    if (pvsVar != null) {
                        jSONObject3.put(str, pvsVar.so());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            icD NB = NB();
            if (NB != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(ImagesContract.URL, NB.pvs);
                jSONObject4.put("md5", NB.icD);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> icD2 = NB.icD();
                if (icD2 != null) {
                    for (Pair<String, String> pair : icD2) {
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

    public String Mxy() {
        JSONObject so;
        if (!yiw() || (so = so()) == null) {
            return null;
        }
        return so.toString();
    }

    /* compiled from: TempPkgModel.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.pvs.vG.pvs$pvs, reason: collision with other inner class name */
    public static class C0043pvs {
        private String icD;
        private String pvs;
        private int vG;

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0043pvs) {
                String str2 = this.pvs;
                if (str2 != null) {
                    C0043pvs c0043pvs = (C0043pvs) obj;
                    if (str2.equals(c0043pvs.pvs()) && (str = this.icD) != null && str.equals(c0043pvs.icD())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public String pvs() {
            return this.pvs;
        }

        public void pvs(String str) {
            this.pvs = str;
        }

        public String icD() {
            return this.icD;
        }

        public void icD(String str) {
            this.icD = str;
        }

        public int vG() {
            return this.vG;
        }

        public void pvs(int i) {
            this.vG = i;
        }
    }

    /* compiled from: TempPkgModel.java */
    public static class icD {
        private String icD;
        private String pvs;
        private List<Pair<String, String>> vG;

        public String pvs() {
            return this.pvs;
        }

        public void pvs(String str) {
            this.pvs = str;
        }

        public void icD(String str) {
            this.icD = str;
        }

        public void pvs(List<Pair<String, String>> list) {
            this.vG = list;
        }

        public List<Pair<String, String>> icD() {
            return this.vG;
        }
    }

    public static pvs Jd(String str) {
        if (str == null) {
            return null;
        }
        try {
            return pvs(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static pvs pvs(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        pvs pvsVar = new pvs();
        pvsVar.pvs(jSONObject.optString("name"));
        pvsVar.icD(jSONObject.optString("version"));
        pvsVar.vG(jSONObject.optString("main"));
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                C0043pvs c0043pvs = new C0043pvs();
                c0043pvs.pvs(optJSONObject2.optString(ImagesContract.URL));
                c0043pvs.icD(optJSONObject2.optString("md5"));
                c0043pvs.pvs(optJSONObject2.optInt(FirebaseAnalytics.Param.LEVEL));
                arrayList.add(c0043pvs);
            }
        }
        pvsVar.pvs(arrayList);
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("engines");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    pvs pvs = pvs(optJSONObject3.optJSONObject(next));
                    if (pvs != null) {
                        pvsVar.pvs().put(next, pvs);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (optJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            icD icd = new icD();
            icd.pvs(optJSONObject.optString(ImagesContract.URL));
            icd.icD(optJSONObject.optString("md5"));
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("map");
            if (optJSONObject4 != null) {
                Iterator<String> keys2 = optJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    arrayList2.add(new Pair<>(next2, optJSONObject4.optString(next2)));
                }
                icd.pvs(arrayList2);
            }
            pvsVar.pvs(icd);
        }
        if (pvsVar.yiw()) {
            return pvsVar;
        }
        return null;
    }
}
