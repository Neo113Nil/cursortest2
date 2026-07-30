package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzetp implements zzfax {
    private final zzgzy zza;
    private final zzdvp zzb;
    private final zzeak zzc;
    private final zzetr zzd;

    public zzetp(zzgzy zzgzyVar, zzdvp zzdvpVar, zzeak zzeakVar, zzetr zzetrVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdvpVar;
        this.zzc = zzeakVar;
        this.zzd = zzetrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        zzbgv zzbgvVar = zzbhe.zznc;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            zzetr zzetrVar = this.zzd;
            if (zzetrVar.zzd() != null) {
                zzetq zzd = zzetrVar.zzd();
                zzd.getClass();
                return zzgzo.zza(zzd);
            }
        }
        if (zzgrt.zzc((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbX)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzgzo.zza(new zzetq(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeto
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzetp.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 1;
    }

    final /* synthetic */ zzetq zzc() {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbX)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfki zza = this.zzb.zza(str, new JSONObject());
                zza.zzn();
                boolean zze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznc)).booleanValue() || zze) {
                    try {
                        zzbwh zzC = zza.zzC();
                        if (zzC != null) {
                            bundle2.putString("sdk_version", zzC.toString());
                        }
                    } catch (zzfjr unused) {
                    }
                }
                try {
                    zzbwh zzB = zza.zzB();
                    if (zzB != null) {
                        bundle2.putString("adapter_version", zzB.toString());
                    }
                } catch (zzfjr unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfjr unused3) {
            }
        }
        zzetq zzetqVar = new zzetq(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznc)).booleanValue()) {
            this.zzd.zzc(zzetqVar);
        }
        return zzetqVar;
    }
}
