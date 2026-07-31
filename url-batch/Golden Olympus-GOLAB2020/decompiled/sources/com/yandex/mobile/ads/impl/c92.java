package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f24125a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f24126b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f24127c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f24128d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f24129e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f24130f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f24131g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f24132h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f24133i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f24134j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f24135k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f24136l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f24137m;

        /* renamed from: n, reason: collision with root package name */
        public static final a f24138n;

        /* renamed from: o, reason: collision with root package name */
        public static final a f24139o;

        /* renamed from: p, reason: collision with root package name */
        public static final a f24140p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f24141q;

        /* renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ a[] f24142r;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f24143b;

        static {
            a aVar = new a(0, "SUCCESS", "success");
            f24127c = aVar;
            a aVar2 = new a(1, "APPLICATION_INACTIVE", "application_inactive");
            f24128d = aVar2;
            a aVar3 = new a(2, "INCONSISTENT_ASSET_VALUE", "inconsistent_asset_value");
            f24129e = aVar3;
            a aVar4 = new a(3, "NO_AD_VIEW", "no_ad_view");
            f24130f = aVar4;
            a aVar5 = new a(4, "NO_VISIBLE_ADS", "no_visible_ads");
            f24131g = aVar5;
            a aVar6 = new a(5, "NO_VISIBLE_SPONSORED_ASSET", "no_visible_sponsored_asset");
            f24132h = aVar6;
            a aVar7 = new a(6, "NO_VISIBLE_REQUIRED_ASSETS", "no_visible_required_assets");
            f24133i = aVar7;
            a aVar8 = new a(7, "NOT_ADDED_TO_HIERARCHY", "not_added_to_hierarchy");
            f24134j = aVar8;
            a aVar9 = new a(8, "NOT_VISIBLE_FOR_PERCENT", "not_visible_for_percent");
            f24135k = aVar9;
            a aVar10 = new a(9, "REQUIRED_ASSET_CAN_NOT_BE_VISIBLE", "required_asset_can_not_be_visible");
            f24136l = aVar10;
            a aVar11 = new a(10, "REQUIRED_ASSET_IS_NOT_SUBVIEW", "required_asset_is_not_subview");
            f24137m = aVar11;
            a aVar12 = new a(11, "SUPERVIEW_NULL", "superview_null");
            f24138n = aVar12;
            a aVar13 = new a(12, "SUPERVIEW_HIDDEN", "superview_hidden");
            f24139o = aVar13;
            a aVar14 = new a(13, "TOO_SMALL", "too_small");
            f24140p = aVar14;
            a aVar15 = new a(14, "VISIBLE_AREA_TOO_SMALL", "visible_area_too_small");
            f24141q = aVar15;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15};
            f24142r = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str, String str2) {
            this.f24143b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24142r.clone();
        }

        @NotNull
        public final String a() {
            return this.f24143b;
        }
    }

    public c92(@NotNull a status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f24125a = status;
        this.f24126b = str;
    }

    public static c92 a(c92 c92Var) {
        a status = a.f24131g;
        String str = c92Var.f24126b;
        Intrinsics.checkNotNullParameter(status, "status");
        return new c92(status, str);
    }

    @NotNull
    public final a b() {
        return this.f24125a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c92)) {
            return false;
        }
        c92 c92Var = (c92) obj;
        return this.f24125a == c92Var.f24125a && Intrinsics.areEqual(this.f24126b, c92Var.f24126b);
    }

    public final int hashCode() {
        int hashCode = this.f24125a.hashCode() * 31;
        String str = this.f24126b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ValidationResult(status=" + this.f24125a + ", description=" + this.f24126b + ")";
    }

    @Nullable
    public final String a() {
        return this.f24126b;
    }
}
