package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzao implements Runnable {
    private final /* synthetic */ zzai zzvc;
    private final /* synthetic */ zzca zzvh;

    zzao(zzai zzaiVar, zzca zzcaVar) {
        this.zzvc = zzaiVar;
        this.zzvh = zzcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvc.zzva;
        zzbfVar.zzb(this.zzvh);
    }
}
