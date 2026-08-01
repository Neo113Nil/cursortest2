package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbjp implements zzbkd {
    zzbjp() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        try {
            zzfqz.zzj(zzcgvVar.getContext()).zzk();
            zzfra.zzi(zzcgvVar.getContext()).zzj();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
