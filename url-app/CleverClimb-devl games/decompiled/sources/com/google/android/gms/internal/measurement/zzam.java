package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzam implements Runnable {
    private final /* synthetic */ zzai zzvc;
    private final /* synthetic */ zzch zzvg;

    zzam(zzai zzaiVar, zzch zzchVar) {
        this.zzvc = zzaiVar;
        this.zzvg = zzchVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvc.zzva;
        zzbfVar.zza(this.zzvg);
    }
}
