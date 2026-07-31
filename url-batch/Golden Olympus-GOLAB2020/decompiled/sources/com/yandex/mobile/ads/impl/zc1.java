package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.bz0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zc1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bz0 f35545a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f35546b;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.bidding.NetworksHeaderBiddingDataLoader$loadNetworksBiddingDataInternal$3", f = "NetworksHeaderBiddingDataLoader.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f35548c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList<JSONObject> f35549d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2098mk f35550e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CountDownLatch countDownLatch, ArrayList<JSONObject> arrayList, C2098mk c2098mk, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f35548c = countDownLatch;
            this.f35549d = arrayList;
            this.f35550e = c2098mk;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return zc1.this.new a(this.f35548c, this.f35549d, this.f35550e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            return zc1.a(zc1.this, this.f35548c, this.f35549d, this.f35550e);
        }
    }

    public /* synthetic */ zc1(qx0 qx0Var) {
        this(qx0Var, new bz0(qx0Var));
    }

    public static final JSONArray a(zc1 zc1Var, CountDownLatch countDownLatch, ArrayList arrayList, C2098mk c2098mk) {
        JSONArray jSONArray;
        zc1Var.getClass();
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                ap0.b(new Object[0]);
            }
            c2098mk.b();
            synchronized (zc1Var.f35546b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    public zc1(@NotNull qx0 mediatedAdapterReporter, @NotNull bz0 mediationNetworkBiddingDataLoader) {
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediationNetworkBiddingDataLoader, "mediationNetworkBiddingDataLoader");
        this.f35545a = mediationNetworkBiddingDataLoader;
        this.f35546b = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Context context, vy1 vy1Var, List<xy0> list, kotlin.coroutines.d dVar) {
        final ArrayList arrayList = new ArrayList(list.size());
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        C2098mk c2098mk = new C2098mk();
        Iterator<xy0> it = list.iterator();
        while (it.hasNext()) {
            C2098mk c2098mk2 = c2098mk;
            this.f35545a.a(context, vy1Var, it.next(), c2098mk2, new bz0.a() { // from class: com.yandex.mobile.ads.impl.Gm
                @Override // com.yandex.mobile.ads.impl.bz0.a
                public final void a(JSONObject jSONObject) {
                    zc1.a(zc1.this, countDownLatch, arrayList, jSONObject);
                }
            });
            c2098mk = c2098mk2;
        }
        return AbstractC3333i.g(o2.Z.b(), new a(countDownLatch, arrayList, c2098mk, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(zc1 this$0, CountDownLatch resultsCollectingLatch, ArrayList networksBiddingDataList, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resultsCollectingLatch, "$resultsCollectingLatch");
        Intrinsics.checkNotNullParameter(networksBiddingDataList, "$networksBiddingDataList");
        if (jSONObject != null) {
            synchronized (this$0.f35546b) {
                networksBiddingDataList.add(jSONObject);
            }
        }
        resultsCollectingLatch.countDown();
    }
}
