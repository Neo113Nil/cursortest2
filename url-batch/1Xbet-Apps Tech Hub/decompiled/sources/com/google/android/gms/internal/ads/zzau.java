package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzau {
    private String zza;
    private Uri zzb;
    private final zzaw zzc = new zzaw();
    private final zzbd zzd = new zzbd(null);
    private final List zze = Collections.emptyList();
    private final zzfwu zzf = zzfwu.zzl();
    private final zzbg zzg = new zzbg();
    private final zzbo zzh = zzbo.zza;

    public final zzau zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzau zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbs zzc() {
        zzbl zzblVar;
        Uri uri = this.zzb;
        if (uri != null) {
            zzblVar = new zzbl(uri, null, null, null, this.zze, null, this.zzf, null, -9223372036854775807L, null);
        } else {
            zzblVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbs(str, new zzba(this.zzc, null), zzblVar, new zzbi(this.zzg), zzby.zza, this.zzh, null);
    }
}
