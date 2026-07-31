package com.monetization.ads.mediation.base.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedAdObject {

    @NotNull
    private final Object ad;

    @NotNull
    private final MediatedAdObjectInfo info;

    public MediatedAdObject(@NotNull Object ad, @NotNull MediatedAdObjectInfo info) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.ad = ad;
        this.info = info;
    }

    @NotNull
    public final Object getAd() {
        return this.ad;
    }

    @NotNull
    public final MediatedAdObjectInfo getInfo() {
        return this.info;
    }
}
