package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class gy implements Cloneable {
    public final uv f;
    public final xz g;
    public final ky h;
    public final fy i;
    public final AtomicBoolean j;
    public Object k;
    public pi l;
    public jy m;
    public ni n;
    public boolean o;
    public boolean p;
    public boolean q;
    public volatile boolean r;
    public volatile ni s;
    public volatile jy t;

    public gy(uv uvVar, xz xzVar) {
        this.f = uvVar;
        this.g = xzVar;
        this.h = (ky) uvVar.g.g;
        uvVar.j.getClass();
        fy fyVar = new fy(this);
        fyVar.g(0L);
        this.i = fyVar;
        this.j = new AtomicBoolean();
        this.q = true;
    }

    public static final String a(gy gyVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(gyVar.r ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(gyVar.g.a.f());
        return sb.toString();
    }

    public final void b(jy jyVar) {
        byte[] bArr = r70.a;
        if (this.m != null) {
            t8.t("Check failed.");
        } else {
            this.m = jyVar;
            jyVar.p.add(new ey(this, this.k));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = r70.a;
        jy jyVar = this.m;
        if (jyVar != null) {
            synchronized (jyVar) {
                i = i();
            }
            if (this.m == null) {
                if (i != null) {
                    r70.c(i);
                }
            } else if (i != null) {
                t8.t("Check failed.");
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
        return new gy(this.f, this.g);
    }

    public final void d() {
        Socket socket;
        if (this.r) {
            return;
        }
        this.r = true;
        ni niVar = this.s;
        if (niVar != null) {
            niVar.c.cancel();
        }
        jy jyVar = this.t;
        if (jyVar == null || (socket = jyVar.c) == null) {
            return;
        }
        r70.c(socket);
    }

    public final void e(boolean z) {
        ni niVar;
        synchronized (this) {
            if (!this.q) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (niVar = this.s) != null) {
            niVar.c.cancel();
            niVar.a.g(niVar, true, true, null);
        }
        this.n = null;
    }

    public final i00 f() {
        ArrayList arrayList = new ArrayList();
        hb.H0(arrayList, this.f.h);
        arrayList.add(new s8(this.f));
        arrayList.add(new s8(this.f.o));
        arrayList.add(new a9(0));
        arrayList.add(a9.b);
        hb.H0(arrayList, this.f.i);
        arrayList.add(new a9(2));
        xz xzVar = this.g;
        uv uvVar = this.f;
        try {
            try {
                i00 b = new ly(this, arrayList, 0, null, xzVar, uvVar.A, uvVar.B, uvVar.C).b(xzVar);
                if (this.r) {
                    r70.b(b);
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
    public final IOException g(ni niVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        niVar.getClass();
        if (niVar.equals(this.s)) {
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
                jy jyVar = this.m;
                if (jyVar != null) {
                    synchronized (jyVar) {
                        jyVar.m++;
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
        jy jyVar = this.m;
        jyVar.getClass();
        byte[] bArr = r70.a;
        ArrayList arrayList = jyVar.p;
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
            if (zo.b(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            t8.t("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        jyVar.q = System.nanoTime();
        ky kyVar = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = kyVar.d;
        e50 e50Var = kyVar.b;
        byte[] bArr2 = r70.a;
        if (!jyVar.j) {
            e50Var.c(kyVar.c, 0L);
            return null;
        }
        jyVar.j = true;
        concurrentLinkedQueue.remove(jyVar);
        if (concurrentLinkedQueue.isEmpty()) {
            e50Var.a();
        }
        Socket socket = jyVar.d;
        socket.getClass();
        return socket;
    }
}
