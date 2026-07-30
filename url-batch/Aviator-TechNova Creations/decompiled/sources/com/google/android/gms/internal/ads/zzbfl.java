package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbfl {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbfh(this);
    private final Object zzc = new Object();
    private zzbfo zzd;
    private Context zze;
    private zzbfr zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzbfo zze = zze(new zzbfj(this), new zzbfk(this));
                this.zzd = zze;
                zze.checkAvailabilityAndConnect();
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzff)).booleanValue()) {
                zzf();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfe)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzbfi(this));
                }
            }
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfg)).booleanValue()) {
            synchronized (this.zzc) {
                zzf();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcei.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfh)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final zzbfm zzc(zzbfp zzbfpVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbfm();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbfpVar);
                }
                return this.zzf.zze(zzbfpVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                return new zzbfm();
            }
        }
    }

    public final long zzd(zzbfp zzbfpVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zzg(zzbfpVar);
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    protected final synchronized zzbfo zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbfo(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            zzbfo zzbfoVar = this.zzd;
            if (zzbfoVar == null) {
                return;
            }
            if (zzbfoVar.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            this.zzd = null;
            this.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    final /* synthetic */ zzbfo zzi() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(zzbfo zzbfoVar) {
        this.zzd = null;
    }

    final /* synthetic */ void zzk(zzbfr zzbfrVar) {
        this.zzf = zzbfrVar;
    }
}
