package com.startapp.sdk.internal;

import E1.AbstractC0033i;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ld extends qk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4089a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4090b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4091c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4092d;

    /* renamed from: e, reason: collision with root package name */
    public String f4093e;
    public final String f;

    /* renamed from: i, reason: collision with root package name */
    public final long f4096i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4097j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4098k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f4099l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4100m;

    /* renamed from: n, reason: collision with root package name */
    public final Runnable f4101n;

    /* renamed from: r, reason: collision with root package name */
    public long f4104r;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4094g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4095h = false;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4102p = false;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f4103q = new LinkedHashMap();

    /* renamed from: s, reason: collision with root package name */
    public final cd f4105s = new cd(this);

    /* renamed from: t, reason: collision with root package name */
    public final dd f4106t = new dd(this);

    /* renamed from: u, reason: collision with root package name */
    public final ed f4107u = new ed(this);
    public final fd v = new fd(this);

    public ld(Context context, ib ibVar, ib ibVar2, Handler handler, long j3, long j4, boolean z, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f4089a = context;
        this.f4090b = ibVar;
        this.f4091c = new ib(new gd(ibVar2));
        this.f4092d = handler;
        this.f4096i = j3;
        this.f4097j = j4;
        this.f4098k = z;
        this.f4099l = bool;
        this.f4093e = str;
        this.f4100m = str2;
        this.f = str3;
        this.f4101n = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:15:0x00e7, B:17:0x00eb, B:22:0x0068, B:25:0x0079, B:28:0x0089, B:30:0x008d, B:32:0x00a6, B:34:0x00ba, B:35:0x009a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, String str2, boolean z) {
        Runnable runnable;
        try {
            if (this.o) {
                return;
            }
            boolean z2 = true;
            this.f4094g = true;
            g0.d(this.f4089a);
            a();
            Context context = this.f4089a;
            if (z) {
                str = str2;
            }
            g0.b(context, str);
            String str3 = this.f4100m;
            if (str3 != null && !str3.isEmpty()) {
                String str4 = this.f4093e;
                Locale locale = Locale.ROOT;
                if (!str4.toLowerCase(locale).contains(this.f4100m.toLowerCase(locale))) {
                    d9 d9Var = new d9(e9.f3725e);
                    d9Var.f3680d = "Wrong package reached";
                    d9Var.f3681e = "Expected: " + this.f4100m + ", Link: " + this.f4093e;
                    d9Var.f3682g = this.f;
                    d9Var.a();
                    runnable = this.f4101n;
                    if (runnable == null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            if (!MetaData.E().h().l() || !((sf) this.f4090b.a()).getBoolean("firstSucceededSmartRedirect", true)) {
                z2 = false;
            }
            Boolean bool = this.f4099l;
            float j3 = bool == null ? MetaData.E().h().j() : bool.booleanValue() ? 100.0f : 0.0f;
            if (z2 || ((Random) si.f4441d.a()).nextDouble() * 100.0d < j3) {
                d9 d9Var2 = new d9(e9.f3731l);
                d9Var2.f = b();
                d9Var2.f3682g = this.f;
                d9Var2.a();
                rf edit = ((sf) this.f4090b.a()).edit();
                edit.a("firstSucceededSmartRedirect", Boolean.FALSE);
                edit.f4395a.putBoolean("firstSucceededSmartRedirect", false);
                edit.apply();
            }
            runnable = this.f4101n;
            if (runnable == null) {
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : this.f4103q.entrySet()) {
            String str = (String) entry.getKey();
            Float f = (Float) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                Float f3 = (Float) this.f4103q.get(str);
                if (f3 == null || f3.floatValue() < 0.0f) {
                    this.f4103q.put(str, Float.valueOf((System.currentTimeMillis() - this.f4104r) / 1000.0f));
                }
                jSONObject.put("time", String.valueOf(f));
                jSONObject.put("url", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ((Executor) this.f4091c.a()).execute(new kd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ((Executor) this.f4091c.a()).execute(new hd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i3, String str, String str2) {
        a();
        if (str2 != null && !g0.a(str2) && g0.b(str2)) {
            d9 d9Var = new d9(e9.f3725e);
            d9Var.f3680d = AbstractC0033i.h(i3, "Failed smart redirect: ");
            d9Var.f3681e = str2;
            d9Var.f3682g = this.f;
            d9Var.a();
        }
        super.onReceivedError(webView, i3, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null) {
            ((Executor) this.f4091c.a()).execute(new id(this, str));
            if (si.c(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean a3 = g0.a(lowerCase);
            boolean startsWith = lowerCase.startsWith("intent://");
            if (!a3 && !startsWith) {
                return false;
            }
            ((Executor) this.f4091c.a()).execute(new jd(this, str, startsWith, webView.getUrl()));
        }
        return true;
    }

    public final void a() {
        synchronized (this.f4092d) {
            this.f4092d.removeCallbacks(this.f4107u);
        }
    }
}
