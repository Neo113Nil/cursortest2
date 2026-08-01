package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfoc implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfpa zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfnt zzf;
    private final long zzg;
    private final int zzh;

    public zzfoc(Context context, int i, int i2, String str, String str2, String str3, zzfnt zzfntVar) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfntVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfpa zzfpaVar = new zzfpa(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfpaVar;
        this.zzd = new LinkedBlockingQueue();
        zzfpaVar.checkAvailabilityAndConnect();
    }

    static zzfpm zza() {
        return new zzfpm(null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfpf zzd = zzd();
        if (zzd != null) {
            try {
                zzfpm zzf = zzd.zzf(new zzfpk(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, null);
                this.zzd.put(zzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zze(4011, this.zzg, null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfpm zzb(int i) {
        zzfpm zzfpmVar;
        try {
            zzfpmVar = (zzfpm) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e);
            zzfpmVar = null;
        }
        zze(3004, this.zzg, null);
        if (zzfpmVar != null) {
            if (zzfpmVar.zzc == 7) {
                zzfnt.zzg(3);
            } else {
                zzfnt.zzg(2);
            }
        }
        return zzfpmVar == null ? zza() : zzfpmVar;
    }

    public final void zzc() {
        zzfpa zzfpaVar = this.zza;
        if (zzfpaVar != null) {
            if (zzfpaVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfpf zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
