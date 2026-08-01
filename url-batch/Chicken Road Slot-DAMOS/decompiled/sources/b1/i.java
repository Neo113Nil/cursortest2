package b1;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public o f983a;

    /* renamed from: b, reason: collision with root package name */
    public long f984b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f985c;

    /* renamed from: d, reason: collision with root package name */
    public int f986d;

    public i(long j, o oVar) {
        int i3;
        int numberOfTrailingZeros;
        this.f983a = oVar;
        this.f984b = j;
        a1.f fVar = r.f1028a;
        if (j != 0) {
            o d10 = d();
            long j3 = d10.f1021i;
            long[] jArr = d10.f1022r;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j10 = d10.f1020e;
                if (j10 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                } else {
                    long j11 = d10.f1019d;
                    if (j11 != 0) {
                        j3 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                    }
                }
                j = numberOfTrailingZeros + j3;
            }
            synchronized (r.f1030c) {
                i3 = r.f1033f.a(j);
            }
        } else {
            i3 = -1;
        }
        this.f986d = i3;
    }

    public static void q(i iVar) {
        r.f1029b.j(iVar);
    }

    public final void a() {
        synchronized (r.f1030c) {
            b();
            p();
        }
    }

    public void b() {
        r.f1031d = r.f1031d.c(g());
    }

    public abstract void c();

    public o d() {
        return this.f983a;
    }

    public abstract Function1 e();

    public abstract boolean f();

    public long g() {
        return this.f984b;
    }

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final i j() {
        p.e eVar = r.f1029b;
        i iVar = (i) eVar.get();
        eVar.j(this);
        return iVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(f0 f0Var);

    public final void o() {
        int i3 = this.f986d;
        if (i3 >= 0) {
            r.u(i3);
            this.f986d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(o oVar) {
        this.f983a = oVar;
    }

    public void s(long j) {
        this.f984b = j;
    }

    public void t(int i3) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract i u(Function1 function1);
}
