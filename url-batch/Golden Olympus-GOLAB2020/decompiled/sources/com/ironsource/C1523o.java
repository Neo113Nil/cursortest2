package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1523o extends fc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f18436a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final UUID f18437b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f18438c;

    public C1523o(@NotNull IronSource.AD_UNIT adFormat, @NotNull UUID adId, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f18436a = adFormat;
        this.f18437b = adId;
        this.f18438c = adUnitId;
    }

    @Override // com.ironsource.InterfaceC1447d2
    @NotNull
    public Map<String, Object> a(@Nullable EnumC1433b2 enumC1433b2) {
        return a(new C1460f1(this.f18436a, this.f18437b, this.f18438c, null, null, 24, null));
    }
}
