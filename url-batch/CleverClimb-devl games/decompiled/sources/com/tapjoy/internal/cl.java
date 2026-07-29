package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class cl {

    /* renamed from: a, reason: collision with root package name */
    boolean f7889a;

    static int a(String str) {
        b(str);
        return Integer.parseInt(str.split("\\.", 2)[0]);
    }

    static void b(String str) {
        dp.a((Object) str, "Version cannot be null");
        if (str.matches("[0-9]+\\.[0-9]+\\.[0-9]+.*")) {
            return;
        }
        throw new IllegalArgumentException("Invalid version format : " + str);
    }
}
