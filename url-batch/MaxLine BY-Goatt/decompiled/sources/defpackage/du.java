package defpackage;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class du {
    public boolean a;
    public Object b;
    public Object c = yj1.a(0.0f);
    public Object d = new ArrayList();
    public Object e;

    public du(Function0 function0, boolean z) {
        this.a = z;
        this.b = function0;
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent c;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (c = c(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.e) == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (c instanceof rr1) {
                    ((rr1) c).c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (c instanceof qr1) {
                        ((qr1) c).d(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            c.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public void b(k91 k91Var, float f, long j) {
        ns nsVar = k91Var.m;
        float floatValue = ((Number) ((jc) this.c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b = aw.b(j, floatValue);
            if (!this.a) {
                yd0.f0(k91Var, b, f, 0L, 124);
                return;
            }
            float d = ql2.d(nsVar.f());
            float b2 = ql2.b(nsVar.f());
            mh mhVar = nsVar.n;
            long v = mhVar.v();
            mhVar.o().m();
            ((mh) ((ar0) mhVar.n).n).o().g(0.0f, 0.0f, d, b2, 1);
            yd0.f0(k91Var, b, f, 0L, 124);
            mhVar.o().j();
            mhVar.J(v);
        }
    }

    public ViewParent c(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    public void d(a41 a41Var, a50 a50Var) {
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = a41Var instanceof cy0;
        if (z) {
            arrayList.add(a41Var);
        } else if (a41Var instanceof dy0) {
            arrayList.remove(((dy0) a41Var).a);
        } else if (a41Var instanceof jo0) {
            arrayList.add(a41Var);
        } else if (a41Var instanceof ko0) {
            arrayList.remove(((ko0) a41Var).a);
        } else if (a41Var instanceof od0) {
            arrayList.add(a41Var);
        } else if (a41Var instanceof pd0) {
            arrayList.remove(((pd0) a41Var).a);
        } else if (!(a41Var instanceof nd0)) {
            return;
        } else {
            arrayList.remove(((nd0) a41Var).a);
        }
        a41 a41Var2 = (a41) zv.C(arrayList);
        if (Intrinsics.b((a41) this.e, a41Var2)) {
            return;
        }
        o30 o30Var = null;
        if (a41Var2 != null) {
            qa2 qa2Var = (qa2) ((Function0) this.b).invoke();
            float f = z ? qa2Var.c : a41Var instanceof jo0 ? qa2Var.b : a41Var instanceof od0 ? qa2Var.a : 0.0f;
            h03 h03Var = ab2.a;
            if (!(a41Var2 instanceof cy0)) {
                if (a41Var2 instanceof jo0) {
                    h03Var = new h03(45, cf0.b, 2);
                } else if (a41Var2 instanceof od0) {
                    h03Var = new h03(45, cf0.b, 2);
                }
            }
            z71.H(a50Var, null, new wp1(this, f, h03Var, (o30) null), 3);
        } else {
            a41 a41Var3 = (a41) this.e;
            h03 h03Var2 = ab2.a;
            if (!(a41Var3 instanceof cy0) && !(a41Var3 instanceof jo0) && (a41Var3 instanceof od0)) {
                h03Var2 = new h03(150, cf0.b, 2);
            }
            z71.H(a50Var, null, new z62(this, h03Var2, o30Var, 6), 3);
        }
        this.e = a41Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e(tt1 tt1Var, t7 t7Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        rx0 rx0Var = (rx0) this.c;
        ux0 ux0Var = (ux0) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            t21 l = ((at0) this.d).l(tt1Var, t7Var);
            mg1 mg1Var = (mg1) l.n;
            int e = mg1Var.e();
            for (int i3 = 0; i3 < e; i3++) {
                t22 t22Var = (t22) mg1Var.f(i3);
                if (!t22Var.d && !t22Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int e2 = mg1Var.e();
            for (int i4 = 0; i4 < e2; i4++) {
                t22 t22Var2 = (t22) mg1Var.f(i4);
                if (objArr != false || s93.z(t22Var2)) {
                    ((i91) this.b).z(t22Var2.c, (ux0) this.e, t22Var2.i, true);
                    if (!ux0Var.m.g()) {
                        rx0Var.a(t22Var2.a, ux0Var, s93.z(t22Var2));
                        ux0Var.clear();
                    }
                }
            }
            boolean b = rx0Var.b(l, z);
            int e3 = mg1Var.e();
            int i5 = 0;
            while (true) {
                if (i5 >= e3) {
                    i = 0;
                    break;
                }
                t22 t22Var3 = (t22) mg1Var.f(i5);
                if (!au1.b(s93.P(t22Var3, true), 0L) && t22Var3.b()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int e4 = mg1Var.e();
            int i6 = 0;
            while (true) {
                if (i6 >= e4) {
                    i2 = 0;
                    break;
                }
                if (((t22) mg1Var.f(i6)).b()) {
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

    public v92 f(boolean z) {
        try {
            v92 f = ((yi0) this.d).f(z);
            if (f == null) {
                return f;
            }
            f.m = this;
            return f;
        } catch (IOException e) {
            g(e);
            throw e;
        }
    }

    public void g(IOException iOException) {
        this.a = true;
        ((zi0) this.c).b(iOException);
        v62 g = ((yi0) this.d).g();
        t62 t62Var = (t62) this.b;
        synchronized (g) {
            try {
                if (!(iOException instanceof ip2)) {
                    if (!(g.g != null) || (iOException instanceof d10)) {
                        g.j = true;
                        if (g.m == 0) {
                            v62.d(t62Var.m, g.b, iOException);
                            g.l++;
                        }
                    }
                } else if (((ip2) iOException).m == 8) {
                    int i = g.n + 1;
                    g.n = i;
                    if (i > 1) {
                        g.j = true;
                        g.l++;
                    }
                } else if (((ip2) iOException).m != 9 || !t62Var.y) {
                    g.j = true;
                    g.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(int i, int i2) {
        if (i < 0.0f) {
            ey.j("Index should be non-negative (", i, 41);
            return;
        }
        ((iz1) this.b).i(i);
        ((pb1) this.e).a(i);
        ((iz1) this.c).i(i2);
    }
}
