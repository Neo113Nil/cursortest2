package com.monetization.ads.mediation.rewarded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedReward {

    /* renamed from: a, reason: collision with root package name */
    private final int f20826a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f20827b;

    public MediatedReward(int i4, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f20826a = i4;
        this.f20827b = type;
    }

    public final int getAmount() {
        return this.f20826a;
    }

    @NotNull
    public final String getType() {
        return this.f20827b;
    }
}
