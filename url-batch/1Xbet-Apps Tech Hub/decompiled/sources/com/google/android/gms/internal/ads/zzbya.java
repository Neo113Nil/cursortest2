package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbya extends zzbxf {
    private final String zza;
    private final int zzb;

    public zzbya(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzbya(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
