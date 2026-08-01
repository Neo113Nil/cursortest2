package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzepl implements zzeuy {
    private final zzgbl zza;
    private final zzdrk zzb;
    private final zzdvs zzc;
    private final zzepn zzd;

    public zzepl(zzgbl zzgblVar, zzdrk zzdrkVar, zzdvs zzdvsVar, zzepn zzepnVar) {
        this.zza = zzgblVar;
        this.zzb = zzdrkVar;
        this.zzc = zzdvsVar;
        this.zzd = zzepnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkO)).booleanValue() && this.zzd.zza() != null) {
            zzepm zza = this.zzd.zza();
            zza.getClass();
            return zzgbb.zzh(zza);
        }
        if (!zzfun.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbp))) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkO)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt())) {
                this.zzd.zzc(true);
                return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzepl.this.zzc();
                    }
                });
            }
        }
        return zzgbb.zzh(new zzepm(new Bundle()));
    }

    final /* synthetic */ zzepm zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbp)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzffm zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzC();
                boolean zzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkO)).booleanValue() || zzt) {
                    try {
                        zzbsd zzf = zzc.zzf();
                        if (zzf != null) {
                            bundle2.putString("sdk_version", zzf.toString());
                        }
                    } catch (zzfev unused) {
                    }
                }
                try {
                    zzbsd zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfev unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfev unused3) {
            }
        }
        zzepm zzepmVar = new zzepm(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkO)).booleanValue()) {
            this.zzd.zzb(zzepmVar);
        }
        return zzepmVar;
    }
}
