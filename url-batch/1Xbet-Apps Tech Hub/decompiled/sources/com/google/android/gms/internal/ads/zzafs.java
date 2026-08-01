package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzafs extends zzagb {
    public static final Parcelable.Creator<zzafs> CREATOR = new zzafr();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagb[] zze;

    zzafs(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzfs.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzagb[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzagb) parcel.readParcelable(zzagb.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafs zzafsVar = (zzafs) obj;
            if (this.zzb == zzafsVar.zzb && this.zzc == zzafsVar.zzc && zzfs.zzF(this.zza, zzafsVar.zza) && Arrays.equals(this.zzd, zzafsVar.zzd) && Arrays.equals(this.zze, zzafsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzagb zzagbVar : this.zze) {
            parcel.writeParcelable(zzagbVar, 0);
        }
    }

    public zzafs(String str, boolean z, boolean z2, String[] strArr, zzagb[] zzagbVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzagbVarArr;
    }
}
