package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class go extends bw {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1585w2 f16540e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f16541f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(@NotNull C1585w2 tools, @NotNull AbstractC1584w1 adUnitData) {
        super(tools, adUnitData);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f16540e = tools;
        this.f16541f = adUnitData;
    }

    private final C1492j5 b() {
        return new C1492j5("", new JSONObject(), null, 0, "");
    }

    private final Map<String, C1473h0> c() {
        fu f4 = this.f16541f.b().f();
        List<NetworkSettings> m4 = this.f16541f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m4) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (f4 == null || f4.a(networkSettings, this.f16541f.b().a())) {
                if (!networkSettings.isBidder(this.f16541f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            NetworkSettings networkSettings2 = (NetworkSettings) obj2;
            Pair pair = TuplesKt.to(networkSettings2.getProviderInstanceName(), new C1473h0(this.f16540e, this.f16541f, networkSettings2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    private final String d() {
        return "fallback_" + System.currentTimeMillis();
    }

    private final List<C1513m5> e() {
        fu f4 = this.f16541f.b().f();
        List<NetworkSettings> m4 = this.f16541f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m4) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (f4 == null || f4.a(networkSettings, this.f16541f.b().a())) {
                if (!networkSettings.isBidder(this.f16541f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(new C1513m5(((NetworkSettings) obj2).getProviderInstanceName()));
        }
        return arrayList2;
    }

    public final void a(@NotNull cw waterfallFetcherListener, int i4, @NotNull String auctionFallback, @NotNull InterfaceC1445d0 adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new C1492j5(d(), new JSONObject(), null, i4, auctionFallback), adInstanceFactory);
    }

    private final void a(cw cwVar, C1492j5 c1492j5, InterfaceC1445d0 interfaceC1445d0) {
        IronLog.INTERNAL.verbose(C1525o1.a(this.f16540e, (String) null, (String) null, 3, (Object) null));
        cwVar.a(a(e(), c(), c1492j5, interfaceC1445d0));
    }

    @Override // com.ironsource.bw
    public void a(@NotNull InterfaceC1445d0 adInstanceFactory, @NotNull cw waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C1525o1.a(this.f16540e, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, b(), adInstanceFactory);
    }
}
