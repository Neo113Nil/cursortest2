package com.baidu.bbalbscesium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f3891c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final String f3892d = "CuidV266Manager";

    /* renamed from: e, reason: collision with root package name */
    private static final String f3893e = "com.baidu.deviceid";

    /* renamed from: f, reason: collision with root package name */
    private static final String f3894f = "com.baidu.deviceid.v2";

    /* renamed from: g, reason: collision with root package name */
    private static final String f3895g = "backups/.SystemConfig";

    /* renamed from: h, reason: collision with root package name */
    private static final String f3896h = ".cuid2";

    /* renamed from: i, reason: collision with root package name */
    private static final String f3897i = "bd_setting_i";

    /* renamed from: j, reason: collision with root package name */
    private static final String f3898j = "";

    /* renamed from: k, reason: collision with root package name */
    private static final String f3899k = ".cuid";

    /* renamed from: l, reason: collision with root package name */
    private static final String f3900l = "baidu";

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f3901m = false;

    /* renamed from: a, reason: collision with root package name */
    private Context f3902a;

    /* renamed from: b, reason: collision with root package name */
    private d f3903b;

    public g(Context context, d dVar) {
        this.f3902a = context;
        this.f3903b = dVar;
    }

    private f a() {
        return f.a(e(f3893e), e(f3897i));
    }

    private f b() {
        File file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
        if (file.exists()) {
            return f.a(com.baidu.bbalbscesium.o.c.a(file));
        }
        return null;
    }

    private String c(String str) {
        return "0";
    }

    private f d(String str) {
        String str2;
        String[] split;
        String str3 = "";
        File file = new File(Environment.getExternalStorageDirectory(), "baidu/.cuid");
        if (!file.exists()) {
            file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\r\n");
            }
            bufferedReader.close();
            byte[] a8 = com.baidu.bbalbscesium.k.a.g.a();
            split = new String(com.baidu.bbalbscesium.k.a.c.a(a8, a8, com.baidu.bbalbscesium.m.b.a(sb.toString().getBytes()))).split("=");
        } catch (FileNotFoundException | IOException | Exception unused) {
        }
        if (split != null && split.length == 2) {
            str2 = split[0];
            try {
                str3 = split[1];
            } catch (FileNotFoundException | IOException | Exception unused2) {
            }
            return f.a(str3, str2);
        }
        str2 = "";
        return f.a(str3, str2);
    }

    private String e(String str) {
        try {
            return Settings.System.getString(this.f3902a.getContentResolver(), str);
        } catch (Exception e8) {
            com.baidu.bbalbscesium.o.c.a(e8);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    private boolean f(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.f3902a.openFileOutput(f.f3879g, 0);
                fileOutputStream.write(str.getBytes());
                fileOutputStream.flush();
                try {
                    fileOutputStream.close();
                    return true;
                } catch (Exception e8) {
                    com.baidu.bbalbscesium.o.c.a(e8);
                    return true;
                }
            } catch (Exception e9) {
                com.baidu.bbalbscesium.o.c.a(e9);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        com.baidu.bbalbscesium.o.c.a(e10);
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e11) {
                    com.baidu.bbalbscesium.o.c.a(e11);
                }
            }
            throw th;
        }
    }

    private f a(Context context) {
        List<c> b8 = this.f3903b.b(context);
        f fVar = null;
        if (b8 != null) {
            File filesDir = context.getFilesDir();
            String str = "files";
            if (!"files".equals(filesDir.getName())) {
                Log.e(f3892d, "fetal error:: app files dir name is unexpectedly :: " + filesDir.getAbsolutePath());
                str = filesDir.getName();
            }
            for (c cVar : b8) {
                if (!cVar.f3868d) {
                    File file = new File(new File(cVar.f3865a.dataDir, str), f.f3879g);
                    if (file.exists() && (fVar = f.a(com.baidu.bbalbscesium.o.c.a(file))) != null) {
                        break;
                    }
                }
            }
        }
        return fVar;
    }

    public f b(String str) {
        boolean z7;
        f a8 = a(this.f3902a);
        if (a8 == null) {
            a8 = f.a(e(f3894f));
        }
        boolean a9 = a("android.permission.READ_EXTERNAL_STORAGE");
        if (a8 == null && a9) {
            a8 = b();
        }
        if (a8 == null) {
            a8 = a();
        }
        if (a8 == null && a9) {
            a8 = d(c(""));
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            c("");
        }
        if (a8 != null) {
            a8.a();
        }
        return a8;
    }

    public void a(f fVar) {
        File file = new File(this.f3902a.getFilesDir(), f.f3879g);
        String e8 = fVar.e();
        if (file.exists()) {
            f a8 = f.a(com.baidu.bbalbscesium.o.c.a(file));
            if (a8 != null) {
                if (!a8.a()) {
                    return;
                } else {
                    e8 = a8.e();
                }
            } else if (a8 != null) {
                return;
            }
        }
        f(e8);
    }

    private boolean a(String str) {
        return this.f3902a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
