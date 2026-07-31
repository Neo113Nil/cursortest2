package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2069lf {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f28523c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static C2069lf f28524d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28525e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rk1<ld0, hs> f28526a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final md0 f28527b;

    /* renamed from: com.yandex.mobile.ads.impl.lf$a */
    public static final class a {
        @NotNull
        public static C2069lf a() {
            if (C2069lf.f28524d == null) {
                synchronized (C2069lf.f28523c) {
                    try {
                        if (C2069lf.f28524d == null) {
                            C2069lf.f28524d = new C2069lf(new rk1(), new md0());
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C2069lf c2069lf = C2069lf.f28524d;
            if (c2069lf != null) {
                return c2069lf;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public C2069lf(@NotNull rk1<ld0, hs> preloadingCache, @NotNull md0 cacheParamsMapper) {
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(cacheParamsMapper, "cacheParamsMapper");
        this.f28526a = preloadingCache;
        this.f28527b = cacheParamsMapper;
    }

    public final synchronized boolean c() {
        return this.f28526a.b();
    }

    public final synchronized void a(@NotNull C1918f7 adRequestData, @NotNull hs item) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(item, "item");
        rk1<ld0, hs> rk1Var = this.f28526a;
        this.f28527b.getClass();
        rk1Var.a(md0.a(adRequestData), item);
    }

    @Nullable
    public final synchronized hs a(@NotNull C1918f7 adRequestData) {
        rk1<ld0, hs> rk1Var;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        rk1Var = this.f28526a;
        this.f28527b.getClass();
        return (hs) rk1Var.a(md0.a(adRequestData));
    }
}
