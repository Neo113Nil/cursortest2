package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbfj implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbfl zza;

    zzbfj(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            try {
                if (zzbflVar.zzi() != null) {
                    zzbflVar.zzk(zzbflVar.zzi().zzq());
                }
            } catch (DeadObjectException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            zzbflVar.zzk(null);
            zzbflVar.zzh().notifyAll();
        }
    }
}
