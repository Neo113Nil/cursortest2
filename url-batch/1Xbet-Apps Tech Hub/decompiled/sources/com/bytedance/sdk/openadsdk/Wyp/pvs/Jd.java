package com.bytedance.sdk.openadsdk.Wyp.pvs;

import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.mnm;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.Wyp.pvs.Jd;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.jlb;
import io.ktor.http.LinkHeader;
import org.json.JSONObject;

/* compiled from: LogStatsBase.java */
/* loaded from: classes2.dex */
public class Jd<T extends Jd> implements vG {
    private String Mxy;
    private String Wyp;
    private String icD;
    private String kj;
    private String pvs;
    private String qh;
    private String vG;
    private String yiw;
    private final String Jd = BuildConfig.VERSION_NAME;
    private long NB = System.currentTimeMillis() / 1000;
    private int sUS = 0;
    private int so = 0;

    private T mnm() {
        return this;
    }

    public static Jd<Jd> icD() {
        return new Jd<>();
    }

    @Override // com.bytedance.sdk.openadsdk.Wyp.pvs.vG
    @JProtect
    public JSONObject pvs() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", yiw());
            jSONObject2.put("app_version", jlb.yiw());
            jSONObject2.put("timestamp", so());
            jSONObject2.put("conn_type", mnm.icD(com.bytedance.sdk.openadsdk.core.mnm.pvs()));
            jSONObject2.put("appid", TextUtils.isEmpty(so.icD().Jd()) ? "" : so.icD().Jd());
            jSONObject2.put("device_info", bNS());
            if (!TextUtils.isEmpty(vG())) {
                jSONObject2.put(LinkHeader.Parameters.Type, vG());
            }
            jSONObject2.put("error_code", qh());
            if (!TextUtils.isEmpty(kj())) {
                jSONObject2.put("error_msg", kj());
            }
            if (!TextUtils.isEmpty(NB())) {
                jSONObject2.put("rit", NB());
            }
            if (!TextUtils.isEmpty(sUS())) {
                jSONObject2.put("creative_id", sUS());
            }
            if (Mxy() > 0) {
                jSONObject2.put("adtype", Mxy());
            }
            if (!TextUtils.isEmpty(Wyp())) {
                jSONObject2.put("req_id", Wyp());
            }
            if (!TextUtils.isEmpty(Ju())) {
                jSONObject2.put("extra", Ju());
            }
            String Jd = Jd();
            if (TextUtils.isEmpty(Jd)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(Jd);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(Jd)) {
                jSONObject2.put("event_extra", Jd);
            }
            if (!TextUtils.isEmpty(IP())) {
                jSONObject2.put(TypedValues.TransitionType.S_DURATION, IP());
            }
        } catch (Throwable th) {
            Ju.pvs("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    @JProtect
    private JSONObject bNS() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", jlb.NB());
            jSONObject.put("ua", jlb.vG());
            jSONObject.put("gaid", com.com.bytedance.overseas.sdk.icD.pvs.pvs().icD());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String vG() {
        return this.pvs;
    }

    public T pvs(String str) {
        this.pvs = str;
        return mnm();
    }

    public String Jd() {
        return this.qh;
    }

    public T icD(String str) {
        this.qh = str;
        return mnm();
    }

    public String NB() {
        return this.icD;
    }

    public T vG(String str) {
        this.icD = str;
        return mnm();
    }

    public String sUS() {
        return this.vG;
    }

    public T Jd(String str) {
        this.vG = str;
        return mnm();
    }

    public String yiw() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public long so() {
        return this.NB;
    }

    public int Mxy() {
        return this.sUS;
    }

    public T pvs(int i) {
        this.sUS = i;
        return mnm();
    }

    public String Wyp() {
        return this.yiw;
    }

    public T NB(String str) {
        this.yiw = str;
        return mnm();
    }

    public int qh() {
        return this.so;
    }

    public T icD(int i) {
        this.so = i;
        return mnm();
    }

    public String kj() {
        return this.Mxy;
    }

    public T sUS(String str) {
        this.Mxy = str;
        return mnm();
    }

    public String Ju() {
        return this.Wyp;
    }

    public T yiw(String str) {
        this.Wyp = str;
        return mnm();
    }

    public String IP() {
        return this.kj;
    }

    public T so(String str) {
        this.kj = str;
        return mnm();
    }
}
