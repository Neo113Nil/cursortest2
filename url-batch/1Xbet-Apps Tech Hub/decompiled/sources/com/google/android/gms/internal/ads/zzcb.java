package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcb implements Parcelable {
    public static final Parcelable.Creator<zzcb> CREATOR = new zzbz();
    public final long zza;
    private final zzca[] zzb;

    public zzcb(long j, zzca... zzcaVarArr) {
        this.zza = j;
        this.zzb = zzcaVarArr;
    }

    zzcb(Parcel parcel) {
        this.zzb = new zzca[parcel.readInt()];
        int i = 0;
        while (true) {
            zzca[] zzcaVarArr = this.zzb;
            if (i >= zzcaVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzcaVarArr[i] = (zzca) parcel.readParcelable(zzca.class.getClassLoader());
                i++;
            }
        }
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
            zzcb zzcbVar = (zzcb) obj;
            if (Arrays.equals(this.zzb, zzcbVar.zzb) && this.zza == zzcbVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        long j = this.zza;
        String arrays = Arrays.toString(this.zzb);
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzca zzcaVar : this.zzb) {
            parcel.writeParcelable(zzcaVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzca zzb(int i) {
        return this.zzb[i];
    }

    public final zzcb zzc(zzca... zzcaVarArr) {
        int length = zzcaVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzca[] zzcaVarArr2 = this.zzb;
        int i = zzfs.zza;
        int length2 = zzcaVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzcaVarArr2, length2 + length);
        System.arraycopy(zzcaVarArr, 0, copyOf, length2, length);
        return new zzcb(j, (zzca[]) copyOf);
    }

    public final zzcb zzd(zzcb zzcbVar) {
        return zzcbVar == null ? this : zzc(zzcbVar.zzb);
    }

    public zzcb(List list) {
        this(-9223372036854775807L, (zzca[]) list.toArray(new zzca[0]));
    }
}
