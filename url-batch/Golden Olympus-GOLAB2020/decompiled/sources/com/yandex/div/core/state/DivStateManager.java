package com.yandex.div.core.state;

import androidx.collection.a;
import com.yandex.div.DivDataTag;
import com.yandex.div.state.DivStateCache;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivStateManager {

    @NotNull
    private final DivStateCache cache;

    @NotNull
    private final a states;

    @NotNull
    private final TemporaryDivStateCache temporaryCache;

    public DivStateManager(@NotNull DivStateCache cache, @NotNull TemporaryDivStateCache temporaryCache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        this.cache = cache;
        this.temporaryCache = temporaryCache;
        this.states = new a();
    }

    @Nullable
    public final DivViewState getState(@NotNull DivDataTag tag) {
        DivViewState divViewState;
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.states) {
            try {
                divViewState = (DivViewState) this.states.get(tag);
                if (divViewState == null) {
                    String rootState = this.cache.getRootState(tag.getId());
                    if (rootState != null) {
                        Intrinsics.checkNotNullExpressionValue(rootState, "getRootState(tag.id)");
                        divViewState = new DivViewState(Long.parseLong(rootState));
                    } else {
                        divViewState = null;
                    }
                    this.states.put(tag, divViewState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return divViewState;
    }

    public final void reset(@NotNull List<? extends DivDataTag> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (tags.isEmpty()) {
            this.states.clear();
            this.cache.clear();
            this.temporaryCache.clear();
            return;
        }
        for (DivDataTag divDataTag : tags) {
            this.states.remove(divDataTag);
            this.cache.resetCard(divDataTag.getId());
            TemporaryDivStateCache temporaryDivStateCache = this.temporaryCache;
            String id = divDataTag.getId();
            Intrinsics.checkNotNullExpressionValue(id, "tag.id");
            temporaryDivStateCache.resetCard(id);
        }
    }

    public final void updateState(@NotNull DivDataTag tag, long j4, boolean z4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(DivDataTag.INVALID, tag)) {
            return;
        }
        synchronized (this.states) {
            try {
                DivViewState state = getState(tag);
                this.states.put(tag, state == null ? new DivViewState(j4) : new DivViewState(j4, state.getBlockStates()));
                TemporaryDivStateCache temporaryDivStateCache = this.temporaryCache;
                String id = tag.getId();
                Intrinsics.checkNotNullExpressionValue(id, "tag.id");
                temporaryDivStateCache.putRootState(id, String.valueOf(j4));
                if (!z4) {
                    this.cache.putRootState(tag.getId(), String.valueOf(j4));
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateStates(@NotNull String cardId, @NotNull DivStatePath divStatePath, boolean z4) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(divStatePath, "divStatePath");
        String pathToLastState = divStatePath.getPathToLastState();
        String lastStateId = divStatePath.getLastStateId();
        if (pathToLastState == null || lastStateId == null) {
            return;
        }
        synchronized (this.states) {
            try {
                this.temporaryCache.putState(cardId, pathToLastState, lastStateId);
                if (!z4) {
                    this.cache.putState(cardId, pathToLastState, lastStateId);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
