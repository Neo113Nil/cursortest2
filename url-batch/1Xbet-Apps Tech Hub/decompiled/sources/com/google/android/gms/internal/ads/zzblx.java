package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzblx implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzccf zza;
    final /* synthetic */ zzblz zzb;

    zzblx(zzblz zzblzVar, zzccf zzccfVar) {
        this.zzb = zzblzVar;
        this.zza = zzccfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzblm zzblmVar;
        try {
            zzccf zzccfVar = this.zza;
            zzblmVar = this.zzb.zza;
            zzccfVar.zzc(zzblmVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i));
    }
}
