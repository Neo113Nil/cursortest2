package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.x41;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeAdCreationManager$NativeAdCreationRunnable$ResourcesLoaderListener$onLoaded$1", f = "NativeAdCreationManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class w41 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x41 f33917b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h41 f33918c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ zi0 f33919d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ x41.a f33920e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x41.a.C0206a f33921f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w41(x41 x41Var, h41 h41Var, zi0 zi0Var, x41.a aVar, x41.a.C0206a c0206a, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f33917b = x41Var;
        this.f33918c = h41Var;
        this.f33919d = zi0Var;
        this.f33920e = aVar;
        this.f33921f = c0206a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new w41(this.f33917b, this.f33918c, this.f33919d, this.f33920e, this.f33921f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w41) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        z41 z41Var;
        h51 h51Var;
        v41 v41Var;
        AbstractC1241b.f();
        ResultKt.a(obj);
        z41Var = this.f33917b.f34385e;
        Context context = this.f33917b.f34384d;
        h41 h41Var = this.f33918c;
        zi0 zi0Var = this.f33919d;
        h51Var = this.f33920e.f34389d;
        v41Var = this.f33921f.f34393a;
        z41Var.a(context, h41Var, zi0Var, h51Var, v41Var);
        return Unit.f41027a;
    }
}
