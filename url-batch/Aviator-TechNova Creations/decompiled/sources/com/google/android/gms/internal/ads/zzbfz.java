package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbfz {
    private zzbfo zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbfz(Context context) {
        this.zzc = context;
    }

    final Future zza(zzbfp zzbfpVar) {
        zzbft zzbftVar = new zzbft(this);
        zzbfx zzbfxVar = new zzbfx(this, zzbfpVar, zzbftVar);
        zzbfy zzbfyVar = new zzbfy(this, zzbftVar);
        synchronized (this.zzd) {
            zzbfo zzbfoVar = new zzbfo(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbfxVar, zzbfyVar);
            this.zza = zzbfoVar;
            zzbfoVar.checkAvailabilityAndConnect();
        }
        return zzbftVar;
    }

    final /* synthetic */ zzbfo zzc() {
        return this.zza;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzb = true;
    }

    final /* synthetic */ Object zzf() {
        return this.zzd;
    }

    final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            zzbfo zzbfoVar = this.zza;
            if (zzbfoVar == null) {
                return;
            }
            zzbfoVar.disconnect();
            this.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
