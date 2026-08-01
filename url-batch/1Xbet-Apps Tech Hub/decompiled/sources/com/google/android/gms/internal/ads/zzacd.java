package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzacd implements zzadk {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzadk
    public final /* synthetic */ int zzf(zzt zztVar, int i, boolean z) {
        return zzadi.zza(this, zztVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final int zzg(zzt zztVar, int i, boolean z, int i2) throws IOException {
        int zza = zztVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza != -1) {
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzl(zzam zzamVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final /* synthetic */ void zzr(zzfj zzfjVar, int i) {
        zzadi.zzb(this, zzfjVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzs(zzfj zzfjVar, int i, int i2) {
        zzfjVar.zzH(i);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzt(long j, int i, int i2, int i3, zzadj zzadjVar) {
    }
}
