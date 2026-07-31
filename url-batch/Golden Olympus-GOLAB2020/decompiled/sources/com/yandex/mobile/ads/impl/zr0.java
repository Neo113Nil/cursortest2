package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zr0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap<String, xr0> f35757a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35758b = 0;

    @NotNull
    public static final xr0 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, "YadPreferenceFile");
    }

    @NotNull
    public static final xr0 a(@NotNull Context context, @NotNull String filename) {
        xr0 putIfAbsent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filename, "filename");
        ConcurrentHashMap<String, xr0> concurrentHashMap = f35757a;
        xr0 xr0Var = concurrentHashMap.get(filename);
        if (xr0Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(filename, (xr0Var = new yr0(context, filename, new qx1())))) != null) {
            xr0Var = putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(xr0Var, "getOrPut(...)");
        return xr0Var;
    }
}
