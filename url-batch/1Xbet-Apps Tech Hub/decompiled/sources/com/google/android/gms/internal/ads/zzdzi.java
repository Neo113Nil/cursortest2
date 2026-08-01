package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdzi implements zzdbc {
    private final Context zza;
    private final zzbzs zzb;

    zzdzi(Context context, zzbzs zzbzsVar) {
        this.zza = context;
        this.zzb = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbt(zzfeh zzfehVar) {
        if (TextUtils.isEmpty(zzfehVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzp(this.zza, zzfehVar.zza.zza.zzd);
        this.zzb.zzl(this.zza, zzfehVar.zzb.zzb.zzd);
    }
}
