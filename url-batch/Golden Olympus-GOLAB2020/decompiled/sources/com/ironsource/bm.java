package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class bm {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f15627c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f15628d = "revenue";

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f15629e = "precision";

    /* renamed from: a, reason: collision with root package name */
    private final double f15630a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f15631b;

    @Metadata
    public static final class a {
        private a() {
        }

        @Nullable
        public final bm a(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d4 = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new bm(d4, precision);
            } catch (Exception e4) {
                o9.d().a(e4);
                wt.a(e4);
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public bm(double d4, @NotNull String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.f15630a = d4;
        this.f15631b = precision;
    }

    public final double a() {
        return this.f15630a;
    }

    @NotNull
    public final String b() {
        return this.f15631b;
    }

    @NotNull
    public final String c() {
        return this.f15631b;
    }

    public final double d() {
        return this.f15630a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return Double.compare(this.f15630a, bmVar.f15630a) == 0 && Intrinsics.areEqual(this.f15631b, bmVar.f15631b);
    }

    public int hashCode() {
        return (Double.hashCode(this.f15630a) * 31) + this.f15631b.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadArmData(revenue=" + this.f15630a + ", precision=" + this.f15631b + ')';
    }

    @NotNull
    public final bm a(double d4, @NotNull String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new bm(d4, precision);
    }

    public static /* synthetic */ bm a(bm bmVar, double d4, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            d4 = bmVar.f15630a;
        }
        if ((i4 & 2) != 0) {
            str = bmVar.f15631b;
        }
        return bmVar.a(d4, str);
    }

    @Nullable
    public static final bm a(@NotNull JSONObject jSONObject) {
        return f15627c.a(jSONObject);
    }
}
