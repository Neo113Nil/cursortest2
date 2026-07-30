package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfks implements zzdbi {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcdz zzc;

    public zzfks(Context context, zzcdz zzcdzVar) {
        this.zzb = context;
        this.zzc = zzcdzVar;
    }

    public final synchronized void zzb(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle zzc() {
        return this.zzc.zzo(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final synchronized void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzc(this.zza);
        }
    }
}
