package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzqb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqb> CREATOR = new zzqc();
    public final int zza;
    public final String zzb;
    public final long zzc;
    public final Long zzd;
    public final String zze;
    public final String zzf;
    public final Double zzg;

    zzqb(int i4, String str, long j4, Long l4, Float f4, String str2, String str3, Double d4) {
        this.zza = i4;
        this.zzb = str;
        this.zzc = j4;
        this.zzd = l4;
        this.zzg = i4 == 1 ? f4 != null ? Double.valueOf(f4.doubleValue()) : null : d4;
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        zzqc.zza(this, parcel, i4);
    }

    public final Object zza() {
        Long l4 = this.zzd;
        if (l4 != null) {
            return l4;
        }
        Double d4 = this.zzg;
        if (d4 != null) {
            return d4;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzqb(zzqd zzqdVar) {
        this(zzqdVar.zzc, zzqdVar.zzd, zzqdVar.zze, zzqdVar.zzb);
    }

    zzqb(String str, long j4, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j4;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzd = null;
                this.zzg = (Double) obj;
                this.zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
