package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import io.appmetrica.analytics.impl.C3139z9;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader$loadWrapperInVideo$2", f = "NativeWrapperVideoLoader.kt", l = {C3139z9.f40334K}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ac1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    ab2 f23222b;

    /* renamed from: c, reason: collision with root package name */
    int f23223c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ab2 f23224d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ dc1 f23225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac1(ab2 ab2Var, dc1 dc1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f23224d = ab2Var;
        this.f23225e = dc1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new ac1(this.f23224d, this.f23225e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ac1(this.f23224d, this.f23225e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ab2 ab2Var;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f23223c;
        if (i4 == 0) {
            ResultKt.a(obj);
            ab2 ab2Var2 = this.f23224d;
            if (ab2Var2 == null) {
                return null;
            }
            dc1 dc1Var = this.f23225e;
            List<ob2<ya1>> c4 = ab2Var2.c();
            this.f23222b = ab2Var2;
            this.f23223c = 1;
            dc1Var.getClass();
            Object g4 = AbstractC3333i.g(o2.Z.b(), new cc1(dc1Var, c4, null), this);
            if (g4 == f4) {
                return f4;
            }
            ab2Var = ab2Var2;
            obj = g4;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ab2Var = this.f23222b;
            ResultKt.a(obj);
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            throw new i61("Invalid VAST in response");
        }
        return ab2.a(ab2Var, list);
    }
}
