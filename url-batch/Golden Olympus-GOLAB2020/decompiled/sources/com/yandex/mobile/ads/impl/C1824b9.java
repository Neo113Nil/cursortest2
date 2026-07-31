package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1824b9 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private ui1 f23630a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f23631b = new LinkedHashMap();

    public C1824b9(@Nullable ui1 ui1Var) {
        this.f23630a = ui1Var;
    }

    public final void a() {
        this.f23631b.clear();
    }

    public final boolean b() {
        Collection values = this.f23631b.values();
        return values.contains(em0.f25353d) || values.contains(em0.f25354e);
    }

    @Nullable
    public final ui1 c() {
        return this.f23630a;
    }

    @NotNull
    public final em0 a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        em0 em0Var = (em0) this.f23631b.get(videoAd);
        return em0Var == null ? em0.f25351b : em0Var;
    }

    public final void a(@NotNull on0 videoAd, @NotNull em0 instreamAdStatus) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(instreamAdStatus, "instreamAdStatus");
        this.f23631b.put(videoAd, instreamAdStatus);
    }

    public final void a(@Nullable ui1 ui1Var) {
        this.f23630a = ui1Var;
    }
}
