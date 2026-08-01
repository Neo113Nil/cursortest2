package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzdtk;
import com.google.android.gms.internal.ads.zzdtu;
import com.google.android.gms.internal.ads.zzgax;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzz implements zzgax {
    final /* synthetic */ zzaa zza;

    zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzdtu zzdtuVar;
        zzdtk zzdtkVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        AtomicInteger atomicInteger2;
        com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.zza;
        zzdtuVar = zzaaVar.zzr;
        zzdtkVar = zzaaVar.zzj;
        atomicInteger = this.zza.zzJ;
        zzf.zzc(zzdtuVar, zzdtkVar, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        zzcbn.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) zzba.zzc().zza(zzbdc.zzjs)).booleanValue()) {
            atomicBoolean = this.zza.zzI;
            if (atomicBoolean.get()) {
                return;
            }
            atomicInteger2 = this.zza.zzJ;
            if (atomicInteger2.getAndIncrement() < ((Integer) zzba.zzc().zza(zzbdc.zzjt)).intValue()) {
                this.zza.zzV();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdtu zzdtuVar;
        zzdtk zzdtkVar;
        AtomicInteger atomicInteger;
        AtomicBoolean atomicBoolean;
        zzcbn.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzba.zzc().zza(zzbdc.zzjs)).booleanValue()) {
            zzaa zzaaVar = this.zza;
            zzdtuVar = zzaaVar.zzr;
            zzdtkVar = zzaaVar.zzj;
            atomicInteger = zzaaVar.zzJ;
            zzf.zzc(zzdtuVar, zzdtkVar, "sgs", new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
            atomicBoolean = this.zza.zzI;
            atomicBoolean.set(true);
        }
    }
}
