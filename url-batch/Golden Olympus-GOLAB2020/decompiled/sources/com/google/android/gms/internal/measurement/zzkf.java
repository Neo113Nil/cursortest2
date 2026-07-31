package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.Function;

/* loaded from: classes.dex */
public final class zzkf {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzkf(String str, Uri uri, String str2, String str3, boolean z4, boolean z5, boolean z6, boolean z7, Function function) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z4;
        this.zze = z6;
    }

    public final zzkf zza() {
        return new zzkf(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public final zzkf zzb() {
        String str = this.zzb;
        if (str.isEmpty()) {
            return new zzkf(null, this.zza, str, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzki zzc(String str, double d4) {
        Double valueOf = Double.valueOf(-3.0d);
        int i4 = zzki.zzc;
        return new zzkd(this, "measurement.test.double_flag", valueOf, true);
    }

    public final zzki zzd(String str, long j4) {
        Long valueOf = Long.valueOf(j4);
        int i4 = zzki.zzc;
        return new zzkb(this, str, valueOf, true);
    }

    public final zzki zze(String str, String str2) {
        int i4 = zzki.zzc;
        return new zzke(this, str, str2, true);
    }

    public final zzki zzf(String str, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        int i4 = zzki.zzc;
        return new zzkc(this, str, valueOf, true);
    }

    public zzkf(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
