package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u31 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zq1 f32807a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private List<? extends C2276uf<?>> f32808b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f32809c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f32810d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final dr0 f32811e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final C1795a4 f32812f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final xa0 f32813g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final xa0 f32814h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<String> f32815i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<tx1> f32816j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private final C2157pa f32817k;

    public u31(@NotNull zq1 responseNativeType, @NotNull List<? extends C2276uf<?>> assets, @Nullable String str, @Nullable String str2, @Nullable dr0 dr0Var, @Nullable C1795a4 c1795a4, @Nullable xa0 xa0Var, @Nullable xa0 xa0Var2, @NotNull List<String> renderTrackingUrls, @NotNull List<tx1> showNotices, @Nullable C2157pa c2157pa) {
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        this.f32807a = responseNativeType;
        this.f32808b = assets;
        this.f32809c = str;
        this.f32810d = str2;
        this.f32811e = dr0Var;
        this.f32812f = c1795a4;
        this.f32813g = xa0Var;
        this.f32814h = xa0Var2;
        this.f32815i = renderTrackingUrls;
        this.f32816j = showNotices;
        this.f32817k = c2157pa;
    }

    public static u31 a(u31 u31Var, List assets) {
        zq1 responseNativeType = u31Var.f32807a;
        String str = u31Var.f32809c;
        String str2 = u31Var.f32810d;
        dr0 dr0Var = u31Var.f32811e;
        C1795a4 c1795a4 = u31Var.f32812f;
        xa0 xa0Var = u31Var.f32813g;
        xa0 xa0Var2 = u31Var.f32814h;
        List<String> renderTrackingUrls = u31Var.f32815i;
        List<tx1> showNotices = u31Var.f32816j;
        C2157pa c2157pa = u31Var.f32817k;
        Intrinsics.checkNotNullParameter(responseNativeType, "responseNativeType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        return new u31(responseNativeType, assets, str, str2, dr0Var, c1795a4, xa0Var, xa0Var2, renderTrackingUrls, showNotices, c2157pa);
    }

    @NotNull
    public final List<C2276uf<?>> b() {
        return this.f32808b;
    }

    @Nullable
    public final C1795a4 c() {
        return this.f32812f;
    }

    @Nullable
    public final String d() {
        return this.f32810d;
    }

    @Nullable
    public final dr0 e() {
        return this.f32811e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u31)) {
            return false;
        }
        u31 u31Var = (u31) obj;
        return this.f32807a == u31Var.f32807a && Intrinsics.areEqual(this.f32808b, u31Var.f32808b) && Intrinsics.areEqual(this.f32809c, u31Var.f32809c) && Intrinsics.areEqual(this.f32810d, u31Var.f32810d) && Intrinsics.areEqual(this.f32811e, u31Var.f32811e) && Intrinsics.areEqual(this.f32812f, u31Var.f32812f) && Intrinsics.areEqual(this.f32813g, u31Var.f32813g) && Intrinsics.areEqual(this.f32814h, u31Var.f32814h) && Intrinsics.areEqual(this.f32815i, u31Var.f32815i) && Intrinsics.areEqual(this.f32816j, u31Var.f32816j) && Intrinsics.areEqual(this.f32817k, u31Var.f32817k);
    }

    @NotNull
    public final List<String> f() {
        return this.f32815i;
    }

    @NotNull
    public final zq1 g() {
        return this.f32807a;
    }

    @NotNull
    public final List<tx1> h() {
        return this.f32816j;
    }

    public final int hashCode() {
        int a4 = C2039k9.a(this.f32808b, this.f32807a.hashCode() * 31, 31);
        String str = this.f32809c;
        int hashCode = (a4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32810d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        dr0 dr0Var = this.f32811e;
        int hashCode3 = (hashCode2 + (dr0Var == null ? 0 : dr0Var.hashCode())) * 31;
        C1795a4 c1795a4 = this.f32812f;
        int hashCode4 = (hashCode3 + (c1795a4 == null ? 0 : c1795a4.hashCode())) * 31;
        xa0 xa0Var = this.f32813g;
        int hashCode5 = (hashCode4 + (xa0Var == null ? 0 : xa0Var.hashCode())) * 31;
        xa0 xa0Var2 = this.f32814h;
        int a5 = C2039k9.a(this.f32816j, C2039k9.a(this.f32815i, (hashCode5 + (xa0Var2 == null ? 0 : xa0Var2.hashCode())) * 31, 31), 31);
        C2157pa c2157pa = this.f32817k;
        return a5 + (c2157pa != null ? c2157pa.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Native(responseNativeType=" + this.f32807a + ", assets=" + this.f32808b + ", adId=" + this.f32809c + ", info=" + this.f32810d + ", link=" + this.f32811e + ", impressionData=" + this.f32812f + ", hideConditions=" + this.f32813g + ", showConditions=" + this.f32814h + ", renderTrackingUrls=" + this.f32815i + ", showNotices=" + this.f32816j + ", additionalInfo=" + this.f32817k + ")";
    }

    @Nullable
    public final String a() {
        return this.f32809c;
    }

    public final void a(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f32808b = arrayList;
    }
}
