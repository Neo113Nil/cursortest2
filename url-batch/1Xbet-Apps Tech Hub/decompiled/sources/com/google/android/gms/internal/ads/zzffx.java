package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzffx implements zzcyk {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcba zzc;

    public zzffx(Context context, zzcba zzcbaVar) {
        this.zzb = context;
        this.zzc = zzcbaVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final synchronized void zzbG(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzl(this.zza);
        }
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
