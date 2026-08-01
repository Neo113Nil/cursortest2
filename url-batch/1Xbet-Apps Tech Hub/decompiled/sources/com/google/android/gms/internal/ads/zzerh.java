package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzerh implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzerh(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqy(((zzeqt) this.zza).zzb(), WorkRequest.MIN_BACKOFF_MILLIS, (Clock) this.zzb.zzb());
    }
}
