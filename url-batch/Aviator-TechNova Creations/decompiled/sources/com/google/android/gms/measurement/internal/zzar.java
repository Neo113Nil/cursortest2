package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
public final class zzar {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzau zzf;

    zzar(zzge zzgeVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzgeVar.zzaA().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeu.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgeVar.zzaA().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzgeVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzgeVar.zzaA().zzk().zzb("Param value can't be null", zzgeVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzgeVar.zzv().zzP(bundle2, next, zzA);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        }
        this.zzf = zzauVar;
    }

    public final String toString() {
        return "Event{appId='" + this.zza + "', name='" + this.zzb + "', params=" + this.zzf.toString() + "}";
    }

    final zzar zza(zzge zzgeVar, long j) {
        return new zzar(zzgeVar, this.zzc, this.zza, this.zzb, this.zzd, j, this.zzf);
    }

    private zzar(zzge zzgeVar, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzgeVar.zzaA().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeu.zzn(str2), zzeu.zzn(str3));
        }
        this.zzf = zzauVar;
    }
}
