package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzafr extends zzagd {
    public static final Parcelable.Creator<zzafr> CREATOR = new zzafq();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzafr(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zzet.zza;
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafr zzafrVar = (zzafr) obj;
            if (this.zzf.equals(zzafrVar.zzf) && Arrays.equals(this.zza, zzafrVar.zza)) {
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

    public zzafr(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
