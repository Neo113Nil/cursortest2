package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaiw implements zzadz {
    public final int zza;
    public final zzgnc zzb;

    public zzaiw(int i, int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? zzgnc.zzb(iArr) : zzgnc.zza();
    }

    public final String toString() {
        zzgnc zzgncVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgncVar.zzc());
        for (int i = 0; i < zzgncVar.zzc(); i++) {
            arrayList.add(zzeo.zzx(zzgncVar.zzd(i)));
        }
        String zzx = zzeo.zzx(this.zza);
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder(zzx.length() + 37 + obj.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(zzx);
        sb.append(", compatible=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
