package com.baidu.sec.privacy.f;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes2.dex */
public class f {
    public static boolean a(Context context, int i8) {
        if (com.baidu.sec.privacy.d.a.b(i8)) {
            return b(context, i8);
        }
        return false;
    }

    public static boolean b(Context context, int i8) {
        if (com.baidu.sec.privacy.d.a.a(i8)) {
            return true;
        }
        return c.d(context);
    }

    public static int a(Context context, int i8, String str, int i9, boolean z7, com.baidu.sec.privacy.e.d.a<Integer> aVar, Object... objArr) {
        int a8;
        try {
            if (!com.baidu.sec.privacy.d.a.b(i8)) {
                return i9;
            }
            String str2 = i8 + "";
            if (!TextUtils.isEmpty(str)) {
                str2 = str2 + Base64.encodeToString(str.getBytes(), 0);
            }
            if (!a(str2)) {
                if (com.baidu.sec.privacy.d.a.a(str2) && (a8 = com.baidu.sec.privacy.d.a.a(str2, i9)) != i9) {
                    return a8;
                }
                if (b(context, i8)) {
                    int intValue = aVar.a(str, objArr).intValue();
                    if (intValue != i9) {
                        com.baidu.sec.privacy.d.a.b(str2, intValue);
                    }
                    return intValue;
                }
                return a(context, i9, z7);
            }
            if (b(context, i8)) {
                int intValue2 = aVar.a(str, objArr).intValue();
                if (intValue2 == i9) {
                    return com.baidu.sec.privacy.d.a.a(str2) ? com.baidu.sec.privacy.d.a.a(str2, i9) : i9;
                }
                com.baidu.sec.privacy.d.a.b(str2, intValue2);
                return intValue2;
            }
            if (com.baidu.sec.privacy.d.a.a(str2)) {
                int a9 = com.baidu.sec.privacy.d.a.a(str2, i9);
                return a9 == i9 ? a(context, i9, z7) : a9;
            }
            return a(context, i9, z7);
        } catch (Throwable th) {
            c.a(th);
            return i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[Catch: all -> 0x000f, TryCatch #0 {all -> 0x000f, blocks: (B:52:0x0007, B:5:0x0015, B:9:0x001c, B:11:0x0031, B:12:0x0048, B:14:0x004e, B:16:0x0054, B:20:0x0061, B:23:0x0068, B:25:0x006d, B:27:0x0079, B:30:0x007f, B:33:0x0086, B:35:0x008c, B:37:0x0096, B:40:0x009c, B:42:0x00a1, B:44:0x00ad, B:46:0x00b3, B:49:0x00b9), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x000f, TryCatch #0 {all -> 0x000f, blocks: (B:52:0x0007, B:5:0x0015, B:9:0x001c, B:11:0x0031, B:12:0x0048, B:14:0x004e, B:16:0x0054, B:20:0x0061, B:23:0x0068, B:25:0x006d, B:27:0x0079, B:30:0x007f, B:33:0x0086, B:35:0x008c, B:37:0x0096, B:40:0x009c, B:42:0x00a1, B:44:0x00ad, B:46:0x00b3, B:49:0x00b9), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Context context, int i8, String str, boolean z7, com.baidu.sec.privacy.e.d.a<String> aVar, Object... objArr) {
        boolean z8;
        String str2;
        if (i8 == 64) {
            try {
                if (com.baidu.sec.privacy.d.a.b()) {
                    z8 = false;
                    if (!z8 && !com.baidu.sec.privacy.d.a.b(i8)) {
                        return "";
                    }
                    str2 = i8 + "";
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str2 + Base64.encodeToString(str.getBytes(), 0);
                    }
                    if (a(str2)) {
                        if (com.baidu.sec.privacy.d.a.a(str2)) {
                            String a8 = com.baidu.sec.privacy.d.a.a(str2, "");
                            if (!TextUtils.isEmpty(a8)) {
                                return a8;
                            }
                        }
                        if (z8 && !b(context, i8)) {
                            return a(context, z7);
                        }
                        String a9 = aVar.a(str, objArr);
                        if (!TextUtils.isEmpty(a9)) {
                            com.baidu.sec.privacy.d.a.b(str2, a9);
                        }
                        return a9;
                    }
                    if (z8 && !b(context, i8)) {
                        if (com.baidu.sec.privacy.d.a.a(str2)) {
                            String a10 = com.baidu.sec.privacy.d.a.a(str2, "");
                            return TextUtils.isEmpty(a10) ? a(context, z7) : a10;
                        }
                        return a(context, z7);
                    }
                    String a11 = aVar.a(str, objArr);
                    if (TextUtils.isEmpty(a11)) {
                        return com.baidu.sec.privacy.d.a.a(str2) ? com.baidu.sec.privacy.d.a.a(str2, "") : "";
                    }
                    com.baidu.sec.privacy.d.a.b(str2, a11);
                    return a11;
                }
            } catch (Throwable th) {
                c.a(th);
                return "";
            }
        }
        z8 = true;
        if (!z8) {
        }
        str2 = i8 + "";
        if (!TextUtils.isEmpty(str)) {
        }
        if (a(str2)) {
        }
    }

    public static String a(Context context, int i8, boolean z7, com.baidu.sec.privacy.e.d.a<String> aVar, Object... objArr) {
        return a(context, i8, null, z7, aVar, objArr);
    }

    public static boolean a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("la_in");
        return System.currentTimeMillis() - com.baidu.sec.privacy.d.a.a(sb.toString(), 0L) >= 86400000;
    }

    public static String a(Context context, boolean z7) {
        return !z7 ? "" : !c.c(context) ? "-1000" : "-1001";
    }

    public static int a(Context context, int i8, boolean z7) {
        return !z7 ? i8 : !c.c(context) ? -1000 : -1001;
    }
}
