package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vy0 implements Closeable {
    public static final tj2 L;
    public long A;
    public final tj2 B;
    public tj2 C;
    public long D;
    public long E;
    public long F;
    public long G;
    public final Socket H;
    public final dz0 I;
    public final sk J;
    public final LinkedHashSet K;
    public final oy0 m;
    public final LinkedHashMap n = new LinkedHashMap();
    public final String o;
    public int p;
    public int q;
    public boolean r;
    public final pt2 s;
    public final nt2 t;
    public final nt2 u;
    public final nt2 v;
    public final by1 w;
    public long x;
    public long y;
    public long z;

    static {
        tj2 tj2Var = new tj2();
        tj2Var.b(7, 65535);
        tj2Var.b(5, 16384);
        L = tj2Var;
    }

    public vy0(sf sfVar) {
        this.m = (oy0) sfVar.f;
        String str = (String) sfVar.c;
        if (str == null) {
            Intrinsics.f("connectionName");
            throw null;
        }
        this.o = str;
        this.q = 3;
        pt2 pt2Var = (pt2) sfVar.a;
        this.s = pt2Var;
        this.t = pt2Var.e();
        this.u = pt2Var.e();
        this.v = pt2Var.e();
        this.w = by1.p;
        tj2 tj2Var = new tj2();
        tj2Var.b(7, 16777216);
        this.B = tj2Var;
        this.C = L;
        this.G = r0.a();
        Socket socket = (Socket) sfVar.b;
        if (socket == null) {
            Intrinsics.f("socket");
            throw null;
        }
        this.H = socket;
        n62 n62Var = (n62) sfVar.e;
        if (n62Var == null) {
            Intrinsics.f("sink");
            throw null;
        }
        this.I = new dz0(n62Var);
        p62 p62Var = (p62) sfVar.d;
        if (p62Var == null) {
            Intrinsics.f("source");
            throw null;
        }
        this.J = new sk(this, new yy0(p62Var));
        this.K = new LinkedHashSet();
    }

    public final void b(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        byte[] bArr = n33.a;
        try {
            n(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.n.isEmpty()) {
                    objArr = this.n.values().toArray(new cz0[0]);
                    this.n.clear();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        cz0[] cz0VarArr = (cz0[]) objArr;
        if (cz0VarArr != null) {
            for (cz0 cz0Var : cz0VarArr) {
                try {
                    cz0Var.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.I.close();
        } catch (IOException unused3) {
        }
        try {
            this.H.close();
        } catch (IOException unused4) {
        }
        this.t.e();
        this.u.e();
        this.v.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(1, 9, null);
    }

    public final synchronized cz0 f(int i) {
        return (cz0) this.n.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.I.flush();
    }

    public final synchronized cz0 m(int i) {
        cz0 cz0Var;
        cz0Var = (cz0) this.n.remove(Integer.valueOf(i));
        notifyAll();
        return cz0Var;
    }

    public final void n(int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this.I) {
            synchronized (this) {
                if (this.r) {
                    return;
                }
                this.r = true;
                int i2 = this.p;
                Unit unit = Unit.a;
                this.I.n(n33.a, i2, i);
            }
        }
    }

    public final synchronized void o(long j) {
        long j2 = this.D + j;
        this.D = j2;
        long j3 = j2 - this.E;
        if (j3 >= this.B.a() / 2) {
            s(j3, 0);
            this.E += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.I.o);
        r6 = r2;
        r8.F += r6;
        r4 = kotlin.Unit.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i, boolean z, fq fqVar, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.I.f(z, i, fqVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.F;
                            long j4 = this.G;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.n.containsKey(Integer.valueOf(i))) {
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
            this.I.f(z && j == 0, i, fqVar, min);
        }
    }

    public final void q(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.t.c(new qy0(this.o + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void s(long j, int i) {
        this.t.c(new uy0(this.o + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
