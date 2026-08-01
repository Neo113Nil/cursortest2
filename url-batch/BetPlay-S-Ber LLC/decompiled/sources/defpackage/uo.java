package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class uo {
    public final int a;
    public final no b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final so i;
    public final ro j;
    public final to k;
    public final to l;
    public int m;
    public IOException n;

    public uo(int i, no noVar, boolean z, boolean z2, nn nnVar) {
        noVar.getClass();
        this.a = i;
        this.b = noVar;
        this.f = noVar.v.b();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new so(this, noVar.u.b(), z2);
        this.j = new ro(this, z);
        this.k = new to(this);
        this.l = new to(this);
        if (nnVar == null) {
            if (f()) {
                return;
            }
            o8.t("remotely-initiated streams should have headers");
            throw null;
        }
        if (f()) {
            o8.t("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(nnVar);
    }

    public final void a() {
        boolean z;
        boolean g;
        byte[] bArr = y70.a;
        synchronized (this) {
            try {
                so soVar = this.i;
                if (!soVar.g && soVar.j) {
                    ro roVar = this.j;
                    if (!roVar.f) {
                        if (roVar.h) {
                        }
                    }
                    z = true;
                    g = g();
                }
                z = false;
                g = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (g) {
                return;
            }
            this.b.o(this.a);
        }
    }

    public final void b() {
        ro roVar = this.j;
        if (roVar.h) {
            o8.x("stream closed");
            return;
        }
        if (roVar.f) {
            o8.x("stream finished");
            return;
        }
        int i = this.m;
        if (i != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            if (i == 0) {
                throw null;
            }
            throw new k40(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            no noVar = this.b;
            noVar.getClass();
            noVar.B.s(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = y70.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.g) {
                if (this.j.f) {
                    return false;
                }
            }
            this.b.o(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        if (d(i, null)) {
            this.b.s(this.a, i);
        }
    }

    public final boolean f() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean g() {
        try {
            if (this.m != 0) {
                return false;
            }
            so soVar = this.i;
            if (!soVar.g) {
                if (soVar.j) {
                }
                return true;
            }
            ro roVar = this.j;
            if (roVar.f || roVar.h) {
                if (this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:8:0x000e, B:10:0x001f, B:11:0x0023, B:19:0x0016), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(nn nnVar, boolean z) {
        boolean g;
        nnVar.getClass();
        byte[] bArr = y70.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                    if (z) {
                        this.i.g = true;
                    }
                    g = g();
                    notifyAll();
                }
                this.h = true;
                this.g.add(nnVar);
                if (z) {
                }
                g = g();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g) {
            return;
        }
        this.b.o(this.a);
    }
}
