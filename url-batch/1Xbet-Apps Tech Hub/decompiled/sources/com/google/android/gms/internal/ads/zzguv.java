package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzguv implements Comparator {
    zzguv() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgve zzgveVar = (zzgve) obj;
        zzgve zzgveVar2 = (zzgve) obj2;
        zzguy it = zzgveVar.iterator();
        zzguy it2 = zzgveVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgveVar.zzd()).compareTo(Integer.valueOf(zzgveVar2.zzd()));
    }
}
