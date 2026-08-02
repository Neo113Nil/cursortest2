package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbwq implements RewardItem {
    private final zzbwd zza;

    public zzbwq(zzbwd zzbwdVar) {
        this.zza = zzbwdVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbwd zzbwdVar = this.zza;
        if (zzbwdVar != null) {
            try {
                return zzbwdVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbwd zzbwdVar = this.zza;
        if (zzbwdVar != null) {
            try {
                return zzbwdVar.zzf();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
