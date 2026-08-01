package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class vy implements Cloneable {
    public final bw f;
    public final pp g;
    public final zy h;
    public final uy i;
    public final AtomicBoolean j;
    public Object k;
    public ii l;
    public yy m;
    public gi n;
    public boolean o;
    public boolean p;
    public boolean q;
    public volatile boolean r;
    public volatile gi s;
    public volatile yy t;

    public vy(bw bwVar, pp ppVar) {
        this.f = bwVar;
        this.g = ppVar;
        this.h = (zy) bwVar.g.g;
        bwVar.j.getClass();
        uy uyVar = new uy(this);
        uyVar.g(0L);
        this.i = uyVar;
        this.j = new AtomicBoolean();
        this.q = true;
    }

    public static final String a(vy vyVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(vyVar.r ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((yo) vyVar.g.b).f());
        return sb.toString();
    }

    public final void b(yy yyVar) {
        byte[] bArr = y70.a;
        if (this.m != null) {
            o8.t("Check failed.");
        } else {
            this.m = yyVar;
            yyVar.p.add(new ty(this, this.k));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket i;
        byte[] bArr = y70.a;
        yy yyVar = this.m;
        if (yyVar != null) {
            synchronized (yyVar) {
                i = i();
            }
            if (this.m == null) {
                if (i != null) {
                    y70.c(i);
                }
            } else if (i != null) {
                o8.t("Check failed.");
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
        return new vy(this.f, this.g);
    }

    public final void d() {
        Socket socket;
        if (this.r) {
            return;
        }
        this.r = true;
        gi giVar = this.s;
        if (giVar != null) {
            giVar.c.cancel();
        }
        yy yyVar = this.t;
        if (yyVar == null || (socket = yyVar.c) == null) {
            return;
        }
        y70.c(socket);
    }

    public final void e(boolean z) {
        gi giVar;
        synchronized (this) {
            if (!this.q) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (giVar = this.s) != null) {
            giVar.c.cancel();
            giVar.a.g(giVar, true, true, null);
        }
        this.n = null;
    }

    public final y00 f() {
        ArrayList arrayList = new ArrayList();
        jb.c0(arrayList, this.f.h);
        arrayList.add(new n8(this.f));
        arrayList.add(new n8(this.f.o));
        arrayList.add(new v8(0));
        arrayList.add(v8.b);
        jb.c0(arrayList, this.f.i);
        arrayList.add(new v8(2));
        pp ppVar = this.g;
        bw bwVar = this.f;
        try {
            try {
                y00 b = new az(this, arrayList, 0, null, ppVar, bwVar.A, bwVar.B, bwVar.C).b(ppVar);
                if (this.r) {
                    y70.b(b);
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
    public final IOException g(gi giVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        giVar.getClass();
        if (giVar.equals(this.s)) {
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
                yy yyVar = this.m;
                if (yyVar != null) {
                    synchronized (yyVar) {
                        yyVar.m++;
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
        yy yyVar = this.m;
        yyVar.getClass();
        byte[] bArr = y70.a;
        ArrayList arrayList = yyVar.p;
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
            if (op.d(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            o8.t("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        yyVar.q = System.nanoTime();
        zy zyVar = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = zyVar.d;
        l50 l50Var = zyVar.b;
        byte[] bArr2 = y70.a;
        if (!yyVar.j) {
            l50Var.c(zyVar.c, 0L);
            return null;
        }
        yyVar.j = true;
        concurrentLinkedQueue.remove(yyVar);
        if (concurrentLinkedQueue.isEmpty()) {
            l50Var.a();
        }
        Socket socket = yyVar.d;
        socket.getClass();
        return socket;
    }
}
