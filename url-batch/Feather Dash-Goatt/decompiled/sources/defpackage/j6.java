package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j6 extends zl0 implements ul, gu, sc0 {
    public boolean A;
    public z31 C;
    public a41 D;
    public final gn0 s;
    public final boolean t;
    public final float u;
    public final s40 v;
    public final ir w;
    public vg x;
    public float y;
    public long z = 0;
    public final mn0 B = new mn0();

    public j6(gn0 gn0Var, boolean z, float f, s40 s40Var, ir irVar) {
        this.s = gn0Var;
        this.t = z;
        this.u = f;
        this.v = s40Var;
        this.w = irVar;
    }

    @Override // defpackage.gu
    public final void F(ld0 ld0Var) {
        zf zfVar = ld0Var.d;
        ld0Var.a();
        vg vgVar = this.x;
        if (vgVar != null) {
            float f = this.y;
            long d = this.v.d();
            float floatValue = ((Number) ((l7) vgVar.c).f()).floatValue();
            if (floatValue > 0.0f) {
                long b = hi.b(floatValue, d);
                if (vgVar.a) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (zfVar.x() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (zfVar.x() & 4294967295L));
                    i8 i8Var = zfVar.e;
                    long i = i8Var.i();
                    i8Var.g().k();
                    try {
                        ((i8) ((s40) i8Var.e).e).g().g(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                        hu.T(ld0Var, b, f, 0L, 124);
                    } finally {
                        qy0.s(i8Var, i);
                    }
                } else {
                    hu.T(ld0Var, b, f, 0L, 124);
                }
            }
        }
        xf g = zfVar.e.g();
        a41 a41Var = this.D;
        if (a41Var != null) {
            long j = this.z;
            int a = pk0.a(this.y);
            long d2 = this.v.d();
            this.w.invoke();
            a41Var.e(a, j, d2);
            a41Var.draw(k3.a(g));
        }
    }

    @Override // defpackage.sc0
    public final void l(long j) {
        float s;
        this.A = true;
        nr nrVar = op.I(this).C;
        this.z = ca0.x(j);
        float f = this.u;
        if (Float.isNaN(f)) {
            long j2 = this.z;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            s = wq0.c((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.t) {
                s += nrVar.s(10.0f);
            }
        } else {
            s = nrVar.s(f);
        }
        this.y = s;
        mn0 mn0Var = this.B;
        Object[] objArr = mn0Var.a;
        int i = mn0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            z0((bz0) objArr[i2]);
        }
        mn0Var.d();
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.zl0
    public final void r0() {
        uq1.N(n0(), null, new d(this, null, 17), 3);
    }

    @Override // defpackage.zl0
    public final void s0() {
        z31 z31Var = this.C;
        if (z31Var != null) {
            this.D = null;
            yr1.O(this);
            yw ywVar = z31Var.h;
            a41 a41Var = (a41) ((LinkedHashMap) ywVar.e).get(this);
            if (a41Var != null) {
                a41Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) ywVar.e;
                a41 a41Var2 = (a41) linkedHashMap.get(this);
                if (a41Var2 != null) {
                }
                linkedHashMap.remove(this);
                z31Var.g.add(a41Var);
            }
        }
    }

    public final void z0(bz0 bz0Var) {
        a41 a41Var;
        if (!(bz0Var instanceof zy0)) {
            if (bz0Var instanceof az0) {
                a41 a41Var2 = this.D;
                if (a41Var2 != null) {
                    a41Var2.d();
                    return;
                }
                return;
            }
            if (!(bz0Var instanceof yy0) || (a41Var = this.D) == null) {
                return;
            }
            a41Var.d();
            return;
        }
        zy0 zy0Var = (zy0) bz0Var;
        long j = this.z;
        float f = this.y;
        z31 z31Var = this.C;
        int i = 0;
        if (z31Var == null) {
            Object obj = (View) mo.k(this, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    dd0.k("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    z31 z31Var2 = new z31(viewGroup.getContext());
                    viewGroup.addView(z31Var2);
                    z31Var = z31Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof z31) {
                        z31Var = (z31) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.C = z31Var;
        }
        ArrayList arrayList = z31Var.e;
        yw ywVar = z31Var.h;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ywVar.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) ywVar.e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) ywVar.g;
        a41 a41Var3 = (a41) linkedHashMap.get(this);
        if (a41Var3 == null) {
            ArrayList arrayList2 = z31Var.g;
            arrayList2.getClass();
            a41Var3 = (a41) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (a41Var3 == null) {
                if (z31Var.i > zh.d(arrayList)) {
                    a41Var3 = new a41(z31Var.getContext());
                    z31Var.addView(a41Var3);
                    arrayList.add(a41Var3);
                } else {
                    a41Var3 = (a41) arrayList.get(z31Var.i);
                    j6 j6Var = (j6) linkedHashMap3.get(a41Var3);
                    if (j6Var != null) {
                        j6Var.D = null;
                        yr1.O(j6Var);
                        a41 a41Var4 = (a41) linkedHashMap2.get(j6Var);
                        if (a41Var4 != null) {
                        }
                        linkedHashMap2.remove(j6Var);
                        a41Var3.c();
                    }
                }
                int i3 = z31Var.i;
                if (i3 < z31Var.d - 1) {
                    z31Var.i = i3 + 1;
                } else {
                    z31Var.i = 0;
                }
            }
            linkedHashMap2.put(this, a41Var3);
            linkedHashMap3.put(a41Var3, this);
        }
        int a = pk0.a(f);
        long d = this.v.d();
        this.w.invoke();
        a41 a41Var5 = a41Var3;
        a41Var5.b(zy0Var, this.t, j, a, d, new i6(i, this));
        this.D = a41Var5;
        yr1.O(this);
    }
}
