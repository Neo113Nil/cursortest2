package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzafo extends zzagb {
    public static final Parcelable.Creator<zzafo> CREATOR = new zzafn();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzafo(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zzfs.zza;
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafo zzafoVar = (zzafo) obj;
            if (this.zzf.equals(zzafoVar.zzf) && Arrays.equals(this.zza, zzafoVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzafo(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
