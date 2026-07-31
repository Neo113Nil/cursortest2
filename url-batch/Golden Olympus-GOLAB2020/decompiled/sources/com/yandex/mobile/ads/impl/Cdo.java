package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.do, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private C1807ag f24721a;

    public final void a(@NotNull View view, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        C1807ag c1807ag = this.f24721a;
        if (c1807ag != null) {
            c1807ag.a(view, assetName);
        }
    }

    public final void a(@NotNull C1807ag listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f24721a = listener;
    }
}
