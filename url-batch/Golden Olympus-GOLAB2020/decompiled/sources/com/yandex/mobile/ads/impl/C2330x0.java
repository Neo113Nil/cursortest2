package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2330x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f34351a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RelativeLayout f34352b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1984i1 f34353c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1792a1 f34354d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final jh2 f34355e;

    public C2330x0(@NotNull Activity activity, @NotNull RelativeLayout rootLayout, @NotNull InterfaceC1984i1 adActivityPresentController, @NotNull C1792a1 adActivityEventController, @NotNull jh2 tagCreator) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(adActivityPresentController, "adActivityPresentController");
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(tagCreator, "tagCreator");
        this.f34351a = activity;
        this.f34352b = rootLayout;
        this.f34353c = adActivityPresentController;
        this.f34354d = adActivityEventController;
        this.f34355e = tagCreator;
    }

    public final void a(@NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f34354d.a(config);
    }

    public final void b() {
        this.f34353c.g();
        this.f34353c.c();
        RelativeLayout relativeLayout = this.f34352b;
        this.f34355e.getClass();
        relativeLayout.setTag(jh2.a("root_layout"));
        this.f34351a.setContentView(this.f34352b);
    }

    public final boolean c() {
        return this.f34353c.e();
    }

    public final void d() {
        this.f34353c.b();
        this.f34354d.a();
    }

    public final void e() {
        this.f34353c.a();
        this.f34354d.b();
    }

    public final void a() {
        this.f34353c.onAdClosed();
        this.f34353c.d();
        this.f34352b.removeAllViews();
    }
}
