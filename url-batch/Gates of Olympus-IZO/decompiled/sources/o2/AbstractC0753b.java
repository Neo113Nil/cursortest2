package o2;

import java.util.Arrays;
import m2.EnumC0626a;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0753b {

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0755d[] f6694d;

    /* renamed from: e, reason: collision with root package name */
    public int f6695e;

    /* renamed from: f, reason: collision with root package name */
    public int f6696f;

    /* renamed from: g, reason: collision with root package name */
    public y f6697g;

    public final AbstractC0755d d() {
        AbstractC0755d abstractC0755d;
        y yVar;
        synchronized (this) {
            try {
                AbstractC0755d[] abstractC0755dArr = this.f6694d;
                if (abstractC0755dArr == null) {
                    abstractC0755dArr = f();
                    this.f6694d = abstractC0755dArr;
                } else if (this.f6695e >= abstractC0755dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC0755dArr, abstractC0755dArr.length * 2);
                    Z1.i.e(copyOf, "copyOf(...)");
                    this.f6694d = (AbstractC0755d[]) copyOf;
                    abstractC0755dArr = (AbstractC0755d[]) copyOf;
                }
                int i3 = this.f6696f;
                do {
                    abstractC0755d = abstractC0755dArr[i3];
                    if (abstractC0755d == null) {
                        abstractC0755d = e();
                        abstractC0755dArr[i3] = abstractC0755d;
                    }
                    i3++;
                    if (i3 >= abstractC0755dArr.length) {
                        i3 = 0;
                    }
                } while (!abstractC0755d.a(this));
                this.f6696f = i3;
                this.f6695e++;
                yVar = this.f6697g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.v(1);
        }
        return abstractC0755d;
    }

    public abstract AbstractC0755d e();

    public abstract AbstractC0755d[] f();

    public final void g(AbstractC0755d abstractC0755d) {
        y yVar;
        int i3;
        P1.d[] b2;
        synchronized (this) {
            try {
                int i4 = this.f6695e - 1;
                this.f6695e = i4;
                yVar = this.f6697g;
                if (i4 == 0) {
                    this.f6696f = 0;
                }
                Z1.i.d(abstractC0755d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b2 = abstractC0755d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (P1.d dVar : b2) {
            if (dVar != null) {
                dVar.resumeWith(L1.z.f2729a);
            }
        }
        if (yVar != null) {
            yVar.v(-1);
        }
    }

    public final y h() {
        y yVar;
        synchronized (this) {
            yVar = this.f6697g;
            if (yVar == null) {
                int i3 = this.f6695e;
                yVar = new y(1, Integer.MAX_VALUE, EnumC0626a.f5930e);
                yVar.c(Integer.valueOf(i3));
                this.f6697g = yVar;
            }
        }
        return yVar;
    }
}
