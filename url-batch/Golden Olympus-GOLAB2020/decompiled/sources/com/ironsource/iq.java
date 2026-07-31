package com.ironsource;

import com.ironsource.fg;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class iq implements fg, fg.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, LevelPlayReward> f16761a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, LevelPlayReward> f16762b = new LinkedHashMap();

    private final LevelPlayReward a(String str) {
        return this.f16762b.get(str);
    }

    private final LevelPlayReward b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f16761a.get(str);
    }

    @Override // com.ironsource.fg
    @Nullable
    public LevelPlayReward a(@Nullable String str, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        LevelPlayReward b4 = b(str);
        return b4 == null ? a(adUnitId) : b4;
    }

    @Override // com.ironsource.fg.a
    public void b(@NotNull String adUnitId, @NotNull String rewardName, int i4) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f16762b.put(adUnitId, new LevelPlayReward(rewardName, i4));
    }

    @Override // com.ironsource.fg.a
    public void a(@NotNull String placement, @NotNull String rewardName, int i4) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f16761a.put(placement, new LevelPlayReward(rewardName, i4));
    }
}
