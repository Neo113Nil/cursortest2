package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public interface ci {

    @Metadata
    public interface a {
        void a(@NotNull ws wsVar);
    }

    int a(@NotNull IronSource.AD_UNIT ad_unit);

    @NotNull
    List<String> a();

    @NotNull
    Map<String, JSONObject> a(@NotNull ts tsVar);

    @NotNull
    JSONObject a(@NotNull ft ftVar);
}
