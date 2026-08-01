package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyo;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbyo zzc;
    private final zzbvg zzd = new zzbvg(false, Collections.emptyList());

    public zzb(Context context, zzbyo zzbyoVar, zzbvg zzbvgVar) {
        this.zza = context;
        this.zzc = zzbyoVar;
    }

    private final boolean zzd() {
        zzbyo zzbyoVar = this.zzc;
        return (zzbyoVar != null && zzbyoVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbyo zzbyoVar = this.zzc;
            if (zzbyoVar != null) {
                zzbyoVar.zzd(str, null, 3);
                return;
            }
            zzbvg zzbvgVar = this.zzd;
            if (!zzbvgVar.zza || (list = zzbvgVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzK(context, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
