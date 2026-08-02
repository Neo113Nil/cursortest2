package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaob {
    public final int zza;
    public final long zzb;

    private zzaob(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaob zza(zzacl zzaclVar, zzek zzekVar) throws IOException {
        ((zzaby) zzaclVar).zzm(zzekVar.zzM(), 0, 8, false);
        zzekVar.zzK(0);
        return new zzaob(zzekVar.zzg(), zzekVar.zzs());
    }
}
