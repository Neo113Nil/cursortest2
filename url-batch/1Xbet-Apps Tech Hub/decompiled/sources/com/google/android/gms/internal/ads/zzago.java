package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzago implements zzca {
    public static final Parcelable.Creator<zzago> CREATOR = new zzagm();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzago(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    /* synthetic */ zzago(Parcel parcel, zzagn zzagnVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzago zzagoVar = (zzago) obj;
            if (this.zza == zzagoVar.zza && this.zzb == zzagoVar.zzb && this.zzc == zzagoVar.zzc && this.zzd == zzagoVar.zzd && this.zze == zzagoVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zze;
        long j2 = this.zza;
        int i = ((int) (j2 ^ (j2 >>> 32))) + 527;
        long j3 = j ^ (j >>> 32);
        long j4 = this.zzd;
        long j5 = j4 ^ (j4 >>> 32);
        long j6 = this.zzc;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.zzb;
        return (((((((i * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31) + ((int) j7)) * 31) + ((int) j5)) * 31) + ((int) j3);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzca
    public final /* synthetic */ void zza(zzbw zzbwVar) {
    }
}
