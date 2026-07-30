package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzauj implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        zzauk zzaukVar = (zzauk) obj;
        zzauk zzaukVar2 = (zzauk) obj2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzaukVar.zza.length;
            if (i >= length || i2 >= zzaukVar2.zza.length) {
                break;
            }
            int compare = Integer.compare(zzauk.zzg(zzaukVar.zzb(i)), zzauk.zzg(zzaukVar2.zzb(i2)));
            if (compare != 0) {
                return compare;
            }
            i++;
            i2++;
        }
        return Integer.compare(length, zzaukVar2.zza.length);
    }
}
