package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzan implements Runnable {
    private final /* synthetic */ zzai zzvc;

    zzan(zzai zzaiVar) {
        this.zzvc = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvc.zzva;
        zzbfVar.zzbn();
    }
}
