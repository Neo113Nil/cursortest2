package com.ironsource.mediationsdk;

import com.ironsource.C1464f5;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f17583a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<C1464f5> f17584b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17585c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private String f17586d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17587e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f17588f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private List<String> f17589g;

    /* renamed from: h, reason: collision with root package name */
    private int f17590h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private h f17591i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private IronSourceSegment f17592j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private String f17593k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private ISBannerSize f17594l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17595m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17596n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17597o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    private String f17598p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    private String f17599q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    private Boolean f17600r;

    public i(@NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f17583a = adUnit;
        this.f17584b = new ArrayList<>();
        this.f17586d = "";
        this.f17588f = new HashMap();
        this.f17589g = new ArrayList();
        this.f17590h = -1;
        this.f17593k = "";
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void l() {
    }

    @NotNull
    public final IronSource.AD_UNIT a() {
        return this.f17583a;
    }

    @Nullable
    public final String b() {
        return this.f17599q;
    }

    @NotNull
    public final IronSource.AD_UNIT c() {
        return this.f17583a;
    }

    @Nullable
    public final String d() {
        return this.f17598p;
    }

    @Nullable
    public final h e() {
        return this.f17591i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f17583a == ((i) obj).f17583a;
    }

    @Nullable
    public final ISBannerSize f() {
        return this.f17594l;
    }

    @NotNull
    public final Map<String, Object> g() {
        return this.f17588f;
    }

    public int hashCode() {
        return this.f17583a.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f17586d;
    }

    @NotNull
    public final ArrayList<C1464f5> j() {
        return this.f17584b;
    }

    @NotNull
    public final List<String> k() {
        return this.f17589g;
    }

    @Nullable
    public final IronSourceSegment m() {
        return this.f17592j;
    }

    public final int n() {
        return this.f17590h;
    }

    public final boolean o() {
        return this.f17596n;
    }

    public final boolean p() {
        return this.f17597o;
    }

    @NotNull
    public final String q() {
        return this.f17593k;
    }

    public final boolean r() {
        return this.f17595m;
    }

    public final boolean s() {
        return this.f17587e;
    }

    @Nullable
    public final Boolean t() {
        return this.f17600r;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f17583a + ')';
    }

    public final boolean u() {
        return this.f17585c;
    }

    @NotNull
    public final i a(@NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new i(adUnit);
    }

    public final void b(@Nullable String str) {
        this.f17598p = str;
    }

    public final void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f17586d = str;
    }

    public final void d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f17593k = str;
    }

    public final void e(boolean z4) {
        this.f17597o = z4;
    }

    public static /* synthetic */ i a(i iVar, IronSource.AD_UNIT ad_unit, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            ad_unit = iVar.f17583a;
        }
        return iVar.a(ad_unit);
    }

    public final void b(boolean z4) {
        this.f17587e = z4;
    }

    public final void c(boolean z4) {
        this.f17585c = z4;
    }

    public final void d(boolean z4) {
        this.f17596n = z4;
    }

    public final void a(int i4) {
        this.f17590h = i4;
    }

    public final void a(@NotNull C1464f5 instanceInfo) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.f17584b.add(instanceInfo);
    }

    public final void a(@Nullable ISBannerSize iSBannerSize) {
        this.f17594l = iSBannerSize;
    }

    public final void a(@Nullable IronSourceSegment ironSourceSegment) {
        this.f17592j = ironSourceSegment;
    }

    public final void a(@Nullable h hVar) {
        this.f17591i = hVar;
    }

    public final void a(@Nullable Boolean bool) {
        this.f17600r = bool;
    }

    public final void a(@Nullable String str) {
        this.f17599q = str;
    }

    public final void a(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f17589g = list;
    }

    public final void a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f17588f = map;
    }

    public final void a(boolean z4) {
        this.f17595m = z4;
    }
}
