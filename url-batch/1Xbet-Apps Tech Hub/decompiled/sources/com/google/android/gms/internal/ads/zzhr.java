package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhr implements zzgq {
    private final zzgq zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzhr(zzgq zzgqVar) {
        this.zza = zzgqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza = this.zza.zza(bArr, i, i2);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final long zzb(zzgv zzgvVar) throws IOException {
        this.zzc = zzgvVar.zza;
        this.zzd = Collections.emptyMap();
        long zzb = this.zza.zzb(zzgvVar);
        Uri zzc = zzc();
        zzc.getClass();
        this.zzc = zzc;
        this.zzd = zze();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Map zze() {
        return this.zza.zze();
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzf(zzhs zzhsVar) {
        zzhsVar.getClass();
        this.zza.zzf(zzhsVar);
    }
}
