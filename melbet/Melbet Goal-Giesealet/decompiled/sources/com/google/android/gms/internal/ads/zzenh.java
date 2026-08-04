package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzenh implements zzeup {
    private final zzgpd zza;
    private final zzdqc zzb;
    private final zzdux zzc;
    private final zzenj zzd;

    public zzenh(zzgpd zzgpdVar, zzdqc zzdqcVar, zzdux zzduxVar, zzenj zzenjVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdqcVar;
        this.zzc = zzduxVar;
        this.zzd = zzenjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        zzbbz zzbbzVar = zzbci.zzmu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            zzenj zzenjVar = this.zzd;
            if (zzenjVar.zzd() != null) {
                zzeni zzd = zzenjVar.zzd();
                zzd.getClass();
                return zzgot.zza(zzd);
            }
        }
        if (zzghs.zzc((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbE)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzgot.zza(new zzeni(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeng
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzenh.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 1;
    }

    final /* synthetic */ zzeni zzc() {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbE)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfea zza = this.zzb.zza(str, new JSONObject());
                zza.zzn();
                boolean zze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmu)).booleanValue() || zze) {
                    try {
                        zzbrl zzC = zza.zzC();
                        if (zzC != null) {
                            bundle2.putString("sdk_version", zzC.toString());
                        }
                    } catch (zzfdj unused) {
                    }
                }
                try {
                    zzbrl zzB = zza.zzB();
                    if (zzB != null) {
                        bundle2.putString("adapter_version", zzB.toString());
                    }
                } catch (zzfdj unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfdj unused3) {
            }
        }
        zzeni zzeniVar = new zzeni(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmu)).booleanValue()) {
            this.zzd.zzc(zzeniVar);
        }
        return zzeniVar;
    }
}
