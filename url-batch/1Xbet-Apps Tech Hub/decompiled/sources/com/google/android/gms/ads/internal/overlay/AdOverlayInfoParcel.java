package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcyu;
import com.google.android.gms.internal.ads.zzdge;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzo zzc;
    public final zzcgv zzd;
    public final zzbiv zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzz zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final zzcbt zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzj zzo;
    public final zzbit zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final zzcyu zzt;
    public final zzdge zzu;
    public final zzbti zzv;
    public final boolean zzw;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzbit zzbitVar, zzbiv zzbivVar, zzz zzzVar, zzcgv zzcgvVar, boolean z, int i, String str, zzcbt zzcbtVar, zzdge zzdgeVar, zzbti zzbtiVar, boolean z2) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcgvVar;
        this.zzp = zzbitVar;
        this.zze = zzbivVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzcbtVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdgeVar;
        this.zzv = zzbtiVar;
        this.zzw = z2;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzc zzcVar = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzcVar, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel, 26, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 28, ObjectWrapper.wrap(this.zzv).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzbit zzbitVar, zzbiv zzbivVar, zzz zzzVar, zzcgv zzcgvVar, boolean z, int i, String str, String str2, zzcbt zzcbtVar, zzdge zzdgeVar, zzbti zzbtiVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcgvVar;
        this.zzp = zzbitVar;
        this.zze = zzbivVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcbtVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdgeVar;
        this.zzv = zzbtiVar;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzcgv zzcgvVar, int i, zzcbt zzcbtVar, String str, com.google.android.gms.ads.internal.zzj zzjVar, String str2, String str3, String str4, zzcyu zzcyuVar, zzbti zzbtiVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzoVar;
        this.zzd = zzcgvVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().zza(zzbdc.zzaH)).booleanValue()) {
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
        this.zzm = zzcbtVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzcyuVar;
        this.zzu = null;
        this.zzv = zzbtiVar;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzcgv zzcgvVar, boolean z, int i, zzcbt zzcbtVar, zzdge zzdgeVar, zzbti zzbtiVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcgvVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcbtVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdgeVar;
        this.zzv = zzbtiVar;
        this.zzw = false;
    }

    AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzcbt zzcbtVar, String str4, com.google.android.gms.ads.internal.zzj zzjVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2) {
        this.zza = zzcVar;
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcgv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbit) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbiv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzcbtVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (zzcyu) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzdge) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbti) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
        this.zzw = z2;
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzcbt zzcbtVar, zzcgv zzcgvVar, zzdge zzdgeVar) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcgvVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcbtVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdgeVar;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(zzo zzoVar, zzcgv zzcgvVar, int i, zzcbt zzcbtVar) {
        this.zzc = zzoVar;
        this.zzd = zzcgvVar;
        this.zzj = 1;
        this.zzm = zzcbtVar;
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
    }

    public AdOverlayInfoParcel(zzcgv zzcgvVar, zzcbt zzcbtVar, String str, String str2, int i, zzbti zzbtiVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcgvVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcbtVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbtiVar;
        this.zzw = false;
    }
}
