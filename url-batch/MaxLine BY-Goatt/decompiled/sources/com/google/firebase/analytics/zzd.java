package com.google.firebase.analytics;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import defpackage.al3;
import defpackage.bf3;
import defpackage.bl3;
import defpackage.cf3;
import defpackage.df3;
import defpackage.dg3;
import defpackage.ee3;
import defpackage.ef3;
import defpackage.jf3;
import defpackage.km3;
import defpackage.ll3;
import defpackage.qf3;
import defpackage.sf3;
import defpackage.tf3;
import defpackage.vf3;
import defpackage.wf3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class zzd implements km3 {
    final /* synthetic */ dg3 zza;

    public zzd(dg3 dg3Var) {
        this.zza = dg3Var;
    }

    @Override // defpackage.km3
    public final void zza(String str, String str2, Bundle bundle) {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        dg3Var.c(new tf3(dg3Var, null, str, str2, bundle, true, true));
    }

    public final void zzb(String str, String str2, Bundle bundle, long j) {
        dg3 dg3Var = this.zza;
        Long valueOf = Long.valueOf(j);
        dg3Var.getClass();
        dg3Var.c(new tf3(dg3Var, valueOf, str, str2, bundle, true, false));
    }

    @Override // defpackage.km3
    public final Map zzd(String str, String str2, boolean z) {
        return this.zza.a(str, str2, z);
    }

    public final void zze(al3 al3Var) {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        vf3 vf3Var = new vf3(al3Var);
        if (dg3Var.f != null) {
            try {
                dg3Var.f.setEventInterceptor(vf3Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        dg3Var.c(new ef3(dg3Var, vf3Var));
    }

    public final void zzf(bl3 bl3Var) {
        this.zza.f(bl3Var);
    }

    public final void zzg(bl3 bl3Var) {
        Pair pair;
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        ll3.v(bl3Var);
        ArrayList arrayList = dg3Var.c;
        synchronized (arrayList) {
            int i = 0;
            while (true) {
                try {
                    if (i >= arrayList.size()) {
                        pair = null;
                        break;
                    } else {
                        if (bl3Var.equals(((Pair) arrayList.get(i)).first)) {
                            pair = (Pair) arrayList.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w("FA", "OnEventListener had not been registered.");
                return;
            }
            arrayList.remove(pair);
            wf3 wf3Var = (wf3) pair.second;
            if (dg3Var.f != null) {
                try {
                    dg3Var.f.unregisterOnMeasurementEventListener(wf3Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            dg3Var.c(new sf3(dg3Var, wf3Var, 1));
        }
    }

    @Override // defpackage.km3
    public final String zzh() {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        ee3 ee3Var = new ee3();
        dg3Var.c(new jf3(dg3Var, ee3Var, 3));
        return ee3Var.c(500L);
    }

    @Override // defpackage.km3
    public final String zzi() {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        ee3 ee3Var = new ee3();
        dg3Var.c(new jf3(dg3Var, ee3Var, 4));
        return ee3Var.c(500L);
    }

    @Override // defpackage.km3
    public final String zzj() {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        ee3 ee3Var = new ee3();
        dg3Var.c(new jf3(dg3Var, ee3Var, 1));
        return ee3Var.c(50L);
    }

    @Override // defpackage.km3
    public final String zzk() {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        ee3 ee3Var = new ee3();
        dg3Var.c(new jf3(dg3Var, ee3Var, 0));
        return ee3Var.c(500L);
    }

    @Override // defpackage.km3
    public final long zzl() {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        ee3 ee3Var = new ee3();
        dg3Var.c(new jf3(dg3Var, ee3Var, 2));
        Long l = (Long) ee3.H(ee3Var.d(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = dg3Var.d + 1;
        dg3Var.d = i;
        return nextLong + i;
    }

    @Override // defpackage.km3
    public final void zzm(String str) {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        dg3Var.c(new df3(dg3Var, str, 1));
    }

    @Override // defpackage.km3
    public final void zzn(String str) {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        dg3Var.c(new df3(dg3Var, str, 2));
    }

    @Override // defpackage.km3
    public final void zzo(Bundle bundle) {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        dg3Var.c(new bf3(dg3Var, bundle, 0));
    }

    @Override // defpackage.km3
    public final void zzp(String str, String str2, Bundle bundle) {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        dg3Var.c(new cf3(dg3Var, str, str2, bundle));
    }

    @Override // defpackage.km3
    public final List zzq(String str, String str2) {
        return this.zza.g(str, str2);
    }

    @Override // defpackage.km3
    public final int zzr(String str) {
        return this.zza.b(str);
    }

    public final Object zzx(int i) {
        dg3 dg3Var = this.zza;
        dg3Var.getClass();
        ee3 ee3Var = new ee3();
        dg3Var.c(new qf3(dg3Var, ee3Var, i));
        return ee3.H(ee3Var.d(15000L), Object.class);
    }
}
