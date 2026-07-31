package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ly1 implements InterfaceC1967h8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1817b2 f28801a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private InterfaceC1991i8 f28802b;

    private final class a implements InterfaceC1841c2 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void a() {
            InterfaceC1991i8 interfaceC1991i8 = ly1.this.f28802b;
            if (interfaceC1991i8 != null) {
                interfaceC1991i8.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void d() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void e() {
            InterfaceC1991i8 interfaceC1991i8 = ly1.this.f28802b;
            if (interfaceC1991i8 != null) {
                interfaceC1991i8.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1841c2
        public final void g() {
            InterfaceC1991i8 interfaceC1991i8 = ly1.this.f28802b;
            if (interfaceC1991i8 != null) {
                interfaceC1991i8.a();
            }
        }
    }

    public ly1(@NotNull Context context, @NotNull ss adBreak, @NotNull rl0 instreamAdPlayerController, @NotNull gm0 interfaceElementsManager, @NotNull km0 instreamAdViewsHolderManager, @NotNull C1937g2 adBreakStatusController, @NotNull C1817b2 adBreakPlaybackController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(interfaceElementsManager, "interfaceElementsManager");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(adBreakPlaybackController, "adBreakPlaybackController");
        this.f28801a = adBreakPlaybackController;
        adBreakPlaybackController.a(new a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void c() {
        this.f28801a.b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void f() {
        this.f28801a.c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void prepare() {
        this.f28801a.d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void resume() {
        this.f28801a.f();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void start() {
        this.f28801a.g();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void a(@Nullable tn0 tn0Var) {
        this.f28801a.a(tn0Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1967h8
    public final void a(@Nullable InterfaceC1991i8 interfaceC1991i8) {
        this.f28802b = interfaceC1991i8;
    }
}
