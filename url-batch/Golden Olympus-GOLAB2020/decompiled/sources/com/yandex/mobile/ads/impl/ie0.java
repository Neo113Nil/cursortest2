package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ie0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private static volatile he0 f27159a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f27160b = new Object();

    @NotNull
    public static final he0 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f27159a == null) {
            synchronized (f27160b) {
                try {
                    if (f27159a == null) {
                        int i4 = zr0.f35758b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        f27159a = new he0(zr0.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        he0 he0Var = f27159a;
        if (he0Var != null) {
            return he0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
