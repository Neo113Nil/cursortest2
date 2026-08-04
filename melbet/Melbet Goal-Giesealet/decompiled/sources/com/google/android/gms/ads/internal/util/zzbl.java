package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbl {
    private static zzapk zza;
    private static final Object zzb = new Object();

    public zzbl(Context context) {
        zzapk zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbci.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeT)).booleanValue()) {
                        zza2 = zzay.zzb(context);
                        zza = zza2;
                    }
                }
                zza2 = zzaqm.zza(context, null);
                zza = zza2;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzbzm zzbzmVar = new zzbzm();
        zza.zzb(new zzbk(str, null, zzbzmVar));
        return zzbzmVar;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, ShareTarget.METHOD_GET, zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzaop e) {
                String message = e.getMessage();
                int i2 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }
}
