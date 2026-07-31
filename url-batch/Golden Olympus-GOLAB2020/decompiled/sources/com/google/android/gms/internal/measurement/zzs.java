package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzt zztVar, boolean z4, boolean z5) {
        super("log");
        this.zzc = zztVar;
        this.zza = z4;
        this.zzb = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    @Override // com.google.android.gms.internal.measurement.zzai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zza(zzg zzgVar, List list) {
        int i4;
        int i5;
        zzr zzrVar;
        zzr zzrVar2;
        zzr zzrVar3;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            zzrVar3 = this.zzc.zza;
            zzrVar3.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.EMPTY_LIST, this.zza, this.zzb);
            return zzap.zzf;
        }
        int zzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (zzb != 2) {
            i4 = 3;
            if (zzb == 3) {
                i5 = 1;
            } else if (zzb == 5) {
                i5 = 5;
            } else if (zzb == 6) {
                i5 = 2;
            }
            String zzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            if (list.size() != 2) {
                zzt zztVar = this.zzc;
                boolean z4 = this.zza;
                boolean z5 = this.zzb;
                zzrVar2 = zztVar.zza;
                zzrVar2.zza(i5, zzi, Collections.EMPTY_LIST, z4, z5);
                return zzap.zzf;
            }
            ArrayList arrayList = new ArrayList();
            for (int i6 = 2; i6 < Math.min(list.size(), 5); i6++) {
                arrayList.add(zzgVar.zzb((zzap) list.get(i6)).zzi());
            }
            zzt zztVar2 = this.zzc;
            boolean z6 = this.zza;
            boolean z7 = this.zzb;
            zzrVar = zztVar2.zza;
            zzrVar.zza(i5, zzi, arrayList, z6, z7);
            return zzap.zzf;
        }
        i4 = 4;
        i5 = i4;
        String zzi2 = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() != 2) {
        }
    }
}
