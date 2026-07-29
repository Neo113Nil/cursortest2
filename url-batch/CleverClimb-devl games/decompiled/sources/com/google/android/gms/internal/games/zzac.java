package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zzac implements Result {
    private final /* synthetic */ Status zzbc;

    zzac(zzab zzabVar, Status status) {
        this.zzbc = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzbc;
    }
}
