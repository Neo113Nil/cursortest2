package com.facebook.internal.security;

import android.util.Base64;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.c82;
import defpackage.ff0;
import defpackage.tp2;
import defpackage.yh2;
import defpackage.yt;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class OidcSecurityUtil {
    public static final OidcSecurityUtil INSTANCE = new OidcSecurityUtil();
    private static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";
    public static final String SIGNATURE_ALGORITHM_SHA256 = "SHA256withRSA";
    public static final long TIMEOUT_IN_MILLISECONDS = 5000;

    private OidcSecurityUtil() {
    }

    public static final PublicKey getPublicKeyFromString(String str) {
        str.getClass();
        byte[] decode = Base64.decode(tp2.m(tp2.m(tp2.m(str, "\n", BuildConfig.FLAVOR), "-----BEGIN PUBLIC KEY-----", BuildConfig.FLAVOR), "-----END PUBLIC KEY-----", BuildConfig.FLAVOR), 0);
        decode.getClass();
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        generatePublic.getClass();
        return generatePublic;
    }

    public static final String getRawKeyFromEndPoint(String str) {
        str.getClass();
        URL url = new URL(TournamentShareDialogURIBuilder.scheme, "www." + FacebookSdk.getFacebookDomain(), OPENID_KEYS_PATH);
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        c82 c82Var = new c82();
        FacebookSdk.getExecutor().execute(new ff0(url, c82Var, str, reentrantLock, newCondition, 1));
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) c82Var.m;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRawKeyFromEndPoint$lambda$1(URL url, c82 c82Var, String str, ReentrantLock reentrantLock, Condition condition) {
        url.getClass();
        c82Var.getClass();
        str.getClass();
        reentrantLock.getClass();
        URLConnection openConnection = url.openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.getClass();
                String r = yh2.r(new BufferedReader(new InputStreamReader(inputStream, yt.b), Utility.DEFAULT_STREAM_BUFFER_SIZE));
                httpURLConnection.getInputStream().close();
                c82Var.m = new JSONObject(r).optString(str);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    Unit unit = Unit.a;
                } finally {
                }
            } catch (Exception e) {
                String name = INSTANCE.getClass().getName();
                String message = e.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    Unit unit2 = Unit.a;
                } finally {
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                Unit unit3 = Unit.a;
                throw th;
            } finally {
            }
        }
    }

    public static final boolean verify(PublicKey publicKey, String str, String str2) {
        publicKey.getClass();
        str.getClass();
        str2.getClass();
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM_SHA256);
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(yt.b);
            bytes.getClass();
            signature.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            decode.getClass();
            return signature.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public final String getOPENID_KEYS_PATH() {
        return OPENID_KEYS_PATH;
    }
}
