package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader", f = "PrefetchedMediationNetworksDataLoader.kt", l = {IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN, 78}, m = "loadNetworksMediationDataInternal")
/* loaded from: classes3.dex */
final class ik1 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f27227b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ lk1 f27228c;

    /* renamed from: d, reason: collision with root package name */
    int f27229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ik1(lk1 lk1Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f27228c = lk1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f27227b = obj;
        this.f27229d |= Integer.MIN_VALUE;
        return lk1.a(0L, null, null, null, this.f27228c, null, null, this);
    }
}
