package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzale implements zzakx {
    final /* synthetic */ zzalg zza;
    private final zzfi zzb = new zzfi(new byte[4], 4);

    public zzale(zzalg zzalgVar) {
        this.zza = zzalgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final void zza(zzfj zzfjVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (zzfjVar.zzl() == 0 && (zzfjVar.zzl() & 128) != 0) {
            zzfjVar.zzH(6);
            int zza = zzfjVar.zza() / 4;
            for (int i2 = 0; i2 < zza; i2++) {
                zzfjVar.zzB(this.zzb, 4);
                zzfi zzfiVar = this.zzb;
                int zzd = zzfiVar.zzd(16);
                zzfiVar.zzl(3);
                if (zzd == 0) {
                    this.zzb.zzl(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzf;
                    if (sparseArray2.get(zzd2) == null) {
                        zzalg zzalgVar = this.zza;
                        sparseArray3 = zzalgVar.zzf;
                        sparseArray3.put(zzd2, new zzaky(new zzalf(zzalgVar, zzd2)));
                        zzalg zzalgVar2 = this.zza;
                        i = zzalgVar2.zzl;
                        zzalgVar2.zzl = i + 1;
                    }
                }
            }
            sparseArray = this.zza.zzf;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final void zzb(zzfq zzfqVar, zzach zzachVar, zzalk zzalkVar) {
    }
}
