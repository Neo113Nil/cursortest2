package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qb1 implements hg2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gg2 f30725a;

    public qb1(@NotNull gg2 videoViewAdapter) {
        Intrinsics.checkNotNullParameter(videoViewAdapter, "videoViewAdapter");
        this.f30725a = videoViewAdapter;
    }

    @Override // com.yandex.mobile.ads.impl.hg2
    @NotNull
    public final List<mb2> a() {
        return CollectionsKt.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.hg2
    @Nullable
    public final View getView() {
        return this.f30725a.b();
    }
}
