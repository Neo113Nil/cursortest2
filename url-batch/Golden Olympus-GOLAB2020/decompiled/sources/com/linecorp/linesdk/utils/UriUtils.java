package com.linecorp.linesdk.utils;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class UriUtils {
    private UriUtils() {
    }

    public static Uri.Builder appendQueryParams(@NonNull Uri.Builder builder, @NonNull Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builder;
    }

    public static Map<String, String> buildParams(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Odd number of key and Value");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i4 = 0; i4 < strArr.length; i4 += 2) {
            linkedHashMap.put(strArr[i4], strArr[i4 + 1]);
        }
        return linkedHashMap;
    }

    public static Uri buildUri(@NonNull String str, @NonNull String... strArr) {
        return uriBuilder(str, strArr).build();
    }

    public static Uri.Builder uriBuilder(@NonNull String str, @NonNull String... strArr) {
        return uriBuilder(Uri.parse(str), strArr);
    }

    public static Uri.Builder uriBuilder(@NonNull Uri uri, @NonNull String... strArr) {
        Uri.Builder buildUpon = uri.buildUpon();
        for (String str : strArr) {
            buildUpon.appendEncodedPath(str);
        }
        return buildUpon;
    }

    public static Uri appendQueryParams(@NonNull String str, @NonNull Map<String, String> map) {
        return appendQueryParams(Uri.parse(str), map);
    }

    public static Uri buildUri(@NonNull Uri uri, @NonNull String... strArr) {
        return uriBuilder(uri, strArr).build();
    }

    public static Uri appendQueryParams(@NonNull Uri uri, @NonNull Map<String, String> map) {
        return appendQueryParams(uriBuilder(uri, new String[0]), map).build();
    }
}
