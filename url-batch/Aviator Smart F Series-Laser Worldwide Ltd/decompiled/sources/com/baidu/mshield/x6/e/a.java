package com.baidu.mshield.x6.e;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static boolean a(Context context, String str) {
        return b(context, str, true);
    }

    public static boolean b(Context context, String str, boolean z7) {
        try {
            return a(context, str, z7);
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
            return z7;
        }
    }

    public static boolean a(Context context, String str, boolean z7) {
        try {
            String a8 = new com.baidu.mshield.x6.b.b(context).a(str);
            return TextUtils.isEmpty(a8) ? z7 : new JSONObject(a8).getInt("1") != 0;
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
            return z7;
        }
    }

    public static JSONObject b(Context context, String str) {
        try {
            return new JSONObject(new com.baidu.mshield.x6.b.b(context).a(str)).optJSONObject("2");
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
            return new JSONObject();
        }
    }

    public static int a(Context context) {
        try {
            int o8 = new com.baidu.mshield.x6.b.b(context).o();
            if (o8 <= 0) {
                o8 = 60;
            }
            return o8 / 60;
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
            return 1;
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z7) {
        try {
            JSONObject b8 = b(context, str);
            if (b8.has(str2)) {
                return b8.optInt(str2, z7 ? 1 : 0) == 1;
            }
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
        return z7;
    }
}
