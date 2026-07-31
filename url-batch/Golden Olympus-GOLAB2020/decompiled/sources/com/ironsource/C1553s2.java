package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
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

@Metadata
/* renamed from: com.ironsource.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1553s2 extends com.ironsource.mediationsdk.h {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, C1494k0> f18939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1553s2(@NotNull List<? extends NetworkSettings> providers, int i4) {
        super(providers, i4);
        Intrinsics.checkNotNullParameter(providers, "providers");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(providers, 10)), 16));
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            Pair pair = TuplesKt.to(((NetworkSettings) it.next()).getProviderName(), new C1494k0(i4));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.f18939e = linkedHashMap;
    }

    @Override // com.ironsource.mediationsdk.h
    @NotNull
    public String a(@NotNull String instanceName) {
        String d4;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        C1494k0 c1494k0 = this.f18939e.get(instanceName);
        return (c1494k0 == null || (d4 = c1494k0.d()) == null) ? "" : d4;
    }

    public final void a(@NotNull dw waterfallInstances) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        List<AbstractC1424a0> b4 = waterfallInstances.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(b4, 10)), 16));
        for (AbstractC1424a0 abstractC1424a0 : b4) {
            Pair pair = TuplesKt.to(abstractC1424a0.o(), abstractC1424a0.r());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        a(linkedHashMap);
    }

    private final void a(Map<String, C1480i0> map) {
        for (Map.Entry<String, C1494k0> entry : this.f18939e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }
}
