package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfsv extends zzfsp {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfsy zzb;

    zzfsv(zzfsy zzfsyVar, IBinder iBinder) {
        this.zzb = zzfsyVar;
        this.zza = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.zzfsp
    public final void zza() {
        List list;
        List list2;
        this.zzb.zza.zzn = zzfsk.zzb(this.zza);
        zzfsz.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
