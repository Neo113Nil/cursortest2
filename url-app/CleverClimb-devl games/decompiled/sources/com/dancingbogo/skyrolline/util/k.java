package com.dancingbogo.skyrolline.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: MarketUtil.java */
/* loaded from: classes2.dex */
public class k {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https://play.google.com") || str.startsWith("http://play.google.com") || str.startsWith("market:");
    }

    public static void a(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        if (a(str) && m.a(context)) {
            e.a(str, context);
        } else {
            d.a(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public static void b(Context context, String str) {
        d.a(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
