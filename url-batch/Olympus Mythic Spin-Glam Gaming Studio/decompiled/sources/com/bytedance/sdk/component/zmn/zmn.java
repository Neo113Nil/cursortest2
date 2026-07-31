package com.bytedance.sdk.component.zmn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.zmn.hhw;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public abstract class zmn {
    protected String btk;
    protected rc fs;
    hhw nps;
    protected Context zmn;
    protected nps zn;
    protected Handler fb = new Handler(Looper.getMainLooper());
    protected volatile boolean hhw = false;
    private final Map<String, hhw> zg = new HashMap();

    protected abstract void fs(bvs bvsVar);

    protected abstract Context zmn(bvs bvsVar);

    protected abstract String zmn();

    protected abstract void zmn(String str);

    protected zmn() {
    }

    protected void invokeMethod(final String str) {
        if (this.hhw) {
            return;
        }
        this.fb.post(new Runnable() { // from class: com.bytedance.sdk.component.zmn.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                rt rtVar;
                if (zmn.this.hhw) {
                    return;
                }
                try {
                    rtVar = zmn.this.zmn(PangleNetworkBridge.jsonObjectInit(str));
                } catch (Exception unused) {
                    rtVar = null;
                }
                if (rt.zmn(rtVar)) {
                    Objects.toString(rtVar);
                    if (rtVar != null) {
                        zmn.this.fs(kw.zmn(new cyb(rtVar.zmn, "Failed to parse invocation.")), rtVar);
                        return;
                    }
                    return;
                }
                zmn.this.zmn(rtVar);
            }
        });
    }

    protected void zmn(String str, rt rtVar) {
        zmn(str);
    }

    protected void fs() {
        this.nps.zmn();
        Iterator<hhw> it = this.zg.values().iterator();
        while (it.hasNext()) {
            it.next().zmn();
        }
        this.fb.removeCallbacksAndMessages(null);
        this.hhw = true;
    }

    protected final void zmn(rt rtVar) {
        String zmn;
        if (this.hhw || (zmn = zmn()) == null) {
            return;
        }
        hhw fs = fs(rtVar.nps);
        if (fs == null) {
            rtVar.toString();
            if (this.fs != null) {
                zmn();
            }
            fs(kw.zmn(new cyb(-4, "Namespace " + rtVar.nps + " unknown.")), rtVar);
            return;
        }
        btk btkVar = new btk();
        btkVar.fs = zmn;
        btkVar.zmn = this.zmn;
        btkVar.zn = fs;
        try {
            hhw.zmn zmn2 = fs.zmn(rtVar, btkVar);
            if (zmn2 == null) {
                rtVar.toString();
                if (this.fs != null) {
                    zmn();
                }
                fs(kw.zmn(new cyb(-2, "Function " + rtVar.fb + " is not registered.")), rtVar);
                return;
            }
            if (zmn2.zmn) {
                fs(zmn2.fs, rtVar);
            }
            if (this.fs != null) {
                zmn();
            }
        } catch (Exception e) {
            rtVar.toString();
            fs(kw.zmn(e), rtVar);
        }
    }

    final void zn(bvs bvsVar) {
        this.zmn = zmn(bvsVar);
        this.zn = bvsVar.fb;
        this.fs = bvsVar.zg;
        this.nps = new hhw(bvsVar, this);
        this.btk = bvsVar.iv;
        fs(bvsVar);
    }

    final void fs(String str, rt rtVar) {
        JSONObject jSONObject;
        if (this.hhw || TextUtils.isEmpty(rtVar.hhw)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            zg.zmn(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = PangleNetworkBridge.jsonObjectInit(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        zmn(mw.zmn().zmn("__msg_type", "callback").zmn("__callback_id", rtVar.hhw).zmn("__params", jSONObject).fs(), rtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rt zmn(JSONObject jSONObject) {
        String optString;
        Object opt;
        if (this.hhw) {
            return null;
        }
        String optString2 = jSONObject.optString("__callback_id");
        String optString3 = jSONObject.optString("func");
        if (zmn() == null) {
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
                    return rt.zmn().zmn(string2).fs(string).zn(optString3).fb(optString).btk(optString2).hhw(optString4).nps(jSONObject.optString("__iframe_url")).zmn();
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
            return rt.zmn().zmn(string22).fs(string).zn(optString3).fb(optString).btk(optString2).hhw(optString42).nps(jSONObject.optString("__iframe_url")).zmn();
        } catch (JSONException unused2) {
            return rt.zmn(optString2, -1);
        }
    }

    private hhw fs(String str) {
        if (TextUtils.equals(str, this.btk) || TextUtils.isEmpty(str)) {
            return this.nps;
        }
        return this.zg.get(str);
    }
}
