package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ge1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private static volatile fe1 f26116a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f26117b = new Object();

    @NotNull
    public static final fe1 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f26116a == null) {
            synchronized (f26117b) {
                try {
                    if (f26116a == null) {
                        int i4 = zr0.f35758b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        f26116a = new fe1(zr0.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        fe1 fe1Var = f26116a;
        if (fe1Var != null) {
            return fe1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
