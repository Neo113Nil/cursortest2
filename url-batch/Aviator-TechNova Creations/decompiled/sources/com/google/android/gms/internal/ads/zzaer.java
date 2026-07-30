package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaer implements zzagh {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        int zza = zzjVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza != -1) {
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i, int i2) {
        zzerVar.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, int i, int i2, int i3, zzagg zzaggVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
    }
}
