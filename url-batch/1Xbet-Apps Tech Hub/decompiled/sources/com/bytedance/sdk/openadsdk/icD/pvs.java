package com.bytedance.sdk.openadsdk.icD;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.rCZ;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEvent.java */
/* loaded from: classes2.dex */
public class pvs implements com.bytedance.sdk.component.sUS.pvs.Jd.pvs.icD {
    private static final Set<String> Wyp = new HashSet(Arrays.asList("insight_log"));
    private String IP;
    private long Jd;
    private String Ju;
    private int Mxy;
    private long NB;
    private int OT;
    private String bNS;
    private String cR;
    protected final JSONObject icD;
    private JSONObject kj;
    private String mnm;
    private String ny;
    public final String pvs;
    private final AtomicBoolean qh;
    private String rCZ;
    private final String sUS;
    private int so;
    private String uc;
    private String vA;
    private boolean vG;
    private int yiw;
    private com.bytedance.sdk.openadsdk.icD.icD.pvs zM;

    public pvs(String str, JSONObject jSONObject) {
        this.sUS = "adiff";
        this.qh = new AtomicBoolean(false);
        this.kj = new JSONObject();
        this.pvs = str;
        this.icD = jSONObject;
    }

    private void sUS() {
        JSONObject jSONObject = this.kj;
        if (jSONObject == null) {
            if (!pvs(this.mnm, this.bNS, this.rCZ)) {
                return;
            }
        } else {
            String optString = jSONObject.optString("value");
            String optString2 = this.kj.optString("category");
            String optString3 = this.kj.optString("log_extra");
            if (pvs(this.mnm, this.bNS, this.rCZ)) {
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(optString2) && !icD(optString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(optString) || TextUtils.equals(optString, "0")) && (TextUtils.isEmpty(this.mnm) || TextUtils.equals(this.mnm, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.bNS) || !icD(this.bNS)) && (TextUtils.isEmpty(optString2) || !icD(optString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.rCZ) && TextUtils.isEmpty(optString3)) {
                    return;
                }
            }
        }
        this.Jd = com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs.incrementAndGet();
    }

