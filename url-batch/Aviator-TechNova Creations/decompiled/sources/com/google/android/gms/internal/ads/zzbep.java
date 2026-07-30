package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbep implements Comparator {
    public zzbep(zzbeq zzbeqVar) {
        Objects.requireNonNull(zzbeqVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbef zzbefVar = (zzbef) obj;
        zzbef zzbefVar2 = (zzbef) obj2;
        if (zzbefVar.zzb() < zzbefVar2.zzb()) {
            return -1;
        }
        if (zzbefVar.zzb() > zzbefVar2.zzb()) {
            return 1;
        }
        if (zzbefVar.zza() < zzbefVar2.zza()) {
            return -1;
        }
        if (zzbefVar.zza() > zzbefVar2.zza()) {
            return 1;
        }
        float zzd = (zzbefVar.zzd() - zzbefVar.zzb()) * (zzbefVar.zzc() - zzbefVar.zza());
        float zzd2 = (zzbefVar2.zzd() - zzbefVar2.zzb()) * (zzbefVar2.zzc() - zzbefVar2.zza());
        if (zzd > zzd2) {
            return -1;
        }
        return zzd < zzd2 ? 1 : 0;
    }
}
