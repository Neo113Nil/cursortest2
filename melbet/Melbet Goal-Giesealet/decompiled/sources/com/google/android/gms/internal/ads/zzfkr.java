package com.google.android.gms.internal.ads;

import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfkr {
    private final String zza;
    private final AdFormat zzb;
    private final String zzc;

    /* synthetic */ zzfkr(zzfkq zzfkqVar, byte[] bArr) {
        this.zza = zzfkqVar.zzb();
        this.zzb = zzfkqVar.zzc();
        this.zzc = zzfkqVar.zzd();
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfkr) {
            zzfkr zzfkrVar = (zzfkr) obj;
            if (this.zza.equals(zzfkrVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzfkrVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? EnvironmentCompat.MEDIA_UNKNOWN : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzc() {
        return this.zzc;
    }
}
