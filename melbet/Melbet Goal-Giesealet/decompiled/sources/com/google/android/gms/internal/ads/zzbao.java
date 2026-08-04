package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbao implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbap zza;

    zzbao(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            zzbapVar.zzk(null);
            if (zzbapVar.zzi() != null) {
                zzbapVar.zzj(null);
            }
            zzbapVar.zzh().notifyAll();
        }
    }
}
