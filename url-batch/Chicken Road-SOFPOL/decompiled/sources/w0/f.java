package w0;

import a0.g1;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public k f7516a;

    /* renamed from: b, reason: collision with root package name */
    public long f7517b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7518c;

    /* renamed from: d, reason: collision with root package name */
    public int f7519d;

    public f(long j7, k kVar) {
        int i;
        int numberOfTrailingZeros;
        this.f7516a = kVar;
        this.f7517b = j7;
        s1 s1Var = m.f7535a;
        if (j7 != 0) {
            k d8 = d();
            long j8 = d8.f7530f;
            long[] jArr = d8.f7531g;
            if (jArr != null) {
                j7 = jArr[0];
            } else {
                long j9 = d8.f7529e;
                if (j9 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j9);
                } else {
                    long j10 = d8.f7528d;
                    if (j10 != 0) {
                        j8 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                    }
                }
                j7 = numberOfTrailingZeros + j8;
            }
            synchronized (m.f7537c) {
                i = m.f7540f.a(j7);
            }
        } else {
            i = -1;
        }
        this.f7519d = i;
    }

    public static void q(f fVar) {
        m.f7536b.I(fVar);
    }

    public final void a() {
        synchronized (m.f7537c) {
            b();
            p();
        }
    }

    public void b() {
        m.f7538d = m.f7538d.b(g());
    }

    public abstract void c();

    public k d() {
        return this.f7516a;
    }

    public abstract p6.c e();

    public abstract boolean f();

    public long g() {
        return this.f7517b;
    }

    public int h() {
        return 0;
    }

    public abstract p6.c i();

    public final f j() {
        g1 g1Var = m.f7536b;
        f fVar = (f) g1Var.l();
        g1Var.I(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(u uVar);

    public final void o() {
        int i = this.f7519d;
        if (i >= 0) {
            m.u(i);
            this.f7519d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(k kVar) {
        this.f7516a = kVar;
    }

    public void s(long j7) {
        this.f7517b = j7;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(p6.c cVar);
}
