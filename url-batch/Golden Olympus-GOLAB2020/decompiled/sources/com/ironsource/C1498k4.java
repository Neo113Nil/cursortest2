package com.ironsource;

import com.ironsource.b9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1498k4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f16896a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16897b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f16898c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16899d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16900e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16901f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16902g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f16903h;

    /* renamed from: i, reason: collision with root package name */
    private final int f16904i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f16905j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f16906k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private final JSONObject f16907l;

    public C1498k4(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f16896a = config;
        this.f16897b = config.optBoolean("isExternalArmEventsEnabled", true);
        String optString = config.optString("externalArmEventsUrl", pc.f18627j);
        Intrinsics.checkNotNullExpressionValue(optString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f16898c = optString;
        this.f16899d = config.optBoolean(ge.f16441a1, true);
        this.f16900e = config.optBoolean("radvid", false);
        this.f16901f = config.optInt("uaeh", 0);
        this.f16902g = config.optBoolean("sharedThreadPool", false);
        this.f16903h = config.optBoolean("sharedThreadPoolADP", true);
        this.f16904i = config.optInt(ge.f16420Q0, -1);
        this.f16905j = config.optBoolean("axal", false);
        this.f16906k = config.optBoolean("psrt", false);
        this.f16907l = config.optJSONObject(b9.a.f15289c);
    }

    public static /* synthetic */ C1498k4 a(C1498k4 c1498k4, JSONObject jSONObject, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            jSONObject = c1498k4.f16896a;
        }
        return c1498k4.a(jSONObject);
    }

    public final int b() {
        return this.f16904i;
    }

    @Nullable
    public final JSONObject c() {
        return this.f16907l;
    }

    @NotNull
    public final String d() {
        return this.f16898c;
    }

    public final boolean e() {
        return this.f16906k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1498k4) && Intrinsics.areEqual(this.f16896a, ((C1498k4) obj).f16896a);
    }

    public final boolean f() {
        return this.f16900e;
    }

    public final boolean g() {
        return this.f16899d;
    }

    public final boolean h() {
        return this.f16902g;
    }

    public int hashCode() {
        return this.f16896a.hashCode();
    }

    public final boolean i() {
        return this.f16903h;
    }

    public final int j() {
        return this.f16901f;
    }

    public final boolean k() {
        return this.f16905j;
    }

    public final boolean l() {
        return this.f16897b;
    }

    @NotNull
    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f16896a + ')';
    }

    @NotNull
    public final C1498k4 a(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new C1498k4(config);
    }

    private final JSONObject a() {
        return this.f16896a;
    }
}
