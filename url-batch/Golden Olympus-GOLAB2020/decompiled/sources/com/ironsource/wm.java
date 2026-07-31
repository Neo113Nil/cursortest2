package com.ironsource;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public interface wm {

    @Metadata
    public interface a {
        void a();

        void a(@NotNull sh shVar);

        void a(@NotNull String str);

        void c();
    }

    @Nullable
    a a();

    void a(@NotNull Activity activity, @NotNull JSONObject jSONObject);

    void a(@NotNull uv uvVar);

    void a(@NotNull vh vhVar);

    void a(@Nullable a aVar);

    void a(@NotNull JSONObject jSONObject);

    void b();

    void destroy();
}
