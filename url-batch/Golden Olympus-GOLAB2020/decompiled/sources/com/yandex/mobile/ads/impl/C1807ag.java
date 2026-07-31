package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1807ag {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f23271a;

    public C1807ag(@NotNull mo clickListenerFactory, @NotNull List<? extends C2276uf<?>> assets, @NotNull C2149p2 adClickHandler, @NotNull v61 viewAdapter, @NotNull qo1 renderedTimer, @NotNull xj0 impressionEventsObservable, @Nullable dr0 dr0Var) {
        dr0 dr0Var2;
        C2149p2 c2149p2;
        v61 v61Var;
        qo1 qo1Var;
        xj0 xj0Var;
        mo moVar;
        Intrinsics.checkNotNullParameter(clickListenerFactory, "clickListenerFactory");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(adClickHandler, "adClickHandler");
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(assets, 10)), 16));
        for (C2276uf<?> c2276uf : assets) {
            String b4 = c2276uf.b();
            dr0 a4 = c2276uf.a();
            if (a4 == null) {
                dr0Var2 = dr0Var;
                moVar = clickListenerFactory;
                c2149p2 = adClickHandler;
                v61Var = viewAdapter;
                qo1Var = renderedTimer;
                xj0Var = impressionEventsObservable;
            } else {
                dr0Var2 = a4;
                c2149p2 = adClickHandler;
                v61Var = viewAdapter;
                qo1Var = renderedTimer;
                xj0Var = impressionEventsObservable;
                moVar = clickListenerFactory;
            }
            Pair pair = TuplesKt.to(b4, moVar.a(c2276uf, dr0Var2, c2149p2, v61Var, qo1Var, xj0Var));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.f23271a = linkedHashMap;
    }

    public final void a(@NotNull View view, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        View.OnClickListener onClickListener = (View.OnClickListener) this.f23271a.get(assetName);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
