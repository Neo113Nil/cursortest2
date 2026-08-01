package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzayv {
    zzavl zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzayv() {
        this.zzc = zzcbc.zzb;
    }

    public zzayv(final Context context) {
        ExecutorService executorService = zzcbc.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzayq
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeN)).booleanValue();
                zzayv zzayvVar = zzayv.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzayvVar.zza = (zzavl) zzcbr.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new zzcbp() { // from class: com.google.android.gms.internal.ads.zzayr
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.zzcbp
                            public final Object zza(Object obj) {
                                return zzavk.zzb(obj);
                            }
                        });
                        zzayvVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzayvVar.zzb = true;
                    } catch (RemoteException | zzcbq | NullPointerException unused) {
                        zzcbn.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
