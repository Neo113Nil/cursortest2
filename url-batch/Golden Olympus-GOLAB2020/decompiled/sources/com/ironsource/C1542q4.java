package com.ironsource;

import com.ironsource.C1542q4;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.z7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1542q4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1585w2 f18754a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f18755b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, C1473h0> f18756c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1457e5 f18757d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<w7> f18758e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f18759f;

    @Metadata
    /* renamed from: com.ironsource.q4$a */
    public static final class a extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z7 f18760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1542q4 f18761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z7.b f18762c;

        a(z7 z7Var, C1542q4 c1542q4, z7.b bVar) {
            this.f18760a = z7Var;
            this.f18761b = c1542q4;
            this.f18762c = bVar;
        }

        @Override // com.ironsource.ir
        public void a() {
            this.f18760a.a(this.f18761b.e(), this.f18762c, this.f18761b.f18755b.f(), TimeUnit.MILLISECONDS);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.q4$b */
    public static final class b implements x7 {
        b() {
        }

        @Override // com.ironsource.x7
        public void a(@Nullable NetworkSettings networkSettings) {
            AdapterBaseInterface a4;
            if (C1542q4.this.h()) {
                a4 = null;
                BaseAdAdapter b4 = C1542q4.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (b4 != null) {
                    a4 = b4.getNetworkAdapter();
                }
            } else {
                a4 = C1542q4.this.a(networkSettings);
            }
            if (a4 != null) {
                C1542q4.this.f18754a.e().g().a(C1542q4.this.a(networkSettings, a4));
            }
        }

        @Override // com.ironsource.x7
        public void a(@Nullable String str) {
            C1542q4.this.f18754a.e().h().g(str);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.q4$c */
    public static final class c implements z7.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f18765b;

        c(d dVar) {
            this.f18765b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C1542q4 this$0, long j4, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(biddingDataList, "$biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "$reachedTimeout");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a(j4, biddingDataList, reachedTimeout, biddingDataListener);
        }

        @Override // com.ironsource.z7.b
        public void onFailure(@NotNull final String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C1585w2 c1585w2 = C1542q4.this.f18754a;
            final C1542q4 c1542q4 = C1542q4.this;
            final d dVar = this.f18765b;
            c1585w2.a(new Runnable() { // from class: com.ironsource.B3
                @Override // java.lang.Runnable
                public final void run() {
                    C1542q4.c.a(C1542q4.this, error, dVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C1542q4 this$0, String error, d biddingDataListener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(error, "$error");
            Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.f18754a.e().g().a(error);
            biddingDataListener.a(this$0, error);
        }

        @Override // com.ironsource.z7.b
        public void a(@NotNull final List<? extends a8> biddingDataList, final long j4, @NotNull final List<String> reachedTimeout) {
            Intrinsics.checkNotNullParameter(biddingDataList, "biddingDataList");
            Intrinsics.checkNotNullParameter(reachedTimeout, "reachedTimeout");
            C1585w2 c1585w2 = C1542q4.this.f18754a;
            final C1542q4 c1542q4 = C1542q4.this;
            final d dVar = this.f18765b;
            c1585w2.a(new Runnable() { // from class: com.ironsource.C3
                @Override // java.lang.Runnable
                public final void run() {
                    C1542q4.c.a(C1542q4.this, j4, biddingDataList, reachedTimeout, dVar);
                }
            });
        }
    }

    @Metadata
    /* renamed from: com.ironsource.q4$d */
    public interface d {
        void a(@NotNull C1542q4 c1542q4);

        void a(@NotNull C1542q4 c1542q4, @NotNull String str);
    }

    public C1542q4(@NotNull C1585w2 adTools, @NotNull AbstractC1584w1 adUnitData) {
        StringBuilder sb;
        String str;
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f18754a = adTools;
        this.f18755b = adUnitData;
        this.f18756c = a();
        this.f18757d = new C1457e5(adUnitData);
        this.f18758e = new ArrayList();
        this.f18759f = adUnitData.e().p();
        b b4 = b();
        fu f4 = adUnitData.b().f();
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (f4 == null || f4.a(networkSettings, this.f18755b.b().a())) {
                AdData a4 = this.f18755b.a(networkSettings);
                if (networkSettings.isBidder(this.f18755b.b().a())) {
                    Object b5 = this.f18759f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (b5 instanceof y7) {
                        this.f18758e.add(new w7(networkSettings.getInstanceType(this.f18755b.b().a()), networkSettings.getProviderInstanceName(), a4, (y7) b5, b4, networkSettings));
                    } else {
                        if (b5 == null) {
                            sb = new StringBuilder();
                            sb.append("prepareAuctionCandidates - could not load network adapter ");
                            str = networkSettings.getProviderName();
                        } else {
                            sb = new StringBuilder();
                            sb.append("network adapter ");
                            sb.append(networkSettings.getProviderName());
                            str = " does not implementing BiddingDataInterface";
                        }
                        sb.append(str);
                        this.f18754a.e().h().g(sb.toString());
                    }
                } else {
                    this.f18757d.a(networkSettings);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.f18755b.b().a(), this.f18755b.b().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        C1473h0 c1473h0 = this.f18756c.get(str);
        if (c1473h0 != null) {
            return c1473h0.b();
        }
        return null;
    }

    @NotNull
    public final Map<String, C1473h0> c() {
        return this.f18756c;
    }

    @NotNull
    public final C1457e5 d() {
        return this.f18757d;
    }

    @NotNull
    public final List<w7> e() {
        return this.f18758e;
    }

    public final boolean f() {
        return !this.f18758e.isEmpty();
    }

    public final boolean g() {
        return this.f18757d.d();
    }

    public final boolean h() {
        return this.f18759f;
    }

    private final b b() {
        return new b();
    }

    private final z7.b b(d dVar) {
        return new c(dVar);
    }

    private final Map<String, C1473h0> a() {
        List<NetworkSettings> m4 = this.f18755b.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(m4, 10)), 16));
        Iterator<T> it = m4.iterator();
        while (it.hasNext()) {
            C1473h0 c1473h0 = new C1473h0(this.f18754a, this.f18755b, (NetworkSettings) it.next());
            Pair pair = TuplesKt.to(c1473h0.c(), c1473h0);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap hashMap = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e4) {
                o9.d().a(e4);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                StringBuilder sb = new StringBuilder();
                sb.append("getProviderEventData ");
                sb.append(networkSettings != null ? networkSettings.getProviderDefaultInstance() : null);
                logger.logException(ironSourceTag, sb.toString(), e4);
                return hashMap;
            }
        } else {
            providerDefaultInstance = null;
        }
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        hashMap.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        hashMap.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f18755b.b().a())) : null);
        return hashMap;
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface a4;
        NetworkSettings a5 = this.f18755b.a(str);
        if (this.f18759f) {
            BaseAdAdapter<?, ?> b4 = b(str);
            a4 = b4 != null ? b4.getNetworkAdapter() : null;
        } else {
            a4 = a(a5);
        }
        return a(a5, a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j4, List<? extends a8> list, List<String> list2, d dVar) {
        this.f18754a.e().g().a(j4);
        for (a8 a8Var : list) {
            String c4 = a8Var.c();
            Intrinsics.checkNotNullExpressionValue(c4, "biddingResponse.instanceName");
            Map<String, Object> a4 = a(c4);
            if (a8Var.a() != null) {
                this.f18757d.a(a8Var);
                this.f18754a.e().g().a(a4, a8Var.e());
            } else {
                this.f18754a.e().g().a(a4, a8Var.e(), a8Var.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f18754a.e().g().b(a(it.next()), j4);
        }
        dVar.a(this);
    }

    public final void a(@NotNull d biddingDataListener) {
        Intrinsics.checkNotNullParameter(biddingDataListener, "biddingDataListener");
        z7 z7Var = new z7();
        z7.b b4 = b(biddingDataListener);
        this.f18754a.e().g().a();
        this.f18754a.c((ir) new a(z7Var, this, b4));
    }
}
