package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.y5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2358y5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2335x5 f34805a = new C2335x5("Fullscreen ad was already presented. Fullscreen can be presented just once.");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C2335x5 f34806b = new C2335x5("Fullscreen ad was already cleared. Fullscreen can't be shown.");

    @NotNull
    public static C2335x5 a() {
        return f34806b;
    }

    @NotNull
    public static C2335x5 b() {
        return f34805a;
    }
}
