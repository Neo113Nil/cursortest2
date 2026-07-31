package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1537q {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f18737a;

    public C1537q(@NotNull JSONObject adFormatAuctionSettings) {
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f18737a = adFormatAuctionSettings.has("isLoadWhileShow") ? Boolean.valueOf(adFormatAuctionSettings.optBoolean("isLoadWhileShow")) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.f18737a;
    }
}
