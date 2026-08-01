package defpackage;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class f50 {
    public static final f50 h;
    public static final Logger i;
    public final mr a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final z6 g = new z6(9, this);

    static {
        q70 q70Var = new q70(r70.g + " TaskRunner", true);
        mr mrVar = new mr();
        mrVar.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), q70Var);
        h = new f50(mrVar);
        Logger logger = Logger.getLogger(f50.class.getName());
        logger.getClass();
        i = logger;
    }

    public f50(mr mrVar) {
        this.a = mrVar;
    }

    public static final void a(f50 f50Var, d50 d50Var) {
        byte[] bArr = r70.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(d50Var.a);
        try {
            long a = d50Var.a();
            synchronized (f50Var) {
                f50Var.b(d50Var, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (f50Var) {
                f50Var.b(d50Var, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(d50 d50Var, long j) {
        byte[] bArr = r70.a;
        e50 e50Var = d50Var.c;
        e50Var.getClass();
        if (e50Var.d != d50Var) {
            t8.t("Check failed.");
            return;
        }
        boolean z = e50Var.f;
        e50Var.f = false;
        e50Var.d = null;
        this.e.remove(e50Var);
        if (j != -1 && !z && !e50Var.c) {
            e50Var.d(d50Var, j, true);
        }
        if (e50Var.e.isEmpty()) {
            return;
        }
        this.f.add(e50Var);
    }

    public final d50 c() {
        long j;
        d50 d50Var;
        boolean z;
        byte[] bArr = r70.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            d50 d50Var2 = null;
            while (true) {
                if (i2 >= size) {
                    j = nanoTime;
                    d50Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                d50 d50Var3 = (d50) ((e50) obj).e.get(0);
                j = nanoTime;
                d50Var = null;
                long max = Math.max(0L, d50Var3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (d50Var2 != null) {
                        z = true;
                        break;
                    }
                    d50Var2 = d50Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (d50Var2 != null) {
                byte[] bArr2 = r70.a;
                d50Var2.d = -1L;
                e50 e50Var = d50Var2.c;
                e50Var.getClass();
                e50Var.e.remove(d50Var2);
                arrayList.remove(e50Var);
                e50Var.d = d50Var2;
                arrayList2.add(e50Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    z6 z6Var = this.g;
                    z6Var.getClass();
                    ((ThreadPoolExecutor) this.a.f).execute(z6Var);
                }
                return d50Var2;
            }
            if (this.c) {
                if (j2 >= this.d - j) {
                    return d50Var;
                }
                notify();
                return d50Var;
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
                        ((e50) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        e50 e50Var2 = (e50) arrayList.get(size3);
                        e50Var2.b();
                        if (e50Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void d(e50 e50Var) {
        e50Var.getClass();
        byte[] bArr = r70.a;
        if (e50Var.d == null) {
            boolean isEmpty = e50Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(e50Var);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(e50Var)) {
                    arrayList.add(e50Var);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        z6 z6Var = this.g;
        z6Var.getClass();
        ((ThreadPoolExecutor) this.a.f).execute(z6Var);
    }

    public final e50 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new e50(this, d30.e("Q", i2));
    }
}
