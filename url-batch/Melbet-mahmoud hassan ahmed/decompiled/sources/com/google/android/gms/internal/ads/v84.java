package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class v84 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f13162a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static final String f13163b = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (v84.class) {
            str = f13163b;
        }
        return str;
    }
}
