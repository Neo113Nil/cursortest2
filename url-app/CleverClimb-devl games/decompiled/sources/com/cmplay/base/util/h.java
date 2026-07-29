package com.cmplay.base.util;

import android.os.Environment;
import android.util.Log;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: CMLog.java */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static SimpleDateFormat f4015a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4016b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4017c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4018d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static boolean k = false;
    private static boolean l = false;

    public static void a(boolean z) {
        l = z;
    }

    public static boolean a() {
        return l;
    }

    public static void a(String str) {
        if (l) {
            Log.d("zzb", str);
        }
        if (k) {
            a(com.umeng.commonsdk.proguard.d.am, "zzb", str);
        }
    }

    public static void a(String str, String str2) {
        String substring;
        if (l) {
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int i3 = i2 + GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND;
                if (length <= i3) {
                    substring = str2.substring(i2);
                } else {
                    substring = str2.substring(i2, i3 > length ? length : i3);
                }
                Log.d(str + "___index:" + i2, substring.trim());
                i2 = i3;
            }
        }
        if (k) {
            a(com.umeng.commonsdk.proguard.d.am, str, str2);
        }
    }

    public static void b(String str) {
        if (l) {
            Log.e("zzb", str);
        }
        if (k) {
            a("e", "zzb", str);
        }
    }

    public static long b() {
        if (l) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    public static void a(long j2, String str) {
        if (l) {
            a("use_time", str + " 耗时：" + (System.currentTimeMillis() - j2));
        }
    }

    public static void b(String str, String str2) {
        if (j) {
            Log.d(str, " " + str2);
        }
        if (k) {
            a(com.umeng.commonsdk.proguard.d.am, str, str2);
        }
    }

    public static void a(String str, Throwable th) {
        if (h) {
            Log.i(str, " " + th);
        }
        if (i) {
            PrintWriter printWriter = new PrintWriter(new StringWriter());
            th.printStackTrace(printWriter);
            a("e", str, printWriter.toString());
        }
    }

    public static void c(String str, String str2) {
        if (f4018d) {
            Log.i(str, " " + str2);
        }
        if (e) {
            a(com.umeng.commonsdk.proguard.d.aq, str, str2);
        }
    }

    public static void a(String str, String str2, String str3) {
        PrintWriter printWriter;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    File c2 = c("android.log");
                    if (c2 == null) {
                        return;
                    }
                    fileOutputStream = new FileOutputStream(c2, true);
                    try {
                        printWriter = new PrintWriter(fileOutputStream);
                        try {
                            String a2 = a(0L);
                            if (str.equals("e")) {
                                printWriter.println(a2 + " Error:>>" + str2 + "<<  " + str3 + '\r');
                            } else if (str.equals(com.umeng.commonsdk.proguard.d.am)) {
                                printWriter.println(a2 + " Debug:>>" + str2 + "<<  " + str3 + '\r');
                            } else if (str.equals(com.umeng.commonsdk.proguard.d.aq)) {
                                printWriter.println(a2 + " Info:>>" + str2 + "<<   " + str3 + '\r');
                            } else if (str.equals("w")) {
                                printWriter.println(a2 + " Warning:>>" + str2 + "<<   " + str3 + '\r');
                            } else if (str.equals("v")) {
                                printWriter.println(a2 + " Verbose:>>" + str2 + "<<   " + str3 + '\r');
                            } else if (str.equals("f")) {
                                printWriter.println(a2 + " File:>>" + str2 + "<<   " + str3 + '\r');
                            }
                            printWriter.flush();
                            fileOutputStream.close();
                            if (printWriter != null) {
                                printWriter.close();
                            }
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            fileOutputStream2 = fileOutputStream;
                            e.printStackTrace();
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            if (printWriter != null) {
                                printWriter.close();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            fileOutputStream2 = fileOutputStream;
                            e.printStackTrace();
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            if (printWriter != null) {
                                printWriter.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    throw th;
                                }
                            }
                            if (printWriter != null) {
                                printWriter.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e5) {
                        e = e5;
                        printWriter = null;
                    } catch (Exception e6) {
                        e = e6;
                        printWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        printWriter = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (FileNotFoundException e7) {
                e = e7;
                printWriter = null;
            } catch (Exception e8) {
                e = e8;
                printWriter = null;
            } catch (Throwable th4) {
                th = th4;
                printWriter = null;
                fileOutputStream = null;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    public static String a(long j2) {
        Date date;
        if (j2 > 0) {
            date = new Date(j2);
        } else {
            date = new Date();
        }
        return f4015a.format(date);
    }

    private static File c(String str) {
        String str2;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            str2 = Environment.getExternalStorageDirectory() + "/CMPlaySDK/Log";
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        File file = new File(str2);
        if (!file.exists()) {
            Log.i("Log", "fileDir is no exists!");
            if (!file.mkdirs()) {
                return null;
            }
        }
        return new File(str2, str);
    }
}
