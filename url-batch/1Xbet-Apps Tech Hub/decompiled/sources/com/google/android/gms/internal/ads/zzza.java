package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzza {
    public static final zzyu zza = new zzyu(0, -9223372036854775807L, null);
    public static final zzyu zzb = new zzyu(1, -9223372036854775807L, null);
    public static final zzyu zzc = new zzyu(2, -9223372036854775807L, null);
    public static final zzyu zzd = new zzyu(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzfs.zzD("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzyv zzf;
    private IOException zzg;

    public zzza(String str) {
    }

    public static zzyu zzb(boolean z, long j) {
        return new zzyu(z ? 1 : 0, j, null);
    }

    public final long zza(zzyw zzywVar, zzys zzysVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzef.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzyv(this, myLooper, zzywVar, zzysVar, i, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzyv zzyvVar = this.zzf;
        zzef.zzb(zzyvVar);
        zzyvVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzyv zzyvVar = this.zzf;
        if (zzyvVar != null) {
            zzyvVar.zzb(i);
        }
    }

    public final void zzj(zzyx zzyxVar) {
        zzyv zzyvVar = this.zzf;
        if (zzyvVar != null) {
            zzyvVar.zza(true);
        }
        this.zze.execute(new zzyy(zzyxVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
