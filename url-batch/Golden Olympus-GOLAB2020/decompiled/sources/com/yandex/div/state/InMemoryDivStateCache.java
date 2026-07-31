package com.yandex.div.state;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class InMemoryDivStateCache implements DivStateCache {
    private final Map<Pair<String, String>, String> states = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, String> rootStates = Collections.synchronizedMap(new LinkedHashMap());

    @Override // com.yandex.div.state.DivStateCache
    public void clear() {
        this.states.clear();
        this.rootStates.clear();
    }

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    public String getRootState(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return this.rootStates.get(cardId);
    }

    @Override // com.yandex.div.state.DivStateCache
    @Nullable
    public String getState(@NotNull String cardId, @NotNull String path) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        return this.states.get(TuplesKt.to(cardId, path));
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putRootState(@NotNull String cardId, @NotNull String state) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(state, "state");
        Map<String, String> rootStates = this.rootStates;
        Intrinsics.checkNotNullExpressionValue(rootStates, "rootStates");
        rootStates.put(cardId, state);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putState(@NotNull String cardId, @NotNull String path, @NotNull String state) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(state, "state");
        Map<Pair<String, String>, String> states = this.states;
        Intrinsics.checkNotNullExpressionValue(states, "states");
        states.put(TuplesKt.to(cardId, path), state);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void resetCard(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.rootStates.remove(cardId);
        CollectionsKt.removeAll(this.states.keySet(), new InMemoryDivStateCache$resetCard$1(cardId));
    }
}
