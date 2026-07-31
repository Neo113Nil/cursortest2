package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface yq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f35288a = a.f35289a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f35289a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Object f35290b = new Object();

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private static volatile yq f35291c;

        private a() {
        }

        @NotNull
        public static yq a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (f35291c == null) {
                synchronized (f35290b) {
                    try {
                        if (f35291c == null) {
                            int i4 = zr0.f35758b;
                            Intrinsics.checkNotNullParameter(context, "context");
                            f35291c = new zq(zr0.a(context, "YadPreferenceFile"), new w50(), new C2111na(), new C1821b6());
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            yq yqVar = f35291c;
            if (yqVar != null) {
                return yqVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Nullable
    du1 a();

    void a(@NotNull du1 du1Var);
}
