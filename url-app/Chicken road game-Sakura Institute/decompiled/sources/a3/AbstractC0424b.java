package a3;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0424b {

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0426d[] f4942d;

    /* renamed from: e, reason: collision with root package name */
    public int f4943e;

    /* renamed from: i, reason: collision with root package name */
    public int f4944i;

    /* renamed from: j, reason: collision with root package name */
    public z f4945j;

    public final AbstractC0426d f() {
        AbstractC0426d abstractC0426d;
        z zVar;
        synchronized (this) {
            try {
                AbstractC0426d[] abstractC0426dArr = this.f4942d;
                if (abstractC0426dArr == null) {
                    abstractC0426dArr = h();
                    this.f4942d = abstractC0426dArr;
                } else if (this.f4943e >= abstractC0426dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC0426dArr, abstractC0426dArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.f4942d = (AbstractC0426d[]) copyOf;
                    abstractC0426dArr = (AbstractC0426d[]) copyOf;
                }
                int i2 = this.f4944i;
                do {
                    abstractC0426d = abstractC0426dArr[i2];
                    if (abstractC0426d == null) {
                        abstractC0426d = g();
                        abstractC0426dArr[i2] = abstractC0426d;
                    }
                    i2++;
                    if (i2 >= abstractC0426dArr.length) {
                        i2 = 0;
                    }
                } while (!abstractC0426d.a(this));
                this.f4944i = i2;
                this.f4943e++;
                zVar = this.f4945j;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVar != null) {
            zVar.x(1);
        }
        return abstractC0426d;
    }

    public abstract AbstractC0426d g();

    public abstract AbstractC0426d[] h();

    public final void i(AbstractC0426d abstractC0426d) {
        z zVar;
        int i2;
        C2.a[] b4;
        synchronized (this) {
            try {
                int i4 = this.f4943e - 1;
                this.f4943e = i4;
                zVar = this.f4945j;
                if (i4 == 0) {
                    this.f4944i = 0;
                }
                Intrinsics.d(abstractC0426d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b4 = abstractC0426d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (C2.a aVar : b4) {
            if (aVar != null) {
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                aVar.u(Unit.f7487a);
            }
        }
        if (zVar != null) {
            zVar.x(-1);
        }
    }

    public final z j() {
        z zVar;
        synchronized (this) {
            zVar = this.f4945j;
            if (zVar == null) {
                int i2 = this.f4943e;
                zVar = new z(1, Integer.MAX_VALUE, Y2.a.f4399e);
                zVar.b(Integer.valueOf(i2));
                this.f4945j = zVar;
            }
        }
        return zVar;
    }
}
