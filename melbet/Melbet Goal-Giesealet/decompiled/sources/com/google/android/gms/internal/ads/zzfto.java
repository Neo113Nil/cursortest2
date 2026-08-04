package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfto {
    private static zzfto zzb;
    final zzftk zza;

    private zzfto(Context context) {
        this.zza = zzftk.zza(context);
        zzftj.zza(context);
    }

    public static final zzfto zza(Context context) {
        zzfto zzftoVar;
        synchronized (zzfto.class) {
            if (zzb == null) {
                zzb = new zzfto(context);
            }
            zzftoVar = zzb;
        }
        return zzftoVar;
    }

    public final void zzb(zzfti zzftiVar) throws IOException {
        synchronized (zzfto.class) {
            zzftk zzftkVar = this.zza;
            zzftkVar.zzf("vendor_scoped_gpid_v2_id");
            zzftkVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
