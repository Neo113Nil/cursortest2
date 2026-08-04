package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzavo extends zzatm {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzavo() {
    }

    public zzavo(String str) {
        HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (Long) zzb.get(0);
            this.zzb = (Boolean) zzb.get(1);
            this.zzc = (Boolean) zzb.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    protected final HashMap zza() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }
}
