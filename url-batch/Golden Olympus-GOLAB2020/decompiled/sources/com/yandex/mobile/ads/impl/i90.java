package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.domain.FeedItemListUseCase$feedStateStateFlow$1", f = "FeedItemListUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i90 extends kotlin.coroutines.jvm.internal.l implements h2.n {

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ u90 f27140b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ List f27141c;

    i90(kotlin.coroutines.d dVar) {
        super(3, dVar);
    }

    @Override // h2.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i90 i90Var = new i90((kotlin.coroutines.d) obj3);
        i90Var.f27140b = (u90) obj;
        i90Var.f27141c = (List) obj2;
        return i90Var.invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC1241b.f();
        ResultKt.a(obj);
        return new ba0(this.f27140b, this.f27141c);
    }
}
