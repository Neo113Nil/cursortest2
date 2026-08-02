package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8870a;

    public c(String str) {
        this.f8870a = a(str);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return "http".equals(parse.getScheme()) ? parse.buildUpon().scheme("https").build().toString() : str;
    }
}
