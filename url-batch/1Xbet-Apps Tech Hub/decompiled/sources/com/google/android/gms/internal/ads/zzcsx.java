package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcsx extends zzcrp {
    private final zzbhz zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcsx(zzctq zzctqVar, zzbhz zzbhzVar, Runnable runnable, Executor executor) {
        super(zzctqVar);
        this.zzc = zzbhzVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final zzfdv zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final zzfdv zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzctr
    public final void zzj() {
        final zzcsv zzcsvVar = new zzcsv(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsw
            @Override // java.lang.Runnable
            public final void run() {
                zzcsx.this.zzk(zzcsvVar);
            }
        });
    }

    final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcsv) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcsv) runnable).zza);
        }
    }
}
