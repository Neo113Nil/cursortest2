package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaxx {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzaxt(this);
    private final Object zzc = new Object();
    private zzaya zzd;
    private Context zze;
    private zzayd zzf;

    static /* bridge */ /* synthetic */ void zzh(zzaxx zzaxxVar) {
        synchronized (zzaxxVar.zzc) {
            zzaya zzayaVar = zzaxxVar.zzd;
            if (zzayaVar == null) {
                return;
            }
            if (zzayaVar.isConnected() || zzaxxVar.zzd.isConnecting()) {
                zzaxxVar.zzd.disconnect();
            }
            zzaxxVar.zzd = null;
            zzaxxVar.zzf = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                zzaya zzd = zzd(new zzaxv(this), new zzaxw(this));
                this.zzd = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzayb zzaybVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zze(zzaybVar);
                } catch (RemoteException e) {
                    zzcbn.zzh("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    public final zzaxy zzb(zzayb zzaybVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzaxy();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzaybVar);
                }
                return this.zzf.zzf(zzaybVar);
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to call into cache service.", e);
                return new zzaxy();
            }
        }
    }

    protected final synchronized zzaya zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzaya(this.zze, com.google.android.gms.ads.internal.zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzec)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeb)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new zzaxu(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzed)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcca.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzee)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
