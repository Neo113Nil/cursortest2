package com.crrepa.band.my.training.model;

/* loaded from: classes3.dex */
public class TrainingRecordSyncEvent {
    private final SyncStatus syncStatus;

    public enum SyncStatus {
        START,
        COMPLETED,
        HIDE
    }

    public TrainingRecordSyncEvent(SyncStatus syncStatus) {
        this.syncStatus = syncStatus;
    }

    public SyncStatus getSyncStatus() {
        return this.syncStatus;
    }
}
