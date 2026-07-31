package com.ironsource;

import android.content.Context;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ch implements InterfaceC1434b3 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f15761b = "ch";

    /* renamed from: c, reason: collision with root package name */
    private static ch f15762c;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, wh> f15763a = Collections.synchronizedMap(new HashMap());

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bh f15764a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f15765b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15766c;

        a(bh bhVar, Context context, String str) {
            this.f15764a = bhVar;
            this.f15765b = context;
            this.f15766c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ch.this.f15763a.put(this.f15766c, new wg(this.f15764a, this.f15765b));
        }
    }

    public static synchronized ch a() {
        ch chVar;
        synchronized (ch.class) {
            try {
                if (f15762c == null) {
                    f15762c = new ch();
                }
                chVar = f15762c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return chVar;
    }

    private ug b(JSONObject jSONObject) {
        ug ugVar = new ug();
        try {
            return a(jSONObject);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return ugVar;
        }
    }

    public String c(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void d(JSONObject jSONObject, String str, String str2) {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f15761b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f15763a.containsKey(string)) {
            Logger.i(f15761b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        wh whVar = this.f15763a.get(string);
        if (whVar != null) {
            whVar.c(jSONObject, str, str2);
        }
    }

    private ug a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(b9.h.f15455O));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new ug(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception e4) {
            o9.d().a(e4);
            return new ug();
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(b9.h.f15503s0);
    }

    public void b(JSONObject jSONObject, String str, String str2) {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f15761b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f15763a.containsKey(string)) {
            Logger.i(f15761b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        wh whVar = this.f15763a.get(string);
        String string2 = jSONObject.getString(b9.h.f15509v0);
        if (whVar != null) {
            whVar.a(string2, str, str2);
        }
    }

    public void c(JSONObject jSONObject, String str, String str2) {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f15761b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f15763a.containsKey(string)) {
            Logger.i(f15761b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        wh whVar = this.f15763a.get(string);
        this.f15763a.remove(string);
        if (whVar != null) {
            whVar.a(str, str2);
        }
    }

    @Override // com.ironsource.InterfaceC1434b3
    @Nullable
    public wh a(String str) {
        if (str.isEmpty() || !this.f15763a.containsKey(str)) {
            return null;
        }
        return this.f15763a.get(str);
    }

    public void a(xg xgVar, JSONObject jSONObject, Context context, String str, String str2) {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f15761b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        ug b4 = b(jSONObject);
        if (this.f15763a.containsKey(string)) {
            Logger.i(f15761b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        bh bhVar = new bh(xgVar, context, string, b4);
        bhVar.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        bhVar.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            ig.f16710a.d(new a(bhVar, context, string));
        } else {
            this.f15763a.put(string, bhVar);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(f15761b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f15763a.containsKey(string)) {
            Logger.i(f15761b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        wh whVar = this.f15763a.get(string);
        if (whVar != null) {
            whVar.a(jSONObject, str, str2);
        }
    }
}
