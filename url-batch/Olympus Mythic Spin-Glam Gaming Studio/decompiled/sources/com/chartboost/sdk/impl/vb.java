package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class vb {
    public final od a;
    public final String b;
    public final a0 c;

    public vb(od multiRenderable, String auctionId, a0 adMarkupConfig) {
        Intrinsics.checkNotNullParameter(multiRenderable, "multiRenderable");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        this.a = multiRenderable;
        this.b = auctionId;
        this.c = adMarkupConfig;
    }

    public final a0 a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final od c() {
        return this.a;
    }
}
