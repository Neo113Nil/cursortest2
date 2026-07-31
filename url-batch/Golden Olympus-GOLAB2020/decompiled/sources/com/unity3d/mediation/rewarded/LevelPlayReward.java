package com.unity3d.mediation.rewarded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LevelPlayReward {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21985a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21986b;

    public LevelPlayReward(@NotNull String name, int i4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f21985a = name;
        this.f21986b = i4;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = levelPlayReward.f21985a;
        }
        if ((i5 & 2) != 0) {
            i4 = levelPlayReward.f21986b;
        }
        return levelPlayReward.copy(str, i4);
    }

    @NotNull
    public final String component1() {
        return this.f21985a;
    }

    public final int component2() {
        return this.f21986b;
    }

    @NotNull
    public final LevelPlayReward copy(@NotNull String name, int i4) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LevelPlayReward(name, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return Intrinsics.areEqual(this.f21985a, levelPlayReward.f21985a) && this.f21986b == levelPlayReward.f21986b;
    }

    public final int getAmount() {
        return this.f21986b;
    }

    @NotNull
    public final String getName() {
        return this.f21985a;
    }

    public int hashCode() {
        return (this.f21985a.hashCode() * 31) + Integer.hashCode(this.f21986b);
    }

    @NotNull
    public String toString() {
        return "LevelPlayReward(name=" + this.f21985a + ", amount=" + this.f21986b + ')';
    }
}
