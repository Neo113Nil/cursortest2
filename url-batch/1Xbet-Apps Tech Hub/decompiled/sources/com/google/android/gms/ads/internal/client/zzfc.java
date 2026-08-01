package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbxg;
import com.google.android.gms.internal.ads.zzbxi;
import com.google.android.gms.internal.ads.zzbxm;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfc extends zzbxi {
    private static void zzr(final zzbxq zzbxqVar) {
        zzcbn.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcbg.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                zzbxq zzbxqVar2 = zzbxq.this;
                if (zzbxqVar2 != null) {
                    try {
                        zzbxqVar2.zze(1);
                    } catch (RemoteException e) {
                        zzcbn.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final zzdn zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final zzbxg zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzf(zzl zzlVar, zzbxq zzbxqVar) throws RemoteException {
        zzr(zzbxqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzg(zzl zzlVar, zzbxq zzbxqVar) throws RemoteException {
        zzr(zzbxqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzi(zzdd zzddVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzk(zzbxm zzbxmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzl(zzbxx zzbxxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzp(zzbxr zzbxrVar) throws RemoteException {
    }
}
