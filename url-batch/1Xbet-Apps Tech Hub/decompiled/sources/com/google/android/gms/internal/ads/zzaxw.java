package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaxw implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzaxx zza;

    zzaxw(zzaxx zzaxxVar) {
        this.zza = zzaxxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzaya zzayaVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzaxx zzaxxVar = this.zza;
            zzayaVar = zzaxxVar.zzd;
            if (zzayaVar != null) {
                zzaxxVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
