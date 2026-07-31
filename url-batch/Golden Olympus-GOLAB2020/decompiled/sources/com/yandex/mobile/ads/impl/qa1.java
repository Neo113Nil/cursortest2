package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qa1 implements nc0, xa1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ra1 f30718a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Long f30719b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private InterfaceC2194r2 f30720c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private sl1 f30721d;

    public qa1(@NotNull C2360y7<?> adResponse, @NotNull ra1 nativeVideoController, @NotNull InterfaceC2194r2 adCompleteListener, @NotNull sl1 progressListener, @Nullable Long l4) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f30718a = nativeVideoController;
        this.f30719b = l4;
        this.f30720c = adCompleteListener;
        this.f30721d = progressListener;
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a(long j4, long j5) {
        sl1 sl1Var = this.f30721d;
        if (sl1Var != null) {
            sl1Var.a(j4, j5);
        }
        Long l4 = this.f30719b;
        if (l4 == null || j5 <= l4.longValue()) {
            return;
        }
        sl1 sl1Var2 = this.f30721d;
        if (sl1Var2 != null) {
            sl1Var2.a();
        }
        InterfaceC2194r2 interfaceC2194r2 = this.f30720c;
        if (interfaceC2194r2 != null) {
            interfaceC2194r2.b();
        }
        this.f30718a.b(this);
        this.f30720c = null;
        this.f30721d = null;
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void b() {
        sl1 sl1Var = this.f30721d;
        if (sl1Var != null) {
            sl1Var.a();
        }
        InterfaceC2194r2 interfaceC2194r2 = this.f30720c;
        if (interfaceC2194r2 != null) {
            interfaceC2194r2.b();
        }
        this.f30718a.b(this);
        this.f30720c = null;
        this.f30721d = null;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void invalidate() {
        this.f30718a.b(this);
        this.f30720c = null;
        this.f30721d = null;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    public final void start() {
        this.f30718a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.xa1
    public final void a() {
        InterfaceC2194r2 interfaceC2194r2 = this.f30720c;
        if (interfaceC2194r2 != null) {
            interfaceC2194r2.a();
        }
        this.f30720c = null;
    }
}
