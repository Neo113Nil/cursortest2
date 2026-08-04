package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaqa {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    static zzaqa zza(zzaqb zzaqbVar) throws IOException {
        if (zzaqd.zzi(zzaqbVar) != 538247942) {
            throw new IOException();
        }
        String zzm = zzaqd.zzm(zzaqbVar);
        String zzm2 = zzaqd.zzm(zzaqbVar);
        long zzk = zzaqd.zzk(zzaqbVar);
        long zzk2 = zzaqd.zzk(zzaqbVar);
        long zzk3 = zzaqd.zzk(zzaqbVar);
        long zzk4 = zzaqd.zzk(zzaqbVar);
        int zzi = zzaqd.zzi(zzaqbVar);
        if (zzi < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(zzi);
            throw new IOException(sb.toString());
        }
        List emptyList = zzi == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zzi; i++) {
            emptyList.add(new zzaoz(zzaqd.zzm(zzaqbVar).intern(), zzaqd.zzm(zzaqbVar).intern()));
        }
        return new zzaqa(zzm, zzm2, zzk, zzk2, zzk3, zzk4, emptyList);
    }

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
