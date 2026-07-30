package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzees extends zzeeq {
    private final Context zzg;
    private final Executor zzh;

    zzees(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbyw(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzeff(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzeff(1));
                }
            }
        }
    }

    public final ListenableFuture zza(zzbzu zzbzuVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbzuVar;
            this.zzf.checkAvailabilityAndConnect();
            zzcen zzcenVar = this.zza;
            zzcenVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeer
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzees.this.zzb();
                }
            }, zzcei.zzg);
            zzc(this.zzg, zzcenVar, this.zzh);
            return zzcenVar;
        }
    }
}
