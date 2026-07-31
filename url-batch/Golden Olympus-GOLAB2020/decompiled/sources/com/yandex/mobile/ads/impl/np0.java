package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class np0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f29721c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static np0 f29722d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f29723e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rk1<ld0, ys> f29724a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final md0 f29725b;

    public static final class a {
        @NotNull
        public static np0 a() {
            if (np0.f29722d == null) {
                synchronized (np0.f29721c) {
                    try {
                        if (np0.f29722d == null) {
                            np0.f29722d = new np0(new rk1(), new md0());
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            np0 np0Var = np0.f29722d;
            if (np0Var != null) {
                return np0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public np0(@NotNull rk1<ld0, ys> preloadingCache, @NotNull md0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f29724a = preloadingCache;
        this.f29725b = cacheParamsMapper;
    }

    public final synchronized boolean c() {
        return this.f29724a.b();
    }

    public final synchronized void a(@NotNull C1918f7 adRequestData, @NotNull ys item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        rk1<ld0, ys> rk1Var = this.f29724a;
        this.f29725b.getClass();
        rk1Var.a(md0.a(adRequestData), item);
    }

    @Nullable
    public final synchronized ys a(@NotNull C1918f7 adRequestData) {
        rk1<ld0, ys> rk1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        rk1Var = this.f29724a;
        this.f29725b.getClass();
        return (ys) rk1Var.a(md0.a(adRequestData));
    }
}
