package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.dns.DnsPrefetcher$prefetchUrlList$2", f = "DnsPrefetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h30 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f26536b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<String> f26537c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g30 f26538d;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.dns.DnsPrefetcher$prefetchUrlList$2$1$1", f = "DnsPrefetcher.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g30 f26539b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26540c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g30 g30Var, String str, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f26539b = g30Var;
            this.f26540c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f26539b, this.f26540c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f26539b, this.f26540c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            this.f26539b.a(this.f26540c);
            return Unit.f41027a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h30(g30 g30Var, List list, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f26537c = list;
        this.f26538d = g30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        h30 h30Var = new h30(this.f26538d, this.f26537c, dVar);
        h30Var.f26536b = obj;
        return h30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h30) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC1241b.f();
        ResultKt.a(obj);
        InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f26536b;
        List<String> list = this.f26537c;
        g30 g30Var = this.f26538d;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC3337k.d(interfaceC3316J, null, null, new a(g30Var, (String) it.next(), null), 3, null);
        }
        return Unit.f41027a;
    }
}
