package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pt2 {
    public static final pt2 h = new pt2(new ot2(new m33(q40.p(new StringBuilder(), n33.f, " TaskRunner"), true)));
    public static final Logger i;
    public final ot2 a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final r7 g = new r7(9, this);

    static {
        Logger logger = Logger.getLogger(pt2.class.getName());
        logger.getClass();
        i = logger;
    }

    public pt2(ot2 ot2Var) {
        this.a = ot2Var;
    }

    public static final void a(pt2 pt2Var, it2 it2Var) {
        byte[] bArr = n33.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(it2Var.a);
        try {
            long a = it2Var.a();
            synchronized (pt2Var) {
                pt2Var.b(it2Var, a);
                Unit unit = Unit.a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (pt2Var) {
                pt2Var.b(it2Var, -1L);
                Unit unit2 = Unit.a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(it2 it2Var, long j) {
        byte[] bArr = n33.a;
        nt2 nt2Var = it2Var.c;
        nt2Var.getClass();
        if (nt2Var.d != it2Var) {
            lh.g("Check failed.");
            return;
        }
        boolean z = nt2Var.f;
        nt2Var.f = false;
        nt2Var.d = null;
        this.e.remove(nt2Var);
        if (j != -1 && !z && !nt2Var.c) {
            nt2Var.d(it2Var, j, true);
        }
        if (nt2Var.e.isEmpty()) {
            return;
        }
        this.f.add(nt2Var);
    }

    public final it2 c() {
        long j;
        it2 it2Var;
        boolean z;
        byte[] bArr = n33.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            it2 it2Var2 = null;
            while (true) {
                if (i2 >= size) {
                    j = nanoTime;
                    it2Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                it2 it2Var3 = (it2) ((nt2) obj).e.get(0);
                j = nanoTime;
                it2Var = null;
                long max = Math.max(0L, it2Var3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (it2Var2 != null) {
                        z = true;
                        break;
                    }
                    it2Var2 = it2Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (it2Var2 != null) {
                byte[] bArr2 = n33.a;
                it2Var2.d = -1L;
                nt2 nt2Var = it2Var2.c;
                nt2Var.getClass();
                nt2Var.e.remove(it2Var2);
                arrayList.remove(nt2Var);
                nt2Var.d = it2Var2;
                arrayList2.add(nt2Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    r7 r7Var = this.g;
                    r7Var.getClass();
                    ((ThreadPoolExecutor) this.a.n).execute(r7Var);
                }
                return it2Var2;
            }
            if (this.c) {
                if (j2 >= this.d - j) {
                    return it2Var;
                }
                notify();
                return it2Var;
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
                        ((nt2) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        nt2 nt2Var2 = (nt2) arrayList.get(size3);
                        nt2Var2.b();
                        if (nt2Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void d(nt2 nt2Var) {
        nt2Var.getClass();
        byte[] bArr = n33.a;
        if (nt2Var.d == null) {
            boolean isEmpty = nt2Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(nt2Var);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(nt2Var)) {
                    arrayList.add(nt2Var);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        r7 r7Var = this.g;
        r7Var.getClass();
        ((ThreadPoolExecutor) this.a.n).execute(r7Var);
    }

    public final nt2 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new nt2(this, in1.k(i2, "Q"));
    }
}
