package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookWebFallbackDialog.java */
/* loaded from: classes.dex */
public class k extends ad {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6125a = "com.facebook.internal.k";

    /* renamed from: b, reason: collision with root package name */
    private boolean f6126b;

    public k(Context context, String str, String str2) {
        super(context, str);
        b(str2);
    }

    @Override // com.facebook.internal.ad
    protected Bundle a(String str) {
        Bundle c2 = ab.c(Uri.parse(str).getQuery());
        String string = c2.getString("bridge_args");
        c2.remove("bridge_args");
        if (!ab.a(string)) {
            try {
                c2.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", d.a(new JSONObject(string)));
            } catch (JSONException e) {
                ab.a(f6125a, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = c2.getString("method_results");
        c2.remove("method_results");
        if (!ab.a(string2)) {
            if (ab.a(string2)) {
                string2 = "{}";
            }
            try {
                c2.putBundle("com.facebook.platform.protocol.RESULT_ARGS", d.a(new JSONObject(string2)));
            } catch (JSONException e2) {
                ab.a(f6125a, "Unable to parse bridge_args JSON", e2);
            }
        }
        c2.remove("version");
        c2.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", w.a());
        return c2;
    }

    @Override // com.facebook.internal.ad, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView c2 = c();
        if (!b() || a() || c2 == null || !c2.isShown()) {
            super.cancel();
            return;
        }
        if (this.f6126b) {
            return;
        }
        this.f6126b = true;
        c2.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.k.1
            @Override // java.lang.Runnable
            public void run() {
                k.super.cancel();
            }
        }, 1500L);
    }
}
