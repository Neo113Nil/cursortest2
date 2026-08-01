package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzayk implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzccf zza;
    final /* synthetic */ zzayl zzb;

    zzayk(zzayl zzaylVar, zzccf zzccfVar) {
        this.zzb = zzaylVar;
        this.zza = zzccfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
