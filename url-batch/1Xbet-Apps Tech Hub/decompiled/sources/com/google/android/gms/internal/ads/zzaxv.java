package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaxv implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzaxx zza;

    zzaxv(zzaxx zzaxxVar) {
        this.zza = zzaxxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzaya zzayaVar;
        zzaya zzayaVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzaxx zzaxxVar = this.zza;
                zzayaVar = zzaxxVar.zzd;
                if (zzayaVar != null) {
                    zzayaVar2 = zzaxxVar.zzd;
                    zzaxxVar.zzf = zzayaVar2.zzq();
                }
            } catch (DeadObjectException e) {
                zzcbn.zzh("Unable to obtain a cache service instance.", e);
                zzaxx.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
