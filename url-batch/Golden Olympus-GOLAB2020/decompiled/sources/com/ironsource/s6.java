package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class s6 extends C1545r1 {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final ISBannerSize f18971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(@NotNull C1460f1 adProperties, @Nullable ISBannerSize iSBannerSize) {
        super(adProperties);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f18971b = iSBannerSize;
    }

    @Override // com.ironsource.C1545r1, com.ironsource.InterfaceC1471g5
    public void a(@NotNull com.ironsource.mediationsdk.i auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.f18971b);
    }
}
