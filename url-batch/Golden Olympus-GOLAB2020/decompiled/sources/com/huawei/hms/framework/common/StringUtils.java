package com.huawei.hms.framework.common;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import com.ironsource.cc;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class StringUtils {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f14154a = false;

    private static boolean a(String str) {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass(str);
            synchronized (StringUtils.class) {
                f14154a = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String anonymizeMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i4 = 0; i4 < charArray.length; i4++) {
            if (i4 % 2 != 0) {
                charArray[i4] = '*';
            }
        }
        return new String(charArray);
    }

    public static String byte2Str(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            Logger.w("StringUtils.byte2str error: UnsupportedEncodingException", anonymizeMessage(e4.getMessage()));
            return "";
        }
    }

    public static String collection2String(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(";");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    public static byte[] getBytes(long j4) {
        return getBytes(String.valueOf(j4));
    }

    public static String getTraceInfo(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder(1024);
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("at ");
            sb.append(stackTraceElement.toString());
            sb.append(";");
        }
        return sb.toString();
    }

    public static String replace(String str, CharSequence charSequence, CharSequence charSequence2) {
        if (f14154a || a("com.huawei.secure.android.common.util.SafeString")) {
            try {
                return SafeString.replace(str, charSequence, charSequence2);
            } catch (Throwable unused) {
                Logger.w("StringUtils", "SafeString.substring error");
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return str;
        }
        try {
            return str.replace(charSequence, charSequence2);
        } catch (Exception unused2) {
            return str;
        }
    }

    public static byte[] str2Byte(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e4) {
            Logger.w("StringUtils.str2Byte error: UnsupportedEncodingException", anonymizeMessage(e4.getMessage()));
            return new byte[0];
        }
    }

    public static boolean strEquals(String str, String str2) {
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    public static boolean stringToBoolean(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            return z4;
        }
        try {
            return Boolean.valueOf(str).booleanValue();
        } catch (NumberFormatException e4) {
            Logger.w("StringUtils", "String to Integer catch NumberFormatException." + anonymizeMessage(e4.getMessage()));
            return z4;
        }
    }

    public static int stringToInteger(String str, int i4) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e4) {
                Logger.w("StringUtils", "String to Integer catch NumberFormatException." + anonymizeMessage(e4.getMessage()));
            }
        }
        return i4;
    }

    public static long stringToLong(String str, long j4) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Logger.w("StringUtils", "String to Long catch NumberFormatException." + anonymizeMessage(e4.getMessage()));
            }
        }
        return j4;
    }

    public static String substring(String str, int i4) {
        if (a("com.huawei.secure.android.common.util.SafeString")) {
            try {
                return SafeString.substring(str, i4);
            } catch (Throwable unused) {
                Logger.w("StringUtils", "SafeString.substring error");
            }
        }
        if (!TextUtils.isEmpty(str) && str.length() >= i4 && i4 >= 0) {
            try {
                return str.substring(i4);
            } catch (Exception unused2) {
            }
        }
        return "";
    }

    public static String toLowerCase(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ROOT);
    }

    public static byte[] getBytes(String str) {
        byte[] bArr = new byte[0];
        if (str != null) {
            try {
                return str.getBytes(cc.f15721N);
            } catch (UnsupportedEncodingException unused) {
                Logger.w("StringUtils", "the content has error while it is converted to bytes");
            }
        }
        return bArr;
    }

    public static String substring(String str, int i4, int i5) {
        if (f14154a || a("com.huawei.secure.android.common.util.SafeString")) {
            try {
                return SafeString.substring(str, i4, i5);
            } catch (Throwable unused) {
                Logger.w("StringUtils", "SafeString.substring error");
            }
        }
        if (!TextUtils.isEmpty(str) && i4 >= 0 && i5 <= str.length() && i5 >= i4) {
            try {
                return str.substring(i4, i5);
            } catch (Exception unused2) {
            }
        }
        return "";
    }
}
