package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ol0 implements bm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pl0 f30079a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y22 f30080b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2105n4 f30081c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final cm0 f30082d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ub2 f30083e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final am0 f30084f;

    public ol0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull pl0 itemFinishedListener, @NotNull y22 strongReferenceKeepingManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemFinishedListener, "itemFinishedListener");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        this.f30079a = itemFinishedListener;
        this.f30080b = strongReferenceKeepingManager;
        C2105n4 c2105n4 = new C2105n4();
        this.f30081c = c2105n4;
        C2286v2 c2286v2 = new C2286v2(gs.f26284h, sdkEnvironmentModule);
        cm0 cm0Var = new cm0(context, c2286v2, c2105n4, this);
        this.f30082d = cm0Var;
        ub2 ub2Var = new ub2(context, c2286v2, c2105n4);
        this.f30083e = ub2Var;
        this.f30084f = new am0(context, sdkEnvironmentModule, ub2Var, cm0Var);
    }

    public final void a(@NotNull di2 requestConfig) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.f30080b.b(fq0.f25896b, this);
        this.f30082d.a(requestConfig);
        C2105n4 c2105n4 = this.f30081c;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28848e;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        this.f30083e.a(requestConfig, this.f30084f);
    }

    @Override // com.yandex.mobile.ads.impl.bm0
    public final void a() {
        this.f30079a.a(this);
        this.f30080b.a(fq0.f25896b, this);
    }

    public final void a(@Nullable us usVar) {
        this.f30082d.a(usVar);
    }
}
