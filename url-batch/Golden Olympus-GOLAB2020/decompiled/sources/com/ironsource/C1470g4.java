package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1470g4 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16332a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16333b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16334c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16335d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f16336e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f16337f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16338g;

    /* renamed from: h, reason: collision with root package name */
    private final int f16339h;

    /* renamed from: i, reason: collision with root package name */
    private final int f16340i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<Integer> f16341j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<Integer> f16342k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final List<Integer> f16343l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<Integer> f16344m;

    public C1470g4(@NotNull JSONObject applicationEvents) {
        Intrinsics.checkNotNullParameter(applicationEvents, "applicationEvents");
        this.f16332a = applicationEvents.optBoolean(C1484i4.f16658a, false);
        this.f16333b = applicationEvents.optBoolean(C1484i4.f16659b, false);
        this.f16334c = applicationEvents.optBoolean(C1484i4.f16660c, false);
        this.f16335d = applicationEvents.optInt(C1484i4.f16661d, -1);
        String optString = applicationEvents.optString(C1484i4.f16662e);
        Intrinsics.checkNotNullExpressionValue(optString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f16336e = optString;
        String optString2 = applicationEvents.optString(C1484i4.f16663f);
        Intrinsics.checkNotNullExpressionValue(optString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f16337f = optString2;
        this.f16338g = applicationEvents.optInt(C1484i4.f16664g, -1);
        this.f16339h = applicationEvents.optInt(C1484i4.f16665h, -1);
        this.f16340i = applicationEvents.optInt(C1484i4.f16666i, 5000);
        this.f16341j = a(applicationEvents, C1484i4.f16667j);
        this.f16342k = a(applicationEvents, C1484i4.f16668k);
        this.f16343l = a(applicationEvents, C1484i4.f16669l);
        this.f16344m = a(applicationEvents, C1484i4.f16670m);
    }

    public final int a() {
        return this.f16338g;
    }

    public final boolean b() {
        return this.f16334c;
    }

    public final int c() {
        return this.f16335d;
    }

    @NotNull
    public final String d() {
        return this.f16337f;
    }

    public final int e() {
        return this.f16340i;
    }

    public final int f() {
        return this.f16339h;
    }

    @NotNull
    public final List<Integer> g() {
        return this.f16344m;
    }

    @NotNull
    public final List<Integer> h() {
        return this.f16342k;
    }

    @NotNull
    public final List<Integer> i() {
        return this.f16341j;
    }

    public final boolean j() {
        return this.f16333b;
    }

    public final boolean k() {
        return this.f16332a;
    }

    @NotNull
    public final String l() {
        return this.f16336e;
    }

    @NotNull
    public final List<Integer> m() {
        return this.f16343l;
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return CollectionsKt.emptyList();
        }
        IntRange p4 = kotlin.ranges.g.p(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(p4, 10));
        Iterator it = p4.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(optJSONArray.getInt(((kotlin.collections.E) it).a())));
        }
        return arrayList;
    }
}
