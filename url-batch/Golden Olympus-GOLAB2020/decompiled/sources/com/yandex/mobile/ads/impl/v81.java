package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeImagesLoader$loadInBackground$1", f = "NativeImagesLoader.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class v81 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f33546b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3396f f33547c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ zi0 f33548d;

    static final class a<T> implements InterfaceC3397g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ zi0 f33549a;

        a(zi0 zi0Var) {
            this.f33549a = zi0Var;
        }

        @Override // r2.InterfaceC3397g
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            pi0 pi0Var = (pi0) obj;
            this.f33549a.a(pi0Var.b(), pi0Var.a());
            return Unit.f41027a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v81(InterfaceC3396f interfaceC3396f, zi0 zi0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f33547c = interfaceC3396f;
        this.f33548d = zi0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new v81(this.f33547c, this.f33548d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v81(this.f33547c, this.f33548d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f4 = AbstractC1241b.f();
        int i4 = this.f33546b;
        if (i4 == 0) {
            ResultKt.a(obj);
            InterfaceC3396f interfaceC3396f = this.f33547c;
            a aVar = new a(this.f33548d);
            this.f33546b = 1;
            if (interfaceC3396f.a(aVar, this) == f4) {
                return f4;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
        }
        return Unit.f41027a;
    }
}
