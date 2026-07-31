package com.yandex.mobile.ads.impl;

import D2.AbstractC0348a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import z2.AbstractC3551a;

/* renamed from: com.yandex.mobile.ads.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2190qk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final AbstractC0348a f30826a = dq0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30827b = 0;

    @Nullable
    public static C2144ok a(@NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Set<String> a4 = localStorage.a("BiddingSettingsAdUnitIdsSet", kotlin.collections.T.e());
        if (a4 == null) {
            a4 = kotlin.collections.T.e();
        }
        Set<String> a5 = localStorage.a("MediationPrefetchSettingsAdUnitIdsSet", kotlin.collections.T.e());
        if (a5 == null) {
            a5 = kotlin.collections.T.e();
        }
        C2167pk c2167pk = new C2167pk();
        ArrayList arrayList = new ArrayList(a4.size());
        Iterator<String> it = a4.iterator();
        while (it.hasNext()) {
            String d4 = localStorage.d(a(it.next()));
            if (d4 != null && d4.length() != 0) {
                try {
                    C2063l9 a6 = c2167pk.a(new JSONObject(d4));
                    if (a6 != null) {
                        arrayList.add(a6);
                    }
                } catch (JSONException unused) {
                    ap0.b(new Object[0]);
                }
            }
        }
        long b4 = localStorage.b("MediationPrefetchLoadTimeoutMillis");
        ArrayList arrayList2 = new ArrayList(a5.size());
        Iterator<String> it2 = a5.iterator();
        while (it2.hasNext()) {
            String d5 = localStorage.d(b(it2.next()));
            if (d5 != null) {
                AbstractC0348a abstractC0348a = f30826a;
                abstractC0348a.a();
                qz0 qz0Var = (qz0) abstractC0348a.c(AbstractC3551a.t(qz0.Companion.serializer()), d5);
                if (qz0Var != null) {
                    arrayList2.add(qz0Var);
                }
            }
        }
        tz0 tz0Var = new tz0(b4, arrayList2);
        if (arrayList.isEmpty() && a5.isEmpty()) {
            return null;
        }
        return new C2144ok(arrayList, tz0Var);
    }

    private static String b(String str) {
        return "MediationPrefetchSettingsAdUnitIdsInfo_" + str;
    }

    public static void b(@NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Set<String> a4 = localStorage.a("BiddingSettingsAdUnitIdsSet", kotlin.collections.T.e());
        if (a4 == null) {
            a4 = kotlin.collections.T.e();
        }
        Set<String> a5 = localStorage.a("MediationPrefetchSettingsAdUnitIdsSet", kotlin.collections.T.e());
        if (a5 == null) {
            a5 = kotlin.collections.T.e();
        }
        Iterator<String> it = a4.iterator();
        while (it.hasNext()) {
            localStorage.a(a(it.next()));
        }
        Iterator<String> it2 = a5.iterator();
        while (it2.hasNext()) {
            localStorage.a(b(it2.next()));
        }
        localStorage.a("BiddingSettingsAdUnitIdsSet");
        localStorage.a("MediationPrefetchSettingsAdUnitIdsSet");
    }

    private static String a(String str) {
        return "BiddingSettingsAdUnitIdsInfo_" + str;
    }

    public static void a(@NotNull xr0 localStorage, @NotNull C2144ok biddingSettings) {
        List<qz0> emptyList;
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(biddingSettings, "biddingSettings");
        List<C2063l9> c4 = biddingSettings.c();
        HashSet hashSet = new HashSet(c4.size());
        for (C2063l9 c2063l9 : c4) {
            String c5 = c2063l9.c();
            String d4 = c2063l9.d();
            hashSet.add(c5);
            localStorage.a(a(c5), d4);
        }
        Set<String> a4 = localStorage.a("BiddingSettingsAdUnitIdsSet", kotlin.collections.T.e());
        if (a4 == null) {
            a4 = kotlin.collections.T.e();
        }
        for (String str : a4) {
            if (!hashSet.contains(str)) {
                localStorage.a(a(str));
            }
        }
        localStorage.a("BiddingSettingsAdUnitIdsSet", hashSet);
        tz0 d5 = biddingSettings.d();
        long d6 = d5 != null ? d5.d() : 0L;
        if (d5 == null || (emptyList = d5.e()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        HashSet hashSet2 = new HashSet(emptyList.size());
        for (qz0 qz0Var : emptyList) {
            hashSet2.add(qz0Var.d());
            String b4 = b(qz0Var.d());
            AbstractC0348a abstractC0348a = f30826a;
            abstractC0348a.a();
            localStorage.a(b4, abstractC0348a.b(qz0.Companion.serializer(), qz0Var));
        }
        Set<String> a5 = localStorage.a("MediationPrefetchSettingsAdUnitIdsSet", kotlin.collections.T.e());
        if (a5 == null) {
            a5 = kotlin.collections.T.e();
        }
        for (String str2 : a5) {
            if (!hashSet2.contains(str2)) {
                localStorage.a(b(str2));
            }
        }
        localStorage.a("MediationPrefetchSettingsAdUnitIdsSet", hashSet2);
        localStorage.a("MediationPrefetchLoadTimeoutMillis", d6);
    }
}
