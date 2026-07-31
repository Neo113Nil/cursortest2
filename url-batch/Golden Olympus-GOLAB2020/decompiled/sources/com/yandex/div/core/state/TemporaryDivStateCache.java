package com.yandex.div.core.state;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class TemporaryDivStateCache {

    @NotNull
    private final Map<String, Map<String, String>> temporaryCache = new LinkedHashMap();

    public final void clear() {
        this.temporaryCache.clear();
    }

    @Nullable
    public final String getState(@NotNull String cardId, @NotNull String path) {
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        synchronized (this.temporaryCache) {
            Map<String, String> map = this.temporaryCache.get(cardId);
            str = map != null ? map.get(path) : null;
        }
        return str;
    }

    public final void putRootState(@NotNull String cardId, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        putState(cardId, "/", stateId);
    }

    public final void putState(@NotNull String cardId, @NotNull String path, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        synchronized (this.temporaryCache) {
            try {
                Map<String, Map<String, String>> map = this.temporaryCache;
                Map<String, String> map2 = map.get(cardId);
                if (map2 == null) {
                    map2 = new LinkedHashMap<>();
                    map.put(cardId, map2);
                }
                map2.put(path, stateId);
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Map<String, String> resetCard(@NotNull String cardId) {
        Map<String, String> remove;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        synchronized (this.temporaryCache) {
            remove = this.temporaryCache.remove(cardId);
        }
        return remove;
    }
}
