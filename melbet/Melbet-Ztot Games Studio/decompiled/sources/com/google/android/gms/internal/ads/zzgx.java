package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.DriveFile;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public class zzgx {
    private int zza;

    public final void zza(int i) {
        this.zza |= DriveFile.MODE_WRITE_ONLY;
    }

    public void zzb() {
        this.zza = 0;
    }

    public final void zzc(int i) {
        this.zza = i;
    }

    protected final boolean zzd(int i) {
        return (this.zza & i) == i;
    }

    public final boolean zze() {
        return zzd(DriveFile.MODE_READ_ONLY);
    }

    public final boolean zzf() {
        return zzd(4);
    }

    public final boolean zzg() {
        return zzd(1);
    }

    public final boolean zzh() {
        return zzd(DriveFile.MODE_WRITE_ONLY);
    }
}
