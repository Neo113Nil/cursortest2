package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: UrlHandler.java */
/* loaded from: classes2.dex */
public class e {
    public static void a(Context context, String str) throws Exception {
        if (str == null) {
            throw new Exception("url is null");
        }
        context.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
    }
}
