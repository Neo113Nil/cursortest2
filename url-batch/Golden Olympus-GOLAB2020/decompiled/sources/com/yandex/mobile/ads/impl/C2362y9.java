package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2362y9 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f34934a = (long) (Math.floor(Math.random() * 4294967295L) + 1);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34935b = 0;

    private static String a(String str, Map map) {
        if (map == null) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            Uri parse = Uri.parse("?" + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            for (String str2 : parse.getQueryParameterNames()) {
                buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @NotNull
    public static final ArrayList a(@NotNull C2360y7 adResponse, @Nullable Map map) {
        ux1 ux1Var;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        List<String> l4 = adResponse.l();
        List<Long> f4 = adResponse.f();
        List<Integer> q4 = adResponse.q();
        ArrayList arrayList = new ArrayList();
        if (l4 != null && f4 != null && q4 != null) {
            int size = l4.size();
            int i4 = 0;
            while (i4 < size) {
                String url = a(l4.get(i4), map);
                long longValue = f4.size() > i4 ? f4.get(i4).longValue() : 0L;
                int intValue = q4.size() > i4 ? q4.get(i4).intValue() : 0;
                Intrinsics.checkNotNullParameter(url, "url");
                if (StringsKt.P(url, "/rtbcount/", false, 2, null)) {
                    ux1Var = ux1.f33443c;
                } else if (StringsKt.P(url, "/count/", false, 2, null)) {
                    ux1Var = ux1.f33442b;
                } else {
                    ux1Var = ux1.f33444d;
                }
                arrayList.add(new tx1(intValue, longValue, ux1Var, url));
                i4++;
            }
        }
        return arrayList;
    }

    @Nullable
    public static Bitmap a(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String substring = data.substring(StringsKt.c0(data, StringUtils.COMMA, 0, false, 6, null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (substring.length() <= 0) {
                return null;
            }
            byte[] decode = Base64.decode(substring, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final <T> String a(T t4) {
        String obj = t4 != null ? t4.toString() : null;
        return obj == null ? "" : obj;
    }

    public static boolean a(@Nullable ao aoVar) {
        return aoVar == null || aoVar.a();
    }

    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return hj2.a(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long a() {
        return f34934a;
    }
}
