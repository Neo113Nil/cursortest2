package com.ironsource;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1563t {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final c f19657d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f19658e = "capping";

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f19659f = "pacing";

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f19660g = "delivery";

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f19661h = "progressiveLoadingConfig";

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f19662i = "expiredDurationInMinutes";

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f19663j = "reward";

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f19664k = "name";

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f19665l = "amount";

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f19666m = "virtualItemName";

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f19667n = "virtualItemCount";

    /* renamed from: o, reason: collision with root package name */
    public static final long f19668o = 60;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, d> f19669a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f19670b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, d> f19671c;

    @Metadata
    /* renamed from: com.ironsource.t$a */
    static final class a extends kotlin.jvm.internal.s implements Function1<JSONObject, d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19672a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.t$b */
    static final class b extends kotlin.jvm.internal.s implements Function1<JSONObject, d> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19673a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.t$c */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.t$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final h8 f19674a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final dp f19675b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private final oa f19676c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private final Long f19677d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private final hq f19678e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private final hq f19679f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private final xp f19680g;

        public d(@NotNull JSONObject features) {
            h8 h8Var;
            dp dpVar;
            Intrinsics.checkNotNullParameter(features, "features");
            xp xpVar = null;
            if (features.has(C1563t.f19658e)) {
                JSONObject jSONObject = features.getJSONObject(C1563t.f19658e);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                h8Var = new h8(jSONObject);
            } else {
                h8Var = null;
            }
            this.f19674a = h8Var;
            if (features.has(C1563t.f19659f)) {
                JSONObject jSONObject2 = features.getJSONObject(C1563t.f19659f);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                dpVar = new dp(jSONObject2);
            } else {
                dpVar = null;
            }
            this.f19675b = dpVar;
            this.f19676c = features.has(C1563t.f19660g) ? new oa(features.getBoolean(C1563t.f19660g)) : null;
            this.f19677d = features.has(C1563t.f19662i) ? Long.valueOf(features.getLong(C1563t.f19662i)) : null;
            JSONObject optJSONObject = features.optJSONObject(C1563t.f19663j);
            this.f19678e = optJSONObject != null ? new hq(optJSONObject, "name", "amount") : null;
            hq hqVar = new hq(features, C1563t.f19666m, C1563t.f19667n);
            String b4 = hqVar.b();
            this.f19679f = (b4 == null || b4.length() == 0 || hqVar.a() == null) ? null : hqVar;
            if (features.has(C1563t.f19661h)) {
                JSONObject jSONObject3 = features.getJSONObject(C1563t.f19661h);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                xpVar = new xp(jSONObject3);
            }
            this.f19680g = xpVar;
        }

        @Nullable
        public final hq a() {
            return this.f19678e;
        }

        @Nullable
        public final h8 b() {
            return this.f19674a;
        }

        @Nullable
        public final oa c() {
            return this.f19676c;
        }

        @Nullable
        public final Long d() {
            return this.f19677d;
        }

        @Nullable
        public final dp e() {
            return this.f19675b;
        }

        @Nullable
        public final hq f() {
            return this.f19679f;
        }

        @Nullable
        public final xp g() {
            return this.f19680g;
        }
    }

    public C1563t(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f19669a = new tp(configurations).a(b.f19673a);
        this.f19670b = new d(configurations);
        this.f19671c = new C1597y2(configurations).a(a.f19672a);
    }

    @NotNull
    public final Map<String, d> a() {
        return this.f19671c;
    }

    @NotNull
    public final d b() {
        return this.f19670b;
    }

    @NotNull
    public final Map<String, d> c() {
        return this.f19669a;
    }
}
