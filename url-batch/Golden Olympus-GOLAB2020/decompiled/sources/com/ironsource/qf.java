package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public interface qf extends rb {

    @Metadata
    public interface a {
        void a(@Nullable JSONObject jSONObject);
    }

    @NotNull
    JSONObject config();
}
