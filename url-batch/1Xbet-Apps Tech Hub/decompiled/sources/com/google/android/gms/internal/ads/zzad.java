package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzad implements Comparator<zzac>, Parcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzaa();
    public final String zza;
    public final int zzb;
    private final zzac[] zzc;
    private int zzd;

    zzad(Parcel parcel) {
        this.zza = parcel.readString();
        zzac[] zzacVarArr = (zzac[]) parcel.createTypedArray(zzac.CREATOR);
        int i = zzfs.zza;
        this.zzc = zzacVarArr;
        this.zzb = zzacVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzac zzacVar, zzac zzacVar2) {
        zzac zzacVar3 = zzacVar;
        zzac zzacVar4 = zzacVar2;
        return zzo.zza.equals(zzacVar3.zza) ? !zzo.zza.equals(zzacVar4.zza) ? 1 : 0 : zzacVar3.zza.compareTo(zzacVar4.zza);
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
            zzad zzadVar = (zzad) obj;
            if (zzfs.zzF(this.zza, zzadVar.zza) && Arrays.equals(this.zzc, zzadVar.zzc)) {
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

    public final zzac zza(int i) {
        return this.zzc[i];
    }

    public final zzad zzb(String str) {
        return zzfs.zzF(this.zza, str) ? this : new zzad(str, false, this.zzc);
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

    private zzad(String str, boolean z, zzac... zzacVarArr) {
        this.zza = str;
        zzacVarArr = z ? (zzac[]) zzacVarArr.clone() : zzacVarArr;
        this.zzc = zzacVarArr;
        this.zzb = zzacVarArr.length;
        Arrays.sort(zzacVarArr, this);
    }

    public zzad(String str, zzac... zzacVarArr) {
        this(null, true, zzacVarArr);
    }

    public zzad(List list) {
        this(null, false, (zzac[]) list.toArray(new zzac[0]));
    }
}
