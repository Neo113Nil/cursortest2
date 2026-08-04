package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbsh extends zzbgz {
    final /* synthetic */ zzbsj zza;

    /* synthetic */ zzbsh(zzbsj zzbsjVar, byte[] bArr) {
        Objects.requireNonNull(zzbsjVar);
        this.zza = zzbsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) {
        zzbsj zzbsjVar = this.zza;
        if (zzbsjVar.zze() == null) {
            return;
        }
        zzbsjVar.zze().onCustomClick(zzbsjVar.zzc(zzbgqVar), str);
    }
}
