package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class is0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final es0 f27388a = new es0();

    @Nullable
    public final Location a(@NotNull List<? extends Location> locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Location location = null;
        for (Location location2 : locations) {
            this.f27388a.getClass();
            if (es0.a(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
