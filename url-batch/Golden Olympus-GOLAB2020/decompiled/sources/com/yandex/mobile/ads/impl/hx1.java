package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface hx1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f26979a = a.f26980a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private static volatile ix1 f26981b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f26980a = new a();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final Object f26982c = new Object();

        private a() {
        }

        @NotNull
        public static hx1 a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (f26981b == null) {
                synchronized (f26982c) {
                    try {
                        if (f26981b == null) {
                            int i4 = zr0.f35758b;
                            Intrinsics.checkNotNullParameter(context, "context");
                            f26981b = new ix1(zr0.a(context, "YadPreferenceFile"));
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ix1 ix1Var = f26981b;
            if (ix1Var != null) {
                return ix1Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Nullable
    String a();

    void a(@Nullable String str);
}
