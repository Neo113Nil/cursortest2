package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class rm0 {
    static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i7 = indexOf + 1;
        return Uri.parse(str.substring(0, i7) + str2 + "=" + str3 + "&" + str.substring(i7));
    }

    public static String b(Uri uri, Context context) {
        String f7;
        if (y2.t.o().z(context) && (f7 = y2.t.o().f(context)) != null) {
            String str = (String) sw.c().b(m10.Z);
            String uri2 = uri.toString();
            if (((Boolean) sw.c().b(m10.Y)).booleanValue() && uri2.contains(str)) {
                y2.t.o().r(context, f7);
                return d(uri2, context).replace(str, f7);
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                return uri2;
            }
            String uri3 = a(d(uri2, context), "fbs_aeid", f7).toString();
            y2.t.o().r(context, f7);
            return uri3;
        }
        return uri.toString();
    }

    public static String c(String str, Context context, boolean z6) {
        String f7;
        if ((((Boolean) sw.c().b(m10.f8201g0)).booleanValue() && !z6) || !y2.t.o().z(context) || TextUtils.isEmpty(str) || (f7 = y2.t.o().f(context)) == null) {
            return str;
        }
        String str2 = (String) sw.c().b(m10.Z);
        if (((Boolean) sw.c().b(m10.Y)).booleanValue() && str.contains(str2)) {
            if (y2.t.q().W(str)) {
                y2.t.o().r(context, f7);
                return d(str, context).replace(str2, f7);
            }
            if (!y2.t.q().X(str)) {
                return str;
            }
            y2.t.o().s(context, f7);
            return d(str, context).replace(str2, f7);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (y2.t.q().W(str)) {
            y2.t.o().r(context, f7);
            return a(d(str, context), "fbs_aeid", f7).toString();
        }
        if (!y2.t.q().X(str)) {
            return str;
        }
        y2.t.o().s(context, f7);
        return a(d(str, context), "fbs_aeid", f7).toString();
    }

    private static String d(String str, Context context) {
        String j7 = y2.t.o().j(context);
        String h7 = y2.t.o().h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(j7)) {
            str = a(str, "gmp_app_id", j7).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(h7)) ? str : a(str, "fbs_aiid", h7).toString();
    }
}
