package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeoy implements zzeup {
    private final zzezj zza;

    zzeoy(zzezj zzezjVar) {
        this.zza = zzezjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        zzezj zzezjVar = this.zza;
        if (zzezjVar == null) {
            return zzgot.zza(new zzeox(null));
        }
        String zza = zzezjVar.zza();
        return Strings.isEmptyOrWhitespace(zza) ? zzgot.zza(new zzeox(null)) : zzgot.zza(new zzeox(zza));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 15;
    }
}
