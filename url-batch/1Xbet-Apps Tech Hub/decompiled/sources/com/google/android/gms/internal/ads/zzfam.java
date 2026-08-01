package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfam implements zzfbl {
    private zzcxo zza;
    private final Executor zzb = zzgbr.zzb();

    public final zzcxo zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfbm zzfbmVar, zzfbk zzfbkVar, zzcxo zzcxoVar) {
        zzcxn zza = zzfbkVar.zza(zzfbmVar.zzb);
        zza.zzb(new zzfbp(true));
        zzcxo zzcxoVar2 = (zzcxo) zza.zzh();
        this.zza = zzcxoVar2;
        final zzcuz zzb = zzcxoVar2.zzb();
        final zzfgm zzfgmVar = new zzfgm();
        return zzgbb.zzm(zzgbb.zzn(zzgas.zzu(zzb.zzj()), new zzgai() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                zzfeh zzfehVar = (zzfeh) obj;
                zzfgmVar.zzb = zzfehVar;
                Iterator it = zzfehVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfdu) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzb.zzi(zzgbb.zzh(zzfehVar));
                    }
                }
                return zzgbb.zzh(null);
            }
        }, this.zzb), new zzftn() { // from class: com.google.android.gms.internal.ads.zzfal
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                zzfgm zzfgmVar2 = zzfgm.this;
                zzfgmVar2.zzc = (zzctr) obj;
                return zzfgmVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfbm zzfbmVar, zzfbk zzfbkVar, Object obj) {
        return zzb(zzfbmVar, zzfbkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
