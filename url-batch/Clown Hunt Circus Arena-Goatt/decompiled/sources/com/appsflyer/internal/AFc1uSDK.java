package com.appsflyer.internal;

import android.util.Base64;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import org.json.JSONArray;

/* loaded from: classes.dex */
public interface AFc1uSDK {
    void valueOf(byte[] bArr, Map<String, String> map, int i);

    public static final class AFa1wSDK {
        public final String AFInAppEventParameterName;
        public final Boolean AFInAppEventType;
        public Boolean values;

        public AFa1wSDK() {
        }

        public AFa1wSDK(String str, Boolean bool) {
            this.AFInAppEventParameterName = str;
            this.AFInAppEventType = bool;
        }

        public static double AFKeystoreWrapper(String str) throws ParseException {
            Intrinsics.checkNotNullParameter(str, "");
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

        public static JSONArray valueOf(List<AFb1aSDK> list) {
            Intrinsics.checkNotNullParameter(list, "");
            List<AFb1aSDK> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AFb1aSDK) it.next()).valueOf());
            }
            return new JSONArray((Collection) arrayList);
        }

        public static boolean AFKeystoreWrapper(HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "");
            return httpURLConnection.getResponseCode() / 100 == 2;
        }

        public static String values(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "");
            String str2 = "";
            for (byte b : digest) {
                StringBuilder append = new StringBuilder().append(str2);
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "");
                str2 = append.append(format).toString();
            }
            return str2;
        }

        public static String AFInAppEventType(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String encodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            return encodeToString;
        }

        public static int valueOf(String str) {
            String value;
            Integer intOrNull;
            String value2;
            Integer intOrNull2;
            String value3;
            Integer intOrNull3;
            Intrinsics.checkNotNullParameter(str, "");
            MatchResult matchEntire = new Regex("(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?").matchEntire(str);
            if (matchEntire == null) {
                return -1;
            }
            MatchGroup matchGroup = matchEntire.getGroups().get(1);
            int i = 0;
            int intValue = ((matchGroup == null || (value3 = matchGroup.getValue()) == null || (intOrNull3 = StringsKt.toIntOrNull(value3)) == null) ? 0 : intOrNull3.intValue()) * DurationKt.NANOS_IN_MILLIS;
            MatchGroup matchGroup2 = matchEntire.getGroups().get(2);
            int intValue2 = intValue + (((matchGroup2 == null || (value2 = matchGroup2.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value2)) == null) ? 0 : intOrNull2.intValue()) * 1000);
            MatchGroup matchGroup3 = matchEntire.getGroups().get(3);
            if (matchGroup3 != null && (value = matchGroup3.getValue()) != null && (intOrNull = StringsKt.toIntOrNull(value)) != null) {
                i = intOrNull.intValue();
            }
            return intValue2 + i;
        }
    }
}
