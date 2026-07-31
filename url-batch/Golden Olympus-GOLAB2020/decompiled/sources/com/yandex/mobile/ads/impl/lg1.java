package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lg1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28567a;

    public lg1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f28567a = applicationContext;
    }

    public final boolean a() {
        try {
            return this.f28567a.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean b() {
        try {
            return this.f28567a.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
