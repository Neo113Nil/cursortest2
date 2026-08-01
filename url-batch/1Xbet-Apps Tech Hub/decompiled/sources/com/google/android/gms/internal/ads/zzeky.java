package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeky implements zzegb {
    private final Context zza;
    private final Executor zzb;
    private final zzdqd zzc;

    public zzeky(Context context, Executor executor, zzdqd zzdqdVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdqdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) {
        try {
            ((zzffm) zzefyVar.zzb).zzk(zzfehVar.zza.zza.zzd, zzfduVar.zzw.toString());
        } catch (Exception e) {
            zzcbn.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefyVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, zzfdu zzfduVar, final zzefy zzefyVar) throws zzfev, zzejt {
        zzdpz zze = this.zzc.zze(new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza), new zzdqa(new zzdig() { // from class: com.google.android.gms.internal.ads.zzeku
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(boolean z, Context context, zzcyu zzcyuVar) {
                zzefy zzefyVar2 = zzefy.this;
                try {
                    ((zzffm) zzefyVar2.zzb).zzv(z);
                    ((zzffm) zzefyVar2.zzb).zzA();
                } catch (zzfev e) {
                    zzcbn.zzk("Cannot show rewarded video.", e);
                    throw new zzdif(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcpf((zzffm) zzefyVar.zzb), this.zzb);
        zzczo zze2 = zze.zze();
        zzcyf zzb = zze.zzb();
        ((zzehs) zzefyVar.zzc).zzc(new zzekx(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        if (((zzffm) zzefyVar.zzb).zzC()) {
            zze(zzfehVar, zzfduVar, zzefyVar);
            return;
        }
        ((zzehs) zzefyVar.zzc).zzd(new zzekw(this, zzfehVar, zzfduVar, zzefyVar));
        Object obj = zzefyVar.zzb;
        Context context = this.zza;
        zzfeq zzfeqVar = zzfehVar.zza.zza;
        ((zzffm) obj).zzh(context, zzfeqVar.zzd, null, (zzbxb) zzefyVar.zzc, zzfduVar.zzw.toString());
    }
}
