package dev.chrisbanes.haze;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes9.dex */
public final class HazeState {
    public final SnapshotStateList _areas = new SnapshotStateList();
    public final ParcelableSnapshotMutableState blurEnabled$delegate;

    public HazeState(boolean z) {
        this.blurEnabled$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
    }
}
