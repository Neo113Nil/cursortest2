package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hx1;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class s80 extends AbstractC2025jj<String> {

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    private final aa0 f31621v;

    public /* synthetic */ s80(Context context, C2286v2 c2286v2, C2105n4 c2105n4, aa0 aa0Var, vu1 vu1Var) {
        this(context, c2286v2, c2105n4, aa0Var, vu1Var, fu.a((j50) vu1Var.c()));
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    @NotNull
    protected final AbstractC1978hj<String> a(@NotNull String url, @NotNull String query) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        Context k4 = k();
        C2286v2 e4 = e();
        aa0 aa0Var = this.f31621v;
        hx1.f26979a.getClass();
        return new p80(k4, e4, url, query, this, this, aa0Var, hx1.a.a(k4), new wf0(), new C2108n7());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected s80(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @Nullable aa0 aa0Var, @NotNull vu1 sdkEnvironmentModule, @NotNull InterfaceC3316J coroutineScope) {
        super(context, adLoadingPhasesManager, adConfiguration, coroutineScope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f31621v = aa0Var;
    }
}
