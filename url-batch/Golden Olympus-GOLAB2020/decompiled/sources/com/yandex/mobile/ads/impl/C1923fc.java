package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.identifiers.ad.AdvertisingInfoHolderLoader$_advertisingInfo$1", f = "AdvertisingInfoHolderLoader.kt", l = {22}, m = "invokeSuspend")
/* renamed from: com.yandex.mobile.ads.impl.fc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1923fc extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f25740b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1947gc f25741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1923fc(C1947gc c1947gc, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f25741c = c1947gc;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new C1923fc(this.f25741c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1923fc(this.f25741c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C2042kc c2042kc;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f25740b;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            return obj;
        }
        ResultKt.a(obj);
        c2042kc = this.f25741c.f26103a;
        this.f25740b = 1;
        Object a4 = c2042kc.a(this);
        return a4 == f4 ? f4 : a4;
    }
}
