package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzamw;
import com.google.android.gms.internal.ads.zzana;
import com.google.android.gms.internal.ads.zzand;
import com.google.android.gms.internal.ads.zzanj;
import com.google.android.gms.internal.ads.zzano;
import com.google.android.gms.internal.ads.zzanp;
import com.google.android.gms.internal.ads.zzanw;
import com.google.android.gms.internal.ads.zzaoa;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzcbg;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaz extends zzanp {
    private final Context zzc;

    private zzaz(Context context, zzano zzanoVar) {
        super(zzanoVar);
        this.zzc = context;
    }

    public static zzand zzb(Context context) {
        zzand zzandVar = new zzand(new zzanw(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzaz(context, new zzaoa()), 4);
        zzandVar.zzd();
        return zzandVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanp, com.google.android.gms.internal.ads.zzamt
    public final zzamw zza(zzana zzanaVar) throws zzanj {
        if (zzanaVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzep), zzanaVar.zzk())) {
                Context context = this.zzc;
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (zzcbg.zzs(context, 13400000)) {
                    zzamw zza = new zzblz(this.zzc).zza(zzanaVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzanaVar.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzanaVar.zzk())));
                }
            }
        }
        return super.zza(zzanaVar);
    }
}
