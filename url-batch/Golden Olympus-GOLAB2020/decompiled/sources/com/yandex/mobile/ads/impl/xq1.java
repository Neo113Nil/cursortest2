package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xq1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dr1 f34664a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q61 f34665b;

    public /* synthetic */ xq1() {
        this(new dr1(), new q61());
    }

    @NotNull
    public final jp1 a(@Nullable C2360y7 c2360y7, @NotNull C2286v2 adConfiguration, @Nullable n61 responseBody) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = a(c2360y7, adConfiguration);
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        if (responseBody != null) {
            List<String> a5 = this.f34665b.a(responseBody);
            if (!a5.isEmpty()) {
                jp1Var.a(a5, "image_sizes");
            }
            this.f34665b.getClass();
            Intrinsics.checkNotNullParameter(responseBody, "responseBody");
            List<u31> e4 = responseBody.e();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(e4, 10));
            Iterator<T> it = e4.iterator();
            while (it.hasNext()) {
                arrayList.add(((u31) it.next()).g().a());
            }
            if (!arrayList.isEmpty()) {
                jp1Var.a(arrayList, "native_ad_types");
            }
            this.f34665b.getClass();
            Intrinsics.checkNotNullParameter(responseBody, "responseBody");
            List<u31> e5 = responseBody.e();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = e5.iterator();
            while (it2.hasNext()) {
                String a6 = ((u31) it2.next()).a();
                if (a6 != null) {
                    arrayList2.add(a6);
                }
            }
            if (!arrayList2.isEmpty()) {
                jp1Var.a(arrayList2, "ad_ids");
            }
        }
        return kp1.a(a4, jp1Var);
    }

    @NotNull
    public final jp1 b(@Nullable C2360y7<?> c2360y7, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = a(c2360y7, adConfiguration);
        a4.b(c2360y7 != null ? c2360y7.d() : null, "ad_id");
        return a4;
    }

    public xq1(@NotNull dr1 responseTypeProvider, @NotNull q61 nativeAdResponseDataProvider) {
        Intrinsics.checkNotNullParameter(responseTypeProvider, "responseTypeProvider");
        Intrinsics.checkNotNullParameter(nativeAdResponseDataProvider, "nativeAdResponseDataProvider");
        this.f34664a = responseTypeProvider;
        this.f34665b = nativeAdResponseDataProvider;
    }

    @NotNull
    public final jp1 a(@Nullable C2360y7<?> c2360y7, @Nullable n61 n61Var, @NotNull C2286v2 adConfiguration, @NotNull u31 u31Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(u31Var, "native");
        jp1 a4 = a(c2360y7, adConfiguration);
        if (n61Var != null) {
            List<String> a5 = this.f34665b.a(n61Var);
            if (!a5.isEmpty()) {
                a4.a(a5, "image_sizes");
            }
        }
        a4.b(u31Var.a(), "ad_id");
        return a4;
    }

    private final jp1 a(C2360y7<?> c2360y7, C2286v2 c2286v2) {
        String c4;
        String c5;
        String b4;
        String str;
        Map<String, ? extends Object> s4;
        gs n4;
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        if (c2360y7 == null || !c2360y7.P()) {
            jp1Var.b(c2360y7 != null ? c2360y7.o() : null, "ad_type_format");
            jp1Var.b(c2360y7 != null ? c2360y7.H() : null, "product_type");
        }
        if (c2360y7 == null || (c4 = c2360y7.p()) == null) {
            c4 = c2286v2.c();
        }
        jp1Var.b(c4, "block_id");
        if (c2360y7 == null || (c5 = c2360y7.p()) == null) {
            c5 = c2286v2.c();
        }
        jp1Var.b(c5, "ad_unit_id");
        jp1Var.b(c2360y7 != null ? c2360y7.m() : null, FirebaseAnalytics.Param.AD_SOURCE);
        if (c2360y7 == null || (n4 = c2360y7.n()) == null || (b4 = n4.b()) == null) {
            b4 = c2286v2.b().b();
        }
        jp1Var.b(b4, AdRevenueScheme.AD_TYPE);
        jp1Var.a(c2360y7 != null ? c2360y7.w() : null, "design");
        jp1Var.a(c2360y7 != null ? c2360y7.b() : null);
        jp1Var.a(c2360y7 != null ? c2360y7.L() : null, "server_log_id");
        this.f34664a.getClass();
        if ((c2360y7 != null ? c2360y7.D() : null) != null) {
            str = "mediation";
        } else {
            if ((c2360y7 != null ? c2360y7.I() : null) != null) {
                str = "ad";
            } else {
                str = "empty";
            }
        }
        jp1Var.b(str, "response_type");
        if (c2360y7 != null && (s4 = c2360y7.s()) != null) {
            jp1Var.a(s4);
        }
        jp1Var.a(c2360y7 != null ? c2360y7.a() : null);
        return jp1Var;
    }
}
