package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class zzpm implements zzhg {
    final /* synthetic */ String zza;
    final /* synthetic */ zzpz zzb;
    final /* synthetic */ zzpv zzc;

    zzpm(zzpv zzpvVar, String str, zzpz zzpzVar) {
        this.zza = str;
        this.zzb = zzpzVar;
        this.zzc = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhg
    public final void zza(String str, int i4, Throwable th, byte[] bArr, Map map) {
        this.zzc.zzZ(this.zza, i4, th, bArr, this.zzb);
    }
}
