package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzayl {
    private zzaya zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzayl(Context context) {
        this.zzc = context;
    }

    final Future zzc(zzayb zzaybVar) {
        zzayf zzayfVar = new zzayf(this);
        zzayj zzayjVar = new zzayj(this, zzaybVar, zzayfVar);
        zzayk zzaykVar = new zzayk(this, zzayfVar);
        synchronized (this.zzd) {
            zzaya zzayaVar = new zzaya(this.zzc, com.google.android.gms.ads.internal.zzt.zzt().zzb(), zzayjVar, zzaykVar);
            this.zza = zzayaVar;
            zzayaVar.checkAvailabilityAndConnect();
        }
        return zzayfVar;
    }

    static /* bridge */ /* synthetic */ void zze(zzayl zzaylVar) {
        synchronized (zzaylVar.zzd) {
            zzaya zzayaVar = zzaylVar.zza;
            if (zzayaVar == null) {
                return;
            }
            zzayaVar.disconnect();
            zzaylVar.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
