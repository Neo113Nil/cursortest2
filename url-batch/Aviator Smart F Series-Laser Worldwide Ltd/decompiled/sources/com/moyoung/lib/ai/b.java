package com.moyoung.lib.ai;

import android.util.Log;
import com.baidu.ar.util.SystemInfoUtil;

/* loaded from: classes4.dex */
public class b {
    private static final String TAG = "ErrorResponseUtil";

    public static String extractFieldFromResponse(String str, String str2) {
        int indexOf;
        try {
            int indexOf2 = str.indexOf("\"" + str2 + "\"");
            if ((indexOf2 == -1 && (indexOf2 = str.indexOf(str2)) == -1) || (indexOf = str.indexOf(":", indexOf2)) == -1) {
                return null;
            }
            while (true) {
                indexOf++;
                if (indexOf >= str.length() || (str.charAt(indexOf) != ' ' && str.charAt(indexOf) != '\t')) {
                    break;
                }
            }
            if (indexOf >= str.length()) {
                return null;
            }
            char charAt = str.charAt(indexOf);
            if (charAt != '\"' && charAt != '\'') {
                int indexOf3 = str.indexOf(SystemInfoUtil.COMMA, indexOf);
                if (indexOf3 == -1) {
                    indexOf3 = str.indexOf("}", indexOf);
                }
                if (indexOf3 == -1) {
                    return null;
                }
                return str.substring(indexOf, indexOf3).trim();
            }
            int findMatchingQuote = findMatchingQuote(str, indexOf);
            if (findMatchingQuote == -1) {
                return null;
            }
            return str.substring(indexOf + 1, findMatchingQuote).replace("\\\"", "\"").replace("\\'", "'").replace("\\\\", "\\").replaceAll("^\\\\*\"*", "").replaceAll("\"*\\\\*$", "");
        } catch (Exception e8) {
            Log.e(TAG, "提取" + str2 + "字段失败", e8);
            return null;
        }
    }

    private static int findMatchingQuote(String str, int i8) {
        char charAt = str.charAt(i8);
        boolean z7 = false;
        for (int i9 = i8 + 1; i9 < str.length(); i9++) {
            char charAt2 = str.charAt(i9);
            if (z7) {
                z7 = false;
            } else if (charAt2 == '\\') {
                z7 = true;
            } else if (charAt2 == charAt) {
                return i9;
            }
        }
        return -1;
    }
}
