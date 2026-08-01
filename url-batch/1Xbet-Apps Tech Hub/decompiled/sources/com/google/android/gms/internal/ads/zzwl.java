package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzwl {
    public final int zzc;
    private final zzfwu zze;
    private int zzf;
    public static final zzwl zza = new zzwl(new zzdc[0]);
    private static final String zzd = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzwk
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzwl(zzdc... zzdcVarArr) {
        this.zze = zzfwu.zzk(zzdcVarArr);
        this.zzc = zzdcVarArr.length;
        int i = 0;
        while (i < this.zze.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zze.size(); i3++) {
                if (((zzdc) this.zze.get(i)).equals(this.zze.get(i3))) {
                    zzez.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwl zzwlVar = (zzwl) obj;
            if (this.zzc == zzwlVar.zzc && this.zze.equals(zzwlVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zze.hashCode();
        this.zzf = hashCode;
        return hashCode;
    }

    public final int zza(zzdc zzdcVar) {
        int indexOf = this.zze.indexOf(zzdcVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzdc zzb(int i) {
        return (zzdc) this.zze.get(i);
    }
}
