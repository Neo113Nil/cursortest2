package com.google.android.gms.games;

import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.games.snapshot.Snapshots;

/* loaded from: classes.dex */
final class zzcb implements PendingResultUtil.ResultConverter<Snapshots.OpenSnapshotResult, Snapshots.OpenSnapshotResult> {
    zzcb() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Snapshots.OpenSnapshotResult convert(Snapshots.OpenSnapshotResult openSnapshotResult) {
        return openSnapshotResult;
    }
}
