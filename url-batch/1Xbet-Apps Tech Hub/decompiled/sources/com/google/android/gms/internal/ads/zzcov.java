package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcov implements zzcof {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzo().zzi();

    public zzcov(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcof
    public final void zza(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
            boolean parseBoolean = Boolean.parseBoolean(str);
            zzgVar.zzH(parseBoolean);
            if (parseBoolean) {
                Context context = this.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgi)).booleanValue()) {
                    context.deleteDatabase("OfflineUpload.db");
                }
                try {
                    zzfqz zzj = zzfqz.zzj(context);
                    zzfra zzi = zzfra.zzi(context);
                    zzj.zzk();
                    zzj.zzl();
                    zzi.zzj();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcN)).booleanValue()) {
                        zzi.zzk();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcO)).booleanValue()) {
                        zzi.zzl();
                    }
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "clearStorageOnIdlessMode");
                }
            }
        }
        map.remove("gad_idless");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        com.google.android.gms.ads.internal.zzt.zzn().zzr(bundle);
    }
}
