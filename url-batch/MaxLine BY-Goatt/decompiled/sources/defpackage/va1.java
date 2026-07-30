package defpackage;

import androidx.compose.foundation.lazy.layout.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class va1 implements uf2 {
    public static final tt1 t = iv1.L(sc.E, bl0.x);
    public final q a = new q();
    public final du b;
    public final lz1 c;
    public final bn1 d;
    public float e;
    public final w80 f;
    public final boolean g;
    public i91 h;
    public final ta1 i;
    public final qm j;
    public final a k;
    public final mp l;
    public final xb1 m;
    public final at0 n;
    public final ub1 o;
    public final zn1 p;
    public final zn1 q;
    public final lz1 r;
    public final lz1 s;

    public va1(int i, int i2) {
        du duVar = new du();
        duVar.b = new iz1(i);
        duVar.c = new iz1(i2);
        duVar.e = new pb1(i, 90, 200);
        this.b = duVar;
        this.c = new lz1(xa1.a, qb2.Z);
        this.d = new bn1();
        this.f = new w80(new j6(21, this));
        this.g = true;
        this.i = new ta1(this, 0);
        this.j = new qm();
        this.k = new a();
        this.l = new mp(1);
        this.m = new xb1(new oo0(i, 1, this));
        this.n = new at0(this);
        this.o = new ub1();
        this.p = zm3.q();
        this.q = zm3.q();
        Boolean bool = Boolean.FALSE;
        this.r = ij2.j(bool);
        this.s = ij2.j(bool);
    }

    @Override // defpackage.uf2
    public final boolean a() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    @Override // defpackage.uf2
    public final boolean b() {
        return this.f.b();
    }

    @Override // defpackage.uf2
    public final boolean c() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r6.d(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6.j.i(r0) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.uf2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ho1 ho1Var, Function2 function2, r30 r30Var) {
        ua1 ua1Var;
        int i;
        Function2 function22;
        if (r30Var instanceof ua1) {
            ua1Var = (ua1) r30Var;
            int i2 = ua1Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ua1Var.r = i2 - Integer.MIN_VALUE;
                Object obj = ua1Var.p;
                b50 b50Var = b50.m;
                i = ua1Var.r;
                if (i != 0) {
                    ca2.b(obj);
                    ua1Var.m = this;
                    ua1Var.n = ho1Var;
                    ua1Var.o = (pr2) function2;
                    ua1Var.r = 1;
                    function22 = function2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca2.b(obj);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function23 = (Function2) ua1Var.o;
                    ho1Var = ua1Var.n;
                    this = ua1Var.m;
                    ca2.b(obj);
                    function22 = function23;
                }
                w80 w80Var = this.f;
                ua1Var.m = null;
                ua1Var.n = null;
                ua1Var.o = null;
                ua1Var.r = 2;
            }
        }
        ua1Var = new ua1(this, r30Var);
        Object obj2 = ua1Var.p;
        b50 b50Var2 = b50.m;
        i = ua1Var.r;
        if (i != 0) {
        }
        w80 w80Var2 = this.f;
        ua1Var.m = null;
        ua1Var.n = null;
        ua1Var.o = null;
        ua1Var.r = 2;
    }

    @Override // defpackage.uf2
    public final float e(float f) {
        return this.f.e(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(na1 na1Var, boolean z) {
        Object obj;
        int i;
        int i2;
        int i3;
        float f = this.e;
        float f2 = na1Var.d;
        List list = na1Var.g;
        this.e = f - f2;
        this.c.setValue(na1Var);
        pa1 pa1Var = na1Var.a;
        int i4 = 0;
        this.s.setValue(Boolean.valueOf(((pa1Var != null ? pa1Var.a : 0) == 0 && na1Var.b == 0) ? false : true));
        this.r.setValue(Boolean.valueOf(na1Var.c));
        du duVar = this.b;
        if (z) {
            int i5 = na1Var.b;
            if (i5 >= 0.0f) {
                ((iz1) duVar.c).i(i5);
                return;
            }
            duVar.getClass();
            throw new IllegalStateException(("scrollOffset should be non-negative (" + i5 + ')').toString());
        }
        duVar.getClass();
        if (pa1Var != null) {
            oa1[] oa1VarArr = pa1Var.b;
            oa1 oa1Var = oa1VarArr.length == 0 ? null : oa1VarArr[0];
            if (oa1Var != null) {
                obj = oa1Var.b;
                duVar.d = obj;
                if (!duVar.a || na1Var.j > 0) {
                    duVar.a = true;
                    i = na1Var.b;
                    if (i >= 0.0f) {
                        throw new IllegalStateException(("scrollOffset should be non-negative (" + i + ')').toString());
                    }
                    if (pa1Var != null) {
                        oa1[] oa1VarArr2 = pa1Var.b;
                        oa1 oa1Var2 = oa1VarArr2.length != 0 ? oa1VarArr2[0] : null;
                        if (oa1Var2 != null) {
                            i2 = oa1Var2.a;
                            duVar.h(i2, i);
                        }
                    }
                    i2 = 0;
                    duVar.h(i2, i);
                }
                if (this.g) {
                    q qVar = this.a;
                    eo1 eo1Var = (eo1) qVar.c;
                    if (qVar.a != -1) {
                        ww1 ww1Var = na1Var.k;
                        if (list.isEmpty()) {
                            return;
                        }
                        boolean z2 = qVar.b;
                        ww1 ww1Var2 = ww1.m;
                        if (z2) {
                            oa1 oa1Var3 = (oa1) zv.B(list);
                            i3 = (ww1Var == ww1Var2 ? oa1Var3.p : oa1Var3.q) + 1;
                        } else {
                            oa1 oa1Var4 = (oa1) zv.u(list);
                            i3 = (ww1Var == ww1Var2 ? oa1Var4.p : oa1Var4.q) - 1;
                        }
                        if (qVar.a != i3) {
                            qVar.a = -1;
                            int i6 = eo1Var.o;
                            if (i6 > 0) {
                                Object[] objArr = eo1Var.m;
                                do {
                                    ((wb1) objArr[i4]).cancel();
                                    i4++;
                                } while (i4 < i6);
                            }
                            eo1Var.g();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        obj = null;
        duVar.d = obj;
        if (!duVar.a) {
        }
        duVar.a = true;
        i = na1Var.b;
        if (i >= 0.0f) {
        }
    }

    public final na1 g() {
        return (na1) this.c.getValue();
    }

    public final void h(float f, na1 na1Var) {
        int i;
        int i2;
        List list;
        boolean z;
        int i3;
        int i4;
        int i5;
        if (this.g) {
            q qVar = this.a;
            eo1 eo1Var = (eo1) qVar.c;
            List list2 = na1Var.g;
            ww1 ww1Var = na1Var.k;
            if (list2.isEmpty()) {
                return;
            }
            boolean z2 = true;
            boolean z3 = f < 0.0f;
            ww1 ww1Var2 = ww1.m;
            if (z3) {
                oa1 oa1Var = (oa1) zv.B(list2);
                i = (ww1Var == ww1Var2 ? oa1Var.p : oa1Var.q) + 1;
                i2 = ((oa1) zv.B(list2)).a + 1;
            } else {
                oa1 oa1Var2 = (oa1) zv.u(list2);
                i = (ww1Var == ww1Var2 ? oa1Var2.p : oa1Var2.q) - 1;
                i2 = ((oa1) zv.u(list2)).a - 1;
            }
            if (i2 < 0 || i2 >= na1Var.j) {
                return;
            }
            if (i != qVar.a) {
                if (qVar.b != z3 && (i5 = eo1Var.o) > 0) {
                    Object[] objArr = eo1Var.m;
                    int i6 = 0;
                    do {
                        ((wb1) objArr[i6]).cancel();
                        i6++;
                    } while (i6 < i5);
                }
                qVar.b = z3;
                qVar.a = i;
                eo1Var.g();
                at0 at0Var = this.n;
                at0Var.getClass();
                ArrayList arrayList = new ArrayList();
                va1 va1Var = (va1) at0Var.m;
                nm2 d = ci2.d();
                Function1 e = d != null ? d.e() : null;
                nm2 f2 = ci2.f(d);
                try {
                    List list3 = (List) ((na1) va1Var.c.getValue()).f.invoke(Integer.valueOf(i));
                    int size = list3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        boolean z4 = z2;
                        Pair pair = (Pair) list3.get(i7);
                        arrayList.add(va1Var.m.a(((u10) pair.n).a, ((Number) pair.m).intValue()));
                        i7++;
                        va1Var = va1Var;
                        list2 = list2;
                        z2 = z4;
                        z3 = z3;
                    }
                    list = list2;
                    z = z3;
                    Unit unit = Unit.a;
                    ci2.j(d, f2, e);
                    eo1Var.d(eo1Var.o, arrayList);
                } catch (Throwable th) {
                    ci2.j(d, f2, e);
                    throw th;
                }
            } else {
                list = list2;
                z = z3;
            }
            if (!z) {
                if (na1Var.h - z71.K((oa1) zv.u(list), ww1Var) >= f || (i3 = eo1Var.o) <= 0) {
                    return;
                }
                Object[] objArr2 = eo1Var.m;
                int i8 = 0;
                do {
                    ((wb1) objArr2[i8]).a();
                    i8++;
                } while (i8 < i3);
                return;
            }
            oa1 oa1Var3 = (oa1) zv.B(list);
            if (((z71.K(oa1Var3, ww1Var) + ((int) (ww1Var == ww1Var2 ? oa1Var3.n & 4294967295L : oa1Var3.n >> 32))) + na1Var.m) - na1Var.i >= (-f) || (i4 = eo1Var.o) <= 0) {
                return;
            }
            Object[] objArr3 = eo1Var.m;
            int i9 = 0;
            do {
                ((wb1) objArr3[i9]).a();
                i9++;
            } while (i9 < i4);
        }
    }
}
