package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vk0 implements pn2 {
    public final d71 m;
    public long n;
    public boolean o;

    public vk0(d71 d71Var, long j) {
        this.m = d71Var;
        this.n = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d71 d71Var = this.m;
        if (this.o) {
            return;
        }
        this.o = true;
        ReentrantLock reentrantLock = d71Var.o;
        reentrantLock.lock();
        try {
            int i = d71Var.n - 1;
            d71Var.n = i;
            if (i == 0 && d71Var.m) {
                Unit unit = Unit.a;
                synchronized (d71Var) {
                    d71Var.p.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return rx2.d;
    }

    @Override // defpackage.pn2
    public final long h(long j, fq fqVar) {
        long j2;
        long j3;
        int i;
        fqVar.getClass();
        if (this.o) {
            lh.g("closed");
            return 0L;
        }
        d71 d71Var = this.m;
        long j4 = this.n;
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            ug2 B = fqVar.B(1);
            byte[] bArr = B.a;
            int i2 = B.c;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (d71Var) {
                bArr.getClass();
                d71Var.p.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = d71Var.p.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (B.b == B.c) {
                    fqVar.m = B.a();
                    xg2.a(B);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                B.c += i;
                long j7 = i;
                j6 += j7;
                fqVar.n += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.n += j3;
        }
        return j3;
    }
}
