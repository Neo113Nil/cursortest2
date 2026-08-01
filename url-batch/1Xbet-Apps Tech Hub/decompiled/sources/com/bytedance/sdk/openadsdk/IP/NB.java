package com.bytedance.sdk.openadsdk.IP;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: StrategyDependWrapper.java */
/* loaded from: classes2.dex */
public class NB implements Jd {
    private Jd icD;
    Handler pvs = null;

    NB(Jd jd) {
        this.icD = jd;
    }

    @Override // com.bytedance.sdk.openadsdk.IP.Jd
    public ExecutorService pvs() {
        Jd jd = this.icD;
        if (jd == null || jd.pvs() == null) {
            return Executors.newCachedThreadPool();
        }
        return this.icD.pvs();
    }

    @Override // com.bytedance.sdk.openadsdk.IP.Jd
    public Context icD() {
        Jd jd = this.icD;
        if (jd == null || jd.icD() == null) {
            return so();
        }
        return this.icD.icD();
    }

    @Override // com.bytedance.sdk.openadsdk.IP.Jd
    public String vG() {
        Jd jd = this.icD;
        return (jd == null || TextUtils.isEmpty(jd.vG())) ? AbstractJsonLexerKt.NULL : this.icD.vG();
    }

    @Override // com.bytedance.sdk.openadsdk.IP.Jd
    public Handler Jd() {
        Jd jd = this.icD;
        if (jd == null || jd.yiw() == null) {
            HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.pvs = handler;
            return handler;
        }
        return this.icD.Jd();
    }

    @Override // com.bytedance.sdk.openadsdk.IP.Jd
    public String NB() {
        Jd jd = this.icD;
        if (jd != null) {
            return jd.NB();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.IP.Jd
    public JSONObject sUS() {
        Jd jd = this.icD;
        if (jd != null) {
            return jd.sUS();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.IP.Jd
    public Map<String, String> yiw() {
        Jd jd = this.icD;
        if (jd == null || jd.yiw() == null) {
            return new HashMap();
        }
        return this.icD.yiw();
    }

    @Override // com.bytedance.sdk.openadsdk.IP.Jd
    public JSONObject pvs(JSONObject jSONObject) {
        Jd jd = this.icD;
        return jd != null ? jd.pvs(jSONObject) : jSONObject;
    }

    private Context so() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
