package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

@WorkerThread
/* loaded from: classes3.dex */
final class zzey implements Runnable {
    private final zzew zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    /* synthetic */ zzey(String str, zzew zzewVar, int i8, Throwable th, byte[] bArr, Map map, zzex zzexVar) {
        Preconditions.checkNotNull(zzewVar);
        this.zza = zzewVar;
        this.zzb = i8;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
