package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zzdh extends zzn {
    final /* synthetic */ TaskCompletionSource zza;

    zzdh(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzo
    public final void zzb(Status status, boolean z7) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z7), this.zza);
    }
}
