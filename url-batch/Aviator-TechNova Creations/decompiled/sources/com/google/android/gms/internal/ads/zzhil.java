package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhil {
    final zzhim zza;
    final long[] zzb;

    zzhil() {
        this(new zzhim(), new long[10]);
    }

    zzhil(zzhim zzhimVar, long[] jArr) {
        this.zza = zzhimVar;
        this.zzb = jArr;
    }

    zzhil(zzhil zzhilVar) {
        this.zza = new zzhim(zzhilVar.zza);
        this.zzb = Arrays.copyOf(zzhilVar.zzb, 10);
    }
}
