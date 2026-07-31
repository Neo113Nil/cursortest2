package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2116nf {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final bd0 f29556a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f29557b;

    public C2116nf(@NotNull Context context, @Nullable bd0 bd0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29556a = bd0Var;
        this.f29557b = context.getApplicationContext();
    }

    @NotNull
    public final C2093mf a(@NotNull C1926ff appOpenAdContentController) {
        Intrinsics.checkNotNullParameter(appOpenAdContentController, "appOpenAdContentController");
        Context appContext = this.f29557b;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return new C2093mf(appContext, appOpenAdContentController, new jm1(this.f29556a), new ts0(appContext), new ps0());
    }
}
