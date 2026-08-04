package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbod {
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbob();
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzboc();
    private final zzbnp zzc;

    public zzbod(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzfie zzfieVar) {
        this.zzc = new zzbnp(context, versionInfoParcel, str, zza, zzb, zzfieVar);
    }

    public final zzbnt zza(String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        return new zzboh(this.zzc, str, zzbnwVar, zzbnvVar);
    }

    public final zzbom zzb() {
        return new zzbom(this.zzc);
    }
}
