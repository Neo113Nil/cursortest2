package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.e;
import com.apm.insight.k.h;
import com.apm.insight.l.e;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* compiled from: CrashCatchDispatcher.java */
/* loaded from: classes14.dex */
public final class a implements Thread.UncaughtExceptionHandler {
    private static a a;
    private static volatile boolean i;
    private static volatile ThreadLocal<Boolean> j = new ThreadLocal<>();
    private static volatile long l = 10000;
    private static ArrayList<b> m = new ArrayList<>();
    private Thread.UncaughtExceptionHandler b;
    private c c;
    private c d;
    private volatile int e = 0;
    private volatile int f = 0;
    private ConcurrentHashMap<String, Object> g = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Object> h = new ConcurrentHashMap<>();
    private JSONArray k;

    private a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public final void a(c cVar) {
        this.c = cVar;
    }

    public final void b(c cVar) {
        this.d = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        do {
            th = a(thread, th);
        } while (th != null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:5|(1:7)|8|(1:160)(1:12)|(2:13|14)|(3:147|148|(23:150|17|18|(2:144|145)(2:20|21)|22|23|(14:(1:26)|76|77|78|(1:81)(3:130|(1:132)(1:135)|133)|82|(1:84)(1:128)|(3:87|88|89)|94|95|(2:97|(4:100|101|102|(4:(2:106|107)|108|42|43)(3:1a4|113|114)))|121|(3:123|(1:125)|102)|(0)(0))|140|77|78|(10:81|82|(0)(0)|(3:87|88|89)|94|95|(0)|121|(0)|(0)(0))|130|(0)(0)|133|82|(0)(0)|(0)|94|95|(0)|121|(0)|(0)(0)))|16|17|18|(0)(0)|22|23|(0)|140|77|78|(0)|130|(0)(0)|133|82|(0)(0)|(0)|94|95|(0)|121|(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:5|(1:7)|8|(1:160)(1:12)|13|14|(3:147|148|(23:150|17|18|(2:144|145)(2:20|21)|22|23|(14:(1:26)|76|77|78|(1:81)(3:130|(1:132)(1:135)|133)|82|(1:84)(1:128)|(3:87|88|89)|94|95|(2:97|(4:100|101|102|(4:(2:106|107)|108|42|43)(3:1a4|113|114)))|121|(3:123|(1:125)|102)|(0)(0))|140|77|78|(10:81|82|(0)(0)|(3:87|88|89)|94|95|(0)|121|(0)|(0)(0))|130|(0)(0)|133|82|(0)(0)|(0)|94|95|(0)|121|(0)|(0)(0)))|16|17|18|(0)(0)|22|23|(0)|140|77|78|(0)|130|(0)(0)|133|82|(0)(0)|(0)|94|95|(0)|121|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x015b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x015c, code lost:
    
        r2 = r2;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00c0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00c1, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01b8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b9, code lost:
    
        r2 = r9;
        r5 = r11;
        r4 = 1;
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if (com.apm.insight.e.i().isCrashIgnored(r10) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01cc, code lost:
    
        com.apm.insight.a.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01d4, code lost:
    
        if (r2 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e0, code lost:
    
        a(r21, r22, r17, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e3, code lost:
    
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e8, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e9, code lost:
    
        r20.f -= r4;
        r20.e -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f8, code lost:
    
        return g();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0164 A[Catch: all -> 0x015b, TryCatch #13 {all -> 0x015b, blocks: (B:101:0x0142, B:123:0x0164, B:125:0x0168), top: B:95:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bd A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {all -> 0x00c0, blocks: (B:132:0x00bd, B:133:0x00cc, B:135:0x00ca), top: B:130:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ca A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:132:0x00bd, B:133:0x00cc, B:135:0x00ca), top: B:130:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cc A[Catch: all -> 0x01d0, TRY_LEAVE, TryCatch #6 {all -> 0x01d0, blocks: (B:32:0x01c6, B:34:0x01cc), top: B:31:0x01c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f A[Catch: all -> 0x0117, TRY_LEAVE, TryCatch #10 {all -> 0x0117, blocks: (B:89:0x0113, B:94:0x0119, B:97:0x012f), top: B:88:0x0113 }] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [long] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [long] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.apm.insight.g.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Throwable a(Thread thread, Throwable th) {
        boolean z;
        boolean z2;
        CrashType crashType;
        boolean z3;
        long j2;
        int i2;
        boolean z4;
        boolean z5;
        JSONArray a2;
        String a3;
        ?? r4;
        boolean b;
        boolean z6;
        if (this.e >= 3) {
            return null;
        }
        this.e++;
        this.f++;
        if (i) {
            j.set(Boolean.TRUE);
        }
        i = true;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z7 = false;
        boolean z8 = (com.apm.insight.runtime.a.b.c() == -1 || currentTimeMillis - com.apm.insight.runtime.a.b.c() <= e.i().getLaunchCrashInterval()) && !(e.n() && e.q() == 0);
        try {
            z = m.c(th);
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            try {
            } catch (Throwable unused2) {
                z2 = false;
                if (z8) {
                }
                String a4 = e.a(currentTimeMillis, crashType, z, false);
                File file = new File(j.a(e.g()), a4);
                ?? r5 = "logEventStack";
                String a5 = a(new File(file, "logEventStack"), th, thread, z2);
                if ((f() & 1) == 0) {
                }
                z5 = true;
                a2 = com.apm.insight.entity.b.a(th, thread, file);
                this.k = a2;
                if (a2 == null) {
                }
                a3 = e.a(currentTimeMillis, !z8 ? CrashType.LAUNCH : CrashType.JAVA, z, true);
                File file2 = new File(j.a(e.g()), a3);
                file.renameTo(file2);
                new File(file2, "logEventStack");
                r4 = "logEventStack";
                com.apm.insight.a.d();
                com.apm.insight.k.b.a().b();
                if (com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1) {
                }
                if (z2) {
                }
                ?? valueOf = String.valueOf(z8);
                com.apm.insight.a.a((Object) "[uncaughtException] isLaunchCrash=".concat(valueOf));
                com.apm.insight.a.a.a();
                b = b(thread, th);
                if (b) {
                }
                valueOf = z2;
                r5 = currentTimeMillis;
                r4 = 1;
                if (b) {
                }
                if (!z5) {
                }
            }
            if (m.d(th)) {
                z6 = true;
                z2 = z6;
                if (z8) {
                    try {
                        crashType = CrashType.LAUNCH;
                    } catch (Throwable th2) {
                        th = th2;
                        z4 = false;
                        z3 = z2;
                        j2 = currentTimeMillis;
                        i2 = 1;
                        try {
                            if (!m.c(th)) {
                            }
                            if (!z7) {
                            }
                        } catch (Throwable th3) {
                            if (z7) {
                                synchronized (this) {
                                    this.f -= i2;
                                    this.e -= i2;
                                    return g();
                                }
                            }
                            if (z3 && !z4) {
                                try {
                                    a(thread, th, z8, j2);
                                } catch (Throwable unused3) {
                                    throw th3;
                                }
                            }
                            e();
                            d();
                            c(thread, th);
                            throw th3;
                        }
                    }
                } else {
                    try {
                        crashType = CrashType.JAVA;
                    } catch (Throwable th4) {
                        th = th4;
                        z3 = z2;
                        j2 = currentTimeMillis;
                        i2 = 1;
                        z4 = false;
                        if (!m.c(th)) {
                        }
                        if (!z7) {
                        }
                    }
                }
                String a42 = e.a(currentTimeMillis, crashType, z, false);
                File file3 = new File(j.a(e.g()), a42);
                ?? r52 = "logEventStack";
                String a52 = a(new File(file3, "logEventStack"), th, thread, z2);
                if ((f() & 1) == 0) {
                    if (a52 != null) {
                    }
                    z5 = false;
                    a2 = com.apm.insight.entity.b.a(th, thread, file3);
                    this.k = a2;
                    if (a2 == null || z5) {
                        a3 = e.a(currentTimeMillis, !z8 ? CrashType.LAUNCH : CrashType.JAVA, z, true);
                        File file22 = new File(j.a(e.g()), a3);
                        file3.renameTo(file22);
                        new File(file22, "logEventStack");
                        r4 = "logEventStack";
                    } else {
                        a3 = a42;
                        r4 = a2;
                    }
                    com.apm.insight.a.d();
                    com.apm.insight.k.b.a().b();
                    z4 = com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1;
                    if (z2 && z4) {
                        r4 = z8;
                        r52 = currentTimeMillis;
                        try {
                            a(thread, th, r4, r52);
                        } catch (Throwable th5) {
                            th = th5;
                            boolean z9 = z2;
                            long j3 = currentTimeMillis;
                            int i3 = 1;
                            z7 = z5;
                            z3 = z9;
                            i2 = i3;
                            j2 = j3;
                            if (!m.c(th)) {
                            }
                            if (!z7) {
                            }
                        }
                    }
                    ?? valueOf2 = String.valueOf(z8);
                    com.apm.insight.a.a((Object) "[uncaughtException] isLaunchCrash=".concat(valueOf2));
                    com.apm.insight.a.a.a();
                    b = b(thread, th);
                    if (b) {
                        c cVar = this.c;
                        if (cVar != null && z8) {
                            valueOf2 = z2;
                            r52 = currentTimeMillis;
                            r4 = 1;
                            cVar.a(currentTimeMillis, thread, th, a3, a52, z5);
                            com.apm.insight.a.a((Object) ("[uncaughtException] mLaunchCrashDisposer " + th.toString()));
                            if (!z5) {
                                synchronized (this) {
                                    this.f -= r4;
                                    this.e -= r4;
                                }
                                return g();
                            }
                            if (valueOf2 != 0 && !z4) {
                                a(thread, th, z8, r52);
                            }
                            e();
                            d();
                            c(thread, th);
                            return null;
                        }
                    }
                    valueOf2 = z2;
                    r52 = currentTimeMillis;
                    r4 = 1;
                    if (b) {
                        ?? r8 = this.d;
                        valueOf2 = valueOf2;
                        r4 = r4;
                        r52 = r52;
                        if (r8 != 0) {
                            r8.a(r52, thread, th, a3, a52, z5);
                            com.apm.insight.a.a((Object) ("[uncaughtException] mLaunchCrashDisposer " + th.toString()));
                            valueOf2 = valueOf2;
                            r4 = r4;
                            r52 = r52;
                        }
                    }
                    if (!z5) {
                    }
                }
                z5 = true;
                a2 = com.apm.insight.entity.b.a(th, thread, file3);
                this.k = a2;
                if (a2 == null) {
                    a3 = a42;
                    r4 = a2;
                    com.apm.insight.a.d();
                    com.apm.insight.k.b.a().b();
                    if (com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1) {
                    }
                    if (z2) {
                        r4 = z8;
                        r52 = currentTimeMillis;
                        a(thread, th, r4, r52);
                    }
                    ?? valueOf22 = String.valueOf(z8);
                    com.apm.insight.a.a((Object) "[uncaughtException] isLaunchCrash=".concat(valueOf22));
                    com.apm.insight.a.a.a();
                    b = b(thread, th);
                    if (b) {
                    }
                    valueOf22 = z2;
                    r52 = currentTimeMillis;
                    r4 = 1;
                    if (b) {
                    }
                    if (!z5) {
                    }
                }
                a3 = e.a(currentTimeMillis, !z8 ? CrashType.LAUNCH : CrashType.JAVA, z, true);
                File file222 = new File(j.a(e.g()), a3);
                file3.renameTo(file222);
                new File(file222, "logEventStack");
                r4 = "logEventStack";
                com.apm.insight.a.d();
                com.apm.insight.k.b.a().b();
                if (com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1) {
                }
                if (z2) {
                }
                ?? valueOf222 = String.valueOf(z8);
                com.apm.insight.a.a((Object) "[uncaughtException] isLaunchCrash=".concat(valueOf222));
                com.apm.insight.a.a.a();
                b = b(thread, th);
                if (b) {
                }
                valueOf222 = z2;
                r52 = currentTimeMillis;
                r4 = 1;
                if (b) {
                }
                if (!z5) {
                }
            }
        }
        z6 = false;
        z2 = z6;
        if (z8) {
        }
        String a422 = e.a(currentTimeMillis, crashType, z, false);
        File file32 = new File(j.a(e.g()), a422);
        ?? r522 = "logEventStack";
        String a522 = a(new File(file32, "logEventStack"), th, thread, z2);
        if ((f() & 1) == 0) {
        }
        z5 = true;
        a2 = com.apm.insight.entity.b.a(th, thread, file32);
        this.k = a2;
        if (a2 == null) {
        }
        a3 = e.a(currentTimeMillis, !z8 ? CrashType.LAUNCH : CrashType.JAVA, z, true);
        File file2222 = new File(j.a(e.g()), a3);
        file32.renameTo(file2222);
        new File(file2222, "logEventStack");
        r4 = "logEventStack";
        com.apm.insight.a.d();
        com.apm.insight.k.b.a().b();
        if (com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1) {
        }
        if (z2) {
        }
        ?? valueOf2222 = String.valueOf(z8);
        com.apm.insight.a.a((Object) "[uncaughtException] isLaunchCrash=".concat(valueOf2222));
        com.apm.insight.a.a.a();
        b = b(thread, th);
        if (b) {
        }
        valueOf2222 = z2;
        r522 = currentTimeMillis;
        r4 = 1;
        if (b) {
        }
        if (!z5) {
        }
    }

    private void d() {
        synchronized (this) {
            this.f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f != 0 && SystemClock.uptimeMillis() - uptimeMillis < l) {
            SystemClock.sleep(50L);
        }
    }

    private static void e() {
        File a2 = j.a(e.g());
        File a3 = j.a();
        if (f.b(a2) && f.b(a3)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!h.a() && SystemClock.uptimeMillis() - uptimeMillis < l) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private String a(File file, Throwable th, Thread thread, boolean z) {
        String absolutePath = file.getAbsolutePath();
        this.h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String str = null;
        if (z) {
            int h = NativeImpl.h(absolutePath);
            if (h > 0) {
                try {
                    e.g();
                    NativeImpl.a(h, com.apm.insight.l.a.b());
                    NativeImpl.a(h, "\n");
                    NativeImpl.a(h, th.getMessage());
                    NativeImpl.a(h, "\n");
                    NativeImpl.a(h, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.a(h, ": ");
                        NativeImpl.a(h, th.getMessage());
                    }
                    NativeImpl.a(h, "\n");
                    NativeImpl.a(h, thread.getName());
                    NativeImpl.a(h, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(h, "stack:");
                    NativeImpl.a(h, "\n");
                } catch (Throwable unused3) {
                }
                m.a(th, h);
                NativeImpl.b(h);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    StringBuilder sb = new StringBuilder();
                    e.g();
                    sb.append(com.apm.insight.l.a.b());
                    sb.append("\n");
                    fileOutputStream.write(sb.toString().getBytes());
                    fileOutputStream.write((th.getMessage() + "\n").getBytes());
                    fileOutputStream.write((th + "\n").getBytes());
                    fileOutputStream.write((thread.getName() + "\n").getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused5) {
                }
                try {
                    str = m.a(th, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new e.a() { // from class: com.apm.insight.g.a.1
                        private boolean a = false;

                        @Override // com.apm.insight.l.e.a
                        public final boolean a(String str2) {
                            if (!this.a && str2.contains("android.os.Looper.loop")) {
                                this.a = true;
                            }
                            return !this.a;
                        }
                    } : new e.a());
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                } catch (Throwable th2) {
                    try {
                        th.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th2 + "\n").getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                        } catch (Throwable unused6) {
                        }
                    }
                }
                com.apm.insight.a.a((Closeable) fileOutputStream);
            } catch (Throwable unused7) {
            }
        }
        return str;
    }

    private static boolean b(Thread thread, Throwable th) {
        ICrashFilter b = com.apm.insight.e.b().b();
        if (b != null) {
            try {
                if (!b.onJavaCrashFilter(th, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public final void a(Thread thread, Throwable th, boolean z, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> c;
        CrashType crashType;
        if (z) {
            c = l.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            c = l.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : c) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, m.a(th), thread, this.k);
                } else {
                    iCrashCallback.onCrash(crashType, m.a(th), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                com.apm.insight.a.b(th2);
                aVar.b("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    private void a(Thread thread, Throwable th, boolean z, long j2) {
        List<IOOMCallback> a2 = l.a().a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : a2) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iOOMCallback).a(crashType, th, thread, j2, this.k);
                } else {
                    iOOMCallback.onCrash(crashType, th, thread, j2);
                }
            } catch (Throwable th2) {
                com.apm.insight.a.b(th2);
            }
        }
    }

    private void c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public final void a(String str) {
        this.g.put(str, new Object());
    }

    public final boolean b(String str) {
        return this.g.containsKey(str);
    }

    public static void a(final Throwable th) {
        if (th == null) {
            return;
        }
        try {
            com.apm.insight.runtime.m.a().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a a2 = com.apm.insight.entity.a.a(System.currentTimeMillis(), com.apm.insight.e.g(), th);
                        a2.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a3 = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, a2);
                        if (a3 != null) {
                            com.apm.insight.k.d.a().c(a3.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            com.apm.insight.runtime.m.a().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a("data", (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a2 = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (a2 != null) {
                            com.apm.insight.k.d.a().c(a2.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean b() {
        return i;
    }

    public static boolean c() {
        Boolean bool = j.get();
        return bool != null && bool.booleanValue();
    }

    private static int f() {
        int i2 = 0;
        for (int i3 = 0; i3 < m.size(); i3++) {
            try {
                try {
                    i2 |= m.get(i3).a();
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    private static Throwable g() {
        for (int i2 = 0; i2 < m.size(); i2++) {
            try {
                m.get(i2);
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public static void a(long j2) {
        l = j2;
    }
}
