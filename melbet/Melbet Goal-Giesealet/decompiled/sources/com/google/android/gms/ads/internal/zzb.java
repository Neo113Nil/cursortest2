package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbxf;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbxf zzc;
    private final zzbud zzd = new zzbud(false, Collections.emptyList());

    public zzb(Context context, zzbxf zzbxfVar, zzbud zzbudVar) {
        this.zza = context;
        this.zzc = zzbxfVar;
    }

    private final boolean zzd() {
        zzbxf zzbxfVar = this.zzc;
        return (zzbxfVar != null && zzbxfVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbxf zzbxfVar = this.zzc;
            if (zzbxfVar != null) {
                zzbxfVar.zze(str, null, 3);
                return;
            }
            zzbud zzbudVar = this.zzd;
            if (!zzbudVar.zza || (list = zzbudVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzP(context, "", replace);
                }
            }
        }
    }
}
