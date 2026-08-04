package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzp implements Comparator<zzo>, Parcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzm();
    public final String zza;
    public final int zzb;
    private final zzo[] zzc;
    private int zzd;

    zzp(Parcel parcel) {
        this.zza = parcel.readString();
        zzo[] zzoVarArr = (zzo[]) parcel.createTypedArray(zzo.CREATOR);
        String str = zzeo.zza;
        zzo[] zzoVarArr2 = zzoVarArr;
        this.zzc = zzoVarArr2;
        this.zzb = zzoVarArr2.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzo zzoVar, zzo zzoVar2) {
        zzo zzoVar3 = zzoVar2;
        UUID uuid = zzf.zza;
        UUID uuid2 = zzoVar.zza;
        return uuid.equals(uuid2) ? !uuid.equals(zzoVar3.zza) ? 1 : 0 : uuid2.compareTo(zzoVar3.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzp zzpVar = (zzp) obj;
            if (Objects.equals(this.zza, zzpVar.zza) && Arrays.equals(this.zzc, zzpVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzo zza(int i) {
        return this.zzc[i];
    }

    public final zzp zzb(String str) {
        return Objects.equals(this.zza, str) ? this : new zzp(str, false, this.zzc);
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    private zzp(String str, boolean z, zzo... zzoVarArr) {
        this.zza = str;
        zzoVarArr = z ? (zzo[]) zzoVarArr.clone() : zzoVarArr;
        this.zzc = zzoVarArr;
        this.zzb = zzoVarArr.length;
        Arrays.sort(zzoVarArr, this);
    }

    public zzp(String str, zzo... zzoVarArr) {
        this(null, true, zzoVarArr);
    }

    public zzp(List list) {
        this(null, false, (zzo[]) list.toArray(new zzo[0]));
    }
}
