package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final zq f19026a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final nj f19027b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final u6 f19028c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final sm f19029d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final C1428a4 f19030e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final qu f19031f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final C1467g1 f19032g;

    @Metadata
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private zq f19033a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private nj f19034b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private u6 f19035c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private sm f19036d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private C1428a4 f19037e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        private qu f19038f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private C1467g1 f19039g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @NotNull
        public final a a(@Nullable C1428a4 c1428a4) {
            this.f19037e = c1428a4;
            return this;
        }

        @NotNull
        public final a b(@Nullable qu quVar) {
            this.f19038f = quVar;
            return this;
        }

        @Nullable
        public final nj c() {
            return this.f19034b;
        }

        @Nullable
        public final u6 d() {
            return this.f19035c;
        }

        @Nullable
        public final sm e() {
            return this.f19036d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f19033a, aVar.f19033a) && Intrinsics.areEqual(this.f19034b, aVar.f19034b) && Intrinsics.areEqual(this.f19035c, aVar.f19035c) && Intrinsics.areEqual(this.f19036d, aVar.f19036d) && Intrinsics.areEqual(this.f19037e, aVar.f19037e) && Intrinsics.areEqual(this.f19038f, aVar.f19038f) && Intrinsics.areEqual(this.f19039g, aVar.f19039g);
        }

        @Nullable
        public final C1428a4 f() {
            return this.f19037e;
        }

        @Nullable
        public final qu g() {
            return this.f19038f;
        }

        @Nullable
        public final C1467g1 h() {
            return this.f19039g;
        }

        public int hashCode() {
            zq zqVar = this.f19033a;
            int hashCode = (zqVar == null ? 0 : zqVar.hashCode()) * 31;
            nj njVar = this.f19034b;
            int hashCode2 = (hashCode + (njVar == null ? 0 : njVar.hashCode())) * 31;
            u6 u6Var = this.f19035c;
            int hashCode3 = (hashCode2 + (u6Var == null ? 0 : u6Var.hashCode())) * 31;
            sm smVar = this.f19036d;
            int hashCode4 = (hashCode3 + (smVar == null ? 0 : smVar.hashCode())) * 31;
            C1428a4 c1428a4 = this.f19037e;
            int hashCode5 = (hashCode4 + (c1428a4 == null ? 0 : c1428a4.hashCode())) * 31;
            qu quVar = this.f19038f;
            int hashCode6 = (hashCode5 + (quVar == null ? 0 : quVar.hashCode())) * 31;
            C1467g1 c1467g1 = this.f19039g;
            return hashCode6 + (c1467g1 != null ? c1467g1.hashCode() : 0);
        }

        @Nullable
        public final C1467g1 i() {
            return this.f19039g;
        }

        @Nullable
        public final C1428a4 j() {
            return this.f19037e;
        }

        @Nullable
        public final u6 k() {
            return this.f19035c;
        }

        @Nullable
        public final nj l() {
            return this.f19034b;
        }

        @Nullable
        public final sm m() {
            return this.f19036d;
        }

        @Nullable
        public final zq n() {
            return this.f19033a;
        }

        @Nullable
        public final qu o() {
            return this.f19038f;
        }

        @NotNull
        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f19033a + ", interstitialConfigurations=" + this.f19034b + ", bannerConfigurations=" + this.f19035c + ", nativeAdConfigurations=" + this.f19036d + ", applicationConfigurations=" + this.f19037e + ", testSuiteSettings=" + this.f19038f + ", adQualityConfigurations=" + this.f19039g + ')';
        }

        public a(@Nullable zq zqVar, @Nullable nj njVar, @Nullable u6 u6Var, @Nullable sm smVar, @Nullable C1428a4 c1428a4, @Nullable qu quVar, @Nullable C1467g1 c1467g1) {
            this.f19033a = zqVar;
            this.f19034b = njVar;
            this.f19035c = u6Var;
            this.f19036d = smVar;
            this.f19037e = c1428a4;
            this.f19038f = quVar;
            this.f19039g = c1467g1;
        }

        @NotNull
        public final a a(@Nullable C1467g1 c1467g1) {
            this.f19039g = c1467g1;
            return this;
        }

        @Nullable
        public final zq b() {
            return this.f19033a;
        }

        public /* synthetic */ a(zq zqVar, nj njVar, u6 u6Var, sm smVar, C1428a4 c1428a4, qu quVar, C1467g1 c1467g1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : zqVar, (i4 & 2) != 0 ? null : njVar, (i4 & 4) != 0 ? null : u6Var, (i4 & 8) != 0 ? null : smVar, (i4 & 16) != 0 ? null : c1428a4, (i4 & 32) != 0 ? null : quVar, (i4 & 64) != 0 ? null : c1467g1);
        }

        @NotNull
        public final a a(@Nullable nj njVar) {
            this.f19034b = njVar;
            return this;
        }

        public final void b(@Nullable C1428a4 c1428a4) {
            this.f19037e = c1428a4;
        }

        public static /* synthetic */ a a(a aVar, zq zqVar, nj njVar, u6 u6Var, sm smVar, C1428a4 c1428a4, qu quVar, C1467g1 c1467g1, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                zqVar = aVar.f19033a;
            }
            if ((i4 & 2) != 0) {
                njVar = aVar.f19034b;
            }
            if ((i4 & 4) != 0) {
                u6Var = aVar.f19035c;
            }
            if ((i4 & 8) != 0) {
                smVar = aVar.f19036d;
            }
            if ((i4 & 16) != 0) {
                c1428a4 = aVar.f19037e;
            }
            if ((i4 & 32) != 0) {
                quVar = aVar.f19038f;
            }
            if ((i4 & 64) != 0) {
                c1467g1 = aVar.f19039g;
            }
            qu quVar2 = quVar;
            C1467g1 c1467g12 = c1467g1;
            C1428a4 c1428a42 = c1428a4;
            u6 u6Var2 = u6Var;
            return aVar.a(zqVar, njVar, u6Var2, smVar, c1428a42, quVar2, c1467g12);
        }

        public final void b(@Nullable C1467g1 c1467g1) {
            this.f19039g = c1467g1;
        }

        @NotNull
        public final a a(@Nullable sm smVar) {
            this.f19036d = smVar;
            return this;
        }

        public final void b(@Nullable nj njVar) {
            this.f19034b = njVar;
        }

        @NotNull
        public final a a(@Nullable u6 u6Var) {
            this.f19035c = u6Var;
            return this;
        }

        public final void b(@Nullable sm smVar) {
            this.f19036d = smVar;
        }

        @NotNull
        public final a a(@Nullable zq zqVar) {
            this.f19033a = zqVar;
            return this;
        }

        public final void b(@Nullable u6 u6Var) {
            this.f19035c = u6Var;
        }

        @NotNull
        public final a a(@Nullable zq zqVar, @Nullable nj njVar, @Nullable u6 u6Var, @Nullable sm smVar, @Nullable C1428a4 c1428a4, @Nullable qu quVar, @Nullable C1467g1 c1467g1) {
            return new a(zqVar, njVar, u6Var, smVar, c1428a4, quVar, c1467g1);
        }

        public final void b(@Nullable zq zqVar) {
            this.f19033a = zqVar;
        }

        @NotNull
        public final s8 a() {
            return new s8(this.f19033a, this.f19034b, this.f19035c, this.f19036d, this.f19037e, this.f19038f, this.f19039g, null);
        }

        public final void a(@Nullable qu quVar) {
            this.f19038f = quVar;
        }
    }

    private s8(zq zqVar, nj njVar, u6 u6Var, sm smVar, C1428a4 c1428a4, qu quVar, C1467g1 c1467g1) {
        this.f19026a = zqVar;
        this.f19027b = njVar;
        this.f19028c = u6Var;
        this.f19029d = smVar;
        this.f19030e = c1428a4;
        this.f19031f = quVar;
        this.f19032g = c1467g1;
    }

    @Nullable
    public final C1467g1 a() {
        return this.f19032g;
    }

    @Nullable
    public final C1428a4 b() {
        return this.f19030e;
    }

    @Nullable
    public final u6 c() {
        return this.f19028c;
    }

    @Nullable
    public final nj d() {
        return this.f19027b;
    }

    @Nullable
    public final sm e() {
        return this.f19029d;
    }

    @Nullable
    public final zq f() {
        return this.f19026a;
    }

    @Nullable
    public final qu g() {
        return this.f19031f;
    }

    @NotNull
    public String toString() {
        return "configurations(\n" + this.f19026a + '\n' + this.f19027b + '\n' + this.f19028c + '\n' + this.f19029d + ')';
    }

    public /* synthetic */ s8(zq zqVar, nj njVar, u6 u6Var, sm smVar, C1428a4 c1428a4, qu quVar, C1467g1 c1467g1, DefaultConstructorMarker defaultConstructorMarker) {
        this(zqVar, njVar, u6Var, smVar, c1428a4, quVar, c1467g1);
    }
}
