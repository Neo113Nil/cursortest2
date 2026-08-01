package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i10 implements Cloneable {
    public final xy f;
    public final b30 g;
    public final m10 h;
    public final h10 i;
    public final AtomicBoolean j;
    public Object k;
    public wk l;
    public l10 m;
    public uk n;
    public boolean o;
    public boolean p;
    public boolean q;
    public volatile boolean r;
    public volatile uk s;
    public volatile l10 t;

    public i10(xy xyVar, b30 b30Var) {
        this.f = xyVar;
        this.g = b30Var;
        this.h = (m10) xyVar.g.g;
        xyVar.j.getClass();
        h10 h10Var = new h10(this);
        h10Var.g(0L);
        this.i = h10Var;
        this.j = new AtomicBoolean();
        this.q = true;
    }

    public static final String a(i10 i10Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(i10Var.r ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(i10Var.g.a.f());
        return sb.toString();
    }

    public final void b(l10 l10Var) {
        byte[] bArr = cb0.a;
        if (this.m != null) {
            g9.s("Check failed.");
        } else {
            this.m = l10Var;
            l10Var.p.add(new g10(this, this.k));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = cb0.a;
        l10 l10Var = this.m;
        if (l10Var != null) {
            synchronized (l10Var) {
                i = i();
            }
            if (this.m == null) {
                if (i != null) {
                    cb0.c(i);
                }
            } else if (i != null) {
                g9.s("Check failed.");
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
        return new i10(this.f, this.g);
    }

    public final void d() {
        Socket socket;
        if (this.r) {
            return;
        }
        this.r = true;
        uk ukVar = this.s;
        if (ukVar != null) {
            ukVar.c.cancel();
        }
        l10 l10Var = this.t;
        if (l10Var == null || (socket = l10Var.c) == null) {
            return;
        }
        cb0.c(socket);
    }

    public final void e(boolean z) {
        uk ukVar;
        synchronized (this) {
            if (!this.q) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (ukVar = this.s) != null) {
            ukVar.c.cancel();
            ukVar.a.g(ukVar, true, true, null);
        }
        this.n = null;
    }

    public final n30 f() {
        ArrayList arrayList = new ArrayList();
        cc.l0(arrayList, this.f.h);
        arrayList.add(new f9(this.f));
        arrayList.add(new f9(this.f.o));
        arrayList.add(new n9(0));
        arrayList.add(n9.b);
        cc.l0(arrayList, this.f.i);
        arrayList.add(new n9(2));
        b30 b30Var = this.g;
        xy xyVar = this.f;
        try {
            try {
                n30 b = new n10(this, arrayList, 0, null, b30Var, xyVar.A, xyVar.B, xyVar.C).b(b30Var);
                if (this.r) {
                    cb0.b(b);
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
    public final IOException g(uk ukVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        ukVar.getClass();
        if (ukVar.equals(this.s)) {
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
                l10 l10Var = this.m;
                if (l10Var != null) {
                    synchronized (l10Var) {
                        l10Var.m++;
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
        l10 l10Var = this.m;
        l10Var.getClass();
        byte[] bArr = cb0.a;
        ArrayList arrayList = l10Var.p;
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
            if (kr.b(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            g9.s("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        l10Var.q = System.nanoTime();
        m10 m10Var = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = m10Var.d;
        k80 k80Var = m10Var.b;
        byte[] bArr2 = cb0.a;
        if (!l10Var.j) {
            k80Var.c(m10Var.c, 0L);
            return null;
        }
        l10Var.j = true;
        concurrentLinkedQueue.remove(l10Var);
        if (concurrentLinkedQueue.isEmpty()) {
            k80Var.a();
        }
        Socket socket = l10Var.d;
        socket.getClass();
        return socket;
    }
}
