package com.baidu.mshield.x0.d;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.UUID;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static String f8441a = "";

    public static String b(Context context) {
        if (TextUtils.isEmpty(f8441a)) {
            f8441a = new g().f(context);
        }
        return f8441a;
    }

    public String a(Context context) {
        String a8 = e.a(context);
        if (TextUtils.isEmpty("") && TextUtils.isEmpty(a8)) {
            return "1|" + com.baidu.mshield.b.f.e.a(UUID.randomUUID().toString());
        }
        return "0|" + com.baidu.mshield.b.f.e.a("" + a8);
    }

    public String c(Context context) {
        try {
            com.baidu.mshield.x0.l.c cVar = new com.baidu.mshield.x0.l.c(context);
            String c8 = cVar.c();
            if (!TextUtils.isEmpty(c8)) {
                return c8;
            }
            String b8 = cVar.b();
            if (TextUtils.isEmpty(b8)) {
                return "";
            }
            cVar.b(b8);
            return b8;
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public String d(Context context) {
        try {
        } catch (Throwable th) {
            d.a(th);
        }
        if (!a(context, "android.permission.READ_EXTERNAL_STORAGE")) {
            return "";
        }
        if (!com.baidu.sec.privacy.f.c.d(context)) {
            com.baidu.mshield.b.c.a.a("getNewUidBySdCard isCanRequestNetBackground=false");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb.append(str);
        sb.append(".zp");
        sb.append(str);
        sb.append(".icosc");
        File a8 = com.baidu.mshield.b.e.a.a(context, sb.toString());
        if (a8.exists()) {
            return a(a8);
        }
        return "";
    }

    public String e(Context context) {
        try {
            return b(context, "com.q.zi.i");
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public final String f(Context context) {
        boolean z7;
        boolean z8;
        String c8 = c(context);
        boolean z9 = false;
        if (TextUtils.isEmpty(c8)) {
            c8 = e(context);
            z8 = true;
            if (TextUtils.isEmpty(c8)) {
                c8 = d(context);
                if (TextUtils.isEmpty(c8)) {
                    c8 = a(context);
                    z7 = true;
                } else {
                    z7 = false;
                }
                z9 = true;
                if (!z9 || TextUtils.isEmpty(c(context))) {
                    new com.baidu.mshield.x0.l.c(context).a(c8);
                }
                if (!z8 || TextUtils.isEmpty(e(context))) {
                    a(context, "com.q.zi.i", c8);
                }
                if (a(context, "android.permission.WRITE_EXTERNAL_STORAGE") && (z7 || TextUtils.isEmpty(d(context)))) {
                    c(context, c8);
                }
                return c8;
            }
            z7 = false;
            z9 = true;
        } else {
            z7 = false;
        }
        z8 = false;
        if (!z9) {
        }
        new com.baidu.mshield.x0.l.c(context).a(c8);
        if (!z8) {
        }
        a(context, "com.q.zi.i", c8);
        if (a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            c(context, c8);
        }
        return c8;
    }

    public final String b(Context context, String str) {
        try {
            return com.baidu.mshield.b.e.a.d(context, str);
        } catch (Throwable th) {
            d.a(th);
            return null;
        }
    }

    public final String a(File file) {
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
        } catch (Throwable th) {
            th = th;
            fileReader = null;
        }
        try {
            char[] cArr = new char[8192];
            CharArrayWriter charArrayWriter = new CharArrayWriter();
            while (true) {
                int read = fileReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                charArrayWriter.write(cArr, 0, read);
            }
            String charArrayWriter2 = charArrayWriter.toString();
            try {
                fileReader.close();
            } catch (Throwable th2) {
                d.a(th2);
            }
            return charArrayWriter2;
        } catch (Throwable th3) {
            th = th3;
            try {
                d.a(th);
                return null;
            } finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Throwable th4) {
                        d.a(th4);
                    }
                }
            }
        }
    }

    public final void c(Context context, String str) {
        Throwable th;
        FileWriter fileWriter;
        try {
            try {
            } catch (Throwable th2) {
                d.a(th2);
                return;
            }
        } catch (Throwable th3) {
            th = th3;
            fileWriter = null;
        }
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        if (!com.baidu.mshield.b.e.a.d(context)) {
            com.baidu.mshield.b.c.a.a("tryPutExternalStorageValue isCanRequestNetBackground=false");
            return;
        }
        File a8 = com.baidu.mshield.b.e.a.a(context, Environment.getExternalStorageDirectory() + File.separator + ".zp");
        File file = new File(a8, ".icosc");
        if (a8.exists()) {
            if (!a8.isDirectory()) {
                a8.delete();
                a8.mkdirs();
            }
        } else {
            a8.mkdirs();
        }
        fileWriter = new FileWriter(file, false);
        try {
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (Throwable th4) {
            th = th4;
            try {
                d.a(th);
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (Throwable th5) {
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (Throwable th6) {
                        d.a(th6);
                    }
                }
                throw th5;
            }
        }
    }

    public final boolean a(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (Throwable th) {
            d.a(th);
            return false;
        }
    }

    public final boolean a(Context context, String str, String str2) {
        try {
            com.baidu.mshield.b.e.a.a(context, str, str2);
            return true;
        } catch (Throwable th) {
            d.a(th);
            return false;
        }
    }
}
