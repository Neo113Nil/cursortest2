package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfqk {
    private final Context zza;
    private final Executor zzb;
    private final zzgzz zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfqc zze;
    private final zzfor zzf;
    private final zzclx zzg;

    zzfqk(Context context, Executor executor, zzgzz zzgzzVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfqc zzfqcVar, zzfor zzforVar, zzclx zzclxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgzzVar;
        this.zzd = zzuVar;
        this.zze = zzfqcVar;
        this.zzf = zzforVar;
        this.zzg = zzclxVar;
    }

    public final void zza(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfoo zzfooVar, zzddu zzdduVar) {
        ListenableFuture zzc;
        zzfoe zzfoeVar = null;
        if (zzfor.zza() && ((Boolean) zzbix.zzd.zze()).booleanValue()) {
            zzfoeVar = zzfoe.zzn(this.zza, 14);
            zzfoeVar.zza();
        }
        if (zzvVar != null) {
            zzc = new zzfqb(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            zzc = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzfqk.this.zzc(str);
                }
            });
        }
        zzgzo.zzr(zzc, new zzfqi(this, zzfoeVar, zzfooVar, zzdduVar), this.zzb);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue() || (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzj(str))) {
            return this.zzd.zzc(str, null);
        }
        String zzb = this.zzg.zzb();
        HashMap hashMap = new HashMap();
        if (zzb != null) {
            hashMap.put((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkl), zzb);
        }
        return this.zzd.zzc(str, hashMap);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    final /* synthetic */ zzfor zze() {
        return this.zzf;
    }
}
