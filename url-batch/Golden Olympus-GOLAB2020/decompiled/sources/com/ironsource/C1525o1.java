package com.ironsource;

import com.ironsource.C1454e2;
import com.ironsource.i7;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.td;
import com.ironsource.wt;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1525o1 extends wl {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f18449b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wt.b f18450c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ac f18451d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xh f18452e;

    /* renamed from: f, reason: collision with root package name */
    private final long f18453f;

    @Metadata
    /* renamed from: com.ironsource.o1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f18454a = new a();

        private a() {
        }

        @NotNull
        public static final C1525o1 a(@NotNull IronSource.AD_UNIT adFormat, @NotNull C1454e2.b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C1525o1(adFormat, level);
        }
    }

    public C1525o1(@NotNull IronSource.AD_UNIT adFormat, @NotNull C1454e2.b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f18452e = nm.f18364r.d().t();
        this.f18453f = TimeUnit.HOURS.toMillis(1L);
        this.f18449b = adFormat;
        this.f18451d = new ac(adFormat, level, null, null, 12, null);
        wt.b a4 = wt.a(adFormat);
        Intrinsics.checkNotNullExpressionValue(a4, "createLogFactory(adFormat)");
        this.f18450c = a4;
    }

    @NotNull
    public final ISBannerSize a(@NotNull LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C1502l1().b(adSize);
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        fl a4 = this.f18452e.a();
        return a4 != null ? a4.b(adFormat) : this.f18453f;
    }

    @NotNull
    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    @NotNull
    protected final IronSource.AD_UNIT d() {
        return this.f18449b;
    }

    @NotNull
    public final ac e() {
        return this.f18451d;
    }

    public final int f() {
        return nm.f18364r.d().k().a(this.f18449b);
    }

    public final boolean g() {
        return nm.f18364r.d().t().c();
    }

    public C1525o1(@NotNull C1525o1 adTools, @NotNull C1454e2.b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f18452e = nm.f18364r.d().t();
        this.f18453f = TimeUnit.HOURS.toMillis(1L);
        IronSource.AD_UNIT ad_unit = adTools.f18449b;
        this.f18449b = ad_unit;
        this.f18450c = adTools.f18450c;
        this.f18451d = new ac(ad_unit, level, adTools.f18451d.c(), null, 8, null);
    }

    @Nullable
    public final Placement a(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        fl a4;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (a4 = this.f18452e.a()) == null) {
            return null;
        }
        return a4.b(adFormat, str);
    }

    @NotNull
    public final i7.b b(@NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        fl a4 = this.f18452e.a();
        if (a4 != null) {
            return a4.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final String c(@Nullable String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    @NotNull
    public final Placement d(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        fl a4 = this.f18452e.a();
        if (a4 == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        Placement b4 = a4.b(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (b4 != null) {
            return b4;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final Placement a(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        fl a4 = this.f18452e.a();
        if (a4 == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        Placement b4 = a4.b(LevelPlay.AdFormat.BANNER, placementName);
        if (b4 != null) {
            return b4;
        }
        throw new IllegalStateException("Error getting placement");
    }

    @NotNull
    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b d4 = com.ironsource.lifecycle.b.d();
        Intrinsics.checkNotNullExpressionValue(d4, "getInstance()");
        return d4;
    }

    public static /* synthetic */ String a(C1525o1 c1525o1, String str, String str2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return c1525o1.a(str, str2);
    }

    @NotNull
    public final td.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        fl a4 = this.f18452e.a();
        if (a4 != null) {
            return a4.a(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String a4 = this.f18450c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(a4, "logFactory.createLogMessage(message, suffix)");
        return a4;
    }

    public final void a(@NotNull Map<String, Object> data, @NotNull ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.l.a(data, size);
    }
}
