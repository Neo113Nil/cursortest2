package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ks1 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f28311c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static ks1 f28312d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28313e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rk1<ld0, st> f28314a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final md0 f28315b;

    public static final class a {
        @NotNull
        public static ks1 a() {
            if (ks1.f28312d == null) {
                synchronized (ks1.f28311c) {
                    try {
                        if (ks1.f28312d == null) {
                            ks1.f28312d = new ks1(new rk1(), new md0());
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ks1 ks1Var = ks1.f28312d;
            if (ks1Var != null) {
                return ks1Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public ks1(@NotNull rk1<ld0, st> preloadingCache, @NotNull md0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f28314a = preloadingCache;
        this.f28315b = cacheParamsMapper;
    }

    public final synchronized boolean c() {
        return this.f28314a.b();
    }

    public final synchronized void a(@NotNull C1918f7 adRequestData, @NotNull st item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        rk1<ld0, st> rk1Var = this.f28314a;
        this.f28315b.getClass();
        rk1Var.a(md0.a(adRequestData), item);
    }

    @Nullable
    public final synchronized st a(@NotNull C1918f7 adRequestData) {
        rk1<ld0, st> rk1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        rk1Var = this.f28314a;
        this.f28315b.getClass();
        return (st) rk1Var.a(md0.a(adRequestData));
    }
}
