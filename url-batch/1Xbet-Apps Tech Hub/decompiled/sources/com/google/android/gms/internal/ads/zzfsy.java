package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfsy implements ServiceConnection {
    final /* synthetic */ zzfsz zza;

    /* synthetic */ zzfsy(zzfsz zzfszVar, zzfsx zzfsxVar) {
        this.zza = zzfszVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfso zzfsoVar;
        zzfsoVar = this.zza.zzc;
        zzfsoVar.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new zzfsv(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfso zzfsoVar;
        zzfsoVar = this.zza.zzc;
        zzfsoVar.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new zzfsw(this));
    }
}
