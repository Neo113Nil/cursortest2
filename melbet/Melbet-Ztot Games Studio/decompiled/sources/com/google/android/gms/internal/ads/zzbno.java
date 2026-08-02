package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbno {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzbnm();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbnn();
    private final zzbna zzc;

    public zzbno(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzfki zzfkiVar) {
        this.zzc = new zzbna(context, versionInfoParcel, str, zza, zzb, zzfkiVar);
    }

    public final zzbne zza(String str, zzbnh zzbnhVar, zzbng zzbngVar) {
        return new zzbns(this.zzc, str, zzbnhVar, zzbngVar);
    }

    public final zzbnx zzb() {
        return new zzbnx(this.zzc);
    }
}
