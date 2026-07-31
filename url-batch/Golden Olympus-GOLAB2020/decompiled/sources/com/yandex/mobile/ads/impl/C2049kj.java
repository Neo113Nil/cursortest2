package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController", f = "BaseAdLoadController.kt", l = {146}, m = "initializeSdk")
/* renamed from: com.yandex.mobile.ads.impl.kj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2049kj extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: b, reason: collision with root package name */
    AbstractC2025jj f28209b;

    /* renamed from: c, reason: collision with root package name */
    e82 f28210c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f28211d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC2025jj<Object> f28212e;

    /* renamed from: f, reason: collision with root package name */
    int f28213f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2049kj(AbstractC2025jj<Object> abstractC2025jj, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f28212e = abstractC2025jj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28211d = obj;
        this.f28213f |= Integer.MIN_VALUE;
        return AbstractC2025jj.a(this.f28212e, null, this);
    }
}
