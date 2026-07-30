package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public interface zzcaz extends IInterface {
    void zzb(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) throws RemoteException;

    void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcbg zzcbgVar) throws RemoteException;

    void zze(zzcbc zzcbcVar) throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    Bundle zzg() throws RemoteException;

    void zzh(zzcbn zzcbnVar) throws RemoteException;

    boolean zzi() throws RemoteException;

    String zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    zzcaw zzl() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzm() throws RemoteException;

    String zzn() throws RemoteException;

    void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException;

    void zzp(boolean z) throws RemoteException;

    long zzq() throws RemoteException;

    void zzr(long j) throws RemoteException;

    void zzs(zzcbh zzcbhVar) throws RemoteException;
}
