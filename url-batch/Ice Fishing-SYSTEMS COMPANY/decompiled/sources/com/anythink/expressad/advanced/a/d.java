package com.anythink.expressad.advanced.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.n;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17888a = "d";

    /* renamed from: b, reason: collision with root package name */
    private WebView f17889b;

    /* renamed from: c, reason: collision with root package name */
    private int f17890c;

    public d(WebView webView) {
        this.f17889b = webView;
    }

    public final void a() {
        this.f17889b = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f17889b, 0);
                return;
            }
            if (!com.anythink.expressad.foundation.g.a.ca) {
                a(this.f17889b, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                a(this.f17889b, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    a(this.f17889b, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    a(this.f17889b, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f17890c = networkType;
                int a9 = n.a(networkType);
                this.f17890c = a9;
                a(this.f17889b, a9);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static void a(WebView webView, int i) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f18061m, i);
                h.a();
                com.anythink.core.express.d.a.a(webView, NativeAdvancedJsUtils.f18060l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
