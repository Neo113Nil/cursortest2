package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzvp implements zzaom {
    private final /* synthetic */ zzvf zzbqk;
    private final /* synthetic */ zzvw zzbqn;

    zzvp(zzvf zzvfVar, zzvw zzvwVar) {
        this.zzbqk = zzvfVar;
        this.zzbqn = zzvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void run() {
        Object obj;
        obj = this.zzbqk.mLock;
        synchronized (obj) {
            this.zzbqk.zzbqb = 1;
            zzakb.v("Failed loading new engine. Marking new engine destroyable.");
            this.zzbqn.zzmb();
        }
    }
}
