package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzaqm {
    public final int zza;
    public final long zzb;

    private zzaqm(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaqm zza(zzaev zzaevVar, zzer zzerVar) throws IOException {
        zzaevVar.zzi(zzerVar.zzi(), 0, 8);
        zzerVar.zzh(0);
        return new zzaqm(zzerVar.zzB(), zzerVar.zzA());
    }
}
