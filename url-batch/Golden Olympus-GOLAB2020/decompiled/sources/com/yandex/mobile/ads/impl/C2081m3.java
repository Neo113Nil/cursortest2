package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2081m3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1986i3 f28837a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gm0 f28838b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2173q3 f28839c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2127o3 f28840d;

    public C2081m3(@NotNull C1986i3 adGroupController, @NotNull gm0 uiElementsManager, @NotNull InterfaceC2173q3 adGroupPlaybackEventsListener, @NotNull C2127o3 adGroupPlaybackController) {
        Intrinsics.checkNotNullParameter(adGroupController, "adGroupController");
        Intrinsics.checkNotNullParameter(uiElementsManager, "uiElementsManager");
        Intrinsics.checkNotNullParameter(adGroupPlaybackEventsListener, "adGroupPlaybackEventsListener");
        Intrinsics.checkNotNullParameter(adGroupPlaybackController, "adGroupPlaybackController");
        this.f28837a = adGroupController;
        this.f28838b = uiElementsManager;
        this.f28839c = adGroupPlaybackEventsListener;
        this.f28840d = adGroupPlaybackController;
    }

    public final void a(boolean z4) {
        ln0 d4 = this.f28837a.d();
        if (d4 != null) {
            d4.a();
        }
        C2195r3 h4 = this.f28837a.h();
        if (h4 == null) {
            this.f28838b.a();
            this.f28839c.g();
            return;
        }
        this.f28838b.a(h4.c());
        int ordinal = h4.b().a().ordinal();
        if (ordinal == 0) {
            if (z4) {
                this.f28840d.b();
            }
            this.f28838b.a();
            this.f28839c.c();
            this.f28840d.e();
            return;
        }
        if (ordinal == 1) {
            if (z4) {
                this.f28840d.b();
            }
            this.f28838b.a();
            this.f28839c.c();
            return;
        }
        if (ordinal == 2) {
            this.f28839c.a();
            this.f28840d.d();
            return;
        }
        if (ordinal != 4 && ordinal != 5) {
            if (ordinal == 6) {
                this.f28839c.b();
                this.f28840d.f();
                return;
            } else if (ordinal != 8 && ordinal != 9) {
                return;
            }
        }
        a(z4);
    }
}
