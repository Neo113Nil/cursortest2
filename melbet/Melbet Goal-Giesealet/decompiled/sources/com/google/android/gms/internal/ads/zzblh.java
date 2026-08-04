package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzblh implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzblj zzb;

    zzblh(zzblj zzbljVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzbljVar);
        this.zzb = zzbljVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 23);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        this.zza.zzd(new RuntimeException(sb.toString()));
    }
}
