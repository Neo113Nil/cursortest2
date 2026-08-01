package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class no implements Closeable {
    public static final v2 E;
    public final Socket A;
    public final vo B;
    public final io C;
    public final LinkedHashSet D;
    public final fo f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final String h;
    public int i;
    public int j;
    public boolean k;
    public final m50 l;
    public final l50 m;
    public final l50 n;
    public final l50 o;
    public final vg p;
    public long q;
    public long r;
    public long s;
    public long t;
    public final v2 u;
    public v2 v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        v2 v2Var = new v2(3);
        v2Var.d(7, 65535);
        v2Var.d(5, 16384);
        E = v2Var;
    }

    public no(x4 x4Var) {
        this.f = (fo) x4Var.f;
        String str = (String) x4Var.c;
        if (str == null) {
            op.T("connectionName");
            throw null;
        }
        this.h = str;
        this.j = 3;
        m50 m50Var = (m50) x4Var.a;
        this.l = m50Var;
        this.m = m50Var.e();
        this.n = m50Var.e();
        this.o = m50Var.e();
        this.p = vg.j;
        v2 v2Var = new v2(3);
        v2Var.d(7, 16777216);
        this.u = v2Var;
        this.v = E;
        this.z = r0.b();
        Socket socket = (Socket) x4Var.b;
        if (socket == null) {
            op.T("socket");
            throw null;
        }
        this.A = socket;
        qy qyVar = (qy) x4Var.e;
        if (qyVar == null) {
            op.T("sink");
            throw null;
        }
        this.B = new vo(qyVar);
        ry ryVar = (ry) x4Var.d;
        if (ryVar == null) {
            op.T("source");
            throw null;
        }
        this.C = new io(this, new qo(ryVar));
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
        byte[] bArr = y70.a;
        try {
            p(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.g.isEmpty()) {
                objArr = this.g.values().toArray(new uo[0]);
                this.g.clear();
            }
        }
        uo[] uoVarArr = (uo[]) objArr;
        if (uoVarArr != null) {
            for (uo uoVar : uoVarArr) {
                try {
                    uoVar.c(i2, iOException);
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

    public final synchronized uo n(int i) {
        return (uo) this.g.get(Integer.valueOf(i));
    }

    public final synchronized uo o(int i) {
        uo uoVar;
        uoVar = (uo) this.g.remove(Integer.valueOf(i));
        notifyAll();
        return uoVar;
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
                this.B.p(this.i, i, y70.a);
            }
        }
    }

    public final synchronized void q(long j) {
        long j2 = this.w + j;
        this.w = j2;
        long j3 = j2 - this.x;
        if (j3 >= this.u.b() / 2) {
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
    public final void r(int i, boolean z, p8 p8Var, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.B.n(z, i, p8Var, 0);
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
            this.B.n(z && j == 0, i, p8Var, min);
        }
    }

    public final void s(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.m.c(new ho(this.h + '[' + i + "] writeSynReset", this, i, i2, 2), 0L);
    }

    public final void t(int i, long j) {
        this.m.c(new mo(this.h + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
