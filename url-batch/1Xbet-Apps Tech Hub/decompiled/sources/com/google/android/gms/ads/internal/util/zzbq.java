package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzami;
import com.google.android.gms.internal.ads.zzand;
import com.google.android.gms.internal.ads.zzaog;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzccf;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbq {
    private static zzand zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbl zza = new zzbi();

    public zzbq(Context context) {
        zzand zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbdc.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeo)).booleanValue()) {
                        zza2 = zzaz.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzaog.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzccf zzccfVar = new zzccf();
        zzb.zza(new zzbp(str, null, zzccfVar));
        return zzccfVar;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        zzbn zzbnVar = new zzbn(null);
        zzbj zzbjVar = new zzbj(this, str, zzbnVar);
        zzcbm zzcbmVar = new zzcbm(null);
        zzbk zzbkVar = new zzbk(this, i, str, zzbnVar, zzbjVar, bArr, map, zzcbmVar);
        if (zzcbm.zzk()) {
            try {
                zzcbmVar.zzd(str, ShareTarget.METHOD_GET, zzbkVar.zzl(), zzbkVar.zzx());
            } catch (zzami e) {
                zzcbn.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbkVar);
        return zzbnVar;
    }
}
