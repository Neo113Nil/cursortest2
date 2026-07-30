package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t62 implements Cloneable {
    public volatile v62 A;
    public final fu1 m;
    public final fy n;
    public final w62 o;
    public final s62 p;
    public final AtomicBoolean q;
    public Object r;
    public zi0 s;
    public v62 t;
    public du u;
    public boolean v;
    public boolean w;
    public boolean x;
    public volatile boolean y;
    public volatile du z;

    public t62(fu1 fu1Var, fy fyVar) {
        fyVar.getClass();
        this.m = fu1Var;
        this.n = fyVar;
        this.o = (w62) fu1Var.n.n;
        fu1Var.q.getClass();
        s62 s62Var = new s62(this);
        s62Var.g(0L);
        this.p = s62Var;
        this.q = new AtomicBoolean();
        this.x = true;
    }

    public static final String a(t62 t62Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(t62Var.y ? "canceled " : BuildConfig.FLAVOR);
        sb.append("call");
        sb.append(" to ");
        sb.append(((kz0) t62Var.n.n).f());
        return sb.toString();
    }

    public final void b(v62 v62Var) {
        byte[] bArr = n33.a;
        if (this.t != null) {
            lh.g("Check failed.");
        } else {
            this.t = v62Var;
            v62Var.p.add(new r62(this, this.r));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = n33.a;
        v62 v62Var = this.t;
        if (v62Var != null) {
            synchronized (v62Var) {
                i = i();
            }
            if (this.t == null) {
                if (i != null) {
                    n33.c(i);
                }
            } else if (i != null) {
                lh.g("Check failed.");
                return null;
            }
        }
        if (this.p.i()) {
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
        return new t62(this.m, this.n);
    }

    public final void d() {
        Socket socket;
        if (this.y) {
            return;
        }
        this.y = true;
        du duVar = this.z;
        if (duVar != null) {
            ((yi0) duVar.d).cancel();
        }
        v62 v62Var = this.A;
        if (v62Var == null || (socket = v62Var.c) == null) {
            return;
        }
        n33.c(socket);
    }

    public final void e(boolean z) {
        du duVar;
        synchronized (this) {
            if (!this.x) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.a;
        }
        if (z && (duVar = this.z) != null) {
            ((yi0) duVar.d).cancel();
            ((t62) duVar.b).g(duVar, true, true, null);
        }
        this.u = null;
    }

    public final w92 f() {
        ArrayList arrayList = new ArrayList();
        vv.o(this.m.o, arrayList);
        arrayList.add(new jp(this.m));
        arrayList.add(new jp(this.m.v));
        arrayList.add(new jr(0));
        arrayList.add(jr.b);
        vv.o(this.m.p, arrayList);
        arrayList.add(new jr(2));
        fy fyVar = this.n;
        fu1 fu1Var = this.m;
        try {
            try {
                w92 f = new sa1(this, arrayList, 0, null, fyVar, fu1Var.H, fu1Var.I, fu1Var.J).f(this.n);
                if (this.y) {
                    n33.b(f);
                    throw new IOException("Canceled");
                }
                h(null);
                return f;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:49:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:25:0x0040, B:7:0x001a), top: B:48:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:49:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:25:0x0040, B:7:0x001a), top: B:48:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException g(du duVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        duVar.getClass();
        if (duVar.equals(this.z)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.v) {
                        }
                        if (z) {
                            this.v = false;
                        }
                        if (z2) {
                            this.w = false;
                        }
                        z5 = this.v;
                        boolean z6 = z5 && !this.w;
                        if (!z5 && !this.w && !this.x) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z2 || !this.w) {
                    z4 = false;
                    Unit unit2 = Unit.a;
                }
                if (z) {
                }
                if (z2) {
                }
                z5 = this.v;
                if (z5) {
                }
                if (!z5) {
                    z3 = true;
                }
                z4 = z3;
                z3 = z6;
                Unit unit22 = Unit.a;
            }
            if (z3) {
                this.z = null;
                v62 v62Var = this.t;
                if (v62Var != null) {
                    synchronized (v62Var) {
                        v62Var.m++;
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
            try {
                z = false;
                if (this.x) {
                    this.x = false;
                    if (!this.v && !this.w) {
                        z = true;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket i() {
        v62 v62Var = this.t;
        v62Var.getClass();
        byte[] bArr = n33.a;
        ArrayList arrayList = v62Var.p;
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
            if (Intrinsics.b(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            lh.g("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.t = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        v62Var.q = System.nanoTime();
        w62 w62Var = this.o;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) w62Var.e;
        nt2 nt2Var = (nt2) w62Var.c;
        byte[] bArr2 = n33.a;
        if (!v62Var.j) {
            nt2Var.c((ty0) w62Var.d, 0L);
            return null;
        }
        v62Var.j = true;
        concurrentLinkedQueue.remove(v62Var);
        if (concurrentLinkedQueue.isEmpty()) {
            nt2Var.a();
        }
        Socket socket = v62Var.d;
        socket.getClass();
        return socket;
    }
}
