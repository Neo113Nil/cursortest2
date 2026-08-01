package defpackage;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class l80 {
    public static final l80 h;
    public static final Logger i;
    public final pw a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final j7 g = new j7(10, this);

    static {
        bb0 bb0Var = new bb0(cb0.g + " TaskRunner", true);
        pw pwVar = new pw();
        pwVar.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bb0Var);
        h = new l80(pwVar);
        Logger logger = Logger.getLogger(l80.class.getName());
        logger.getClass();
        i = logger;
    }

    public l80(pw pwVar) {
        this.a = pwVar;
    }

    public static final void a(l80 l80Var, h80 h80Var) {
        byte[] bArr = cb0.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(h80Var.a);
        try {
            long a = h80Var.a();
            synchronized (l80Var) {
                l80Var.b(h80Var, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (l80Var) {
                l80Var.b(h80Var, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(h80 h80Var, long j) {
        byte[] bArr = cb0.a;
        k80 k80Var = h80Var.c;
        k80Var.getClass();
        if (k80Var.d != h80Var) {
            g9.s("Check failed.");
            return;
        }
        boolean z = k80Var.f;
        k80Var.f = false;
        k80Var.d = null;
        this.e.remove(k80Var);
        if (j != -1 && !z && !k80Var.c) {
            k80Var.d(h80Var, j, true);
        }
        if (k80Var.e.isEmpty()) {
            return;
        }
        this.f.add(k80Var);
    }

    public final h80 c() {
        long j;
        h80 h80Var;
        boolean z;
        byte[] bArr = cb0.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            h80 h80Var2 = null;
            while (true) {
                if (i2 >= size) {
                    j = nanoTime;
                    h80Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                h80 h80Var3 = (h80) ((k80) obj).e.get(0);
                j = nanoTime;
                h80Var = null;
                long max = Math.max(0L, h80Var3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (h80Var2 != null) {
                        z = true;
                        break;
                    }
                    h80Var2 = h80Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (h80Var2 != null) {
                byte[] bArr2 = cb0.a;
                h80Var2.d = -1L;
                k80 k80Var = h80Var2.c;
                k80Var.getClass();
                k80Var.e.remove(h80Var2);
                arrayList.remove(k80Var);
                k80Var.d = h80Var2;
                arrayList2.add(k80Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    j7 j7Var = this.g;
                    j7Var.getClass();
                    ((ThreadPoolExecutor) this.a.f).execute(j7Var);
                }
                return h80Var2;
            }
            if (this.c) {
                if (j2 >= this.d - j) {
                    return h80Var;
                }
                notify();
                return h80Var;
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
                        ((k80) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        k80 k80Var2 = (k80) arrayList.get(size3);
                        k80Var2.b();
                        if (k80Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void d(k80 k80Var) {
        k80Var.getClass();
        byte[] bArr = cb0.a;
        if (k80Var.d == null) {
            boolean isEmpty = k80Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(k80Var);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(k80Var)) {
                    arrayList.add(k80Var);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        j7 j7Var = this.g;
        j7Var.getClass();
        ((ThreadPoolExecutor) this.a.f).execute(j7Var);
    }

    public final k80 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new k80(this, f60.e("Q", i2));
    }
}
