package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f19723a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, b> f19724b;

    @Metadata
    static final class a extends kotlin.jvm.internal.s implements Function1<JSONObject, b> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19725a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new b(it);
        }
    }

    @Metadata
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final Boolean f19726a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final JSONObject f19727b;

        /* renamed from: c, reason: collision with root package name */
        private final int f19728c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f19729d;

        /* renamed from: e, reason: collision with root package name */
        private final float f19730e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final List<String> f19731f;

        public b(@NotNull JSONObject features) {
            Intrinsics.checkNotNullParameter(features, "features");
            JSONObject jSONObject = features.has("isLoadWhileShow") ? features : null;
            Boolean valueOf = jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("isLoadWhileShow")) : null;
            this.f19726a = valueOf;
            JSONObject jSONObject2 = features.has(v6.f19998c) ? features : null;
            JSONObject optJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject(v6.f19998c) : null;
            this.f19727b = optJSONObject;
            Boolean bool = Boolean.TRUE;
            int i4 = 25;
            boolean z4 = true;
            if (!Intrinsics.areEqual(valueOf, bool)) {
                i4 = features.optInt(v6.f19996a, 25);
            } else if (optJSONObject != null && optJSONObject.optBoolean("enabled")) {
                int optInt = optJSONObject.optInt(v6.f19999d, 25000);
                i4 = optInt == 0 ? 0 : optInt / 1000;
            }
            this.f19728c = i4;
            if (!Intrinsics.areEqual(valueOf, bool)) {
                z4 = features.optBoolean(v6.f19996a, true);
            } else if (optJSONObject != null) {
                z4 = optJSONObject.optBoolean("enabled", true);
            }
            this.f19729d = z4;
            this.f19730e = features.has(v6.f20002g) ? features.optInt(v6.f20002g) / 100.0f : 0.15f;
            List<String> b4 = features.has(v6.f20003h) ? nk.b(features.getJSONArray(v6.f20003h)) : CollectionsKt.listOf((Object[]) new String[]{com.ironsource.mediationsdk.l.f17627a, com.ironsource.mediationsdk.l.f17630d});
            Intrinsics.checkNotNullExpressionValue(b4, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f19731f = b4;
        }

        @NotNull
        public final List<String> a() {
            return this.f19731f;
        }

        public final int b() {
            return this.f19728c;
        }

        public final float c() {
            return this.f19730e;
        }

        public final boolean d() {
            return this.f19729d;
        }

        @Nullable
        public final Boolean e() {
            return this.f19726a;
        }
    }

    public t6(@NotNull JSONObject bannerConfigurations) {
        Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.f19723a = new b(bannerConfigurations);
        this.f19724b = new C1597y2(bannerConfigurations).a(a.f19725a);
    }

    @NotNull
    public final Map<String, b> a() {
        return this.f19724b;
    }

    @NotNull
    public final b b() {
        return this.f19723a;
    }
}
