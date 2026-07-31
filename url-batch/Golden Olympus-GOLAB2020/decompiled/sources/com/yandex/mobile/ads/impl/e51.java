package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.yj0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e51 implements n50, yj0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g51 f25099a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1983i0 f25100b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ e51(Context context, C2286v2 c2286v2, C2360y7 c2360y7) {
        this(context, c2286v2, c2360y7, r4, new C1983i0(context, c2286v2, c2360y7, r4));
        g51 g51Var = new g51();
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a() {
        this.f25099a.a();
    }

    public final void b() {
        ap0.a(new Object[0]);
        this.f25100b.a();
    }

    public final void c() {
        this.f25100b.e();
    }

    public final void d() {
        this.f25099a.onLeftApplication();
        this.f25100b.d();
    }

    public final void e() {
        this.f25099a.onLeftApplication();
        this.f25100b.f();
    }

    public final void f() {
        this.f25100b.b();
    }

    public final void g() {
        this.f25099a.onLeftApplication();
        this.f25100b.c();
    }

    @Override // com.yandex.mobile.ads.impl.yj0.a
    public final void a(@Nullable C1795a4 c1795a4) {
        this.f25099a.a(c1795a4);
    }

    public final void a(@Nullable dt dtVar) {
        this.f25099a.a(dtVar);
    }

    public e51(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<?> adResponse, @NotNull g51 nativeAdEventListenerController, @NotNull C1983i0 activityInteractionControllerWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdEventListenerController, "nativeAdEventListenerController");
        Intrinsics.checkNotNullParameter(activityInteractionControllerWrapper, "activityInteractionControllerWrapper");
        this.f25099a = nativeAdEventListenerController;
        this.f25100b = activityInteractionControllerWrapper;
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f25100b.a(reportParameterManager);
    }

    public final void a(@NotNull dr0 link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f25100b.a(link.c());
    }
}
