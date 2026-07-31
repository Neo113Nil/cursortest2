package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f15082a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f15083b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f15084c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f15085d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f15086e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final JSONObject f15087f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<String, JSONObject> f15088g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f15089h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f15090i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15091j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private ao f15092k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final W1.h f15093l;

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function0<NetworkSettings> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String j4 = ao.this.j();
            String l4 = ao.this.l();
            String h4 = ao.this.h();
            String k4 = ao.this.k();
            JSONObject c4 = ao.this.c();
            ao aoVar = ao.this.f15092k;
            JSONObject mergeJsons = IronSourceUtils.mergeJsons(c4, aoVar != null ? aoVar.c() : null);
            JSONObject m4 = ao.this.m();
            ao aoVar2 = ao.this.f15092k;
            JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(m4, aoVar2 != null ? aoVar2.m() : null);
            JSONObject e4 = ao.this.e();
            ao aoVar3 = ao.this.f15092k;
            JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(e4, aoVar3 != null ? aoVar3.e() : null);
            JSONObject d4 = ao.this.d();
            ao aoVar4 = ao.this.f15092k;
            JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(d4, aoVar4 != null ? aoVar4.d() : null);
            JSONObject g4 = ao.this.g();
            ao aoVar5 = ao.this.f15092k;
            NetworkSettings networkSettings = new NetworkSettings(j4, l4, h4, k4, mergeJsons, mergeJsons2, mergeJsons3, mergeJsons4, IronSourceUtils.mergeJsons(g4, aoVar5 != null ? aoVar5.g() : null));
            networkSettings.setIsMultipleInstances(ao.this.o());
            networkSettings.setSubProviderId(ao.this.n());
            networkSettings.setAdSourceNameForEvents(ao.this.b());
            return networkSettings;
        }
    }

    public ao(@NotNull String providerName, @NotNull JSONObject networkSettings) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.f15082a = providerName;
        this.f15083b = providerName;
        String optString = networkSettings.optString(bo.f15635d, providerName);
        Intrinsics.checkNotNullExpressionValue(optString, "networkSettings.optStrin…,\n          providerName)");
        this.f15084c = optString;
        String optString2 = networkSettings.optString(bo.f15636e, optString);
        Intrinsics.checkNotNullExpressionValue(optString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f15085d = optString2;
        Object opt = networkSettings.opt(bo.f15637f);
        this.f15086e = opt instanceof String ? (String) opt : null;
        this.f15087f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LevelPlay.AdFormat adFormat : values) {
            arrayList.add(wt.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) obj;
            JSONObject optJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, optJSONObject2);
        }
        this.f15088g = linkedHashMap;
        String optString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(optString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f15089h = optString3;
        String optString4 = networkSettings.optString(bo.f15632a);
        Intrinsics.checkNotNullExpressionValue(optString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f15090i = optString4;
        this.f15091j = networkSettings.optBoolean(bo.f15634c, false);
        this.f15093l = W1.i.b(new a());
    }

    @NotNull
    public final String b() {
        return this.f15090i;
    }

    @Nullable
    public final JSONObject c() {
        return this.f15087f;
    }

    @NotNull
    public final JSONObject d() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f15088g.get("banner"), this.f15087f);
        Intrinsics.checkNotNullExpressionValue(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    @NotNull
    public final JSONObject e() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f15088g.get("interstitial"), this.f15087f);
        Intrinsics.checkNotNullExpressionValue(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    @NotNull
    public final NetworkSettings f() {
        return (NetworkSettings) this.f15093l.getValue();
    }

    @NotNull
    public final JSONObject g() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f15088g.get("nativeAd"), this.f15087f);
        Intrinsics.checkNotNullExpressionValue(mergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return mergeJsons;
    }

    @NotNull
    public final String h() {
        return this.f15085d;
    }

    @NotNull
    public final String i() {
        return this.f15083b;
    }

    @NotNull
    public final String j() {
        return this.f15082a;
    }

    @Nullable
    public final String k() {
        return this.f15086e;
    }

    @NotNull
    public final String l() {
        return this.f15084c;
    }

    @NotNull
    public final JSONObject m() {
        JSONObject mergeJsons = IronSourceUtils.mergeJsons(this.f15088g.get("rewarded"), this.f15087f);
        Intrinsics.checkNotNullExpressionValue(mergeJsons, "mergeJsons(\n            …     applicationSettings)");
        return mergeJsons;
    }

    @NotNull
    public final String n() {
        return this.f15089h;
    }

    public final boolean o() {
        return this.f15091j;
    }

    @NotNull
    public final Map<String, JSONObject> a() {
        return this.f15088g;
    }

    public final void b(@Nullable ao aoVar) {
        this.f15092k = aoVar;
    }
}
