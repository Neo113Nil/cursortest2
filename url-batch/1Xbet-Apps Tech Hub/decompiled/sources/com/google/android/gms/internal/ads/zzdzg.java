package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdzg extends zzdza {
    private String zzg;
    private int zzh = 1;

    zzdzg(Context context) {
        this.zzf = new zzbva(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdza, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcbn.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdzp(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    try {
                        int i = this.zzh;
                        if (i == 2) {
                            this.zzf.zzp().zze(this.zze, new zzdyz(this));
                        } else if (i == 3) {
                            this.zzf.zzp().zzh(this.zzg, new zzdyz(this));
                        } else {
                            this.zza.zzd(new zzdzp(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdzp(1));
                    }
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzdzp(1));
                }
            }
        }
    }

    public final ListenableFuture zzb(zzbwa zzbwaVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzgbb.zzg(new zzdzp(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbwaVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdze
                @Override // java.lang.Runnable
                public final void run() {
                    zzdzg.this.zza();
                }
            }, zzcca.zzf);
            return this.zza;
        }
    }

    public final ListenableFuture zzc(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzgbb.zzg(new zzdzp(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzf
                @Override // java.lang.Runnable
                public final void run() {
                    zzdzg.this.zza();
                }
            }, zzcca.zzf);
            return this.zza;
        }
    }
}
