package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ne0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f29548a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile vd0 f29549b;

    @NotNull
    public static final vd0 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f29549b == null) {
            synchronized (f29548a) {
                try {
                    if (f29549b == null) {
                        f29549b = new vd0(context, "com.google.android.gms.location.LocationServices");
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        vd0 vd0Var = f29549b;
        if (vd0Var != null) {
            return vd0Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
