package com.tapjoy.internal;

import android.os.Build;
import android.webkit.WebView;
import com.tapjoy.TapjoyConstants;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class dt {

    /* renamed from: a, reason: collision with root package name */
    public ds f7954a;

    /* renamed from: b, reason: collision with root package name */
    public cr f7955b;

    /* renamed from: c, reason: collision with root package name */
    public dc f7956c;

    /* renamed from: d, reason: collision with root package name */
    public int f7957d;
    public double e;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7958a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7959b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7960c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ int[] f7961d = {f7958a, f7959b, f7960c};
    }

    public dt() {
        d();
        this.f7954a = new ds(null);
    }

    public void a() {
    }

    final void a(WebView webView) {
        this.f7954a = new ds(webView);
    }

    public final void a(String str) {
        dg.a().a(c(), str, (JSONObject) null);
    }

    public final void a(String str, JSONObject jSONObject) {
        dg.a().a(c(), str, jSONObject);
    }

    public void b() {
        this.f7954a.clear();
    }

    public final WebView c() {
        return (WebView) this.f7954a.get();
    }

    public final void d() {
        this.e = Cdo.a();
        this.f7957d = a.f7958a;
    }

    public final void a(cz czVar, cu cuVar) {
        String str = czVar.f;
        JSONObject jSONObject = new JSONObject();
        dm.a(jSONObject, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        dm.a(jSONObject, "adSessionType", cuVar.f);
        JSONObject jSONObject2 = new JSONObject();
        dm.a(jSONObject2, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        dm.a(jSONObject2, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        dm.a(jSONObject2, com.umeng.commonsdk.proguard.d.w, "Android");
        dm.a(jSONObject, "deviceInfo", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        dm.a(jSONObject, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        dm.a(jSONObject3, "partnerName", cuVar.f7898a.f7910a);
        dm.a(jSONObject3, "partnerVersion", cuVar.f7898a.f7911b);
        dm.a(jSONObject, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        dm.a(jSONObject4, "libraryVersion", "1.1.0-tapjoy");
        dm.a(jSONObject4, "appId", df.a().f7937a.getApplicationContext().getPackageName());
        dm.a(jSONObject, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject4);
        if (cuVar.e != null) {
            dm.a(jSONObject, "customReferenceData", cuVar.e);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (cy cyVar : Collections.unmodifiableList(cuVar.f7900c)) {
            dm.a(jSONObject5, cyVar.f7912a, cyVar.f7914c);
        }
        dg.a().a(c(), "startSession", str, jSONObject, jSONObject5);
    }

    public final void a(float f) {
        dg.a().a(c(), "setDeviceVolume", Float.valueOf(f));
    }
}
