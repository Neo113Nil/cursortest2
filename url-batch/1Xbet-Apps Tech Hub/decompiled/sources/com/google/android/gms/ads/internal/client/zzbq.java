package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbhg zzbhgVar) throws RemoteException;

    void zzg(zzbhj zzbhjVar) throws RemoteException;

    void zzh(String str, zzbhp zzbhpVar, zzbhm zzbhmVar) throws RemoteException;

    void zzi(zzbmv zzbmvVar) throws RemoteException;

    void zzj(zzbht zzbhtVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbhw zzbhwVar) throws RemoteException;

    void zzl(zzbh zzbhVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbmm zzbmmVar) throws RemoteException;

    void zzo(zzbfw zzbfwVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcf zzcfVar) throws RemoteException;
}
