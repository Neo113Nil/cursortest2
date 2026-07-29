package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
abstract class zzat implements Runnable {
    private final /* synthetic */ zzaj zzhv;

    private zzat(zzaj zzajVar) {
        this.zzhv = zzajVar;
    }

    /* synthetic */ zzat(zzaj zzajVar, zzak zzakVar) {
        this(zzajVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        Lock lock;
        Lock lock2;
        zzbd zzbdVar;
        lock = this.zzhv.zzga;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zzaq();
                }
            } catch (RuntimeException e) {
                zzbdVar = this.zzhv.zzhf;
                zzbdVar.zzb(e);
            }
        } finally {
            lock2 = this.zzhv.zzga;
            lock2.unlock();
        }
    }

    protected abstract void zzaq();
}
