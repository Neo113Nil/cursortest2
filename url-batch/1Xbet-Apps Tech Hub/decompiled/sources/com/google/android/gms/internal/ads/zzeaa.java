package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeaa {
    private final zzgbl zza;
    private final zzdzg zzb;
    private final zzhdj zzc;
    private final zzfkk zzd;
    private final Context zze;
    private final zzcbt zzf;

    public zzeaa(zzgbl zzgblVar, zzdzg zzdzgVar, zzhdj zzhdjVar, zzfkk zzfkkVar, Context context, zzcbt zzcbtVar) {
        this.zza = zzgblVar;
        this.zzb = zzdzgVar;
        this.zzc = zzhdjVar;
        this.zzd = zzfkkVar;
        this.zze = context;
        this.zzf = zzcbtVar;
    }

    private final ListenableFuture zzh(final zzbwa zzbwaVar, zzdzz zzdzzVar, final zzdzz zzdzzVar2, final zzgai zzgaiVar) {
        ListenableFuture zzf;
        String str = zzbwaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzB(str)) {
            zzf = zzgbb.zzg(new zzdzp(1));
        } else {
            zzf = zzgbb.zzf(zzdzzVar.zza(zzbwaVar), ExecutionException.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdzy
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    ExecutionException executionException = (ExecutionException) obj;
                    Throwable cause = executionException.getCause();
                    Throwable th = executionException;
                    if (cause != null) {
                        th = executionException.getCause();
                    }
                    return zzgbb.zzg(th);
                }
            }, this.zza);
        }
        return zzgbb.zzf(zzgbb.zzn(zzgas.zzu(zzf), zzgaiVar, this.zza), zzdzp.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdzx
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeaa.this.zzc(zzdzzVar2, zzbwaVar, zzgaiVar, (zzdzp) obj);
            }
        }, this.zza);
    }

    public final ListenableFuture zza(final zzbwa zzbwaVar) {
        zzgai zzgaiVar = new zzgai() { // from class: com.google.android.gms.internal.ads.zzdzu
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                String str = new String(zzfyx.zza((InputStream) obj), zzftl.zzc);
                zzbwa zzbwaVar2 = zzbwa.this;
                zzbwaVar2.zzj = str;
                return zzgbb.zzh(zzbwaVar2);
            }
        };
        final zzdzg zzdzgVar = this.zzb;
        return zzh(zzbwaVar, new zzdzz() { // from class: com.google.android.gms.internal.ads.zzdzv
            @Override // com.google.android.gms.internal.ads.zzdzz
            public final ListenableFuture zza(zzbwa zzbwaVar2) {
                return zzdzg.this.zzb(zzbwaVar2);
            }
        }, new zzdzz() { // from class: com.google.android.gms.internal.ads.zzdzw
            @Override // com.google.android.gms.internal.ads.zzdzz
            public final ListenableFuture zza(zzbwa zzbwaVar2) {
                return zzeaa.this.zzd(zzbwaVar2);
            }
        }, zzgaiVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject) {
        return zzgbb.zzn(zzgas.zzu(zzgbb.zzh(jSONObject)), com.google.android.gms.ads.internal.zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbor.zza, new zzbom() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // com.google.android.gms.internal.ads.zzbom
            public final Object zza(JSONObject jSONObject2) {
                return new zzbwd(jSONObject2);
            }
        }), this.zza);
    }

    final /* synthetic */ ListenableFuture zzc(zzdzz zzdzzVar, zzbwa zzbwaVar, zzgai zzgaiVar, zzdzp zzdzpVar) throws Exception {
        return zzgbb.zzn(zzdzzVar.zza(zzbwaVar), zzgaiVar, this.zza);
    }

    final /* synthetic */ ListenableFuture zzd(zzbwa zzbwaVar) {
        return ((zzebw) this.zzc.zzb()).zzb(zzbwaVar, Binder.getCallingUid());
    }

    final /* synthetic */ ListenableFuture zze(zzbwa zzbwaVar) {
        return this.zzb.zzc(zzbwaVar.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(zzbwa zzbwaVar) {
        return ((zzebw) this.zzc.zzb()).zzi(zzbwaVar.zzh);
    }

    public final ListenableFuture zzg(zzbwa zzbwaVar) {
        return zzh(zzbwaVar, new zzdzz() { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // com.google.android.gms.internal.ads.zzdzz
            public final ListenableFuture zza(zzbwa zzbwaVar2) {
                return zzeaa.this.zze(zzbwaVar2);
            }
        }, new zzdzz() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzdzz
            public final ListenableFuture zza(zzbwa zzbwaVar2) {
                return zzeaa.this.zzf(zzbwaVar2);
            }
        }, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzh(null);
            }
        });
    }
}
