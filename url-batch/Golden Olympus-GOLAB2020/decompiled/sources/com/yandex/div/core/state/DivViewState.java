package com.yandex.div.core.state;

import androidx.annotation.NonNull;
import androidx.collection.a;
import java.util.Map;

/* loaded from: classes2.dex */
public class DivViewState {

    @NonNull
    private final Map<String, BlockState> mBlockStates;
    private final long mCurrentDivStateId;

    interface BlockState {
    }

    DivViewState(long j4) {
        this(j4, new a());
    }

    public <T extends BlockState> T getBlockState(@NonNull String str) {
        return (T) this.mBlockStates.get(str);
    }

    @NonNull
    Map<String, BlockState> getBlockStates() {
        return this.mBlockStates;
    }

    public long getCurrentDivStateId() {
        return this.mCurrentDivStateId;
    }

    public <T extends BlockState> void putBlockState(@NonNull String str, @NonNull T t4) {
        this.mBlockStates.put(str, t4);
    }

    public void reset() {
        this.mBlockStates.clear();
    }

    DivViewState(long j4, @NonNull Map<String, BlockState> map) {
        this.mCurrentDivStateId = j4;
        this.mBlockStates = map;
    }
}
