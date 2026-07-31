package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mj2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final int f29130b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f29131c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kg0 f29132d;

    public mj2(int i4, @Nullable String str, @NotNull kg0 htmlWebViewRenderer) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        this.f29130b = i4;
        this.f29131c = str;
        this.f29132d = htmlWebViewRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29132d.a(this.f29130b, this.f29131c);
    }
}
