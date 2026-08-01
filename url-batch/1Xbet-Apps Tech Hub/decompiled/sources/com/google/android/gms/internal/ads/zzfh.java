package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfh {
    private static zzfh zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzfh(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzfg(this, null), intentFilter);
    }

    public static synchronized zzfh zzb(Context context) {
        zzfh zzfhVar;
        synchronized (zzfh.class) {
            if (zza == null) {
                zza = new zzfh(context);
            }
            zzfhVar = zza;
        }
        return zzfhVar;
    }

    static /* synthetic */ void zzc(zzfh zzfhVar, int i) {
        synchronized (zzfhVar.zzd) {
            if (zzfhVar.zze == i) {
                return;
            }
            zzfhVar.zze = i;
            Iterator it = zzfhVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzyo zzyoVar = (zzyo) weakReference.get();
                if (zzyoVar != null) {
                    zzyoVar.zza.zzk(i);
                } else {
                    zzfhVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final zzyo zzyoVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzyoVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfd
            @Override // java.lang.Runnable
            public final void run() {
                zzyoVar.zza.zzk(zzfh.this.zza());
            }
        });
    }
}
