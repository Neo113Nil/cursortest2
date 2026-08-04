package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcwf;
import com.google.android.gms.internal.ads.zzddz;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    private static final AtomicLong zzy = new AtomicLong(0);
    private static final ConcurrentHashMap zzz = new ConcurrentHashMap();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzq zzc;
    public final zzcek zzd;
    public final zzbid zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzac zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final VersionInfoParcel zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzl zzo;
    public final zzbib zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final zzcwf zzt;
    public final zzddz zzu;
    public final zzbsp zzv;
    public final boolean zzw;
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzbib zzbibVar, zzbid zzbidVar, zzac zzacVar, zzcek zzcekVar, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, zzddz zzddzVar, zzbsp zzbspVar, boolean z2) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = zzbibVar;
        this.zze = zzbidVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddzVar;
        this.zzv = zzbspVar;
        this.zzw = z2;
        this.zzx = zzy.getAndIncrement();
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) zzbd.zzc().zzd(zzbci.zznL)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder zzc(Object obj) {
        if (((Boolean) zzbd.zzc().zzd(zzbci.zznL)).booleanValue()) {
            return null;
        }
        return ObjectWrapper.wrap(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 3, zzc(zzaVar), false);
        zzq zzqVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 4, zzc(zzqVar), false);
        zzcek zzcekVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, zzc(zzcekVar), false);
        zzbid zzbidVar = this.zze;
        SafeParcelWriter.writeIBinder(parcel, 6, zzc(zzbidVar), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        zzac zzacVar = this.zzi;
        SafeParcelWriter.writeIBinder(parcel, 10, zzc(zzacVar), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        zzbib zzbibVar = this.zzp;
        SafeParcelWriter.writeIBinder(parcel, 18, zzc(zzbibVar), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        zzcwf zzcwfVar = this.zzt;
        SafeParcelWriter.writeIBinder(parcel, 26, zzc(zzcwfVar), false);
        zzddz zzddzVar = this.zzu;
        SafeParcelWriter.writeIBinder(parcel, 27, zzc(zzddzVar), false);
        zzbsp zzbspVar = this.zzv;
        SafeParcelWriter.writeIBinder(parcel, 28, zzc(zzbspVar), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        long j = this.zzx;
        SafeParcelWriter.writeLong(parcel, 30, j);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if (((Boolean) zzbd.zzc().zzd(zzbci.zznL)).booleanValue()) {
            zzz.put(Long.valueOf(j), new zzo(zzaVar, zzqVar, zzcekVar, zzbibVar, zzbidVar, zzacVar, zzcwfVar, zzddzVar, zzbspVar, zzbzh.zzd.schedule(new zzp(j), ((Integer) zzbd.zzc().zzd(zzbci.zznN)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzbib zzbibVar, zzbid zzbidVar, zzac zzacVar, zzcek zzcekVar, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, zzddz zzddzVar, zzbsp zzbspVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = zzbibVar;
        this.zze = zzbidVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddzVar;
        this.zzv = zzbspVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzac zzacVar, zzcek zzcekVar, int i, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzcwf zzcwfVar, zzbsp zzbspVar, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zzaY)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcwfVar;
        this.zzu = null;
        this.zzv = zzbspVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzac zzacVar, zzcek zzcekVar, boolean z, int i, VersionInfoParcel versionInfoParcel, zzddz zzddzVar, zzbsp zzbspVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddzVar;
        this.zzv = zzbspVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2, long j) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z2;
        this.zzx = j;
        if (((Boolean) zzbd.zzc().zzd(zzbci.zznL)).booleanValue()) {
            zzo zzoVar = (zzo) zzz.remove(Long.valueOf(j));
            if (zzoVar != null) {
                this.zzb = zzoVar.zza();
                this.zzc = zzoVar.zzb();
                this.zzd = zzoVar.zzc();
                this.zzp = zzoVar.zzd();
                this.zze = zzoVar.zze();
                this.zzt = zzoVar.zzg();
                this.zzu = zzoVar.zzh();
                this.zzv = zzoVar.zzi();
                this.zzi = zzoVar.zzf();
                zzoVar.zzj().cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzq) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcek) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbib) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbid) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzi = (zzac) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzt = (zzcwf) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzddz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbsp) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzq zzqVar, zzac zzacVar, VersionInfoParcel versionInfoParcel, zzcek zzcekVar, zzddz zzddzVar, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzddzVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzq zzqVar, zzcek zzcekVar, int i, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzqVar;
        this.zzd = zzcekVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcek zzcekVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i, zzbsp zzbspVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcekVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbspVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
