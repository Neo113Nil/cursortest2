package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kf0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f28185a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static volatile vd0 f28186b;

    @NotNull
    public static final vd0 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f28186b == null) {
            synchronized (f28185a) {
                try {
                    if (f28186b == null) {
                        f28186b = new vd0(context, "com.huawei.hms.location.LocationServices");
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        vd0 vd0Var = f28186b;
        if (vd0Var != null) {
            return vd0Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
