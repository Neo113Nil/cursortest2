package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eg1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e81 implements nc0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final eg1 f25139a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bz f25140b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private InterfaceC2194r2 f25141c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private sl1 f25142d;

    private final class a implements gg1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.gg1
        public final void a() {
            e81.b(e81.this);
        }
    }

    private final class b implements b52 {

        /* renamed from: a, reason: collision with root package name */
        private final long f25144a;

        public b(long j4) {
            this.f25144a = j4;
        }

        @Override // com.yandex.mobile.ads.impl.b52
        public final void a(long j4, long j5) {
            sl1 sl1Var = e81.this.f25142d;
            if (sl1Var != null) {
                long j6 = this.f25144a;
                sl1Var.a(j6, j6 - j4);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e81(InterfaceC2194r2 interfaceC2194r2, t42 t42Var, sl1 sl1Var) {
        this(interfaceC2194r2, t42Var, sl1Var, eg1.a.a(false), t42Var.d());
        int i4 = eg1.f25287a;
    }

    public static final void b(e81 e81Var) {
        sl1 sl1Var = e81Var.f25142d;
        if (sl1Var != null) {
            sl1Var.a();
        }
        InterfaceC2194r2 interfaceC2194r2 = e81Var.f25141c;
        if (interfaceC2194r2 != null) {
            interfaceC2194r2.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void invalidate() {
        this.f25139a.invalidate();
        this.f25139a.a(null);
        this.f25141c = null;
        this.f25142d = null;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void pause() {
        this.f25139a.pause();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void resume() {
        this.f25139a.resume();
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void start() {
        a aVar = new a();
        long a4 = this.f25140b.a();
        this.f25139a.a(new b(a4));
        this.f25139a.a(a4, aVar);
    }

    public e81(@NotNull InterfaceC2194r2 adCompleteListener, @NotNull t42 timeProviderContainer, @NotNull sl1 progressListener, @NotNull eg1 pausableTimer, @NotNull bz defaultContentDelayProvider) {
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        this.f25139a = pausableTimer;
        this.f25140b = defaultContentDelayProvider;
        this.f25141c = adCompleteListener;
        this.f25142d = progressListener;
    }
}
