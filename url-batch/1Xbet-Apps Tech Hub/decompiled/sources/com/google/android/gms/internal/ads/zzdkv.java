package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdkv {
    public static final zzdkv zza = new zzdkv(new zzdkt());
    private final zzbhj zzb;
    private final zzbhg zzc;
    private final zzbhw zzd;
    private final zzbht zze;
    private final zzbmv zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdkv(zzdkt zzdktVar) {
        this.zzb = zzdktVar.zza;
        this.zzc = zzdktVar.zzb;
        this.zzd = zzdktVar.zzc;
        this.zzg = new SimpleArrayMap(zzdktVar.zzf);
        this.zzh = new SimpleArrayMap(zzdktVar.zzg);
        this.zze = zzdktVar.zzd;
        this.zzf = zzdktVar.zze;
    }

    public final zzbhg zza() {
        return this.zzc;
    }

    public final zzbhj zzb() {
        return this.zzb;
    }

    public final zzbhm zzc(String str) {
        return (zzbhm) this.zzh.get(str);
    }

    public final zzbhp zzd(String str) {
        return (zzbhp) this.zzg.get(str);
    }

    public final zzbht zze() {
        return this.zze;
    }

    public final zzbhw zzf() {
        return this.zzd;
    }

    public final zzbmv zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
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
}
