package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzafm extends zzagb {
    public static final Parcelable.Creator<zzafm> CREATOR = new zzafl();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    zzafm(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzfs.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafm zzafmVar = (zzafm) obj;
            if (this.zzc == zzafmVar.zzc && zzfs.zzF(this.zza, zzafmVar.zza) && zzfs.zzF(this.zzb, zzafmVar.zzb) && Arrays.equals(this.zzd, zzafmVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return ((((((i + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagb, com.google.android.gms.internal.ads.zzca
    public final void zza(zzbw zzbwVar) {
        zzbwVar.zza(this.zzd, this.zzc);
    }

    public zzafm(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
