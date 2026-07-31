package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class dc {
    public static void a(Context context, WebView webView, ec ecVar) {
        if (ecVar == null) {
            ecVar = new ec(context);
        }
        zh.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.CALENDAR", Boolean.valueOf(ecVar.b.contains("calendar") && m0.a(ecVar.f227a, "android.permission.WRITE_CALENDAR")));
        zh.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.INLINEVIDEO", Boolean.valueOf(ecVar.b.contains("inlineVideo")));
        zh.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.SMS", Boolean.valueOf(ecVar.b.contains("sms") && m0.a(ecVar.f227a, "android.permission.SEND_SMS")));
        zh.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.STOREPICTURE", Boolean.valueOf(ecVar.b.contains("storePicture")));
        zh.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.TEL", Boolean.valueOf(ecVar.b.contains("tel") && m0.a(ecVar.f227a, "android.permission.CALL_PHONE")));
    }
}
