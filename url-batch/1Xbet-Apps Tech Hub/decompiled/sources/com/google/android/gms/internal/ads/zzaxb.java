package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaxb implements Comparator {
    public zzaxb(zzaxc zzaxcVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzawq zzawqVar = (zzawq) obj;
        zzawq zzawqVar2 = (zzawq) obj2;
        if (zzawqVar.zzd() < zzawqVar2.zzd()) {
            return -1;
        }
        if (zzawqVar.zzd() <= zzawqVar2.zzd()) {
            if (zzawqVar.zzb() < zzawqVar2.zzb()) {
                return -1;
            }
            if (zzawqVar.zzb() <= zzawqVar2.zzb()) {
                float zza = (zzawqVar.zza() - zzawqVar.zzd()) * (zzawqVar.zzc() - zzawqVar.zzb());
                float zza2 = (zzawqVar2.zza() - zzawqVar2.zzd()) * (zzawqVar2.zzc() - zzawqVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
