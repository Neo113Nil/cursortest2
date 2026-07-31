package com.yandex.mobile.ads.impl;

import java.util.HashSet;

/* loaded from: classes3.dex */
public final class k60 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f28077a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f28078b = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (k60.class) {
            str = f28078b;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (k60.class) {
            if (f28077a.add(str)) {
                f28078b += ", " + str;
            }
        }
    }
}
