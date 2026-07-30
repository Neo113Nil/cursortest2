package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vg {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(yw ywVar, d4 d4Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        f60 f60Var = (f60) this.c;
        i60 i60Var = (i60) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            e30 E = ((nq0) this.d).E(ywVar, d4Var);
            aj0 aj0Var = (aj0) E.b;
            int f = aj0Var.f();
            for (int i3 = 0; i3 < f; i3++) {
                qx0 qx0Var = (qx0) aj0Var.g(i3);
                if (!qx0Var.d && !qx0Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int f2 = aj0Var.f();
            for (int i4 = 0; i4 < f2; i4++) {
                qx0 qx0Var2 = (qx0) aj0Var.g(i4);
                if (objArr != false || ka0.i(qx0Var2)) {
                    ((jd0) this.b).y(qx0Var2.c, (i60) this.e, qx0Var2.i, true);
                    if (!i60Var.d.h()) {
                        f60Var.a(qx0Var2.a, i60Var, ka0.i(qx0Var2));
                        i60Var.clear();
                    }
                }
            }
            boolean b = f60Var.b(E, z);
            if (!E.a) {
                int f3 = aj0Var.f();
                for (int i5 = 0; i5 < f3; i5++) {
                    qx0 qx0Var3 = (qx0) aj0Var.g(i5);
                    if (!wq0.b(ka0.z(qx0Var3, true), 0L) && qx0Var3.b()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int f4 = aj0Var.f();
            int i6 = 0;
            while (true) {
                if (i6 >= f4) {
                    i2 = 0;
                    break;
                }
                if (((qx0) aj0Var.g(i6)).b()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public void b(int i, int i2) {
        if (i < 0.0f) {
            r80.a("Index should be non-negative (" + i + ')');
        }
        ((xu0) this.b).i(i);
        ve0 ve0Var = (ve0) this.e;
        if (i != ve0Var.e) {
            ve0Var.e = i;
            int i3 = (i / 30) * 30;
            ve0Var.d.setValue(b11.g(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((xu0) this.c).i(i2);
    }
}
