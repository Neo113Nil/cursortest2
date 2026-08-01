package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzant {
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
    zzant(String str, zzamj zzamjVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzamjVar.zzb;
        long j = zzamjVar.zzc;
        long j2 = zzamjVar.zzd;
        long j3 = zzamjVar.zze;
        long j4 = zzamjVar.zzf;
        List list = zzamjVar.zzh;
        if (list == null) {
            Map map = zzamjVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzams((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    static zzant zza(zzanu zzanuVar) throws IOException {
        if (zzanw.zze(zzanuVar) != 538247942) {
            throw new IOException();
        }
        String zzh = zzanw.zzh(zzanuVar);
        String zzh2 = zzanw.zzh(zzanuVar);
        long zzf = zzanw.zzf(zzanuVar);
        long zzf2 = zzanw.zzf(zzanuVar);
        long zzf3 = zzanw.zzf(zzanuVar);
        long zzf4 = zzanw.zzf(zzanuVar);
        int zze = zzanw.zze(zzanuVar);
        if (zze < 0) {
            throw new IOException("readHeaderList size=" + zze);
        }
        List emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zze; i++) {
            emptyList.add(new zzams(zzanw.zzh(zzanuVar).intern(), zzanw.zzh(zzanuVar).intern()));
        }
        return new zzant(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
    }

    private zzant(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
