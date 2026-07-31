package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.sdk.controller.InterfaceC1562f;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1524o0 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f18439f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f18440g = "0";

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f18441h = "0";

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f18442i = "0";

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f18443j = "0";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final sj f18444a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private jg f18445b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f18446c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private EnumC1518n1 f18447d;

    /* renamed from: e, reason: collision with root package name */
    private double f18448e;

    @Metadata
    /* renamed from: com.ironsource.o0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1524o0(@NotNull sj adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.f18444a = adInstance;
        this.f18445b = jg.UnknownProvider;
        this.f18446c = "0";
        this.f18447d = EnumC1518n1.LOAD_REQUEST;
        this.f18448e = new Date().getTime() / 1000.0d;
    }

    public static /* synthetic */ C1524o0 a(C1524o0 c1524o0, sj sjVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            sjVar = c1524o0.f18444a;
        }
        return c1524o0.a(sjVar);
    }

    @NotNull
    public final IronSource.AD_UNIT b() {
        return this.f18444a.i() ? IronSource.AD_UNIT.BANNER : this.f18444a.n() ? IronSource.AD_UNIT.REWARDED_VIDEO : IronSource.AD_UNIT.INTERSTITIAL;
    }

    @NotNull
    public final String c() {
        String e4 = this.f18444a.e();
        Intrinsics.checkNotNullExpressionValue(e4, "adInstance.id");
        return e4;
    }

    @NotNull
    public final sj d() {
        return this.f18444a;
    }

    @NotNull
    public final jg e() {
        return this.f18445b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1524o0)) {
            return false;
        }
        C1524o0 c1524o0 = (C1524o0) obj;
        return Intrinsics.areEqual(c(), c1524o0.c()) && Intrinsics.areEqual(g(), c1524o0.g()) && b() == c1524o0.b() && Intrinsics.areEqual(i(), c1524o0.i()) && this.f18445b == c1524o0.f18445b && Intrinsics.areEqual(this.f18446c, c1524o0.f18446c) && this.f18447d == c1524o0.f18447d;
    }

    @NotNull
    public final EnumC1518n1 f() {
        return this.f18447d;
    }

    @NotNull
    public final String g() {
        String c4 = this.f18444a.c();
        return c4 == null ? "0" : c4;
    }

    @NotNull
    public final String h() {
        return this.f18446c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.f18445b, this.f18446c, this.f18447d, Double.valueOf(this.f18448e));
    }

    @NotNull
    public final String i() {
        String g4 = this.f18444a.g();
        Intrinsics.checkNotNullExpressionValue(g4, "adInstance.name");
        return g4;
    }

    public final double j() {
        return this.f18448e;
    }

    @NotNull
    public String toString() {
        String jSONObject = new JSONObject().put(InterfaceC1562f.b.f19238c, c()).put("advertiserBundleId", this.f18446c).put("adProvider", this.f18445b.ordinal()).put("adStatus", this.f18447d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f18448e).put("adUnitId", g()).put(ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, b().toString()).put("instanceId", i()).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return jSONObject;
    }

    @NotNull
    public final C1524o0 a(@NotNull sj adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new C1524o0(adInstance);
    }

    @NotNull
    public final sj a() {
        return this.f18444a;
    }

    public final void a(double d4) {
        this.f18448e = d4;
    }

    public final void a(@NotNull jg jgVar) {
        Intrinsics.checkNotNullParameter(jgVar, "<set-?>");
        this.f18445b = jgVar;
    }

    public final void a(@NotNull EnumC1518n1 enumC1518n1) {
        Intrinsics.checkNotNullParameter(enumC1518n1, "<set-?>");
        this.f18447d = enumC1518n1;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f18446c = str;
    }
}
