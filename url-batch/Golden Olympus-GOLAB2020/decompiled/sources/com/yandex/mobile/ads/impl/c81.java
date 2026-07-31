package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eg1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c81 implements nc0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp f24092a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final np f24093b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24094c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final eg1 f24095d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f24096e;

    private final class a implements gg1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.gg1
        public final void a() {
            c81.a(c81.this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c81(C2360y7 c2360y7, mp mpVar, t42 t42Var) {
        this(c2360y7, mpVar, t42Var, r4, r5, eg1.a.a(false));
        np c4 = t42Var.c();
        long a4 = d81.a(c2360y7);
        int i4 = eg1.f25287a;
    }

    public static final void a(c81 c81Var) {
        c81Var.f24092a.a();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void invalidate() {
        this.f24095d.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void pause() {
        this.f24095d.pause();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void resume() {
        this.f24095d.resume();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void start() {
        long max = Math.max(0L, this.f24094c - this.f24093b.a());
        this.f24095d.a(this.f24093b);
        this.f24095d.a(max, this.f24096e);
    }

    public c81(@NotNull C2360y7<?> adResponse, @NotNull mp closeShowListener, @NotNull t42 timeProviderContainer, @NotNull np closeTimerProgressIncrementer, long j4, @NotNull eg1 pausableTimer) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f24092a = closeShowListener;
        this.f24093b = closeTimerProgressIncrementer;
        this.f24094c = j4;
        this.f24095d = pausableTimer;
        this.f24096e = new a();
    }
}
