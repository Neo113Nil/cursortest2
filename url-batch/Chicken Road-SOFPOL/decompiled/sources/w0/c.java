package w0;

import java.util.Arrays;
import java.util.HashMap;
import o.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: o, reason: collision with root package name */
    public final b f7510o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7511p;

    public c(long j7, k kVar, p6.c cVar, p6.c cVar2, b bVar) {
        super(j7, kVar, cVar, cVar2);
        this.f7510o = bVar;
        bVar.k();
    }

    @Override // w0.b, w0.f
    public final void c() {
        if (this.f7518c) {
            return;
        }
        super.c();
        if (this.f7511p) {
            return;
        }
        this.f7511p = true;
        this.f7510o.l();
    }

    @Override // w0.b
    public final q w() {
        c cVar;
        b bVar = this.f7510o;
        if (bVar.f7509m || bVar.f7518c) {
            return new h(this);
        }
        k0 k0Var = this.f7505h;
        long j7 = this.f7517b;
        HashMap c8 = k0Var != null ? m.c(bVar.g(), this, this.f7510o.d()) : null;
        Object obj = m.f7537c;
        synchronized (obj) {
            try {
                m.d(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (k0Var == null || k0Var.f5492d == 0) {
                    cVar = this;
                    a();
                } else {
                    cVar = this;
                    q z3 = cVar.z(this.f7510o.g(), k0Var, c8, this.f7510o.d());
                    if (!z3.equals(i.f7521b)) {
                        return z3;
                    }
                    k0 x7 = cVar.f7510o.x();
                    if (x7 != null) {
                        x7.k(k0Var);
                    } else {
                        cVar.f7510o.B(k0Var);
                        cVar.f7505h = null;
                    }
                }
                if (q6.i.g(cVar.f7510o.g(), j7) < 0) {
                    cVar.f7510o.v();
                }
                b bVar2 = cVar.f7510o;
                bVar2.r(bVar2.d().b(j7).a(cVar.f7506j));
                cVar.f7510o.A(j7);
                b bVar3 = cVar.f7510o;
                int i = cVar.f7519d;
                cVar.f7519d = -1;
                if (i >= 0) {
                    int[] iArr = bVar3.f7507k;
                    q6.i.e(iArr, "<this>");
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    bVar3.f7507k = copyOf;
                } else {
                    bVar3.getClass();
                }
                b bVar4 = cVar.f7510o;
                k kVar = cVar.f7506j;
                bVar4.getClass();
                synchronized (obj) {
                    bVar4.f7506j = bVar4.f7506j.e(kVar);
                    b bVar5 = cVar.f7510o;
                    int[] iArr2 = cVar.f7507k;
                    bVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = bVar5.f7507k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            q6.i.b(copyOf2);
                            iArr2 = copyOf2;
                        }
                        bVar5.f7507k = iArr2;
                    }
                }
                cVar.f7509m = true;
                if (!cVar.f7511p) {
                    cVar.f7511p = true;
                    cVar.f7510o.l();
                }
                return i.f7521b;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
