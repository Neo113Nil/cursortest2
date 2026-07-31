package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1539q1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap<String, C1553s2> f18740a = new HashMap<>();

    @Metadata
    /* renamed from: com.ironsource.q1$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    @NotNull
    public final C1553s2 a(@NotNull String adUnitId, @NotNull List<? extends NetworkSettings> providers, int i4) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(providers, "providers");
        C1553s2 c1553s2 = this.f18740a.get(adUnitId);
        if (c1553s2 != null) {
            return c1553s2;
        }
        C1553s2 c1553s22 = new C1553s2(providers, i4);
        this.f18740a.put(adUnitId, c1553s22);
        return c1553s22;
    }
}
