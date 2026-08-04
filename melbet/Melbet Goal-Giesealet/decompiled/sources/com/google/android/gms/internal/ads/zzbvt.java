package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbvt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvt> CREATOR = new zzbvu();
    public final String zza;
    public final int zzb;

    public zzbvt(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static zzbvt zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzbvt(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbvt)) {
            return false;
        }
        zzbvt zzbvtVar = (zzbvt) obj;
        return Objects.equal(this.zza, zzbvtVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbvtVar.zzb));
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
