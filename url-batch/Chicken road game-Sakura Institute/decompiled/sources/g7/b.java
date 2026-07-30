package g7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: f, reason: collision with root package name */
    public d[] f4476f;

    /* renamed from: g, reason: collision with root package name */
    public int f4477g;

    /* renamed from: h, reason: collision with root package name */
    public int f4478h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f4479i;

    public final d c() {
        d dVar;
        a0 a0Var;
        synchronized (this) {
            try {
                d[] dVarArr = this.f4476f;
                if (dVarArr == null) {
                    dVarArr = e();
                    this.f4476f = dVarArr;
                } else if (this.f4477g >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    r6.k.e(copyOf, "copyOf(...)");
                    this.f4476f = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i7 = this.f4478h;
                do {
                    dVar = dVarArr[i7];
                    if (dVar == null) {
                        dVar = d();
                        dVarArr[i7] = dVar;
                    }
                    i7++;
                    if (i7 >= dVarArr.length) {
                        i7 = 0;
                    }
                } while (!dVar.a(this));
                this.f4478h = i7;
                this.f4477g++;
                a0Var = this.f4479i;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a0Var != null) {
            a0Var.x(1);
        }
        return dVar;
    }

    public abstract d d();

    public abstract d[] e();

    public final void f(d dVar) {
        a0 a0Var;
        int i7;
        h6.d[] b9;
        synchronized (this) {
            try {
                int i8 = this.f4477g - 1;
                this.f4477g = i8;
                a0Var = this.f4479i;
                if (i8 == 0) {
                    this.f4478h = 0;
                }
                r6.k.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b9 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (h6.d dVar2 : b9) {
            if (dVar2 != null) {
                dVar2.resumeWith(d6.z.f2639a);
            }
        }
        if (a0Var != null) {
            a0Var.x(-1);
        }
    }

    public final a0 g() {
        a0 a0Var;
        synchronized (this) {
            a0Var = this.f4479i;
            if (a0Var == null) {
                int i7 = this.f4477g;
                a0Var = new a0(1, Integer.MAX_VALUE, e7.a.f2834g);
                a0Var.i(Integer.valueOf(i7));
                this.f4479i = a0Var;
            }
        }
        return a0Var;
    }
}
