package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import io.jsonwebtoken.Claims;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagx {
    private Long zza;
    private Long zzb;

    public static zzagx zza(String str) {
        try {
            zzagx zzagxVar = new zzagx();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString(Claims.ISSUER);
            jSONObject.optString(Claims.AUDIENCE);
            jSONObject.optString(Claims.SUBJECT);
            zzagxVar.zza = Long.valueOf(jSONObject.optLong(Claims.ISSUED_AT));
            zzagxVar.zzb = Long.valueOf(jSONObject.optLong(Claims.EXPIRATION));
            jSONObject.optBoolean("is_anonymous");
            return zzagxVar;
        } catch (JSONException e4) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + String.valueOf(e4));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + String.valueOf(e4));
        }
    }

    public final Long zzb() {
        return this.zza;
    }

    public final Long zza() {
        return this.zzb;
    }
}
