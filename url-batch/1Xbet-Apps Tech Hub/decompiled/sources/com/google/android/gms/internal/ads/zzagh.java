package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzagh extends zzagb {
    public static final Parcelable.Creator<zzagh> CREATOR = new zzagg();
    public final String zza;
    public final byte[] zzb;

    zzagh(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzfs.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagh zzaghVar = (zzagh) obj;
            if (zzfs.zzF(this.zza, zzaghVar.zza) && Arrays.equals(this.zzb, zzaghVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzagh(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
