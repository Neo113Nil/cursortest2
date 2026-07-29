package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.t;

/* compiled from: InternalConfig.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f8834a = new String[2];

    public static void a(Context context, String str, String str2) {
        f8834a[0] = str;
        f8834a[1] = str2;
        if (context != null) {
            t.a(context).a(str, str2);
        }
    }

    public static String[] a(Context context) {
        String[] a2;
        if (!TextUtils.isEmpty(f8834a[0]) && !TextUtils.isEmpty(f8834a[1])) {
            return f8834a;
        }
        if (context == null || (a2 = t.a(context).a()) == null) {
            return null;
        }
        f8834a[0] = a2[0];
        f8834a[1] = a2[1];
        return f8834a;
    }

    public static void b(Context context) {
        f8834a[0] = null;
        f8834a[1] = null;
        if (context != null) {
            t.a(context).b();
        }
    }
}
