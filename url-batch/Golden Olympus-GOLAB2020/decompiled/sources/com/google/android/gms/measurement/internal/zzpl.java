package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzpl implements zzhg {
    final /* synthetic */ String zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ zzpv zzc;

    zzpl(zzpv zzpvVar, String str, List list) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhg
    public final void zza(String str, int i4, Throwable th, byte[] bArr, Map map) {
        this.zzc.zzY(true, i4, th, bArr, this.zza, this.zzb);
    }
}
