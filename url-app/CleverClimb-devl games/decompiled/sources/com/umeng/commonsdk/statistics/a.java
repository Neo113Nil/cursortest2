package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: AnalyticsConfig.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f9123a = "native";

    /* renamed from: b, reason: collision with root package name */
    public static String f9124b = "";

    /* renamed from: c, reason: collision with root package name */
    public static int f9125c;

    /* renamed from: d, reason: collision with root package name */
    private static String f9126d;

    public static String a(Context context) {
        if (TextUtils.isEmpty(f9126d)) {
            f9126d = com.umeng.commonsdk.statistics.common.c.a(context).b();
        }
        return f9126d;
    }
}
