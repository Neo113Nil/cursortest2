package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbbm {
    zzaye zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbbm() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbbm(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfD)).booleanValue();
                Context context2 = context;
                zzbbm zzbbmVar = zzbbm.this;
                if (booleanValue) {
                    try {
                        zzbbmVar.zza = (zzaye) com.google.android.gms.ads.internal.util.client.zzs.zza(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbbj.zza);
                        zzbbmVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbbmVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
