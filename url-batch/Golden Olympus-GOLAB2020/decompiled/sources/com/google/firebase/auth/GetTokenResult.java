package com.google.firebase.auth;

import io.jsonwebtoken.Claims;
import java.util.Map;

/* loaded from: classes.dex */
public class GetTokenResult {
    private String zza;
    private Map<String, Object> zzb;

    public GetTokenResult(String str, Map<String, Object> map) {
        this.zza = str;
        this.zzb = map;
    }

    private final long zza(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long getAuthTimestamp() {
        return zza("auth_time");
    }

    public Map<String, Object> getClaims() {
        return this.zzb;
    }

    public long getExpirationTimestamp() {
        return zza(Claims.EXPIRATION);
    }

    public long getIssuedAtTimestamp() {
        return zza(Claims.ISSUED_AT);
    }

    public String getSignInProvider() {
        Map map = (Map) this.zzb.get(FirebaseAuthProvider.PROVIDER_ID);
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String getSignInSecondFactor() {
        Map map = (Map) this.zzb.get(FirebaseAuthProvider.PROVIDER_ID);
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    public String getToken() {
        return this.zza;
    }
}
