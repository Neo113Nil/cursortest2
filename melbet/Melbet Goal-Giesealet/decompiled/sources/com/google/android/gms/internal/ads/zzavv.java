package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzavv implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzavx zzb;

    zzavv(zzavx zzavxVar, int i, boolean z) {
        this.zza = i;
        Objects.requireNonNull(zzavxVar);
        this.zzb = zzavxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzast zzastVar;
        int i = this.zza;
        zzavx zzavxVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzavxVar.zza;
            zzastVar = zzfoo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzastVar = null;
        }
        zzavx zzavxVar2 = this.zzb;
        zzavxVar2.zzs(zzastVar);
        int i2 = this.zza;
        if (i2 < 4) {
            if (zzastVar != null && zzastVar.zza() && !zzastVar.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzastVar.zze() && zzastVar.zzg().zza() && zzastVar.zzg().zzb() != -2) {
                return;
            }
            zzavxVar2.zzp(i2 + 1, true);
        }
    }
}
