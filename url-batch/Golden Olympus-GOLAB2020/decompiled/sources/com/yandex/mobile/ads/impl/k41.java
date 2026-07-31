package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader", f = "NativeAdBlockVideoWrapperLoader.kt", l = {IronSourceConstants.REGISTER_TRIGGER_FAIL}, m = "loadVideoWrapperAsset")
/* loaded from: classes3.dex */
final class k41 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: b, reason: collision with root package name */
    C2276uf f28047b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f28048c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l41 f28049d;

    /* renamed from: e, reason: collision with root package name */
    int f28050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k41(l41 l41Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f28049d = l41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28048c = obj;
        this.f28050e |= Integer.MIN_VALUE;
        return l41.a(this.f28049d, (C2276uf) null, this);
    }
}
