package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b90 f31080a;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.data.preloader.FeedItemPreloadDataSource$prepareLoadedAd$2", f = "FeedItemPreloadDataSource.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ or0 f31081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r90 f31082c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(or0 or0Var, r90 r90Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f31081b = or0Var;
            this.f31082c = r90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f31081b, this.f31082c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f31081b, this.f31082c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            pz1 b4 = this.f31081b.b();
            List<q20> c4 = b4.c();
            if (c4 == null) {
                c4 = Collections.EMPTY_LIST;
            }
            Intrinsics.checkNotNull(c4);
            r90 r90Var = this.f31082c;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = c4.iterator();
            while (it.hasNext()) {
                pk1 a4 = r90Var.f31080a.a((q20) it.next(), b4);
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
            return new d90(this.f31081b.b(), this.f31081b.a(), arrayList);
        }
    }

    public r90(@NotNull b90 divKitViewPreloader) {
        Intrinsics.checkNotNullParameter(divKitViewPreloader, "divKitViewPreloader");
        this.f31080a = divKitViewPreloader;
    }

    @Nullable
    public final Object a(@NotNull or0 or0Var, @NotNull kotlin.coroutines.d dVar) {
        return AbstractC3333i.g(o2.Z.a(), new a(or0Var, this, null), dVar);
    }
}
