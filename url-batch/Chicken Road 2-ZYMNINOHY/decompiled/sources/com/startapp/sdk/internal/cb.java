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

/* loaded from: classes.dex */
public class cb {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f6758c;

    /* renamed from: f, reason: collision with root package name */
    public final Context f6761f;

    /* renamed from: g, reason: collision with root package name */
    public final TrackingParams f6762g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f6756a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6757b = true;

    /* renamed from: d, reason: collision with root package name */
    public la f6759d = null;

    /* renamed from: e, reason: collision with root package name */
    public ma f6760e = null;

    public cb(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f6758c = runnable;
        this.f6761f = context;
        this.f6762g = trackingParams;
    }

    @JavascriptInterface
    public void closeAd() {
        if (this.f6756a) {
            return;
        }
        this.f6756a = true;
        this.f6758c.run();
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        ma maVar = this.f6760e;
        if (maVar != null) {
            maVar.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (!this.f6757b) {
            g0.b(this.f6761f, str);
        } else {
            WeakHashMap weakHashMap = si.f7575a;
            g0.a(this.f6761f, str);
        }
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            g0.a(this.f6761f, str, this.f6762g);
        }
        Intent b4 = si.b(this.f6761f, str2);
        if (b4 != null && str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    b4.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (b4 != null) {
            try {
                this.f6761f.startActivity(b4);
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        la laVar = this.f6759d;
        if (laVar != null) {
            laVar.f7214a.i();
            laVar.f7214a.b();
        }
    }
}
