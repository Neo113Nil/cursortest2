package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfvx {
    private final Set zza;
    private final Set zzb;
    private final zzgea zzc;
    private ListenableFuture zzd = null;

    zzfvx(Set set, Set set2, zzgea zzgeaVar) {
        this.zza = set;
        this.zzb = set2;
        this.zzc = zzgeaVar;
    }

    public final synchronized ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zzd;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        Set set = this.zzb;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzfvv) it.next()).zza());
        }
        zzgea zzgeaVar = this.zzc;
        ListenableFuture zzk = zzgot.zzk(zzgot.zzl(arrayList), zzfvw.zza, zzgpk.zza());
        zzgeaVar.zze(2, zzk);
        this.zzd = zzk;
        Iterator it2 = this.zza.iterator();
        while (it2.hasNext()) {
            ((zzfvv) it2.next()).zza();
        }
        ListenableFuture listenableFuture2 = this.zzd;
        if (listenableFuture2 == null) {
            throw null;
        }
        ListenableFuture listenableFuture3 = listenableFuture2;
        return listenableFuture2;
    }

    public final synchronized ListenableFuture zzb() {
        ListenableFuture listenableFuture;
        listenableFuture = this.zzd;
        if (listenableFuture == null) {
            throw null;
        }
        ListenableFuture listenableFuture2 = listenableFuture;
        return listenableFuture;
    }
}
