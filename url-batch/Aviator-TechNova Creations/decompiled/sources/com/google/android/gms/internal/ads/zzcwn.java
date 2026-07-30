package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcwn implements zzens {
    public final List zza;

    public zzcwn(zzcwf zzcwfVar) {
        this.zza = Collections.singletonList(zzgzo.zza(zzcwfVar));
    }

    public zzcwn(List list) {
        this.zza = list;
    }

    public static zzekg zza(zzemm zzemmVar) {
        return new zzekh(zzemmVar, zzcwm.zza);
    }

    public static zzekg zzb(zzekg zzekgVar) {
        return new zzekh(zzekgVar, zzcwl.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzens
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgzo.zzr((ListenableFuture) it.next(), new zzcwk(this), zzhaf.zza());
        }
    }
}
