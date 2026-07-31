package com.linecorp.linesdk.internal.nwclient;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Scopes;
import com.linecorp.linesdk.LineIdToken;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SigningKeyResolver;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class IdTokenParser {
    private static final long ALLOWED_CLOCK_SKEW_SECONDS = TimeUnit.DAYS.toSeconds(10000);
    private static final String TAG = "IdTokenParser";

    private IdTokenParser() {
    }

    private static LineIdToken.Address buildAddress(Claims claims) {
        Map map = (Map) claims.get("address", Map.class);
        if (map == null) {
            return null;
        }
        return new LineIdToken.Address.Builder().streetAddress((String) map.get("street_address")).locality((String) map.get("locality")).region((String) map.get("region")).postalCode((String) map.get("postal_code")).country((String) map.get("country")).build();
    }

    @NonNull
    private static LineIdToken buildIdToken(String str, Claims claims) {
        return new LineIdToken.Builder().rawString(str).issuer(claims.getIssuer()).subject(claims.getSubject()).audience(claims.getAudience()).expiresAt(claims.getExpiration()).issuedAt(claims.getIssuedAt()).authTime((Date) claims.get("auth_time", Date.class)).nonce((String) claims.get("nonce", String.class)).amr((List) claims.get("amr", List.class)).name((String) claims.get("name", String.class)).picture((String) claims.get("picture", String.class)).phoneNumber((String) claims.get("phone_number", String.class)).email((String) claims.get(Scopes.EMAIL, String.class)).gender((String) claims.get("gender", String.class)).birthdate((String) claims.get("birthdate", String.class)).address(buildAddress(claims)).givenName((String) claims.get("given_name", String.class)).givenNamePronunciation((String) claims.get("given_name_pronunciation", String.class)).middleName((String) claims.get("middle_name", String.class)).familyName((String) claims.get("family_name", String.class)).familyNamePronunciation((String) claims.get("family_name_pronunciation", String.class)).build();
    }

    public static LineIdToken parse(String str, SigningKeyResolver signingKeyResolver) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return buildIdToken(str, Jwts.parser().setAllowedClockSkewSeconds(ALLOWED_CLOCK_SKEW_SECONDS).setSigningKeyResolver(signingKeyResolver).parseClaimsJws(str).getBody());
        } catch (Exception e4) {
            Log.e(TAG, "failed to parse IdToken: " + str, e4);
            throw e4;
        }
    }
}
