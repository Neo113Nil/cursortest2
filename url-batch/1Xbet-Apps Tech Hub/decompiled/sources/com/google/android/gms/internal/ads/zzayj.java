package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzayj implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzayb zza;
    final /* synthetic */ zzccf zzb;
    final /* synthetic */ zzayl zzc;

    zzayj(zzayl zzaylVar, zzayb zzaybVar, zzccf zzccfVar) {
        this.zzc = zzaylVar;
        this.zza = zzaybVar;
        this.zzb = zzccfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzaya zzayaVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzayl zzaylVar = this.zzc;
            z = zzaylVar.zzb;
            if (z) {
                return;
            }
            zzaylVar.zzb = true;
            zzayaVar = this.zzc.zza;
            if (zzayaVar == null) {
                return;
            }
            zzgbl zzgblVar = zzcca.zza;
            final zzayb zzaybVar = this.zza;
            final zzccf zzccfVar = this.zzb;
            final ListenableFuture zza = zzgblVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzayg
                @Override // java.lang.Runnable
                public final void run() {
                    zzayj zzayjVar = zzayj.this;
                    zzaya zzayaVar2 = zzayaVar;
                    zzccf zzccfVar2 = zzccfVar;
                    try {
                        zzayd zzq = zzayaVar2.zzq();
                        boolean zzp = zzayaVar2.zzp();
                        zzayb zzaybVar2 = zzaybVar;
                        zzaxy zzg = zzp ? zzq.zzg(zzaybVar2) : zzq.zzf(zzaybVar2);
                        if (!zzg.zze()) {
                            zzccfVar2.zzd(new RuntimeException("No entry contents."));
                            zzayl.zze(zzayjVar.zzc);
                            return;
                        }
                        zzayi zzayiVar = new zzayi(zzayjVar, zzg.zzc(), 1);
                        int read = zzayiVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzayiVar.unread(read);
                        zzccfVar2.zzc(zzayn.zzb(zzayiVar, zzg.zzd(), zzg.zzg(), zzg.zza(), zzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        zzcbn.zzh("Unable to obtain a cache service instance.", e);
                        zzccfVar2.zzd(e);
                        zzayl.zze(zzayjVar.zzc);
                    }
                }
            });
            final zzccf zzccfVar2 = this.zzb;
            zzccfVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzayh
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzayj.zzd;
                    if (zzccf.this.isCancelled()) {
                        zza.cancel(true);
                    }
                }
            }, zzcca.zzf);
        }
    }
}
