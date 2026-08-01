package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfo implements zzeq {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfo(Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzl(zzfn zzfnVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzfnVar);
            }
        }
    }

    private static zzfn zzm() {
        zzfn zzfnVar;
        List list = zza;
        synchronized (list) {
            zzfnVar = list.isEmpty() ? new zzfn(null) : (zzfn) list.remove(list.size() - 1);
        }
        return zzfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final zzep zzb(int i) {
        Handler handler = this.zzb;
        zzfn zzm = zzm();
        zzm.zzb(handler.obtainMessage(i), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final zzep zzc(int i, Object obj) {
        Handler handler = this.zzb;
        zzfn zzm = zzm();
        zzm.zzb(handler.obtainMessage(i, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final zzep zzd(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzfn zzm = zzm();
        zzm.zzb(handler.obtainMessage(1, i2, i3), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzf(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final boolean zzk(zzep zzepVar) {
        return ((zzfn) zzepVar).zzc(this.zzb);
    }
}
