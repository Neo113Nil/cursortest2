package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3327f;
import o2.AbstractC3337k;
import o2.AbstractC3364y;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader$loadWrapperWithVideoAdsInfo$2", f = "NativeWrapperVideoLoader.kt", l = {IronSourceConstants.REGISTER_TRIGGER_FAIL}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class cc1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f24165b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f24166c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<ob2<ya1>> f24167d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ dc1 f24168e;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.videowrapper.NativeWrapperVideoLoader$loadWrapperWithVideoAdsInfo$2$1$1", f = "NativeWrapperVideoLoader.kt", l = {IronSourceConstants.SET_USER_ID}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24169b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ dc1 f24170c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ob2<ya1> f24171d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dc1 dc1Var, ob2<ya1> ob2Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f24170c = dc1Var;
            this.f24171d = ob2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f24170c, this.f24171d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f24170c, this.f24171d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f24169b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                return obj;
            }
            ResultKt.a(obj);
            dc1 dc1Var = this.f24170c;
            List listOf = CollectionsKt.listOf(this.f24171d);
            this.f24169b = 1;
            Object a4 = dc1.a(dc1Var, listOf, this);
            return a4 == f4 ? f4 : a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cc1(dc1 dc1Var, List list, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f24167d = list;
        this.f24168e = dc1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        cc1 cc1Var = new cc1(this.f24168e, this.f24167d, dVar);
        cc1Var.f24166c = obj;
        return cc1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cc1) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f4 = AbstractC1241b.f();
        int i4 = this.f24165b;
        if (i4 == 0) {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f24166c;
            List<ob2<ya1>> list = this.f24167d;
            dc1 dc1Var = this.f24168e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ob2 ob2Var = (ob2) it.next();
                arrayList.add(ob2Var.g().o() ? AbstractC3337k.b(interfaceC3316J, null, null, new a(dc1Var, ob2Var, null), 3, null) : AbstractC3364y.a(CollectionsKt.listOf(ob2Var)));
            }
            this.f24165b = 1;
            obj = AbstractC3327f.a(arrayList, this);
            if (obj == f4) {
                return f4;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
        }
        return CollectionsKt.flatten((Iterable) obj);
    }
}
