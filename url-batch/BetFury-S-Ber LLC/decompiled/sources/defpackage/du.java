package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class du implements Closeable {
    public static final cd0 E;
    public final Socket A;
    public final lu B;
    public final xt C;
    public final LinkedHashSet D;
    public final ut f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final String h;
    public int i;
    public int j;
    public boolean k;
    public final kh0 l;
    public final jh0 m;
    public final jh0 n;
    public final jh0 o;
    public final sl p;
    public long q;
    public long r;
    public long s;
    public long t;
    public final cd0 u;
    public cd0 v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        cd0 cd0Var = new cd0();
        cd0Var.b(7, 65535);
        cd0Var.b(5, 16384);
        E = cd0Var;
    }

    public du(z4 z4Var) {
        this.f = (ut) z4Var.f;
        String str = (String) z4Var.c;
        if (str == null) {
            mv.P("connectionName");
            throw null;
        }
        this.h = str;
        this.j = 3;
        kh0 kh0Var = (kh0) z4Var.a;
        this.l = kh0Var;
        this.m = kh0Var.e();
        this.n = kh0Var.e();
        this.o = kh0Var.e();
        this.p = sl.m;
        cd0 cd0Var = new cd0();
        cd0Var.b(7, 16777216);
        this.u = cd0Var;
        this.v = E;
        this.z = r0.a();
        Socket socket = (Socket) z4Var.b;
        if (socket == null) {
            mv.P("socket");
            throw null;
        }
        this.A = socket;
        i70 i70Var = (i70) z4Var.e;
        if (i70Var == null) {
            mv.P("sink");
            throw null;
        }
        this.B = new lu(i70Var);
        j70 j70Var = (j70) z4Var.d;
        if (j70Var == null) {
            mv.P("source");
            throw null;
        }
        this.C = new xt(this, new gu(j70Var));
        this.D = new LinkedHashSet();
    }

    public final void D(kn knVar) {
        knVar.getClass();
        synchronized (this.B) {
            synchronized (this) {
                if (this.k) {
                    return;
                }
                this.k = true;
                this.B.w(this.i, knVar, zk0.a);
            }
        }
    }

    public final synchronized void O(long j) {
        long j2 = this.w + j;
        this.w = j2;
        long j3 = j2 - this.x;
        if (j3 >= this.u.a() / 2) {
            R(0, j3);
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
    public final void P(int i, boolean z, t9 t9Var, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.B.n(z, i, t9Var, 0);
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
            this.B.n(z && j == 0, i, t9Var, min);
        }
    }

    public final void Q(int i, kn knVar) {
        knVar.getClass();
        this.m.c(new bu(this.h + '[' + i + "] writeSynReset", this, i, knVar), 0L);
    }

    public final void R(int i, long j) {
        this.m.c(new cu(this.h + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i(kn.NO_ERROR, kn.CANCEL, null);
    }

    public final void flush() {
        this.B.flush();
    }

    public final void i(kn knVar, kn knVar2, IOException iOException) {
        int i;
        Object[] objArr;
        knVar.getClass();
        knVar2.getClass();
        byte[] bArr = zk0.a;
        try {
            D(knVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.g.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.g.values().toArray(new ku[0]);
                this.g.clear();
            }
        }
        ku[] kuVarArr = (ku[]) objArr;
        if (kuVarArr != null) {
            for (ku kuVar : kuVarArr) {
                try {
                    kuVar.c(knVar2, iOException);
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

    public final void n(IOException iOException) {
        kn knVar = kn.PROTOCOL_ERROR;
        i(knVar, knVar, iOException);
    }

    public final synchronized ku r(int i) {
        return (ku) this.g.get(Integer.valueOf(i));
    }

    public final synchronized ku w(int i) {
        ku kuVar;
        kuVar = (ku) this.g.remove(Integer.valueOf(i));
        notifyAll();
        return kuVar;
    }
}
