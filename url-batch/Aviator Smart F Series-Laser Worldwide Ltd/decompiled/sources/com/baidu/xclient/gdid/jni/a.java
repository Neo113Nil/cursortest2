package com.baidu.xclient.gdid.jni;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.baidu.xclient.gdid.k.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static Pair<Integer, Integer> a(int i8, int i9, int i10) {
        if (i9 <= i8 || i8 == 0) {
            i8 = 1;
        }
        return new Pair<>(Integer.valueOf(i8), Integer.valueOf(i10));
    }

    public static boolean a(int i8, int i9) {
        String binaryString = Integer.toBinaryString(i9);
        return i8 <= binaryString.length() && binaryString.charAt(i8 - 1) == '1';
    }

    public static boolean a(Context context, JSONObject jSONObject, String str, int i8, int i9, int i10) {
        if (com.baidu.sec.privacy.b.b.a(context).a() || a(i9, i10)) {
            return TextUtils.isEmpty(str) || jSONObject.optInt(str, i8) == 1;
        }
        return false;
    }

    public static String[] a(String str) {
        String[] split;
        String[] split2;
        String str2;
        String[] strArr = new String[2];
        try {
            split = str.split("\n");
        } catch (Throwable th) {
            d.a(th);
        }
        if (split == null) {
            return strArr;
        }
        for (String str3 : split) {
            if (!TextUtils.isEmpty(str3) && (split2 = str3.trim().split(":")) != null && split2.length == 2 && (str2 = split2[0]) != null && split2[1] != null) {
                String trim = str2.trim();
                if (!trim.equals("Hardware") && !trim.equals("model name")) {
                    if (!trim.equals("vendor_id") && !trim.equals("Processor")) {
                    }
                    strArr[1] = split2[1].trim();
                }
                strArr[0] = split2[1].trim();
            }
        }
        return strArr;
    }
}
