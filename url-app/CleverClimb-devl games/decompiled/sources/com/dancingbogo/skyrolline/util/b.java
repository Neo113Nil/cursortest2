package com.dancingbogo.skyrolline.util;

import android.os.Environment;
import android.util.Log;
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
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static SimpleDateFormat f4605a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);

    /* renamed from: b, reason: collision with root package name */
    private static boolean f4606b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4607c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f4608d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static boolean k = false;

    public static void a(String str, String str2) {
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

    public static void b(String str, String str2) {
        if (f4608d) {
            Log.i(str, " " + str2);
        }
        if (e) {
            a(com.umeng.commonsdk.proguard.d.aq, str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (h) {
            Log.e(str, " " + str2);
        }
        if (i) {
            a("e", str, str2);
        }
    }

    public static void a(String str, String str2, String str3) {
        PrintWriter printWriter;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    File a2 = a("android.log");
                    if (a2 == null) {
                        return;
                    }
                    fileOutputStream = new FileOutputStream(a2, true);
                    try {
                        printWriter = new PrintWriter(fileOutputStream);
                        try {
                            String a3 = a(0L);
                            if (str.equals("e")) {
                                printWriter.println(a3 + " Error:>>" + str2 + "<<  " + str3 + '\r');
                            } else if (str.equals(com.umeng.commonsdk.proguard.d.am)) {
                                printWriter.println(a3 + " Debug:>>" + str2 + "<<  " + str3 + '\r');
                            } else if (str.equals(com.umeng.commonsdk.proguard.d.aq)) {
                                printWriter.println(a3 + " Info:>>" + str2 + "<<   " + str3 + '\r');
                            } else if (str.equals("w")) {
                                printWriter.println(a3 + " Warning:>>" + str2 + "<<   " + str3 + '\r');
                            } else if (str.equals("v")) {
                                printWriter.println(a3 + " Verbose:>>" + str2 + "<<   " + str3 + '\r');
                            } else if (str.equals("f")) {
                                printWriter.println(a3 + " File:>>" + str2 + "<<   " + str3 + '\r');
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
        return f4605a.format(date);
    }

    private static File a(String str) {
        String str2;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            str2 = Environment.getExternalStorageDirectory() + "/IJSConnectAssistant/Log";
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
