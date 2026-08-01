package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xn implements Closeable {
    public static final or E;
    public final Socket A;
    public final go B;
    public final sn C;
    public final LinkedHashSet D;
    public final pn f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final String h;
    public int i;
    public int j;
    public boolean k;
    public final f50 l;
    public final e50 m;
    public final e50 n;
    public final e50 o;
    public final dh p;
    public long q;
    public long r;
    public long s;
    public long t;
    public final or u;
    public or v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        or orVar = new or(5);
        orVar.k(7, 65535);
        orVar.k(5, 16384);
        E = orVar;
    }

    public xn(n1 n1Var) {
        this.f = (pn) n1Var.f;
        String str = (String) n1Var.c;
        if (str == null) {
            zo.O("connectionName");
            throw null;
        }
        this.h = str;
        this.j = 3;
        f50 f50Var = (f50) n1Var.a;
        this.l = f50Var;
        this.m = f50Var.e();
        this.n = f50Var.e();
        this.o = f50Var.e();
        this.p = dh.j;
        or orVar = new or(5);
        orVar.k(7, 16777216);
        this.u = orVar;
        this.v = E;
        this.z = r0.f();
        Socket socket = (Socket) n1Var.b;
        if (socket == null) {
            zo.O("socket");
            throw null;
        }
        this.A = socket;
        ay ayVar = (ay) n1Var.e;
        if (ayVar == null) {
            zo.O("sink");
            throw null;
        }
        this.B = new go(ayVar);
        cy cyVar = (cy) n1Var.d;
        if (cyVar == null) {
            zo.O("source");
            throw null;
        }
        this.C = new sn(this, new ao(cyVar));
        this.D = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m(1, 9, null);
    }

    public final void flush() {
        this.B.flush();
    }

    public final void m(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr = null;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        byte[] bArr = r70.a;
        try {
            p(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.g.isEmpty()) {
                objArr = this.g.values().toArray(new fo[0]);
                this.g.clear();
            }
        }
        fo[] foVarArr = (fo[]) objArr;
        if (foVarArr != null) {
            for (fo foVar : foVarArr) {
                try {
                    foVar.c(i2, iOException);
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

    public final synchronized fo n(int i) {
        return (fo) this.g.get(Integer.valueOf(i));
    }

    public final synchronized fo o(int i) {
        fo foVar;
        foVar = (fo) this.g.remove(Integer.valueOf(i));
        notifyAll();
        return foVar;
    }

    public final void p(int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this.B) {
            synchronized (this) {
                if (this.k) {
                    return;
                }
                this.k = true;
                this.B.p(this.i, i, r70.a);
            }
        }
    }

    public final synchronized void q(long j) {
        long j2 = this.w + j;
        this.w = j2;
        long j3 = j2 - this.x;
        if (j3 >= this.u.f() / 2) {
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
    public final void r(int i, boolean z, u8 u8Var, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.B.n(z, i, u8Var, 0);
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
            this.B.n(z && j == 0, i, u8Var, min);
        }
    }

    public final void s(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.m.c(new rn(this.h + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void t(int i, long j) {
        this.m.c(new wn(this.h + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
