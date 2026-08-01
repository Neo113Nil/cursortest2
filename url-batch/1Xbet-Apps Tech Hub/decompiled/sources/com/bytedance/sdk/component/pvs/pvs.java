package com.bytedance.sdk.component.pvs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.pvs.yiw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AbstractBridge.java */
/* loaded from: classes.dex */
public abstract class pvs {
    protected String NB;
    protected Ju icD;
    protected Context pvs;
    protected so vG;
    yiw yiw;
    protected Handler Jd = new Handler(Looper.getMainLooper());
    protected volatile boolean sUS = false;
    private final Map<String, yiw> so = new HashMap();

    protected abstract void icD(Wyp wyp);

    protected abstract Context pvs(Wyp wyp);

    protected abstract String pvs();

    protected abstract void pvs(String str);

    protected pvs() {
    }

    protected void invokeMethod(final String str) {
        if (this.sUS) {
            return;
        }
        this.Jd.post(new Runnable() { // from class: com.bytedance.sdk.component.pvs.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                mnm mnmVar;
                if (pvs.this.sUS) {
                    return;
                }
                try {
                    mnmVar = pvs.this.pvs(new JSONObject(str));
                } catch (Exception unused) {
                    mnmVar = null;
                }
                if (mnm.pvs(mnmVar)) {
                    new StringBuilder("By pass invalid call: ").append(mnmVar);
                    if (mnmVar != null) {
                        pvs.this.icD(ZhG.pvs(new cR(mnmVar.pvs, "Failed to parse invocation.")), mnmVar);
                        return;
                    }
                    return;
                }
                pvs.this.pvs(mnmVar);
            }
        });
    }

    protected void pvs(String str, mnm mnmVar) {
        pvs(str);
    }

    protected void icD() {
        this.yiw.pvs();
        Iterator<yiw> it = this.so.values().iterator();
        while (it.hasNext()) {
            it.next().pvs();
        }
        this.Jd.removeCallbacksAndMessages(null);
        this.sUS = true;
    }

    protected final void pvs(mnm mnmVar) {
        String pvs;
        if (this.sUS || (pvs = pvs()) == null) {
            return;
        }
        yiw icD = icD(mnmVar.yiw);
        if (icD == null) {
            new StringBuilder("Received call with unknown namespace, ").append(mnmVar);
            if (this.icD != null) {
                pvs();
            }
            icD(ZhG.pvs(new cR(-4, "Namespace " + mnmVar.yiw + " unknown.")), mnmVar);
            return;
        }
        sUS sus = new sUS();
        sus.icD = pvs;
        sus.pvs = this.pvs;
        sus.vG = icD;
        try {
            yiw.pvs pvs2 = icD.pvs(mnmVar, sus);
            if (pvs2 == null) {
                new StringBuilder("Received call but not registered, ").append(mnmVar);
                if (this.icD != null) {
                    pvs();
                }
                icD(ZhG.pvs(new cR(-2, "Function " + mnmVar.Jd + " is not registered.")), mnmVar);
                return;
            }
            if (pvs2.pvs) {
                icD(pvs2.icD, mnmVar);
            }
            if (this.icD != null) {
                pvs();
            }
        } catch (Exception e) {
            new StringBuilder("call finished with error, ").append(mnmVar);
            icD(ZhG.pvs(e), mnmVar);
        }
    }

    final void pvs(Wyp wyp, rCZ rcz) {
        this.pvs = pvs(wyp);
        this.vG = wyp.Jd;
        this.icD = wyp.Mxy;
        this.yiw = new yiw(wyp, this, rcz);
        this.NB = wyp.qh;
        icD(wyp);
    }

    final void icD(String str, mnm mnmVar) {
        JSONObject jSONObject;
        if (this.sUS || TextUtils.isEmpty(mnmVar.sUS)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            Mxy.pvs(new IllegalArgumentException("Illegal callback data: ".concat(String.valueOf(str))));
        }
        String str2 = mnmVar.sUS;
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        pvs(bNS.pvs().pvs("__msg_type", "callback").pvs("__callback_id", mnmVar.sUS).pvs("__params", jSONObject).icD(), mnmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mnm pvs(JSONObject jSONObject) {
        String optString;
        Object opt;
        if (this.sUS) {
            return null;
        }
        String optString2 = jSONObject.optString("__callback_id");
        String optString3 = jSONObject.optString("func");
        if (pvs() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String str = "";
            try {
                opt = jSONObject.opt("params");
            } catch (Throwable unused) {
                optString = jSONObject.optString("params");
            }
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    optString = String.valueOf((JSONObject) opt);
                    String string2 = jSONObject.getString("JSSDK");
                    String optString4 = jSONObject.optString("namespace");
                    return mnm.pvs().pvs(string2).icD(string).vG(optString3).Jd(optString).NB(optString2).sUS(optString4).yiw(jSONObject.optString("__iframe_url")).pvs();
                }
                if (opt instanceof String) {
                    str = (String) opt;
                } else {
                    str = String.valueOf(opt);
                }
            }
            optString = str;
            String string22 = jSONObject.getString("JSSDK");
            String optString42 = jSONObject.optString("namespace");
            return mnm.pvs().pvs(string22).icD(string).vG(optString3).Jd(optString).NB(optString2).sUS(optString42).yiw(jSONObject.optString("__iframe_url")).pvs();
        } catch (JSONException unused2) {
            return mnm.pvs(optString2, -1);
        }
    }

    private yiw icD(String str) {
        if (TextUtils.equals(str, this.NB) || TextUtils.isEmpty(str)) {
            return this.yiw;
        }
        return this.so.get(str);
    }
}
