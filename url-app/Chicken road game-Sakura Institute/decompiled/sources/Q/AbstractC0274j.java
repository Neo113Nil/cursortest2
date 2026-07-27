package Q;

import B1.C0097d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0274j {

    /* renamed from: a, reason: collision with root package name */
    public o f3853a;

    /* renamed from: b, reason: collision with root package name */
    public int f3854b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3855c;

    /* renamed from: d, reason: collision with root package name */
    public int f3856d;

    public AbstractC0274j(int i2, o oVar) {
        int i4;
        int numberOfTrailingZeros;
        this.f3853a = oVar;
        this.f3854b = i2;
        if (i2 != 0) {
            o e4 = e();
            C0097d c0097d = q.f3877a;
            int[] iArr = e4.f3873j;
            if (iArr != null) {
                i2 = iArr[0];
            } else {
                long j4 = e4.f3871e;
                int i5 = e4.f3872i;
                if (j4 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                } else {
                    long j5 = e4.f3870d;
                    if (j5 != 0) {
                        i5 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j5);
                    }
                }
                i2 = numberOfTrailingZeros + i5;
            }
            synchronized (q.f3878b) {
                i4 = q.f3881e.a(i2);
            }
        } else {
            i4 = -1;
        }
        this.f3856d = i4;
    }

    public static void p(AbstractC0274j abstractC0274j) {
        q.f3877a.B(abstractC0274j);
    }

    public final void a() {
        synchronized (q.f3878b) {
            b();
            o();
            Unit unit = Unit.f7487a;
        }
    }

    public void b() {
        q.f3879c = q.f3879c.h(d());
    }

    public void c() {
        this.f3855c = true;
        synchronized (q.f3878b) {
            int i2 = this.f3856d;
            if (i2 >= 0) {
                q.u(i2);
                this.f3856d = -1;
            }
            Unit unit = Unit.f7487a;
        }
    }

    public int d() {
        return this.f3854b;
    }

    public o e() {
        return this.f3853a;
    }

    public abstract Function1 f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final AbstractC0274j j() {
        C0097d c0097d = q.f3877a;
        AbstractC0274j abstractC0274j = (AbstractC0274j) c0097d.j();
        c0097d.B(this);
        return abstractC0274j;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(D d4);

    public void o() {
        int i2 = this.f3856d;
        if (i2 >= 0) {
            q.u(i2);
            this.f3856d = -1;
        }
    }

    public void q(int i2) {
        this.f3854b = i2;
    }

    public void r(o oVar) {
        this.f3853a = oVar;
    }

    public void s(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC0274j t(Function1 function1);
}
