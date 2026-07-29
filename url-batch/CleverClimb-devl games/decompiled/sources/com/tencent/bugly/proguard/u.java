package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    private static u f8783b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8784a;

    /* renamed from: d, reason: collision with root package name */
    private final Context f8786d;
    private long f;
    private long g;
    private String k;
    private Map<Integer, Long> e = new HashMap();
    private LinkedBlockingQueue<Runnable> h = new LinkedBlockingQueue<>();
    private LinkedBlockingQueue<Runnable> i = new LinkedBlockingQueue<>();
    private final Object j = new Object();
    private byte[] l = null;
    private long m = 0;
    private byte[] n = null;
    private long o = 0;
    private String p = null;
    private long q = 0;
    private final Object r = new Object();
    private boolean s = false;
    private final Object t = new Object();
    private int u = 0;

    /* renamed from: c, reason: collision with root package name */
    private final p f8785c = p.a();

    static /* synthetic */ boolean a(u uVar, boolean z) {
        uVar.s = false;
        return false;
    }

    static /* synthetic */ int b(u uVar) {
        int i = uVar.u - 1;
        uVar.u = i;
        return i;
    }

    private u(Context context) {
        this.k = null;
        this.f8784a = true;
        this.f8786d = context;
        try {
            Class.forName("android.util.Base64");
        } catch (ClassNotFoundException unused) {
            x.a("[UploadManager] Error: Can not find Base64 class, will not use stronger security way to upload", new Object[0]);
            this.f8784a = false;
        }
        if (this.f8784a) {
            this.k = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDP9x32s5pPtZBXzJBz2GWM/sbTvVO2+RvW0PH01IdaBxc/fB6fbHZocC9T3nl1+J5eAFjIRVuV8vHDky7Qo82Mnh0PVvcZIEQvMMVKU8dsMQopxgsOs2gkSHJwgWdinKNS8CmWobo6pFwPUW11lMv714jAUZRq2GBOqiO2vQI6iwIDAQAB";
        }
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            if (f8783b == null) {
                f8783b = new u(context);
            }
            uVar = f8783b;
        }
        return uVar;
    }

    public static synchronized u a() {
        u uVar;
        synchronized (u.class) {
            uVar = f8783b;
        }
        return uVar;
    }

    public final void a(int i, am amVar, String str, String str2, t tVar, long j, boolean z) {
        try {
            a(new v(this.f8786d, i, amVar.g, com.tencent.bugly.proguard.a.a((Object) amVar), str, str2, tVar, this.f8784a, z), true, true, j);
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public final void a(int i, int i2, byte[] bArr, String str, String str2, t tVar, int i3, int i4, boolean z, Map<String, String> map) {
        try {
            a(new v(this.f8786d, i, i2, bArr, str, str2, tVar, this.f8784a, i3, i4, false, map), z, false, 0L);
        } catch (Throwable th) {
            if (x.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public final void a(int i, am amVar, String str, String str2, t tVar, boolean z) {
        a(i, amVar.g, com.tencent.bugly.proguard.a.a((Object) amVar), str, str2, tVar, 0, 0, z, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z) {
        long j;
        long b2 = z.b();
        int i = z ? 5 : 3;
        List<r> a2 = this.f8785c.a(i);
        if (a2 != null && a2.size() > 0) {
            try {
                r rVar = a2.get(0);
                if (rVar.e >= b2) {
                    j = z.c(rVar.g);
                    try {
                        if (i == 3) {
                            this.f = j;
                        } else {
                            this.g = j;
                        }
                        a2.remove(rVar);
                    } catch (Throwable th) {
                        th = th;
                        x.a(th);
                        if (a2.size() > 0) {
                        }
                        x.c("[UploadManager] Local network consume: %d KB", Long.valueOf(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
                        return j;
                    }
                } else {
                    j = 0;
                }
            } catch (Throwable th2) {
                th = th2;
                j = 0;
            }
            if (a2.size() > 0) {
                this.f8785c.a(a2);
            }
        } else {
            j = z ? this.g : this.f;
        }
        x.c("[UploadManager] Local network consume: %d KB", Long.valueOf(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
        return j;
    }

    protected final synchronized void a(long j, boolean z) {
        int i = z ? 5 : 3;
        r rVar = new r();
        rVar.f8777b = i;
        rVar.e = z.b();
        rVar.f8778c = "";
        rVar.f8779d = "";
        rVar.g = z.c(j);
        this.f8785c.b(i);
        this.f8785c.a(rVar);
        if (z) {
            this.g = j;
        } else {
            this.f = j;
        }
        x.c("[UploadManager] Network total consume: %d KB", Long.valueOf(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
    }

    public final synchronized void a(int i, long j) {
        if (i >= 0) {
            this.e.put(Integer.valueOf(i), Long.valueOf(j));
            r rVar = new r();
            rVar.f8777b = i;
            rVar.e = j;
            rVar.f8778c = "";
            rVar.f8779d = "";
            rVar.g = new byte[0];
            this.f8785c.b(i);
            this.f8785c.a(rVar);
            x.c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i), z.a(j));
            return;
        }
        x.e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i));
    }

    public final synchronized long a(int i) {
        long j = 0;
        try {
            if (i >= 0) {
                Long l = this.e.get(Integer.valueOf(i));
                if (l != null) {
                    return l.longValue();
                }
                List<r> a2 = this.f8785c.a(i);
                if (a2 != null && a2.size() > 0) {
                    if (a2.size() > 1) {
                        for (r rVar : a2) {
                            if (rVar.e > j) {
                                j = rVar.e;
                            }
                        }
                        this.f8785c.b(i);
                    } else {
                        try {
                            j = a2.get(0).e;
                        } catch (Throwable th) {
                            x.a(th);
                        }
                    }
                }
            } else {
                x.e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i));
            }
            return j;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean b(int i) {
        if (com.tencent.bugly.b.f8566c) {
            x.c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - a(i);
        x.c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(currentTimeMillis / 1000), Integer.valueOf(i));
        if (currentTimeMillis >= 30000) {
            return true;
        }
        x.a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    private static boolean c() {
        x.c("[UploadManager] Drop security info of database (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            p a2 = p.a();
            if (a2 == null) {
                x.d("[UploadManager] Failed to get Database", new Object[0]);
                return false;
            }
            return a2.a(555, "security_info", (o) null, true);
        } catch (Throwable th) {
            x.a(th);
            return false;
        }
    }

    private boolean d() {
        x.c("[UploadManager] Record security info to database (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            p a2 = p.a();
            if (a2 == null) {
                x.d("[UploadManager] Failed to get database", new Object[0]);
                return false;
            }
            StringBuilder sb = new StringBuilder();
            if (this.n != null) {
                sb.append(Base64.encodeToString(this.n, 0));
                sb.append("#");
                if (this.o != 0) {
                    sb.append(Long.toString(this.o));
                } else {
                    sb.append("null");
                }
                sb.append("#");
                if (this.p != null) {
                    sb.append(this.p);
                } else {
                    sb.append("null");
                }
                sb.append("#");
                if (this.q != 0) {
                    sb.append(Long.toString(this.q));
                } else {
                    sb.append("null");
                }
                a2.a(555, "security_info", sb.toString().getBytes(), (o) null, true);
                return true;
            }
            x.c("[UploadManager] AES key is null, will not record", new Object[0]);
            return false;
        } catch (Throwable th) {
            x.a(th);
            c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6 A[Catch: Throwable -> 0x00ea, TRY_LEAVE, TryCatch #0 {Throwable -> 0x00ea, blocks: (B:3:0x001e, B:5:0x0024, B:8:0x002c, B:10:0x0035, B:12:0x003d, B:14:0x0054, B:16:0x005c, B:22:0x0070, B:24:0x0078, B:26:0x0080, B:32:0x0094, B:34:0x009a, B:36:0x00a2, B:38:0x00ac, B:40:0x00b2, B:42:0x00bb, B:48:0x00cf, B:51:0x00e6, B:53:0x00d3, B:19:0x0066, B:45:0x00c5, B:29:0x008a), top: B:2:0x001e, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e() {
        boolean z;
        x.c("[UploadManager] Load security info from database (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            p a2 = p.a();
            if (a2 == null) {
                x.d("[UploadManager] Failed to get database", new Object[0]);
                return false;
            }
            Map<String, byte[]> a3 = a2.a(555, (o) null, true);
            if (a3 != null && a3.containsKey("security_info")) {
                String str = new String(a3.get("security_info"));
                String[] split = str.split("#");
                if (split.length == 4) {
                    if (!split[0].isEmpty() && !split[0].equals("null")) {
                        try {
                            this.n = Base64.decode(split[0], 0);
                        } catch (Throwable th) {
                            x.a(th);
                            z = true;
                        }
                    }
                    z = false;
                    if (!z && !split[1].isEmpty() && !split[1].equals("null")) {
                        try {
                            this.o = Long.parseLong(split[1]);
                        } catch (Throwable th2) {
                            x.a(th2);
                            z = true;
                        }
                    }
                    if (!z && !split[2].isEmpty() && !split[2].equals("null")) {
                        this.p = split[2];
                    }
                    if (!z && !split[3].isEmpty() && !split[3].equals("null")) {
                        try {
                            this.q = Long.parseLong(split[3]);
                        } catch (Throwable th3) {
                            x.a(th3);
                        }
                    }
                    if (z) {
                        c();
                    }
                } else {
                    x.a("SecurityInfo = %s, Strings.length = %d", str, Integer.valueOf(split.length));
                }
                z = true;
                if (z) {
                }
            }
            return true;
        } catch (Throwable th4) {
            x.a(th4);
            return false;
        }
    }

    protected final boolean b() {
        if (this.p == null || this.q == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() + this.m;
        if (this.q >= currentTimeMillis) {
            return true;
        }
        x.c("[UploadManager] Session ID expired time from server is: %d(%s), but now is: %d(%s)", Long.valueOf(this.q), new Date(this.q).toString(), Long.valueOf(currentTimeMillis), new Date(currentTimeMillis).toString());
        return false;
    }

    protected final void b(boolean z) {
        synchronized (this.r) {
            x.c("[UploadManager] Clear security context (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            this.n = null;
            this.p = null;
            this.q = 0L;
        }
        if (z) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: all -> 0x0159, TRY_LEAVE, TryCatch #3 {, blocks: (B:9:0x001c, B:12:0x0049, B:13:0x0050, B:19:0x0062, B:23:0x006c, B:26:0x0076, B:29:0x008d, B:31:0x0080, B:36:0x0093, B:39:0x009d, B:42:0x00b4, B:44:0x00a7, B:47:0x00b7, B:93:0x0059, B:95:0x005d), top: B:8:0x001c, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x0159, TRY_LEAVE, TryCatch #3 {, blocks: (B:9:0x001c, B:12:0x0049, B:13:0x0050, B:19:0x0062, B:23:0x006c, B:26:0x0076, B:29:0x008d, B:31:0x0080, B:36:0x0093, B:39:0x009d, B:42:0x00b4, B:44:0x00a7, B:47:0x00b7, B:93:0x0059, B:95:0x005d), top: B:8:0x001c, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(int i) {
        final int i2;
        int i3;
        int i4;
        int i5;
        if (i < 0) {
            x.a("[UploadManager] Number of task to execute should >= 0", new Object[0]);
            return;
        }
        w a2 = w.a();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.j) {
            x.c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            int size = this.h.size();
            int size2 = this.i.size();
            if (size == 0 && size2 == 0) {
                x.c("[UploadManager] There is no upload task in queue.", new Object[0]);
                return;
            }
            if (i != 0) {
                if (i < size) {
                    size = i;
                    i2 = 0;
                } else if (i < size + size2) {
                    i2 = i - size;
                }
                if (a2 != null || !a2.c()) {
                    i2 = 0;
                }
                for (i3 = 0; i3 < size; i3++) {
                    Runnable peek = this.h.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        linkedBlockingQueue.put(peek);
                        this.h.poll();
                    } catch (Throwable th) {
                        x.e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
                    }
                }
                for (i4 = 0; i4 < i2; i4++) {
                    Runnable peek2 = this.i.peek();
                    if (peek2 == null) {
                        break;
                    }
                    try {
                        linkedBlockingQueue2.put(peek2);
                        this.i.poll();
                    } catch (Throwable th2) {
                        x.e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th2.getMessage());
                    }
                }
                if (size > 0) {
                    x.c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                for (i5 = 0; i5 < size; i5++) {
                    final Runnable runnable = (Runnable) linkedBlockingQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    synchronized (this.j) {
                        if (this.u >= 2 && a2 != null) {
                            a2.a(runnable);
                        } else {
                            x.a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                            if (z.a(new Runnable() { // from class: com.tencent.bugly.proguard.u.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    runnable.run();
                                    synchronized (u.this.j) {
                                        u.b(u.this);
                                    }
                                }
                            }, "BUGLY_ASYNC_UPLOAD") != null) {
                                synchronized (this.j) {
                                    this.u++;
                                }
                            } else {
                                x.d("[UploadManager] Failed to start a thread to execute asynchronous upload task, will try again next time.", new Object[0]);
                                a(runnable, true);
                            }
                        }
                    }
                }
                if (i2 > 0) {
                    x.c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                if (a2 == null) {
                    a2.a(new Runnable(this) { // from class: com.tencent.bugly.proguard.u.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable2;
                            for (int i6 = 0; i6 < i2 && (runnable2 = (Runnable) linkedBlockingQueue2.poll()) != null; i6++) {
                                runnable2.run();
                            }
                        }
                    });
                    return;
                }
                return;
            }
            i2 = size2;
            if (a2 != null) {
            }
            i2 = 0;
            while (i3 < size) {
            }
            while (i4 < i2) {
            }
            if (size > 0) {
            }
            while (i5 < size) {
            }
            if (i2 > 0) {
            }
            if (a2 == null) {
            }
        }
    }

    private boolean a(Runnable runnable, boolean z) {
        if (runnable == null) {
            x.a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            x.c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.j) {
                try {
                    if (z) {
                        this.h.put(runnable);
                    } else {
                        this.i.put(runnable);
                    }
                } finally {
                }
            }
            return true;
        } catch (Throwable th) {
            x.e("[UploadManager] Failed to add upload task to queue: %s", th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable, long j) {
        if (runnable == null) {
            x.d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        x.c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread a2 = z.a(runnable, "BUGLY_SYNC_UPLOAD");
        if (a2 == null) {
            x.e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            a(runnable, true);
            return;
        }
        try {
            a2.join(j);
        } catch (Throwable th) {
            x.e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            a(runnable, true);
            c(0);
        }
    }

    private void a(Runnable runnable, boolean z, boolean z2, long j) {
        if (runnable == null) {
            x.d("[UploadManager] Upload task should not be null", new Object[0]);
        }
        x.c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (this.p != null) {
            if (b()) {
                x.c("[UploadManager] Sucessfully got session ID, try to execute upload task now (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                if (z2) {
                    a(runnable, j);
                    return;
                } else {
                    a(runnable, z);
                    c(0);
                    return;
                }
            }
            x.a("[UploadManager] Session ID is expired, drop it (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            b(false);
        }
        synchronized (this.t) {
            if (this.s) {
                a(runnable, z);
                return;
            }
            this.s = true;
            x.c("[UploadManager] Initialize security context now (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            if (z2) {
                a(new a(this.f8786d, runnable, j), 0L);
                return;
            }
            a(runnable, z);
            a aVar = new a(this.f8786d);
            x.a("[UploadManager] Create and start a new thread to execute a task of initializing security context: %s", "BUGLY_ASYNC_UPLOAD");
            if (z.a(aVar, "BUGLY_ASYNC_UPLOAD") == null) {
                x.d("[UploadManager] Failed to start a thread to execute task of initializing security context, try to post it into thread pool.", new Object[0]);
                w a2 = w.a();
                if (a2 != null) {
                    a2.a(aVar);
                    return;
                }
                x.e("[UploadManager] Asynchronous thread pool is unavailable now, try next time.", new Object[0]);
                synchronized (this.t) {
                    this.s = false;
                }
            }
        }
    }

    public final void a(int i, an anVar) {
        if (this.f8784a) {
            boolean z = true;
            if (i == 2) {
                x.c("[UploadManager] Session ID is invalid, will clear security context (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                b(true);
            } else {
                synchronized (this.t) {
                    if (!this.s) {
                        return;
                    }
                    if (anVar != null) {
                        x.c("[UploadManager] Record security context (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        try {
                            Map<String, String> map = anVar.g;
                            if (map != null && map.containsKey("S1") && map.containsKey("S2")) {
                                this.m = anVar.e - System.currentTimeMillis();
                                x.c("[UploadManager] Time lag of server is: %d", Long.valueOf(this.m));
                                this.p = map.get("S1");
                                x.c("[UploadManager] Session ID from server is: %s", this.p);
                                if (this.p.length() > 0) {
                                    try {
                                        this.q = Long.parseLong(map.get("S2"));
                                        x.c("[UploadManager] Session expired time from server is: %d(%s)", Long.valueOf(this.q), new Date(this.q).toString());
                                        if (this.q < 1000) {
                                            x.d("[UploadManager] Session expired time from server is less than 1 second, will set to default value", new Object[0]);
                                            this.q = 259200000L;
                                        }
                                    } catch (NumberFormatException unused) {
                                        x.d("[UploadManager] Session expired time is invalid, will set to default value", new Object[0]);
                                        this.q = 259200000L;
                                    }
                                    if (d()) {
                                        z = false;
                                    } else {
                                        x.c("[UploadManager] Failed to record database", new Object[0]);
                                    }
                                    c(0);
                                } else {
                                    x.c("[UploadManager] Session ID from server is invalid, try next time", new Object[0]);
                                }
                            }
                        } catch (Throwable th) {
                            x.a(th);
                        }
                        if (z) {
                            b(false);
                        }
                    } else {
                        x.c("[UploadManager] Fail to init security context and clear local info (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        b(false);
                    }
                }
            }
            synchronized (this.t) {
                if (this.s) {
                    this.s = false;
                    z.b(this.f8786d, "security_info");
                }
            }
        }
    }

    /* compiled from: BUGLY */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8791a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f8792b;

        /* renamed from: c, reason: collision with root package name */
        private final long f8793c;

        public a(Context context) {
            this.f8791a = context;
            this.f8792b = null;
            this.f8793c = 0L;
        }

        public a(Context context, Runnable runnable, long j) {
            this.f8791a = context;
            this.f8792b = runnable;
            this.f8793c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (z.a(this.f8791a, "security_info", 30000L)) {
                if (!u.this.e()) {
                    x.d("[UploadManager] Failed to load security info from database", new Object[0]);
                    u.this.b(false);
                }
                if (u.this.p != null) {
                    if (u.this.b()) {
                        x.c("[UploadManager] Sucessfully got session ID, try to execute upload tasks now (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                        if (this.f8792b != null) {
                            u.this.a(this.f8792b, this.f8793c);
                        }
                        u.this.c(0);
                        z.b(this.f8791a, "security_info");
                        synchronized (u.this.t) {
                            u.a(u.this, false);
                        }
                        return;
                    }
                    x.a("[UploadManager] Session ID is expired, drop it.", new Object[0]);
                    u.this.b(true);
                }
                byte[] a2 = z.a(128);
                if (a2 != null && (a2.length << 3) == 128) {
                    u.this.n = a2;
                    x.c("[UploadManager] Execute one upload task for requesting session ID (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                    if (this.f8792b != null) {
                        u.this.a(this.f8792b, this.f8793c);
                        return;
                    } else {
                        u.this.c(1);
                        return;
                    }
                }
                x.d("[UploadManager] Failed to create AES key (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                u.this.b(false);
                z.b(this.f8791a, "security_info");
                synchronized (u.this.t) {
                    u.a(u.this, false);
                }
                return;
            }
            x.c("[UploadManager] Sleep %d try to lock security file again (pid=%d | tid=%d)", 5000, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            z.b(5000L);
            if (z.a(this, "BUGLY_ASYNC_UPLOAD") == null) {
                x.d("[UploadManager] Failed to start a thread to execute task of initializing security context, try to post it into thread pool.", new Object[0]);
                w a3 = w.a();
                if (a3 != null) {
                    a3.a(this);
                } else {
                    x.e("[UploadManager] Asynchronous thread pool is unavailable now, try next time.", new Object[0]);
                }
            }
        }
    }

    public final byte[] a(byte[] bArr) {
        if (this.n == null || (this.n.length << 3) != 128) {
            x.d("[UploadManager] AES key is invalid (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return null;
        }
        return z.a(1, bArr, this.n);
    }

    public final byte[] b(byte[] bArr) {
        if (this.n == null || (this.n.length << 3) != 128) {
            x.d("[UploadManager] AES key is invalid (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return null;
        }
        return z.a(2, bArr, this.n);
    }

    public final boolean a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        x.c("[UploadManager] Integrate security to HTTP headers (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (this.p != null) {
            map.put("secureSessionId", this.p);
            return true;
        }
        if (this.n == null || (this.n.length << 3) != 128) {
            x.d("[UploadManager] AES key is invalid", new Object[0]);
            return false;
        }
        if (this.l == null) {
            this.l = Base64.decode(this.k, 0);
            if (this.l == null) {
                x.d("[UploadManager] Failed to decode RSA public key", new Object[0]);
                return false;
            }
        }
        byte[] b2 = z.b(1, this.n, this.l);
        if (b2 == null) {
            x.d("[UploadManager] Failed to encrypt AES key", new Object[0]);
            return false;
        }
        String encodeToString = Base64.encodeToString(b2, 0);
        if (encodeToString == null) {
            x.d("[UploadManager] Failed to encode AES key", new Object[0]);
            return false;
        }
        map.put("raKey", encodeToString);
        return true;
    }
}
