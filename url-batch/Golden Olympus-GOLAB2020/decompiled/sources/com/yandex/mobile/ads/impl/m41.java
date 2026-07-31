package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3327f;
import o2.AbstractC3337k;
import o2.AbstractC3364y;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader$updateNativeAdsWithWrappers$2", f = "NativeAdBlockVideoWrapperLoader.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m41 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    l41 f28877b;

    /* renamed from: c, reason: collision with root package name */
    Collection f28878c;

    /* renamed from: d, reason: collision with root package name */
    Iterator f28879d;

    /* renamed from: e, reason: collision with root package name */
    u31 f28880e;

    /* renamed from: f, reason: collision with root package name */
    Collection f28881f;

    /* renamed from: g, reason: collision with root package name */
    int f28882g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f28883h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ List<u31> f28884i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ l41 f28885j;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeAdBlockVideoWrapperLoader$updateNativeAdsWithWrappers$2$1$newAssets$1$1", f = "NativeAdBlockVideoWrapperLoader.kt", l = {43}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28886b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l41 f28887c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2276uf<?> f28888d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l41 l41Var, C2276uf<?> c2276uf, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f28887c = l41Var;
            this.f28888d = c2276uf;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f28887c, this.f28888d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f28887c, this.f28888d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f28886b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                return obj;
            }
            ResultKt.a(obj);
            l41 l41Var = this.f28887c;
            C2276uf<?> c2276uf = this.f28888d;
            this.f28886b = 1;
            Object a4 = l41.a(l41Var, c2276uf, this);
            return a4 == f4 ? f4 : a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m41(List<u31> list, l41 l41Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28884i = list;
        this.f28885j = l41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        m41 m41Var = new m41(this.f28884i, this.f28885j, dVar);
        m41Var.f28883h = obj;
        return m41Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m41) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0102  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ee -> B:5:0x00f1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Collection arrayList;
        Iterator it;
        l41 l41Var;
        InterfaceC3316J interfaceC3316J;
        Collection collection;
        zb1 zb1Var;
        o2.Q a4;
        mw0 mw0Var;
        ab2 c4;
        List<ob2<ya1>> c5;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f28882g;
        if (i4 == 0) {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J2 = (InterfaceC3316J) this.f28883h;
            List<u31> list = this.f28884i;
            l41 l41Var2 = this.f28885j;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            it = list.iterator();
            l41Var = l41Var2;
            interfaceC3316J = interfaceC3316J2;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = this.f28881f;
            u31 u31Var = this.f28880e;
            Iterator it2 = this.f28879d;
            arrayList = this.f28878c;
            l41 l41Var3 = this.f28877b;
            InterfaceC3316J interfaceC3316J3 = (InterfaceC3316J) this.f28883h;
            ResultKt.a(obj);
            it = it2;
            l41Var = l41Var3;
            Object a5 = obj;
            List list2 = (List) a5;
            List filterNotNull = CollectionsKt.filterNotNull(list2);
            if (list2.size() == filterNotNull.size()) {
                return null;
            }
            collection.add(u31.a(u31Var, filterNotNull));
            interfaceC3316J = interfaceC3316J3;
            collection = arrayList;
            if (it.hasNext()) {
                return (List) collection;
            }
            u31 u31Var2 = (u31) it.next();
            List<C2276uf<?>> b4 = u31Var2.b();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
            Iterator<T> it3 = b4.iterator();
            while (it3.hasNext()) {
                C2276uf asset = (C2276uf) it3.next();
                zb1Var = l41Var.f28415c;
                zb1Var.getClass();
                Intrinsics.checkNotNullParameter(asset, "asset");
                C2276uf c2276uf = asset.d() instanceof mw0 ? asset : null;
                if (c2276uf != null && (mw0Var = (mw0) c2276uf.d()) != null && (c4 = mw0Var.c()) != null && (c5 = c4.c()) != null && !c5.isEmpty()) {
                    Iterator<T> it4 = c5.iterator();
                    while (it4.hasNext()) {
                        if (((ob2) it4.next()).g().o()) {
                            a4 = AbstractC3337k.b(interfaceC3316J, null, null, new a(l41Var, asset, null), 3, null);
                            break;
                        }
                    }
                }
                a4 = AbstractC3364y.a(asset);
                arrayList2.add(a4);
            }
            this.f28883h = interfaceC3316J;
            this.f28877b = l41Var;
            this.f28878c = collection;
            this.f28879d = it;
            this.f28880e = u31Var2;
            this.f28881f = collection;
            this.f28882g = 1;
            a5 = AbstractC3327f.a(arrayList2, this);
            if (a5 == f4) {
                return f4;
            }
            arrayList = collection;
            interfaceC3316J3 = interfaceC3316J;
            u31Var = u31Var2;
            List list22 = (List) a5;
            List filterNotNull2 = CollectionsKt.filterNotNull(list22);
            if (list22.size() == filterNotNull2.size()) {
            }
        }
    }
}
