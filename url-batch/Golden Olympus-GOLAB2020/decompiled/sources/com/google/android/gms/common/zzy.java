package com.google.android.gms.common;

import android.util.Log;

/* loaded from: classes.dex */
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z4, int i4, int i5, String str, Throwable th, long j4) {
        this.zza = z4;
        this.zzd = i4;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    static zzy zzb() {
        return zze;
    }

    static zzy zzc(String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    static zzy zzd(String str, Throwable th) {
        return new zzy(false, 1, 5, str, th, -1L);
    }

    public static zzy zzf(int i4, long j4) {
        return new zzy(true, i4, 1, null, null, j4);
    }

    static zzy zzg(int i4, int i5, String str, Throwable th) {
        return new zzy(false, i4, i5, str, th, -1L);
    }

    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.zzc;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", zza(), th);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }

    /* synthetic */ zzy(boolean z4, int i4, int i5, String str, Throwable th, long j4, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
