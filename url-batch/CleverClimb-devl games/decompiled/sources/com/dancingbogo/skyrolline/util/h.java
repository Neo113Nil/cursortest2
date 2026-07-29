package com.dancingbogo.skyrolline.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: KInfocCommon.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static String f4617a = "0";

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo != null ? Integer.toString(packageInfo.versionCode) : "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String c(Context context) {
        return g(context);
    }

    public static synchronized String d(Context context) {
        String str;
        synchronized (h.class) {
            if (f4617a == null || "0".equals(f4617a)) {
                f4617a = h(context);
            }
            str = f4617a;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    private static String h(Context context) {
        FileOutputStream fileOutputStream;
        String str;
        String str2;
        String str3 = "0";
        if (context == null || context.getFilesDir() == null) {
            return "0";
        }
        String file = new File(context.getFilesDir().getAbsolutePath() + File.separatorChar + "Chanel.dat");
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        BufferedReader bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException unused) {
        }
        if (!file.exists()) {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        byte[] e = e(context);
                        str2 = new String(e);
                        try {
                            int length = e.length;
                            fileOutputStream.write(e, 0, length);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            file = str2;
                            fileOutputStream2 = length;
                        } catch (IOException e2) {
                            try {
                                b.a("KInfocCommon", e2);
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                                return str2;
                            } catch (IOException e3) {
                                e = e3;
                                fileOutputStream3 = fileOutputStream;
                                str = str2;
                                b.a("KInfocCommon", e);
                                file = str;
                                fileOutputStream2 = fileOutputStream3;
                                if (fileOutputStream3 != null) {
                                    fileOutputStream3.close();
                                    file = str;
                                    fileOutputStream2 = fileOutputStream3;
                                }
                                return file;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    str2 = "0";
                }
            } catch (IOException e5) {
                e = e5;
                str = "0";
            }
            return file;
        }
        try {
            BufferedReader bufferedReader3 = new BufferedReader(new FileReader(file));
            try {
                try {
                    String readLine = bufferedReader3.readLine();
                    try {
                        bufferedReader3.close();
                        try {
                            bufferedReader3.close();
                        } catch (IOException e6) {
                            b.a("KInfocCommon", e6);
                        }
                        return readLine;
                    } catch (Exception e7) {
                        bufferedReader = bufferedReader3;
                        e = e7;
                        str3 = readLine;
                        b.a("KInfocCommon", e);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e8) {
                                b.a("KInfocCommon", e8);
                            }
                        }
                        return str3;
                    }
                } catch (Exception e9) {
                    bufferedReader = bufferedReader3;
                    e = e9;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader2 = bufferedReader3;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e10) {
                        b.a("KInfocCommon", e10);
                    }
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static byte[] e(Context context) {
        try {
            return String.valueOf(GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED).getBytes();
        } catch (Exception e) {
            b.a("KInfocCommon", e);
            return "0".getBytes();
        }
    }

    public static f f(Context context) {
        f fVar = new f();
        fVar.f4612b = a(context);
        fVar.f4613c = b(context);
        fVar.f4614d = d(context);
        fVar.e = String.valueOf(0);
        fVar.f = String.valueOf(false);
        fVar.g = "0000";
        fVar.h = Build.BOARD;
        fVar.j = Build.BRAND;
        fVar.k = Build.CPU_ABI;
        fVar.m = Build.DEVICE;
        fVar.n = Build.DISPLAY;
        fVar.o = Build.FINGERPRINT;
        fVar.q = Build.HOST;
        fVar.r = Build.ID;
        fVar.s = Build.MANUFACTURER;
        fVar.t = Build.MODEL;
        fVar.u = Build.PRODUCT;
        fVar.w = Build.TAGS;
        fVar.x = Build.TYPE;
        fVar.y = Build.USER;
        fVar.z = Build.VERSION.CODENAME;
        fVar.A = Build.VERSION.INCREMENTAL;
        fVar.B = Build.VERSION.RELEASE;
        fVar.C = Build.VERSION.SDK;
        fVar.D = Build.VERSION.SDK_INT;
        a(fVar);
        return fVar;
    }

    @TargetApi(8)
    static void a(f fVar) {
        if (8 <= Build.VERSION.SDK_INT) {
            fVar.i = Build.BOOTLOADER;
        }
        if (8 <= Build.VERSION.SDK_INT) {
            fVar.l = Build.CPU_ABI2;
        }
        if (8 <= Build.VERSION.SDK_INT) {
            fVar.p = Build.HARDWARE;
        }
        if (8 <= Build.VERSION.SDK_INT) {
            fVar.v = Build.RADIO;
        }
    }

    public static String g(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
    }
}
