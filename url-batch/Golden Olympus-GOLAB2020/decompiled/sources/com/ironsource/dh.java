package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public interface dh {

    @Metadata
    public interface a {
        void a(@NotNull JSONObject jSONObject);
    }

    @Nullable
    JSONObject a(@NotNull String str);

    @Nullable
    Integer b(@NotNull String str);

    @Nullable
    Boolean c(@NotNull String str);

    @Nullable
    String d(@NotNull String str);
}
