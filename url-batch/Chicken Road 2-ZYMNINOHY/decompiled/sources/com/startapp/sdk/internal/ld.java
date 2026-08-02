package com.startapp.sdk.internal;

import E.AbstractC0005f;
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
    public final Context f7217a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f7218b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7219c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7220d;

    /* renamed from: e, reason: collision with root package name */
    public String f7221e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7222f;

    /* renamed from: i, reason: collision with root package name */
    public final long f7225i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7226j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7227k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f7228l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7229m;
    public final Runnable n;

    /* renamed from: r, reason: collision with root package name */
    public long f7232r;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7223g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7224h = false;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7230p = false;

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f7231q = new LinkedHashMap();

    /* renamed from: s, reason: collision with root package name */
    public final cd f7233s = new cd(this);

    /* renamed from: t, reason: collision with root package name */
    public final dd f7234t = new dd(this);

    /* renamed from: u, reason: collision with root package name */
    public final ed f7235u = new ed(this);
    public final fd v = new fd(this);

    public ld(Context context, ib ibVar, ib ibVar2, Handler handler, long j4, long j5, boolean z, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f7217a = context;
        this.f7218b = ibVar;
        this.f7219c = new ib(new gd(ibVar2));
        this.f7220d = handler;
        this.f7225i = j4;
        this.f7226j = j5;
        this.f7227k = z;
        this.f7228l = bool;
        this.f7221e = str;
        this.f7229m = str2;
        this.f7222f = str3;
        this.n = runnable;
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
            boolean z4 = true;
            this.f7223g = true;
            g0.d(this.f7217a);
            a();
            Context context = this.f7217a;
            if (z) {
                str = str2;
            }
            g0.b(context, str);
            String str3 = this.f7229m;
            if (str3 != null && !str3.isEmpty()) {
                String str4 = this.f7221e;
                Locale locale = Locale.ROOT;
                if (!str4.toLowerCase(locale).contains(this.f7229m.toLowerCase(locale))) {
                    d9 d9Var = new d9(e9.f6839e);
                    d9Var.f6792d = "Wrong package reached";
                    d9Var.f6793e = "Expected: " + this.f7229m + ", Link: " + this.f7221e;
                    d9Var.f6795g = this.f7222f;
                    d9Var.a();
                    runnable = this.n;
                    if (runnable == null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            if (!MetaData.E().h().l() || !((sf) this.f7218b.a()).getBoolean("firstSucceededSmartRedirect", true)) {
                z4 = false;
            }
            Boolean bool = this.f7228l;
            float j4 = bool == null ? MetaData.E().h().j() : bool.booleanValue() ? 100.0f : 0.0f;
            if (z4 || ((Random) si.f7578d.a()).nextDouble() * 100.0d < j4) {
                d9 d9Var2 = new d9(e9.f6846l);
                d9Var2.f6794f = b();
                d9Var2.f6795g = this.f7222f;
                d9Var2.a();
                rf edit = ((sf) this.f7218b.a()).edit();
                edit.a("firstSucceededSmartRedirect", Boolean.FALSE);
                edit.f7532a.putBoolean("firstSucceededSmartRedirect", false);
                edit.apply();
            }
            runnable = this.n;
            if (runnable == null) {
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : this.f7231q.entrySet()) {
            String str = (String) entry.getKey();
            Float f4 = (Float) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                Float f5 = (Float) this.f7231q.get(str);
                if (f5 == null || f5.floatValue() < 0.0f) {
                    this.f7231q.put(str, Float.valueOf((System.currentTimeMillis() - this.f7232r) / 1000.0f));
                }
                jSONObject.put("time", String.valueOf(f4));
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
        ((Executor) this.f7219c.a()).execute(new kd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ((Executor) this.f7219c.a()).execute(new hd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i4, String str, String str2) {
        a();
        if (str2 != null && !g0.a(str2) && g0.b(str2)) {
            d9 d9Var = new d9(e9.f6839e);
            d9Var.f6792d = AbstractC0005f.j(i4, "Failed smart redirect: ");
            d9Var.f6793e = str2;
            d9Var.f6795g = this.f7222f;
            d9Var.a();
        }
        super.onReceivedError(webView, i4, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null) {
            ((Executor) this.f7219c.a()).execute(new id(this, str));
            if (si.c(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean a3 = g0.a(lowerCase);
            boolean startsWith = lowerCase.startsWith("intent://");
            if (!a3 && !startsWith) {
                return false;
            }
            ((Executor) this.f7219c.a()).execute(new jd(this, str, startsWith, webView.getUrl()));
        }
        return true;
    }

    public final void a() {
        synchronized (this.f7220d) {
            this.f7220d.removeCallbacks(this.f7235u);
        }
    }
}
