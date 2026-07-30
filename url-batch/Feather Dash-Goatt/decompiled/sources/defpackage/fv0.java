package defpackage;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fv0 extends dm1 {
    public op b;
    public float f;
    public op g;
    public float k;
    public float m;
    public boolean p;
    public ze1 q;
    public final c6 r;
    public c6 s;
    public c6 t;
    public final ae0 u;
    public float c = 1.0f;
    public List d = mm1.a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public fv0() {
        c6 a = e6.a();
        this.r = a;
        this.s = a;
        dg0[] dg0VarArr = dg0.d;
        this.u = ee0.a(xl.m);
    }

    @Override // defpackage.dm1
    public final void a(hu huVar) {
        hu huVar2;
        ze1 ze1Var;
        if (this.n) {
            y90.H(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        op opVar = this.b;
        if (opVar != null) {
            huVar2 = huVar;
            hu.m0(huVar2, this.s, opVar, this.c, null, 56);
        } else {
            huVar2 = huVar;
        }
        op opVar2 = this.g;
        if (opVar2 != null) {
            ze1 ze1Var2 = this.q;
            if (this.o || ze1Var2 == null) {
                ze1 ze1Var3 = new ze1(this.f, this.j, this.h, this.i, 16);
                this.q = ze1Var3;
                this.o = false;
                ze1Var = ze1Var3;
            } else {
                ze1Var = ze1Var2;
            }
            hu.m0(huVar2, this.s, opVar2, this.e, ze1Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        c6 c6Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = c6Var;
            return;
        }
        if (Intrinsics.a(this.s, c6Var)) {
            this.s = e6.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.a.rewind();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ae0 ae0Var = this.u;
        ((d6) ae0Var.getValue()).a.setPath(c6Var != null ? c6Var.a : null, false);
        float length = ((d6) ae0Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((d6) ae0Var.getValue()).a(f4, f5, this.s);
            return;
        }
        c6 c6Var2 = this.t;
        if (c6Var2 == null) {
            c6Var2 = e6.a();
            this.t = c6Var2;
        }
        c6Var2.c();
        ((d6) ae0Var.getValue()).a(f4, length, c6Var2);
        c6.a(this.s, c6Var2);
        c6Var2.c();
        ((d6) ae0Var.getValue()).a(0.0f, f5, c6Var2);
        c6.a(this.s, c6Var2);
    }

    public final String toString() {
        return this.r.toString();
    }
}
