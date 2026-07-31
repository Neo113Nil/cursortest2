package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class do0 implements hg2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final km0 f24722a;

    public do0(@NotNull km0 instreamAdViewsHolderManager) {
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        this.f24722a = instreamAdViewsHolderManager;
    }

    @Override // com.yandex.mobile.ads.impl.hg2
    @NotNull
    public final List<mb2> a() {
        List<mb2> a4;
        jm0 a5 = this.f24722a.a();
        return (a5 == null || (a4 = a5.a()) == null) ? CollectionsKt.emptyList() : a4;
    }

    @Override // com.yandex.mobile.ads.impl.hg2
    @Nullable
    public final View getView() {
        jm0 a4 = this.f24722a.a();
        if (a4 != null) {
            return a4.b();
        }
        return null;
    }
}
