package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfqz extends zzfsa {
    public zzfqz(ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        super(clientApi, context, i, zzfkgVar, zzftVar, zzceVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final ListenableFuture zza(Context context) {
        zzbtt zzd = this.zzd.zzd();
        if (zzd == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an app open ad manager."));
        }
        com.google.android.gms.ads.internal.client.zzbx zzm = this.zza.zzm(ObjectWrapper.wrap(context), com.google.android.gms.ads.internal.client.zzr.zzd(), this.zze.zza, zzd, this.zzc);
        if (zzm == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an app open ad manager."));
        }
        zzhah zze = zzhah.zze();
        try {
            zzx(this.zze.zzc);
            zzm.zzJ(new zzfqy(this, zze, this.zze));
            zzm.zze(this.zze.zzc);
            return zze;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad.", e);
            return zzgzo.zzc(new zzfqs(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzS)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzc(Object obj) {
        try {
            return ((zzbex) obj).zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the app open ad.", e);
            return null;
        }
    }

    public zzfqz(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, zzfqr zzfqrVar) {
        super(str, clientApi, context, i, zzfkgVar, zzftVar, zzchVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
    }
}
