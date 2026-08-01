package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jq implements Closeable {
    public static final b50 E;
    public final Socket A;
    public final rq B;
    public final eq C;
    public final LinkedHashSet D;
    public final bq f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final String h;
    public int i;
    public int j;
    public boolean k;
    public final l80 l;
    public final k80 m;
    public final k80 n;
    public final k80 o;
    public final ej p;
    public long q;
    public long r;
    public long s;
    public long t;
    public final b50 u;
    public b50 v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        b50 b50Var = new b50();
        b50Var.b(7, 65535);
        b50Var.b(5, 16384);
        E = b50Var;
    }

    public jq(o1 o1Var) {
        this.f = (bq) o1Var.f;
        String str = (String) o1Var.c;
        if (str == null) {
            kr.g0("connectionName");
            throw null;
        }
        this.h = str;
        this.j = 3;
        l80 l80Var = (l80) o1Var.a;
        this.l = l80Var;
        this.m = l80Var.e();
        this.n = l80Var.e();
        this.o = l80Var.e();
        this.p = ej.n;
        b50 b50Var = new b50();
        b50Var.b(7, 16777216);
        this.u = b50Var;
        this.v = E;
        this.z = r0.a();
        Socket socket = (Socket) o1Var.b;
        if (socket == null) {
            kr.g0("socket");
            throw null;
        }
        this.A = socket;
        d10 d10Var = (d10) o1Var.e;
        if (d10Var == null) {
            kr.g0("sink");
            throw null;
        }
        this.B = new rq(d10Var);
        e10 e10Var = (e10) o1Var.d;
        if (e10Var == null) {
            kr.g0("source");
            throw null;
        }
        this.C = new eq(this, new mq(e10Var));
        this.D = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f(1, 9, null);
    }

    public final void f(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        byte[] bArr = cb0.a;
        try {
            k(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.g.isEmpty()) {
                objArr = this.g.values().toArray(new qq[0]);
                this.g.clear();
            }
        }
        qq[] qqVarArr = (qq[]) objArr;
        if (qqVarArr != null) {
            for (qq qqVar : qqVarArr) {
                try {
                    qqVar.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.B.close();
        } catch (IOException unused3) {
        }
        try {
            this.A.close();
        } catch (IOException unused4) {
        }
        this.m.e();
        this.n.e();
        this.o.e();
    }

    public final void flush() {
        this.B.flush();
    }

    public final synchronized qq g(int i) {
        return (qq) this.g.get(Integer.valueOf(i));
    }

    public final synchronized qq h(int i) {
        qq qqVar;
        qqVar = (qq) this.g.remove(Integer.valueOf(i));
        notifyAll();
        return qqVar;
    }

    public final void k(int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this.B) {
            synchronized (this) {
                if (this.k) {
                    return;
                }
                this.k = true;
                this.B.k(this.i, i, cb0.a);
            }
        }
    }

    public final synchronized void q(long j) {
        long j2 = this.w + j;
        this.w = j2;
        long j3 = j2 - this.x;
        if (j3 >= this.u.a() / 2) {
            t(0, j3);
            this.x += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.B.h);
        r6 = r2;
        r8.y += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i, boolean z, h9 h9Var, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.B.g(z, i, h9Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.y;
                            long j4 = this.z;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.g.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.B.g(z && j == 0, i, h9Var, min);
        }
    }

    public final void s(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.m.c(new dq(this.h + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void t(int i, long j) {
        this.m.c(new iq(this.h + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
