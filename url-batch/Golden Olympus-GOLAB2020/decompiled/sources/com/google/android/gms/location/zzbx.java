package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    public zzbx(int i4, int i5, int i6, int i7) {
        Preconditions.checkState(i4 >= 0 && i4 <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(i5 >= 0 && i5 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(i6 >= 0 && i6 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(i7 >= 0 && i7 <= 59, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i4 + i5) + i6) + i7 > 0, "Parameters can't be all 0.");
        this.zza = i4;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        return this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i4 = this.zza;
        int i5 = this.zzb;
        int i6 = this.zzc;
        int i7 = this.zzd;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i4);
        sb.append(", startMinute=");
        sb.append(i5);
        sb.append(", endHour=");
        sb.append(i6);
        sb.append(", endMinute=");
        sb.append(i7);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
