package com.linecorp.linesdk.internal.nwclient;

import R2.a;
import R2.b;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.internal.JWKSet;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.security.SecurityException;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;

/* loaded from: classes2.dex */
public class OpenIdSigningKeyResolver implements SigningKeyResolver {
    private static final String TAG = "OpenIdSignKeyResolver";

    @NonNull
    private final LineAuthenticationApiClient apiClient;

    public OpenIdSigningKeyResolver(@NonNull LineAuthenticationApiClient lineAuthenticationApiClient) {
        this.apiClient = lineAuthenticationApiClient;
    }

    private static BigInteger decodeBase64(String str) {
        return new BigInteger(1, Base64.decode(str, 8));
    }

    private static ECPublicKey generateECPublicKey(JWKSet.JWK jwk) {
        BigInteger decodeBase64 = decodeBase64(jwk.getX());
        BigInteger decodeBase642 = decodeBase64(jwk.getY());
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            ECPoint eCPoint = new ECPoint(decodeBase64, decodeBase642);
            a a4 = Q2.a.a(jwk.getCurve());
            return (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, new b(jwk.getCurve(), a4.a(), a4.b(), a4.c())));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e4) {
            Log.e(TAG, "failed to generate EC Public Key from JWK: " + jwk, e4);
            return null;
        }
    }

    @Override // io.jsonwebtoken.SigningKeyResolver
    public Key resolveSigningKey(JwsHeader jwsHeader, Claims claims) {
        return resolveSigningKey(jwsHeader);
    }

    @Override // io.jsonwebtoken.SigningKeyResolver
    public Key resolveSigningKey(JwsHeader jwsHeader, String str) {
        return resolveSigningKey(jwsHeader);
    }

    private Key resolveSigningKey(JwsHeader jwsHeader) {
        LineApiResponse<JWKSet> jWKSet = this.apiClient.getJWKSet();
        if (!jWKSet.isSuccess()) {
            Log.e(TAG, "failed to get LINE JSON Web Key Set [JWK] document.");
            return null;
        }
        JWKSet responseData = jWKSet.getResponseData();
        String keyId = jwsHeader.getKeyId();
        JWKSet.JWK jwk = responseData.getJWK(keyId);
        if (jwk == null) {
            Log.e(TAG, "failed to find Key by Id: " + keyId);
            return null;
        }
        String algorithm = jwsHeader.getAlgorithm();
        if (SignatureAlgorithm.forName(algorithm).isEllipticCurve()) {
            return generateECPublicKey(jwk);
        }
        throw new SecurityException("Unsupported signature algorithm '" + algorithm + '\'');
    }
}
