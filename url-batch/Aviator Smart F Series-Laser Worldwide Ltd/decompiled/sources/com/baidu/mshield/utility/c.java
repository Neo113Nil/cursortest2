package com.baidu.mshield.utility;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import cn.hutool.core.util.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f8402a;

    public static String a(String str) {
        try {
            String str2 = new String(com.baidu.mshield.b.f.a.a(Base64.decode(str, 10), com.baidu.mshield.b.f.a.a(16)), l.UTF_8);
            return !TextUtils.isEmpty(str2) ? str2 : "";
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static synchronized String b(Context context) {
        synchronized (c.class) {
            try {
                if (!TextUtils.isEmpty(f8402a)) {
                    return f8402a;
                }
                String a8 = a(context, false);
                if (!TextUtils.isEmpty(a8)) {
                    f8402a = a8;
                    return a8;
                }
                com.baidu.mshield.sharedpreferences.a a9 = com.baidu.mshield.sharedpreferences.a.a(context);
                String q8 = a9.q();
                if (!TextUtils.isEmpty(q8)) {
                    try {
                        String a10 = a(q8);
                        if (!TextUtils.isEmpty(a10)) {
                            f8402a = a10;
                            return a10;
                        }
                    } catch (Throwable th) {
                        com.baidu.mshield.b.c.a.a(th);
                    }
                }
                String n8 = a9.n();
                if (!TextUtils.isEmpty(n8)) {
                    a9.i(new String(Base64.encode(com.baidu.mshield.b.f.a.b(n8.getBytes(l.UTF_8), com.baidu.mshield.b.f.a.a(16)), 10), l.UTF_8));
                    f8402a = n8;
                    return n8;
                }
                String c8 = c(context);
                String e8 = e(context);
                if (TextUtils.isEmpty(e8)) {
                    e8 = "0";
                }
                String str = c8 + b5.b.VERTICAL + new StringBuffer(e8).reverse().toString();
                String str2 = new String(Base64.encode(com.baidu.mshield.b.f.a.b(str.getBytes(l.UTF_8), com.baidu.mshield.b.f.a.a(16)), 10), l.UTF_8);
                String n9 = a9.n();
                if (!TextUtils.isEmpty(n9)) {
                    f8402a = n9;
                    return n9;
                }
                a9.h(str);
                a9.i(str2);
                f8402a = str;
                return str;
            } catch (Throwable th2) {
                com.baidu.mshield.b.c.a.a(th2);
                return "";
            }
        }
    }

    public static String c(Context context) {
        String str;
        String str2 = "";
        try {
            str = e(context);
            try {
                str2 = a(context);
            } catch (Throwable th) {
                th = th;
                com.baidu.mshield.b.c.a.a(th);
                return a((str + str2 + UUID.randomUUID().toString()).getBytes(), true);
            }
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
        return a((str + str2 + UUID.randomUUID().toString()).getBytes(), true);
    }

    public static String d(Context context) {
        try {
            try {
                if (TextUtils.isEmpty(com.baidu.sec.privacy.e.a.a(context).c("bd_setting_i", true))) {
                    e(context);
                }
                TextUtils.isEmpty(e(context));
                return "";
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.a(th);
                return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String e(Context context) {
        return "";
    }

    public static String f(Context context) {
        return "";
    }

    public static String g(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
                return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
            }
            return displayMetrics.heightPixels + "*" + displayMetrics.widthPixels;
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static String h(Context context) {
        try {
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
            String f8 = a8.f();
            if (!TextUtils.isEmpty(f8)) {
                return f8;
            }
            if (Build.VERSION.SDK_INT > 25) {
                return "";
            }
            String e8 = e(context);
            String a9 = a(context);
            if (TextUtils.isEmpty(e8) && TextUtils.isEmpty(a9)) {
                return "";
            }
            byte[] bytes = (e8 + ":" + a9).getBytes();
            for (int i8 = 0; i8 < bytes.length; i8++) {
                bytes[i8] = (byte) (bytes[i8] ^ 246);
            }
            String c8 = com.baidu.mshield.b.f.e.c(bytes);
            if (TextUtils.isEmpty(c8)) {
                return "";
            }
            a8.o(c8);
            return c8;
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return "";
        }
    }

    public static String i(Context context) {
        try {
            if (TextUtils.isEmpty(com.baidu.mshield.b.e.a.d(context, "bd_setting_i"))) {
                e(context);
            }
            TextUtils.isEmpty(e(context));
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:3:0x0002, B:12:0x0023, B:14:0x0033, B:18:0x005a, B:21:0x0066, B:25:0x0020), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:3:0x0002, B:12:0x0023, B:14:0x0033, B:18:0x005a, B:21:0x0066, B:25:0x0020), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String j(Context context) {
        String str;
        String c8;
        try {
            String a8 = a(context);
            try {
                str = com.baidu.sec.privacy.e.a.a(context).c("bd_setting_i", true);
                try {
                    if (TextUtils.isEmpty(str)) {
                        str = e(context);
                    }
                } catch (Throwable th) {
                    th = th;
                    com.baidu.mshield.b.c.a.a(th);
                    c8 = com.baidu.sec.privacy.e.a.a(context).c("com.baidu.deviceid", true);
                    if (TextUtils.isEmpty(c8)) {
                    }
                    if (c8 != null) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str = "";
            }
            c8 = com.baidu.sec.privacy.e.a.a(context).c("com.baidu.deviceid", true);
            if (TextUtils.isEmpty(c8)) {
                c8 = com.baidu.sec.privacy.e.a.a(context).c(a(("com.baidu" + str + a8).getBytes(), true), true);
            }
            if (c8 != null) {
                return "";
            }
            String e8 = e(context);
            if (TextUtils.isEmpty(e8)) {
                e8 = "0";
            }
            return c8 + b5.b.VERTICAL + new StringBuffer(e8).reverse().toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context) {
        return com.baidu.mshield.core.a.a("arid");
    }

    public static String a(byte[] bArr, boolean z7) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return a(messageDigest.digest(), "", z7);
        } catch (NoSuchAlgorithmException e8) {
            com.baidu.mshield.b.c.a.a(e8);
            return null;
        }
    }

    public static String a(byte[] bArr, String str, boolean z7) {
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (z7) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String a() {
        return Build.DISPLAY;
    }

    public static String a(Context context, boolean z7) {
        try {
            Bundle a8 = g.a(context, "getRemoteZid", null, z7, null, false);
            if (a8 == null) {
                return "";
            }
            String string = a8.getString("_zid");
            return !TextUtils.isEmpty(string) ? string : "";
        } catch (Throwable th) {
            a.a(th);
            return "";
        }
    }
}
