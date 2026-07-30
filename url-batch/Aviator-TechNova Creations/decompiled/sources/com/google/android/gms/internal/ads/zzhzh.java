package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhzh extends zzhys {
    static final zzhzh zza = new zzhzh();

    private zzhzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(zzhzs zzhzsVar, zzhyl zzhylVar) throws IOException {
        if (zzhylVar == null || (zzhylVar instanceof zzhym)) {
            zzhzsVar.zzj();
            return;
        }
        if (zzhylVar instanceof zzhyp) {
            zzhyp zzg = zzhylVar.zzg();
            if (zzg.zzc()) {
                zzhzsVar.zzi(zzg.zzh());
                return;
            } else if (zzg.zza()) {
                zzhzsVar.zzh(zzg.zzb());
                return;
            } else {
                zzhzsVar.zzg(zzg.zzd());
                return;
            }
        }
        if (zzhylVar instanceof zzhyk) {
            zzhzsVar.zzb();
            Iterator it = zzhylVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzhzsVar, (zzhyl) it.next());
            }
            zzhzsVar.zzc();
            return;
        }
        if (!(zzhylVar instanceof zzhyn)) {
            String valueOf = String.valueOf(zzhylVar.getClass());
            String.valueOf(valueOf);
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(valueOf)));
        }
        zzhzsVar.zzd();
        for (Map.Entry entry : zzhylVar.zze().zzb()) {
            zzhzsVar.zzf((String) entry.getKey());
            zza(zzhzsVar, (zzhyl) entry.getValue());
        }
        zzhzsVar.zze();
    }
}
