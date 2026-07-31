package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fz1 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ez1 f25953a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final dd2 f25954b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25955c;

    public /* synthetic */ fz1(km0 km0Var, on0 on0Var) {
        this(km0Var, on0Var, new ez1(km0Var), on0Var.h());
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a(long j4, long j5) {
        dd2 dd2Var;
        if (this.f25955c || (dd2Var = this.f25954b) == null) {
            return;
        }
        if (j5 < dd2Var.a()) {
            this.f25953a.a(this.f25954b.a(), j5);
        } else {
            this.f25953a.a();
            this.f25955c = true;
        }
    }

    public fz1(@NotNull km0 viewHolderManager, @NotNull on0 instreamVideoAd, @NotNull ez1 skipCountDownConfigurator, @Nullable dd2 dd2Var) {
        Intrinsics.checkNotNullParameter(viewHolderManager, "viewHolderManager");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(skipCountDownConfigurator, "skipCountDownConfigurator");
        this.f25953a = skipCountDownConfigurator;
        this.f25954b = dd2Var;
    }
}
