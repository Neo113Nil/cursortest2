package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class n70 implements Cloneable {
    public final o40 f;
    public final j90 g;
    public final r70 h;
    public final m70 i;
    public final AtomicBoolean j;
    public Object k;
    public tn l;
    public q70 m;
    public rn n;
    public boolean o;
    public boolean p;
    public boolean q;
    public volatile boolean r;
    public volatile rn s;
    public volatile q70 t;

    public n70(o40 o40Var, j90 j90Var) {
        this.f = o40Var;
        this.g = j90Var;
        this.h = (r70) o40Var.g.g;
        o40Var.j.getClass();
        m70 m70Var = new m70(this);
        m70Var.g(0L);
        this.i = m70Var;
        this.j = new AtomicBoolean();
        this.q = true;
    }

    public static final String a(n70 n70Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(n70Var.r ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((ou) n70Var.g.b).f());
        return sb.toString();
    }

    public final void b(q70 q70Var) {
        byte[] bArr = zk0.a;
        if (this.m != null) {
            s9.u("Check failed.");
        } else {
            this.m = q70Var;
            q70Var.p.add(new l70(this, this.k));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = zk0.a;
        q70 q70Var = this.m;
        if (q70Var != null) {
            synchronized (q70Var) {
                i = i();
            }
            if (this.m == null) {
                if (i != null) {
                    zk0.c(i);
                }
            } else if (i != null) {
                s9.u("Check failed.");
                return null;
            }
        }
        if (this.i.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new n70(this.f, this.g);
    }

    public final void d() {
        Socket socket;
        if (this.r) {
            return;
        }
        this.r = true;
        rn rnVar = this.s;
        if (rnVar != null) {
            rnVar.c.cancel();
        }
        q70 q70Var = this.t;
        if (q70Var == null || (socket = q70Var.c) == null) {
            return;
        }
        zk0.c(socket);
    }

    public final void e(boolean z) {
        rn rnVar;
        synchronized (this) {
            if (!this.q) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (rnVar = this.s) != null) {
            rnVar.c.cancel();
            rnVar.a.g(rnVar, true, true, null);
        }
        this.n = null;
    }

    public final v90 f() {
        ArrayList arrayList = new ArrayList();
        ad.h0(arrayList, this.f.h);
        arrayList.add(new r9(this.f));
        arrayList.add(new r9(this.f.o));
        arrayList.add(new aa(0));
        arrayList.add(aa.b);
        ad.h0(arrayList, this.f.i);
        arrayList.add(new aa(2));
        j90 j90Var = this.g;
        o40 o40Var = this.f;
        try {
            try {
                v90 b = new s70(this, arrayList, 0, null, j90Var, o40Var.A, o40Var.B, o40Var.C).b(j90Var);
                if (this.r) {
                    zk0.b(b);
                    throw new IOException("Canceled");
                }
                h(null);
                return b;
            } catch (IOException e) {
                IOException h = h(e);
                h.getClass();
                throw h;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                h(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:48:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:7:0x001a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:48:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:7:0x001a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException g(rn rnVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        rnVar.getClass();
        if (rnVar.equals(this.s)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.o) {
                        }
                        if (z) {
                            this.o = false;
                        }
                        if (z2) {
                            this.p = false;
                        }
                        z5 = this.o;
                        boolean z6 = z5 && !this.p;
                        if (!z5 && !this.p) {
                            if (!this.q) {
                                z3 = true;
                            }
                        }
                        z4 = z3;
                        z3 = z6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z2 || !this.p) {
                    z4 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                z5 = this.o;
                if (z5) {
                }
                if (!z5) {
                    if (!this.q) {
                    }
                }
                z4 = z3;
                z3 = z6;
            }
            if (z3) {
                this.s = null;
                q70 q70Var = this.m;
                if (q70Var != null) {
                    synchronized (q70Var) {
                        q70Var.m++;
                    }
                }
            }
            if (z4) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.q) {
                this.q = false;
                if (!this.o) {
                    if (!this.p) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket i() {
        q70 q70Var = this.m;
        q70Var.getClass();
        byte[] bArr = zk0.a;
        ArrayList arrayList = q70Var.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (mv.c(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            s9.u("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        q70Var.q = System.nanoTime();
        r70 r70Var = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = r70Var.d;
        jh0 jh0Var = r70Var.b;
        byte[] bArr2 = zk0.a;
        if (!q70Var.j) {
            jh0Var.c(r70Var.c, 0L);
            return null;
        }
        q70Var.j = true;
        concurrentLinkedQueue.remove(q70Var);
        if (concurrentLinkedQueue.isEmpty()) {
            jh0Var.a();
        }
        Socket socket = q70Var.d;
        socket.getClass();
        return socket;
    }
}
