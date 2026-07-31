package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zg {

    /* renamed from: a, reason: collision with root package name */
    private xg f20534a;

    /* renamed from: c, reason: collision with root package name */
    private WebView f20536c;

    /* renamed from: d, reason: collision with root package name */
    private String f20537d;

    /* renamed from: e, reason: collision with root package name */
    private String f20538e = zg.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    private String[] f20539f = {"handleGetViewVisibility"};

    /* renamed from: g, reason: collision with root package name */
    private final String[] f20540g = {vg.f20040h, vg.f20041i, vg.f20039g, "handleGetViewVisibility", vg.f20042j};

    /* renamed from: b, reason: collision with root package name */
    private tv f20535b = new tv();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20541a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20542b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f20543c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f20544d;

        a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f20541a = str;
            this.f20542b = str2;
            this.f20543c = str3;
            this.f20544d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!zg.this.b(this.f20541a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f20541a;
                    Log.e(zg.this.f20538e, str);
                    zg.this.a(this.f20542b, str);
                    return;
                }
                if (this.f20541a.equalsIgnoreCase("handleGetViewVisibility")) {
                    zg.this.e(this.f20543c);
                } else if (this.f20541a.equalsIgnoreCase(vg.f20042j) || this.f20541a.equalsIgnoreCase(vg.f20041i)) {
                    zg.this.a(this.f20544d.getString("params"), this.f20543c, this.f20542b);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f20541a;
                Log.e(zg.this.f20538e, str2);
                zg.this.a(this.f20542b, str2);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20546a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20547b;

        b(String str, String str2) {
            this.f20546a = str;
            this.f20547b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zg.this.f20536c.evaluateJavascript(this.f20546a, null);
            } catch (Throwable th) {
                o9.d().a(th);
                Log.e(zg.this.f20538e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f20547b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.f20534a == null || this.f20535b == null) {
            return;
        }
        a(vg.f20033a, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f20539f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(vg.f20043k);
    }

    public String c() {
        return this.f20537d;
    }

    public void e() {
        if (this.f20534a == null || this.f20535b == null) {
            return;
        }
        a(vg.f20034b, a());
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f20537d);
            a(str, jSONObject);
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public void g(String str) {
        this.f20537d = str;
    }

    private String a(String str) {
        return String.format(vg.f20053u, str);
    }

    private void d(String str) {
        ig.f16710a.d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public void b() {
        this.f20534a = null;
        this.f20535b = null;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !h(optString)) {
                a(jSONObject.optString(vg.f20054v, vg.f20035c), jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e4) {
            o9.d().a(e4);
            Log.e(this.f20538e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public void e(String str) {
        JSONObject a4 = this.f20535b.a();
        a4.put("adViewId", this.f20537d);
        a(str, a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.f20540g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(vg.f20051s, this.f20535b.a());
            jSONObject.put(vg.f20048p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f20535b.a());
            return jSONObject2;
        } catch (Exception e4) {
            o9.d().a(e4);
            Log.e(this.f20538e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e4.toString());
            return jSONObject2;
        }
    }

    public void a(WebView webView) {
        this.f20536c = webView;
    }

    public void a(xg xgVar) {
        this.f20534a = xgVar;
    }

    public void a(String str, int i4, boolean z4) {
        this.f20535b.a(str, i4, z4);
        if (i(str)) {
            d();
        }
    }

    public void a(String str, String str2) {
        xg xgVar = this.f20534a;
        if (xgVar != null) {
            xgVar.a(str, str2, this.f20537d);
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f20536c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f20538e, str4);
            this.f20534a.a(str3, str4, this.f20537d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e4) {
            o9.d().a(e4);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f20537d);
        a(str2, jSONObject);
    }

    public void a(String str, JSONObject jSONObject) {
        xg xgVar = this.f20534a;
        if (xgVar != null) {
            xgVar.a(str, jSONObject);
        }
    }

    void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f20534a == null) {
            mh.a(fr.f16292t, new hh().a(cc.f15753y, "mDelegate is null").a());
        } else {
            ig.f16710a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) {
        a(a(jSONObject).toString(), str, str2);
    }
}
