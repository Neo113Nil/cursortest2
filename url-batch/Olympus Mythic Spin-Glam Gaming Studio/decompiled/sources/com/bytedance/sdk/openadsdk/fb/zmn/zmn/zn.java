package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.uqh.fs;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zn {
    public long btk;
    public boolean fb;
    public boolean fs;
    public boolean hhw;
    private final HashMap<String, zmn> iv;
    public boolean nps;
    public boolean zmn;
    public long zn;
    private static final zn zg = new zn();
    private static final fs.zmn<zn> bvs = new fs.zmn<zn>() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.zn.1
        @Override // com.bytedance.sdk.openadsdk.uqh.fs.zmn
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zn fs(String str) {
            return new zn(str);
        }
    };

    public zn(String str) {
        this.iv = new HashMap<>();
        this.zn = 86400000L;
        this.btk = 3000L;
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            this.zmn = jsonObjectInit.optBoolean("ena_mon", this.zmn);
            this.fs = jsonObjectInit.optBoolean("ena_wal", this.fs);
            this.zn = jsonObjectInit.optLong("mon_u_i_ms", this.zn);
            this.fb = jsonObjectInit.optBoolean("ena_dy_adj", this.fb);
            this.btk = jsonObjectInit.optLong("p_u_r_d_t", this.btk);
            this.hhw = jsonObjectInit.optBoolean("s_e_u_t_p", this.hhw);
            this.nps = jsonObjectInit.optBoolean("u_e_u_t_p", this.nps);
            JSONArray optJSONArray = jsonObjectInit.optJSONArray("ins_confs");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    zmn zmnVar = new zmn(optJSONArray.getJSONObject(i));
                    this.iv.put(zmnVar.fs, zmnVar);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public zn() {
        this.iv = new HashMap<>();
        this.zn = 86400000L;
        this.btk = 3000L;
    }

    @NonNull
    public static zmn zmn() {
        zmn zmn2 = fs().zmn("ads");
        return zmn2 != null ? zmn2 : zmn.zmn;
    }

    public static zn fs() {
        zn znVar = zg;
        zn znVar2 = (zn) com.bytedance.sdk.openadsdk.uqh.btk.zmn("event_logger_config", znVar, bvs);
        return znVar2 != null ? znVar2 : znVar;
    }

    @Nullable
    private zmn zmn(String str) {
        return this.iv.get(str);
    }

    public static class zmn {
        public static final zmn zmn = new zmn();
        private final fs btk;
        private final fs fb;
        public String fs;
        private final fs zn;

        public zmn(JSONObject jSONObject) {
            fs fsVar = new fs("applog");
            this.zn = fsVar;
            fs fsVar2 = new fs("stats");
            this.fb = fsVar2;
            fs fsVar3 = new fs("track");
            this.btk = fsVar3;
            try {
                this.fs = jSONObject.getString("name");
                fsVar.zmn(jSONObject.optJSONObject("applog"));
                fsVar2.zmn(jSONObject.optJSONObject("stats"));
                fsVar3.zmn(jSONObject.optJSONObject("track"));
            } catch (JSONException unused) {
            }
        }

        public zmn() {
            this.zn = new fs("applog");
            this.fb = new fs("stats");
            this.btk = new fs("track");
        }

        @NonNull
        public fs zmn() {
            return this.zn;
        }

        @NonNull
        public fs fs() {
            return this.fb;
        }

        @NonNull
        public fs zn() {
            return this.btk;
        }

        public String toString() {
            return super.toString();
        }
    }

    public static class fs {
        public String btk;
        public long zmn = 5000;
        public int fs = 50;
        public long zn = 604800000;
        public boolean fb = false;
        public int hhw = 5;
        public int nps = 5;
        public long zg = 5000;

        public fs(String str) {
            this.btk = str;
        }

        public void zmn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.zmn = jSONObject.optLong("u_d_t", this.zmn);
            this.fs = jSONObject.optInt("u_m_c", this.fs);
            this.zn = jSONObject.optLong("e_t", this.zn);
            this.fb = jSONObject.optBoolean("ena", this.fb);
            this.hhw = jSONObject.optInt("n_e_b_u_n_d_c", this.hhw);
            this.nps = jSONObject.optInt("b_s_e_c", this.nps);
            this.zg = jSONObject.optLong("b_s_d_t", this.zg);
        }

        public String toString() {
            return super.toString();
        }
    }
}