    private boolean icD(String str) {
        str.hashCode();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean pvs(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    public JSONObject vG() {
        if (this.qh.get()) {
            return this.icD;
        }
        try {
            yiw();
        } catch (Throwable unused) {
            Object[] objArr = new Object[1];
        }
        if (this.icD.has("ad_extra_data")) {
            Object opt = this.icD.opt("ad_extra_data");
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        com.bytedance.sdk.component.utils.Ju.pvs("AdEvent", "ad_extra_data is JSONObject");
                        if (!((JSONObject) opt).has("adiff")) {
                            ((JSONObject) opt).put("adiff", this.pvs);
                        }
                        if (this.vG) {
                            if (!((JSONObject) opt).has("interaction_method")) {
                                ((JSONObject) opt).put("interaction_method", this.yiw);
                            }
                            if (!((JSONObject) opt).has("real_interaction_method")) {
                                ((JSONObject) opt).put("real_interaction_method", this.so);
                            }
                            if (!((JSONObject) opt).has("image_mode")) {
                                ((JSONObject) opt).put("image_mode", this.Mxy);
                            }
                        }
                        this.icD.put("ad_extra_data", opt.toString());
                    } else if (opt instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        if (!jSONObject.has("adiff")) {
                            jSONObject.put("adiff", this.pvs);
                        }
                        if (this.vG) {
                            if (!jSONObject.has("interaction_method")) {
                                jSONObject.put("interaction_method", this.yiw);
                            }
                            if (!jSONObject.has("real_interaction_method")) {
                                jSONObject.put("real_interaction_method", this.so);
                            }
                            if (!jSONObject.has("image_mode")) {
                                jSONObject.put("image_mode", this.Mxy);
                            }
                        }
                        this.icD.put("ad_extra_data", jSONObject.toString());
                    }
                } catch (JSONException e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("AdEvent", "json error", e.getMessage());
                }
            }
            this.qh.set(true);
            return this.icD;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("adiff", this.pvs);
            if (this.vG) {
                jSONObject2.put("interaction_method", this.yiw);
                jSONObject2.put("real_interaction_method", this.so);
                jSONObject2.put("image_mode", this.Mxy);
            }
            this.icD.put("ad_extra_data", jSONObject2.toString());
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.Ju.pvs("AdEvent", "json error", e2.getMessage());
        }
        this.qh.set(true);
        return this.icD;
        Object[] objArr2 = new Object[1];
        return this.icD;
    }

    public JSONObject pvs(boolean z) {
        JSONObject vG = vG();
        try {
            if (z) {
                JSONObject jSONObject = new JSONObject(vG.toString());
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                if (optJSONObject != null) {
                    optJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(vG.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("AdEvent", e.getMessage());
            return vG;
        }
    }

    private void yiw() throws JSONException {
        this.icD.putOpt("app_log_url", this.ny);
        this.icD.putOpt("tag", this.Ju);
        this.icD.putOpt("label", this.IP);
        this.icD.putOpt("category", this.bNS);
        if (!TextUtils.isEmpty(this.mnm)) {
            try {
                this.icD.putOpt("value", Long.valueOf(Long.parseLong(this.mnm)));
            } catch (NumberFormatException unused) {
                this.icD.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.cR)) {
            try {
                this.icD.putOpt("ext_value", Long.valueOf(Long.parseLong(this.cR)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.rCZ)) {
            this.icD.putOpt("log_extra", this.rCZ);
        }
        if (!TextUtils.isEmpty(this.uc)) {
            try {
                this.icD.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.uc)));
            } catch (NumberFormatException unused3) {
            }
        }
        pvs(this.icD, this.IP);
        try {
            this.icD.putOpt("nt", Integer.valueOf(this.OT));
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.kj.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.icD.putOpt(next, this.kj.opt(next));
        }
    }

    public String Jd() {
        return this.pvs;
    }

    pvs(C0091pvs c0091pvs) {
        this.sUS = "adiff";
        this.qh = new AtomicBoolean(false);
        this.kj = new JSONObject();
        if (TextUtils.isEmpty(c0091pvs.icD)) {
            this.pvs = rCZ.pvs();
        } else {
            this.pvs = c0091pvs.icD;
        }
        this.zM = c0091pvs.bNS;
        this.rCZ = c0091pvs.sUS;
        this.Ju = c0091pvs.vG;
        this.IP = c0091pvs.Jd;
        if (TextUtils.isEmpty(c0091pvs.NB)) {
            this.bNS = "app_union";
        } else {
            this.bNS = c0091pvs.NB;
        }
        this.uc = c0091pvs.qh;
        this.mnm = c0091pvs.so;
        this.cR = c0091pvs.Mxy;
        this.vA = c0091pvs.yiw;
        this.OT = c0091pvs.kj;
        this.ny = c0091pvs.Ju;
        this.kj = c0091pvs.Wyp = c0091pvs.Wyp != null ? c0091pvs.Wyp : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.icD = jSONObject;
        if (!TextUtils.isEmpty(c0091pvs.Ju)) {
            try {
                jSONObject.put("app_log_url", c0091pvs.Ju);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("AdEvent", e.getMessage());
            }
        }
        this.yiw = c0091pvs.vA;
        this.so = c0091pvs.cR;
        this.Mxy = c0091pvs.pvs;
        this.vG = c0091pvs.zM;
        this.NB = System.currentTimeMillis();
        sUS();
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs.icD
    public JSONObject pvs(String str) {
        return vG();
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs.icD
    public long pvs() {
        return this.NB;
    }

    @Override // com.bytedance.sdk.component.sUS.pvs.Jd.pvs.icD
    public long icD() {
        return this.Jd;
    }

    /* compiled from: AdEvent.java */
    /* renamed from: com.bytedance.sdk.openadsdk.icD.pvs$pvs, reason: collision with other inner class name */
    public static final class C0091pvs {
        private com.bytedance.sdk.openadsdk.icD.icD.icD IP;
        private String Jd;
        private String Ju;
        private String Mxy;
        private String NB;
        private JSONObject Wyp;
        private com.bytedance.sdk.openadsdk.icD.icD.pvs bNS;
        private int cR;
        private String icD;
        private final int kj;
        private final long mnm;
        public int pvs;
        private String qh;
        private String sUS;
        private String so;
        private int vA;
        private String vG;
        private String yiw;
        private boolean zM;

        public C0091pvs(long j, cR cRVar) {
            this.vA = -1;
            this.cR = -1;
            this.pvs = -1;
            if (cRVar != null) {
                this.zM = com.bytedance.sdk.openadsdk.core.model.rCZ.icD(cRVar);
                this.vA = cRVar.vA();
                this.cR = cRVar.mnm();
                this.pvs = cRVar.Ye();
            }
            this.mnm = j;
            this.kj = com.bytedance.sdk.component.utils.mnm.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs());
        }

        public C0091pvs pvs(String str) {
            this.Ju = str;
            return this;
        }

        public C0091pvs icD(String str) {
            this.vG = str;
            return this;
        }

        public C0091pvs vG(String str) {
            this.Jd = str;
            return this;
        }

        public C0091pvs Jd(String str) {
            this.NB = str;
            return this;
        }

        public C0091pvs NB(String str) {
            this.so = str;
            return this;
        }

        public C0091pvs sUS(String str) {
            this.Mxy = str;
            return this;
        }

        public C0091pvs pvs(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.Wyp = jSONObject;
            return this;
        }

        public C0091pvs yiw(String str) {
            this.yiw = str;
            return this;
        }

        public void pvs(com.bytedance.sdk.openadsdk.icD.icD.pvs pvsVar) {
            this.bNS = pvsVar;
            final pvs pvsVar2 = new pvs(this);
            try {
                com.bytedance.sdk.openadsdk.icD.icD.icD icd = this.IP;
                if (icd != null) {
                    icd.pvs(pvsVar2.icD, this.mnm);
                } else {
                    new com.bytedance.sdk.openadsdk.icD.icD.vG().pvs(pvsVar2.icD, this.mnm);
                }
            } catch (Throwable unused) {
                Object[] objArr = new Object[1];
            }
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                ae.vG(new com.bytedance.sdk.component.so.so("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.icD.pvs.pvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(pvsVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs(pvsVar2);
            }
        }
    }

    public boolean NB() {
        Set<String> IP;
        if (this.icD == null || (IP = com.bytedance.sdk.openadsdk.core.mnm.Jd().IP()) == null) {
            return false;
        }
        String optString = this.icD.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.IP)) {
                return false;
            }
            return IP.contains(this.IP);
        }
        return IP.contains(optString);
    }

    private static void pvs(JSONObject jSONObject, String str) {
        try {
            Set<String> set = Wyp;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("AdEvent", th);
        }
    }
}
