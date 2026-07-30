package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.ServerProtocol;
import defpackage.ey;
import defpackage.vv;
import defpackage.yt;
import defpackage.zv;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PKCEUtil {
    public static final PKCEUtil INSTANCE = new PKCEUtil();

    private PKCEUtil() {
    }

    public static final GraphRequest createCodeExchangeRequest(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, str2);
        bundle.putString("code_verifier", str3);
        GraphRequest newGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "oauth/access_token", null);
        newGraphPathRequest.setHttpMethod(HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        return newGraphPathRequest;
    }

    public static final String generateCodeChallenge(String str, CodeChallengeMethod codeChallengeMethod) {
        str.getClass();
        codeChallengeMethod.getClass();
        if (!isValidCodeVerifier(str)) {
            ey.i("Invalid Code Verifier.");
            return null;
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(yt.c);
            bytes.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            encodeToString.getClass();
            return encodeToString;
        } catch (Exception e) {
            throw new FacebookException(e);
        }
    }

    public static final String generateCodeVerifier() {
        ArrayList arrayList;
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(86) + 43;
        Iterable bVar = new kotlin.ranges.b('a', 'z');
        kotlin.ranges.b bVar2 = new kotlin.ranges.b('A', 'Z');
        if (bVar instanceof Collection) {
            arrayList = zv.E((Collection) bVar, bVar2);
        } else {
            ArrayList arrayList2 = new ArrayList();
            vv.o(bVar, arrayList2);
            vv.o(bVar2, arrayList2);
            arrayList = arrayList2;
        }
        ArrayList F = zv.F(zv.F(zv.F(zv.F(zv.E(arrayList, new kotlin.ranges.b('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList3 = new ArrayList(nextInt);
        for (int i = 0; i < nextInt; i++) {
            Character ch = (Character) F.get(secureRandom.nextInt(F.size()));
            ch.getClass();
            arrayList3.add(ch);
        }
        return zv.A(arrayList3, com.google.firebase.encoders.json.BuildConfig.FLAVOR, null, null, null, 62);
    }

    public static final boolean isValidCodeVerifier(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").a(str);
    }
}
