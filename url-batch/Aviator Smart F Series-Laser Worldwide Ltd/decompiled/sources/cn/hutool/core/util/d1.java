package cn.hutool.core.util;

import java.util.Properties;

/* loaded from: classes.dex */
public class d1 {
    public static String HUTOOL_DATE_LENIENT = "hutool.date.lenient";

    public static String get(String str, String str2) {
        return cn.hutool.core.text.l.nullToDefault(get(str, false), str2);
    }

    public static boolean getBoolean(String str, boolean z7) {
        String str2 = get(str);
        return str2 == null ? z7 : i.toBoolean(str2);
    }

    public static int getInt(String str, int i8) {
        return cn.hutool.core.convert.d.toInt(get(str), Integer.valueOf(i8)).intValue();
    }

    public static long getLong(String str, long j8) {
        return cn.hutool.core.convert.d.toLong(get(str), Long.valueOf(j8)).longValue();
    }

    public static Properties getProps() {
        return System.getProperties();
    }

    public static void set(String str, String str2) {
        if (str2 == null) {
            System.clearProperty(str);
        } else {
            System.setProperty(str, str2);
        }
    }

    public static String get(String str, boolean z7) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            if (!z7) {
                cn.hutool.core.lang.w.error("Caught a SecurityException reading the system property '{}'; the SystemUtil property value will default to null.", str);
            }
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        try {
            return System.getenv(str);
        } catch (SecurityException unused2) {
            if (z7) {
                return str2;
            }
            cn.hutool.core.lang.w.error("Caught a SecurityException reading the system env '{}'; the SystemUtil env value will default to null.", str);
            return str2;
        }
    }

    public static String get(String str) {
        return get(str, (String) null);
    }
}
