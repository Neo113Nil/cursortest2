package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface vp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f33717a = a.f33718a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private static volatile xp f33719b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f33718a = new a();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final Object f33720c = new Object();

        private a() {
        }

        @NotNull
        public static vp a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (f33719b == null) {
                synchronized (f33720c) {
                    try {
                        if (f33719b == null) {
                            f33719b = wp.a(context);
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            xp xpVar = f33719b;
            if (xpVar != null) {
                return xpVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Nullable
    String a();

    @Nullable
    String b();

    @Nullable
    String c();
}
