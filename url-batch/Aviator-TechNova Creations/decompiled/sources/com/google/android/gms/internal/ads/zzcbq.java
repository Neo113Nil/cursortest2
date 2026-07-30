package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcbq extends zzcav {
    private final String zza;
    private final int zzb;

    public zzcbq(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzcbq(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
