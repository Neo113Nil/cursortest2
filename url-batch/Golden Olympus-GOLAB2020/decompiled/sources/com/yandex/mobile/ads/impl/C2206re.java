package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.re, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2206re {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static volatile gi0 f31126a;

    @NotNull
    public static final gi0 a(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        if (f31126a == null) {
            obj = gi0.f26162h;
            synchronized (obj) {
                try {
                    if (f31126a == null) {
                        Context context2 = context.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
                        C1806af a4 = C2044ke.a();
                        C2229se c2229se = new C2229se();
                        C2184qe c2184qe = new C2184qe(new C2161pe(), C2044ke.a());
                        int i4 = zr0.f35758b;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        f31126a = new gi0(context2, a4, c2229se, c2184qe, new vt0(zr0.a(context2, "YadPreferenceFile")));
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        gi0 gi0Var = f31126a;
        Intrinsics.checkNotNull(gi0Var);
        return gi0Var;
    }
}
