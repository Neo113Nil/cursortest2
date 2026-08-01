package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.i;
import com.apm.insight.l.e;
import com.apm.insight.l.f;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {
    private static a a = null;
    private static volatile boolean i = false;
    private static volatile ThreadLocal<Boolean> j = new ThreadLocal<>();
    private static ArrayList<b> l = new ArrayList<>();
    private Thread.UncaughtExceptionHandler b;
    private c c;
    private c d;
    private volatile int e = 0;
    private volatile int f = 0;
    private ConcurrentHashMap<String, Object> g = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Object> h = new ConcurrentHashMap<>();
    private JSONArray k;

    private a() {
        d();
    }

    private static int a(Throwable th, Thread thread) {
        int i2 = 0;
        for (int i3 = 0; i3 < l.size(); i3++) {
            try {
                try {
                    i2 |= l.get(i3).a(th, thread);
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    private String a(File file, boolean z, Throwable th, String str, Thread thread, boolean z2) {
        String absolutePath = file.getAbsolutePath();
        this.h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z2) {
            int h = NativeImpl.h(absolutePath);
            if (h > 0) {
                try {
                    NativeImpl.a(h, com.apm.insight.l.a.c(i.g()));
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
                v.a(th, h);
                NativeImpl.b(h);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                if (r.a(32768)) {
                    throw new RuntimeException("test exception before write stack");
                }
                fileOutputStream.write((com.apm.insight.l.a.c(i.g()) + "\n").getBytes());
                fileOutputStream.write((th.getMessage() + "\n").getBytes());
                fileOutputStream.write((th + "\n").getBytes());
                fileOutputStream.write((thread.getName() + "\n").getBytes());
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused4) {
                }
                try {
                } catch (Throwable th2) {
                    try {
                        if (r.a(16384)) {
                            throw new RuntimeException("test exception system write stack");
                        }
                        th.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th2 + "\n").getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                        } catch (Throwable unused5) {
                        }
                    }
                }
                if (r.a(8192)) {
                    throw new RuntimeException("test exception npth write stack");
                }
                str2 = v.a(th, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new e.a() { // from class: com.apm.insight.g.a.1
                    boolean a = false;

                    @Override // com.apm.insight.l.e.a
                    public boolean a(String str3) {
                        if (!this.a && str3.contains("android.os.Looper.loop")) {
                            this.a = true;
                        }
                        return !this.a;
                    }
                } : new e.a());
                k.a(fileOutputStream);
                k.a(fileOutputStream);
            } catch (Throwable unused6) {
            }
        }
        return str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:7|(1:9)|10|(2:11|12)|(3:182|183|(34:185|15|16|(2:176|177)(2:18|19)|20|21|22|23|24|(19:(2:162|163)|27|28|29|(1:31)(1:158)|32|(3:150|(1:152)(1:154)|153)(1:35)|36|(1:148)(3:39|40|41)|42|(1:44)|46|47|(1:49)(1:143)|50|51|(4:85|(3:88|89|(3:93|94|95))|87|(4:(1:71)(2:65|66)|67|68|69)(4:72|1f2|77|78))(3:58|59|60)|61|(0)(0))|168|28|29|(0)(0)|32|(0)|150|(0)(0)|153|36|(0)|148|42|(0)|46|47|(0)(0)|50|51|(1:53)|85|(0)|87|(0)(0)))|14|15|16|(0)(0)|20|21|22|23|24|(0)|168|28|29|(0)(0)|32|(0)|150|(0)(0)|153|36|(0)|148|42|(0)|46|47|(0)(0)|50|51|(0)|85|(0)|87|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(40:7|(1:9)|10|11|12|(3:182|183|(34:185|15|16|(2:176|177)(2:18|19)|20|21|22|23|24|(19:(2:162|163)|27|28|29|(1:31)(1:158)|32|(3:150|(1:152)(1:154)|153)(1:35)|36|(1:148)(3:39|40|41)|42|(1:44)|46|47|(1:49)(1:143)|50|51|(4:85|(3:88|89|(3:93|94|95))|87|(4:(1:71)(2:65|66)|67|68|69)(4:72|1f2|77|78))(3:58|59|60)|61|(0)(0))|168|28|29|(0)(0)|32|(0)|150|(0)(0)|153|36|(0)|148|42|(0)|46|47|(0)(0)|50|51|(1:53)|85|(0)|87|(0)(0)))|14|15|16|(0)(0)|20|21|22|23|24|(0)|168|28|29|(0)(0)|32|(0)|150|(0)(0)|153|36|(0)|148|42|(0)|46|47|(0)(0)|50|51|(0)|85|(0)|87|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023c, code lost:
    
        com.apm.insight.l.q.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0241, code lost:
    
        if (r19 != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024b, code lost:
    
        a(r27, r28, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024e, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0253, code lost:
    
        monitor-enter(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0254, code lost:
    
        r26.f -= r2;
        r26.e -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0263, code lost:
    
        return b(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01c8, code lost:
    
        r7 = r1;
        r9 = r3;
        r2 = r2;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0206, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0211, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0212, code lost:
    
        r4 = r5;
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x021f, code lost:
    
        r21 = false;
        r2 = r2;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0218, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0219, code lost:
    
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00ad, code lost:
    
        if (com.apm.insight.i.i().isCrashIgnored(r7) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0223, code lost:
    
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
        r4 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023c A[Catch: all -> 0x0267, TRY_LEAVE, TryCatch #5 {all -> 0x0267, blocks: (B:100:0x0236, B:102:0x023c), top: B:99:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x013d A[Catch: all -> 0x0206, TryCatch #4 {all -> 0x0206, blocks: (B:49:0x013a, B:50:0x013f, B:53:0x015e, B:56:0x0164, B:58:0x016a, B:143:0x013d), top: B:47:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e0 A[Catch: all -> 0x0211, TRY_ENTER, TryCatch #11 {all -> 0x0211, blocks: (B:36:0x0105, B:152:0x00e0, B:153:0x00e5, B:154:0x00e3), top: B:32:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e3 A[Catch: all -> 0x0211, TryCatch #11 {all -> 0x0211, blocks: (B:36:0x0105, B:152:0x00e0, B:153:0x00e5, B:154:0x00e3), top: B:32:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131 A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #7 {all -> 0x0209, blocks: (B:41:0x0123, B:42:0x012b, B:44:0x0131), top: B:40:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a A[Catch: all -> 0x0206, TRY_ENTER, TryCatch #4 {all -> 0x0206, blocks: (B:49:0x013a, B:50:0x013f, B:53:0x015e, B:56:0x0164, B:58:0x016a, B:143:0x013d), top: B:47:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e A[Catch: all -> 0x0206, TryCatch #4 {all -> 0x0206, blocks: (B:49:0x013a, B:50:0x013f, B:53:0x015e, B:56:0x0164, B:58:0x016a, B:143:0x013d), top: B:47:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.apm.insight.a.a] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r9v15, types: [com.apm.insight.g.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Throwable a(Thread thread, Throwable th) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        CrashType crashType;
        boolean z7;
        Throwable th2;
        Thread thread2;
        long j2;
        int i2;
        long j3;
        int i3;
        File file;
        JSONArray a2;
        String str;
        String str2;
        String str3;
        long j4;
        ?? b;
        String str4;
        Throwable th3;
        Thread thread3;
        long j5;
        int i4;
        c cVar;
        boolean z8;
        if (this.e >= 3 && !r.a(65536)) {
            return null;
        }
        this.e++;
        this.f++;
        if (i) {
            j.set(true);
        }
        i = true;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a3 = a(currentTimeMillis);
        try {
            z = v.c(th);
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            try {
            } catch (Throwable unused2) {
                z2 = z;
                z3 = false;
                if (a3) {
                }
                String a4 = i.a(currentTimeMillis, crashType, z2, false);
                File file2 = new File(o.a(i.g()), a4);
                File file3 = new File(file2, "logEventStack");
                File file4 = file3;
                boolean z9 = z2;
                boolean z10 = z2;
                String str5 = a4;
                z7 = false;
                String a5 = a(file3, z9, th, str5, thread, z3);
                if ((a(th, thread) & 1) == 0) {
                }
                file = file2;
                z4 = true;
                a2 = com.apm.insight.entity.b.a(th, thread, file);
                this.k = a2;
                if (a2 != null) {
                }
                String str6 = a3;
                String a6 = i.a(currentTimeMillis, str6 == null ? CrashType.LAUNCH : CrashType.JAVA, z10, true);
                File file5 = new File(o.a(i.g()), a6);
                file.renameTo(file5);
                file4 = new File(file5, "logEventStack");
                str = a6;
                str5 = str6;
                f.a();
                com.apm.insight.k.b.a().b();
                z5 = g();
                if (z3) {
                }
                str2 = str5;
                str3 = str;
                j4 = str5;
                if (r.a(1)) {
                }
                z6 = str2;
                if (!z6) {
                }
                q.a((Object) ("[uncaughtException] isLaunchCrash=" + z6));
                ?? a7 = com.apm.insight.a.a.a();
                ?? r3 = str3;
                a7.a(r1, currentTimeMillis, r3);
                b = b(thread, th);
                if (b != 0) {
                }
                j2 = currentTimeMillis;
                i2 = 1;
                if (b != 0) {
                }
                th3 = th;
                thread3 = thread;
                i4 = 1;
                j5 = j2;
                if (z4) {
                }
            }
            if (v.d(th)) {
                z8 = true;
                z2 = z;
                z3 = z8;
                if (a3) {
                    try {
                        crashType = CrashType.LAUNCH;
                    } catch (Throwable th4) {
                        th = th4;
                        z4 = false;
                        z5 = false;
                        z6 = a3;
                        j2 = currentTimeMillis;
                        i2 = 1;
                        th2 = th;
                        thread2 = thread;
                        i3 = i2;
                        j3 = j2;
                        try {
                            if (!v.c(th)) {
                            }
                            if (!z4) {
                            }
                        } catch (Throwable th5) {
                            if (z4) {
                                synchronized (this) {
                                    this.f -= i3;
                                    this.e -= i3;
                                    return b(th2, thread2);
                                }
                            }
                            if (z3 && !z5) {
                                try {
                                    a(thread, th, z6, j3);
                                } catch (Throwable unused3) {
                                    throw th5;
                                }
                            }
                            f();
                            e();
                            c(thread, th);
                            throw th5;
                        }
                    }
                } else {
                    try {
                        crashType = CrashType.JAVA;
                    } catch (Throwable th6) {
                        th = th6;
                        z7 = false;
                        z6 = a3;
                        long j6 = currentTimeMillis;
                        int i5 = 1;
                        th2 = th;
                        thread2 = thread;
                        z4 = z7;
                        z5 = z4;
                        i3 = i5;
                        j3 = j6;
                        if (!v.c(th)) {
                        }
                        if (!z4) {
                        }
                    }
                }
                String a42 = i.a(currentTimeMillis, crashType, z2, false);
                File file22 = new File(o.a(i.g()), a42);
                File file32 = new File(file22, "logEventStack");
                File file42 = file32;
                boolean z92 = z2;
                boolean z102 = z2;
                String str52 = a42;
                z7 = false;
                String a52 = a(file32, z92, th, str52, thread, z3);
                if ((a(th, thread) & 1) == 0) {
                    if (a52 != null) {
                        try {
                        } catch (Throwable th7) {
                            th = th7;
                            j3 = currentTimeMillis;
                            i3 = 1;
                            th2 = th;
                            thread2 = thread;
                            z4 = false;
                            z5 = false;
                            z6 = a3;
                            if (!v.c(th)) {
                            }
                            if (!z4) {
                            }
                        }
                    }
                    file = file22;
                    z4 = false;
                    a2 = com.apm.insight.entity.b.a(th, thread, file);
                    this.k = a2;
                    if (!(a2 != null) || z4) {
                        String str62 = a3;
                        String a62 = i.a(currentTimeMillis, str62 == null ? CrashType.LAUNCH : CrashType.JAVA, z102, true);
                        File file52 = new File(o.a(i.g()), a62);
                        file.renameTo(file52);
                        file42 = new File(file52, "logEventStack");
                        str = a62;
                        str52 = str62;
                    } else {
                        str = a42;
                        str52 = a3;
                    }
                    f.a();
                    com.apm.insight.k.b.a().b();
                    z5 = g();
                    if (z3 || !z5) {
                        str2 = str52;
                        str3 = str;
                        j4 = str52;
                    } else {
                        boolean z11 = str52;
                        str2 = str52;
                        str3 = str;
                        long j7 = currentTimeMillis;
                        try {
                            a(thread, th, z11, j7);
                            j4 = j7;
                        } catch (Throwable th8) {
                            th = th8;
                            j3 = currentTimeMillis;
                            i3 = 1;
                            th2 = th;
                            thread2 = thread;
                            z6 = str2;
                            if (!v.c(th)) {
                            }
                            if (!z4) {
                            }
                        }
                    }
                    if (r.a(1)) {
                        this.h.clear();
                    }
                    z6 = str2;
                    CrashType crashType2 = !z6 ? CrashType.LAUNCH : CrashType.JAVA;
                    q.a((Object) ("[uncaughtException] isLaunchCrash=" + z6));
                    ?? a72 = com.apm.insight.a.a.a();
                    ?? r32 = str3;
                    a72.a(crashType2, currentTimeMillis, r32);
                    b = b(thread, th);
                    if (b != 0 || (cVar = this.c) == null || !z6 || !cVar.a(th)) {
                        j2 = currentTimeMillis;
                        i2 = 1;
                        if (b != 0) {
                            try {
                                c cVar2 = this.d;
                                if (cVar2 != null && cVar2.a(th)) {
                                    b = th;
                                    r32 = thread;
                                    this.d.a(j2, thread, th, r32, file42, a52, z4);
                                    str4 = "[uncaughtException] mLaunchCrashDisposer " + th.toString();
                                    a72 = 1;
                                    j4 = j2;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                th2 = th;
                                thread2 = thread;
                                i3 = i2;
                                j3 = j2;
                                if (!v.c(th)) {
                                }
                                if (!z4) {
                                }
                            }
                        }
                        th3 = th;
                        thread3 = thread;
                        i4 = 1;
                        j5 = j2;
                        if (z4) {
                            Throwable th10 = th3;
                            Thread thread4 = thread3;
                            synchronized (this) {
                                this.f -= i4;
                                this.e -= i4;
                            }
                            return b(th10, thread4);
                        }
                        if (z3 && !z5) {
                            a(thread, th, z6, j5);
                        }
                        f();
                        e();
                        c(thread, th);
                        return null;
                    }
                    j4 = currentTimeMillis;
                    a72 = 1;
                    b = th;
                    r32 = thread;
                    this.c.a(currentTimeMillis, thread, th, r32, file42, a52, z4);
                    str4 = "[uncaughtException] mLaunchCrashDisposer " + th.toString();
                    q.a((Object) str4);
                    th3 = b;
                    i4 = a72;
                    thread3 = r32;
                    j5 = j4;
                    if (z4) {
                    }
                }
                file = file22;
                z4 = true;
                a2 = com.apm.insight.entity.b.a(th, thread, file);
                this.k = a2;
                if (a2 != null) {
                }
                String str622 = a3;
                String a622 = i.a(currentTimeMillis, str622 == null ? CrashType.LAUNCH : CrashType.JAVA, z102, true);
                File file522 = new File(o.a(i.g()), a622);
                file.renameTo(file522);
                file42 = new File(file522, "logEventStack");
                str = a622;
                str52 = str622;
                f.a();
                com.apm.insight.k.b.a().b();
                z5 = g();
                if (z3) {
                }
                str2 = str52;
                str3 = str;
                j4 = str52;
                if (r.a(1)) {
                }
                z6 = str2;
                if (!z6) {
                }
                q.a((Object) ("[uncaughtException] isLaunchCrash=" + z6));
                ?? a722 = com.apm.insight.a.a.a();
                ?? r322 = str3;
                a722.a(crashType2, currentTimeMillis, r322);
                b = b(thread, th);
                if (b != 0) {
                }
                j2 = currentTimeMillis;
                i2 = 1;
                if (b != 0) {
                }
                th3 = th;
                thread3 = thread;
                i4 = 1;
                j5 = j2;
                if (z4) {
                }
            }
        }
        z8 = false;
        z2 = z;
        z3 = z8;
        if (a3) {
        }
        String a422 = i.a(currentTimeMillis, crashType, z2, false);
        File file222 = new File(o.a(i.g()), a422);
        File file322 = new File(file222, "logEventStack");
        File file422 = file322;
        boolean z922 = z2;
        boolean z1022 = z2;
        String str522 = a422;
        z7 = false;
        String a522 = a(file322, z922, th, str522, thread, z3);
        if ((a(th, thread) & 1) == 0) {
        }
        file = file222;
        z4 = true;
        a2 = com.apm.insight.entity.b.a(th, thread, file);
        this.k = a2;
        if (a2 != null) {
        }
        String str6222 = a3;
        String a6222 = i.a(currentTimeMillis, str6222 == null ? CrashType.LAUNCH : CrashType.JAVA, z1022, true);
        File file5222 = new File(o.a(i.g()), a6222);
        file.renameTo(file5222);
        file422 = new File(file5222, "logEventStack");
        str = a6222;
        str522 = str6222;
        f.a();
        com.apm.insight.k.b.a().b();
        z5 = g();
        if (z3) {
        }
        str2 = str522;
        str3 = str;
        j4 = str522;
        if (r.a(1)) {
        }
        z6 = str2;
        if (!z6) {
        }
        q.a((Object) ("[uncaughtException] isLaunchCrash=" + z6));
        ?? a7222 = com.apm.insight.a.a.a();
        ?? r3222 = str3;
        a7222.a(crashType2, currentTimeMillis, r3222);
        b = b(thread, th);
        if (b != 0) {
        }
        j2 = currentTimeMillis;
        i2 = 1;
        if (b != 0) {
        }
        th3 = th;
        thread3 = thread;
        i4 = 1;
        j5 = j2;
        if (z4) {
        }
    }

    private void a(Thread thread, Throwable th, boolean z, long j2) {
        List<IOOMCallback> a2 = com.apm.insight.runtime.o.a().a();
        CrashType crashType = z ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : a2) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iOOMCallback).a(crashType, th, thread, j2, this.k);
                } else {
                    iOOMCallback.onCrash(crashType, th, thread, j2);
                }
            } catch (Throwable th2) {
                q.b(th2);
            }
        }
    }

    public static void a(final Throwable th) {
        if (th == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a a2 = com.apm.insight.entity.a.a(System.currentTimeMillis(), i.g(), (Thread) null, th);
                        a2.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a3 = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, a2);
                        if (a3 != null) {
                            com.apm.insight.k.d.a().b(a3.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j2) {
        return e.a(j2);
    }

    private static Throwable b(Throwable th, Thread thread) {
        for (int i2 = 0; i2 < l.size(); i2++) {
            try {
                try {
                    l.get(i2).b(th, thread);
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th3) {
            return th3;
        }
    }

    public static boolean b() {
        return i;
    }

    private boolean b(Thread thread, Throwable th) {
        ICrashFilter b = i.b().b();
        if (b == null) {
            return true;
        }
        try {
            return b.onJavaCrashFilter(th, thread);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a("data", (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a2 = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (a2 != null) {
                            com.apm.insight.k.d.a().b(a2.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || r.a(512)) {
            return;
        }
        this.b.uncaughtException(thread, th);
    }

    public static boolean c() {
        Boolean bool = j.get();
        return bool != null && bool.booleanValue();
    }

    private void d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private void e() {
        synchronized (this) {
            this.f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f != 0 && SystemClock.uptimeMillis() - uptimeMillis < WorkRequest.MIN_BACKOFF_MILLIS) {
            SystemClock.sleep(50L);
        }
    }

    private void f() {
        File a2 = o.a(i.g());
        File a3 = o.a();
        if (com.apm.insight.l.i.b(a2) && com.apm.insight.l.i.b(a3)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!com.apm.insight.k.i.a() && SystemClock.uptimeMillis() - uptimeMillis < WorkRequest.MIN_BACKOFF_MILLIS) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private boolean g() {
        return com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1;
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    public void a(String str) {
        this.g.put(str, new Object());
    }

    public void a(Thread thread, Throwable th, boolean z, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> c;
        CrashType crashType;
        if (z) {
            c = com.apm.insight.runtime.o.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            c = com.apm.insight.runtime.o.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : c) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, v.a(th), thread, this.k);
                } else {
                    iCrashCallback.onCrash(crashType, v.a(th), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                q.b(th2);
                aVar.b("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    public void b(c cVar) {
        this.d = cVar;
    }

    public boolean b(String str) {
        return this.g.containsKey(str);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = a(thread, th);
        } while (th != null);
    }
}
