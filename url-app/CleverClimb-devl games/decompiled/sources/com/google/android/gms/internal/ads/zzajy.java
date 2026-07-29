package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzajy implements Runnable {
    private final /* synthetic */ zzajx zzcqt;

    zzajy(zzajx zzajxVar) {
        this.zzcqt = zzajxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcqt.zzcqr = Thread.currentThread();
        this.zzcqt.zzdn();
    }
}
