package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class t8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1563t f19733a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1563t f19734b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final t6 f19735c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final tm f19736d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1604z3 f19737e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, C1563t> f19738f;

    public t8(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        C1563t c1563t = new C1563t(a(configurations, "rewarded"));
        this.f19733a = c1563t;
        C1563t c1563t2 = new C1563t(a(configurations, "interstitial"));
        this.f19734b = c1563t2;
        this.f19735c = new t6(a(configurations, "banner"));
        this.f19736d = new tm(a(configurations, "nativeAd"));
        JSONObject optJSONObject = configurations.optJSONObject("application");
        this.f19737e = new C1604z3(optJSONObject == null ? new JSONObject() : optJSONObject);
        this.f19738f = MapsKt.mapOf(TuplesKt.to(LevelPlay.AdFormat.INTERSTITIAL, c1563t2), TuplesKt.to(LevelPlay.AdFormat.REWARDED, c1563t));
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C1563t> a() {
        return this.f19738f;
    }

    @NotNull
    public final C1604z3 b() {
        return this.f19737e;
    }

    @NotNull
    public final t6 c() {
        return this.f19735c;
    }

    @NotNull
    public final tm d() {
        return this.f19736d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? new JSONObject() : optJSONObject2;
    }
}
