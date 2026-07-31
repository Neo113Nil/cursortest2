package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader", f = "NativeWrapperVideoLoader.kt", l = {IronSourceConstants.RETRY_LIMIT}, m = "loadWrapperVideoAdsInfo")
/* loaded from: classes3.dex */
final class bc1 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: b, reason: collision with root package name */
    dc1 f23701b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f23702c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ dc1 f23703d;

    /* renamed from: e, reason: collision with root package name */
    int f23704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc1(dc1 dc1Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f23703d = dc1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f23702c = obj;
        this.f23704e |= Integer.MIN_VALUE;
        return dc1.a(this.f23703d, null, this);
    }
}
