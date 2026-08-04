package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfxo {
    private final zzgpd zza;
    private final zzfxt zzb;
    private final Set zzc;
    private final String zzd;
    private final zzarw zze;
    private final zzfym zzf;
    private final zzgea zzg;

    zzfxo(zzgpd zzgpdVar, zzfxt zzfxtVar, zzfym zzfymVar, zzfvd zzfvdVar, String str, zzarw zzarwVar, zzhqm zzhqmVar, zzhqm zzhqmVar2, zzhqm zzhqmVar3, zzgea zzgeaVar) {
        this.zza = zzgpdVar;
        this.zzb = zzfxtVar;
        this.zzd = str;
        this.zzf = zzfymVar;
        this.zze = zzarwVar;
        this.zzg = zzgeaVar;
        int ordinal = zzfvdVar.ordinal();
        if (ordinal == 0) {
            this.zzc = ((zzhqj) zzhqmVar).zzb();
        } else if (ordinal == 1) {
            this.zzc = ((zzhqj) zzhqmVar2).zzb();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            this.zzc = ((zzhqj) zzhqmVar3).zzb();
        }
    }

    final ListenableFuture zza() {
        if (!this.zzb.zzc()) {
            return zzgot.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfxn
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzfxo.this.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.submit((zzfzp) it.next()));
        }
        return zzgot.zzm(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfxl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfxo.this.zzc();
            }
        }, zzgpk.zza());
    }

    final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfxm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfxo.this.zzd();
            }
        };
        zzgdy zza = this.zzg.zza(101);
        try {
            zza.zza();
            Object call = callable.call();
            zza.zzc();
            return (String) call;
        } finally {
        }
    }

    final /* synthetic */ String zzd() {
        zzast zzastVar = (zzast) this.zze.zzbu();
        String str = this.zzd;
        zzfxt zzfxtVar = this.zzb;
        try {
            return Base64.encodeToString(((zzatk) zzfxtVar.zzf(zzastVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzfxtVar.zzg(4096, str);
        }
    }
}
