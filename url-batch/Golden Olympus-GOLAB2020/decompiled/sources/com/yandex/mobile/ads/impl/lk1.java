package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o2.AbstractC3313G;
import o2.AbstractC3333i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lk1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ro f28633a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qo f28634b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final kx0<com.monetization.ads.mediation.base.a> f28635c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final dk1 f28636d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ek1 f28637e;

    public /* synthetic */ lk1(qx0 qx0Var, ro roVar) {
        this(qx0Var, roVar, new qo(), new kx0(qx0Var), new dk1(), new ek1());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r0 != r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r0 == r12) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(long j4, Context context, gs gsVar, vy1 vy1Var, lk1 lk1Var, String str, List list, kotlin.coroutines.d dVar) {
        ik1 ik1Var;
        lk1 lk1Var2;
        int i4;
        lk1Var.getClass();
        if (dVar instanceof ik1) {
            ik1Var = (ik1) dVar;
            int i5 = ik1Var.f27229d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ik1Var.f27229d = i5 - Integer.MIN_VALUE;
                lk1Var2 = lk1Var;
                Object obj = ik1Var.f27227b;
                Object f4 = AbstractC1241b.f();
                i4 = ik1Var.f27229d;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    if (list.isEmpty()) {
                        wj1 wj1Var = wj1.f34092d;
                        return new yj1(CollectionsKt.listOf(uy0.a()));
                    }
                    jk1 jk1Var = new jk1(j4, context, gsVar, vy1Var, lk1Var2, str, list, null);
                    ik1Var.f27229d = 1;
                    obj = o2.K.g(jk1Var, ik1Var);
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                        List list2 = (List) obj;
                        if (!list2.isEmpty()) {
                            return new yj1(list2);
                        }
                        wj1 wj1Var2 = wj1.f34092d;
                        return new yj1(CollectionsKt.listOf(uy0.a()));
                    }
                    ResultKt.a(obj);
                }
                AbstractC3313G b4 = o2.Z.b();
                kk1 kk1Var = new kk1((List) obj, null);
                ik1Var.f27229d = 2;
                obj = AbstractC3333i.g(b4, kk1Var, ik1Var);
            }
        }
        lk1Var2 = lk1Var;
        ik1Var = new ik1(lk1Var2, dVar);
        Object obj2 = ik1Var.f27227b;
        Object f42 = AbstractC1241b.f();
        i4 = ik1Var.f27229d;
        if (i4 != 0) {
        }
        AbstractC3313G b42 = o2.Z.b();
        kk1 kk1Var2 = new kk1((List) obj2, null);
        ik1Var.f27229d = 2;
        obj2 = AbstractC3333i.g(b42, kk1Var2, ik1Var);
    }

    public lk1(@NotNull qx0 mediatedAdapterReporter, @NotNull ro clientBiddingReporter, @NotNull qo clientBiddingDurationTracker, @NotNull kx0<com.monetization.ads.mediation.base.a> mediatedAdapterCreator, @NotNull dk1 prefetchedMediationNetworkDataLoader, @NotNull ek1 prefetchedMediationNetworkMapper) {
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(clientBiddingReporter, "clientBiddingReporter");
        Intrinsics.checkNotNullParameter(clientBiddingDurationTracker, "clientBiddingDurationTracker");
        Intrinsics.checkNotNullParameter(mediatedAdapterCreator, "mediatedAdapterCreator");
        Intrinsics.checkNotNullParameter(prefetchedMediationNetworkDataLoader, "prefetchedMediationNetworkDataLoader");
        Intrinsics.checkNotNullParameter(prefetchedMediationNetworkMapper, "prefetchedMediationNetworkMapper");
        this.f28633a = clientBiddingReporter;
        this.f28634b = clientBiddingDurationTracker;
        this.f28635c = mediatedAdapterCreator;
        this.f28636d = prefetchedMediationNetworkDataLoader;
        this.f28637e = prefetchedMediationNetworkMapper;
    }

    public static final void a(lk1 lk1Var, xy0 xy0Var) {
        lk1Var.getClass();
        if (StringsKt.N(xy0Var.e(), "LevelPlay", true)) {
            List listOf = CollectionsKt.listOf((Object[]) new String[]{"app_key", "placement_name"});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOf) {
                if (!xy0Var.i().containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Required configuration parameters are missing");
            }
        }
    }
}
