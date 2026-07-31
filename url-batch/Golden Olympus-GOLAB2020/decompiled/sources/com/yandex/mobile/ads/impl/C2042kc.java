package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3313G;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2042kc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC3313G f28167a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1995ic f28168b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1995ic f28169c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final he0 f28170d;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.identifiers.ad.AdvertisingInfoRequestExecutor$requestAdvertisingInfo$2", f = "AdvertisingInfoRequestExecutor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.kc$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {
        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return C2042kc.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C2042kc.this.new a((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            C1899ec a4 = C2042kc.a(C2042kc.this);
            return (a4.a() == null && a4.c() == null) ? C2066lc.f28503a : new C2090mc(a4);
        }
    }

    public /* synthetic */ C2042kc(Context context) {
        this(context, cu.a(), new je0(context), new jf0(context), ie0.a(context));
    }

    public static final C1899ec a(C2042kc c2042kc) {
        C1851cc a4 = c2042kc.f28168b.a();
        C1851cc a5 = c2042kc.f28169c.a();
        c2042kc.f28170d.b(a4);
        return new C1899ec(a4, a5, c2042kc.f28170d.a(a4));
    }

    public C2042kc(@NotNull Context context, @NotNull AbstractC3313G coroutineDispatcher, @NotNull InterfaceC1995ic gmsAdvertisingInfoProvider, @NotNull InterfaceC1995ic hmsAdvertisingInfoProvider, @NotNull he0 gmsAdvertisingIdStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(gmsAdvertisingInfoProvider, "gmsAdvertisingInfoProvider");
        Intrinsics.checkNotNullParameter(hmsAdvertisingInfoProvider, "hmsAdvertisingInfoProvider");
        Intrinsics.checkNotNullParameter(gmsAdvertisingIdStorage, "gmsAdvertisingIdStorage");
        this.f28167a = coroutineDispatcher;
        this.f28168b = gmsAdvertisingInfoProvider;
        this.f28169c = hmsAdvertisingInfoProvider;
        this.f28170d = gmsAdvertisingIdStorage;
    }

    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d dVar) {
        return AbstractC3333i.g(this.f28167a, new a(null), dVar);
    }
}
