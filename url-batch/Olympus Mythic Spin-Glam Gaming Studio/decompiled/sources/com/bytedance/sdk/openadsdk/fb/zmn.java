package com.bytedance.sdk.openadsdk.fb;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class zmn implements com.bytedance.sdk.component.hhw.zmn.fb.zmn.fs {
    private String bjh;
    private long btk;
    private int bvs;
    private String cn;
    private String cyb;
    private String doe;
    private long fb;
    protected final JSONObject fs;
    private final String hhw;
    private String iqz;
    private int iv;
    private String kgc;
    private String kw;
    private final AtomicBoolean mw;
    private int nps;
    private String nqi;
    private String olo;
    private com.bytedance.sdk.openadsdk.fb.fs.zmn phc;
    private List<String> rp;
    private JSONObject rt;
    private int uqh;
    private int zg;
    public final String zmn;
    private boolean zn;
    private static final Set<String> rc = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> klz = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", InneractiveInternalBrowserActivity.URL_EXTRA);
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put(IronSourceConstants.EVENTS_ERROR_CODE, "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    public zmn(String str, JSONObject jSONObject) {
        this.hhw = "adiff";
        this.mw = new AtomicBoolean(false);
        this.rt = new JSONObject();
        this.zmn = str;
        this.fs = jSONObject;
    }

    private void bvs() {
        JSONObject jSONObject = this.rt;
        if (jSONObject == null) {
            if (!zmn(this.kgc, this.olo, this.nqi)) {
                return;
            }
        } else {
            String optString = jSONObject.optString("value");
            String optString2 = this.rt.optString("category");
            String optString3 = this.rt.optString("log_extra");
            if (zmn(this.kgc, this.olo, this.nqi)) {
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(optString2) && !fs(optString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(optString) || TextUtils.equals(optString, "0")) && (TextUtils.isEmpty(this.kgc) || TextUtils.equals(this.kgc, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.olo) || !fs(this.olo)) && (TextUtils.isEmpty(optString2) || !fs(optString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.nqi) && TextUtils.isEmpty(optString3)) {
                    return;
                }
            }
        }
        this.fb = com.bytedance.sdk.openadsdk.fb.zmn.fs.zn.incrementAndGet();
    }

    private boolean fs(String str) {
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

    private boolean zmn(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
        }
        return false;
    }

    private JSONObject zmn(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.zmn);
            }
            if (this.zn) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.nps);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.zg);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.bvs);
                }
            }
            fs(jSONObject);
            if (!jSONObject.has("pangle_client_unique_id")) {
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.zmn + "-" + System.currentTimeMillis());
            }
            if (com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.fs()) {
                String optString = jSONObject.optString("pag_json_data");
                if (!TextUtils.isEmpty(optString)) {
                    this.iv = PangleNetworkBridge.jsonObjectInit(optString).optInt("_l_s_t");
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            iqz.zn("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    public int zn() {
        return this.iv;
    }

    private void fs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : klz.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object opt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(klz.get(str), opt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject fb() {
        if (this.mw.get()) {
            return this.fs;
        }
        try {
            iv();
        } catch (Throwable unused) {
        }
        if (this.fs.has("ad_extra_data")) {
            Object opt = this.fs.opt("ad_extra_data");
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        this.fs.put("ad_extra_data", zmn((JSONObject) opt).toString());
                    } else if (opt instanceof String) {
                        this.fs.put("ad_extra_data", zmn(PangleNetworkBridge.jsonObjectInit((String) opt)).toString());
                    }
                } catch (JSONException e) {
                    iqz.zn("AdEvent", "json error", e.getMessage());
                }
            }
            this.mw.set(true);
            return this.fs;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adiff", this.zmn);
            if (this.zn) {
                jSONObject.put("interaction_method", this.nps);
                jSONObject.put("real_interaction_method", this.zg);
                jSONObject.put("image_mode", this.bvs);
            }
            this.fs.put("ad_extra_data", jSONObject.toString());
        } catch (JSONException e2) {
            iqz.zn("AdEvent", "json error", e2.getMessage());
        }
        this.mw.set(true);
        return this.fs;
        return this.fs;
    }

    public JSONObject btk() {
        JSONObject fb = fb();
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(fb.toString());
            JSONObject optJSONObject = jsonObjectInit.optJSONObject("params");
            if (optJSONObject != null) {
                optJSONObject.remove("app_log_url");
                optJSONObject.remove("app_log_url_back");
            }
            return jsonObjectInit;
        } catch (JSONException e) {
            iqz.zn("AdEvent", e.getMessage());
            return fb;
        }
    }

    public String hhw() {
        if (TextUtils.isEmpty(this.cyb)) {
            JSONObject jSONObject = this.fs;
            if (jSONObject != null) {
                return jSONObject.optString("label");
            }
            return "";
        }
        return this.cyb;
    }

    private void iv() throws JSONException {
        this.fs.putOpt("app_log_url", this.bjh);
        List<String> list = this.rp;
        if (list != null && !list.isEmpty()) {
            try {
                this.fs.putOpt("app_log_url_back", new JSONArray((Collection) this.rp));
            } catch (Throwable th) {
                iqz.zn("AdEvent", th.getMessage());
            }
        }
        this.fs.putOpt("tag", this.cn);
        this.fs.putOpt("label", this.cyb);
        this.fs.putOpt("category", this.olo);
        if (!TextUtils.isEmpty(this.kgc)) {
            try {
                this.fs.putOpt("value", Long.valueOf(Long.parseLong(this.kgc)));
            } catch (NumberFormatException unused) {
                this.fs.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.iqz)) {
            try {
                this.fs.putOpt("ext_value", Long.valueOf(Long.parseLong(this.iqz)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.nqi)) {
            this.fs.putOpt("log_extra", this.nqi);
        }
        if (!TextUtils.isEmpty(this.doe)) {
            try {
                this.fs.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.doe)));
            } catch (NumberFormatException unused3) {
            }
        }
        zmn(this.fs, this.cyb);
        try {
            if (!this.fs.has("nt")) {
                this.fs.putOpt("nt", Integer.valueOf(this.uqh));
            }
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.rt.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.fs.putOpt(next, this.rt.opt(next));
        }
    }

    public String nps() {
        return this.zmn;
    }

    zmn(C0192zmn c0192zmn) {
        this.hhw = "adiff";
        this.mw = new AtomicBoolean(false);
        this.rt = new JSONObject();
        if (TextUtils.isEmpty(c0192zmn.fs)) {
            this.zmn = kjb.zmn();
        } else {
            this.zmn = c0192zmn.fs;
        }
        this.phc = c0192zmn.cn;
        this.nqi = c0192zmn.hhw;
        this.cn = c0192zmn.zn;
        this.cyb = c0192zmn.fb;
        if (TextUtils.isEmpty(c0192zmn.btk)) {
            this.olo = "app_union";
        } else {
            this.olo = c0192zmn.btk;
        }
        this.doe = c0192zmn.rc;
        this.kgc = c0192zmn.zg;
        this.iqz = c0192zmn.bvs;
        this.kw = c0192zmn.nps;
        this.uqh = c0192zmn.klz;
        this.bjh = c0192zmn.mw;
        this.rt = c0192zmn.iv = c0192zmn.iv != null ? c0192zmn.iv : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.fs = jSONObject;
        if (!TextUtils.isEmpty(c0192zmn.mw)) {
            try {
                jSONObject.put("app_log_url", c0192zmn.mw);
            } catch (JSONException e) {
                iqz.zn("AdEvent", e.getMessage());
            }
        }
        this.rp = c0192zmn.phc;
        if (c0192zmn.phc != null && !c0192zmn.phc.isEmpty()) {
            try {
                this.fs.putOpt("app_log_url_back", new JSONArray((Collection) c0192zmn.phc));
            } catch (Throwable th) {
                iqz.zn("AdEvent", th.getMessage());
            }
        }
        this.nps = c0192zmn.olo;
        this.zg = c0192zmn.kgc;
        this.bvs = c0192zmn.zmn;
        this.zn = c0192zmn.kw;
        this.btk = System.currentTimeMillis();
        bvs();
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn.fs
    public JSONObject zmn(String str) {
        return fb();
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn.fs
    public long zmn() {
        return this.btk;
    }

    @Override // com.bytedance.sdk.component.hhw.zmn.fb.zmn.fs
    public long fs() {
        return this.fb;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.fb.zmn$zmn, reason: collision with other inner class name */
    public static final class C0192zmn {
        private String btk;
        private String bvs;
        private com.bytedance.sdk.openadsdk.fb.fs.zmn cn;
        private final long cyb;
        private String fb;
        private String fs;
        private String hhw;
        private String iqz;
        private JSONObject iv;
        private int kgc;
        private final int klz;
        private boolean kw;
        private String mw;
        private String nps;
        private int olo;
        private List<String> phc;
        private String rc;
        private com.bytedance.sdk.openadsdk.fb.fs.fs rt;
        private String zg;
        public int zmn;
        private String zn;

        public C0192zmn(long j, nqi nqiVar) {
            this.olo = -1;
            this.kgc = -1;
            this.zmn = -1;
            if (nqiVar != null) {
                this.kw = am.fs(nqiVar);
                this.olo = nqiVar.lt();
                this.kgc = nqiVar.cd();
                this.zmn = nqiVar.zq();
            }
            this.cyb = j;
            this.klz = com.bytedance.sdk.component.utils.kgc.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
        }

        public C0192zmn zmn(String str) {
            this.mw = str;
            return this;
        }

        public C0192zmn zmn(List<String> list) {
            this.phc = list;
            return this;
        }

        public C0192zmn fs(String str) {
            this.zn = str;
            return this;
        }

        public C0192zmn zn(String str) {
            this.fb = str;
            return this;
        }

        public C0192zmn fb(String str) {
            this.btk = str;
            return this;
        }

        public C0192zmn btk(String str) {
            this.zg = str;
            return this;
        }

        public C0192zmn hhw(String str) {
            this.bvs = str;
            return this;
        }

        public C0192zmn zmn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.iv = jSONObject;
            return this;
        }

        public C0192zmn nps(String str) {
            this.nps = str;
            return this;
        }

        public void zmn(com.bytedance.sdk.openadsdk.fb.fs.zmn zmnVar) {
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn(this.fb, this.iqz, this.nps, this.zn);
            this.cn = zmnVar;
            zmn zmnVar2 = new zmn(this);
            try {
                com.bytedance.sdk.openadsdk.fb.fs.fs fsVar = this.rt;
                if (fsVar != null) {
                    fsVar.zmn(zmnVar2.fs, this.cyb);
                } else {
                    new com.bytedance.sdk.openadsdk.fb.fs.zn().zmn(zmnVar2.fs, this.cyb);
                }
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(zmnVar2);
        }

        public C0192zmn zg(String str) {
            this.iqz = str;
            return this;
        }
    }

    public boolean zg() {
        Set<String> klz2;
        if (this.fs == null || (klz2 = com.bytedance.sdk.openadsdk.core.kgc.fb().klz()) == null) {
            return false;
        }
        String optString = this.fs.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.cyb)) {
                return false;
            }
            return klz2.contains(this.cyb);
        }
        return klz2.contains(optString);
    }

    private static void zmn(JSONObject jSONObject, String str) {
        try {
            Set<String> set = rc;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            iqz.zn("AdEvent", th);
        }
    }
}
