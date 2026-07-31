package u2;

import java.util.Arrays;
import s2.EnumC0967a;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1150b {

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1152d[] f9677d;

    /* renamed from: e, reason: collision with root package name */
    public int f9678e;

    /* renamed from: f, reason: collision with root package name */
    public int f9679f;

    /* renamed from: g, reason: collision with root package name */
    public C1147E f9680g;

    public final AbstractC1152d f() {
        AbstractC1152d abstractC1152d;
        C1147E c1147e;
        synchronized (this) {
            try {
                AbstractC1152d[] abstractC1152dArr = this.f9677d;
                if (abstractC1152dArr == null) {
                    abstractC1152dArr = h();
                    this.f9677d = abstractC1152dArr;
                } else if (this.f9678e >= abstractC1152dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC1152dArr, abstractC1152dArr.length * 2);
                    f2.j.e(copyOf, "copyOf(...)");
                    this.f9677d = (AbstractC1152d[]) copyOf;
                    abstractC1152dArr = (AbstractC1152d[]) copyOf;
                }
                int i3 = this.f9679f;
                do {
                    abstractC1152d = abstractC1152dArr[i3];
                    if (abstractC1152d == null) {
                        abstractC1152d = g();
                        abstractC1152dArr[i3] = abstractC1152d;
                    }
                    i3++;
                    if (i3 >= abstractC1152dArr.length) {
                        i3 = 0;
                    }
                } while (!abstractC1152d.a(this));
                this.f9679f = i3;
                this.f9678e++;
                c1147e = this.f9680g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1147e != null) {
            c1147e.x(1);
        }
        return abstractC1152d;
    }

    public abstract AbstractC1152d g();

    public abstract AbstractC1152d[] h();

    public final void i(AbstractC1152d abstractC1152d) {
        C1147E c1147e;
        int i3;
        V1.d[] b3;
        synchronized (this) {
            try {
                int i4 = this.f9678e - 1;
                this.f9678e = i4;
                c1147e = this.f9680g;
                if (i4 == 0) {
                    this.f9679f = 0;
                }
                f2.j.d(abstractC1152d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b3 = abstractC1152d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (V1.d dVar : b3) {
            if (dVar != null) {
                dVar.u(R1.y.f4171a);
            }
        }
        if (c1147e != null) {
            c1147e.x(-1);
        }
    }

    public final C1147E j() {
        C1147E c1147e;
        synchronized (this) {
            c1147e = this.f9680g;
            if (c1147e == null) {
                int i3 = this.f9678e;
                c1147e = new C1147E(1, Integer.MAX_VALUE, EnumC0967a.f8360e);
                c1147e.c(Integer.valueOf(i3));
                this.f9680g = c1147e;
            }
        }
        return c1147e;
    }
}
