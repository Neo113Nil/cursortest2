package N2;

import T2.C0231f;
import T2.H;

/* loaded from: classes.dex */
public final class u implements T2.D {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3681d;

    /* renamed from: e, reason: collision with root package name */
    public final C0231f f3682e = new C0231f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f3683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f3684g;

    public u(x xVar, boolean z3) {
        this.f3684g = xVar;
        this.f3681d = z3;
    }

    public final void a(boolean z3) {
        long min;
        boolean z4;
        x xVar = this.f3684g;
        synchronized (xVar) {
            xVar.f3703l.h();
            while (xVar.f3696e >= xVar.f3697f && !this.f3681d && !this.f3683f) {
                try {
                    synchronized (xVar) {
                        int i3 = xVar.f3704m;
                        if (i3 != 0) {
                            break;
                        } else {
                            xVar.k();
                        }
                    }
                } finally {
                    xVar.f3703l.k();
                }
            }
            xVar.f3703l.k();
            xVar.b();
            min = Math.min(xVar.f3697f - xVar.f3696e, this.f3682e.f4409e);
            xVar.f3696e += min;
            z4 = z3 && min == this.f3682e.f4409e;
        }
        this.f3684g.f3703l.h();
        try {
            x xVar2 = this.f3684g;
            xVar2.f3693b.h(xVar2.f3692a, z4, this.f3682e, min);
        } finally {
            xVar = this.f3684g;
        }
    }

    @Override // T2.D
    public final H c() {
        return this.f3684g.f3703l;
    }

    @Override // T2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        x xVar = this.f3684g;
        byte[] bArr = H2.b.f2632a;
        synchronized (xVar) {
            if (this.f3683f) {
                return;
            }
            synchronized (xVar) {
                z3 = xVar.f3704m == 0;
            }
            x xVar2 = this.f3684g;
            if (!xVar2.f3701j.f3681d) {
                if (this.f3682e.f4409e > 0) {
                    while (this.f3682e.f4409e > 0) {
                        a(true);
                    }
                } else if (z3) {
                    xVar2.f3693b.h(xVar2.f3692a, true, null, 0L);
                }
            }
            synchronized (this.f3684g) {
                this.f3683f = true;
            }
            this.f3684g.f3693b.flush();
            this.f3684g.a();
        }
    }

    @Override // T2.D, java.io.Flushable
    public final void flush() {
        x xVar = this.f3684g;
        byte[] bArr = H2.b.f2632a;
        synchronized (xVar) {
            xVar.b();
        }
        while (this.f3682e.f4409e > 0) {
            a(false);
            this.f3684g.f3693b.flush();
        }
    }

    @Override // T2.D
    public final void p(C0231f c0231f, long j3) {
        byte[] bArr = H2.b.f2632a;
        C0231f c0231f2 = this.f3682e;
        c0231f2.p(c0231f, j3);
        while (c0231f2.f4409e >= 16384) {
            a(false);
        }
    }
}
