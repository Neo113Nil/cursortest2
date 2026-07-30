package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgez {
    private final zzgzy zza;
    private final zzgfe zzb;
    private final Set zzc;
    private final String zzd;
    private final zzawg zze;
    private final zzgfx zzf;
    private final zzgoe zzg;

    zzgez(zzgzy zzgzyVar, zzgfe zzgfeVar, zzgfx zzgfxVar, zzgcc zzgccVar, String str, zzawg zzawgVar, zzikv zzikvVar, zzikv zzikvVar2, zzikv zzikvVar3, zzgoe zzgoeVar) {
        this.zza = zzgzyVar;
        this.zzb = zzgfeVar;
        this.zzd = str;
        this.zzf = zzgfxVar;
        this.zze = zzawgVar;
        this.zzg = zzgoeVar;
        int ordinal = zzgccVar.ordinal();
        if (ordinal == 0) {
            this.zzc = ((zziks) zzikvVar).zzb();
        } else if (ordinal == 1) {
            this.zzc = ((zziks) zzikvVar2).zzb();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            this.zzc = ((zziks) zzikvVar3).zzb();
        }
    }

    final ListenableFuture zza() {
        if (!this.zzb.zzc()) {
            return zzgzo.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgey
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzgez.this.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.submit((zzgha) it.next()));
        }
        return zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzgew
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgez.this.zzc();
            }
        }, zzhaf.zza());
    }

    final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgex
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgez.this.zzd();
            }
        };
        zzgoc zza = this.zzg.zza(101);
        try {
            zza.zza();
            Object call = callable.call();
            zza.zzc();
            return (String) call;
        } finally {
        }
    }

    final /* synthetic */ String zzd() {
        zzaxg zzaxgVar = (zzaxg) this.zze.zzbu();
        String str = this.zzd;
        zzgfe zzgfeVar = this.zzb;
        try {
            return Base64.encodeToString(((zzaxx) zzgfeVar.zzf(zzaxgVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzgfeVar.zzg(4096, str);
        }
    }
}
