package S;

import D1.C0014b;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public n f3208a;

    /* renamed from: b, reason: collision with root package name */
    public int f3209b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3210c;

    /* renamed from: d, reason: collision with root package name */
    public int f3211d;

    public i(int i3, n nVar) {
        int i4;
        int numberOfTrailingZeros;
        this.f3208a = nVar;
        this.f3209b = i3;
        if (i3 != 0) {
            n e3 = e();
            C0014b c0014b = q.f3234a;
            int[] iArr = e3.f3228g;
            if (iArr != null) {
                i3 = iArr[0];
            } else {
                long j3 = e3.f3226e;
                int i5 = e3.f3227f;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = e3.f3225d;
                    if (j4 != 0) {
                        i5 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                i3 = numberOfTrailingZeros + i5;
            }
            synchronized (q.f3235b) {
                i4 = q.f3238e.a(i3);
            }
        } else {
            i4 = -1;
        }
        this.f3211d = i4;
    }

    public static void p(i iVar) {
        q.f3234a.t(iVar);
    }

    public final void a() {
        synchronized (q.f3235b) {
            b();
            o();
        }
    }

    public void b() {
        q.f3236c = q.f3236c.c(d());
    }

    public abstract void c();

    public int d() {
        return this.f3209b;
    }

    public n e() {
        return this.f3208a;
    }

    public abstract Y1.c f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract Y1.c i();

    public final i j() {
        C0014b c0014b = q.f3234a;
        i iVar = (i) c0014b.g();
        c0014b.t(this);
        return iVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(x xVar);

    public void o() {
        int i3 = this.f3211d;
        if (i3 >= 0) {
            q.u(i3);
            this.f3211d = -1;
        }
    }

    public void q(int i3) {
        this.f3209b = i3;
    }

    public void r(n nVar) {
        this.f3208a = nVar;
    }

    public void s(int i3) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract i t(Y1.c cVar);
}
