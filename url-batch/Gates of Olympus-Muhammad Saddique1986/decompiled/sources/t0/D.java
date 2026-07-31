package t0;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import n.t0;
import q2.AbstractC0837y;
import r.AbstractC0856c;
import t1.C1013A;
import t1.C1014B;
import z.C1256t;

/* loaded from: classes.dex */
public final class D extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i3, Object obj) {
        super(0);
        this.f8528e = i3;
        this.f8529f = obj;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f8528e) {
            case 0:
                M m3 = ((E) this.f8529f).f8562z;
                m3.f8642r.f8621y = true;
                J j3 = m3.f8643s;
                if (j3 != null) {
                    j3.f8593v = true;
                }
                return R1.y.f4171a;
            case 1:
                K k3 = (K) this.f8529f;
                M m4 = k3.f8604I;
                int i3 = 0;
                m4.f8635k = 0;
                K.d v3 = m4.f8625a.v();
                int i4 = v3.f3216f;
                if (i4 > 0) {
                    Object[] objArr = v3.f3214d;
                    int i5 = 0;
                    do {
                        K k4 = ((E) objArr[i5]).f8562z.f8642r;
                        k4.f8606j = k4.f8607k;
                        k4.f8607k = Integer.MAX_VALUE;
                        k4.f8618v = false;
                        if (k4.f8610n == 2) {
                            k4.f8610n = 3;
                        }
                        i5++;
                    } while (i5 < i4);
                }
                M m5 = k3.f8604I;
                K.d v4 = m5.f8625a.v();
                int i6 = v4.f3216f;
                if (i6 > 0) {
                    Object[] objArr2 = v4.f3214d;
                    int i7 = 0;
                    do {
                        ((E) objArr2[i7]).f8562z.f8642r.f8619w.f8566d = false;
                        i7++;
                    } while (i7 < i6);
                }
                k3.Q().t0().j();
                E e3 = m5.f8625a;
                K.d v5 = e3.v();
                int i8 = v5.f3216f;
                if (i8 > 0) {
                    Object[] objArr3 = v5.f3214d;
                    int i9 = 0;
                    do {
                        E e4 = (E) objArr3[i9];
                        if (e4.f8562z.f8642r.f8606j != e4.t()) {
                            e3.J();
                            e3.y();
                            if (e4.t() == Integer.MAX_VALUE) {
                                e4.f8562z.f8642r.p0();
                            }
                        }
                        i9++;
                    } while (i9 < i8);
                }
                K.d v6 = e3.v();
                int i10 = v6.f3216f;
                if (i10 > 0) {
                    Object[] objArr4 = v6.f3214d;
                    do {
                        F f3 = ((E) objArr4[i3]).f8562z.f8642r.f8619w;
                        f3.f8567e = f3.f8566d;
                        i3++;
                    } while (i3 < i10);
                }
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                M m6 = (M) this.f8529f;
                m6.a().b(m6.f8644t);
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                b0 b0Var = ((b0) this.f8529f).f8713q;
                if (b0Var != null) {
                    b0Var.Q0();
                }
                return R1.y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                b0.O o3 = b0.f8701H;
                ((InterfaceC0424c) this.f8529f).n(o3);
                o3.f5379x = o3.f5373r.d(o3.f5376u, o3.f5378w, o3.f5377v);
                return R1.y.f4171a;
            case 5:
                C1013A c1013a = (C1013A) this.f8529f;
                c1013a.getClass();
                f2.j.f(c1013a.f8806a, "context");
                f2.j.f(c1013a.f8827v, "navigatorProvider");
                return new C1014B();
            case 6:
                return new t1.r((String) this.f8529f);
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0837y.c(((u0.S) this.f8529f).f9267f, null);
                return R1.y.f4171a;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                ((u0.T) this.f8529f).f9271b = null;
                return R1.y.f4171a;
            case AbstractC0856c.f8037c /* 9 */:
                return t0.b((Context) this.f8529f);
            case AbstractC0856c.f8039e /* 10 */:
                return ((w1.j) this.f8529f).b();
            case 11:
                ((o.n) this.f8529f).f7419a.setValue(o.k.f7417a);
                return R1.y.f4171a;
            case 12:
                return ((x.Q) this.f8529f).d();
            case 13:
                return new x.n0((p.P) this.f8529f, 0.0f);
            case 14:
                Object systemService = ((View) ((C1256t) this.f8529f).f10466e).getContext().getSystemService("input_method");
                f2.j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            default:
                return new BaseInputConnection(((z.z) this.f8529f).f10494a, false);
        }
    }
}
