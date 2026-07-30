package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzalz {
    public static void zza(zzama zzamaVar, zzame zzameVar, zzdr zzdrVar) {
        for (int i = 0; i < zzamaVar.zza(); i++) {
            long zzb = zzamaVar.zzb(i);
            List zzc = zzamaVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i == zzamaVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long zzb2 = zzamaVar.zzb(i + 1) - zzamaVar.zzb(i);
                if (zzb2 > 0) {
                    zzdrVar.zza(new zzalx(zzc, zzb, zzb2));
                }
            }
        }
    }
}
