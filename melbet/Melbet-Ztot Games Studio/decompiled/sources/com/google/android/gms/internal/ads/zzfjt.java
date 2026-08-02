package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzfjt {
    public static zzfju zza(Context context, int i) {
        boolean booleanValue;
        if (zzfki.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbdl.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbdl.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbdl.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbdl.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzfjw(context, i);
            }
        }
        return new zzfky();
    }

    public static zzfju zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfju zza = zza(context, i);
        if (zza instanceof zzfjw) {
            zza.zzi();
            zza.zzn(i2);
            zza.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzq.zza(zzlVar.zzm));
            if (zzfke.zze(zzlVar.zzp)) {
                zza.zze(zzlVar.zzp);
            }
        }
        return zza;
    }
}
