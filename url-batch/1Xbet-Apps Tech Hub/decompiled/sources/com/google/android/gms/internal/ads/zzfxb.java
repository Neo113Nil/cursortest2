package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfxb extends zzfuv {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzftz zzb;

    zzfxb(Iterator it, zzftz zzftzVar) {
        this.zza = it;
        this.zzb = zzftzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuv
    @CheckForNull
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Iterator it = this.zza;
            zzftz zzftzVar = this.zzb;
            Object next = it.next();
            if (zzftzVar.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
