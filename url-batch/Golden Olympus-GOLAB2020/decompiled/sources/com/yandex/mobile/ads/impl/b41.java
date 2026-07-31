package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.yandex.mobile.ads.impl.gp;
import com.yandex.mobile.ads.impl.ot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zi0 f23588a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q51 f23589b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c61 f23590c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final n71 f23591d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final v71 f23592e;

    public /* synthetic */ b41(zi0 zi0Var) {
        this(zi0Var, new q51(), new c61(), new n71(), new v71());
    }

    @NotNull
    public final ct a(@NotNull u31 nativeAd) {
        gp.a b4;
        ot.a aVar;
        List<ej0> a4;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<C2276uf<?>> b5 = nativeAd.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(b5, 10)), 16));
        Iterator<T> it = b5.iterator();
        while (it.hasNext()) {
            C2276uf c2276uf = (C2276uf) it.next();
            Pair pair = TuplesKt.to(c2276uf.b(), c2276uf.d());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Object obj = linkedHashMap.get(b9.h.f15446I0);
        ot otVar = null;
        mw0 mw0Var = obj instanceof mw0 ? (mw0) obj : null;
        Object obj2 = linkedHashMap.get("favicon");
        ej0 ej0Var = obj2 instanceof ej0 ? (ej0) obj2 : null;
        Object obj3 = linkedHashMap.get(b9.h.f15444H0);
        ej0 ej0Var2 = obj3 instanceof ej0 ? (ej0) obj3 : null;
        Object obj4 = linkedHashMap.get("close_button");
        gp gpVar = obj4 instanceof gp ? (gp) obj4 : null;
        Object obj5 = linkedHashMap.get(IronSourceSegment.AGE);
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = linkedHashMap.get(b9.h.f15438E0);
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = linkedHashMap.get("call_to_action");
        String str3 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = linkedHashMap.get(b9.i.f15522D);
        String str4 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = linkedHashMap.get("price");
        String str5 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = linkedHashMap.get("rating");
        String str6 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = linkedHashMap.get("review_count");
        String str7 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = linkedHashMap.get("sponsored");
        String str8 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = linkedHashMap.get(b9.h.f15436D0);
        String str9 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = linkedHashMap.get("warning");
        String str10 = obj14 instanceof String ? (String) obj14 : null;
        boolean z4 = linkedHashMap.get("feedback") != null;
        ej0 ej0Var3 = (mw0Var == null || (a4 = mw0Var.a()) == null) ? null : (ej0) CollectionsKt.firstOrNull((List) a4);
        q51 q51Var = this.f23589b;
        zi0 imageProvider = this.f23588a;
        q51Var.getClass();
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        et etVar = ej0Var3 != null ? new et(new p51(imageProvider, ej0Var3), ej0Var3.d(), ej0Var3.g(), ej0Var3.a()) : null;
        q51 q51Var2 = this.f23589b;
        zi0 imageProvider2 = this.f23588a;
        q51Var2.getClass();
        Intrinsics.checkNotNullParameter(imageProvider2, "imageProvider");
        et etVar2 = ej0Var != null ? new et(new p51(imageProvider2, ej0Var), ej0Var.d(), ej0Var.g(), ej0Var.a()) : null;
        q51 q51Var3 = this.f23589b;
        zi0 imageProvider3 = this.f23588a;
        q51Var3.getClass();
        Intrinsics.checkNotNullParameter(imageProvider3, "imageProvider");
        et etVar3 = ej0Var2 != null ? new et(new p51(imageProvider3, ej0Var2), ej0Var2.d(), ej0Var2.g(), ej0Var2.a()) : null;
        jt a5 = this.f23590c.a(mw0Var);
        this.f23592e.getClass();
        if (gpVar != null && (b4 = gpVar.b()) != null) {
            int ordinal = b4.ordinal();
            if (ordinal == 0) {
                aVar = ot.a.f30193b;
            } else {
                if (ordinal != 1) {
                    throw new W1.m();
                }
                aVar = ot.a.f30194c;
            }
            otVar = new ot(aVar, gpVar.a());
        }
        this.f23591d.getClass();
        return new ct(a5, etVar2, etVar3, etVar, otVar, str, str2, str3, str4, str5, n71.a(str6), str7, str8, str9, str10, z4);
    }

    public b41(@NotNull zi0 imageProvider, @NotNull q51 imageCreator, @NotNull c61 mediaCreator, @NotNull n71 assetRatingProvider, @NotNull v71 closeButtonCreator) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imageCreator, "imageCreator");
        Intrinsics.checkNotNullParameter(mediaCreator, "mediaCreator");
        Intrinsics.checkNotNullParameter(assetRatingProvider, "assetRatingProvider");
        Intrinsics.checkNotNullParameter(closeButtonCreator, "closeButtonCreator");
        this.f23588a = imageProvider;
        this.f23589b = imageCreator;
        this.f23590c = mediaCreator;
        this.f23591d = assetRatingProvider;
        this.f23592e = closeButtonCreator;
    }
}
