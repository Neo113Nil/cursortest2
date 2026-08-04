package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzkx implements zzva, zzrq {
    final /* synthetic */ zzlc zza;
    private final zzkz zzb;

    public zzkx(zzlc zzlcVar, zzkz zzkzVar) {
        Objects.requireNonNull(zzlcVar);
        this.zza = zzlcVar;
        this.zzb = zzkzVar;
    }

    private final Pair zzf(int i, zzup zzupVar) {
        zzup zzupVar2;
        zzup zzupVar3 = null;
        if (zzupVar != null) {
            zzkz zzkzVar = this.zzb;
            int i2 = 0;
            while (true) {
                List list = zzkzVar.zzc;
                if (i2 >= list.size()) {
                    zzupVar2 = null;
                    break;
                }
                if (((zzup) list.get(i2)).zzd == zzupVar.zzd) {
                    Object obj = zzupVar.zza;
                    Object obj2 = zzkzVar.zzb;
                    int i3 = zzlj.zzb;
                    zzupVar2 = zzupVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (zzupVar2 == null) {
                return null;
            }
            zzupVar3 = zzupVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzupVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcT(int i, zzup zzupVar, final zzug zzugVar, final zzul zzulVar, final int i2) {
        final Pair zzf = zzf(0, zzupVar);
        if (zzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzkx.this.zza.zzi().zzcT(((Integer) pair.first).intValue(), (zzup) pair.second, zzugVar, zzulVar, i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcU(int i, zzup zzupVar, final zzug zzugVar, final zzul zzulVar) {
        final Pair zzf = zzf(0, zzupVar);
        if (zzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzkx.this.zza.zzi().zzcU(((Integer) pair.first).intValue(), (zzup) pair.second, zzugVar, zzulVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcV(int i, zzup zzupVar, final zzug zzugVar, final zzul zzulVar) {
        final Pair zzf = zzf(0, zzupVar);
        if (zzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzkx.this.zza.zzi().zzcV(((Integer) pair.first).intValue(), (zzup) pair.second, zzugVar, zzulVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcW(int i, zzup zzupVar, final zzug zzugVar, final zzul zzulVar, final IOException iOException, final boolean z) {
        final Pair zzf = zzf(0, zzupVar);
        if (zzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzkx.this.zza.zzi().zzcW(((Integer) pair.first).intValue(), (zzup) pair.second, zzugVar, zzulVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcX(int i, zzup zzupVar, final zzul zzulVar) {
        final Pair zzf = zzf(0, zzupVar);
        if (zzf != null) {
            zzlc zzlcVar = this.zza;
            zzlcVar.zzj().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzkx.this.zza.zzi().zzcX(((Integer) pair.first).intValue(), (zzup) pair.second, zzulVar);
                }
            });
        }
    }
}
