package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzvm implements Runnable {
    private final /* synthetic */ zzvw zzbqi;
    private final /* synthetic */ zzuu zzbqj;
    private final /* synthetic */ zzvf zzbqk;

    zzvm(zzvf zzvfVar, zzvw zzvwVar, zzuu zzuuVar) {
        this.zzbqk = zzvfVar;
        this.zzbqi = zzvwVar;
        this.zzbqj = zzuuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzbqk.mLock;
        synchronized (obj) {
            if (this.zzbqi.getStatus() != -1 && this.zzbqi.getStatus() != 1) {
                this.zzbqi.reject();
                Executor executor = zzaoe.zzcvy;
                zzuu zzuuVar = this.zzbqj;
                zzuuVar.getClass();
                executor.execute(zzvn.zza(zzuuVar));
                zzakb.v("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
