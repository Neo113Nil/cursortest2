package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
abstract class zzbe {
    private final zzbc zzjg;

    protected zzbe(zzbc zzbcVar) {
        this.zzjg = zzbcVar;
    }

    protected abstract void zzaq();

    public final void zzc(zzbd zzbdVar) {
        Lock lock;
        Lock lock2;
        zzbc zzbcVar;
        lock = zzbdVar.zzga;
        lock.lock();
        try {
            zzbcVar = zzbdVar.zzjc;
            if (zzbcVar == this.zzjg) {
                zzaq();
            }
        } finally {
            lock2 = zzbdVar.zzga;
            lock2.unlock();
        }
    }
}
