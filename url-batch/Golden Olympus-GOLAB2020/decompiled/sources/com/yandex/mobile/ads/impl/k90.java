package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.domain.FeedItemListUseCase", f = "FeedItemListUseCase.kt", l = {IronSourceConstants.REGISTER_TRIGGER_FAIL}, m = "loadMore")
/* loaded from: classes3.dex */
final class k90 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: b, reason: collision with root package name */
    j90 f28113b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f28114c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j90 f28115d;

    /* renamed from: e, reason: collision with root package name */
    int f28116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k90(j90 j90Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f28115d = j90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28114c = obj;
        this.f28116e |= Integer.MIN_VALUE;
        return j90.a(this.f28115d, this);
    }
}
