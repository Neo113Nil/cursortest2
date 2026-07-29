package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzcx extends zzbh<Integer, Object> {
    public Long zzro;
    public Boolean zzrp;
    public Boolean zzrq;

    public zzcx() {
    }

    public zzcx(String str) {
        zzj(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    protected final void zzj(String str) {
        HashMap zzk = zzk(str);
        if (zzk != null) {
            this.zzro = (Long) zzk.get(0);
            this.zzrp = (Boolean) zzk.get(1);
            this.zzrq = (Boolean) zzk.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    protected final HashMap<Integer, Object> zzu() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzro);
        hashMap.put(1, this.zzrp);
        hashMap.put(2, this.zzrq);
        return hashMap;
    }
}
