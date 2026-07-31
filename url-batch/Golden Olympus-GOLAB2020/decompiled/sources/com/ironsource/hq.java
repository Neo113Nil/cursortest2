package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class hq {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f16635a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f16636b;

    public hq(@NotNull JSONObject features, @NotNull String nameKey, @NotNull String amountKey) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        Intrinsics.checkNotNullParameter(amountKey, "amountKey");
        this.f16635a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.f16636b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    @Nullable
    public final Integer a() {
        return this.f16636b;
    }

    @Nullable
    public final String b() {
        return this.f16635a;
    }
}
