package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzafq extends zzagb {
    public static final Parcelable.Creator<zzafq> CREATOR = new zzafp();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagb[] zzg;

    zzafq(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zzfs.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzagb[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzg[i2] = (zzagb) parcel.readParcelable(zzagb.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagb, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafq zzafqVar = (zzafq) obj;
            if (this.zzb == zzafqVar.zzb && this.zzc == zzafqVar.zzc && this.zzd == zzafqVar.zzd && this.zze == zzafqVar.zze && zzfs.zzF(this.zza, zzafqVar.zza) && Arrays.equals(this.zzg, zzafqVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzagb zzagbVar : this.zzg) {
            parcel.writeParcelable(zzagbVar, 0);
        }
    }

    public zzafq(String str, int i, int i2, long j, long j2, zzagb[] zzagbVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzagbVarArr;
    }
}
