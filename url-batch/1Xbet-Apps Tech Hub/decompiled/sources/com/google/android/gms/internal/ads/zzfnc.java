package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfnc implements Runnable {
    zzfnc() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfnf.zzc;
        if (handler != null) {
            handler2 = zzfnf.zzc;
            runnable = zzfnf.zzd;
            handler2.post(runnable);
            handler3 = zzfnf.zzc;
            runnable2 = zzfnf.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
