package com.baidu.ar;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static String f2179a;

    public static String a() {
        return f2179a;
    }

    public static String b(Context context, String str) {
        String a8 = a(context, str);
        if (a8 == null) {
            return null;
        }
        return a8 + File.separator + com.moyoung.dafit.module.common.utils.u.LANGUAGE_AR;
    }

    public static String c(Context context, String str) {
        String a8 = a(context, str);
        if (a8 == null) {
            return null;
        }
        return a8 + File.separator + "temp";
    }

    public static String a(Context context, String str) {
        String a8 = j4.a(context);
        if (a8 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a8);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("sticker");
        sb.append(str2);
        sb.append("bar_");
        sb.append(str);
        return sb.toString();
    }

    public static void b(String str) {
        if (f2179a == null) {
            f2179a = str;
        }
    }

    public static String a(String str) {
        return str + "/" + com.moyoung.dafit.module.common.utils.u.LANGUAGE_AR + "/dumix_res.json";
    }
}
