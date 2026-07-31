package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.i5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1485i5 {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f16673h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f16674a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.demandOnly.a f16675b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1513m5 f16676c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final JSONObject f16677d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final JSONObject f16678e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final C1443c5 f16679f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final C1522n5 f16680g;

    @Metadata
    /* renamed from: com.ironsource.i5$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final JSONObject f16681a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f16682b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private final String f16683c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final com.ironsource.mediationsdk.demandOnly.a f16684d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final C1513m5 f16685e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private final JSONObject f16686f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private final JSONObject f16687g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private final C1443c5 f16688h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        private final C1522n5 f16689i;

        public a(@NotNull JSONObject auctionData, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.f16681a = auctionData;
            this.f16682b = instanceId;
            JSONObject a4 = a(auctionData);
            this.f16683c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a a5 = a(auctionData, a4);
            this.f16684d = a5;
            this.f16685e = c(a4);
            this.f16686f = d(a4);
            this.f16687g = b(a4);
            this.f16688h = a(a5, instanceId);
            this.f16689i = b(a5, instanceId);
        }

        private final C1443c5 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C1513m5 a4 = aVar.a(str);
            if (a4 == null) {
                return null;
            }
            C1443c5 c1443c5 = new C1443c5();
            c1443c5.a(a4.b());
            c1443c5.c(a4.h());
            c1443c5.b(a4.g());
            return c1443c5;
        }

        private final C1522n5 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C1513m5 a4 = aVar.a(str);
            if (a4 == null) {
                return null;
            }
            String k4 = a4.k();
            Intrinsics.checkNotNullExpressionValue(k4, "it.serverData");
            return new C1522n5(k4);
        }

        private final C1513m5 c(JSONObject jSONObject) {
            return new C1513m5(jSONObject);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        @NotNull
        public final C1485i5 a() {
            return new C1485i5(this.f16683c, this.f16684d, this.f16685e, this.f16686f, this.f16687g, this.f16688h, this.f16689i);
        }

        @NotNull
        public final JSONObject b() {
            return this.f16681a;
        }

        @NotNull
        public final String c() {
            return this.f16682b;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.f17315d);
            JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.f17319h);
            if (optJSONArray != null) {
                IntRange p4 = kotlin.ranges.g.p(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = p4.iterator();
                while (it.hasNext()) {
                    int a4 = ((kotlin.collections.E) it).a();
                    C1513m5 c1513m5 = new C1513m5(optJSONArray.getJSONObject(a4), a4, optJSONObject);
                    if (!c1513m5.m()) {
                        c1513m5 = null;
                    }
                    if (c1513m5 != null) {
                        arrayList2.add(c1513m5);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C0153a(arrayList);
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.i5$b */
    public static final class b {
        private b() {
        }

        private final Object a(C1485i5 c1485i5, String str) {
            rg rgVar;
            String b4 = c1485i5.b();
            if (b4 == null || b4.length() == 0) {
                Result.Companion companion = Result.Companion;
                rgVar = new rg(wb.f20181a.i());
            } else if (c1485i5.i()) {
                Result.Companion companion2 = Result.Companion;
                rgVar = new rg(wb.f20181a.f());
            } else {
                C1513m5 a4 = c1485i5.a(str);
                if (a4 == null) {
                    Result.Companion companion3 = Result.Companion;
                    rgVar = new rg(wb.f20181a.j());
                } else {
                    String k4 = a4.k();
                    if (k4 != null && k4.length() != 0) {
                        return Result.m243constructorimpl(c1485i5);
                    }
                    Result.Companion companion4 = Result.Companion;
                    rgVar = new rg(wb.f20181a.e());
                }
            }
            return Result.m243constructorimpl(ResultKt.createFailure(rgVar));
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object a(@NotNull JSONObject auctionData, @NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }
    }

    public C1485i5(@Nullable String str, @NotNull com.ironsource.mediationsdk.demandOnly.a waterfall, @NotNull C1513m5 genericNotifications, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable C1443c5 c1443c5, @Nullable C1522n5 c1522n5) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.f16674a = str;
        this.f16675b = waterfall;
        this.f16676c = genericNotifications;
        this.f16677d = jSONObject;
        this.f16678e = jSONObject2;
        this.f16679f = c1443c5;
        this.f16680g = c1522n5;
    }

    private final C1513m5 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }

    @Nullable
    public final String b() {
        return this.f16674a;
    }

    @Nullable
    public final C1443c5 c() {
        return this.f16679f;
    }

    @Nullable
    public final JSONObject d() {
        return this.f16678e;
    }

    @NotNull
    public final C1513m5 e() {
        return this.f16676c;
    }

    @Nullable
    public final JSONObject f() {
        return this.f16677d;
    }

    @Nullable
    public final C1522n5 g() {
        return this.f16680g;
    }

    @NotNull
    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.f16675b;
    }

    public final boolean i() {
        return this.f16675b.isEmpty();
    }

    @Nullable
    public final C1513m5 a(@NotNull String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.f16675b, providerName);
    }

    @Nullable
    public final String a() {
        C1522n5 c1522n5 = this.f16680g;
        if (c1522n5 != null) {
            return c1522n5.d();
        }
        return null;
    }
}
