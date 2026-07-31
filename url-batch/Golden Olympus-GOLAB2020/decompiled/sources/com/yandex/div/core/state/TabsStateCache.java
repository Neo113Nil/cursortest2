package com.yandex.div.core.state;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class TabsStateCache {

    @NotNull
    private final Map<String, Map<String, Integer>> temporaryCache = new LinkedHashMap();

    @Nullable
    public final Integer getSelectedTab(@NotNull String cardId, @NotNull String path) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        Map<String, Integer> map = this.temporaryCache.get(cardId);
        if (map != null) {
            return map.get(path);
        }
        return null;
    }

    public final void putSelectedTab(@NotNull String cardId, @NotNull String path, int i4) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        Map<String, Map<String, Integer>> map = this.temporaryCache;
        Map<String, Integer> map2 = map.get(cardId);
        if (map2 == null) {
            map2 = new LinkedHashMap<>();
            map.put(cardId, map2);
        }
        map2.put(path, Integer.valueOf(i4));
    }
}
