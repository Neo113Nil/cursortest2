package defpackage;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rz1 extends q33 {
    public cq b;
    public float f;
    public cq g;
    public float k;
    public float m;
    public boolean p;
    public xp2 q;
    public final oa r;
    public oa s;
    public final y91 t;
    public float c = 1.0f;
    public List d = y33.a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public rz1() {
        oa a = qa.a();
        this.r = a;
        this.s = a;
        this.t = ya1.a(kc1.m, o00.F);
    }

    @Override // defpackage.q33
    public final void a(yd0 yd0Var) {
        yd0 yd0Var2;
        xp2 xp2Var;
        if (this.n) {
            z71.S(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        cq cqVar = this.b;
        if (cqVar != null) {
            yd0Var2 = yd0Var;
            yd0.x(yd0Var2, this.s, cqVar, this.c, null, 56);
        } else {
            yd0Var2 = yd0Var;
        }
        cq cqVar2 = this.g;
        if (cqVar2 != null) {
            xp2 xp2Var2 = this.q;
            if (this.o || xp2Var2 == null) {
                xp2 xp2Var3 = new xp2(this.f, this.j, this.h, this.i, 16);
                this.q = xp2Var3;
                this.o = false;
                xp2Var = xp2Var3;
            } else {
                xp2Var = xp2Var2;
            }
            yd0.x(yd0Var2, this.s, cqVar2, this.e, xp2Var, 48);
        }
    }

    public final void e() {
        float f = this.k;
        oa oaVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = oaVar;
            return;
        }
        if (Intrinsics.b(this.s, oaVar)) {
            this.s = qa.a();
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
        y91 y91Var = this.t;
        ((pa) y91Var.getValue()).a.setPath(oaVar != null ? oaVar.a : null, false);
        float length = ((pa) y91Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((pa) y91Var.getValue()).a(f4, f5, this.s);
        } else {
            ((pa) y91Var.getValue()).a(f4, length, this.s);
            ((pa) y91Var.getValue()).a(0.0f, f5, this.s);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
