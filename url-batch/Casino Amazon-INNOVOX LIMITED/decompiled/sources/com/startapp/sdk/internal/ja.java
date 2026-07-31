package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class ja {
    public final Runnable c;
    public final Context f;
    public final TrackingParams g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f287a = false;
    public boolean b = true;
    public Runnable d = null;
    public t9 e = null;

    public ja(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.c = runnable;
        this.f = context;
        this.g = trackingParams;
    }

    @JavascriptInterface
    public void closeAd() {
        if (this.f287a) {
            return;
        }
        this.f287a = true;
        this.c.run();
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (!this.b) {
            e0.b(this.f, str);
        } else {
            WeakHashMap weakHashMap = zh.f528a;
            e0.a(this.f, str);
        }
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            e0.a(this.f, str, this.g);
        }
        Intent b = zh.b(this.f, str2);
        if (b != null && str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    b.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (b != null) {
            try {
                this.f.startActivity(b);
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
