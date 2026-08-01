package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbn;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzey extends zzcn {
    private zzbmh zza;

    final /* synthetic */ void zzb() {
        zzbmh zzbmhVar = this.zza;
        if (zzbmhVar != null) {
            try {
                zzbmhVar.zzb(Collections.emptyList());
            } catch (RemoteException e) {
                zzcbn.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() throws RemoteException {
        zzcbn.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcbg.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzex
            @Override // java.lang.Runnable
            public final void run() {
                zzey.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbpr zzbprVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbmh zzbmhVar) throws RemoteException {
        this.zza = zzbmhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() throws RemoteException {
        return false;
    }
}
