package com.google.android.gms.games;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzci implements com.google.android.gms.games.internal.zzr {
    zzci() {
    }

    @Override // com.google.android.gms.games.internal.zzr
    public final boolean zza(Status status) {
        return status.isSuccess() || status.getStatusCode() == 5;
    }
}
