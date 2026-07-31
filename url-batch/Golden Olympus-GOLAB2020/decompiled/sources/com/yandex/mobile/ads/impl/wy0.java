package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yy0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wy0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dz0 f34340a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mz0 f34341b;

    public /* synthetic */ wy0() {
        this(new dz0(), new mz0());
    }

    @NotNull
    public final Map<String, Object> a(boolean z4) {
        String str = z4 ? "ads-mediation" : "single";
        int i4 = yy0.f35386e;
        ArrayList a4 = this.f34341b.a(yy0.a.a());
        ArrayList arrayList = new ArrayList();
        int size = a4.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj = a4.get(i6);
            i6++;
            this.f34340a.getClass();
            if (dz0.a((cz0) obj)) {
                arrayList.add(obj);
            }
        }
        Pair pair = TuplesKt.to("integration_type", str);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size2 = arrayList.size();
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            arrayList2.add(MapsKt.mapOf(TuplesKt.to("name", ((cz0) obj2).d())));
        }
        return MapsKt.mapOf(pair, TuplesKt.to(com.ironsource.ge.f16516z1, arrayList2));
    }

    public wy0(@NotNull dz0 mediationNetworkValidator, @NotNull mz0 mediationNetworksDataProvider) {
        Intrinsics.checkNotNullParameter(mediationNetworkValidator, "mediationNetworkValidator");
        Intrinsics.checkNotNullParameter(mediationNetworksDataProvider, "mediationNetworksDataProvider");
        this.f34340a = mediationNetworkValidator;
        this.f34341b = mediationNetworksDataProvider;
    }
}
