package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes3.dex */
public final class zzlj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlj> CREATOR = new zzlk();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final long zzc;

    @Nullable
    @SafeParcelable.Field(id = 4)
    public final Long zzd;

    @Nullable
    @SafeParcelable.Field(id = 6)
    public final String zze;

    @SafeParcelable.Field(id = 7)
    public final String zzf;

    @Nullable
    @SafeParcelable.Field(id = 8)
    public final Double zzg;

    @SafeParcelable.Constructor
    zzlj(@SafeParcelable.Param(id = 1) int i8, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j8, @Nullable @SafeParcelable.Param(id = 4) Long l8, @SafeParcelable.Param(id = 5) Float f8, @Nullable @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @Nullable @SafeParcelable.Param(id = 8) Double d8) {
        this.zza = i8;
        this.zzb = str;
        this.zzc = j8;
        this.zzd = l8;
        if (i8 == 1) {
            this.zzg = f8 != null ? Double.valueOf(f8.doubleValue()) : null;
        } else {
            this.zzg = d8;
        }
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        zzlk.zza(this, parcel, i8);
    }

    @Nullable
    public final Object zza() {
        Long l8 = this.zzd;
        if (l8 != null) {
            return l8;
        }
        Double d8 = this.zzg;
        if (d8 != null) {
            return d8;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzlj(zzll zzllVar) {
        this(zzllVar.zzc, zzllVar.zzd, zzllVar.zze, zzllVar.zzb);
    }

    zzlj(String str, long j8, @Nullable Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j8;
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
