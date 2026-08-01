package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbou {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzbos();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbot();
    private final zzbog zzc;

    public zzbou(Context context, zzcbt zzcbtVar, String str, @Nullable zzfkk zzfkkVar) {
        this.zzc = new zzbog(context, zzcbtVar, str, zza, zzb, zzfkkVar);
    }

    public final zzbok zza(String str, zzbon zzbonVar, zzbom zzbomVar) {
        return new zzboy(this.zzc, str, zzbonVar, zzbomVar);
    }

    public final zzbpd zzb() {
        return new zzbpd(this.zzc);
    }
}
