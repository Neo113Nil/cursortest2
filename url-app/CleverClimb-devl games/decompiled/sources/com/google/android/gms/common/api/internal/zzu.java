package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class zzu implements zzbq {
    private final /* synthetic */ zzr zzgc;

    private zzu(zzr zzrVar) {
        this.zzgc = zzrVar;
    }

    /* synthetic */ zzu(zzr zzrVar, zzs zzsVar) {
        this(zzrVar);
    }

    @Override // com.google.android.gms.common.api.internal.zzbq
    public final void zzb(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        zzbd zzbdVar;
        lock = this.zzgc.zzga;
        lock.lock();
        try {
            z2 = this.zzgc.zzfz;
            if (z2) {
                this.zzgc.zzfz = false;
                this.zzgc.zza(i, z);
            } else {
                this.zzgc.zzfz = true;
                zzbdVar = this.zzgc.zzfr;
                zzbdVar.onConnectionSuspended(i);
            }
        } finally {
            lock2 = this.zzgc.zzga;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zzbq
    public final void zzb(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.zzgc.zzga;
        lock.lock();
        try {
            this.zzgc.zzfy = ConnectionResult.RESULT_SUCCESS;
            this.zzgc.zzaa();
        } finally {
            lock2 = this.zzgc.zzga;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zzbq
    public final void zzc(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.zzgc.zzga;
        lock.lock();
        try {
            this.zzgc.zzfy = connectionResult;
            this.zzgc.zzaa();
        } finally {
            lock2 = this.zzgc.zzga;
            lock2.unlock();
        }
    }
}
