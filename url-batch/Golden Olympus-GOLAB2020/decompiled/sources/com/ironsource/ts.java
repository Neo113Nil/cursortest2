package com.ironsource;

import com.ironsource.b9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ts {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private us f19825a;

    public ts(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f19825a = us.f19954b.a(config.optInt(b9.a.f15306t, us.CurrentlyLoadedAds.b()));
    }

    @NotNull
    public final us a() {
        return this.f19825a;
    }
}
