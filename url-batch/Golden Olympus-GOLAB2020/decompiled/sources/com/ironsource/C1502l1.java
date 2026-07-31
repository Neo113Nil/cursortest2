package com.ironsource;

import android.content.Context;
import com.ironsource.C1454e2;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.ISContainerParams;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.wt;
import com.unity3d.mediation.LevelPlayAdSize;
import j2.AbstractC3185a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1502l1 extends wl {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ac f16975b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wt.b f16976c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xh f16977d;

    public C1502l1() {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f16975b = new ac(ad_unit, C1454e2.b.MEDIATION, null, null, 12, null);
        wt.b a4 = wt.a(ad_unit);
        Intrinsics.checkNotNullExpressionValue(a4, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f16976c = a4;
        this.f16977d = nm.f18364r.d().t();
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        return Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f17628b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f17629c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize(com.ironsource.mediationsdk.l.f17631e, 0, 0) : Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize(com.ironsource.mediationsdk.l.f17627a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    public final int a(int i4) {
        return com.ironsource.mediationsdk.l.a(i4);
    }

    @NotNull
    public final ISBannerSize b(@NotNull LevelPlayAdSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        boolean isAdaptive = size.isAdaptive();
        if (isAdaptive) {
            return a(size);
        }
        if (isAdaptive) {
            throw new W1.m();
        }
        return c(size);
    }

    public final boolean d() {
        return nm.f18364r.d().t().c();
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize b4 = b(fallbackAdSize$mediationsdk_release);
        b4.setAdaptive(true);
        b4.containerParams = new ISContainerParams(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        return b4;
    }

    private final Float c() {
        fl a4 = this.f16977d.a();
        Float valueOf = a4 != null ? Float.valueOf(a4.i()) : null;
        if (valueOf != null) {
            return valueOf;
        }
        this.f16975b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }

    @Nullable
    public final Integer b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float c4 = c();
        if (c4 != null) {
            return Integer.valueOf(AbstractC3185a.c(c4.floatValue() * bb.f15592a.a(context)));
        }
        return null;
    }

    public static /* synthetic */ String a(C1502l1 c1502l1, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return c1502l1.a(str, str2);
    }

    @NotNull
    public final List<LevelPlayAdSize> b() {
        fl a4 = this.f16977d.a();
        if (a4 != null) {
            return a4.h();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String a4 = this.f16976c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(a4, "logFactory.createLogMessage(message, suffix)");
        return a4;
    }
}
