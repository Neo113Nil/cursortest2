package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzalg implements zzagc {
    public final int zza;
    public final zzgxx zzb;

    public zzalg(int i, int[] iArr) {
        this.zza = i;
        this.zzb = iArr != null ? zzgxx.zzb(iArr) : zzgxx.zza();
    }

    public final String toString() {
        zzgxx zzgxxVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgxxVar.zzc());
        for (int i = 0; i < zzgxxVar.zzc(); i++) {
            arrayList.add(zzfj.zzx(zzgxxVar.zzd(i)));
        }
        String zzx = zzfj.zzx(this.zza);
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
