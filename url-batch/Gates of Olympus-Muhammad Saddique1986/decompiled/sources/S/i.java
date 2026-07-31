package S;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public n f4216a;

    /* renamed from: b, reason: collision with root package name */
    public int f4217b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4218c;

    /* renamed from: d, reason: collision with root package name */
    public int f4219d;

    public i(int i3, n nVar) {
        int i4;
        int numberOfTrailingZeros;
        this.f4216a = nVar;
        this.f4217b = i3;
        if (i3 != 0) {
            n e3 = e();
            G1.m mVar = p.f4240a;
            int[] iArr = e3.f4236g;
            if (iArr != null) {
                i3 = iArr[0];
            } else {
                long j3 = e3.f4234e;
                int i5 = e3.f4235f;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = e3.f4233d;
                    if (j4 != 0) {
                        i5 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                i3 = numberOfTrailingZeros + i5;
            }
            synchronized (p.f4241b) {
                i4 = p.f4244e.a(i3);
            }
        } else {
            i4 = -1;
        }
        this.f4219d = i4;
    }

    public static void p(i iVar) {
        p.f4240a.u(iVar);
    }

    public final void a() {
        synchronized (p.f4241b) {
            b();
            o();
        }
    }

    public void b() {
        p.f4242c = p.f4242c.c(d());
    }

    public abstract void c();

    public int d() {
        return this.f4217b;
    }

    public n e() {
        return this.f4216a;
    }

    public abstract InterfaceC0424c f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract InterfaceC0424c i();

    public final i j() {
        G1.m mVar = p.f4240a;
        i iVar = (i) mVar.g();
        mVar.u(this);
        return iVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(y yVar);

    public void o() {
        int i3 = this.f4219d;
        if (i3 >= 0) {
            p.u(i3);
            this.f4219d = -1;
        }
    }

    public void q(int i3) {
        this.f4217b = i3;
    }

    public void r(n nVar) {
        this.f4216a = nVar;
    }

    public void s(int i3) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract i t(InterfaceC0424c interfaceC0424c);
}
