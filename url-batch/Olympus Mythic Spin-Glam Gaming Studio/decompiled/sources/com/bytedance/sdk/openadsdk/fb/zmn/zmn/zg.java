package com.bytedance.sdk.openadsdk.fb.zmn.zmn;

import com.bytedance.sdk.openadsdk.uqh.fs;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zg {
    private final zmn btk;
    private final zmn fb;
    private final zmn zn;
    public static final zg zmn = new zg();
    private static final fs.zmn<zg> fs = new fs.zmn<zg>() { // from class: com.bytedance.sdk.openadsdk.fb.zmn.zmn.zg.1
        @Override // com.bytedance.sdk.openadsdk.uqh.fs.zmn
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public zg fs(String str) {
            return new zg(str);
        }
    };

    public zg(String str) {
        zmn zmnVar = new zmn(1, 50);
        this.zn = zmnVar;
        zmn zmnVar2 = new zmn(1, 50);
        this.fb = zmnVar2;
        zmn zmnVar3 = new zmn(3, 50);
        this.btk = zmnVar3;
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            zmnVar.zmn(jsonObjectInit.optJSONObject("al_hi"));
            zmnVar2.zmn(jsonObjectInit.optJSONObject("al_no"));
            zmnVar3.zmn(jsonObjectInit.optJSONObject("st_no"));
        } catch (JSONException unused) {
        }
    }

    private zg() {
        this.zn = new zmn(1, 50);
        this.fb = new zmn(1, 50);
        this.btk = new zmn(3, 50);
    }

    private static zg fb() {
        return (zg) com.bytedance.sdk.openadsdk.uqh.btk.zmn("olog_config", zmn, fs);
    }

    public static com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmn() {
        return fb().zn.zmn();
    }

    public static com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn fs() {
        return fb().fb.zmn();
    }

    public static com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zn() {
        return fb().btk.zmn();
    }

    public static class zmn {
        public int fs;
        public int zmn;

        public zmn(int i, int i2) {
            this.zmn = i;
            this.fs = i2;
        }

        public void zmn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.zmn = jSONObject.optInt("m_c_c", this.zmn);
            this.fs = jSONObject.optInt("b_u_m_c", this.fs);
        }

        public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmn() {
            return com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn.zmn(this.zmn, this.fs);
        }

        public String toString() {
            return super.toString();
        }
    }
}
