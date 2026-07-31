package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q01 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f30629a;

    public q01(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f30629a = applicationContext;
    }

    @NotNull
    public final p01 a(@Nullable SSLSocketFactory sSLSocketFactory) {
        Context context = this.f30629a;
        return new p01(context, sSLSocketFactory, new nn1(), new mc1(context), new ih0(), new qh0());
    }
}
