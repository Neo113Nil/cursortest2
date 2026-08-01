package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfme implements zzfly {
    private static zzfme zza;
    private float zzb = 0.0f;
    private final zzflu zzc;
    private final zzfls zzd;
    private zzflt zze;
    private zzflx zzf;

    public zzfme(zzflu zzfluVar, zzfls zzflsVar) {
        this.zzc = zzfluVar;
        this.zzd = zzflsVar;
    }

    public static zzfme zzb() {
        if (zza == null) {
            zza = new zzfme(new zzflu(), new zzfls());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final void zzc(boolean z) {
        if (z) {
            zzfnf.zzd().zzi();
        } else {
            zzfnf.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zze = new zzflt(new Handler(), context, new zzflr(), this);
    }

    public final void zze(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzflx.zza();
        }
        Iterator it = this.zzf.zzb().iterator();
        while (it.hasNext()) {
            ((zzflj) it.next()).zzg().zzi(f);
        }
    }

    public final void zzf() {
        zzflw.zza().zze(this);
        zzflw.zza().zzf();
        zzfnf.zzd().zzi();
        this.zze.zza();
    }

    public final void zzg() {
        zzfnf.zzd().zzj();
        zzflw.zza().zzg();
        this.zze.zzb();
    }
}
