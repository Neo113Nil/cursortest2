package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public interface zzfhr {
    static zzfhr zzn(Context context, int i) {
        boolean booleanValue;
        if (zzfie.zza()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                booleanValue = ((Boolean) zzbeb.zze.zze()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbeb.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbeb.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbeb.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbeb.zzf.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzfht(context, i);
            }
        }
        return new zzfis();
    }

    static zzfhr zzo(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfhr zzn = zzn(context, i);
        if (zzn instanceof zzfht) {
            zzn.zza();
            zzn.zzp(i2);
            zzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfia.zza(str)) {
                zzn.zze(str);
            }
        }
        return zzn;
    }

    zzfhr zza();

    boolean zzb();

    zzfhr zzc();

    zzfhr zzd(boolean z);

    zzfhr zze(String str);

    zzfhr zzf(zzfig zzfigVar);

    zzfhr zzg(zzfct zzfctVar);

    zzfhr zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfhr zzi(String str);

    zzfhr zzj(Throwable th);

    zzfhr zzk(String str);

    boolean zzl();

    zzfhu zzm();

    zzfhr zzp(int i);
}
