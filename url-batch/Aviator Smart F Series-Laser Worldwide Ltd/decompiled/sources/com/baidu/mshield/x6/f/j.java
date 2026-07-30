package com.baidu.mshield.x6.f;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class j {
    public static String a(String str, String str2, String str3, String str4) {
        try {
            return a(str, str2, str3, str4, false);
        } catch (Throwable th) {
            f.b(th);
            return "";
        }
    }

    public static String b(String str, String str2, String str3, String str4) {
        try {
            return a(str, str2, str3, str4, true);
        } catch (Throwable th) {
            f.b(th);
            return "";
        }
    }

    public static String a(String str, String str2, String str3, String str4, boolean z7) {
        try {
            com.baidu.mshield.b.c.a.a("doExecMethod cn :" + str + ",mn : " + str2 + ", paramTypes : " + str3 + ", paramValues : " + str4 + ", isStaticMethod " + z7);
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                String[] split = str3.split("#");
                String[] split2 = str4.split("#", -1);
                if (split.length > 0 && split.length == split2.length) {
                    Class[] clsArr = new Class[split.length];
                    Object[] objArr = new Object[split.length];
                    for (int i8 = 0; i8 < split.length; i8++) {
                        Object[] a8 = a(split[i8], split2[i8]);
                        clsArr[i8] = (Class) a8[0];
                        objArr[i8] = a8[1];
                    }
                    return a(str, str2, clsArr, objArr, z7);
                }
                com.baidu.mshield.b.c.a.a("doExecMethod types values length error");
                return "#doExecMethod types values length error";
            }
            return a(str, str2, new Class[0], new Object[0], false);
        } catch (Throwable th) {
            try {
                f.b(th);
                return "#" + th.toString();
            } catch (Throwable th2) {
                f.b(th2);
                return "";
            }
        }
    }

    public static String a(String str, String str2, Class[] clsArr, Object[] objArr, boolean z7) {
        Method method;
        Object invoke;
        try {
            com.baidu.mshield.b.c.a.a("doExecMethod cn :" + str + ",mn : " + str2 + ", at : " + clsArr + ", ao : " + objArr + ", isStaticMethod " + z7);
            Class<?> cls = Class.forName(str);
            try {
                method = cls.getDeclaredMethod(str2, clsArr);
            } catch (NoSuchMethodException unused) {
                method = cls.getSuperclass().getMethod(str2, clsArr);
            }
            if (method == null) {
                return "";
            }
            com.baidu.mshield.b.c.a.a("doExecMethod method exist ");
            if (z7) {
                invoke = method.invoke(null, objArr);
            } else {
                invoke = method.invoke(cls.newInstance(), objArr);
            }
            return invoke != null ? invoke.toString() : "";
        } catch (Throwable th) {
            try {
                f.b(th);
                return "#" + th.toString();
            } catch (Throwable th2) {
                f.b(th2);
                return "";
            }
        }
    }

    public static Object[] a(String str, String str2) {
        Object[] objArr = new Object[2];
        try {
            if ("byte".equals(str)) {
                objArr[0] = Byte.TYPE;
                objArr[1] = Byte.valueOf(Byte.parseByte(str2));
            } else if ("short".equals(str)) {
                objArr[0] = Short.TYPE;
                objArr[1] = Short.valueOf(Short.parseShort(str2));
            } else if ("int".equalsIgnoreCase(str)) {
                objArr[0] = Integer.TYPE;
                objArr[1] = Integer.valueOf(Integer.parseInt(str2));
            } else if ("long".equalsIgnoreCase(str)) {
                objArr[0] = Long.TYPE;
                objArr[1] = Long.valueOf(Long.parseLong(str2));
            } else if (TypedValues.Custom.S_FLOAT.equalsIgnoreCase(str)) {
                objArr[0] = Float.TYPE;
                objArr[1] = Float.valueOf(Float.parseFloat(str2));
            } else if ("double".equalsIgnoreCase(str)) {
                objArr[0] = Double.TYPE;
                objArr[1] = Double.valueOf(Double.parseDouble(str2));
            } else if ("char".equalsIgnoreCase(str)) {
                objArr[0] = Character.TYPE;
                objArr[1] = Character.valueOf(str2.charAt(0));
            } else if (TypedValues.Custom.S_BOOLEAN.equalsIgnoreCase(str)) {
                objArr[0] = Boolean.TYPE;
                objArr[1] = Boolean.valueOf(Boolean.parseBoolean(str2));
            } else if ("java.lang.String".equalsIgnoreCase(str)) {
                objArr[0] = String.class;
                objArr[1] = str2;
            } else {
                Class.forName(str).newInstance();
            }
        } catch (Throwable th) {
            f.b(th);
        }
        return objArr;
    }
}
