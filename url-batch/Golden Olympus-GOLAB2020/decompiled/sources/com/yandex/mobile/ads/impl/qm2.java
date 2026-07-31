package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.rewarded.Reward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qm2 implements Reward {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final or1 f30847a;

    public qm2(@NotNull or1 rewardData) {
        Intrinsics.checkNotNullParameter(rewardData, "rewardData");
        this.f30847a = rewardData;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof qm2) && Intrinsics.areEqual(((qm2) obj).f30847a, this.f30847a);
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return this.f30847a.getAmount();
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    @NotNull
    public final String getType() {
        return this.f30847a.getType();
    }

    public final int hashCode() {
        return this.f30847a.hashCode();
    }
}
