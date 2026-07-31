package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.e8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1895e8 implements InterfaceC1991i8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1967h8 f25133a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2038k8 f25134b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final cb2 f25135c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private InterfaceC1991i8 f25136d;

    public C1895e8(@NotNull InterfaceC1967h8 adSectionPlaybackController, @NotNull C2038k8 adSectionStatusController, @NotNull cb2 adCreativePlaybackProxyListener) {
        Intrinsics.checkNotNullParameter(adSectionPlaybackController, "adSectionPlaybackController");
        Intrinsics.checkNotNullParameter(adSectionStatusController, "adSectionStatusController");
        Intrinsics.checkNotNullParameter(adCreativePlaybackProxyListener, "adCreativePlaybackProxyListener");
        this.f25133a = adSectionPlaybackController;
        this.f25134b = adSectionStatusController;
        this.f25135c = adCreativePlaybackProxyListener;
        adSectionPlaybackController.a(this);
        adSectionPlaybackController.a(adCreativePlaybackProxyListener);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
    public final void a() {
        this.f25134b.a(EnumC2014j8.f27562f);
        InterfaceC1991i8 interfaceC1991i8 = this.f25136d;
        if (interfaceC1991i8 != null) {
            interfaceC1991i8.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
    public final void b() {
        this.f25134b.a(EnumC2014j8.f27559c);
        InterfaceC1991i8 interfaceC1991i8 = this.f25136d;
        if (interfaceC1991i8 != null) {
            interfaceC1991i8.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1991i8
    public final void c() {
        this.f25134b.a(EnumC2014j8.f27561e);
        InterfaceC1991i8 interfaceC1991i8 = this.f25136d;
        if (interfaceC1991i8 != null) {
            interfaceC1991i8.c();
        }
    }

    public final void d() {
        int ordinal = this.f25134b.a().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.f25133a.c();
        }
    }

    public final void e() {
        int ordinal = this.f25134b.a().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.f25133a.f();
        }
    }

    public final void f() {
        InterfaceC1991i8 interfaceC1991i8;
        int ordinal = this.f25134b.a().ordinal();
        if (ordinal == 0) {
            this.f25133a.prepare();
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 4 && (interfaceC1991i8 = this.f25136d) != null) {
                interfaceC1991i8.a();
                return;
            }
            return;
        }
        InterfaceC1991i8 interfaceC1991i82 = this.f25136d;
        if (interfaceC1991i82 != null) {
            interfaceC1991i82.b();
        }
    }

    public final void g() {
        InterfaceC1991i8 interfaceC1991i8;
        int ordinal = this.f25134b.a().ordinal();
        if (ordinal == 0) {
            this.f25133a.prepare();
            return;
        }
        if (ordinal == 2) {
            this.f25133a.resume();
            return;
        }
        if (ordinal != 3) {
            if (ordinal == 4 && (interfaceC1991i8 = this.f25136d) != null) {
                interfaceC1991i8.a();
                return;
            }
            return;
        }
        InterfaceC1991i8 interfaceC1991i82 = this.f25136d;
        if (interfaceC1991i82 != null) {
            interfaceC1991i82.c();
        }
    }

    public final void h() {
        InterfaceC1991i8 interfaceC1991i8;
        int ordinal = this.f25134b.a().ordinal();
        if (ordinal == 0) {
            this.f25133a.prepare();
            return;
        }
        if (ordinal == 1) {
            this.f25134b.a(EnumC2014j8.f27560d);
            this.f25133a.start();
            return;
        }
        if (ordinal == 2) {
            this.f25133a.resume();
            return;
        }
        if (ordinal != 3) {
            if (ordinal == 4 && (interfaceC1991i8 = this.f25136d) != null) {
                interfaceC1991i8.a();
                return;
            }
            return;
        }
        InterfaceC1991i8 interfaceC1991i82 = this.f25136d;
        if (interfaceC1991i82 != null) {
            interfaceC1991i82.c();
        }
    }

    public final void a(@Nullable tn0 tn0Var) {
        this.f25135c.a(tn0Var);
    }

    public final void a(@Nullable InterfaceC1991i8 interfaceC1991i8) {
        this.f25136d = interfaceC1991i8;
    }
}
