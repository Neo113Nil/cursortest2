package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class mc {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONObject f17228a;

    public mc(@Nullable JSONObject jSONObject) {
        this.f17228a = jSONObject;
    }

    @Nullable
    public final Boolean a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f17228a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof Boolean) {
            return (Boolean) opt;
        }
        return null;
    }

    @Nullable
    public final Integer b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f17228a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof Integer) {
            return (Integer) opt;
        }
        return null;
    }

    @Nullable
    public final String c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f17228a;
        Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof String) {
            return (String) opt;
        }
        return null;
    }
}
