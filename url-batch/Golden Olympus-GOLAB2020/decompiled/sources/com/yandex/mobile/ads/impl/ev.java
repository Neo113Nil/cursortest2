package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ev {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f25466a;

    public ev(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25466a = xr.a(context);
    }

    public final boolean a() {
        return (this.f25466a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
