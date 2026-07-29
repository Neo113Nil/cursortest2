package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.request.Requests;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzch implements Requests.UpdateRequestsResult {
    private final /* synthetic */ Status zzbc;

    zzch(zzcg zzcgVar, Status status) {
        this.zzbc = status;
    }

    @Override // com.google.android.gms.games.request.Requests.UpdateRequestsResult
    public final Set<String> getRequestIds() {
        return null;
    }

    @Override // com.google.android.gms.games.request.Requests.UpdateRequestsResult
    public final int getRequestOutcome(String str) {
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown request ID ".concat(valueOf) : new String("Unknown request ID "));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzbc;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
