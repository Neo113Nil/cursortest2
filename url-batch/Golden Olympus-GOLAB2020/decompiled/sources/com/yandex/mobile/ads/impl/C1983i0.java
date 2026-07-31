package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1983i0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27029a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f27030b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2006j0 f27031c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f27032d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private C1959h0 f27033e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private m71 f27034f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1983i0(Context context, C2286v2 c2286v2, C2360y7 c2360y7, g51 g51Var) {
        this(context, c2286v2, c2360y7, g51Var, r1, new C1959h0(r1, c2286v2, c2360y7, g51Var, null));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public final void a() {
        this.f27033e.a();
    }

    public final void b() {
        this.f27033e.b();
    }

    public final void c() {
        this.f27033e.c();
    }

    public final void d() {
        this.f27033e.e();
    }

    public final void e() {
        this.f27033e.f();
    }

    public final void f() {
        this.f27033e.g();
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f27034f = reportParameterManager;
        this.f27033e.a(reportParameterManager);
    }

    public C1983i0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7 adResponse, @NotNull g51 activityInteractionEventListener, @NotNull Context applicationContext, @NotNull C1959h0 activityInteractionController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(activityInteractionEventListener, "activityInteractionEventListener");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityInteractionController, "activityInteractionController");
        this.f27029a = adConfiguration;
        this.f27030b = adResponse;
        this.f27031c = activityInteractionEventListener;
        this.f27032d = applicationContext;
        this.f27033e = activityInteractionController;
    }

    public final void a(@Nullable c80 c80Var) {
        this.f27033e = new C1959h0(this.f27032d, this.f27029a, this.f27030b, this.f27031c, c80Var);
        m71 reportParameterManager = this.f27034f;
        if (reportParameterManager != null) {
            Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
            this.f27034f = reportParameterManager;
            this.f27033e.a(reportParameterManager);
        }
    }
}
