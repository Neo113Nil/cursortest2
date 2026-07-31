package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nr0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f29742a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f29743b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2252te f29744c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final w01 f29745d;

    public /* synthetic */ nr0(Context context, C2286v2 c2286v2) {
        this(context, c2286v2, new C2252te(), w01.f33856e.a());
    }

    private final List<C1866d3> a() {
        C1866d3 a4;
        C1866d3 a5;
        try {
            this.f29744c.a();
            a4 = null;
        } catch (jo0 e4) {
            int i4 = C1942g7.f26017A;
            a4 = C1942g7.a(e4.getMessage(), e4.a());
        }
        try {
            this.f29745d.a(this.f29742a);
            a5 = null;
        } catch (jo0 e5) {
            int i5 = C1942g7.f26017A;
            a5 = C1942g7.a(e5.getMessage(), e5.a());
        }
        return CollectionsKt.listOfNotNull((Object[]) new C1866d3[]{a4, a5, this.f29743b.c() == null ? C1942g7.f() : null, this.f29743b.a() == null ? C1942g7.t() : null});
    }

    @Nullable
    public final C1866d3 b() {
        List plus = CollectionsKt.plus((Collection) a(), (Iterable) CollectionsKt.listOfNotNull(this.f29743b.q() == null ? C1942g7.e() : null));
        String b4 = this.f29743b.b().b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1866d3) it.next()).d());
        }
        C1962h3.a(b4, arrayList);
        return (C1866d3) CollectionsKt.firstOrNull(plus);
    }

    @Nullable
    public final C1866d3 c() {
        return (C1866d3) CollectionsKt.firstOrNull((List) a());
    }

    public nr0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2252te appMetricaIntegrationValidator, @NotNull w01 mobileAdsIntegrationValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(appMetricaIntegrationValidator, "appMetricaIntegrationValidator");
        Intrinsics.checkNotNullParameter(mobileAdsIntegrationValidator, "mobileAdsIntegrationValidator");
        this.f29742a = context;
        this.f29743b = adConfiguration;
        this.f29744c = appMetricaIntegrationValidator;
        this.f29745d = mobileAdsIntegrationValidator;
    }
}
