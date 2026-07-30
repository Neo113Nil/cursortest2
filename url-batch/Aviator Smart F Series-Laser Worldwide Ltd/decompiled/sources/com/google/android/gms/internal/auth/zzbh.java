package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* loaded from: classes3.dex */
public final class zzbh extends zza {
    zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) {
        Parcel zza = zza();
        zzc.zze(zza, zzbgVar);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbgVar, ProxyRequest proxyRequest) {
        Parcel zza = zza();
        zzc.zze(zza, zzbgVar);
        zzc.zzd(zza, proxyRequest);
        zzc(1, zza);
    }
}
