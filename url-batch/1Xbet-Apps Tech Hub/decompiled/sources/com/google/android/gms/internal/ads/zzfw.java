package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfw implements zzca {
    public static final Parcelable.Creator<zzfw> CREATOR = new zzfu();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* synthetic */ zzfw(Parcel parcel, zzfv zzfvVar) {
        String readString = parcel.readString();
        int i = zzfs.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzfw(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
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
            zzfw zzfwVar = (zzfw) obj;
            if (this.zza.equals(zzfwVar.zza) && Arrays.equals(this.zzb, zzfwVar.zzb) && this.zzc == zzfwVar.zzc && this.zzd == zzfwVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzca
    public final /* synthetic */ void zza(zzbw zzbwVar) {
    }

    public final String toString() {
        String str;
        int i = this.zzd;
        if (i != 1) {
            if (i == 23) {
                byte[] bArr = this.zzb;
                int i2 = zzfs.zza;
                zzef.zzd(bArr.length == 4);
                str = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | ((bArr[1] & 255) << 16) | (bArr[0] << Ascii.CAN) | ((bArr[2] & 255) << 8)));
            } else if (i != 67) {
                byte[] bArr2 = this.zzb;
                int length = bArr2.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i3 = 0; i3 < bArr2.length; i3++) {
                    sb.append(Character.forDigit((bArr2[i3] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr2[i3] & Ascii.SI, 16));
                }
                str = sb.toString();
            } else {
                byte[] bArr3 = this.zzb;
                int i4 = zzfs.zza;
                zzef.zzd(bArr3.length == 4);
                str = String.valueOf(bArr3[3] | (bArr3[1] << 16) | (bArr3[0] << Ascii.CAN) | (bArr3[2] << 8));
            }
        } else {
            str = new String(this.zzb, zzftl.zzc);
        }
        return "mdta: key=" + this.zza + ", value=" + str;
    }
}
