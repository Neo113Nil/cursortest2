package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1545r1 implements InterfaceC1471g5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1460f1 f18894a;

    public C1545r1(@NotNull C1460f1 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f18894a = adProperties;
    }

    @Override // com.ironsource.InterfaceC1471g5
    public void a(@NotNull com.ironsource.mediationsdk.i auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.f18894a.c());
        auctionRequestParams.a(this.f18894a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}
