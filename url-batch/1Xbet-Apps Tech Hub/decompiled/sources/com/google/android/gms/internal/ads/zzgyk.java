package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgyk {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgyk() {
    }

    static /* bridge */ /* synthetic */ zzgve zza(zzgyk zzgykVar, zzgve zzgveVar, zzgve zzgveVar2) {
        zzgykVar.zzb(zzgveVar);
        zzgykVar.zzb(zzgveVar2);
        zzgve zzgveVar3 = (zzgve) zzgykVar.zza.pop();
        while (!zzgykVar.zza.isEmpty()) {
            zzgveVar3 = new zzgyo((zzgve) zzgykVar.zza.pop(), zzgveVar3);
        }
        return zzgveVar3;
    }

    private final void zzb(zzgve zzgveVar) {
        zzgyn zzgynVar;
        if (!zzgveVar.zzh()) {
            if (!(zzgveVar instanceof zzgyo)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgveVar.getClass()))));
            }
            zzgyo zzgyoVar = (zzgyo) zzgveVar;
            zzb(zzgyoVar.zzd);
            zzb(zzgyoVar.zze);
            return;
        }
        int zzc = zzc(zzgveVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int zzc2 = zzgyo.zzc(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzgve) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgveVar);
            return;
        }
        int zzc3 = zzgyo.zzc(zzc);
        zzgve zzgveVar2 = (zzgve) this.zza.pop();
        while (true) {
            zzgynVar = null;
            if (this.zza.isEmpty() || ((zzgve) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzgveVar2 = new zzgyo((zzgve) this.zza.pop(), zzgveVar2);
            }
        }
        zzgyo zzgyoVar2 = new zzgyo(zzgveVar2, zzgveVar);
        while (!this.zza.isEmpty()) {
            int zzc4 = zzc(zzgyoVar2.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgve) arrayDeque2.peek()).zzd() >= zzgyo.zzc(zzc4)) {
                break;
            } else {
                zzgyoVar2 = new zzgyo((zzgve) this.zza.pop(), zzgyoVar2);
            }
        }
        this.zza.push(zzgyoVar2);
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgyo.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgyk(zzgyj zzgyjVar) {
    }
}
