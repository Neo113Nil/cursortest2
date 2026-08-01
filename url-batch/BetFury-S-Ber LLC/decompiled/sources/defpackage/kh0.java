package defpackage;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kh0 {
    public static final kh0 h;
    public static final Logger i;
    public final kz a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final v7 g = new v7(10, this);

    static {
        yk0 yk0Var = new yk0(r7.d(new StringBuilder(), zk0.g, " TaskRunner"), true);
        kz kzVar = new kz();
        kzVar.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), yk0Var);
        h = new kh0(kzVar);
        Logger logger = Logger.getLogger(kh0.class.getName());
        logger.getClass();
        i = logger;
    }

    public kh0(kz kzVar) {
        this.a = kzVar;
    }

    public static final void a(kh0 kh0Var, gh0 gh0Var) {
        byte[] bArr = zk0.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(gh0Var.a);
        try {
            long a = gh0Var.a();
            synchronized (kh0Var) {
                kh0Var.b(gh0Var, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (kh0Var) {
                kh0Var.b(gh0Var, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(gh0 gh0Var, long j) {
        byte[] bArr = zk0.a;
        jh0 jh0Var = gh0Var.c;
        jh0Var.getClass();
        if (jh0Var.d != gh0Var) {
            s9.u("Check failed.");
            return;
        }
        boolean z = jh0Var.f;
        jh0Var.f = false;
        jh0Var.d = null;
        this.e.remove(jh0Var);
        if (j != -1 && !z && !jh0Var.c) {
            jh0Var.d(gh0Var, j, true);
        }
        if (jh0Var.e.isEmpty()) {
            return;
        }
        this.f.add(jh0Var);
    }

    public final gh0 c() {
        long j;
        gh0 gh0Var;
        boolean z;
        byte[] bArr = zk0.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            gh0 gh0Var2 = null;
            while (true) {
                if (i2 >= size) {
                    j = nanoTime;
                    gh0Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                gh0 gh0Var3 = (gh0) ((jh0) obj).e.get(0);
                j = nanoTime;
                gh0Var = null;
                long max = Math.max(0L, gh0Var3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (gh0Var2 != null) {
                        z = true;
                        break;
                    }
                    gh0Var2 = gh0Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (gh0Var2 != null) {
                byte[] bArr2 = zk0.a;
                gh0Var2.d = -1L;
                jh0 jh0Var = gh0Var2.c;
                jh0Var.getClass();
                jh0Var.e.remove(gh0Var2);
                arrayList.remove(jh0Var);
                jh0Var.d = gh0Var2;
                arrayList2.add(jh0Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    v7 v7Var = this.g;
                    v7Var.getClass();
                    ((ThreadPoolExecutor) this.a.f).execute(v7Var);
                }
                return gh0Var2;
            }
            if (this.c) {
                if (j2 >= this.d - j) {
                    return gh0Var;
                }
                notify();
                return gh0Var;
            }
            this.c = true;
            this.d = j + j2;
            try {
                try {
                    long j3 = j2 / 1000000;
                    long j4 = j2 - (1000000 * j3);
                    if (j3 > 0 || j2 > 0) {
                        wait(j3, (int) j4);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((jh0) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        jh0 jh0Var2 = (jh0) arrayList.get(size3);
                        jh0Var2.b();
                        if (jh0Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void d(jh0 jh0Var) {
        jh0Var.getClass();
        byte[] bArr = zk0.a;
        if (jh0Var.d == null) {
            boolean isEmpty = jh0Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(jh0Var);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(jh0Var)) {
                    arrayList.add(jh0Var);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        v7 v7Var = this.g;
        v7Var.getClass();
        ((ThreadPoolExecutor) this.a.f).execute(v7Var);
    }

    public final jh0 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new jh0(this, r7.b("Q", i2));
    }
}
