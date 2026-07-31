package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1460f1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f16191a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final UUID f16192b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f16193c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private Placement f16194d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final fu f16195e;

    @Metadata
    /* renamed from: com.ironsource.f1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16196a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16196a = iArr;
        }
    }

    public C1460f1(@NotNull IronSource.AD_UNIT adFormat, @NotNull UUID adId, @NotNull String adUnitId, @Nullable Placement placement, @Nullable fu fuVar) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f16191a = adFormat;
        this.f16192b = adId;
        this.f16193c = adUnitId;
        this.f16194d = placement;
        this.f16195e = fuVar;
    }

    @NotNull
    public final IronSource.AD_UNIT a() {
        return this.f16191a;
    }

    @NotNull
    public final UUID b() {
        return this.f16192b;
    }

    @NotNull
    public final String c() {
        return this.f16193c;
    }

    @NotNull
    public final LevelPlay.AdFormat d() {
        int i4 = a.f16196a[this.f16191a.ordinal()];
        if (i4 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i4 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i4 == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i4 == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new W1.m();
    }

    @Nullable
    public final Placement e() {
        return this.f16194d;
    }

    @Nullable
    public final fu f() {
        return this.f16195e;
    }

    public /* synthetic */ C1460f1(IronSource.AD_UNIT ad_unit, UUID uuid, String str, Placement placement, fu fuVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, uuid, str, (i4 & 8) != 0 ? null : placement, (i4 & 16) != 0 ? null : fuVar);
    }

    public final void a(@Nullable Placement placement) {
        this.f16194d = placement;
    }
}
