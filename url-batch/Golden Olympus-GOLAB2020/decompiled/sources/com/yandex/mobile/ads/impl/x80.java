package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.yandex.mobile.ads.impl.u90;
import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.InterfaceC3397g;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.ui.FeedAdapterInternal$observePagedData$1", f = "FeedAdapterInternal.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class x80 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f34482b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f34483c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w80 f34484d;

    static final class a<T> implements InterfaceC3397g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w80 f34485a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3316J f34486b;

        a(w80 w80Var, InterfaceC3316J interfaceC3316J) {
            this.f34485a = w80Var;
            this.f34486b = interfaceC3316J;
        }

        @Override // r2.InterfaceC3397g
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ba0 ba0Var = (ba0) obj;
            u90 c4 = ba0Var.c();
            if (c4 instanceof u90.a) {
                C1866d3 a4 = ((u90.a) ba0Var.c()).a();
                this.f34485a.submitList(ba0Var.b());
                o2.K.e(this.f34486b, a4.d(), null, 2, null);
            } else if (c4 instanceof u90.c) {
                this.f34485a.submitList(CollectionsKt.plus((Collection<? extends x90>) ba0Var.b(), x90.f34503a));
            } else if (c4 instanceof u90.b) {
                this.f34485a.submitList(ba0Var.b());
            } else if (c4 instanceof u90.d) {
                if (ba0Var.b().isEmpty()) {
                    this.f34485a.submitList(ba0Var.b());
                } else {
                    this.f34485a.submitList(CollectionsKt.plus((Collection<? extends x90>) ba0Var.b(), x90.f34503a));
                }
            }
            return Unit.f41027a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x80(w80 w80Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f34484d = w80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        x80 x80Var = new x80(this.f34484d, dVar);
        x80Var.f34483c = obj;
        return x80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x80 x80Var = new x80(this.f34484d, (kotlin.coroutines.d) obj2);
        x80Var.f34483c = (InterfaceC3316J) obj;
        return x80Var.invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        da0 da0Var;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f34482b;
        if (i4 == 0) {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f34483c;
            da0Var = this.f34484d.f33950a;
            r2.G c4 = da0Var.c();
            a aVar = new a(this.f34484d, interfaceC3316J);
            this.f34482b = 1;
            if (c4.a(aVar, this) == f4) {
                return f4;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
        }
        throw new W1.f();
    }
}
