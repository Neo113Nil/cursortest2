package com.cmplay.kinfoc.report;

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
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f4413a = "0";

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

    public static synchronized String c(Context context) {
        String str;
        synchronized (c.class) {
            if (f4413a == null || "0".equals(f4413a)) {
                f4413a = g(context);
            }
            str = f4413a;
        }
        return str;
    }

    private static String g(Context context) {
        FileOutputStream fileOutputStream;
        String str = "0";
        if (context == null || context.getFilesDir() == null) {
            return "0";
        }
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separatorChar + "Chanel.dat");
        BufferedReader bufferedReader = null;
        if (!file.exists()) {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        byte[] d2 = d(context);
                        String str2 = new String(d2);
                        try {
                            try {
                                fileOutputStream.write(d2, 0, d2.length);
                                fileOutputStream.flush();
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                                return str2;
                            } catch (IOException unused2) {
                                return str2;
                            }
                        } catch (IOException unused3) {
                            fileOutputStream.close();
                            return str2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                    if (fileOutputStream == null) {
                        return "0";
                    }
                    try {
                        fileOutputStream.close();
                        return "0";
                    } catch (IOException unused6) {
                        return "0";
                    }
                }
            } catch (IOException unused7) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } else {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    try {
                        String readLine = bufferedReader2.readLine();
                        try {
                            bufferedReader2.close();
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused8) {
                            }
                            return readLine;
                        } catch (Exception unused9) {
                            bufferedReader = bufferedReader2;
                            str = readLine;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused10) {
                                }
                            }
                            return str;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused11) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused12) {
                    bufferedReader = bufferedReader2;
                }
            } catch (Exception unused13) {
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static byte[] d(Context context) {
        try {
            return String.valueOf(GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED).getBytes();
        } catch (Exception unused) {
            return "0".getBytes();
        }
    }

    public static a e(Context context) {
        a aVar = new a();
        aVar.f4400b = a(context);
        aVar.f4401c = b(context);
        aVar.f4402d = c(context);
        aVar.e = String.valueOf(0);
        aVar.f = String.valueOf(false);
        aVar.g = f(context);
        aVar.h = Build.BOARD;
        aVar.j = Build.BRAND;
        aVar.k = Build.CPU_ABI;
        aVar.m = Build.DEVICE;
        aVar.n = Build.DISPLAY;
        aVar.o = Build.FINGERPRINT;
        aVar.q = Build.HOST;
        aVar.r = Build.ID;
        aVar.s = Build.MANUFACTURER;
        aVar.t = Build.MODEL;
        aVar.u = Build.PRODUCT;
        aVar.w = Build.TAGS;
        aVar.x = Build.TYPE;
        aVar.y = Build.USER;
        aVar.z = Build.VERSION.CODENAME;
        aVar.A = Build.VERSION.INCREMENTAL;
        aVar.B = Build.VERSION.RELEASE;
        aVar.C = Build.VERSION.SDK;
        aVar.D = Build.VERSION.SDK_INT;
        a(aVar);
        return aVar;
    }

    @TargetApi(8)
    static void a(a aVar) {
        if (8 <= Build.VERSION.SDK_INT) {
            aVar.i = Build.BOOTLOADER;
        }
        if (8 <= Build.VERSION.SDK_INT) {
            aVar.l = Build.CPU_ABI2;
        }
        if (8 <= Build.VERSION.SDK_INT) {
            aVar.p = Build.HARDWARE;
        }
        if (8 <= Build.VERSION.SDK_INT) {
            aVar.v = Build.RADIO;
        }
    }

    public static String f(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
    }

    public static boolean a(String str) {
        Process exec;
        Process process = null;
        try {
            try {
                exec = Runtime.getRuntime().exec(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            exec.waitFor();
            try {
                exec.destroy();
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return true;
            }
        } catch (Exception e3) {
            process = exec;
            e = e3;
            e.printStackTrace();
            try {
                process.destroy();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return false;
        } catch (Throwable th2) {
            process = exec;
            th = th2;
            try {
                process.destroy();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            throw th;
        }
    }
}
