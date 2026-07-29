package com.google.android.gms.common.api.internal;

import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class zzz implements OnCompleteListener<Map<zzh<?>, String>> {
    private final /* synthetic */ zzw zzgu;
    private SignInConnectionListener zzgv;

    zzz(zzw zzwVar, SignInConnectionListener signInConnectionListener) {
        this.zzgu = zzwVar;
        this.zzgv = signInConnectionListener;
    }

    final void cancel() {
        this.zzgv.onComplete();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Map<zzh<?>, String>> task) {
        Lock lock;
        Lock lock2;
        boolean z;
        boolean z2;
        Map map;
        Map map2;
        boolean zza;
        Map map3;
        SignInConnectionListener signInConnectionListener;
        Map map4;
        Map map5;
        ConnectionResult zzai;
        Condition condition;
        Map map6;
        Map map7;
        Map map8;
        lock = this.zzgu.zzga;
        lock.lock();
        try {
            z = this.zzgu.zzgp;
            if (z) {
                if (task.isSuccessful()) {
                    zzw zzwVar = this.zzgu;
                    map6 = this.zzgu.zzgh;
                    zzwVar.zzgr = new ArrayMap(map6.size());
                    map7 = this.zzgu.zzgh;
                    for (zzv zzvVar : map7.values()) {
                        map8 = this.zzgu.zzgr;
                        map8.put(zzvVar.zzm(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.getException() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.getException();
                    z2 = this.zzgu.zzgn;
                    if (z2) {
                        zzw zzwVar2 = this.zzgu;
                        map = this.zzgu.zzgh;
                        zzwVar2.zzgr = new ArrayMap(map.size());
                        map2 = this.zzgu.zzgh;
                        for (zzv zzvVar2 : map2.values()) {
                            Object zzm = zzvVar2.zzm();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(zzvVar2);
                            zza = this.zzgu.zza((zzv<?>) zzvVar2, connectionResult);
                            if (zza) {
                                map3 = this.zzgu.zzgr;
                                connectionResult = new ConnectionResult(16);
                            } else {
                                map3 = this.zzgu.zzgr;
                            }
                            map3.put(zzm, connectionResult);
                        }
                    } else {
                        this.zzgu.zzgr = availabilityException.zzl();
                    }
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                    this.zzgu.zzgr = Collections.emptyMap();
                }
                if (this.zzgu.isConnected()) {
                    map4 = this.zzgu.zzgq;
                    map5 = this.zzgu.zzgr;
                    map4.putAll(map5);
                    zzai = this.zzgu.zzai();
                    if (zzai == null) {
                        this.zzgu.zzag();
                        this.zzgu.zzah();
                        condition = this.zzgu.zzgl;
                        condition.signalAll();
                    }
                }
                signInConnectionListener = this.zzgv;
            } else {
                signInConnectionListener = this.zzgv;
            }
            signInConnectionListener.onComplete();
        } finally {
            lock2 = this.zzgu.zzga;
            lock2.unlock();
        }
    }
}
