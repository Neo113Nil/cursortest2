package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y01 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y01 f34757a = new y01();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f34758b;

    private y01() {
    }

    public final synchronized boolean a() {
        return f34758b;
    }

    public final synchronized void b() {
        f34758b = true;
    }
}
