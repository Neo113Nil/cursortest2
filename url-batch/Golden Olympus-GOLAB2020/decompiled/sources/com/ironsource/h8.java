package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f16572a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f16573b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final m8 f16574c;

    public h8(@NotNull JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f16572a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f16573b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.f16574c = features.has("unit") ? m8.f17209c.a(features.optString("unit")) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.f16572a;
    }

    @Nullable
    public final Integer b() {
        return this.f16573b;
    }

    @Nullable
    public final m8 c() {
        return this.f16574c;
    }
}
