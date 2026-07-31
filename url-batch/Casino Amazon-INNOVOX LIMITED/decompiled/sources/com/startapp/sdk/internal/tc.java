package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class tc extends tj {

    /* renamed from: a, reason: collision with root package name */
    public final Context f440a;
    public final pa b;
    public final pa c;
    public final Handler d;
    public String e;
    public final String f;
    public final long i;
    public final long j;
    public final boolean k;
    public final Boolean l;
    public final String m;
    public final Runnable n;
    public long r;
    public boolean g = false;
    public boolean h = false;
    public boolean o = false;
    public boolean p = false;
    public final LinkedHashMap q = new LinkedHashMap();
    public final kc s = new kc(this);
    public final lc t = new lc(this);
    public final mc u = new mc(this);
    public final nc v = new nc(this);

    public tc(Context context, pa paVar, pa paVar2, Handler handler, long j, long j2, boolean z, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f440a = context;
        this.b = paVar;
        this.c = new pa(new oc(paVar2));
        this.d = handler;
        this.i = j;
        this.j = j2;
        this.k = z;
        this.l = bool;
        this.e = str;
        this.m = str2;
        this.f = str3;
        this.n = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5 A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #0 {all -> 0x00e9, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:15:0x00e1, B:17:0x00e5, B:22:0x0068, B:25:0x0079, B:28:0x0089, B:30:0x008d, B:32:0x00a6, B:34:0x00ba, B:35:0x009a), top: B:2:0x0002 }] */
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
            this.g = true;
            e0.d(this.f440a);
            a();
            Context context = this.f440a;
            if (z) {
                str = str2;
            }
            e0.b(context, str);
            String str3 = this.m;
            if (str3 != null && !str3.isEmpty()) {
                String str4 = this.e;
                Locale locale = Locale.ROOT;
                if (!str4.toLowerCase(locale).contains(this.m.toLowerCase(locale))) {
                    n8 n8Var = new n8(o8.e);
                    n8Var.d = "Wrong package reached";
                    n8Var.e = "Expected: " + this.m + ", Link: " + this.e;
                    n8Var.g = this.f;
                    n8Var.a();
                    runnable = this.n;
                    if (runnable == null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            if (!MetaData.A().g().m() || !((af) this.b.a()).getBoolean("firstSucceededSmartRedirect", true)) {
                z2 = false;
            }
            Boolean bool = this.l;
            float k = bool == null ? MetaData.A().g().k() : bool.booleanValue() ? 100.0f : 0.0f;
            if (z2 || ((Random) zh.d.a()).nextDouble() * 100.0d < k) {
                n8 n8Var2 = new n8(o8.l);
                n8Var2.f = b();
                n8Var2.g = this.f;
                n8Var2.a();
                ((af) this.b.a()).edit().putBoolean("firstSucceededSmartRedirect", false).apply();
            }
            runnable = this.n;
            if (runnable == null) {
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : this.q.entrySet()) {
            String str = (String) entry.getKey();
            Float f = (Float) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                Float f2 = (Float) this.q.get(str);
                if (f2 == null || f2.floatValue() < 0.0f) {
                    this.q.put(str, Float.valueOf((System.currentTimeMillis() - this.r) / 1000.0f));
                }
                jSONObject.put(InfluenceConstants.TIME, String.valueOf(f));
                jSONObject.put(ImagesContract.URL, str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ((Executor) this.c.a()).execute(new sc(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ((Executor) this.c.a()).execute(new pc(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        a();
        if (str2 != null && !e0.a(str2) && e0.b(str2)) {
            n8 n8Var = new n8(o8.e);
            n8Var.d = "Failed smart redirect: " + i;
            n8Var.e = str2;
            n8Var.g = this.f;
            n8Var.a();
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null) {
            ((Executor) this.c.a()).execute(new qc(this, str));
            if (zh.c(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean a2 = e0.a(lowerCase);
            boolean startsWith = lowerCase.startsWith("intent://");
            if (!a2 && !startsWith) {
                return false;
            }
            ((Executor) this.c.a()).execute(new rc(this, str, startsWith, webView.getUrl()));
        }
        return true;
    }

    public final void a() {
        synchronized (this.d) {
            this.d.removeCallbacks(this.u);
        }
    }
}
