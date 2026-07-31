package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e91 implements xe1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1920f9 f25150a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final u32 f25151b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final np1 f25152c;

    public e91(@NotNull C1920f9 adTracker, @NotNull u32 targetUrlHandler, @NotNull np1 reporter) {
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(targetUrlHandler, "targetUrlHandler");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f25150a = adTracker;
        this.f25151b = targetUrlHandler;
        this.f25152c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.xe1
    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f25150a.a(url, this.f25151b, this.f25152c);
    }
}
