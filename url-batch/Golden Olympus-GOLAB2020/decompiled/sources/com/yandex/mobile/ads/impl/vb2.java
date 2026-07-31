package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.yandex.mobile.ads.impl.gv1;
import java.util.LinkedHashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.video.core.VideoAdLoaderController$initSdk$1", f = "VideoAdLoaderController.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class vb2 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f33569b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac2 f33570c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f33571d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f33572e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<hb2, Unit> f33573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    vb2(ac2 ac2Var, Object obj, Function0<Unit> function0, Function1<? super hb2, Unit> function1, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f33570c = ac2Var;
        this.f33571d = obj;
        this.f33572e = function0;
        this.f33573f = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new vb2(this.f33570c, this.f33571d, this.f33572e, this.f33573f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vb2) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        jv1 jv1Var;
        ib2 ib2Var;
        LinkedHashSet linkedHashSet;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f33569b;
        if (i4 == 0) {
            ResultKt.a(obj);
            jv1Var = this.f33570c.f23231f;
            ok0 ok0Var = ok0.f30068e;
            this.f33569b = 1;
            obj = jv1Var.a(ok0Var, this);
            if (obj == f4) {
                return f4;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
        }
        gv1 gv1Var = (gv1) obj;
        if (gv1Var instanceof gv1.b) {
            gv1.b bVar = (gv1.b) gv1Var;
            ac2.a(this.f33570c, bVar.a(), bVar.b());
            linkedHashSet = this.f33570c.f23234i;
            linkedHashSet.add(this.f33571d);
            this.f33572e.invoke();
        } else if (gv1Var instanceof gv1.a) {
            ib2Var = this.f33570c.f23232g;
            C1866d3 error = ((gv1.a) gv1Var).a();
            ib2Var.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            this.f33573f.invoke(new hb2(error.b(), error.d() != null ? error.c() : "Internal error occured while loading ads."));
        }
        return Unit.f41027a;
    }
}
