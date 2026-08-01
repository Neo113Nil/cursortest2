package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbdg {
    static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbeh.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbes.zza);
        zzc(arrayList, zzbes.zzb);
        zzc(arrayList, zzbes.zzc);
        zzc(arrayList, zzbes.zzd);
        zzc(arrayList, zzbes.zze);
        zzc(arrayList, zzbes.zzu);
        zzc(arrayList, zzbes.zzf);
        zzc(arrayList, zzbes.zzm);
        zzc(arrayList, zzbes.zzn);
        zzc(arrayList, zzbes.zzo);
        zzc(arrayList, zzbes.zzp);
        zzc(arrayList, zzbes.zzq);
        zzc(arrayList, zzbes.zzr);
        zzc(arrayList, zzbes.zzs);
        zzc(arrayList, zzbes.zzt);
        zzc(arrayList, zzbes.zzg);
        zzc(arrayList, zzbes.zzh);
        zzc(arrayList, zzbes.zzi);
        zzc(arrayList, zzbes.zzj);
        zzc(arrayList, zzbes.zzk);
        zzc(arrayList, zzbes.zzl);
        return arrayList;
    }

    static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbfg.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbeh zzbehVar) {
        String str = (String) zzbehVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
