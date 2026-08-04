package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.internal.ads.zzbot;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzb {
    private static volatile zzck zza;

    private zzb() {
    }

    public static zzck zza(Context context) {
        if (zza == null) {
            synchronized (zzb.class) {
                if (zza == null) {
                    zza = zzbb.zzb().zzd(context, new zzbot());
                }
            }
        }
        return zza;
    }
}
