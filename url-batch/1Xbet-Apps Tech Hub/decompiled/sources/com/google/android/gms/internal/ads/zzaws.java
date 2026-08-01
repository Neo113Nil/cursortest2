package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaws implements Comparator {
    zzaws(zzawu zzawuVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzawy zzawyVar = (zzawy) obj;
        zzawy zzawyVar2 = (zzawy) obj2;
        int i = zzawyVar.zzc - zzawyVar2.zzc;
        return i != 0 ? i : (zzawyVar.zza > zzawyVar2.zza ? 1 : (zzawyVar.zza == zzawyVar2.zza ? 0 : -1));
    }
}
