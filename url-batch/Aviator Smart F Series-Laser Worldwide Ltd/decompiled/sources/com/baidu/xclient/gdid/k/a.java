package com.baidu.xclient.gdid.k;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class a {
    public static String a(Context context) {
        try {
            String c8 = com.baidu.mshield.b.b.a.c(context);
            return TextUtils.isEmpty(c8) ? com.baidu.mshield.b.b.a.b(context) : c8;
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }
}
