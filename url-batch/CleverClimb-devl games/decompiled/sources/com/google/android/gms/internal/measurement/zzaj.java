package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzaj implements Runnable {
    private final /* synthetic */ int zzvb;
    private final /* synthetic */ zzai zzvc;

    zzaj(zzai zzaiVar, int i) {
        this.zzvc = zzaiVar;
        this.zzvb = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvc.zzva;
        zzbfVar.zzg(this.zzvb * 1000);
    }
}
