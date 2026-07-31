package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class y6 extends rp {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1525o1 f20378b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ISBannerSize f20379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(@NotNull C1525o1 adTools, @NotNull ISBannerSize size, @NotNull String placement) {
        super(placement);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f20378b = adTools;
        this.f20379c = size;
    }

    @Override // com.ironsource.rp, com.ironsource.InterfaceC1447d2
    @NotNull
    public Map<String, Object> a(@Nullable EnumC1433b2 enumC1433b2) {
        Map<String, Object> mutableMap = MapsKt.toMutableMap(super.a(enumC1433b2));
        this.f20378b.a(mutableMap, this.f20379c);
        return mutableMap;
    }
}
