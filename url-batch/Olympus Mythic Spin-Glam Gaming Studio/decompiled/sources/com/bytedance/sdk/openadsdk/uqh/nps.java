package com.bytedance.sdk.openadsdk.uqh;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class nps implements hhw {
    private hhw fs;
    Handler zmn = null;

    nps(hhw hhwVar) {
        this.fs = hhwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public ExecutorService zmn() {
        hhw hhwVar = this.fs;
        if (hhwVar == null || hhwVar.zmn() == null) {
            return Executors.newCachedThreadPool();
        }
        return this.fs.zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public Context fs() {
        hhw hhwVar = this.fs;
        if (hhwVar == null || hhwVar.fs() == null) {
            return bvs();
        }
        return this.fs.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public String zn() {
        hhw hhwVar = this.fs;
        if (hhwVar == null || TextUtils.isEmpty(hhwVar.zn())) {
            return POBCommonConstants.NULL_VALUE;
        }
        return this.fs.zn();
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public Handler fb() {
        hhw hhwVar = this.fs;
        if (hhwVar == null || hhwVar.nps() == null) {
            Handler handler = new Handler(zmn("pag_strategy", -1).getLooper());
            this.zmn = handler;
            return handler;
        }
        return this.fs.fb();
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public String btk() {
        hhw hhwVar = this.fs;
        if (hhwVar != null) {
            return hhwVar.btk();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public JSONObject hhw() {
        hhw hhwVar = this.fs;
        if (hhwVar != null) {
            return hhwVar.hhw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public Map<String, String> nps() {
        hhw hhwVar = this.fs;
        if (hhwVar == null || hhwVar.nps() == null) {
            return new HashMap();
        }
        return this.fs.nps();
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public JSONObject zmn(JSONObject jSONObject) {
        hhw hhwVar = this.fs;
        return hhwVar != null ? hhwVar.zmn(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public HandlerThread zmn(String str, int i) {
        HandlerThread zmn;
        hhw hhwVar = this.fs;
        if (hhwVar != null && (zmn = hhwVar.zmn(str, i)) != null) {
            return zmn;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.uqh.hhw
    public boolean zg() {
        hhw hhwVar = this.fs;
        if (hhwVar != null) {
            return hhwVar.zg();
        }
        return true;
    }

    private Context bvs() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object invoke = method.invoke(null, null);
            return (Application) invoke.getClass().getMethod("getApplication", null).invoke(invoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
