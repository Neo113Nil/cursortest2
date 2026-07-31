package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();
    public String zza;
    public String zzb;
    public zzqb zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzbh zzg;
    public long zzh;
    public zzbh zzi;
    public final long zzj;
    public final zzbh zzk;

    zzai(zzai zzaiVar) {
        Preconditions.checkNotNull(zzaiVar);
        this.zza = zzaiVar.zza;
        this.zzb = zzaiVar.zzb;
        this.zzc = zzaiVar.zzc;
        this.zzd = zzaiVar.zzd;
        this.zze = zzaiVar.zze;
        this.zzf = zzaiVar.zzf;
        this.zzg = zzaiVar.zzg;
        this.zzh = zzaiVar.zzh;
        this.zzi = zzaiVar.zzi;
        this.zzj = zzaiVar.zzj;
        this.zzk = zzaiVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i4, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i4, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i4, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzai(String str, String str2, zzqb zzqbVar, long j4, boolean z4, String str3, zzbh zzbhVar, long j5, zzbh zzbhVar2, long j6, zzbh zzbhVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqbVar;
        this.zzd = j4;
        this.zze = z4;
        this.zzf = str3;
        this.zzg = zzbhVar;
        this.zzh = j5;
        this.zzi = zzbhVar2;
        this.zzj = j6;
        this.zzk = zzbhVar3;
    }
}
