package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzagl extends zzagb {
    public static final Parcelable.Creator<zzagl> CREATOR = new zzagk();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzagl(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zzfs.zza;
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagl zzaglVar = (zzagl) obj;
            if (this.zzf.equals(zzaglVar.zzf) && zzfs.zzF(this.zza, zzaglVar.zza) && zzfs.zzF(this.zzb, zzaglVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i = hashCode * 31;
        String str2 = this.zzb;
        return ((i + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzagl(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
