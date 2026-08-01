package defpackage;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class m50 {
    public static final m50 h;
    public static final Logger i;
    public final tx a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final n7 g = new n7(10, this);

    static {
        x70 x70Var = new x70(y70.g + " TaskRunner", true);
        tx txVar = new tx();
        txVar.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), x70Var);
        h = new m50(txVar);
        Logger logger = Logger.getLogger(m50.class.getName());
        logger.getClass();
        i = logger;
    }

    public m50(tx txVar) {
        this.a = txVar;
    }

    public static final void a(m50 m50Var, k50 k50Var) {
        byte[] bArr = y70.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(k50Var.a);
        try {
            long a = k50Var.a();
            synchronized (m50Var) {
                m50Var.b(k50Var, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (m50Var) {
                m50Var.b(k50Var, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(k50 k50Var, long j) {
        byte[] bArr = y70.a;
        l50 l50Var = k50Var.c;
        l50Var.getClass();
        if (l50Var.d != k50Var) {
            o8.t("Check failed.");
            return;
        }
        boolean z = l50Var.f;
        l50Var.f = false;
        l50Var.d = null;
        this.e.remove(l50Var);
        if (j != -1 && !z && !l50Var.c) {
            l50Var.d(k50Var, j, true);
        }
        if (l50Var.e.isEmpty()) {
            return;
        }
        this.f.add(l50Var);
    }

    public final k50 c() {
        long j;
        k50 k50Var;
        boolean z;
        byte[] bArr = y70.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            k50 k50Var2 = null;
            while (true) {
                if (i2 >= size) {
                    j = nanoTime;
                    k50Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                k50 k50Var3 = (k50) ((l50) obj).e.get(0);
                j = nanoTime;
                k50Var = null;
                long max = Math.max(0L, k50Var3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (k50Var2 != null) {
                        z = true;
                        break;
                    }
                    k50Var2 = k50Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (k50Var2 != null) {
                byte[] bArr2 = y70.a;
                k50Var2.d = -1L;
                l50 l50Var = k50Var2.c;
                l50Var.getClass();
                l50Var.e.remove(k50Var2);
                arrayList.remove(l50Var);
                l50Var.d = k50Var2;
                arrayList2.add(l50Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    n7 n7Var = this.g;
                    n7Var.getClass();
                    ((ThreadPoolExecutor) this.a.f).execute(n7Var);
                }
                return k50Var2;
            }
            if (this.c) {
                if (j2 >= this.d - j) {
                    return k50Var;
                }
                notify();
                return k50Var;
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
                        ((l50) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        l50 l50Var2 = (l50) arrayList.get(size3);
                        l50Var2.b();
                        if (l50Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void d(l50 l50Var) {
        l50Var.getClass();
        byte[] bArr = y70.a;
        if (l50Var.d == null) {
            boolean isEmpty = l50Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(l50Var);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(l50Var)) {
                    arrayList.add(l50Var);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        n7 n7Var = this.g;
        n7Var.getClass();
        ((ThreadPoolExecutor) this.a.f).execute(n7Var);
    }

    public final l50 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new l50(this, o30.e("Q", i2));
    }
}
