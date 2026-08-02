package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaqa {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzaqa(String str, zzaoq zzaoqVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzaoqVar.zzb;
        long j = zzaoqVar.zzc;
        long j2 = zzaoqVar.zzd;
        long j3 = zzaoqVar.zze;
        long j4 = zzaoqVar.zzf;
        List list = zzaoqVar.zzh;
        if (list == null) {
            Map map = zzaoqVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzaoz((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    static zzaqa zza(zzaqb zzaqbVar) throws IOException {
        if (zzaqd.zze(zzaqbVar) != 538247942) {
            throw new IOException();
        }
        String zzh = zzaqd.zzh(zzaqbVar);
        String zzh2 = zzaqd.zzh(zzaqbVar);
        long zzf = zzaqd.zzf(zzaqbVar);
        long zzf2 = zzaqd.zzf(zzaqbVar);
        long zzf3 = zzaqd.zzf(zzaqbVar);
        long zzf4 = zzaqd.zzf(zzaqbVar);
        int zze = zzaqd.zze(zzaqbVar);
        if (zze < 0) {
            throw new IOException("readHeaderList size=" + zze);
        }
        List emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zze; i++) {
            emptyList.add(new zzaoz(zzaqd.zzh(zzaqbVar).intern(), zzaqd.zzh(zzaqbVar).intern()));
        }
        return new zzaqa(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
    }

    private zzaqa(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
