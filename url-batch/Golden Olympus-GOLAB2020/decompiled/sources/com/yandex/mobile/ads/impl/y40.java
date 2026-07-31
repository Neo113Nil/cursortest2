package com.yandex.mobile.ads.impl;

import D2.AbstractC0348a;
import a2.AbstractC1241b;
import android.content.Context;
import java.util.List;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y40 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34791a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2133o9 f34792b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lk1 f34793c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC0348a f34794d;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.prefetch.EncodedPrefetchedMediationDataLoader", f = "EncodedPrefetchedMediationDataLoader.kt", l = {37}, m = "loadEncodedPrefetchedMediationData")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        y40 f34795b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34796c;

        /* renamed from: e, reason: collision with root package name */
        int f34798e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34796c = obj;
            this.f34798e |= Integer.MIN_VALUE;
            return y40.this.a(null, this);
        }
    }

    public y40(@NotNull C2286v2 adConfiguration, @NotNull C2144ok biddingSettings, @NotNull C2133o9 adUnitIdMediationPrefetchSettingsProvider, @NotNull qx0 mediatedAdapterReporter, @NotNull ro clientBiddingReporter, @NotNull lk1 prefetchedMediationNetworksDataLoader, @NotNull AbstractC0348a jsonEncoder) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(biddingSettings, "biddingSettings");
        Intrinsics.checkNotNullParameter(adUnitIdMediationPrefetchSettingsProvider, "adUnitIdMediationPrefetchSettingsProvider");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(clientBiddingReporter, "clientBiddingReporter");
        Intrinsics.checkNotNullParameter(prefetchedMediationNetworksDataLoader, "prefetchedMediationNetworksDataLoader");
        Intrinsics.checkNotNullParameter(jsonEncoder, "jsonEncoder");
        this.f34791a = adConfiguration;
        this.f34792b = adUnitIdMediationPrefetchSettingsProvider;
        this.f34793c = prefetchedMediationNetworksDataLoader;
        this.f34794d = jsonEncoder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Context context, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        y40 y40Var;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f34798e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f34798e = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f34796c;
                Object f4 = AbstractC1241b.f();
                i4 = aVar.f34798e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    String c4 = this.f34791a.c();
                    rz0 a4 = this.f34792b.a(c4);
                    if (a4 == null || c4 == null) {
                        return null;
                    }
                    gs b4 = this.f34791a.b();
                    vy1 q4 = this.f34791a.q();
                    List<sz0> b5 = a4.b();
                    long a5 = a4.a();
                    lk1 lk1Var = this.f34793c;
                    aVar.f34795b = this;
                    aVar.f34798e = 1;
                    lk1Var.getClass();
                    obj = AbstractC3333i.g(o2.Z.c().p(), new hk1(a5, context, b4, q4, lk1Var, c4, b5, null), aVar);
                    if (obj == f4) {
                        return f4;
                    }
                    y40Var = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y40Var = aVar.f34795b;
                    ResultKt.a(obj);
                }
                AbstractC0348a abstractC0348a = y40Var.f34794d;
                abstractC0348a.a();
                return abstractC0348a.b(yj1.Companion.serializer(), (yj1) obj);
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f34796c;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f34798e;
        if (i4 != 0) {
        }
        AbstractC0348a abstractC0348a2 = y40Var.f34794d;
        abstractC0348a2.a();
        return abstractC0348a2.b(yj1.Companion.serializer(), (yj1) obj2);
    }
}
