package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgbc {
    private final zzgcu zza;
    private final zzgbx zzb;
    private final zzgcg zzc;
    private final zzgea zzd;
    private final long zze;
    private long zzf = 0;

    zzgbc(zzgcu zzgcuVar, zzgbx zzgbxVar, zzgcg zzgcgVar, zzgea zzgeaVar, zzftp zzftpVar, long j) {
        this.zza = zzgcuVar;
        this.zzb = zzgbxVar;
        this.zzc = zzgcgVar;
        this.zzd = zzgeaVar;
        this.zze = j;
    }

    final ListenableFuture zza() {
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.zzf < this.zze) {
                return zzgot.zza(zzgbb.RESULT_NOOP_TOO_FREQUENT);
            }
            this.zzf = currentTimeMillis;
            return (zzgol) zzgot.zzg((zzgol) zzgot.zzg((zzgol) zzgot.zzg((zzgol) zzgot.zzj((zzgol) zzgot.zzk((zzgol) zzgot.zzg(zzgol.zzw(this.zzc.zza()), Throwable.class, zzgba.zza, zzgpk.zza()), new zzggr() { // from class: com.google.android.gms.internal.ads.zzgar
                @Override // com.google.android.gms.internal.ads.zzggr
                public final /* synthetic */ Object apply(Object obj) {
                    zzgbc.this.zzb((zzfwm) obj);
                    return new Integer(0);
                }
            }, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgas
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzgbc.this.zzc((Integer) obj);
                }
            }, zzgpk.zza()), zzgap.class, zzgat.zza, zzgpk.zza()), zzgao.class, zzgau.zza, zzgpk.zza()), zzgaq.class, zzgav.zza, zzgpk.zza());
        }
    }

    final /* synthetic */ int zzb(zzfwm zzfwmVar) {
        if (this.zza.zza(zzfwmVar)) {
            return 0;
        }
        throw new zzgap(null);
    }

    final /* synthetic */ ListenableFuture zzc(Integer num) {
        zzgol zzgolVar = (zzgol) zzgot.zzk((zzgol) zzgot.zzj((zzgol) zzgot.zzk(zzgol.zzw(this.zzb.zza()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzgaw
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzfwk zzfwkVar = (zzfwk) obj;
                int zzj = zzfwkVar.zzj() - 1;
                if (zzj == 1 || zzj == 2) {
                    return zzfwkVar;
                }
                if (zzj != 3) {
                    throw new zzgao(zzfwkVar.zzj() - 1);
                }
                throw new zzgaq(zzfwkVar.zzj() - 1);
            }
        }, zzgpk.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzgax
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgbc.this.zzd((zzfwk) obj);
            }
        }, zzgpk.zza()), zzgay.zza, zzgpk.zza());
        this.zzd.zze(1002, zzgolVar);
        return zzgolVar;
    }

    final /* synthetic */ ListenableFuture zzd(zzfwk zzfwkVar) {
        ArrayList arrayList = new ArrayList();
        zzgcg zzgcgVar = this.zzc;
        arrayList.add(zzgcgVar.zzb(zzfwkVar.zza()));
        if (zzfwkVar.zzj() == 2) {
            arrayList.add(zzgcgVar.zzc(zzfwkVar.zzb().zzv()));
        } else if (zzfwkVar.zzj() == 3) {
            arrayList.add(zzgcgVar.zzc(zzfwkVar.zzb().zzv()));
            arrayList.add(zzgcgVar.zze(zzfwkVar.zzc().zzv()));
        }
        return zzgot.zzk(zzgot.zzl(arrayList), zzgaz.zza, zzgpk.zza());
    }
}
