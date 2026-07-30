package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzfrw implements Comparator {
    static final /* synthetic */ zzfrw zza = new zzfrw();

    private /* synthetic */ zzfrw() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzfro zzfroVar = (zzfro) obj2;
        zzfro zzfroVar2 = (zzfro) obj;
        int compare = Double.compare(zzfroVar.zze(), zzfroVar2.zze());
        return compare == 0 ? Long.compare(zzfroVar2.zzd(), zzfroVar.zzd()) : compare;
    }
}
