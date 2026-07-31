package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.v01;
import com.yandex.mobile.ads.impl.yy0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.initializer.AppStartupInitializer$initialize$1", f = "AppStartupInitializer.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.yandex.mobile.ads.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2162pf extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f30430b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ vu1 f30431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2162pf(Context context, vu1 vu1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30430b = context;
        this.f30431c = vu1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new C2162pf(this.f30430b, this.f30431c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C2162pf(this.f30430b, this.f30431c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC1241b.f();
        ResultKt.a(obj);
        int i4 = v72.f33543c;
        v72.a(this.f30430b, this.f30431c.c());
        C2274ud.a(this.f30430b, this.f30431c.c());
        us0 us0Var = new us0();
        Boolean c4 = us0.c(this.f30430b);
        if (c4 != null) {
            d11.b(c4.booleanValue());
        }
        Boolean f4 = us0.f(this.f30430b);
        if (f4 != null) {
            d11.a(f4.booleanValue());
        }
        if (C2385z9.a(this.f30430b)) {
            new v01();
            v01.a a4 = v01.a(this.f30430b);
            if (a4 instanceof v01.a.b) {
                po0.a(new qo0().a((v01.a.b) a4), new Object[0]);
            } else if (a4 instanceof v01.a.C0204a) {
                po0.b("Yandex Mobile Ads 7.15.0 integrated successfully", new Object[0]);
            }
            dz0 dz0Var = new dz0();
            int i5 = yy0.f35386e;
            oz0.a(new pz0(dz0Var).a(new mz0().a(yy0.a.a())));
        }
        fw1 fw1Var = new fw1(us0Var, this.f30431c);
        C2054l0.a(this.f30430b);
        fw1Var.a(this.f30430b);
        return Unit.f41027a;
    }
}
