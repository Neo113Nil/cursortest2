package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.a9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1800a9 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private ti1 f23185a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f23186b = new LinkedHashMap();

    public C1800a9(@Nullable ti1 ti1Var) {
        this.f23185a = ti1Var;
    }

    public final void a() {
        this.f23186b.clear();
    }

    public final boolean b() {
        Collection values = this.f23186b.values();
        return values.contains(dm0.f24680d) || values.contains(dm0.f24681e);
    }

    @Nullable
    public final ti1 c() {
        return this.f23185a;
    }

    @NotNull
    public final dm0 a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        dm0 dm0Var = (dm0) this.f23186b.get(videoAd);
        return dm0Var == null ? dm0.f24678b : dm0Var;
    }

    public final void a(@NotNull on0 videoAd, @NotNull dm0 instreamAdStatus) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(instreamAdStatus, "instreamAdStatus");
        this.f23186b.put(videoAd, instreamAdStatus);
    }

    public final void a(@Nullable ti1 ti1Var) {
        this.f23185a = ti1Var;
    }
}
