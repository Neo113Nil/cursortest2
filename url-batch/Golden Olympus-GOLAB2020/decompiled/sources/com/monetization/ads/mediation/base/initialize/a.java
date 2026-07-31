package com.monetization.ads.mediation.base.initialize;

import a2.AbstractC1241b;
import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializationResult;
import com.yandex.mobile.ads.impl.C2121nk;
import com.yandex.mobile.ads.impl.C2144ok;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.du1;
import com.yandex.mobile.ads.impl.ek1;
import com.yandex.mobile.ads.impl.jy0;
import com.yandex.mobile.ads.impl.mx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.qz0;
import com.yandex.mobile.ads.impl.sz0;
import com.yandex.mobile.ads.impl.tz0;
import com.yandex.mobile.ads.impl.vu1;
import com.yandex.mobile.ads.impl.xy0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f20743g = new AtomicBoolean(true);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f20744a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2121nk f20745b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ek1 f20746c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final jy0 f20747d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final nx0 f20748e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final mx0 f20749f;

    @f(c = "com.monetization.ads.mediation.base.initialize.MediatedNetworksSdksInitializer$initialize$1", f = "MediatedNetworksSdksInitializer.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: com.monetization.ads.mediation.base.initialize.a$a, reason: collision with other inner class name */
    static final class C0171a extends l implements Function2<InterfaceC3316J, d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f20750b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f20752d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2144ok f20753e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0171a(Context context, C2144ok c2144ok, d dVar) {
            super(2, dVar);
            this.f20752d = context;
            this.f20753e = c2144ok;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d create(@Nullable Object obj, @NotNull d dVar) {
            return a.this.new C0171a(this.f20752d, this.f20753e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((C0171a) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f20750b;
            if (i4 == 0) {
                ResultKt.a(obj);
                a aVar = a.this;
                Context context = this.f20752d;
                C2144ok c2144ok = this.f20753e;
                this.f20750b = 1;
                if (a.a(aVar, context, c2144ok, this) == f4) {
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

    @f(c = "com.monetization.ads.mediation.base.initialize.MediatedNetworksSdksInitializer", f = "MediatedNetworksSdksInitializer.kt", l = {60}, m = "initializeNetwork")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        String f20754b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f20755c;

        /* renamed from: e, reason: collision with root package name */
        int f20757e;

        b(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20755c = obj;
            this.f20757e |= Integer.MIN_VALUE;
            return a.a(a.this, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(vu1 vu1Var) {
        this(vu1Var, r2, r3, r4, new nx0(r4), new mx0(r4));
        C2121nk c2121nk = new C2121nk();
        ek1 ek1Var = new ek1();
        jy0 jy0Var = new jy0();
    }

    public static final Object a(a aVar, Context context, C2144ok biddingSettings, d dVar) {
        Collection<sz0> emptyList;
        List<qz0> e4;
        aVar.getClass();
        if (!f20743g.getAndSet(false)) {
            return Unit.f41027a;
        }
        aVar.f20745b.getClass();
        Intrinsics.checkNotNullParameter(biddingSettings, "biddingSettings");
        tz0 d4 = biddingSettings.d();
        if (d4 == null || (e4 = d4.e()) == null) {
            emptyList = CollectionsKt.emptyList();
        } else {
            emptyList = new ArrayList();
            Iterator<T> it = e4.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(emptyList, ((qz0) it.next()).e());
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
        for (sz0 mediationPrefetchNetwork : emptyList) {
            aVar.f20746c.getClass();
            Intrinsics.checkNotNullParameter(mediationPrefetchNetwork, "mediationPrefetchNetwork");
            arrayList.add(new xy0(mediationPrefetchNetwork.d(), mediationPrefetchNetwork.e(), null, null, null, null, null));
        }
        Object a4 = aVar.a(context, aVar.f20748e.a(arrayList), dVar);
        return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
    }

    public a(@NotNull vu1 sdkEnvironmentModule, @NotNull C2121nk biddingNetworksProvider, @NotNull ek1 prefetchedMediationNetworkMapper, @NotNull jy0 paramsParser, @NotNull nx0 adapterMapper, @NotNull mx0 mediatedAdapterInitializerProvider) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(biddingNetworksProvider, "biddingNetworksProvider");
        Intrinsics.checkNotNullParameter(prefetchedMediationNetworkMapper, "prefetchedMediationNetworkMapper");
        Intrinsics.checkNotNullParameter(paramsParser, "paramsParser");
        Intrinsics.checkNotNullParameter(adapterMapper, "adapterMapper");
        Intrinsics.checkNotNullParameter(mediatedAdapterInitializerProvider, "mediatedAdapterInitializerProvider");
        this.f20744a = sdkEnvironmentModule;
        this.f20745b = biddingNetworksProvider;
        this.f20746c = prefetchedMediationNetworkMapper;
        this.f20747d = paramsParser;
        this.f20748e = adapterMapper;
        this.f20749f = mediatedAdapterInitializerProvider;
    }

    public final void a(@NotNull Context context, @NotNull du1 sdkConfiguration, @NotNull InterfaceC3316J coroutineScope) {
        C2144ok l4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        if (sdkConfiguration.a0() && (l4 = sdkConfiguration.l()) != null) {
            AbstractC3337k.d(coroutineScope, null, null, new C0171a(context, l4, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Context context, xy0 xy0Var, d dVar) {
        b bVar;
        int i4;
        MediatedAdapterInitializationResult mediatedAdapterInitializationResult;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i5 = bVar.f20757e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f20757e = i5 - Integer.MIN_VALUE;
                Object obj = bVar.f20755c;
                Object f4 = AbstractC1241b.f();
                i4 = bVar.f20757e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    String b4 = this.f20747d.b(xy0Var);
                    MediatedAdapterInitializer a4 = this.f20749f.a(context, xy0Var, this.f20744a);
                    if (a4 != null) {
                        Map<String, String> i6 = xy0Var.i();
                        bVar.f20754b = b4;
                        bVar.f20757e = 1;
                        obj = a4.initialize(context, i6, bVar);
                        if (obj == f4) {
                            return f4;
                        }
                    } else {
                        mediatedAdapterInitializationResult = null;
                        if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Success) {
                            ap0.a(new Object[0]);
                        } else if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Failure) {
                            MediatedAdapterInitializationResult.Failure failure = (MediatedAdapterInitializationResult.Failure) mediatedAdapterInitializationResult;
                            failure.getErrorCode();
                            failure.getErrorMessage();
                            ap0.b(new Object[0]);
                        } else if (mediatedAdapterInitializationResult == null) {
                            ap0.b(new Object[0]);
                        }
                        return Unit.f41027a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                mediatedAdapterInitializationResult = (MediatedAdapterInitializationResult) obj;
                if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Success) {
                }
                return Unit.f41027a;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f20755c;
        Object f42 = AbstractC1241b.f();
        i4 = bVar.f20757e;
        if (i4 != 0) {
        }
        mediatedAdapterInitializationResult = (MediatedAdapterInitializationResult) obj2;
        if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Success) {
        }
        return Unit.f41027a;
    }

    public static final /* synthetic */ Object a(a aVar, d dVar) {
        return aVar.a((Context) null, (xy0) null, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ArrayList arrayList, d dVar) {
        com.monetization.ads.mediation.base.initialize.b bVar;
        int i4;
        Context context2;
        Iterator it;
        a aVar;
        if (dVar instanceof com.monetization.ads.mediation.base.initialize.b) {
            bVar = (com.monetization.ads.mediation.base.initialize.b) dVar;
            int i5 = bVar.f20763g;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f20763g = i5 - Integer.MIN_VALUE;
                Object obj = bVar.f20761e;
                Object f4 = AbstractC1241b.f();
                i4 = bVar.f20763g;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    Iterator it2 = arrayList.iterator();
                    context2 = context;
                    it = it2;
                    aVar = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = bVar.f20760d;
                    context2 = bVar.f20759c;
                    aVar = bVar.f20758b;
                    ResultKt.a(obj);
                }
                while (it.hasNext()) {
                    xy0 xy0Var = (xy0) it.next();
                    bVar.f20758b = aVar;
                    bVar.f20759c = context2;
                    bVar.f20760d = it;
                    bVar.f20763g = 1;
                    if (aVar.a(context2, xy0Var, bVar) == f4) {
                        return f4;
                    }
                }
                return Unit.f41027a;
            }
        }
        bVar = new com.monetization.ads.mediation.base.initialize.b(this, dVar);
        Object obj2 = bVar.f20761e;
        Object f42 = AbstractC1241b.f();
        i4 = bVar.f20763g;
        if (i4 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f41027a;
    }
}
