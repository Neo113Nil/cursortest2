package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzej implements zzdl {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzej(Handler handler) {
        this.zzb = handler;
    }

    static /* synthetic */ void zzn(zzei zzeiVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzeiVar);
            }
        }
    }

    private static zzei zzo() {
        zzei zzeiVar;
        List list = zza;
        synchronized (list) {
            zzeiVar = list.isEmpty() ? new zzei(null) : (zzei) list.remove(list.size() - 1);
        }
        return zzeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzb(int i) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzc(int i) {
        Handler handler = this.zzb;
        zzei zzo = zzo();
        zzo.zzb(handler.obtainMessage(i), this);
        return zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzd(int i, Object obj) {
        Handler handler = this.zzb;
        zzei zzo = zzo();
        zzo.zzb(handler.obtainMessage(i, obj), this);
        return zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zze(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzei zzo = zzo();
        zzo.zzb(handler.obtainMessage(i, i2, i3), this);
        return zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzf(int i, int i2, int i3, Object obj) {
        Handler handler = this.zzb;
        zzei zzo = zzo();
        zzo.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzg(zzdk zzdkVar) {
        return ((zzei) zzdkVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzi(int i, int i2) {
        return this.zzb.sendEmptyMessageDelayed(1, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final void zzk(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final void zzl(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }
}
