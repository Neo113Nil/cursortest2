package e7;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public d[] f2539d;

    /* renamed from: e, reason: collision with root package name */
    public int f2540e;

    /* renamed from: f, reason: collision with root package name */
    public int f2541f;

    /* renamed from: g, reason: collision with root package name */
    public v f2542g;

    public final d d() {
        d dVar;
        v vVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f2539d;
                if (dVarArr == null) {
                    dVarArr = f();
                    this.f2539d = dVarArr;
                } else if (this.f2540e >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    q6.i.d(copyOf, "copyOf(...)");
                    this.f2539d = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i = this.f2541f;
                do {
                    dVar = dVarArr[i];
                    if (dVar == null) {
                        dVar = e();
                        dVarArr[i] = dVar;
                    }
                    i++;
                    if (i >= dVarArr.length) {
                        i = 0;
                    }
                } while (!dVar.a(this));
                this.f2541f = i;
                this.f2540e++;
                vVar = this.f2542g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vVar != null) {
            vVar.v(1);
        }
        return dVar;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        v vVar;
        int i;
        g6.c[] b8;
        synchronized (this) {
            try {
                int i8 = this.f2540e - 1;
                this.f2540e = i8;
                vVar = this.f2542g;
                if (i8 == 0) {
                    this.f2541f = 0;
                }
                q6.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b8 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (g6.c cVar : b8) {
            if (cVar != null) {
                cVar.k(c6.m.f1757a);
            }
        }
        if (vVar != null) {
            vVar.v(-1);
        }
    }

    public final v h() {
        v vVar;
        synchronized (this) {
            vVar = this.f2542g;
            if (vVar == null) {
                int i = this.f2540e;
                vVar = new v(1, Integer.MAX_VALUE);
                vVar.p(Integer.valueOf(i));
                this.f2542g = vVar;
            }
        }
        return vVar;
    }
}
