package com.google.android.gms.internal.measurement;

import android.os.Looper;

/* loaded from: classes2.dex */
final class zzbx implements Runnable {
    private final /* synthetic */ zzbw zzya;

    zzbx(zzbw zzbwVar) {
        this.zzya = zzbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzat zzatVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzatVar = this.zzya.zzvi;
            zzatVar.zzbw().zza(this);
            return;
        }
        boolean zzef = this.zzya.zzef();
        zzbw.zza(this.zzya, 0L);
        if (zzef) {
            this.zzya.run();
        }
    }
}
