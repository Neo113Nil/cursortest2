package com.google.android.gms.internal.ads;

import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbnk implements zzboh {
    zzbnk() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            String str = (String) map.get("enabled");
            zzboh zzbohVar = zzbog.zza;
            if (!zzgql.zze(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, str) && !zzgql.zze("false", str)) {
                return;
            }
            zzgai.zza(zzcjlVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
