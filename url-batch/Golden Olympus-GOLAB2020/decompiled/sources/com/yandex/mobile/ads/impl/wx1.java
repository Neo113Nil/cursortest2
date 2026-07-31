package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wx1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f34251a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final m71 f34252b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mp1 f34253c;

    public wx1(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @Nullable m71 m71Var, @NotNull mp1 metricaReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        this.f34251a = adResponse;
        this.f34252b = m71Var;
        this.f34253c = metricaReporter;
    }

    public final void a(@NotNull List<n02> socialActionItems) {
        Intrinsics.checkNotNullParameter(socialActionItems, "socialActionItems");
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(ip1.a.f27312a, com.ironsource.ge.f16389B1);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(socialActionItems, 10));
        Iterator<T> it = socialActionItems.iterator();
        while (it.hasNext()) {
            arrayList.add(((n02) it.next()).b());
        }
        jp1Var.b((String[]) arrayList.toArray(new String[0]), "social_actions");
        m71 m71Var = this.f34252b;
        if (m71Var != null) {
            jp1Var = kp1.a(jp1Var, m71Var.a());
        }
        jp1Var.a(this.f34251a.a());
        ip1.b bVar = ip1.b.f27319G;
        Map<String, Object> b4 = jp1Var.b();
        this.f34253c.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(jp1Var, bVar, "reportType", b4, "reportData")));
    }
}
