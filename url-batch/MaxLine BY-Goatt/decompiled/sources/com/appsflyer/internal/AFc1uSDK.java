package com.appsflyer.internal;

import android.util.Base64;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.o0;
import defpackage.oi1;
import defpackage.rv;
import defpackage.yt;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import org.json.JSONArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface AFc1uSDK {
    void valueOf(byte[] bArr, Map<String, String> map, int i);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1wSDK {
        public final String AFInAppEventParameterName;
        public final Boolean AFInAppEventType;
        public Boolean values;

        public AFa1wSDK(String str, Boolean bool) {
            this.AFInAppEventParameterName = str;
            this.AFInAppEventType = bool;
        }

        public static String AFInAppEventType(String str) {
            str.getClass();
            byte[] bytes = str.getBytes(yt.b);
            bytes.getClass();
            String encodeToString = Base64.encodeToString(bytes, 2);
            encodeToString.getClass();
            return encodeToString;
        }

        public static double AFKeystoreWrapper(String str) {
            str.getClass();
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                Number parse = NumberFormat.getInstance(Locale.getDefault()).parse(str);
                if (parse != null) {
                    return parse.doubleValue();
                }
                throw new ParseException("Failed parse String into number", 0);
            }
        }

        public static int valueOf(String str) {
            String str2;
            Integer f;
            String str3;
            Integer f2;
            String str4;
            Integer f3;
            str.getClass();
            Matcher matcher = new Regex("(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?").m.matcher(str);
            matcher.getClass();
            oi1 oi1Var = !matcher.matches() ? null : new oi1(matcher, str);
            if (oi1Var == null) {
                return -1;
            }
            o0 o0Var = oi1Var.c;
            MatchGroup b = o0Var.b(1);
            int i = 0;
            int intValue = ((b == null || (str4 = b.a) == null || (f3 = kotlin.text.b.f(str4)) == null) ? 0 : f3.intValue()) * 1000000;
            MatchGroup b2 = o0Var.b(2);
            int intValue2 = (((b2 == null || (str3 = b2.a) == null || (f2 = kotlin.text.b.f(str3)) == null) ? 0 : f2.intValue()) * 1000) + intValue;
            MatchGroup b3 = o0Var.b(3);
            if (b3 != null && (str2 = b3.a) != null && (f = kotlin.text.b.f(str2)) != null) {
                i = f.intValue();
            }
            return intValue2 + i;
        }

        public static String values(String str) {
            str.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(yt.b);
            bytes.getClass();
            byte[] digest = messageDigest.digest(bytes);
            digest.getClass();
            String str2 = BuildConfig.FLAVOR;
            for (byte b : digest) {
                str2 = str2.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            return str2;
        }

        public AFa1wSDK() {
        }

        public static boolean AFKeystoreWrapper(HttpURLConnection httpURLConnection) {
            httpURLConnection.getClass();
            return httpURLConnection.getResponseCode() / 100 == 2;
        }

        public static JSONArray valueOf(List<AFb1aSDK> list) {
            list.getClass();
            ArrayList arrayList = new ArrayList(rv.l(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AFb1aSDK) it.next()).valueOf());
            }
            return new JSONArray((Collection) arrayList);
        }
    }
}
