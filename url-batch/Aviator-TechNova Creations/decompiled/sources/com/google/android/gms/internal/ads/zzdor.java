package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdor {
    public static final zzdor zza = new zzdor(new zzdoq());
    private final zzblt zzb;
    private final zzblq zzc;
    private final zzbmg zzd;
    private final zzbmd zze;
    private final zzbrb zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdor(zzdoq zzdoqVar) {
        this.zzb = zzdoqVar.zza;
        this.zzc = zzdoqVar.zzb;
        this.zzd = zzdoqVar.zzc;
        this.zzg = new SimpleArrayMap(zzdoqVar.zzf);
        this.zzh = new SimpleArrayMap(zzdoqVar.zzg);
        this.zze = zzdoqVar.zzd;
        this.zzf = zzdoqVar.zze;
    }

    /* synthetic */ zzdor(zzdoq zzdoqVar, byte[] bArr) {
        this(zzdoqVar);
    }

    public final zzblt zza() {
        return this.zzb;
    }

    public final zzblq zzb() {
        return this.zzc;
    }

    public final zzbmg zzc() {
        return this.zzd;
    }

    public final zzbmd zzd() {
        return this.zze;
    }

    public final zzbrb zze() {
        return this.zzf;
    }

    public final zzblz zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzblz) this.zzg.get(str);
    }

    public final zzblw zzg(String str) {
        return (zzblw) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.getSize());
        for (int i = 0; i < simpleArrayMap.getSize(); i++) {
            arrayList.add((String) simpleArrayMap.keyAt(i));
        }
        return arrayList;
    }
}
