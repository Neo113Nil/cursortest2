package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class dp {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f15906a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f15907b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m8 f15908c;

    public dp(@NotNull JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f15906a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f15907b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f15908c = m8.Second;
    }

    @Nullable
    public final Boolean a() {
        return this.f15906a;
    }

    @Nullable
    public final Integer b() {
        return this.f15907b;
    }

    @NotNull
    public final m8 c() {
        return this.f15908c;
    }
}
