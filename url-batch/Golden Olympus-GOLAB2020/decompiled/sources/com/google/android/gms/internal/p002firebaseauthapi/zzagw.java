package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagw extends AbstractSafeParcelable implements zzaea<zzagw> {
    public static final Parcelable.Creator<zzagw> CREATOR = new zzagv();
    private static final String zza = "zzagw";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzagw() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagw zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("refresh_token"));
            this.zzc = Strings.emptyToNull(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = Strings.emptyToNull(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e4) {
            throw zzail.zza(e4, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLongObject(parcel, 4, Long.valueOf(zza()), false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        Long l4 = this.zzf;
        l4.longValue();
        SafeParcelWriter.writeLongObject(parcel, 6, l4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        Long l4 = this.zzd;
        if (l4 == null) {
            return 0L;
        }
        return l4.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e4) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzzp(e4);
        }
    }

    public final boolean zzg() {
        return DefaultClock.getInstance().currentTimeMillis() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public static zzagw zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzagw zzagwVar = new zzagw();
            zzagwVar.zzb = jSONObject.optString("refresh_token", null);
            zzagwVar.zzc = jSONObject.optString("access_token", null);
            zzagwVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzagwVar.zze = jSONObject.optString("token_type", null);
            zzagwVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzagwVar;
        } catch (JSONException e4) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzzp(e4);
        }
    }

    public final void zzc(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    public zzagw(String str, String str2, Long l4, String str3) {
        this(str, str2, l4, str3, Long.valueOf(System.currentTimeMillis()));
    }

    zzagw(String str, String str2, Long l4, String str3, Long l5) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l4;
        this.zze = str3;
        this.zzf = l5;
    }

    public final String zzd() {
        return this.zzb;
    }
}
