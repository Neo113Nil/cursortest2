package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class j6 extends C1460f1 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final LevelPlayAdSize f16825f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final Boolean f16826g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final Long f16827h;

    public j6() {
        this(mf.f18026a.a(), "", null, null, null, null, null, 124, null);
    }

    @NotNull
    public final LevelPlayAdSize g() {
        return this.f16825f;
    }

    @Nullable
    public final Boolean h() {
        return this.f16826g;
    }

    @Nullable
    public final Long i() {
        return this.f16827h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(@NotNull UUID adId, @NotNull String adUnitId, @Nullable Placement placement, @NotNull LevelPlayAdSize adSize, @Nullable Boolean bool, @Nullable Long l4, @Nullable fu fuVar) {
        super(IronSource.AD_UNIT.BANNER, adId, adUnitId, placement, fuVar);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.f16825f = adSize;
        this.f16826g = bool;
        this.f16827h = l4;
    }

    public /* synthetic */ j6(UUID uuid, String str, Placement placement, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l4, fu fuVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i4 & 4) != 0 ? null : placement, (i4 & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i4 & 16) != 0 ? null : bool, (i4 & 32) != 0 ? null : l4, (i4 & 64) != 0 ? null : fuVar);
    }
}
