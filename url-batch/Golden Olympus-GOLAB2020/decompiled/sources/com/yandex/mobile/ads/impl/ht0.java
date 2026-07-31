package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ht0 implements si1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rl0 f26906a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ss f26907b;

    public ht0(@NotNull rl0 instreamAdPlayerController, @NotNull ss instreamAdBreak) {
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        this.f26906a = instreamAdPlayerController;
        this.f26907b = instreamAdBreak;
    }

    @Override // com.yandex.mobile.ads.impl.si1
    public final float getVolume() {
        on0 on0Var = (on0) CollectionsKt.firstOrNull((List) this.f26907b.g());
        if (on0Var != null) {
            return this.f26906a.c(on0Var);
        }
        return 0.0f;
    }
}
