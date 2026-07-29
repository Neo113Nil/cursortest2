package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.gcm.Task;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8804a = true;

    /* renamed from: b, reason: collision with root package name */
    private static SimpleDateFormat f8805b = null;

    /* renamed from: c, reason: collision with root package name */
    private static int f8806c = 5120;

    /* renamed from: d, reason: collision with root package name */
    private static StringBuilder f8807d;
    private static StringBuilder e;
    private static boolean f;
    private static a g;
    private static String h;
    private static String i;
    private static Context j;
    private static String k;
    private static boolean l;
    private static int m;
    private static final Object n = new Object();

    static /* synthetic */ boolean a(boolean z) {
        f = false;
        return false;
    }

    static {
        try {
            f8805b = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable unused) {
        }
    }

    private static boolean b(String str, String str2, String str3) {
        try {
            com.tencent.bugly.crashreport.common.info.a b2 = com.tencent.bugly.crashreport.common.info.a.b();
            if (b2 == null || b2.D == null) {
                return false;
            }
            return b2.D.appendLogToNative(str, str2, str3);
        } catch (Throwable th) {
            if (x.a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (y.class) {
            if (l || context == null || !f8804a) {
                return;
            }
            try {
                e = new StringBuilder(0);
                f8807d = new StringBuilder(0);
                j = context;
                com.tencent.bugly.crashreport.common.info.a a2 = com.tencent.bugly.crashreport.common.info.a.a(context);
                h = a2.f8601d;
                a2.getClass();
                i = "";
                k = j.getFilesDir().getPath() + "/buglylog_" + h + "_" + i + ".txt";
                m = Process.myPid();
            } catch (Throwable unused) {
            }
            l = true;
        }
    }

    public static void a(int i2) {
        synchronized (n) {
            f8806c = i2;
            if (i2 < 0) {
                f8806c = 0;
            } else if (i2 > 10240) {
                f8806c = Task.EXTRAS_LIMIT_BYTES;
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (th == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        a(str, str2, message + '\n' + z.b(th));
    }

    public static synchronized void a(String str, String str2, String str3) {
        synchronized (y.class) {
            if (l && f8804a) {
                b(str, str2, str3);
                long myTid = Process.myTid();
                f8807d.setLength(0);
                if (str3.length() > 30720) {
                    str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
                }
                Date date = new Date();
                String format = f8805b != null ? f8805b.format(date) : date.toString();
                StringBuilder sb = f8807d;
                sb.append(format);
                sb.append(" ");
                sb.append(m);
                sb.append(" ");
                sb.append(myTid);
                sb.append(" ");
                sb.append(str);
                sb.append(" ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                sb.append("\u0001\r\n");
                final String sb2 = f8807d.toString();
                synchronized (n) {
                    e.append(sb2);
                    if (e.length() <= f8806c) {
                        return;
                    }
                    if (f) {
                        return;
                    }
                    f = true;
                    w.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.y.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            synchronized (y.n) {
                                try {
                                    if (y.g == null) {
                                        a unused = y.g = new a(y.k);
                                    } else if (y.g.f8810b == null || y.g.f8810b.length() + y.e.length() > y.g.e) {
                                        y.g.a();
                                    }
                                    if (y.g.f8809a) {
                                        y.g.a(y.e.toString());
                                        y.e.setLength(0);
                                    } else {
                                        y.e.setLength(0);
                                        y.e.append(sb2);
                                    }
                                    y.a(false);
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public static byte[] a() {
        if (!f8804a) {
            return null;
        }
        synchronized (n) {
            try {
                File file = (g == null || !g.f8809a) ? null : g.f8810b;
                if (e.length() == 0 && file == null) {
                    return null;
                }
                return z.a(file, e.toString(), "BuglyLog.txt");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: BUGLY */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f8809a;

        /* renamed from: b, reason: collision with root package name */
        private File f8810b;

        /* renamed from: c, reason: collision with root package name */
        private String f8811c;

        /* renamed from: d, reason: collision with root package name */
        private long f8812d;
        private long e = 30720;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f8811c = str;
            this.f8809a = a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            try {
                this.f8810b = new File(this.f8811c);
                if (this.f8810b.exists() && !this.f8810b.delete()) {
                    this.f8809a = false;
                    return false;
                }
                if (this.f8810b.createNewFile()) {
                    return true;
                }
                this.f8809a = false;
                return false;
            } catch (Throwable unused) {
                this.f8809a = false;
                return true;
            }
        }

        public final boolean a(String str) {
            FileOutputStream fileOutputStream;
            if (!this.f8809a) {
                return false;
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(this.f8810b, true);
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
            }
            try {
                fileOutputStream.write(str.getBytes("UTF-8"));
                fileOutputStream.flush();
                fileOutputStream.close();
                this.f8812d += r10.length;
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }
}
